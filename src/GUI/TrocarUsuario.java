/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TrocarUsuario.java
 *
 * Created on 04/06/2012, 22:41:44
 */
package GUI;

import Entidade.Usuario;
import Util.Config;
import Util.DAO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Brunno
 */
public class TrocarUsuario extends javax.swing.JDialog {

    private DAO dao;

    public TrocarUsuario() {
        dao = new DAO();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tfUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfSenha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(gerenciadorclientes.GerenciadorClientesApp.class).getContext().getResourceMap(TrocarUsuario.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jPanel2.setBackground(resourceMap.getColor("jPanel2.background")); // NOI18N
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel2.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel2.border.titleFont"))); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(null);

        tfUsuario.setText(resourceMap.getString("tfUsuario.text")); // NOI18N
        tfUsuario.setName("tfUsuario"); // NOI18N
        jPanel2.add(tfUsuario);
        tfUsuario.setBounds(20, 50, 200, 30);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(30, 20, 70, 30);

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 80, 70, 30);

        tfSenha.setText(resourceMap.getString("tfSenha.text")); // NOI18N
        tfSenha.setName("tfSenha"); // NOI18N
        jPanel2.add(tfSenha);
        tfSenha.setBounds(20, 110, 140, 30);

        jButton1.setFont(resourceMap.getFont("jButton2.font")); // NOI18N
        jButton1.setIcon(resourceMap.getIcon("jButton1.icon")); // NOI18N
        jButton1.setMnemonic('t');
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setToolTipText(resourceMap.getString("jButton1.toolTipText")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(20, 150, 120, 41);

        jButton2.setFont(resourceMap.getFont("jButton2.font")); // NOI18N
        jButton2.setIcon(resourceMap.getIcon("jButton2.icon")); // NOI18N
        jButton2.setMnemonic('c');
        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setToolTipText(resourceMap.getString("jButton2.toolTipText")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(200, 150, 120, 41);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 350, 210);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    tfUsuario.setText("");
    tfSenha.setText("");
    setVisible(false);
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if (converteValidarSenha() == true) {
        Config.getTfUsuario().setText("Usúario: " + Config.getUsuario().getNome());
        if (Config.getUsuario().isTipo()) {
            Config.ConfiguracaoMenu(false);
        } else {
            Config.ConfiguracaoMenu(true);
        }
        setVisible(false);
    } else {
        JOptionPane.showMessageDialog(null, "Usuário ou Senha incorretos.", "Atenção", 0);
    }
}//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables

    private boolean converteValidarSenha() {
        List<Object> objects = new ArrayList<Object>();
        objects = dao.findObjectEntities(Usuario.class);
        Iterator i = objects.iterator();

        while (i.hasNext()) {
            try {
                Usuario c = (Usuario) i.next();
                if (c.getLogin().equalsIgnoreCase(tfUsuario.getText()) && c.getSenha().equalsIgnoreCase(tfSenha.getText())) {
                    Config.setUsuario(c);
                    return true;
                }
            } catch (Exception eroo) {
            }
        }
        return false;
    }
}
