/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LoguinInicial.java
 *
 * Created on 04/06/2012, 22:53:13
 */
package GUI;

import Controler.ControleConfiguracao;
import Entidade.Usuario;
import Util.ConfLook;
import Util.Config;
import Util.DAO;
import gerenciadorclientes.GerenciadorClientesApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Brunno
 */
public class LoguinInicial extends javax.swing.JFrame {

    private DAO dao = new DAO();
    private ControleConfiguracao controleConfiguracao;

    public LoguinInicial() {
        setResizable(false);
        initComponents();
        controleConfiguracao = new ControleConfiguracao();
        this.setIconImage(ConfLook.icone());
        controleConfiguracao.verificar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfSenha = new javax.swing.JPasswordField();
        btEntra = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(gerenciadorclientes.GerenciadorClientesApp.class).getContext().getResourceMap(LoguinInicial.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jPanel2.setBackground(resourceMap.getColor("jPanel2.background")); // NOI18N
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel2.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel2.border.titleFont"))); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(null);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(30, 20, 80, 30);

        jLabel2.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 80, 36, 30);

        tfNome.setText(resourceMap.getString("tfNome.text")); // NOI18N
        tfNome.setName("tfNome"); // NOI18N
        jPanel2.add(tfNome);
        tfNome.setBounds(20, 50, 260, 30);

        tfSenha.setText(resourceMap.getString("tfSenha.text")); // NOI18N
        tfSenha.setName("tfSenha"); // NOI18N
        jPanel2.add(tfSenha);
        tfSenha.setBounds(20, 110, 150, 30);

        btEntra.setIcon(resourceMap.getIcon("btEntra.icon")); // NOI18N
        btEntra.setMnemonic('e');
        btEntra.setText(resourceMap.getString("btEntra.text")); // NOI18N
        btEntra.setToolTipText(resourceMap.getString("btEntra.toolTipText")); // NOI18N
        btEntra.setName("btEntra"); // NOI18N
        btEntra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntraActionPerformed(evt);
            }
        });
        jPanel2.add(btEntra);
        btEntra.setBounds(20, 150, 130, 41);

        btCancelar.setFont(resourceMap.getFont("btCancelar.font")); // NOI18N
        btCancelar.setIcon(resourceMap.getIcon("btCancelar.icon")); // NOI18N
        btCancelar.setMnemonic('c');
        btCancelar.setText(resourceMap.getString("btCancelar.text")); // NOI18N
        btCancelar.setToolTipText(resourceMap.getString("btCancelar.toolTipText")); // NOI18N
        btCancelar.setName("btCancelar"); // NOI18N
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btCancelar);
        btCancelar.setBounds(169, 150, 130, 41);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(200, 10, 320, 200);

        jLabel3.setIcon(resourceMap.getIcon("jLabel3.icon")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 20, 140, 180);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-553)/2, (screenSize.height-257)/2, 553, 257);
    }// </editor-fold>//GEN-END:initComponents

private void btEntraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntraActionPerformed

    if (converteValidarSenha() == true) {
        String[] args = null;
        setVisible(false);
        GerenciadorClientesApp.gerenciador(args);
    } else {
        JOptionPane.showMessageDialog(null,"Usuário ou Senha incorretos.","Atenção",0);
    }
}//GEN-LAST:event_btEntraActionPerformed

private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
    System.exit(0);
}//GEN-LAST:event_btCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEntra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfNome;
    private javax.swing.JPasswordField tfSenha;
    // End of variables declaration//GEN-END:variables

    private boolean converteValidarSenha() {
        List<Object> objects = new ArrayList<Object>();
        objects = dao.findObjectEntities(Usuario.class);
        Iterator i = objects.iterator();

        while (i.hasNext()) {
            try {
                Usuario c = (Usuario) i.next();
                if (c.getLogin().equalsIgnoreCase(tfNome.getText()) && c.getSenha().equalsIgnoreCase(tfSenha.getText())) {
                    Config.setUsuario(c);
                    return true;
                }
            } catch (Exception eroo) {
            }
        }
        return false;
    }
}
