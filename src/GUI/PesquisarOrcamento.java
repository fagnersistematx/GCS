/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Garantia.java
 *
 * Created on 28/09/2012, 21:56:24
 */
package GUI;

import Controler.ControleOrcamento;
import Entidade.Orcamento;
import GUI.Atualizar.AlteraOrcamento;
import Util.Config;
import gerenciadorclientes.GerenciadorClientesApp;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brunno
 */
public class PesquisarOrcamento extends javax.swing.JDialog {

    private List<Orcamento> orcamentos;
    private ControleOrcamento controleOrcamento;
    private Long codigo;
    private JDialog btVoltar;
    private Orcamento orcamento;
    private JDialog alterarOrcamento;
    private int tab = 1;

    public PesquisarOrcamento(java.awt.Frame parent, JDialog btVoltar) {
        super(parent);
        this.btVoltar = btVoltar;
        controleOrcamento = new ControleOrcamento();
        initComponents();
        preecherJTable();
        setTitle("Orçamento - Cliente: " + Config.getCliente().getNome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btAtualizar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btImprimir = new javax.swing.JButton();
        BTVoltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbOrcamento = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(gerenciadorclientes.GerenciadorClientesApp.class).getContext().getResourceMap(PesquisarOrcamento.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jToolBar1.setBackground(resourceMap.getColor("jToolBar1.background")); // NOI18N
        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1"); // NOI18N

        btAtualizar.setFont(resourceMap.getFont("btAtualizar.font")); // NOI18N
        btAtualizar.setIcon(resourceMap.getIcon("btAtualizar.icon")); // NOI18N
        btAtualizar.setMnemonic('a');
        btAtualizar.setText(resourceMap.getString("btAtualizar.text")); // NOI18N
        btAtualizar.setToolTipText(resourceMap.getString("btAtualizar.toolTipText")); // NOI18N
        btAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAtualizar.setName("btAtualizar"); // NOI18N
        btAtualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(btAtualizar);

        btExcluir.setFont(resourceMap.getFont("btAtualizar.font")); // NOI18N
        btExcluir.setIcon(resourceMap.getIcon("btExcluir.icon")); // NOI18N
        btExcluir.setMnemonic('e');
        btExcluir.setText(resourceMap.getString("btExcluir.text")); // NOI18N
        btExcluir.setToolTipText(resourceMap.getString("btExcluir.toolTipText")); // NOI18N
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir.setName("btExcluir"); // NOI18N
        btExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jToolBar1.add(btExcluir);

        btImprimir.setFont(resourceMap.getFont("btAtualizar.font")); // NOI18N
        btImprimir.setIcon(resourceMap.getIcon("btImprimir.icon")); // NOI18N
        btImprimir.setMnemonic('i');
        btImprimir.setText(resourceMap.getString("btImprimir.text")); // NOI18N
        btImprimir.setToolTipText(resourceMap.getString("btImprimir.toolTipText")); // NOI18N
        btImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btImprimir.setName("btImprimir"); // NOI18N
        btImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImprimirActionPerformed(evt);
            }
        });
        jToolBar1.add(btImprimir);

        BTVoltar.setFont(resourceMap.getFont("btAtualizar.font")); // NOI18N
        BTVoltar.setIcon(resourceMap.getIcon("BTVoltar.icon")); // NOI18N
        BTVoltar.setMnemonic('v');
        BTVoltar.setText(resourceMap.getString("BTVoltar.text")); // NOI18N
        BTVoltar.setToolTipText(resourceMap.getString("BTVoltar.toolTipText")); // NOI18N
        BTVoltar.setFocusable(false);
        BTVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTVoltar.setName("BTVoltar"); // NOI18N
        BTVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTVoltarActionPerformed(evt);
            }
        });
        jToolBar1.add(BTVoltar);

        jPanel1.add(jToolBar1);
        jToolBar1.setBounds(10, 10, 890, 60);

        jPanel2.setBackground(resourceMap.getColor("jPanel2.background")); // NOI18N
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel2.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel2.border.titleFont"))); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        tbOrcamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Garantia", "Forma de Pagamento", "Valor Total", "Data do Orçamento", "OBS."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbOrcamento.setName("tbOrcamento"); // NOI18N
        tbOrcamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbOrcamentoMouseClicked(evt);
            }
        });
        tbOrcamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbOrcamentoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbOrcamento);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 80, 890, 270);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-931)/2, (screenSize.height-393)/2, 931, 393);
    }// </editor-fold>//GEN-END:initComponents

private void BTVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTVoltarActionPerformed
    btVoltar.setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_BTVoltarActionPerformed

private void tbOrcamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbOrcamentoMouseClicked
    int linha = tbOrcamento.getSelectedRow();
    codigo = (Long) tbOrcamento.getValueAt(linha, 0);
    orcamento = controleOrcamento.findCliente(codigo);
    controleOrcamento.setItens(orcamento.getItens());
}//GEN-LAST:event_tbOrcamentoMouseClicked

private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
    try {
        if (orcamento != null) {
            int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este orçamento?", "Atenção", JOptionPane.YES_OPTION);
            if (op == JOptionPane.YES_OPTION) {
                controleOrcamento.deletarOrcamento(orcamento.getId());
                this.preecherJTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um orçamento.", "Atenção", 0);
        }
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(null, "Orçamento não pode ser excluído.", "Atenção", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_btExcluirActionPerformed

private void btImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImprimirActionPerformed
    controleOrcamento.cadastrarOrcamento(false, orcamento.getForma_pag(), orcamento.getObs(), orcamento.getGarantia());
}//GEN-LAST:event_btImprimirActionPerformed

private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
    try {
        if (orcamento != null) {

            JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
            alterarOrcamento = new AlteraOrcamento(mainFrame, this, orcamento);

            GerenciadorClientesApp.getApplication().show(alterarOrcamento);
            alterarOrcamento.setSize(905, 665);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um orçamento.", "Atenção", 0);
        }
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(null, "Selecione um orçamento.", "Atenção", 0);
    }
}//GEN-LAST:event_btAtualizarActionPerformed

private void tbOrcamentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbOrcamentoKeyPressed
    try {
        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            tbOrcamentoMouseClicked(null);
        }
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            if (tab % 2 == 0) {
                tbOrcamento.transferFocus();
            }
            tab++;
        }
    } catch (Exception erro) {
    }
}//GEN-LAST:event_tbOrcamentoKeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTVoltar;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btImprimir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tbOrcamento;
    // End of variables declaration//GEN-END:variables

    private void preecherJTable() {

        tbOrcamento.getColumnModel().getColumn(0).setPreferredWidth(15);
        tbOrcamento.getColumnModel().getColumn(1).setPreferredWidth(200);
        tbOrcamento.getColumnModel().getColumn(2).setPreferredWidth(50);
        tbOrcamento.getColumnModel().getColumn(3).setPreferredWidth(25);
        tbOrcamento.getColumnModel().getColumn(4).setPreferredWidth(90);

        DefaultTableModel modelo = (DefaultTableModel) tbOrcamento.getModel();
        modelo.setNumRows(0);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm");

        orcamentos = new ArrayList<Orcamento>();
        orcamentos = controleOrcamento.orcamentos();
        int quant = 0;
        try {

            for (Orcamento o : orcamentos) {
                quant++;
                modelo.addRow(new Object[]{
                            o.getId(),
                            o.getGarantia(),
                            o.getForma_pag(),
                            o.getValor(),
                            sdf.format(o.getDia_orcamento().getTime()),
                            o.getObs()
                        });
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Não conseguiu carregar a tabela de clientes." + erro);
        }
    }
}
