/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BackupAutomatico.java
 *
 * Created on 07/06/2012, 11:10:17
 */
package GUI;

import Controler.ControleConfiguracao;
import Entidade.Configuracao;
import javax.swing.JFileChooser;

/**
 *
 * @author Brunno
 */
public class BackupAutomatico extends javax.swing.JDialog {

    private String arquivo;

    public BackupAutomatico(java.awt.Frame parent) {
        super(parent);
        initComponents();
        jfSelecao.setVisible(false);
        jfSelecao.setAcceptAllFileFilterUsed(false);
        jfSelecao.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        jfSelecao.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        this.mostrarDados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btPesquisar = new javax.swing.JButton();
        tfDiretorio = new javax.swing.JTextField();
        PainelSelecao = new javax.swing.JPanel();
        rbDiario = new javax.swing.JRadioButton();
        rbSemanal = new javax.swing.JRadioButton();
        rbMensal = new javax.swing.JRadioButton();
        rbAnual = new javax.swing.JRadioButton();
        rbDesativar = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        brSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jfSelecao = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(gerenciadorclientes.GerenciadorClientesApp.class).getContext().getResourceMap(BackupAutomatico.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jPanel2.setBackground(resourceMap.getColor("jPanel2.background")); // NOI18N
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel2.border.titleFont"))); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(null);

        btPesquisar.setIcon(resourceMap.getIcon("btPesquisar.icon")); // NOI18N
        btPesquisar.setMnemonic('p');
        btPesquisar.setText(resourceMap.getString("btPesquisar.text")); // NOI18N
        btPesquisar.setToolTipText(resourceMap.getString("btPesquisar.toolTipText")); // NOI18N
        btPesquisar.setName("btPesquisar"); // NOI18N
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        jPanel2.add(btPesquisar);
        btPesquisar.setBounds(480, 30, 60, 40);

        tfDiretorio.setEditable(false);
        tfDiretorio.setText(resourceMap.getString("tfDiretorio.text")); // NOI18N
        tfDiretorio.setName("tfDiretorio"); // NOI18N
        jPanel2.add(tfDiretorio);
        tfDiretorio.setBounds(10, 30, 460, 40);

        PainelSelecao.setBackground(resourceMap.getColor("PainelSelecao.background")); // NOI18N
        PainelSelecao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("PainelSelecao.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("PainelSelecao.border.titleFont"))); // NOI18N
        PainelSelecao.setName("PainelSelecao"); // NOI18N
        PainelSelecao.setLayout(null);

        rbDiario.setBackground(resourceMap.getColor("rbAnual.background")); // NOI18N
        buttonGroup1.add(rbDiario);
        rbDiario.setFont(resourceMap.getFont("rbMensal.font")); // NOI18N
        rbDiario.setText(resourceMap.getString("rbDiario.text")); // NOI18N
        rbDiario.setName("rbDiario"); // NOI18N
        PainelSelecao.add(rbDiario);
        rbDiario.setBounds(20, 20, 90, 23);

        rbSemanal.setBackground(resourceMap.getColor("rbAnual.background")); // NOI18N
        buttonGroup1.add(rbSemanal);
        rbSemanal.setFont(resourceMap.getFont("rbMensal.font")); // NOI18N
        rbSemanal.setText(resourceMap.getString("rbSemanal.text")); // NOI18N
        rbSemanal.setName("rbSemanal"); // NOI18N
        PainelSelecao.add(rbSemanal);
        rbSemanal.setBounds(120, 20, 90, 23);

        rbMensal.setBackground(resourceMap.getColor("rbAnual.background")); // NOI18N
        buttonGroup1.add(rbMensal);
        rbMensal.setFont(resourceMap.getFont("rbMensal.font")); // NOI18N
        rbMensal.setText(resourceMap.getString("rbMensal.text")); // NOI18N
        rbMensal.setName("rbMensal"); // NOI18N
        PainelSelecao.add(rbMensal);
        rbMensal.setBounds(220, 20, 90, 23);

        rbAnual.setBackground(resourceMap.getColor("rbAnual.background")); // NOI18N
        buttonGroup1.add(rbAnual);
        rbAnual.setFont(resourceMap.getFont("rbAnual.font")); // NOI18N
        rbAnual.setText(resourceMap.getString("rbAnual.text")); // NOI18N
        rbAnual.setName("rbAnual"); // NOI18N
        PainelSelecao.add(rbAnual);
        rbAnual.setBounds(320, 20, 90, 23);

        rbDesativar.setBackground(resourceMap.getColor("rbAnual.background")); // NOI18N
        buttonGroup1.add(rbDesativar);
        rbDesativar.setFont(resourceMap.getFont("rbDesativar.font")); // NOI18N
        rbDesativar.setSelected(true);
        rbDesativar.setText(resourceMap.getString("rbDesativar.text")); // NOI18N
        rbDesativar.setName("rbDesativar"); // NOI18N
        PainelSelecao.add(rbDesativar);
        rbDesativar.setBounds(420, 20, 100, 23);

        jPanel2.add(PainelSelecao);
        PainelSelecao.setBounds(10, 80, 530, 60);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 10, 80, 15);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 60, 560, 150);

        jToolBar1.setBackground(resourceMap.getColor("jToolBar1.background")); // NOI18N
        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1"); // NOI18N

        brSalvar.setFont(resourceMap.getFont("brSalvar.font")); // NOI18N
        brSalvar.setIcon(resourceMap.getIcon("brSalvar.icon")); // NOI18N
        brSalvar.setMnemonic('s');
        brSalvar.setText(resourceMap.getString("brSalvar.text")); // NOI18N
        brSalvar.setToolTipText(resourceMap.getString("brSalvar.toolTipText")); // NOI18N
        brSalvar.setName("brSalvar"); // NOI18N
        brSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brSalvarActionPerformed(evt);
            }
        });
        jToolBar1.add(brSalvar);

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
        jToolBar1.setBounds(10, 10, 560, 40);

        jfSelecao.setName("jfSelecao"); // NOI18N
        jPanel1.add(jfSelecao);
        jfSelecao.setBounds(-10, 220, 614, 397);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-598)/2, (screenSize.height-258)/2, 598, 258);
    }// </editor-fold>//GEN-END:initComponents

