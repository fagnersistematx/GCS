/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AtualizarClenteJuridico.java
 *
 * Created on 22/09/2012, 19:23:24
 */
package GUI.Atualizar;

import Controler.ControleCliente;
import Util.Config;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Brunno
 */
public class AtualizarClienteJuridico extends javax.swing.JDialog {

    private ControleCliente controleCliente;
    private JDialog tela;

    public AtualizarClienteJuridico(java.awt.Frame parent, JDialog tela) {
        super(parent);
        initComponents();
        this.controleCliente = new ControleCliente();
        this.mostrarDados();
        this.tela = tela;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tfNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfCPF = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfFixo = new javax.swing.JFormattedTextField();
        tfCelular1 = new javax.swing.JFormattedTextField();
        tfCelular2 = new javax.swing.JFormattedTextField();
        tfSite = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btAtualizar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfLogradouro = new javax.swing.JTextField();
        tfNumero = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        tfCidade = new javax.swing.JTextField();
        tfCEP = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfComplemento = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfOBS = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(gerenciadorclientes.GerenciadorClientesApp.class).getContext().getResourceMap(AtualizarClienteJuridico.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jPanel4.setBackground(resourceMap.getColor("jPanel4.background")); // NOI18N
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel4.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel4.border.titleFont"))); // NOI18N
        jPanel4.setName("jPanel4"); // NOI18N
        jPanel4.setLayout(null);

        tfNome.setText(resourceMap.getString("tfNome.text")); // NOI18N
        tfNome.setName("tfNome"); // NOI18N
        jPanel4.add(tfNome);
        tfNome.setBounds(10, 70, 340, 30);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel4.add(jLabel1);
        jLabel1.setBounds(10, 40, 130, 20);

        jLabel2.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel4.add(jLabel2);
        jLabel2.setBounds(10, 120, 50, 14);

        tfCPF.setText(resourceMap.getString("tfCPF.text")); // NOI18N
        tfCPF.setName("tfCPF"); // NOI18N
        jPanel4.add(tfCPF);
        tfCPF.setBounds(10, 140, 170, 30);

        jPanel3.setBackground(resourceMap.getColor("jPanel3.background")); // NOI18N
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel3.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel3.border.titleFont"))); // NOI18N
        jPanel3.setName("jPanel3"); // NOI18N
        jPanel3.setLayout(null);

        jLabel5.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 20, 80, 30);

        jLabel6.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 65, 110, 20);

