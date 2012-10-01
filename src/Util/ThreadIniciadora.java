/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author Fagner
 */
public class ThreadIniciadora extends Thread{
    
    private DAO dao;
    
    @Override
    public void  run(){
        dao = new DAO();
        Config.setConf(true);
    }
}