private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
    try {
        arquivo = null;
        jfSelecao.setVisible(true);
        int result = jfSelecao.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            arquivo = jfSelecao.getSelectedFile().toString();
            tfDiretorio.setText(arquivo);
        }
    } catch (Exception erro) {
    }
}//GEN-LAST:event_btPesquisarActionPerformed

private void brSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brSalvarActionPerformed
    Configuracao c = new Configuracao();
    c = ControleConfiguracao.getCongiguracao();
    c.setTempo_backup(tempoBackup());
    c.setPath_backup(converteBarra(tfDiretorio.getText()));
    ControleConfiguracao.salvarCongiguracao(c);
}//GEN-LAST:event_brSalvarActionPerformed

private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
     setVisible(false);
}//GEN-LAST:event_btCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelSelecao;
    private javax.swing.JButton brSalvar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JFileChooser jfSelecao;
    private javax.swing.JRadioButton rbAnual;
    private javax.swing.JRadioButton rbDesativar;
    private javax.swing.JRadioButton rbDiario;
    private javax.swing.JRadioButton rbMensal;
    private javax.swing.JRadioButton rbSemanal;
    private javax.swing.JTextField tfDiretorio;
    // End of variables declaration//GEN-END:variables

    private void mostrarDados() {
        try {
            tfDiretorio.setText(ControleConfiguracao.getCongiguracao().getPath_backup());
            if (ControleConfiguracao.getCongiguracao().getTempo_backup().equalsIgnoreCase("")) {
                rbDesativar.setSelected(true);
            }else if(ControleConfiguracao.getCongiguracao().getTempo_backup().equalsIgnoreCase("Anual")){
                rbAnual.setSelected(true);
            }else if(ControleConfiguracao.getCongiguracao().getTempo_backup().equalsIgnoreCase("Desativado")){
                rbDesativar.setSelected(true);
            }else if(ControleConfiguracao.getCongiguracao().getTempo_backup().equalsIgnoreCase("Diario")){
                rbDiario.setSelected(true);
            }else if(ControleConfiguracao.getCongiguracao().getTempo_backup().equalsIgnoreCase("Mensal")){
                rbMensal.setSelected(true);
            }else if(ControleConfiguracao.getCongiguracao().getTempo_backup().equalsIgnoreCase("Semanal")){
                rbSemanal.setSelected(true);
            }
        } catch (Exception erro) {
        }
    }

    private String converteBarra(String arquivo) {
        char a = '\\';
        for (int i = 0; i < arquivo.length(); i++) {
            if (a == arquivo.charAt(i)) {
                arquivo = arquivo.replace("" + arquivo.charAt(i), "/");
            }
        }
        return arquivo;
    }

    private String tempoBackup() {
        if (rbAnual.isSelected()) {
            return "Anual";
        } else if (rbDesativar.isSelected()) {
            return "Desativado";
        } else if (rbDiario.isSelected()) {
            return "Diario";
        } else if (rbMensal.isSelected()) {
            return "Mensal";
        } else if (rbSemanal.isSelected()) {
            return "Semanal";
        }
        return "";
    }
}
