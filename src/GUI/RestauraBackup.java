/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RestauraBackup.java
 *
 * Created on 07/06/2012, 11:28:49
 */
package GUI;

import Controler.ControleBackup;
import Entidade.Backup;
import Util.Config;
import java.text.DateFormat;
import java.util.Calendar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Brunno
 */
public class RestauraBackup extends javax.swing.JDialog {

    private ControleBackup controleBackup;

    public RestauraBackup(java.awt.Frame parent) {
        super(parent);
        initComponents();
        JFC_Salvar_Backup.setVisible(false);
        controleBackup = new ControleBackup();
        tfNomeUsuario.setText(Config.getUsuario().getNome());
        tfData.setText(DateFormat.getInstance().format(Calendar.getInstance().getTime()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfNomeUsuario = new javax.swing.JTextField();
        btRestaurar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        tfData = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JFC_Salvar_Backup = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(gerenciadorclientes.GerenciadorClientesApp.class).getContext().getResourceMap(RestauraBackup.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jPanel2.setBackground(resourceMap.getColor("jPanel2.background")); // NOI18N
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel2.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel2.border.titleFont"))); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(null);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 30, 130, 20);

        tfNomeUsuario.setEditable(false);
        tfNomeUsuario.setText(resourceMap.getString("tfNomeUsuario.text")); // NOI18N
        tfNomeUsuario.setName("tfNomeUsuario"); // NOI18N
        jPanel2.add(tfNomeUsuario);
        tfNomeUsuario.setBounds(20, 50, 320, 30);

        btRestaurar.setFont(resourceMap.getFont("btRestaurar.font")); // NOI18N
        btRestaurar.setIcon(resourceMap.getIcon("btRestaurar.icon")); // NOI18N
        btRestaurar.setMnemonic('r');
        btRestaurar.setText(resourceMap.getString("btRestaurar.text")); // NOI18N
        btRestaurar.setToolTipText(resourceMap.getString("btRestaurar.toolTipText")); // NOI18N
        btRestaurar.setName("btRestaurar"); // NOI18N
        btRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRestaurarActionPerformed(evt);
            }
        });
        jPanel2.add(btRestaurar);
        btRestaurar.setBounds(110, 100, 130, 41);

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
        jPanel2.add(btCancelar);
        btCancelar.setBounds(270, 100, 130, 41);

        tfData.setEditable(false);
        tfData.setText(resourceMap.getString("tfData.text")); // NOI18N
        tfData.setName("tfData"); // NOI18N
        jPanel2.add(tfData);
        tfData.setBounds(350, 50, 130, 30);

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(350, 30, 29, 15);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 500, 170);

        JFC_Salvar_Backup.setName("JFC_Salvar_Backup"); // NOI18N
        jPanel1.add(JFC_Salvar_Backup);
        JFC_Salvar_Backup.setBounds(10, 180, 614, 397);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-533)/2, (screenSize.height-226)/2, 533, 226);
    }// </editor-fold>//GEN-END:initComponents

private void btRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRestaurarActionPerformed
    try {
        String arquivo = null;
        JFC_Salvar_Backup.setVisible(true);
        int result = JFC_Salvar_Backup.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            arquivo = JFC_Salvar_Backup.getSelectedFile().toString();

            restoreDB("gcs", "root", "", arquivo);

            try {

                Thread.sleep(2000);

            } catch (Exception e) {
            }

            controleBackup.cadastraBackup(Backup.TIPORESTAURAR, arquivo);
            JOptionPane.showMessageDialog(null, "Backup realizado com sucesso.", "Backup", 1);
        }
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(null, "Erro no Backup manual.", "Atenção", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_btRestaurarActionPerformed

private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
    setVisible(false);
}//GEN-LAST:event_btCancelarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser JFC_Salvar_Backup;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btRestaurar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfNomeUsuario;
    // End of variables declaration//GEN-END:variables

    private String converteBarra(String arquivo) {
        char a = '\\';
        for (int i = 0; i < arquivo.length(); i++) {
            if (a == arquivo.charAt(i)) {
                arquivo = arquivo.replace("" + arquivo.charAt(i), "/");
            }
        }
        return arquivo;
    }

    private boolean restoreDB(String dbName, String dbUserName, String dbPassword, String source) {

        String[] executeCmd = new String[]{"C:/xampp/mysql/bin/mysql.exe", "--user=" + dbUserName, "--password=" + dbPassword, dbName, "-e", "source " + source};

        Process runtimeProcess;
        try {
            runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            int processComplete = runtimeProcess.waitFor();

            if (processComplete == 0) {

                System.out.println("Backup restored successfully");

                return true;

            } else {

                System.out.println("Could not restore the backup");

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return false;

    }
}
