/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AlterarEstadoSevico.java
 *
 * Created on 28/09/2012, 22:32:17
 */
package GUI.Atualizar;

import Controler.ControleServico;
import Controler.ControleUsuario;
import Entidade.Servico;
import Entidade.Usuario;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Brunno
 */
public class AlterarEstadoSevico extends javax.swing.JDialog {

    private ControleUsuario controleUsuario;
    private ControleServico controleServico;
    private JDialog tela;
    private Servico servico;

    public AlterarEstadoSevico(java.awt.Frame parent, JDialog tela, Servico servico) {
        super(parent);
        initComponents();
        this.servico = servico;
        this.tela = tela;
        controleServico = new ControleServico();
        controleUsuario = new ControleUsuario();
        preencherCbUsuario();
        mostrarDados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btAtualizar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cbResponsavel = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        cbEstadoMaquina = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(gerenciadorclientes.GerenciadorClientesApp.class).getContext().getResourceMap(AlterarEstadoSevico.class);
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

        btCancelar.setFont(resourceMap.getFont("btCancelar.font")); // NOI18N
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

        jButton1.setFont(resourceMap.getFont("jButton1.font")); // NOI18N
        jButton1.setIcon(resourceMap.getIcon("jButton1.icon")); // NOI18N
        jButton1.setMnemonic('v');
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setToolTipText(resourceMap.getString("jButton1.toolTipText")); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setName("jButton1"); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jPanel1.add(jToolBar1);
        jToolBar1.setBounds(10, 10, 190, 60);

        jPanel3.setBackground(resourceMap.getColor("jPanel3.background")); // NOI18N
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setName("jPanel3"); // NOI18N
        jPanel3.setLayout(null);

        cbResponsavel.setName("cbResponsavel"); // NOI18N
        jPanel3.add(cbResponsavel);
        cbResponsavel.setBounds(20, 50, 150, 40);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel3.add(jLabel1);
        jLabel1.setBounds(50, 20, 80, 15);

        cbEstadoMaquina.setEditable(true);
        cbEstadoMaquina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Em espera", "Em manutenção", "Aguardando peça", "Concluído" }));
        cbEstadoMaquina.setName("cbEstadoMaquina"); // NOI18N
        jPanel3.add(cbEstadoMaquina);
        cbEstadoMaquina.setBounds(20, 150, 150, 40);

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(40, 120, 110, 15);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 80, 190, 210);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-226)/2, (screenSize.height-337)/2, 226, 337);
    }// </editor-fold>//GEN-END:initComponents

private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed

    setVisible(false);
}//GEN-LAST:event_btCancelarActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    tela.setVisible(true);
    setVisible(false);
}//GEN-LAST:event_jButton1ActionPerformed

private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
     servico.setEstado(cbEstadoMaquina.getSelectedItem().toString());
     servico.setResponsavel(cbResponsavel.getSelectedItem().toString());
     
     boolean cond = controleServico.atualizarServico(servico);
     if(cond){
         JOptionPane.showMessageDialog(null, "Atualizado.");
     }
}//GEN-LAST:event_btAtualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JComboBox cbEstadoMaquina;
    private javax.swing.JComboBox cbResponsavel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    private void preencherCbUsuario() {
        try {
            for (Usuario u : controleUsuario.converte()) {
                cbResponsavel.addItem(u.getNome());
            }
        } catch (Exception erro) {
        }
    }
    
    private void mostrarDados(){
         cbEstadoMaquina.setSelectedItem(servico.getEstado());
         cbResponsavel.setSelectedItem(servico.getResponsavel());
    }
}
