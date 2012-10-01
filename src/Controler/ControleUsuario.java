/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Entidade.Usuario;
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
public class ControleUsuario {

    private DAO dao;

    public ControleUsuario() {
        dao = new DAO();
    }

    public boolean CadastrarUsuario(String nome, String login, String senha, String email, String fone, String cel, boolean tipo) {
        try {

            Usuario usuario = new Usuario(nome, login, senha, email, cel, cel, tipo);
            dao.create(usuario);
            return true;

        } catch (Exception erro) {
            return false;
        }
    }

    public boolean atualizarUsuario(Usuario usuario, String nome,String email, String fone, String cel, boolean tipo) {
        try {

            usuario.setCel(cel);
            usuario.setNome(nome);
            usuario.setEmail(email);
            usuario.setTel(fone);
            usuario.setTipo(tipo);
            
            dao.edit(usuario);            
            
            return true;

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro au atualizar dados do Usuário.","Atenção",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public void deletarUsuario(Long id) {
        for (Usuario u : converte()) {
            System.out.print(u.getId() + " || " + id);
            if (u.getId().toString().equalsIgnoreCase(id.toString())) {
                if (Config.getUsuario().getId().toString().equalsIgnoreCase(u.getId().toString())) {
                    JOptionPane.showMessageDialog(null, "Este usuário não pode ser excluído, porque estar em uso.", "Atenção", 0);
                    break;
                }
                System.out.print(u.getId() + " Delete " + id);
                try {
                    dao.destroy(u.getId(), Usuario.class);
                } catch (NonexistentEntityException ex) {
                    Logger.getLogger(ControleUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }
        }
    }

    public Usuario findPesquisa(Long id) {
        try {
            
            return (Usuario) dao.findObject(id, Usuario.class);
            
        } catch (Exception erro) {
            return new Usuario();
        }
    }
    
    public void alterarSenhaLogin(String login, String senha) {
        try {

            Config.getUsuario().setSenha(senha);
            Config.getUsuario().setLogin(login);
            dao.edit(Config.getUsuario());        
            
            JOptionPane.showMessageDialog(null, "Protocolo de acesso alterado com sucesso.");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel salvar as alterações.","Atenção",JOptionPane.ERROR_MESSAGE);
        }
    }

    public List<Usuario> converte() {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        List<Object> objects = new ArrayList<Object>();
        objects = dao.findObjectEntities(Usuario.class);
        Iterator i = objects.iterator();

        while (i.hasNext()) {
            try {
                Usuario u = (Usuario) i.next();
                usuarios.add(u);
            } catch (Exception eroo) {
            }
        }
        return usuarios;
    }

    public List<Usuario> converte(String nome) {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        List<Object> objects = new ArrayList<Object>();
        objects = dao.pesquisar("Usuario", "nome", nome);
        Iterator i = objects.iterator();

        while (i.hasNext()) {
            try {
                Usuario u = (Usuario) i.next();
                usuarios.add(u);
            } catch (Exception eroo) {
            }
        }
        return usuarios;
    }
}