        jLabel7.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 105, 110, 20);

        jLabel8.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N
        jPanel3.add(jLabel8);
        jLabel8.setBounds(20, 210, 30, 15);

        try {
            tfFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfFixo.setName("tfFixo"); // NOI18N
        jPanel3.add(tfFixo);
        tfFixo.setBounds(130, 20, 160, 30);

        try {
            tfCelular1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCelular1.setName("tfCelular1"); // NOI18N
        jPanel3.add(tfCelular1);
        tfCelular1.setBounds(130, 60, 160, 30);

        try {
            tfCelular2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCelular2.setName("tfCelular2"); // NOI18N
        jPanel3.add(tfCelular2);
        tfCelular2.setBounds(130, 100, 160, 30);

        tfSite.setText(resourceMap.getString("tfSite.text")); // NOI18N
        tfSite.setName("tfSite"); // NOI18N
        jPanel3.add(tfSite);
        tfSite.setBounds(20, 230, 320, 30);

        tfEmail.setText(resourceMap.getString("tfEmail.text")); // NOI18N
        tfEmail.setName("tfEmail"); // NOI18N
        jPanel3.add(tfEmail);
        tfEmail.setBounds(20, 170, 320, 30);

        jLabel3.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 140, 40, 14);

        jPanel4.add(jPanel3);
        jPanel3.setBounds(10, 190, 350, 280);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 70, 370, 520);

        jToolBar1.setBackground(resourceMap.getColor("jToolBar1.background")); // NOI18N
        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1"); // NOI18N

        btAtualizar.setFont(resourceMap.getFont("btLimpar.font")); // NOI18N
        btAtualizar.setIcon(resourceMap.getIcon("btAtualizar.icon")); // NOI18N
        btAtualizar.setMnemonic('s');
        btAtualizar.setText(resourceMap.getString("btAtualizar.text")); // NOI18N
        btAtualizar.setToolTipText(resourceMap.getString("btAtualizar.toolTipText")); // NOI18N
        btAtualizar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAtualizar.setName("btAtualizar"); // NOI18N
        btAtualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(btAtualizar);

        btLimpar.setFont(resourceMap.getFont("btLimpar.font")); // NOI18N
        btLimpar.setIcon(resourceMap.getIcon("btLimpar.icon")); // NOI18N
        btLimpar.setMnemonic('n');
        btLimpar.setText(resourceMap.getString("btLimpar.text")); // NOI18N
        btLimpar.setToolTipText(resourceMap.getString("btLimpar.toolTipText")); // NOI18N
        btLimpar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLimpar.setName("btLimpar"); // NOI18N
        btLimpar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        jToolBar1.add(btLimpar);

        btCancelar.setFont(resourceMap.getFont("btLimpar.font")); // NOI18N
        btCancelar.setIcon(resourceMap.getIcon("btCancelar.icon")); // NOI18N
        btCancelar.setMnemonic('c');
        btCancelar.setText(resourceMap.getString("btCancelar.text")); // NOI18N
        btCancelar.setToolTipText(resourceMap.getString("btCancelar.toolTipText")); // NOI18N
        btCancelar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancelar.setName("btCancelar"); // NOI18N
        btCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(btCancelar);

        btVoltar.setFont(resourceMap.getFont("btLimpar.font")); // NOI18N
        btVoltar.setIcon(resourceMap.getIcon("btVoltar.icon")); // NOI18N
        btVoltar.setMnemonic('v');
        btVoltar.setText(resourceMap.getString("btVoltar.text")); // NOI18N
        btVoltar.setToolTipText(resourceMap.getString("btVoltar.toolTipText")); // NOI18N
        btVoltar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVoltar.setName("btVoltar"); // NOI18N
        btVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        jToolBar1.add(btVoltar);

        jPanel1.add(jToolBar1);
        jToolBar1.setBounds(10, 10, 800, 50);

        jPanel2.setBackground(resourceMap.getColor("jPanel2.background")); // NOI18N
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel2.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel2.border.titleFont"))); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(null);

        jLabel11.setFont(resourceMap.getFont("jLabel12.font")); // NOI18N
        jLabel11.setText(resourceMap.getString("jLabel11.text")); // NOI18N
        jLabel11.setName("jLabel11"); // NOI18N
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 20, 70, 20);

        jLabel12.setFont(resourceMap.getFont("jLabel12.font")); // NOI18N
        jLabel12.setText(resourceMap.getString("jLabel12.text")); // NOI18N
        jLabel12.setName("jLabel12"); // NOI18N
        jPanel2.add(jLabel12);
        jLabel12.setBounds(310, 20, 50, 15);

        tfLogradouro.setText(resourceMap.getString("tfLogradouro.text")); // NOI18N
        tfLogradouro.setName("tfLogradouro"); // NOI18N
        jPanel2.add(tfLogradouro);
        tfLogradouro.setBounds(10, 40, 280, 30);

        tfNumero.setText(resourceMap.getString("tfNumero.text")); // NOI18N
        tfNumero.setName("tfNumero"); // NOI18N
        jPanel2.add(tfNumero);
        tfNumero.setBounds(310, 40, 90, 30);

        jLabel13.setFont(resourceMap.getFont("jLabel14.font")); // NOI18N
        jLabel13.setText(resourceMap.getString("jLabel13.text")); // NOI18N
        jLabel13.setName("jLabel13"); // NOI18N
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 80, 35, 15);

        jLabel14.setFont(resourceMap.getFont("jLabel14.font")); // NOI18N
        jLabel14.setText(resourceMap.getString("jLabel14.text")); // NOI18N
        jLabel14.setName("jLabel14"); // NOI18N
        jPanel2.add(jLabel14);
        jLabel14.setBounds(140, 80, 39, 15);

        jLabel15.setFont(resourceMap.getFont("jLabel14.font")); // NOI18N
        jLabel15.setText(resourceMap.getString("jLabel15.text")); // NOI18N
        jLabel15.setName("jLabel15"); // NOI18N
        jPanel2.add(jLabel15);
        jLabel15.setBounds(290, 80, 23, 15);

        tfBairro.setText(resourceMap.getString("tfBairro.text")); // NOI18N
        tfBairro.setName("tfBairro"); // NOI18N
        jPanel2.add(tfBairro);
        tfBairro.setBounds(10, 100, 120, 30);

        tfCidade.setText(resourceMap.getString("tfCidade.text")); // NOI18N
        tfCidade.setName("tfCidade"); // NOI18N
        jPanel2.add(tfCidade);
        tfCidade.setBounds(140, 100, 140, 30);

        tfCEP.setText(resourceMap.getString("tfCEP.text")); // NOI18N
        tfCEP.setName("tfCEP"); // NOI18N
        jPanel2.add(tfCEP);
        tfCEP.setBounds(290, 100, 120, 30);

        jPanel5.setBackground(resourceMap.getColor("jPanel5.background")); // NOI18N
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel5.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel5.border.titleFont"))); // NOI18N
        jPanel5.setName("jPanel5"); // NOI18N
        jPanel5.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        tfComplemento.setColumns(20);
        tfComplemento.setRows(5);
        tfComplemento.setName("tfComplemento"); // NOI18N
        jScrollPane1.setViewportView(tfComplemento);

        jPanel5.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(10, 140, 390, 180);

        jPanel6.setBackground(resourceMap.getColor("jPanel6.background")); // NOI18N
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel6.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel6.border.titleFont"))); // NOI18N
        jPanel6.setName("jPanel6"); // NOI18N
        jPanel6.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        tfOBS.setColumns(20);
        tfOBS.setRows(5);
        tfOBS.setName("tfOBS"); // NOI18N
        jScrollPane2.setViewportView(tfOBS);

        jPanel6.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(10, 330, 390, 180);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(390, 70, 420, 520);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-842)/2, (screenSize.height-637)/2, 842, 637);
    }// </editor-fold>//GEN-END:initComponents

