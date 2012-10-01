/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Entidade.Itens;
import Entidade.Orcamento;
import Util.Config;
import Util.DAO;
import Util.impressao.Impressao;
import br.com.Banco.DAO.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Brunno
 */
public final class ControleOrcamento {

    private DAO dao;
    private List<Itens> itens;
    private Long cont;
    private Impressao impressao;
    private float valorTotal = 0;

    public ControleOrcamento() {
        dao = new DAO();
        impressao = new Impressao();
        limpar();
    }

    public void cadastrarOrcamento(boolean cond, String forma_pag, String obs, String garantia) {
        if (itens.size() > 0) {
            Orcamento orcamento = new Orcamento();
            orcamento.setForma_pag(forma_pag);
            orcamento.setObs(obs);
            orcamento.setGarantia(garantia);
            orcamento.setCliente(Config.getCliente());
            orcamento.setDia_orcamento(Calendar.getInstance());
            orcamento.setValor(valorTotal);
            if (cond) {
                dao.create(orcamento);
                orcamento.setItens(itens);
                try {
                    dao.edit(orcamento);
                } catch (Exception ex) {
                }
                JOptionPane.showMessageDialog(null, "Salvo");
            } else {
                impressao.imprimirOrcamento(orcamento);
            }
            limpar();
        } else {
            JOptionPane.showMessageDialog(null, "Adicione algum Produto.", "Atenção", 0);
        }

    }

    public void alterarOrcamento(String forma_pag, String obs, String garantia, Orcamento orcamento) {
        if (itens.size() > 0) {
            orcamento.setForma_pag(forma_pag);
            orcamento.setObs(obs);
            orcamento.setGarantia(garantia);
            orcamento.setCliente(Config.getCliente());
            orcamento.setDia_orcamento(Calendar.getInstance());
            orcamento.setValor(valorTotal);
            
                try {
                    dao.edit(orcamento);
                    orcamento.setItens(itens);
                    dao.edit(orcamento);
                } catch (Exception ex) {
                }
                JOptionPane.showMessageDialog(null, "Salvo");
            
            limpar();
        } else {
            JOptionPane.showMessageDialog(null, "Adicione algum Produto.", "Atenção", 0);
        }

    }

    public void AddItens(String nome, float valor, float quant) {
        ++cont;
        Itens i = new Itens(cont, nome, quant, valor);
        itens.add(i);
        valorTotal += valor * quant;
    }

    public void removerItens(int id) {
        if (id != 0) {
            for (int i = 0; i < itens.size(); ++i) {
                if (itens.get(i).getId() == id) {
                    valorTotal -= (itens.get(i).getValor() * itens.get(i).getQuant());
                    itens.remove(i);
                    break;
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione algum Produto.", "Atenção", 0);
        }
    }

    public List<Orcamento> orcamentos() {
        return converte(dao.findObjectEntities(Orcamento.class));
    }

    private List<Orcamento> converte(List<Object> objectsAux) {
        List<Orcamento> clientes = new ArrayList<Orcamento>();
        List<Object> objects = new ArrayList<Object>();
        objects = objectsAux;
        Iterator i = objects.iterator();

        while (i.hasNext()) {
            try {
                Orcamento c = (Orcamento) i.next();
                clientes.add(c);
            } catch (Exception eroo) {
            }
        }
        return clientes;
    }

    public void limpar() {
        itens = new ArrayList<Itens>();
        cont = Long.parseLong("0");
    }

    public List<Itens> getItens() {
        return itens;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setItens(List<Itens> itens) {
        this.itens = itens;
    }

    public Orcamento findCliente(Long id) {
        return (Orcamento) dao.findObject(id, Orcamento.class);
    }

    public void deletarOrcamento(Long id) {
        try {
            dao.destroy(id, Orcamento.class);
        } catch (NonexistentEntityException ex) {
        }
    }
}
