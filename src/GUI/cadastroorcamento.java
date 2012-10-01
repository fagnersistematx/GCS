/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * cadastroorcamento.java
 *
 * Created on 30/06/2012, 23:09:54
 */
package GUI;

import Controler.ControleOrcamento;
import Entidade.Itens;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brunno
 */
public class cadastroorcamento extends javax.swing.JDialog {

    private ControleOrcamento controleOrcamento;
    private int codigo;
    private JDialog btVoltar;    

    public cadastroorcamento(java.awt.Frame parent, JDialog btVoltar) {
        super(parent);
        this.btVoltar = btVoltar;
        controleOrcamento = new ControleOrcamento();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tfQuant = new javax.swing.JTextField();
        tfProduto = new javax.swing.JTextField();
        tfUnidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btAdicionar = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btSalvar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbOrçamento = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfOBS = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        cbFormaPag = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfMes = new javax.swing.JTextField();
        tfDia = new javax.swing.JTextField();
        tfAno = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        tfTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(gerenciadorclientes.GerenciadorClientesApp.class).getContext().getResourceMap(cadastroorcamento.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jPanel2.setBackground(resourceMap.getColor("jPanel2.background")); // NOI18N
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel2.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel2.border.titleFont"))); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(null);

        tfQuant.setText(resourceMap.getString("tfQuant.text")); // NOI18N
        tfQuant.setName("tfQuant"); // NOI18N
        tfQuant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuantActionPerformed(evt);
            }
        });
        jPanel2.add(tfQuant);
        tfQuant.setBounds(610, 40, 50, 30);

        tfProduto.setName("tfProduto"); // NOI18N
        tfProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfProdutoActionPerformed(evt);
            }
        });
        jPanel2.add(tfProduto);
        tfProduto.setBounds(10, 40, 580, 30);

        tfUnidade.setName("tfUnidade"); // NOI18N
        tfUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUnidadeActionPerformed(evt);
            }
        });
        jPanel2.add(tfUnidade);
        tfUnidade.setBounds(680, 40, 110, 30);

        jLabel1.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(610, 20, 40, 20);

        jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 20, 50, 20);

        jLabel4.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(680, 20, 100, 20);

        btAdicionar.setIcon(resourceMap.getIcon("btAdicionar.icon")); // NOI18N
        btAdicionar.setMnemonic('a');
        btAdicionar.setText(resourceMap.getString("btAdicionar.text")); // NOI18N
        btAdicionar.setToolTipText(resourceMap.getString("btAdicionar.toolTipText")); // NOI18N
        btAdicionar.setName("btAdicionar"); // NOI18N
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });
        jPanel2.add(btAdicionar);
        btAdicionar.setBounds(810, 40, 30, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 200, 870, 80);

        jToolBar1.setBackground(resourceMap.getColor("jToolBar1.background")); // NOI18N
        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        btRemover.setFont(resourceMap.getFont("btNovo.font")); // NOI18N
        btRemover.setIcon(resourceMap.getIcon("btRemover.icon")); // NOI18N
        btRemover.setMnemonic('r');
        btRemover.setText(resourceMap.getString("btRemover.text")); // NOI18N
        btRemover.setToolTipText(resourceMap.getString("btRemover.toolTipText")); // NOI18N
        btRemover.setName("btRemover"); // NOI18N
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });
        jToolBar1.add(btRemover);

        btCancelar.setFont(resourceMap.getFont("btNovo.font")); // NOI18N
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
        jToolBar1.setBounds(10, 10, 870, 40);

        jPanel3.setBackground(resourceMap.getColor("jPanel3.background")); // NOI18N
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel3.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel3.border.titleFont"))); // NOI18N
        jPanel3.setName("jPanel3"); // NOI18N
        jPanel3.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        tbOrçamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nº", "Produto", "Quantidade", "Valor p/ Unidade", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbOrçamento.setName("tbOrçamento"); // NOI18N
        tbOrçamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbOrçamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbOrçamento);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 280, 870, 340);

        jPanel4.setBackground(resourceMap.getColor("jPanel4.background")); // NOI18N
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel4.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel4.border.titleFont"))); // NOI18N
        jPanel4.setName("jPanel4"); // NOI18N
        jPanel4.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        tfOBS.setColumns(20);
        tfOBS.setRows(5);
        tfOBS.setName("tfOBS"); // NOI18N
        jScrollPane2.setViewportView(tfOBS);

        jPanel4.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 60, 480, 140);

        jPanel5.setBackground(resourceMap.getColor("jPanel5.background")); // NOI18N
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel5.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel5.border.titleFont"))); // NOI18N
        jPanel5.setName("jPanel5"); // NOI18N
        jPanel5.setLayout(new java.awt.BorderLayout());

        cbFormaPag.setEditable(true);
        cbFormaPag.setFont(resourceMap.getFont("cbFormaPag.font")); // NOI18N
        cbFormaPag.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dinheiro", "Cartão", "Cheque", "Boleto" }));
        cbFormaPag.setName("cbFormaPag"); // NOI18N
        jPanel5.add(cbFormaPag, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(490, 60, 220, 70);

        jPanel6.setBackground(resourceMap.getColor("jPanel6.background")); // NOI18N
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel6.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel6.border.titleFont"))); // NOI18N
        jPanel6.setName("jPanel6"); // NOI18N
        jPanel6.setLayout(null);

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel6.add(jLabel2);
        jLabel2.setBounds(20, 40, 50, 15);

        jLabel5.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel6.add(jLabel5);
        jLabel5.setBounds(20, 70, 60, 15);

        jLabel6.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel6.add(jLabel6);
        jLabel6.setBounds(20, 100, 60, 15);

        tfMes.setText(resourceMap.getString("tfMes.text")); // NOI18N
        tfMes.setName("tfMes"); // NOI18N
        jPanel6.add(tfMes);
        tfMes.setBounds(70, 60, 60, 30);

        tfDia.setText(resourceMap.getString("tfDia.text")); // NOI18N
        tfDia.setName("tfDia"); // NOI18N
        jPanel6.add(tfDia);
        tfDia.setBounds(70, 90, 60, 30);

        tfAno.setText(resourceMap.getString("tfAno.text")); // NOI18N
        tfAno.setName("tfAno"); // NOI18N
        jPanel6.add(tfAno);
        tfAno.setBounds(70, 30, 60, 30);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(710, 60, 170, 140);

        jPanel7.setBackground(resourceMap.getColor("jPanel7.background")); // NOI18N
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel7.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel7.border.titleFont"))); // NOI18N
        jPanel7.setName("jPanel7"); // NOI18N
        jPanel7.setLayout(new java.awt.BorderLayout());

        tfTotal.setEditable(false);
        tfTotal.setText(resourceMap.getString("tfTotal.text")); // NOI18N
        tfTotal.setName("tfTotal"); // NOI18N
        jPanel7.add(tfTotal, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7);
        jPanel7.setBounds(490, 130, 220, 70);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-905)/2, (screenSize.height-666)/2, 905, 666);
    }// </editor-fold>//GEN-END:initComponents

