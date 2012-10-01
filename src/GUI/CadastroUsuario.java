/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CadastroUsuario.java
 *
 * Created on 04/06/2012, 21:30:58
 */
package GUI;

import Controler.ControleUsuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Brunno
 */
public class CadastroUsuario extends javax.swing.JDialog {

    private ControleUsuario controlerUsuario;
    private boolean tipo = true;

    public CadastroUsuario(java.awt.Frame parent) {
        super(parent);
        controlerUsuario = new ControleUsuario();
        initComponents();
        super.setSize(406, 517);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btSalva = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tfNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        rbGerencial = new javax.swing.JRadioButton();
        rbOperacional = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        tfCelular = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfResidencial = new javax.swing.JFormattedTextField();
        tfMail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(gerenciadorclientes.GerenciadorClientesApp.class).getContext().getResourceMap(CadastroUsuario.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jToolBar1.setBackground(resourceMap.getColor("jToolBar1.background")); // NOI18N
        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1"); // NOI18N

        btSalva.setFont(resourceMap.getFont("btNovo.font")); // NOI18N
        btSalva.setIcon(resourceMap.getIcon("btSalva.icon")); // NOI18N
        btSalva.setMnemonic('s');
        btSalva.setText(resourceMap.getString("btSalva.text")); // NOI18N
        btSalva.setToolTipText(resourceMap.getString("btSalva.toolTipText")); // NOI18N
        btSalva.setName("btSalva"); // NOI18N
        btSalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvaActionPerformed(evt);
            }
        });
        jToolBar1.add(btSalva);

        btNovo.setFont(resourceMap.getFont("btNovo.font")); // NOI18N
        btNovo.setIcon(resourceMap.getIcon("btNovo.icon")); // NOI18N
        btNovo.setMnemonic('n');
        btNovo.setText(resourceMap.getString("btNovo.text")); // NOI18N
        btNovo.setToolTipText(resourceMap.getString("btNovo.toolTipText")); // NOI18N
        btNovo.setName("btNovo"); // NOI18N
        jToolBar1.add(btNovo);

        btCancelar.setFont(resourceMap.getFont("btCancelar.font")); // NOI18N
        btCancelar.setIcon(resourceMap.getIcon("btCancelar.icon")); // NOI18N
        btCancelar.setMnemonic('c');
        btCancelar.setText(resourceMap.getString("btCancelar.text")); // NOI18N
        btCancelar.setToolTipText(resourceMap.getString("btCancelar.toolTipText")); // NOI18N
        btCancelar.setName("btCancelar"); // NOI18N
        jToolBar1.add(btCancelar);

        jPanel1.add(jToolBar1);
        jToolBar1.setBounds(10, 10, 370, 40);

        jPanel2.setBackground(resourceMap.getColor("jPanel2.background")); // NOI18N
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel2.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel2.border.titleFont"))); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(null);

        tfNome.setText(resourceMap.getString("tfNome.text")); // NOI18N
        tfNome.setToolTipText(resourceMap.getString("tfNome.toolTipText")); // NOI18N
        tfNome.setName("tfNome"); // NOI18N
        jPanel2.add(tfNome);
        tfNome.setBounds(10, 40, 340, 30);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 20, 33, 20);

        tfLogin.setText(resourceMap.getString("tfLogin.text")); // NOI18N
        tfLogin.setName("tfLogin"); // NOI18N
        jPanel2.add(tfLogin);
        tfLogin.setBounds(10, 100, 160, 30);

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 80, 100, 20);

        tfSenha.setText(resourceMap.getString("tfSenha.text")); // NOI18N
        tfSenha.setName("tfSenha"); // NOI18N
        jPanel2.add(tfSenha);
        tfSenha.setBounds(10, 160, 160, 30);

        jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 140, 50, 20);

        jPanel3.setBackground(resourceMap.getColor("jPanel3.background")); // NOI18N
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel3.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel3.border.titleFont"))); // NOI18N
        jPanel3.setName("jPanel3"); // NOI18N
        jPanel3.setLayout(null);

        rbGerencial.setBackground(resourceMap.getColor("rbGerencial.background")); // NOI18N
        buttonGroup1.add(rbGerencial);
        rbGerencial.setFont(resourceMap.getFont("rbGerencial.font")); // NOI18N
        rbGerencial.setText(resourceMap.getString("rbGerencial.text")); // NOI18N
        rbGerencial.setName("rbGerencial"); // NOI18N
        rbGerencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGerencialActionPerformed(evt);
            }
        });
        jPanel3.add(rbGerencial);
        rbGerencial.setBounds(10, 50, 90, 23);

        rbOperacional.setBackground(resourceMap.getColor("rbGerencial.background")); // NOI18N
        buttonGroup1.add(rbOperacional);
        rbOperacional.setFont(resourceMap.getFont("rbOperacional.font")); // NOI18N
        rbOperacional.setSelected(true);
        rbOperacional.setText(resourceMap.getString("rbOperacional.text")); // NOI18N
        rbOperacional.setName("rbOperacional"); // NOI18N
        rbOperacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOperacionalActionPerformed(evt);
            }
        });
        jPanel3.add(rbOperacional);
        rbOperacional.setBounds(10, 20, 100, 23);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(190, 100, 160, 90);

        jPanel4.setBackground(resourceMap.getColor("jPanel4.background")); // NOI18N
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel4.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel4.border.titleFont"))); // NOI18N
        jPanel4.setName("jPanel4"); // NOI18N
        jPanel4.setLayout(null);

        try {
            tfCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCelular.setName("tfCelular"); // NOI18N
        jPanel4.add(tfCelular);
        tfCelular.setBounds(90, 80, 150, 30);

        jLabel4.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel4.add(jLabel4);
        jLabel4.setBounds(10, 30, 70, 30);

        jLabel5.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 80, 50, 30);

        try {
            tfResidencial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfResidencial.setName("tfResidencial"); // NOI18N
        jPanel4.add(tfResidencial);
        tfResidencial.setBounds(90, 30, 150, 30);

        tfMail.setText(resourceMap.getString("tfMail.text")); // NOI18N
        tfMail.setName("tfMail"); // NOI18N
        jPanel4.add(tfMail);
        tfMail.setBounds(10, 150, 260, 30);

        jLabel6.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel4.add(jLabel6);
        jLabel6.setBounds(10, 130, 40, 20);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(40, 210, 280, 190);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 60, 370, 410);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-400)/2, (screenSize.height-514)/2, 400, 514);
    }// </editor-fold>//GEN-END:initComponents

