/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AtualizarUsuario.java
 *
 * Created on 23/09/2012, 13:09:45
 */
package GUI.Atualizar;

import Controler.ControleUsuario;
import Entidade.Usuario;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class AtualizarUsuario extends javax.swing.JDialog {

    private JDialog tela;
    private ControleUsuario controleUsuario;
    private Long codigo;
    private Usuario usuario;
    private boolean tipo;

    public AtualizarUsuario(java.awt.Frame parent, JDialog tela, Long codigo) {
        super(parent);
        initComponents();
        this.tela = tela;
        this.controleUsuario = new ControleUsuario();
        this.codigo = codigo;
        mostrarDados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        rtOperacional = new javax.swing.JRadioButton();
        rtGerencial = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfFixo = new javax.swing.JFormattedTextField();
        tfCelular = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        btAtualizar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(gerenciadorclientes.GerenciadorClientesApp.class).getContext().getResourceMap(AtualizarUsuario.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setAlwaysOnTop(true);
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
        jLabel1.setBounds(20, 20, 40, 15);

        tfNome.setText(resourceMap.getString("tfNome.text")); // NOI18N
        tfNome.setName("tfNome"); // NOI18N
        jPanel2.add(tfNome);
        tfNome.setBounds(20, 40, 340, 30);

        jPanel3.setBackground(resourceMap.getColor("jPanel3.background")); // NOI18N
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel3.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel3.border.titleFont"))); // NOI18N
        jPanel3.setName("jPanel3"); // NOI18N
        jPanel3.setLayout(null);

        rtOperacional.setBackground(resourceMap.getColor("rtOperacional.background")); // NOI18N
        buttonGroup1.add(rtOperacional);
        rtOperacional.setFont(resourceMap.getFont("rtOperacional.font")); // NOI18N
        rtOperacional.setSelected(true);
        rtOperacional.setText(resourceMap.getString("rtOperacional.text")); // NOI18N
        rtOperacional.setName("rtOperacional"); // NOI18N
        rtOperacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtOperacionalActionPerformed(evt);
            }
        });
        jPanel3.add(rtOperacional);
        rtOperacional.setBounds(20, 20, 100, 23);

        rtGerencial.setBackground(resourceMap.getColor("rtOperacional.background")); // NOI18N
        buttonGroup1.add(rtGerencial);
        rtGerencial.setFont(resourceMap.getFont("rtGerencial.font")); // NOI18N
        rtGerencial.setText(resourceMap.getString("rtGerencial.text")); // NOI18N
        rtGerencial.setName("rtGerencial"); // NOI18N
        rtGerencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtGerencialActionPerformed(evt);
            }
        });
        jPanel3.add(rtGerencial);
        rtGerencial.setBounds(20, 60, 100, 23);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(120, 80, 140, 100);

        jPanel4.setBackground(resourceMap.getColor("jPanel4.background")); // NOI18N
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel4.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel4.border.titleFont"))); // NOI18N
        jPanel4.setName("jPanel4"); // NOI18N
        jPanel4.setLayout(null);

        jLabel4.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel4.add(jLabel4);
        jLabel4.setBounds(10, 40, 70, 15);

        jLabel5.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 80, 70, 15);

        try {
            tfFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfFixo.setName("tfFixo"); // NOI18N
        jPanel4.add(tfFixo);
        tfFixo.setBounds(100, 30, 150, 30);

        try {
            tfCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCelular.setName("tfCelular"); // NOI18N
        jPanel4.add(tfCelular);
        tfCelular.setBounds(100, 70, 150, 30);

        jLabel6.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel4.add(jLabel6);
        jLabel6.setBounds(10, 120, 34, 15);

        tfEmail.setText(resourceMap.getString("tfEmail.text")); // NOI18N
        tfEmail.setName("tfEmail"); // NOI18N
        jPanel4.add(tfEmail);
        tfEmail.setBounds(10, 140, 340, 30);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(10, 190, 360, 180);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 80, 390, 390);

        jToolBar1.setBackground(resourceMap.getColor("jToolBar1.background")); // NOI18N
        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1"); // NOI18N

        btAtualizar.setFont(resourceMap.getFont("btCancelar.font")); // NOI18N
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

        btNovo.setFont(resourceMap.getFont("btCancelar.font")); // NOI18N
        btNovo.setIcon(resourceMap.getIcon("btNovo.icon")); // NOI18N
        btNovo.setMnemonic('n');
        btNovo.setText(resourceMap.getString("btNovo.text")); // NOI18N
        btNovo.setToolTipText(resourceMap.getString("btNovo.toolTipText")); // NOI18N
        btNovo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNovo.setName("btNovo"); // NOI18N
        btNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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

        btVoltar.setFont(resourceMap.getFont("btCancelar.font")); // NOI18N
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
        jToolBar1.setBounds(10, 10, 390, 60);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-426)/2, (screenSize.height-518)/2, 426, 518);
    }// </editor-fold>//GEN-END:initComponents

private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
    this.tela.setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_btVoltarActionPerformed

private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed

    boolean cond = controleUsuario.atualizarUsuario(usuario, tfNome.getText(), tfEmail.getText(), tfFixo.getText(), tfCelular.getText(), tipo);
    if (cond) {
        JOptionPane.showMessageDialog(null, "Usuário atualizado.");
    }
    int op = JOptionPane.showConfirmDialog(null, "Deseja retorna?", "Mensagem", JOptionPane.YES_OPTION);
    if (op == JOptionPane.YES_OPTION) {
        tela.setVisible(true);
        setVisible(false);
    }
}//GEN-LAST:event_btAtualizarActionPerformed

private void rtOperacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtOperacionalActionPerformed
    this.tipo = true;
}//GEN-LAST:event_rtOperacionalActionPerformed

private void rtGerencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtGerencialActionPerformed
    this.tipo = false;
}//GEN-LAST:event_rtGerencialActionPerformed

private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
    this.setVisible(false);
}//GEN-LAST:event_btCancelarActionPerformed

private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
    tfCelular.setText("");
    tfEmail.setText("");
    tfFixo.setText("");
    tfNome.setText("");
}//GEN-LAST:event_btNovoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JRadioButton rtGerencial;
    private javax.swing.JRadioButton rtOperacional;
    private javax.swing.JFormattedTextField tfCelular;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JFormattedTextField tfFixo;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables

    private void mostrarDados() {
        try {

            usuario = controleUsuario.findPesquisa(codigo);
            tfCelular.setText(usuario.getCel());
            tfEmail.setText(usuario.getEmail());
            tfFixo.setText(usuario.getTel());
            tfNome.setText(usuario.getNome());

            tipo = usuario.isTipo();
            if (!usuario.isTipo()) {
                rtGerencial.setSelected(true);
            } else {
                rtOperacional.setSelected(true);
            }
        } catch (Exception erro) {
        }
    }
}
