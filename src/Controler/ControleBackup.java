/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Entidade.Backup;
import Util.Config;
import Util.DAO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Fagner
 */
public class ControleBackup {

    private DAO dao;

    public ControleBackup() {
        this.dao = new DAO();
    }

    public void cadastraBackup(String tipo, String Arquivo) {
        try {
            Backup backup = new Backup(Config.getUsuario().getNome(), Arquivo, tipo, Calendar.getInstance());
            dao.create(backup);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar no histórico.", "Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }

    public List<Backup> pesquisar(int cond, Calendar dataBackup) {
        if (cond == 1) {
            return converte(dao.findObjectEntities(Backup.class));
        } else if (cond == 2) {
            return converteData(dao.findObjectEntities(Backup.class),dataBackup);
        }
        return converte(dao.findObjectEntities(Backup.class));
    }

    private List<Backup> converte(List<Object> objectsAux) {
        List<Backup> listeBackup = new ArrayList<Backup>();
        List<Object> objects = new ArrayList<Object>();
        objects = objectsAux;
        Iterator i = objects.iterator();

        while (i.hasNext()) {
            try {
                Backup b = (Backup) i.next();
                listeBackup.add(b);
            } catch (Exception eroo) {
            }
        }
        return listeBackup;
    }

    private List<Backup> converteData(List<Object> objectsAux, Calendar dataBackup) {
        List<Backup> listeBackup = new ArrayList<Backup>();
        List<Object> objects = new ArrayList<Object>();
        objects = objectsAux;
        Iterator i = objects.iterator();

        while (i.hasNext()) {
            try {
                Backup b = (Backup) i.next();
                if (dataBackup.get(Calendar.DAY_OF_MONTH) == b.getData_bkp().get(Calendar.DAY_OF_MONTH)
                        && dataBackup.get(Calendar.MONTH) == b.getData_bkp().get(Calendar.MONTH)
                        && dataBackup.get(Calendar.YEAR) == b.getData_bkp().get(Calendar.YEAR)) {
                    listeBackup.add(b);
                }
            } catch (Exception eroo) {
            }
        }
        return listeBackup;
    }
}
