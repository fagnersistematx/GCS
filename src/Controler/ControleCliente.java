/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Entidade.Cliente;
import Entidade.Endereco;
import Util.Config;
import Util.DAO;
import br.com.Banco.DAO.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Fagner
 */
public class ControleCliente {

    private DAO dao;

    public ControleCliente() {
        dao = new DAO();
    }

    public void CadastrarCliente(String nome, String cpf_cnpj, String rg, String data_nas, String tel_fixo, String cel1, String cel2,
            String email, String sexo, String estado_civil, boolean tipo, String logradouro, String cidade, String bairro, String numero,
            String cep, String comp, String obs) {
        try {
            
            Endereco endereco = new Endereco(logradouro, cidade, bairro, numero, cep, comp, obs);
            Cliente cliente = new Cliente(nome, cpf_cnpj, rg, data_nas, tel_fixo, cel1, cel2, email, sexo, estado_civil, tipo, endereco);

            dao.create(cliente);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Cliente não cadastrado.", "Atenção", 0);
        }

    }

    public void CadastrarClienteJuritico(String nome, String cpf_cnpj, String tel_fixo, String cel1, String cel2, String email,
            String site, boolean tipo, String logradouro, String cidade, String bairro, String numero,
            String cep, String comp, String obs) {

        try {
            Endereco endereco = new Endereco(logradouro, cidade, bairro, numero, cep, comp, obs);
            Cliente cliente = new Cliente(nome, cpf_cnpj, tel_fixo, cel1, cel2, email, tipo, endereco);

            dao.create(cliente);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Cliente não cadastrado.", "Atenção", 0);
        }

    }

    public void atualizarDadosCrienteFisico(String nome, String cpf_cnpj, String rg, String data_nas, String tel_fixo, String cel1, String cel2,
            String email, String sexo, String estado_civil, boolean tipo, String logradouro, String cidade, String bairro, String numero,
            String cep, String comp, String obs, Cliente cliente) {
        try {
            
            cliente.getEndereco().atualizarEndereco(logradouro, cidade, bairro, numero, cep, comp, obs);
            cliente.atualizaCliente(nome, cpf_cnpj, rg, data_nas, tel_fixo, cel1, cel2, email, sexo, estado_civil, tipo);
            JOptionPane.showMessageDialog(null, "Dados do cliente atualizados.");

            dao.edit(cliente);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Os dados deste cliente não podem ser excluídos.", "Atenção", JOptionPane.ERROR_MESSAGE);
        }

    }

    public List<Cliente> clientesLista() {
        return converte(dao.findObjectEntities(Cliente.class));
    }

    public void findCliente(Long id) {
        Cliente c = new Cliente();
        c = (Cliente) dao.findObject(id, Cliente.class);
        Config.setCliente(c);
    }

    public List<Cliente> pesquisar(String nome) {
        return converte(dao.pesquisar("Cliente", "nome", nome));
    }
    
    public List<Cliente> pesquisarCPF(String cpf) {
        return converte(dao.pesquisar("Cliente", "cpf_cnpj", cpf));
    }
    
    public void excluirCliente() {
        try {
            dao.destroy(Config.getCliente().getId(), Cliente.class);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControleCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private List<Cliente> converte(List<Object> objectsAux) {
        List<Cliente> clientes = new ArrayList<Cliente>();
        List<Object> objects = new ArrayList<Object>();
        objects = objectsAux;
        Iterator i = objects.iterator();

        while (i.hasNext()) {
            try {
                Cliente c = (Cliente) i.next();
                clientes.add(c);
            } catch (Exception eroo) {
            }
        }
        return clientes;
    }
}