private void btSalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvaActionPerformed

    String senha = JOptionPane.showInputDialog(null, "Redigite a senha para confirmação.", "Confirmar Senha", 1);

    if (senha.equalsIgnoreCase(tfSenha.getText().toString())) {

        boolean cond = controlerUsuario.CadastrarUsuario(tfNome.getText(), tfLogin.getText(), tfSenha.getText(), tfMail.getText(),
                tfResidencial.getText(), tfCelular.getText(), tipo);
        if (cond) {
            JOptionPane.showMessageDialog(null, "Usuário cadastrado.");
        }
        int op = JOptionPane.showConfirmDialog(null, "Deseja retorna?", "Mensagem", JOptionPane.YES_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            setVisible(false);
        }
    }else{
        JOptionPane.showMessageDialog(null, "A senha informada e diferente, por favor, corrija.\n Usuário não cadastrado.","Atenção",JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_btSalvaActionPerformed

private void rbOperacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOperacionalActionPerformed
    this.tipo = true;
}//GEN-LAST:event_rbOperacionalActionPerformed

private void rbGerencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGerencialActionPerformed
    this.tipo = false;
}//GEN-LAST:event_rbGerencialActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalva;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JRadioButton rbGerencial;
    private javax.swing.JRadioButton rbOperacional;
    private javax.swing.JFormattedTextField tfCelular;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JTextField tfMail;
    private javax.swing.JTextField tfNome;
    private javax.swing.JFormattedTextField tfResidencial;
    private javax.swing.JPasswordField tfSenha;
    // End of variables declaration//GEN-END:variables
}