private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
    if (!tfNome.getText().equalsIgnoreCase("")) {
        //controleCliente.atualizarDadosCrienteFisico(tfNome.getText(), tfCPF.getText(), tfRG.getText(), tfDataNas.getText(), tfTel.getText(),
                //tfTelCel1.getText(), tfTelCel2.getText(), tfMail.getText(), cbSexo.getSelectedItem().toString(),
               // cbEstadoCivil.getSelectedItem().toString(), false, tfLogradouro.getText(), tfCidade.getText(), tfBairro.getText(),
               // tfNumero.getText(), tfCEP.getText(), tfComplemento.getText(), tfOBSCliente.getText(), Config.getCliente());

        int op = JOptionPane.showConfirmDialog(null, "Deseja concluir?", "Cadastro de Cliente", JOptionPane.YES_OPTION);

        if (op == JOptionPane.YES_OPTION) {
            btLimparActionPerformed(evt);
            tela.setVisible(true);
            this.setVisible(false);
        }

    } else {
        JOptionPane.showMessageDialog(null, "Digite o nome do cliente.", "Atenção", 0);
    }
}//GEN-LAST:event_btAtualizarActionPerformed

private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
    tfBairro.setText("");
    tfCEP.setText("");
    tfCPF.setText("");
    tfCidade.setText("");
    tfComplemento.setText("");
    //tfDataNas.setText("");
    tfLogradouro.setText("");
    tfEmail.setText("");
    tfNome.setText("");
    tfNumero.setText("");
    tfOBS.setText("");
    //tfRG.setText("");
    tfFixo.setText("");
    tfCelular1.setText("");
    tfCelular2.setText("");
}//GEN-LAST:event_btLimparActionPerformed

private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
    int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja concluir?", "Cadastro de Cliente", JOptionPane.YES_OPTION);

    if (op == JOptionPane.YES_OPTION) {
        btLimparActionPerformed(evt);
        tela.setVisible(true);
        this.setVisible(false);
    }
}//GEN-LAST:event_btVoltarActionPerformed

private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
    int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar?", "Cadastro de Cliente", JOptionPane.YES_OPTION);

    if (op == JOptionPane.YES_OPTION) {
        btLimparActionPerformed(evt);
        this.setVisible(false);
    }
}//GEN-LAST:event_btCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCEP;
    private javax.swing.JFormattedTextField tfCPF;
    private javax.swing.JFormattedTextField tfCelular1;
    private javax.swing.JFormattedTextField tfCelular2;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextArea tfComplemento;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JFormattedTextField tfFixo;
    private javax.swing.JTextField tfLogradouro;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextArea tfOBS;
    private javax.swing.JTextField tfSite;
    // End of variables declaration//GEN-END:variables
    private void mostrarDados() {
        tfBairro.setText(Config.getCliente().getEndereco().getBairro());
        tfCEP.setText(Config.getCliente().getEndereco().getCep());
        tfCPF.setText(Config.getCliente().getCpf_cnpj());
        tfCidade.setText(Config.getCliente().getEndereco().getCidade());
        tfComplemento.setText(Config.getCliente().getEndereco().getComp());
        //tfDataNas.setText(Config.getCliente().getData_nas());
        tfLogradouro.setText(Config.getCliente().getEndereco().getLogradouro());
        //tfMail.setText(Config.getCliente().getEmail());
        tfNome.setText(Config.getCliente().getNome());
        tfNumero.setText(Config.getCliente().getEndereco().getNumero());
        tfOBS.setText(Config.getCliente().getEndereco().getObs());
        //tfRG.setText(Config.getCliente().getRg());
        tfFixo.setText(Config.getCliente().getTel_fixo());
        tfCelular1.setText(Config.getCliente().getCel1());
        tfCelular2.setText(Config.getCliente().getCel2());
        //cbEstadoCivil.setSelectedItem(Config.getCliente().getEstado_civil());
        //cbSexo.setSelectedItem(Config.getCliente().getSexo());
    }
}
