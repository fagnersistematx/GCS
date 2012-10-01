/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * HistóricoBackup.java
 *
 * Created on 07/06/2012, 11:41:52
 */
package GUI;

import Controler.ControleBackup;
import Entidade.Backup;
import Util.JCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brunno
 */
public class HistóricoBackup extends javax.swing.JDialog {
    
    private JCalendar jcalendar;
    private boolean cond = false;
    private ControleBackup controleBackup;
    
    public HistóricoBackup(java.awt.Frame parent) {
        super(parent);
        setSize(507, 317);
        initComponents();
        jcalendar = new JCalendar();
        jcalendar.setBounds(1, 1, 200,200);
	PainelData.add(jcalendar);		
        pack();
        controleBackup = new ControleBackup();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBackup = new javax.swing.JTable();
        btPesquisar = new javax.swing.JButton();
        PainelData = new javax.swing.JPanel();
        cbDatas = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(gerenciadorclientes.GerenciadorClientesApp.class).getContext().getResourceMap(HistóricoBackup.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N

        jPanel2.setBackground(resourceMap.getColor("jPanel2.background")); // NOI18N
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel2.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel2.border.titleFont"))); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jtBackup.setFont(resourceMap.getFont("jtBackup.font")); // NOI18N
        jtBackup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Destino/Arquivo", "Tipo", "Usuário", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtBackup.setName("jtBackup"); // NOI18N
        jScrollPane1.setViewportView(jtBackup);

        btPesquisar.setFont(resourceMap.getFont("btPesquisar.font")); // NOI18N
        btPesquisar.setIcon(resourceMap.getIcon("btPesquisar.icon")); // NOI18N
        btPesquisar.setMnemonic('p');
        btPesquisar.setText(resourceMap.getString("btPesquisar.text")); // NOI18N
        btPesquisar.setToolTipText(resourceMap.getString("btPesquisar.toolTipText")); // NOI18N
        btPesquisar.setName("btPesquisar"); // NOI18N
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        PainelData.setName("PainelData"); // NOI18N

        cbDatas.setFont(resourceMap.getFont("cbDatas.font")); // NOI18N
        cbDatas.setText(resourceMap.getString("cbDatas.text")); // NOI18N
        cbDatas.setName("cbDatas"); // NOI18N
        cbDatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDatasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PainelData, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(cbDatas))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(PainelData, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(cbDatas)
                        .addGap(18, 18, 18)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-949)/2, (screenSize.height-335)/2, 949, 335);
    }// </editor-fold>//GEN-END:initComponents

private void cbDatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDatasActionPerformed
    if(cond){
        cond = false;
    }else{
        cond = true;
    }
}//GEN-LAST:event_cbDatasActionPerformed

private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
    this.preecherJTable();
}//GEN-LAST:event_btPesquisarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelData;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JCheckBox cbDatas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtBackup;
    // End of variables declaration//GEN-END:variables
     
    private void preecherJTable() {

        jtBackup.getColumnModel().getColumn(0).setPreferredWidth(150);
        jtBackup.getColumnModel().getColumn(1).setPreferredWidth(60);
        jtBackup.getColumnModel().getColumn(2).setPreferredWidth(150);
        jtBackup.getColumnModel().getColumn(3).setPreferredWidth(20);

        DefaultTableModel modelo = (DefaultTableModel) jtBackup.getModel();
        modelo.setNumRows(0);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm");
        List <Backup> backups = new ArrayList<Backup>();
        try {
            if (cond) {
                backups = controleBackup.pesquisar(1, Calendar.getInstance());
            } else {
                backups = controleBackup.pesquisar(2, jcalendar.getCalendar());
            }
            for (Backup b : backups) {
                modelo.addRow(new Object[]{
                            b.getArquivo(),
                            b.getTipo(),
                            b.getUsuario(),
                            sdf.format(b.getData_bkp().getTime()),
                        });
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Não conseguiu carregar a tabela de backup." + erro);
        }
    }
}
