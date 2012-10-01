/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJDialog.java
 *
 * Created on 11/06/2012, 06:39:25
 */
package GUI;

import Controler.ControleMaquina;
import Controler.ControleServico;
import Entidade.Maquina;
import Entidade.Servico;
import GUI.Atualizar.AlterarDadosServicos;
import GUI.Atualizar.AlterarEstadoSevico;
import GUI.Atualizar.AtualizarMaquina;
import Util.Config;
import Util.impressao.Impressao;
import gerenciadorclientes.GerenciadorClientesApp;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brunno
 */
public class PesquisaMaquina extends javax.swing.JDialog {

    private JDialog cadastroServico;
    private JDialog alterarMaquina;
    private JDialog alterarEstadoServicos;
    private JDialog alterarServico;
    private Long codigo;
    private ControleMaquina controleMaquina;
    private Maquina maquina;
    private Long codigoServico;
    private Servico servico;
    private ControleServico controleServico;
    private JDialog btVoltar;
    private int tab = 1;
    private int tabServico = 1;

    public PesquisaMaquina(java.awt.Frame parent, JDialog btVoltar) {
        super(parent);
        this.btVoltar = btVoltar;
        initComponents();
        controleMaquina = new ControleMaquina();
        controleServico = new ControleServico();
        preencherJTable();
        PanelServicos.setVisible(false);
        PanelCodigo.setVisible(false);
        PanelServicos.setVisible(false);
        this.jtMaquina.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET);
        this.jtServico.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        PanelServicos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtServico = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtMaquina = new javax.swing.JTable();
        PanelCodigo = new javax.swing.JPanel();
        tfCodigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menuAlterarMaquina = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuAlteraServico = new javax.swing.JMenuItem();
        menuEstado = new javax.swing.JMenuItem();
        btExcluirServico = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(gerenciadorclientes.GerenciadorClientesApp.class).getContext().getResourceMap(PesquisaMaquina.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setFocusable(false);
        setName("Form"); // NOI18N

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setFocusable(false);
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jPanel2.setBackground(resourceMap.getColor("jPanel2.background")); // NOI18N
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel2.border.titleFont"))); // NOI18N
        jPanel2.setFocusable(false);
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(null);

        PanelServicos.setBackground(resourceMap.getColor("PanelServicos.background")); // NOI18N
        PanelServicos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("PanelServicos.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("PanelServicos.border.titleFont"))); // NOI18N
        PanelServicos.setName("PanelServicos"); // NOI18N
        PanelServicos.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jtServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Responsável", "Problema", "Observações", "Estado da Máquina", "Data", "Data da entrega"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtServico.setName("jtServico"); // NOI18N
        jtServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtServicoMouseClicked(evt);
            }
        });
        jtServico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtServicoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtServico);

        PanelServicos.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.add(PanelServicos);
        PanelServicos.setBounds(20, 300, 870, 240);

        jPanel4.setBackground(resourceMap.getColor("jPanel4.background")); // NOI18N
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel4.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel4.border.titleFont"))); // NOI18N
        jPanel4.setName("jPanel4"); // NOI18N
        jPanel4.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jtMaquina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Marca", "Modelo", "Numero de Série"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtMaquina.setName("jtMaquina"); // NOI18N
        jtMaquina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMaquinaMouseClicked(evt);
            }
        });
        jtMaquina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtMaquinaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jtMaquina);

        jPanel4.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(20, 20, 870, 180);

        PanelCodigo.setBackground(resourceMap.getColor("PanelCodigo.background")); // NOI18N
        PanelCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("PanelCodigo.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("PanelCodigo.border.titleFont"))); // NOI18N
        PanelCodigo.setName("PanelCodigo"); // NOI18N
        PanelCodigo.setLayout(new java.awt.BorderLayout());

        tfCodigo.setText(resourceMap.getString("tfCodigo.text")); // NOI18N
        tfCodigo.setName("tfCodigo"); // NOI18N
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });
        PanelCodigo.add(tfCodigo, java.awt.BorderLayout.CENTER);

        jPanel2.add(PanelCodigo);
        PanelCodigo.setBounds(340, 220, 220, 60);

        jButton1.setFont(resourceMap.getFont("jButton1.font")); // NOI18N
        jButton1.setIcon(resourceMap.getIcon("jButton1.icon")); // NOI18N
        jButton1.setMnemonic('v');
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setToolTipText(resourceMap.getString("jButton1.toolTipText")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(770, 230, 110, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 910, 550);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setName("jMenuBar1"); // NOI18N

        jMenu2.setText(resourceMap.getString("jMenu2.text")); // NOI18N
        jMenu2.setName("jMenu2"); // NOI18N
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        menuAlterarMaquina.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        menuAlterarMaquina.setText(resourceMap.getString("menuAlterarMaquina.text")); // NOI18N
        menuAlterarMaquina.setName("menuAlterarMaquina"); // NOI18N
        menuAlterarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarMaquinaActionPerformed(evt);
            }
        });
        jMenu2.add(menuAlterarMaquina);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem6.setText(resourceMap.getString("jMenuItem6.text")); // NOI18N
        jMenuItem6.setName("jMenuItem6"); // NOI18N
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu1.setText(resourceMap.getString("jMenu1.text")); // NOI18N
        jMenu1.setName("jMenu1"); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(resourceMap.getIcon("jMenuItem1.icon")); // NOI18N
        jMenuItem1.setText(resourceMap.getString("jMenuItem1.text")); // NOI18N
        jMenuItem1.setName("jMenuItem1"); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menuAlteraServico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuAlteraServico.setIcon(resourceMap.getIcon("menuAlteraServico.icon")); // NOI18N
        menuAlteraServico.setText(resourceMap.getString("menuAlteraServico.text")); // NOI18N
        menuAlteraServico.setName("menuAlteraServico"); // NOI18N
        menuAlteraServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlteraServicoActionPerformed(evt);
            }
        });
        jMenu1.add(menuAlteraServico);

        menuEstado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuEstado.setIcon(resourceMap.getIcon("menuEstado.icon")); // NOI18N
        menuEstado.setText(resourceMap.getString("menuEstado.text")); // NOI18N
        menuEstado.setName("menuEstado"); // NOI18N
        menuEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEstadoActionPerformed(evt);
            }
        });
        jMenu1.add(menuEstado);

        btExcluirServico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btExcluirServico.setIcon(resourceMap.getIcon("btExcluirServico.icon")); // NOI18N
        btExcluirServico.setText(resourceMap.getString("btExcluirServico.text")); // NOI18N
        btExcluirServico.setName("btExcluirServico"); // NOI18N
        btExcluirServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirServicoActionPerformed(evt);
            }
        });
        jMenu1.add(btExcluirServico);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(resourceMap.getIcon("jMenuItem4.icon")); // NOI18N
        jMenuItem4.setText(resourceMap.getString("jMenuItem4.text")); // NOI18N
        jMenuItem4.setName("jMenuItem4"); // NOI18N
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jSeparator1.setName("jSeparator1"); // NOI18N
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-946)/2, (screenSize.height-626)/2, 946, 626);
    }// </editor-fold>//GEN-END:initComponents

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    if (Config.getMaquina() != null) {
        if (cadastroServico == null) {
            JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
            cadastroServico = new CadastrarServico(mainFrame, this);
            cadastroServico.setLocationRelativeTo(mainFrame);
        }
        GerenciadorClientesApp.getApplication().show(cadastroServico);
        cadastroServico.setSize(929, 466);
        setVisible(false);
    } else {
        JOptionPane.showMessageDialog(null, "Selecione uma maquina", "Atenção", 0);
    }
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jtMaquinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMaquinaMouseClicked
    int linha = jtMaquina.getSelectedRow();
    codigo = (Long) jtMaquina.getValueAt(linha, 0);
    maquina = controleMaquina.FindMaquina(codigo);
    PanelServicos.setVisible(true);
    PanelCodigo.setVisible(true);
    PanelServicos.setVisible(true);
    Config.setMaquina(maquina);
    preencherJTableHistorico(1);
}//GEN-LAST:event_jtMaquinaMouseClicked

