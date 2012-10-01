/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CadastroMaquina.java
 *
 * Created on 06/06/2012, 23:39:43
 */
package GUI;

import Controler.ControleMaquina;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Brunno
 */
public class CadastroMaquina extends javax.swing.JDialog {

    private ControleMaquina controlerMaquina;
    private JDialog tela;

    /** Creates new form CadastroMaquina */
    public CadastroMaquina(java.awt.Frame parent, JDialog tela) {
        super(parent);
        controlerMaquina = new ControleMaquina();
        initComponents();
        this.tela = tela;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btSalver = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tfFabricante = new javax.swing.JTextField();
        tfModelo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfDescricao = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        tfNumeroSerie = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(gerenciadorclientes.GerenciadorClientesApp.class).getContext().getResourceMap(CadastroMaquina.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jToolBar1.setBackground(resourceMap.getColor("jToolBar1.background")); // NOI18N
        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1"); // NOI18N

        btSalver.setFont(resourceMap.getFont("btSalver.font")); // NOI18N
        btSalver.setIcon(resourceMap.getIcon("btSalver.icon")); // NOI18N
        btSalver.setMnemonic('s');
        btSalver.setText(resourceMap.getString("btSalver.text")); // NOI18N
        btSalver.setToolTipText(resourceMap.getString("btSalver.toolTipText")); // NOI18N
        btSalver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalver.setName("btSalver"); // NOI18N
        btSalver.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btSalver.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalverActionPerformed(evt);
            }
        });
        jToolBar1.add(btSalver);

        btNovo.setFont(resourceMap.getFont("btNovo.font")); // NOI18N
        btNovo.setIcon(resourceMap.getIcon("btNovo.icon")); // NOI18N
        btNovo.setMnemonic('n');
        btNovo.setText(resourceMap.getString("btNovo.text")); // NOI18N
        btNovo.setToolTipText(resourceMap.getString("btNovo.toolTipText")); // NOI18N
        btNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNovo.setName("btNovo"); // NOI18N
        btNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jToolBar1.add(btNovo);

        btCancelar.setFont(resourceMap.getFont("btSalver.font")); // NOI18N
        btCancelar.setIcon(resourceMap.getIcon("btCancelar.icon")); // NOI18N
        btCancelar.setMnemonic('c');
        btCancelar.setText(resourceMap.getString("btCancelar.text")); // NOI18N
        btCancelar.setToolTipText(resourceMap.getString("btCancelar.toolTipText")); // NOI18N
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancelar.setName("btCancelar"); // NOI18N
        btCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(btCancelar);

        btVoltar.setFont(resourceMap.getFont("btVoltar.font")); // NOI18N
        btVoltar.setIcon(resourceMap.getIcon("btVoltar.icon")); // NOI18N
        btVoltar.setText(resourceMap.getString("btVoltar.text")); // NOI18N
        btVoltar.setFocusable(false);
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
        jToolBar1.setBounds(10, 10, 370, 60);

        jPanel2.setBackground(resourceMap.getColor("jPanel2.background")); // NOI18N
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel2.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel2.border.titleFont"))); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N

        tfFabricante.setText(resourceMap.getString("tfFabricante.text")); // NOI18N
        tfFabricante.setName("tfFabricante"); // NOI18N

        tfModelo.setName("tfModelo"); // NOI18N

        jLabel1.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jScrollPane1.setBackground(resourceMap.getColor("jScrollPane1.background")); // NOI18N
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jScrollPane1.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jScrollPane1.border.titleFont"))); // NOI18N
        jScrollPane1.setName("jScrollPane1"); // NOI18N

        tfDescricao.setColumns(20);
        tfDescricao.setRows(5);
        tfDescricao.setName("tfDescricao"); // NOI18N
        jScrollPane1.setViewportView(tfDescricao);

        jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        tfNumeroSerie.setText(resourceMap.getString("tfNumeroSerie.text")); // NOI18N
        tfNumeroSerie.setName("tfNumeroSerie"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(tfFabricante, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(tfNumeroSerie, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfNumeroSerie, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 90, 370, 400);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-409)/2, (screenSize.height-541)/2, 409, 541);
    }// </editor-fold>//GEN-END:initComponents

private void btSalverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalverActionPerformed
    boolean cond = controlerMaquina.cadastroMaquina(tfFabricante.getText(), tfModelo.getText(), tfDescricao.getText(), tfNumeroSerie.getText());
    if (cond) {
        JOptionPane.showMessageDialog(null, "Maquina cadastrada.");
    }
    int op = JOptionPane.showConfirmDialog(null, "Deseja retorna?", "Mensagem", JOptionPane.YES_OPTION);
    if (op == JOptionPane.YES_OPTION) {
        this.setVisible(false);
        this.tela.setVisible(true);
    }
}//GEN-LAST:event_btSalverActionPerformed

private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
    this.setVisible(false);
    this.tela.setVisible(true);
}//GEN-LAST:event_btVoltarActionPerformed

private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
    this.setVisible(false);
}//GEN-LAST:event_btCancelarActionPerformed

private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
    tfDescricao.setText("");
    tfFabricante.setText("");
    tfModelo.setText("");
    tfNumeroSerie.setText("");
}//GEN-LAST:event_btNovoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalver;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextArea tfDescricao;
    private javax.swing.JTextField tfFabricante;
    private javax.swing.JTextField tfModelo;
    private javax.swing.JTextField tfNumeroSerie;
    // End of variables declaration//GEN-END:variables
}
