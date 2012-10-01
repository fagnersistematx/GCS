/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CadastroCliente.java
 *
 * Created on 31/05/2012, 22:44:04
 */
package GUI;

import Controler.ControleCliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Brunno
 */
public class CadastroClienteJuridico extends javax.swing.JDialog {

    private ControleCliente controleCliente;

    public CadastroClienteJuridico(java.awt.Frame parent) {
        super(parent);
        setSize(843, 607);
        initComponents();
        this.controleCliente = new ControleCliente();
        super.setSize(843, 607);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btSalvar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfMail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfSite = new javax.swing.JTextField();
        tfTelCel1 = new javax.swing.JFormattedTextField();
        tfTelCel2 = new javax.swing.JFormattedTextField();
        tfTel = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfRasaoSocial = new javax.swing.JTextField();
        tfCNPJ = new javax.swing.JFormattedTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        tfLogradouro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfNumero = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfComplemento = new javax.swing.JTextArea();
        tfCidade = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        tfCEP = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfOBSCliente = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(gerenciadorclientes.GerenciadorClientesApp.class).getContext().getResourceMap(CadastroClienteJuridico.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Form"); // NOI18N

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jToolBar1.setBackground(resourceMap.getColor("jToolBar1.background")); // NOI18N
        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1"); // NOI18N

        btSalvar.setFont(resourceMap.getFont("btSalvar.font")); // NOI18N
        btSalvar.setIcon(resourceMap.getIcon("btSalvar.icon")); // NOI18N
        btSalvar.setMnemonic('s');
        btSalvar.setText(resourceMap.getString("btSalvar.text")); // NOI18N
        btSalvar.setToolTipText(resourceMap.getString("btSalvar.toolTipText")); // NOI18N
        btSalvar.setName("btSalvar"); // NOI18N
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jToolBar1.add(btSalvar);

        btNovo.setFont(resourceMap.getFont("btNovo.font")); // NOI18N
        btNovo.setIcon(resourceMap.getIcon("btNovo.icon")); // NOI18N
        btNovo.setMnemonic('n');
        btNovo.setText(resourceMap.getString("btNovo.text")); // NOI18N
        btNovo.setToolTipText(resourceMap.getString("btNovo.toolTipText")); // NOI18N
        btNovo.setName("btNovo"); // NOI18N
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jToolBar1.add(btNovo);

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
        jToolBar1.add(btCancelar);

        jPanel1.add(jToolBar1);
        jToolBar1.setBounds(10, 11, 810, 40);

        jPanel5.setBackground(resourceMap.getColor("jPanel5.background")); // NOI18N
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel5.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel5.border.titleFont"))); // NOI18N
        jPanel5.setName("jPanel5"); // NOI18N
        jPanel5.setLayout(null);

        jPanel4.setBackground(resourceMap.getColor("jPanel4.background")); // NOI18N
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel4.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel4.border.titleFont"))); // NOI18N
        jPanel4.setName("jPanel4"); // NOI18N
        jPanel4.setLayout(null);

        jLabel5.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 20, 140, 30);

        jLabel6.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel4.add(jLabel6);
        jLabel6.setBounds(10, 80, 130, 30);

        jLabel7.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N
        jPanel4.add(jLabel7);
        jLabel7.setBounds(10, 140, 130, 20);

        jLabel14.setFont(resourceMap.getFont("jLabel14.font")); // NOI18N
        jLabel14.setText(resourceMap.getString("jLabel14.text")); // NOI18N
        jLabel14.setName("jLabel14"); // NOI18N
        jPanel4.add(jLabel14);
        jLabel14.setBounds(10, 180, 70, 20);

        tfMail.setName("tfMail"); // NOI18N
        jPanel4.add(tfMail);
        tfMail.setBounds(10, 200, 300, 30);

        jLabel8.setName("jLabel8"); // NOI18N
        jPanel4.add(jLabel8);
        jLabel8.setBounds(10, 240, 50, 20);

        tfSite.setName("tfSite"); // NOI18N
        jPanel4.add(tfSite);
        tfSite.setBounds(10, 260, 300, 30);

        try {
            tfTelCel1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfTelCel1.setName("tfTelCel1"); // NOI18N
        jPanel4.add(tfTelCel1);
        tfTelCel1.setBounds(150, 80, 160, 30);

        try {
            tfTelCel2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfTelCel2.setName("tfTelCel2"); // NOI18N
        jPanel4.add(tfTelCel2);
        tfTelCel2.setBounds(150, 140, 160, 30);

        try {
            tfTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfTel.setName("tfTel"); // NOI18N
        jPanel4.add(tfTel);
        tfTel.setBounds(150, 20, 160, 30);

        jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel4.add(jLabel3);
        jLabel3.setBounds(10, 240, 22, 15);

        jPanel5.add(jPanel4);
        jPanel4.setBounds(10, 180, 330, 310);

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel5.add(jLabel2);
        jLabel2.setBounds(20, 110, 140, 20);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel5.add(jLabel1);
        jLabel1.setBounds(20, 40, 180, 20);

        tfRasaoSocial.setName("tfRasaoSocial"); // NOI18N
        jPanel5.add(tfRasaoSocial);
        tfRasaoSocial.setBounds(20, 70, 300, 30);

        tfCNPJ.setName("tfCNPJ"); // NOI18N
        jPanel5.add(tfCNPJ);
        tfCNPJ.setBounds(20, 130, 210, 30);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(10, 61, 350, 500);

        jPanel6.setBackground(resourceMap.getColor("jPanel6.background")); // NOI18N
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel6.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel6.border.titleFont"))); // NOI18N
        jPanel6.setName("jPanel6"); // NOI18N
        jPanel6.setLayout(null);

        jLabel10.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N
        jPanel6.add(jLabel10);
        jLabel10.setBounds(10, 21, 70, 20);

        tfLogradouro.setName("tfLogradouro"); // NOI18N
        jPanel6.add(tfLogradouro);
        tfLogradouro.setBounds(10, 41, 330, 30);

        jLabel11.setFont(resourceMap.getFont("jLabel11.font")); // NOI18N
        jLabel11.setText(resourceMap.getString("jLabel11.text")); // NOI18N
        jLabel11.setName("jLabel11"); // NOI18N
        jPanel6.add(jLabel11);
        jLabel11.setBounds(10, 81, 40, 20);

        jLabel12.setFont(resourceMap.getFont("jLabel12.font")); // NOI18N
        jLabel12.setText(resourceMap.getString("jLabel12.text")); // NOI18N
        jLabel12.setName("jLabel12"); // NOI18N
        jPanel6.add(jLabel12);
        jLabel12.setBounds(360, 21, 50, 20);

        tfNumero.setName("tfNumero"); // NOI18N
        jPanel6.add(tfNumero);
        tfNumero.setBounds(360, 41, 80, 30);

        jLabel13.setFont(resourceMap.getFont("jLabel13.font")); // NOI18N
        jLabel13.setText(resourceMap.getString("jLabel13.text")); // NOI18N
        jLabel13.setName("jLabel13"); // NOI18N
        jPanel6.add(jLabel13);
        jLabel13.setBounds(160, 86, 39, 15);

        jLabel15.setFont(resourceMap.getFont("jLabel15.font")); // NOI18N
        jLabel15.setText(resourceMap.getString("jLabel15.text")); // NOI18N
        jLabel15.setName("jLabel15"); // NOI18N
        jPanel6.add(jLabel15);
        jLabel15.setBounds(310, 81, 30, 20);

        jScrollPane1.setBackground(resourceMap.getColor("jScrollPane1.background")); // NOI18N
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jScrollPane1.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jScrollPane1.border.titleFont"))); // NOI18N
        jScrollPane1.setName("jScrollPane1"); // NOI18N

        tfComplemento.setColumns(20);
        tfComplemento.setRows(5);
        tfComplemento.setName("tfComplemento"); // NOI18N
        jScrollPane1.setViewportView(tfComplemento);

        jPanel6.add(jScrollPane1);
        jScrollPane1.setBounds(10, 151, 430, 122);

        tfCidade.setName("tfCidade"); // NOI18N
        jPanel6.add(tfCidade);
        tfCidade.setBounds(160, 100, 130, 30);

        tfBairro.setName("tfBairro"); // NOI18N
        jPanel6.add(tfBairro);
        tfBairro.setBounds(10, 100, 130, 30);

        tfCEP.setName("tfCEP"); // NOI18N
        jPanel6.add(tfCEP);
        tfCEP.setBounds(310, 100, 130, 30);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(370, 61, 450, 290);

        jPanel7.setBackground(resourceMap.getColor("jPanel7.background")); // NOI18N
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel7.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel7.border.titleFont"))); // NOI18N
        jPanel7.setName("jPanel7"); // NOI18N
        jPanel7.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        tfOBSCliente.setColumns(20);
        tfOBSCliente.setRows(5);
        tfOBSCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("tfOBSCliente.border.titleFont"))); // NOI18N
        tfOBSCliente.setName("tfOBSCliente"); // NOI18N
        jScrollPane2.setViewportView(tfOBSCliente);

        jPanel7.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7);
        jPanel7.setBounds(370, 351, 450, 210);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-845)/2, (screenSize.height-609)/2, 845, 609);
    }// </editor-fold>//GEN-END:initComponents

