/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import br.com.Banco.DAO.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.swing.JOptionPane;

/**
 *
 * @author Fagner
 */
public class DAO implements Serializable {

    private EntityManager em = HibernateUtil.getInstance().getFactory().createEntityManager();

    public Object create(Object object) {
        em = null;
        try {
            em = HibernateUtil.getInstance().getFactory().createEntityManager();
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception erro) {
            em.getTransaction().rollback();
        } finally {
            if (em != null) {
                em.close();
            }
            return object;
        }
    }

    public void edit(Object object) throws NonexistentEntityException, Exception {
        em = null;
        try {
            em = HibernateUtil.getInstance().getFactory().createEntityManager();
            em.getTransaction().begin();
            object = em.merge(object);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id, Class c) throws NonexistentEntityException {
        em = null;
        try {
            em = HibernateUtil.getInstance().getFactory().createEntityManager();
            em.getTransaction().begin();
            Object object;
            try {
                object = em.getReference(c, id);
            } catch (EntityNotFoundException enfe) {
                em.getTransaction().rollback();
                throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.", enfe);
            }
            em.remove(object);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Excluído com sucesso.");
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Object> findObjectEntities(Class c) {
        return findObjectEntities(true, -1, -1, c);
    }

    public List<Object> findObjectEntities(int maxResults, int firstResult, Class c) {
        return findObjectEntities(false, maxResults, firstResult, c);
    }

    private List<Object> findObjectEntities(boolean all, int maxResults, int firstResult, Class c) {
        em = null;
        try {
            em = HibernateUtil.getInstance().getFactory().createEntityManager();
            Query q = em.createQuery("select object(o) from " + c.getSimpleName() + " as o");
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();

        } finally {
            //em.close();
        }
    }

    public Object findObject(Long id, Class c) {
        em = null;
        try {
            em = HibernateUtil.getInstance().getFactory().createEntityManager();
            return em.find(c, id);
        } finally {
            //em.close();
        }
    }

    public int getObjectCount(Class c) {
        em = null;
        try {
            em = HibernateUtil.getInstance().getFactory().createEntityManager();
            Query q = em.createQuery("select count(o) from " + c.getSimpleName() + " as o");
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            // em.close();
        }
    }

    public List<Object> pesquisar(String tabela , String coluna,  String nome) {
        try {
            return em.createQuery("SELECT c FROM "+tabela+" c WHERE "+coluna+" like '" + nome + "%' order by "+coluna).getResultList();
        } catch (Exception erro) {
            return null;
        }
    }
    public List<Object> pesquisarCpf(String tabela , String coluna,  String cpf) {
        try {
            return em.createQuery("SELECT c FROM "+tabela+" c WHERE "+coluna+" like '" + cpf + "%' order by "+coluna).getResultList();
        } catch (Exception erro) {
            return null;
        }
    }
}
