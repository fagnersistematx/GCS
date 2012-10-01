/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Pesquisa.java
 *
 * Created on 11/06/2012, 22:01:56
 */
package GUI;

import Controler.ControleCliente;
import Entidade.Cliente;
import GUI.Atualizar.AtualizarClienteJuridico;
import GUI.Atualizar.AtualizarClienteFisico;
import Util.Config;
import gerenciadorclientes.GerenciadorClientesApp;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
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
public class Pesquisa extends javax.swing.JDialog {

    private JDialog CadastrarMaquina;
    private JDialog pesquisarMaquina;
    private JDialog cadastroOrcamento;
    private JDialog pesquisarOrcamento;
    private JDialog atualizarDadosCliente;
    private JDialog atualizarDadosClienteJuridico;
    private List<Cliente> clientes;
    private ControleCliente controleCliente;
    private Long codigo;
    private int exeQuant = 0;
    private DefaultTableModel modelo;
    private int tab = 1;

    public Pesquisa(java.awt.Frame parent) {
        super(parent);
        this.controleCliente = new ControleCliente();
        initComponents();
        this.setLocationRelativeTo(null);
        this.preecherJTableCliente(1);
        this.jtCliente.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tfNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCliente = new javax.swing.JTable();
        pesquisarCpf = new javax.swing.JFormattedTextField();
        lbQuantCliente = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        MenuAtualizarDadosCliente = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        jPanel3.setName("jPanel3"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(gerenciadorclientes.GerenciadorClientesApp.class).getContext().getResourceMap(Pesquisa.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(resourceMap.getColor("jPanel2.background")); // NOI18N
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel2.border.titleFont"))); // NOI18N
        jPanel2.setFocusable(false);
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(null);

        tfNome.setText(resourceMap.getString("tfNome.text")); // NOI18N
        tfNome.setName("tfNome"); // NOI18N
        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNomeKeyPressed(evt);
            }
        });
        jPanel2.add(tfNome);
        tfNome.setBounds(10, 30, 400, 30);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 10, 33, 20);

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(430, 10, 22, 20);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jtCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "CPF/CNPJ", "E-Mail", "Telefone Fixo", "Celular 1", "Celular 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtCliente.setName("jtCliente"); // NOI18N
        jtCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClienteMouseClicked(evt);
            }
        });
        jtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtClienteKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtCliente);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 870, 280);

        try {
            pesquisarCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pesquisarCpf.setName("pesquisarCpf"); // NOI18N
        pesquisarCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pesquisarCpfKeyPressed(evt);
            }
        });
        jPanel2.add(pesquisarCpf);
        pesquisarCpf.setBounds(430, 30, 150, 30);

        lbQuantCliente.setFont(resourceMap.getFont("lbQuantCliente.font")); // NOI18N
        lbQuantCliente.setText(resourceMap.getString("lbQuantCliente.text")); // NOI18N
        lbQuantCliente.setFocusable(false);
        lbQuantCliente.setName("lbQuantCliente"); // NOI18N
        jPanel2.add(lbQuantCliente);
        lbQuantCliente.setBounds(600, 34, 270, 20);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setName("jMenuBar1"); // NOI18N

        jMenu2.setText(resourceMap.getString("jMenu2.text")); // NOI18N
        jMenu2.setName("jMenu2"); // NOI18N

        MenuAtualizarDadosCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        MenuAtualizarDadosCliente.setText(resourceMap.getString("MenuAtualizarDadosCliente.text")); // NOI18N
        MenuAtualizarDadosCliente.setName("MenuAtualizarDadosCliente"); // NOI18N
        MenuAtualizarDadosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAtualizarDadosClienteActionPerformed(evt);
            }
        });
        jMenu2.add(MenuAtualizarDadosCliente);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
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

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText(resourceMap.getString("jMenuItem4.text")); // NOI18N
        jMenuItem4.setName("jMenuItem4"); // NOI18N
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText(resourceMap.getString("jMenuItem1.text")); // NOI18N
        jMenuItem1.setName("jMenuItem1"); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu3.setText(resourceMap.getString("jMenu3.text")); // NOI18N
        jMenu3.setName("jMenu3"); // NOI18N

        jMenuItem7.setText(resourceMap.getString("jMenuItem7.text")); // NOI18N
        jMenuItem7.setName("jMenuItem7"); // NOI18N
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText(resourceMap.getString("jMenuItem8.text")); // NOI18N
        jMenuItem8.setName("jMenuItem8"); // NOI18N
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-914)/2, (screenSize.height-431)/2, 914, 431);
    }// </editor-fold>//GEN-END:initComponents

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    try {
        if (Config.getCliente() != null) {
            JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
            CadastrarMaquina = new CadastroMaquina(mainFrame, this);
            GerenciadorClientesApp.getApplication().show(CadastrarMaquina);
            CadastrarMaquina.setSize(409, 541);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente.", "Atenção", 0);
        }
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(null, "Selecione um cliente.", "Atenção", 0);
    }
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    try {
        if (Config.getCliente() != null) {
            JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
            pesquisarMaquina = new PesquisaMaquina(mainFrame, this);

            GerenciadorClientesApp.getApplication().show(pesquisarMaquina);
            pesquisarMaquina.setSize(949, 626);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente.", "Atenção", 0);
        }
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(null, "Selecione um cliente.", "Atenção", 0);
    }

}//GEN-LAST:event_jMenuItem4ActionPerformed