private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
    if (servico != null) {
        Impressao impressao = new Impressao();
        impressao.imprimir(servico);
    } else {
        JOptionPane.showMessageDialog(null, "Selecione um Serviço", "Atenção", 0);
    }
}//GEN-LAST:event_jMenu1ActionPerformed

private void jtServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtServicoMouseClicked
    int linha = jtServico.getSelectedRow();
    codigoServico = (Long) jtServico.getValueAt(linha, 0);
    servico = controleServico.FindServico(codigoServico);
}//GEN-LAST:event_jtServicoMouseClicked

private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    if (servico != null) {
        Impressao impressao = new Impressao();
        impressao.imprimir(servico);
    } else {
        JOptionPane.showMessageDialog(null, "Selecione um Serviço", "Atenção", 0);
    }
}//GEN-LAST:event_jMenuItem4ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    btVoltar.setVisible(true);
    setVisible(false);
}//GEN-LAST:event_jButton1ActionPerformed

private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
}//GEN-LAST:event_jMenu2ActionPerformed

private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    if (Config.getMaquina() != null) {
        int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esta maquina?", "Atenção", JOptionPane.YES_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            controleMaquina.excluirMaquina();
            this.preencherJTable();
            this.preencherJTableHistorico(1);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Selecione uma maquina", "Atenção", 0);
    }
}//GEN-LAST:event_jMenuItem6ActionPerformed

private void btExcluirServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirServicoActionPerformed
    if (servico != null) {
        int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este serviço?", "Atenção", JOptionPane.YES_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            controleServico.excluirServico(servico, maquina);
            this.preencherJTableHistorico(1);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Selecione um Serviço", "Atenção", 0);
    }
}//GEN-LAST:event_btExcluirServicoActionPerformed

private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
    this.preencherJTableHistorico(2);
}//GEN-LAST:event_tfCodigoActionPerformed

