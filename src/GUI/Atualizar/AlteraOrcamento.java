/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Garantia.java
 *
 * Created on 28/09/2012, 20:46:22
 */
package GUI.Atualizar;

import Controler.ControleOrcamento;
import Entidade.Itens;
import Entidade.Orcamento;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brunno
 */
public class AlteraOrcamento extends javax.swing.JDialog {

    private ControleOrcamento controleOrcamento;
    private int codigo;
    private JDialog tela;
    private Orcamento orcamento;

    public AlteraOrcamento(java.awt.Frame parent, JDialog btVoltar, Orcamento orcamento) {
        super(parent);
        this.tela = btVoltar;
        this.orcamento = orcamento;
        controleOrcamento = new ControleOrcamento();
        initComponents();
        mostrarDados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btAtualizar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btImprimir = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfOBS = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        cbFormaPagamento = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfAno = new javax.swing.JTextField();
        tfMes = new javax.swing.JTextField();
        tfDia = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfQuantidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        btAdicionar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        tfTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(gerenciadorclientes.GerenciadorClientesApp.class).getContext().getResourceMap(AlteraOrcamento.class);
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

        btLimpar.setFont(resourceMap.getFont("btAtualizar.font")); // NOI18N
        btLimpar.setIcon(resourceMap.getIcon("btLimpar.icon")); // NOI18N
        btLimpar.setMnemonic('l');
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

        btRemover.setFont(resourceMap.getFont("btAtualizar.font")); // NOI18N
        btRemover.setIcon(resourceMap.getIcon("btRemover.icon")); // NOI18N
        btRemover.setMnemonic('r');
        btRemover.setText(resourceMap.getString("btRemover.text")); // NOI18N
        btRemover.setToolTipText(resourceMap.getString("btRemover.toolTipText")); // NOI18N
        btRemover.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btRemover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btRemover.setName("btRemover"); // NOI18N
        btRemover.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });
        jToolBar1.add(btRemover);

        btImprimir.setFont(resourceMap.getFont("btImprimir.font")); // NOI18N
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

        btVoltar.setFont(resourceMap.getFont("btAtualizar.font")); // NOI18N
        btVoltar.setIcon(resourceMap.getIcon("btVoltar.icon")); // NOI18N
        btVoltar.setMnemonic('v');
        btVoltar.setText(resourceMap.getString("btVoltar.text")); // NOI18N
        btVoltar.setToolTipText(resourceMap.getString("btVoltar.toolTipText")); // NOI18N
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
        jToolBar1.setBounds(10, 10, 870, 60);

        jPanel2.setBackground(resourceMap.getColor("jPanel2.background")); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(null);

        jPanel3.setBackground(resourceMap.getColor("jPanel3.background")); // NOI18N
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel3.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel3.border.titleFont"))); // NOI18N
        jPanel3.setName("jPanel3"); // NOI18N
        jPanel3.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        tfOBS.setColumns(20);
        tfOBS.setRows(5);
        tfOBS.setName("tfOBS"); // NOI18N
        jScrollPane1.setViewportView(tfOBS);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(10, 10, 500, 140);

        jPanel4.setBackground(resourceMap.getColor("jPanel4.background")); // NOI18N
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel4.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel4.border.titleFont"))); // NOI18N
        jPanel4.setName("jPanel4"); // NOI18N
        jPanel4.setLayout(new java.awt.BorderLayout());

        cbFormaPagamento.setEditable(true);
        cbFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dinheiro", "Cartão", "Cheque", "Boleto" }));
        cbFormaPagamento.setName("cbFormaPagamento"); // NOI18N
        jPanel4.add(cbFormaPagamento, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(510, 10, 220, 70);

        jPanel5.setBackground(resourceMap.getColor("jPanel5.background")); // NOI18N
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel5.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel5.border.titleFont"))); // NOI18N
        jPanel5.setName("jPanel5"); // NOI18N
        jPanel5.setLayout(null);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel5.add(jLabel1);
        jLabel1.setBounds(10, 29, 30, 15);

        jLabel2.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel5.add(jLabel2);
        jLabel2.setBounds(10, 70, 27, 15);

        jLabel3.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel5.add(jLabel3);
        jLabel3.setBounds(10, 110, 30, 15);

        tfAno.setText(resourceMap.getString("tfAno.text")); // NOI18N
        tfAno.setName("tfAno"); // NOI18N
        jPanel5.add(tfAno);
        tfAno.setBounds(50, 20, 60, 30);

        tfMes.setText(resourceMap.getString("tfMes.text")); // NOI18N
        tfMes.setName("tfMes"); // NOI18N
        jPanel5.add(tfMes);
        tfMes.setBounds(50, 60, 60, 30);

        tfDia.setText(resourceMap.getString("tfDia.text")); // NOI18N
        tfDia.setName("tfDia"); // NOI18N
        jPanel5.add(tfDia);
        tfDia.setBounds(50, 100, 59, 30);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(730, 10, 130, 140);

        jPanel6.setBackground(resourceMap.getColor("jPanel6.background")); // NOI18N
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel6.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel6.border.titleFont"))); // NOI18N
        jPanel6.setName("jPanel6"); // NOI18N
        jPanel6.setLayout(null);

        jLabel4.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel6.add(jLabel4);
        jLabel4.setBounds(10, 20, 33, 15);

        tfNome.setText(resourceMap.getString("tfNome.text")); // NOI18N
        tfNome.setName("tfNome"); // NOI18N
        jPanel6.add(tfNome);
        tfNome.setBounds(10, 40, 550, 30);

        jLabel5.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel6.add(jLabel5);
        jLabel5.setBounds(580, 20, 40, 15);

        tfQuantidade.setText(resourceMap.getString("tfQuantidade.text")); // NOI18N
        tfQuantidade.setName("tfQuantidade"); // NOI18N
        jPanel6.add(tfQuantidade);
        tfQuantidade.setBounds(580, 40, 60, 30);

        jLabel6.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel6.add(jLabel6);
        jLabel6.setBounds(650, 20, 100, 15);

        tfValor.setName("tfValor"); // NOI18N
        jPanel6.add(tfValor);
        tfValor.setBounds(650, 40, 140, 30);

        btAdicionar.setIcon(resourceMap.getIcon("btAdicionar.icon")); // NOI18N
        btAdicionar.setMnemonic('d');
        btAdicionar.setText(resourceMap.getString("btAdicionar.text")); // NOI18N
        btAdicionar.setName("btAdicionar"); // NOI18N
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });
        jPanel6.add(btAdicionar);
        btAdicionar.setBounds(800, 30, 40, 40);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(10, 150, 850, 90);

        jPanel7.setBackground(resourceMap.getColor("jPanel7.background")); // NOI18N
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel7.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel7.border.titleFont"))); // NOI18N
        jPanel7.setName("jPanel7"); // NOI18N
        jPanel7.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N°", "Produto", "Quantidade", "Valor p/ Unidade", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProdutos.setName("tbProdutos"); // NOI18N
        tbProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbProdutos);

        jPanel7.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);
        jPanel7.setBounds(10, 240, 850, 290);

        jPanel8.setBackground(resourceMap.getColor("jPanel8.background")); // NOI18N
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel8.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel8.border.titleFont"))); // NOI18N
        jPanel8.setName("jPanel8"); // NOI18N
        jPanel8.setLayout(new java.awt.BorderLayout());

        tfTotal.setName("tfTotal"); // NOI18N
        jPanel8.add(tfTotal, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);
        jPanel8.setBounds(510, 80, 220, 70);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 80, 870, 540);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-905)/2, (screenSize.height-666)/2, 905, 666);
    }// </editor-fold>//GEN-END:initComponents

