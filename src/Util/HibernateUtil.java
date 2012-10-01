/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author
 */
public class HibernateUtil {

    private static HibernateUtil util;
    private static EntityManagerFactory emf;

    private HibernateUtil() {
        emf = Persistence.createEntityManagerFactory("Gerenciador_ClientesPU");
    }

    public static HibernateUtil getInstance() {
        if (util == null) {
            util = new HibernateUtil();
        }
        return util;
    }
    //static
    public EntityManagerFactory getFactory() {
        return emf;
    }
}