private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
    controleOrcamento.cadastrarOrcamento(true,cbFormaPag.getSelectedItem().toString(), tfOBS.getText(), toGarantia());
}//GEN-LAST:event_btSalvarActionPerformed

private void tfQuantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuantActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tfQuantActionPerformed

private void tfProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfProdutoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tfProdutoActionPerformed

private void tfUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUnidadeActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tfUnidadeActionPerformed

private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
    float quant = 0;
    float valor = 0;
    try {
        quant = Float.parseFloat(tfQuant.getText());
        valor = Float.parseFloat(tfUnidade.getText());
        controleOrcamento.AddItens(tfProduto.getText(), valor, quant);
        this.Limpar();
        this.preecherJTable();

    } catch (NullPointerException erro) {
        JOptionPane.showMessageDialog(null, "Numero invalido. Por favor, corrija." + erro, "Atenção", 0);
    }
}//GEN-LAST:event_btAdicionarActionPerformed

private void tbOrçamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbOrçamentoMouseClicked
    int linha = tbOrçamento.getSelectedRow();
    codigo = (Integer) tbOrçamento.getValueAt(linha, 0);
}//GEN-LAST:event_tbOrçamentoMouseClicked

private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
    controleOrcamento.removerItens(codigo);
    preecherJTable();
}//GEN-LAST:event_btRemoverActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    btVoltar.setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_jButton1ActionPerformed

private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
    Limpar();
    controleOrcamento.limpar();
    preecherJTable();
}//GEN-LAST:event_btNovoActionPerformed

private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
    controleOrcamento.cadastrarOrcamento(false,cbFormaPag.getSelectedItem().toString(), tfOBS.getText(), toGarantia());
}//GEN-LAST:event_btCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbFormaPag;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tbOrçamento;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfDia;
    private javax.swing.JTextField tfMes;
    private javax.swing.JTextArea tfOBS;
    private javax.swing.JTextField tfProduto;
    private javax.swing.JTextField tfQuant;
    private javax.swing.JTextField tfTotal;
    private javax.swing.JTextField tfUnidade;
    // End of variables declaration//GEN-END:variables

    private void preecherJTable() {

        tbOrçamento.getColumnModel().getColumn(0).setPreferredWidth(15);
        tbOrçamento.getColumnModel().getColumn(1).setPreferredWidth(200);
        tbOrçamento.getColumnModel().getColumn(2).setPreferredWidth(50);
        tbOrçamento.getColumnModel().getColumn(3).setPreferredWidth(25);
        tbOrçamento.getColumnModel().getColumn(4).setPreferredWidth(90);

        DefaultTableModel modelo = (DefaultTableModel) tbOrçamento.getModel();
        modelo.setNumRows(0);
        int cont = 1;
        try {
            List<Itens> itens = controleOrcamento.getItens();
            for (Itens i : itens) {
                modelo.addRow(new Object[]{
                            cont,
                            i.getNome(),
                            i.getQuant(),
                            i.getValor(),
                            (i.getQuant() * i.getValor())
                        });
                ++cont;
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Não conseguiu carregar a tabela de clientes." + erro);
        }
        tfTotal.setText(""+controleOrcamento.getValorTotal());
    }

    private void Limpar() {
        tfProduto.setText("");
        tfQuant.setText("");
        tfUnidade.setText("");
    }
    private String toGarantia(){
        int ano =0 , mes =0, dia = 0;
        try{
            ano = Integer.parseInt(tfAno.getText());    
            if(ano < 0){
                throw  new Exception();
            }
        }catch(Exception erro){
             JOptionPane.showMessageDialog(null, "Ano invalido. Por favor, corrija.","Atenção",0);
        }
        try{
           mes = Integer.parseInt(tfMes.getText());     
           if(mes < 0){
                throw  new Exception();
            }
        }catch(Exception erro){
             JOptionPane.showMessageDialog(null, "Mês invalido. Por favor, corrija.","Atenção",0);
        }
        try{
            dia = Integer.parseInt(tfDia.getText()); 
            if(dia < 0){
                throw  new Exception();
            }
        }catch(Exception erro){
             JOptionPane.showMessageDialog(null, "Dia invalido. Por favor, corrija.","Atenção",0);
        }        
        
        return ano+" (Ano) "+ mes +" (Mês) " + dia + " (Dia).";
    }
}
