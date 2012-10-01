/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Entidade.Backup;
import Entidade.Configuracao;
import Entidade.Usuario;
import Util.Config;
import Util.DAO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Fagner
 */
public class ControleConfiguracao {

    private static DAO dao;
    private static List<Object> confs;
    private ControleBackup controleBackup;

    public ControleConfiguracao() {
        dao = new DAO();
        confs = new ArrayList<Object>();
        controleBackup = new ControleBackup();
    }

    private void criarConfiguracao() {
        try {
            Configuracao configuracao = new Configuracao(
                    "C:/Program Files (x86)/Microsoft Office/Office14/WINWORD.exe",
                    "C:/Program Files (x86)/Microsoft Office/Office14/excel.exe",
                    "C:/Program Files (x86)/Microsoft Office/Office14/POWERPNT.exe",
                    "C:/Program Files (x86)/TeamViewer/Version7/TeamViewer.exe",
                    "C:/Windows/System32/calc.exe",
                    "C:/",
                    "127.0.0.1",
                    "",
                    "",
                    Calendar.getInstance());

            dao.create(configuracao);
        } catch (Exception erro) {
        }
    }

    public boolean verificar() {
        try {
            confs = dao.findObjectEntities(Configuracao.class);

            if (dao.getObjectCount(Usuario.class) == 0) {
                salvarUsuario();
            }
            if (confs.size() > 0) {
                verificarBackup v = new verificarBackup();
                v.start();
                return true;
            } else {
                criarConfiguracao();
                verificarBackup v = new verificarBackup();
                v.start();
                return true;
            }

        } catch (Exception erro) {
            return false;
        }
    }

    public static Configuracao getCongiguracao() {

        Configuracao c = (Configuracao) confs.get(0);

        return c;
    }

    public static void salvarCongiguracao(Configuracao c) {
        try {

            dao.edit(c);
            JOptionPane.showMessageDialog(null, "Salvo");

        } catch (Exception erro) {
        }
    }

    private static void salvarUsuario() {
        try {

            Usuario usuario = new Usuario("Sistema GCS", "GCS", "GCS", "FAGNER.SILVA@DCE.UFPB.BR", "", "", false);
            dao.create(usuario);

        } catch (Exception erro) {
        }
    }

    private class verificarBackup extends Thread {

        private ControleBackup controleBackup;

        @Override
        public void run() {
            controleBackup = new ControleBackup();
            verificarBackup();
        }

        private void verificarBackup() {
            List<Backup> backups = new ArrayList<Backup>();
            backups = controleBackup.pesquisar(1, Calendar.getInstance());

            if (backups.isEmpty()) {
                BackupAutomatico();
                return;
            }

            Calendar aux = backups.get(0).getData_bkp();

            for (int i = 0; i < backups.size(); ++i) {
                if (aux.before(backups.get(i).getData_bkp())) {
                    aux = backups.get(i).getData_bkp();
                }
            }
            
            if (getCongiguracao().getTempo_backup().equalsIgnoreCase("")) {
                return;
            } else if (getCongiguracao().getTempo_backup().equalsIgnoreCase("Anual")) {

                if (aux.get(Calendar.YEAR) != Calendar.getInstance().get(Calendar.YEAR)) {
                    
                    BackupAutomatico();

                }

            } else if (getCongiguracao().getTempo_backup().equalsIgnoreCase("Desativado")) {
                return;
            } else if (getCongiguracao().getTempo_backup().equalsIgnoreCase("Diario")) {

                BackupAutomatico();

            } else if (getCongiguracao().getTempo_backup().equalsIgnoreCase("Mensal")) {

                if (aux.get(Calendar.MONTH) != Calendar.getInstance().get(Calendar.MONTH)) {
                    BackupAutomatico();

                }

            } else if (getCongiguracao().getTempo_backup().equalsIgnoreCase("Semanal")) {

                if (aux.get(Calendar.WEEK_OF_YEAR) != Calendar.getInstance().get(Calendar.WEEK_OF_YEAR)) {
                    BackupAutomatico();

                }
            }
        }
    }

    private void BackupAutomatico() {
        try {
            Usuario u = new Usuario();
            u.setNome("Sistema GCS");
            Config.setUsuario(u);
            String arquivo = null;
            arquivo = getCongiguracao().getPath_backup() + "/backup_sistema.sql";
            System.out.println(arquivo);
            String MYSQL_PATH = "C:/xampp/mysql/bin/";
            String DATABASES = "gcs";
            List<String> dbList = new ArrayList<String>();

            String command = MYSQL_PATH + "mysqldump.exe";

            String[] databases = DATABASES.split(" ");

            for (int i = 0; i < databases.length; i++) {
                dbList.add(databases[i]);
            }

            int i = 1;
            long time1, time2, time;

            time1 = System.currentTimeMillis();

            for (String dbName : dbList) {

                ProcessBuilder pb = new ProcessBuilder(
                        command,
                        "--user=root",
                        "--password=",
                        dbName,
                        "--result-file=" + arquivo);

                try {

                    pb.start();

                } catch (Exception e) {

                    e.printStackTrace();

                }
                i++;
            }

            time2 = System.currentTimeMillis();
            time = time2 - time1;

            try {

                Thread.sleep(2000);

            } catch (Exception e) {
            }

            controleBackup.cadastraBackup(Backup.TIPOAUTO, arquivo);
            //JOptionPane.showMessageDialog(null, "Backup realizado com sucesso.", "Backup", 1);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro no Backup manual.", "Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }
}