private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
    if (!tfRasaoSocial.getText().equalsIgnoreCase("")) {
        controleCliente.CadastrarClienteJuritico(tfRasaoSocial.getText(), tfCNPJ.getText(), tfTel.getText(),
                tfTelCel1.getText(), tfTelCel2.getText(), tfMail.getText(), tfSite.getText(),
                true, tfLogradouro.getText(), tfCidade.getText(), tfBairro.getText(),
                tfNumero.getText(), tfCEP.getText(), tfComplemento.getText(), tfOBSCliente.getText());


        int op = JOptionPane.showConfirmDialog(null, "Deseja concluir?", "Cadastro de Cliente", JOptionPane.YES_OPTION);

        if (op == JOptionPane.YES_OPTION) {
            btNovoActionPerformed(evt);
            this.setVisible(false);
        }

    } else {
        JOptionPane.showMessageDialog(null, "Digite o nome do cliente.", "Atenção", 0);
    }
}//GEN-LAST:event_btSalvarActionPerformed

private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
    tfBairro.setText("");
    tfCEP.setText("");
    tfCNPJ.setText("");
    tfCidade.setText("");
    tfComplemento.setText("");
    tfLogradouro.setText("");
    tfMail.setText("");
    tfRasaoSocial.setText("");
    tfNumero.setText("");
    tfOBSCliente.setText("");
    tfTel.setText("");
    tfTelCel1.setText("");
    tfTelCel2.setText("");
}//GEN-LAST:event_btNovoActionPerformed

private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
    int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja concluir?", "Cadastro de Cliente", JOptionPane.YES_OPTION);

    if (op == JOptionPane.YES_OPTION) {
        btNovoActionPerformed(evt);
        this.setVisible(false);
    }
}//GEN-LAST:event_btCancelarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCEP;
    private javax.swing.JFormattedTextField tfCNPJ;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextArea tfComplemento;
    private javax.swing.JTextField tfLogradouro;
    private javax.swing.JTextField tfMail;
    private javax.swing.JFormattedTextField tfNumero;
    private javax.swing.JTextArea tfOBSCliente;
    private javax.swing.JTextField tfRasaoSocial;
    private javax.swing.JTextField tfSite;
    private javax.swing.JFormattedTextField tfTel;
    private javax.swing.JFormattedTextField tfTelCel1;
    private javax.swing.JFormattedTextField tfTelCel2;
    // End of variables declaration//GEN-END:variables
}
