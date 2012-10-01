/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PesquisarUsuario.java
 *
 * Created on 19/08/2012, 22:40:58
 */
package GUI;

import Controler.ControleUsuario;
import Entidade.Usuario;
import GUI.Atualizar.AtualizarUsuario;
import Util.Config;
import gerenciadorclientes.GerenciadorClientesApp;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fagner
 */
public class PesquisarUsuario extends javax.swing.JDialog {

    private ControleUsuario controleUsuario;
    private Long codigo;
    private JDialog atualizarUsuario;
    private int tab =1;

    public PesquisarUsuario(java.awt.Frame parent) {
        super(parent);
        controleUsuario = new ControleUsuario();
        initComponents();
        this.preencherJTable(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUsuario = new javax.swing.JTable();
        tfNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbQuantUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuAtualizarUsuario = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(gerenciadorclientes.GerenciadorClientesApp.class).getContext().getResourceMap(PesquisarUsuario.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jtUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Tipo", "Tel. Fixo", "Celular", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtUsuario.setName("jtUsuario"); // NOI18N
        jtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtUsuarioMouseClicked(evt);
            }
        });
        jtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtUsuarioKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtUsuario);

        tfNome.setName("tfNome"); // NOI18N
        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNomeKeyPressed(evt);
            }
        });

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        lbQuantUsuario.setFont(resourceMap.getFont("lbQuantUsuario.font")); // NOI18N
        lbQuantUsuario.setText(resourceMap.getString("lbQuantUsuario.text")); // NOI18N
        lbQuantUsuario.setName("lbQuantUsuario"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(lbQuantUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbQuantUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setName("jMenuBar1"); // NOI18N

        jMenu1.setText(resourceMap.getString("jMenu1.text")); // NOI18N
        jMenu1.setName("jMenu1"); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        MenuAtualizarUsuario.setIcon(resourceMap.getIcon("MenuAtualizarUsuario.icon")); // NOI18N
        MenuAtualizarUsuario.setText(resourceMap.getString("MenuAtualizarUsuario.text")); // NOI18N
        MenuAtualizarUsuario.setName("MenuAtualizarUsuario"); // NOI18N
        MenuAtualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAtualizarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(MenuAtualizarUsuario);

        jMenuItem2.setIcon(resourceMap.getIcon("jMenuItem2.icon")); // NOI18N
        jMenuItem2.setText(resourceMap.getString("jMenuItem2.text")); // NOI18N
        jMenuItem2.setName("jMenuItem2"); // NOI18N
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-957)/2, (screenSize.height-474)/2, 957, 474);
    }// </editor-fold>//GEN-END:initComponents

private void tfNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyPressed
    this.preencherJTable(2);
}//GEN-LAST:event_tfNomeKeyPressed

private void jtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtUsuarioMouseClicked
    int linha = jtUsuario.getSelectedRow();
    codigo = (Long) jtUsuario.getValueAt(linha, 0);
    setTitle("Pesquisa Usúario - "+controleUsuario.findPesquisa(codigo).getNome());
}//GEN-LAST:event_jtUsuarioMouseClicked

private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
    try {
        if (codigo != null) {
            controleUsuario.deletarUsuario(codigo);
            this.preencherJTable(1);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente.", "Atenção", 0);
        }
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(null, "Selecione um cliente.", "Atenção", 0);
    }
}//GEN-LAST:event_jMenu1ActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    try {
        if (codigo != null) {
            int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este usuário.", "Atenção", JOptionPane.YES_OPTION);
            if (op == JOptionPane.YES_OPTION) {
                controleUsuario.deletarUsuario(codigo);
                this.preencherJTable(1);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um usuário.", "Atenção", 0);
        }
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(null, "Selecione um usuário.", "Atenção", 0);
    }
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void MenuAtualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAtualizarUsuarioActionPerformed
    try {
        if (codigo != null) {
            JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
                atualizarUsuario = new AtualizarUsuario(mainFrame,this,codigo);
                GerenciadorClientesApp.getApplication().show(atualizarUsuario);
                atualizarUsuario.setSize(426, 518);
                setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um usuário.", "Atenção", 0);
        }
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(null, "Selecione um usuário.", "Atenção", 0);
    }
}//GEN-LAST:event_MenuAtualizarUsuarioActionPerformed

private void jtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtUsuarioKeyPressed
    try {
        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            jtUsuarioMouseClicked(null);
        }
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
           if(tab % 2 == 0){
               jtUsuario.transferFocus();
           }
           tab++;
        }
    } catch (Exception erro) {
    }
}//GEN-LAST:event_jtUsuarioKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAtualizarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtUsuario;
    private javax.swing.JLabel lbQuantUsuario;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables

    private void preencherJTable(int op) {

        jtUsuario.getColumnModel().getColumn(0).setPreferredWidth(15);
        jtUsuario.getColumnModel().getColumn(1).setPreferredWidth(200);
        jtUsuario.getColumnModel().getColumn(2).setPreferredWidth(50);
        jtUsuario.getColumnModel().getColumn(3).setPreferredWidth(25);
        jtUsuario.getColumnModel().getColumn(4).setPreferredWidth(90);

        DefaultTableModel modelo = (DefaultTableModel) jtUsuario.getModel();
        modelo.setNumRows(0);

        List<Usuario> usuarios = new ArrayList<Usuario>();
        int quant = 0;
        try {
            if (op == 1) {
                usuarios = controleUsuario.converte();
            } else if (op == 2) {
                usuarios = controleUsuario.converte(tfNome.getText());
            }
            for (Usuario u : usuarios) {
                String tipo = "";
                quant++;
                if (!u.isTipo()) {
                    tipo = "Gerencial";
                } else {
                    tipo = "Operacional";
                }
                modelo.addRow(new Object[]{
                            u.getId(),
                            u.getNome(),
                            tipo,
                            u.getTel(),
                            u.getCel(),
                            u.getEmail()
                        });
            }
            if(op == 1){
                lbQuantUsuario.setText("Quantidade de usuários: "+quant);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Não conseguiu carregar a tabela de clientes." + erro);
        }
    }
}
