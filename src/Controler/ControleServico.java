/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Entidade.Maquina;
import Entidade.Servico;
import Util.Config;
import Util.DAO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Fagner
 */
public class ControleServico {

    private DAO dao;
    private Servico servico;

    public ControleServico() {
        dao = new DAO();
    }

    public boolean cadastroServico(String responsavel, String obs, String des, Calendar data_entraga_servico, String estado) {
        try {

            servico = new Servico(des, obs, responsavel, Calendar.getInstance(), data_entraga_servico, estado);
            Config.getMaquina().addServico(servico);
            dao.edit(Config.getMaquina());

            return true;

        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean atualizarServico(String obs, String des, Calendar data_entraga_servico) {
        try {

            Config.getServico().setDes(des);
            Config.getServico().setObs(obs);
            Config.getServico().setData_servico(data_entraga_servico);
            
            dao.edit(Config.getServico());

            return true;

        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean atualizarServico(Servico servico) {
        try {
            
            dao.edit(servico);

            return true;

        } catch (Exception ex) {
            return false;
        }
    }

    public void excluirServico(Servico servico, Maquina maquina) {
        try {
            List<Servico> servicos = new ArrayList<Servico>();
            servicos = maquina.getServicos();            
            servicos.remove(servico);
            maquina.setServicos(servicos);
            dao.edit(maquina);
            dao.destroy(servico.getId(), Servico.class);
        } catch (Exception ex) {
            System.err.println("Erro ao excluir serviço.");
        }
    }

    public Servico getServico() {
        return servico;
    }

    public Servico FindServico(Long id) {
        Servico m = new Servico();
        m = (Servico) dao.findObject(id, Servico.class);
        Config.setServico(m);
        return m;
    }
}