private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
    tela.setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_btVoltarActionPerformed

private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
    controleOrcamento.removerItens(codigo);
    preecherJTable();
}//GEN-LAST:event_btRemoverActionPerformed

private void tbProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutosMouseClicked
    int linha = tbProdutos.getSelectedRow();
    codigo = (Integer) tbProdutos.getValueAt(linha, 0);
}//GEN-LAST:event_tbProdutosMouseClicked

private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
    Limpar();
    controleOrcamento.limpar();
    preecherJTable();
}//GEN-LAST:event_btLimparActionPerformed

private void btImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImprimirActionPerformed
    controleOrcamento.cadastrarOrcamento(false, cbFormaPagamento.getSelectedItem().toString(), tfOBS.getText(), toGarantia());
}//GEN-LAST:event_btImprimirActionPerformed

private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
    float quant = 0;
    float valor = 0;
    try {
        quant = Float.parseFloat(tfQuantidade.getText());
        valor = Float.parseFloat(tfValor.getText());
        controleOrcamento.AddItens(tfNome.getText(), valor, quant);
        this.Limpar();
        this.preecherJTable();

    } catch (NullPointerException erro) {
        JOptionPane.showMessageDialog(null, "Numero invalido. Por favor, corrija." + erro, "Atenção", 0);
    }
}//GEN-LAST:event_btAdicionarActionPerformed

