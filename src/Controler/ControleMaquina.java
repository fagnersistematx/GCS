/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Entidade.Maquina;
import Util.Config;
import Util.DAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fagner
 */
public class ControleMaquina {

    private DAO dao;

    public ControleMaquina() {
        dao = new DAO();
    }

    public boolean cadastroMaquina(String fabricante, String modelo, String des, String numeroSerie) {
        try {
            
            Maquina maquina = new Maquina(fabricante, modelo, des, numeroSerie);
            Config.getCliente().addMaquina(maquina);
            dao.edit(Config.getCliente());
            return true;
            
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean atualizarMaquina(String fabricante, String modelo, String des, String numeroSerie) {
        try {
            
            Config.getMaquina().setDes(des);
            Config.getMaquina().setFabricante(fabricante);         
            Config.getMaquina().setModelo(modelo);
            Config.getMaquina().setNumero(modelo);
            
            dao.edit(Config.getMaquina());
            return true;
            
        } catch (Exception ex) {
            return false;
        }
    }
    
    public Maquina FindMaquina(Long id){
        Maquina m = new Maquina();
        m = (Maquina) dao.findObject(id, Maquina.class);
        return m;
    }
    public void excluirMaquina(){
        try {
            List<Maquina> maquinas = new ArrayList<Maquina>();
            maquinas = Config.getCliente().getMaquinas();            
            maquinas.remove(Config.getMaquina());
            Config.getCliente().setMaquinas(maquinas);
            dao.edit(Config.getCliente());
            dao.destroy(Config.getMaquina().getId(), Maquina.class);
        } catch (Exception ex) {
            System.err.println("Erro ao excluir maquina");
        }
    }
}
