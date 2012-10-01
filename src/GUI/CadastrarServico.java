/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CadastrarServico.java
 *
 * Created on 07/06/2012, 09:39:23
 */
package GUI;

import Controler.ControleServico;
import Controler.ControleUsuario;
import Entidade.Usuario;
import Util.Config;
import Util.JCalendar;
import Util.impressao.Impressao;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Brunno
 */
public class CadastrarServico extends javax.swing.JDialog {

    private ControleServico controlerServico;
    private ControleUsuario controleUsuario;
    private Impressao impressao;
    private JDialog btVoltar;
    private JCalendar jcalendar;

    public CadastrarServico(java.awt.Frame parent, JDialog btVoltar) {
        super(parent);
        this.btVoltar = btVoltar;
        impressao = new Impressao();
        controlerServico = new ControleServico();
        controleUsuario = new ControleUsuario();
        initComponents();
        this.preencherCbUsuario();
        tfCliente.setText(Config.getCliente().getNome());
        tfFabricanteModelo.setText(Config.getMaquina().getFabricante() + " / " + Config.getMaquina().getModelo());
        jcalendar = new JCalendar();
        jcalendar.setBounds(1, 1, 200, 200);
        PainelData.add(jcalendar);
        pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btSalvar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfFabricanteModelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfCliente = new javax.swing.JTextField();
        cbResponsavel = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox();
        PainelData = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfDescricaoProduto = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfOBS = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(gerenciadorclientes.GerenciadorClientesApp.class).getContext().getResourceMap(CadastrarServico.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jToolBar1.setBackground(resourceMap.getColor("jToolBar1.background")); // NOI18N
        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1"); // NOI18N

        btSalvar.setFont(resourceMap.getFont("btNovo.font")); // NOI18N
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

        jButton1.setFont(resourceMap.getFont("jButton1.font")); // NOI18N
        jButton1.setIcon(resourceMap.getIcon("jButton1.icon")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jPanel1.add(jToolBar1);
        jToolBar1.setBounds(10, 10, 890, 40);

        jPanel2.setBackground(resourceMap.getColor("jToolBar1.background")); // NOI18N
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel2.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel2.border.titleFont"))); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(null);

        jLabel1.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 30, 110, 20);

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 90, 50, 20);

        jLabel3.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(260, 150, 100, 20);

        tfFabricanteModelo.setEditable(false);
        tfFabricanteModelo.setName("tfFabricanteModelo"); // NOI18N
        jPanel2.add(tfFabricanteModelo);
        tfFabricanteModelo.setBounds(10, 50, 450, 30);

        jLabel4.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 150, 80, 20);

        tfCliente.setEditable(false);
        tfCliente.setName("tfCliente"); // NOI18N
        jPanel2.add(tfCliente);
        tfCliente.setBounds(10, 110, 450, 30);

        cbResponsavel.setName("cbResponsavel"); // NOI18N
        jPanel2.add(cbResponsavel);
        cbResponsavel.setBounds(10, 180, 230, 30);

        jLabel5.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 220, 150, 15);

        cbEstado.setEditable(true);
        cbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Em espera", "Em manutenção", "Aguardando peça", "Concluído" }));
        cbEstado.setName("cbEstado"); // NOI18N
        jPanel2.add(cbEstado);
        cbEstado.setBounds(10, 250, 230, 30);

        PainelData.setName("PainelData"); // NOI18N
        jPanel2.add(PainelData);
        PainelData.setBounds(260, 180, 200, 160);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 60, 490, 360);

        jPanel3.setBackground(resourceMap.getColor("jPanel3.background")); // NOI18N
        jPanel3.setName("jPanel3"); // NOI18N
        jPanel3.setLayout(null);

        jScrollPane2.setBackground(resourceMap.getColor("jScrollPane2.background")); // NOI18N
        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jScrollPane2.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jScrollPane2.border.titleFont"))); // NOI18N
        jScrollPane2.setName("jScrollPane2"); // NOI18N

        tfDescricaoProduto.setColumns(20);
        tfDescricaoProduto.setRows(5);
        tfDescricaoProduto.setName("tfDescricaoProduto"); // NOI18N
        jScrollPane2.setViewportView(tfDescricaoProduto);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(10, 0, 370, 170);

        jScrollPane1.setBackground(resourceMap.getColor("jScrollPane1.background")); // NOI18N
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jScrollPane1.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jScrollPane1.border.titleFont"))); // NOI18N
        jScrollPane1.setName("jScrollPane1"); // NOI18N

        tfOBS.setColumns(20);
        tfOBS.setRows(5);
        tfOBS.setName("tfOBS"); // NOI18N
        jScrollPane1.setViewportView(tfOBS);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 180, 370, 170);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(510, 60, 390, 360);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-929)/2, (screenSize.height-466)/2, 929, 466);
    }// </editor-fold>//GEN-END:initComponents

private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
    boolean cond;
    cond = controlerServico.cadastroServico(cbResponsavel.getSelectedItem().toString(), tfOBS.getText(), tfDescricaoProduto.getText(), jcalendar.getCalendar(), cbEstado.getSelectedItem().toString());
    if (cond) {
        JOptionPane.showMessageDialog(null, "Serviço cadastrado.");
    }
    int op2 = JOptionPane.showConfirmDialog(null, "Deseja imprimir a ficha?", "Mensagem", JOptionPane.YES_OPTION);
    if (op2 == JOptionPane.YES_OPTION) {
        impressao.imprimir(controlerServico.getServico());
    }
    int op = JOptionPane.showConfirmDialog(null, "Deseja retorna?", "Mensagem", JOptionPane.YES_OPTION);
    if (op == JOptionPane.YES_OPTION) {
        btVoltar.setVisible(true);
        setVisible(false);
    }
}//GEN-LAST:event_btSalvarActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    btVoltar.setVisible(true);
    setVisible(false);
}//GEN-LAST:event_jButton1ActionPerformed

private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
    setVisible(false);
}//GEN-LAST:event_btCancelarActionPerformed

private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
    tfDescricaoProduto.setText("");
    tfOBS.setText("");
    preencherCbUsuario();
}//GEN-LAST:event_btNovoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelData;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbEstado;
    private javax.swing.JComboBox cbResponsavel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField tfCliente;
    private javax.swing.JTextArea tfDescricaoProduto;
    private javax.swing.JTextField tfFabricanteModelo;
    private javax.swing.JTextArea tfOBS;
    // End of variables declaration//GEN-END:variables

    private void preencherCbUsuario() {
        try {
            for (Usuario u : controleUsuario.converte()) {
                cbResponsavel.addItem(u.getNome());
            }
        } catch (Exception erro) {
        }
    }
}