private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
    controleOrcamento.alterarOrcamento(cbFormaPagamento.getSelectedItem().toString(), tfOBS.getText(), toGarantia(), orcamento);
}//GEN-LAST:event_btAtualizarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btImprimir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox cbFormaPagamento;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfDia;
    private javax.swing.JTextField tfMes;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextArea tfOBS;
    private javax.swing.JTextField tfQuantidade;
    private javax.swing.JTextField tfTotal;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables

    private void mostrarDados() {
        try {
            tfOBS.setText(orcamento.getObs());

            cbFormaPagamento.addItem("" + orcamento.getForma_pag());

            controleOrcamento.setValorTotal(orcamento.getValor());
            controleOrcamento.setItens(orcamento.getItens());

            verificarNumero();
            preecherJTable();

        } catch (Exception erro) {
        }
    }

    private void verificarNumero() {
        try {
            char[] garantia = orcamento.getGarantia().toCharArray();
            int cont = 0;
            String a = "";
            String b = "";
            String c = "";
            boolean ano = true;
            boolean mes = false;
            boolean dia = false;


            for (int i = 0; i < garantia.length; ++i) {
                try {
                    int teste = Integer.parseInt("" + garantia[i]);
                    if (ano) {
                        a += garantia[i];
                    } else if (mes) {
                        b += garantia[i];
                    } else if (dia) {
                        c += garantia[i];
                    }

                } catch (NumberFormatException erro) {
                    if (ano && a.length() > 0) {
                        ano = false;
                        mes = true;
                        ++cont;
                    } else if (mes && b.length() > 0) {
                        mes = false;
                        dia = true;
                    }

                }
            }

            tfAno.setText(a);
            tfMes.setText(b);
            tfDia.setText(c);
        } catch (Exception erro) {
        }
    }

    private void preecherJTable() {

        tbProdutos.getColumnModel().getColumn(0).setPreferredWidth(15);
        tbProdutos.getColumnModel().getColumn(1).setPreferredWidth(200);
        tbProdutos.getColumnModel().getColumn(2).setPreferredWidth(50);
        tbProdutos.getColumnModel().getColumn(3).setPreferredWidth(25);
        tbProdutos.getColumnModel().getColumn(4).setPreferredWidth(90);

        DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
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
        tfTotal.setText("" + controleOrcamento.getValorTotal());
    }

    private void Limpar() {
        tfNome.setText("");
        tfQuantidade.setText("");
        tfValor.setText("");
    }

    private String toGarantia() {
        int ano = 0, mes = 0, dia = 0;
        try {
            ano = Integer.parseInt(tfAno.getText());
            if (ano < 0) {
                throw new Exception();
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Ano invalido. Por favor, corrija.", "Atenção", 0);
        }
        try {
            mes = Integer.parseInt(tfMes.getText());
            if (mes < 0) {
                throw new Exception();
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Mês invalido. Por favor, corrija.", "Atenção", 0);
        }
        try {
            dia = Integer.parseInt(tfDia.getText());
            if (dia < 0) {
                throw new Exception();
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Dia invalido. Por favor, corrija.", "Atenção", 0);
        }

        return ano + " (Ano) " + mes + " (Mês) " + dia + " (Dia).";
    }
}