private void menuAlteraServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlteraServicoActionPerformed
    try {
        if (servico != null) {
            JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
            alterarServico = new AlterarDadosServicos(mainFrame, this);
            GerenciadorClientesApp.getApplication().show(alterarServico);
            alterarServico.setSize(929, 466);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Serviço.", "Atenção", 0);
        }
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(null, "Selecione um Serviço." + erro, "Atenção", 0);
    }
}//GEN-LAST:event_menuAlteraServicoActionPerformed

private void menuAlterarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarMaquinaActionPerformed
    try {
        if (maquina != null) {
            JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
            alterarMaquina = new AtualizarMaquina(mainFrame, this);
            GerenciadorClientesApp.getApplication().show(alterarMaquina);
            alterarMaquina.setSize(409, 541);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma Máquina.", "Atenção", 0);
        }
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(null, "Selecione um cliente.", "Atenção", 0);
    }
}//GEN-LAST:event_menuAlterarMaquinaActionPerformed

private void menuEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEstadoActionPerformed
    try {
        if (servico != null) {
            JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
            alterarEstadoServicos = new AlterarEstadoSevico(mainFrame, this, servico);
            GerenciadorClientesApp.getApplication().show(alterarEstadoServicos);
            alterarEstadoServicos.setSize(226, 337);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma Máquina.", "Atenção", 0);
        }
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(null, "Selecione um cliente.", "Atenção", 0);
    }
}//GEN-LAST:event_menuEstadoActionPerformed

private void jtMaquinaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMaquinaKeyPressed
    try {
        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            jtMaquinaMouseClicked(null);
        }
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            if (tab % 2 == 0) {
                jtMaquina.transferFocus();
            }
            tab++;
        }
    } catch (Exception erro) {
    }
}//GEN-LAST:event_jtMaquinaKeyPressed

private void jtServicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtServicoKeyPressed
    try {
        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            jtServicoMouseClicked(null);
        }
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            if (tabServico % 2 == 0) {
                jtServico.transferFocus();
            }
            tabServico++;
        }
    } catch (Exception erro) {
    }
}//GEN-LAST:event_jtServicoKeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCodigo;
    private javax.swing.JPanel PanelServicos;
    private javax.swing.JMenuItem btExcluirServico;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jtMaquina;
    private javax.swing.JTable jtServico;
    private javax.swing.JMenuItem menuAlteraServico;
    private javax.swing.JMenuItem menuAlterarMaquina;
    private javax.swing.JMenuItem menuEstado;
    private javax.swing.JTextField tfCodigo;
    // End of variables declaration//GEN-END:variables

    private void preencherJTable() {

        jtMaquina.getColumnModel().getColumn(0).setPreferredWidth(15);
        jtMaquina.getColumnModel().getColumn(1).setPreferredWidth(200);
        jtMaquina.getColumnModel().getColumn(2).setPreferredWidth(50);

        DefaultTableModel modelo = (DefaultTableModel) jtMaquina.getModel();
        modelo.setNumRows(0);


        try {
            for (Maquina m : Config.getCliente().getMaquinas()) {
                modelo.addRow(new Object[]{
                            m.getId(),
                            m.getModelo(),
                            m.getFabricante(),
                            m.getNumero()
                        });
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Não conseguiu carregar a Tabela de maquinas." + erro);
        }
    }

    private void preencherJTableHistorico(int cond) {

        jtServico.getColumnModel().getColumn(0).setPreferredWidth(15);
        jtServico.getColumnModel().getColumn(1).setPreferredWidth(120);
        jtServico.getColumnModel().getColumn(2).setPreferredWidth(100);
        jtServico.getColumnModel().getColumn(3).setPreferredWidth(100);
        jtServico.getColumnModel().getColumn(4).setPreferredWidth(100);
        jtServico.getColumnModel().getColumn(5).setPreferredWidth(15);
        jtServico.getColumnModel().getColumn(6).setPreferredWidth(150);

        DefaultTableModel modelo = (DefaultTableModel) jtServico.getModel();
        modelo.setNumRows(0);
        List<Servico> servicos = new ArrayList<Servico>();
        if (cond == 1) {
            servicos = maquina.getServicos();
        } else if (cond == 2) {
            List<Servico> servicosAux = new ArrayList<Servico>();
            for (Servico s : maquina.getServicos()) {
                if (s.getId().toString().equalsIgnoreCase(tfCodigo.getText())) {
                    servicosAux.add(s);
                }
            }
            servicos = servicosAux;
        }
        try {
            for (Servico s : servicos) {
                modelo.addRow(new Object[]{
                            s.getId(),
                            s.getResponsavel(),
                            s.getDes(),
                            s.getObs(),
                            s.getEstado(),
                            DateFormat.getDateInstance(DateFormat.SHORT).format(s.getData_servico().getTime()),
                            DateFormat.getDateInstance(DateFormat.SHORT).format(s.getData_entraga_servico().getTime())
                        });
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Não conseguiu carregar a Tabela de maquinas." + erro);
        }
    }
}