private void jtClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClienteMouseClicked
    int linha = jtCliente.getSelectedRow();
    codigo = (Long) jtCliente.getValueAt(linha, 0);
    controleCliente.findCliente(codigo);
    this.setTitle("Pesquisa Cliente - " + Config.getCliente().getNome());
}//GEN-LAST:event_jtClienteMouseClicked

private void jtClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtClienteKeyPressed
    try {
        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            jtClienteMouseClicked(null);
        }
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
           if(tab % 2 == 0){
               jtCliente.transferFocus();
           }
           tab++;
        }
    } catch (Exception erro) {
    }
}//GEN-LAST:event_jtClienteKeyPressed

private void tfNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyPressed
    this.preecherJTableCliente(1);
}//GEN-LAST:event_tfNomeKeyPressed

private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
    try {
        if (Config.getCliente() != null) {
            if (cadastroOrcamento == null) {
                JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
                cadastroOrcamento = new cadastroorcamento(mainFrame, this);
            }
            GerenciadorClientesApp.getApplication().show(cadastroOrcamento);
            cadastroOrcamento.setSize(905, 665);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente.", "Atenção", 0);
        }
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(null, "Selecione um cliente.", "Atenção", 0);
    }

}//GEN-LAST:event_jMenuItem7ActionPerformed

private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    try {
        if (Config.getCliente() != null) {
            int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este cliente?", "Atenção", JOptionPane.YES_OPTION);
            if (op == JOptionPane.YES_OPTION) {
                controleCliente.excluirCliente();
                this.preecherJTableCliente(1);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente.", "Atenção", 0);
        }
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(null, "Cliente não pode ser excluído.", "Atenção", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_jMenuItem6ActionPerformed

private void MenuAtualizarDadosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAtualizarDadosClienteActionPerformed
    try {
        if (Config.getCliente() != null) {

            if (!Config.getCliente().isTipo()) {
                JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
                atualizarDadosCliente = new AtualizarClienteFisico(mainFrame, this);
                GerenciadorClientesApp.getApplication().show(atualizarDadosCliente);
                atualizarDadosCliente.setSize(845, 641);
                setVisible(false);
            } else {
                JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
                atualizarDadosClienteJuridico = new AtualizarClienteJuridico(mainFrame, this);
                GerenciadorClientesApp.getApplication().show(atualizarDadosClienteJuridico);
                atualizarDadosClienteJuridico.setSize(845, 641);
                setVisible(false);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente.", "Atenção", 0);
        }
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(null, "Selecione um cliente.", "Atenção", 0);
    }
}//GEN-LAST:event_MenuAtualizarDadosClienteActionPerformed

private void pesquisarCpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisarCpfKeyPressed
    this.preecherJTableCliente(2);
}//GEN-LAST:event_pesquisarCpfKeyPressed

private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
    try {
        if (Config.getCliente() != null) {
            JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
            pesquisarOrcamento = new PesquisarOrcamento(mainFrame, this);

            GerenciadorClientesApp.getApplication().show(pesquisarOrcamento);
            pesquisarOrcamento.setSize(931, 393);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente.", "Atenção", 0);
        }
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(null, "Selecione um cliente.", "Atenção", 0);
    }
}//GEN-LAST:event_jMenuItem8ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAtualizarDadosCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtCliente;
    private javax.swing.JLabel lbQuantCliente;
    private javax.swing.JFormattedTextField pesquisarCpf;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables

    private void preecherJTableCliente(int op) {

        jtCliente.getColumnModel().getColumn(0).setPreferredWidth(15);
        jtCliente.getColumnModel().getColumn(1).setPreferredWidth(200);
        jtCliente.getColumnModel().getColumn(2).setPreferredWidth(50);
        jtCliente.getColumnModel().getColumn(3).setPreferredWidth(25);
        jtCliente.getColumnModel().getColumn(4).setPreferredWidth(90);

        modelo = (DefaultTableModel) jtCliente.getModel();
        modelo.setNumRows(0);

        clientes = new ArrayList<Cliente>();
        int quant = 0;
        try {
            if (op == 1) {
                clientes = controleCliente.pesquisar(tfNome.getText());
            } else if (op == 2) {
                clientes = controleCliente.pesquisarCPF(pesquisarCpf.getText());
            }
            for (Cliente c : clientes) {
                quant++;
                modelo.addRow(new Object[]{
                            c.getId(),
                            c.getNome(),
                            c.getCpf_cnpj(),
                            c.getEmail(),
                            c.getTel_fixo(),
                            c.getCel1(),
                            c.getCel2()
                        });
            }
            if (exeQuant == 0) {
                lbQuantCliente.setText("Quantidade de Clientes: " + quant);
                exeQuant++;
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Não conseguiu carregar a tabela de clientes." + erro);
        }
    }
}
