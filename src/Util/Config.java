/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Entidade.Cliente;
import Entidade.Maquina;
import Entidade.Servico;
import Entidade.Usuario;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author Fagner
 */
public class Config {
    
    private static boolean conf;
    private static Cliente cliente;
    private static Maquina maquina;
    private static Servico servico;
    private static Usuario usuario;
    private static JLabel tfUsuario;
    private static JMenuItem MenuBackupAuto;
    private static JMenuItem MenuBackupHistorico;
    private static JMenuItem MenuBackupRestaurar;
    private static JMenu MenuUsuario;
    private static JMenu MenuConfiguracao;

    public static boolean isConf() {
        return conf;
    }

    public static void setConf(boolean conf) {
        Config.conf = conf;
    }

    public static Cliente getCliente() {
        return cliente;
    }

    public static void setCliente(Cliente cliente) {
        Config.cliente = cliente;
    }

    public static Servico getServico() {
        return servico;
    }

    public static void setServico(Servico servico) {
        Config.servico = servico;
    }

    public static Maquina getMaquina() {
        return maquina;
    }

    public static void setMaquina(Maquina maquina) {
        Config.maquina = maquina;
    }

    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuario usuario) {
        Usuario u = new Usuario();
        u = usuario;
        Config.usuario = u;
    }

    public static JLabel getTfUsuario() {
        return tfUsuario;
    }

    public static void setTfUsuario(JLabel tfUsuario) {
        Config.tfUsuario = tfUsuario;
    }
    public static void setMenus(JMenuItem MenuBackupAuto,JMenuItem MenuBackupHistorico,JMenuItem MenuBackupRestaurar,JMenu MenuUsuario,JMenu MenuConfiguracao){
        Config.MenuBackupAuto = MenuBackupAuto;
        Config.MenuBackupHistorico = MenuBackupHistorico;
        Config.MenuBackupRestaurar = MenuBackupRestaurar;
        Config.MenuUsuario = MenuUsuario;
        Config.MenuConfiguracao = MenuConfiguracao;
    }
    public static void ConfiguracaoMenu(boolean conf){
        Config.MenuBackupAuto.setEnabled(conf);
        Config.MenuBackupHistorico.setEnabled(conf);
        Config.MenuBackupRestaurar.setEnabled(conf);
        Config.MenuUsuario.setEnabled(conf);
        Config.MenuConfiguracao.setEnabled(conf);
        
    }
}
