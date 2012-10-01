/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Configuração.java
 *
 * Created on 23/09/2012, 13:59:50
 */
package GUI;

import Controler.ControleConfiguracao;
import Entidade.Configuracao;
import javax.swing.JFileChooser;

/**
 *
 * @author Brunno
 */
public class ConfiguracaoFerramentas extends javax.swing.JDialog {

    private String arquivo;
    private int cond = 1;

    public ConfiguracaoFerramentas(java.awt.Frame parent) {
        super(parent);
        initComponents();
        try {
            tfCaminho.setText(ControleConfiguracao.getCongiguracao().getPath_word());
        } catch (Exception erro) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfCaminho = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        rtWord = new javax.swing.JRadioButton();
        rtExel = new javax.swing.JRadioButton();
        rtPowerPoint = new javax.swing.JRadioButton();
        rtCalculadora = new javax.swing.JRadioButton();
        rtTeamViewer = new javax.swing.JRadioButton();
        rtFerrametaFavorita = new javax.swing.JRadioButton();
        jfSelecao = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(gerenciadorclientes.GerenciadorClientesApp.class).getContext().getResourceMap(ConfiguracaoFerramentas.class);
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
        jLabel1.setBounds(10, 20, 60, 15);

        tfCaminho.setEditable(false);
        tfCaminho.setText(resourceMap.getString("tfCaminho.text")); // NOI18N
        tfCaminho.setName("tfCaminho"); // NOI18N
        jPanel2.add(tfCaminho);
        tfCaminho.setBounds(10, 40, 380, 40);

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
        jPanel2.add(btPesquisar);
        btPesquisar.setBounds(400, 40, 65, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 80, 480, 100);

        jToolBar1.setBackground(resourceMap.getColor("jToolBar1.background")); // NOI18N
        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1"); // NOI18N

        btSalvar.setFont(resourceMap.getFont("btSalvar.font")); // NOI18N
        btSalvar.setIcon(resourceMap.getIcon("btSalvar.icon")); // NOI18N
        btSalvar.setMnemonic('s');
        btSalvar.setText(resourceMap.getString("btSalvar.text")); // NOI18N
        btSalvar.setToolTipText(resourceMap.getString("btSalvar.toolTipText")); // NOI18N
        btSalvar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar.setName("btSalvar"); // NOI18N
        btSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jToolBar1.add(btSalvar);

        btCancelar.setFont(resourceMap.getFont("btCancelar.font")); // NOI18N
        btCancelar.setIcon(resourceMap.getIcon("btCancelar.icon")); // NOI18N
        btCancelar.setMnemonic('c');
        btCancelar.setText(resourceMap.getString("btCancelar.text")); // NOI18N
        btCancelar.setToolTipText(resourceMap.getString("btCancelar.toolTipText")); // NOI18N
        btCancelar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancelar.setName("btCancelar"); // NOI18N
        btCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(btCancelar);

        jPanel1.add(jToolBar1);
        jToolBar1.setBounds(10, 10, 480, 60);

        jPanel3.setBackground(resourceMap.getColor("jPanel3.background")); // NOI18N
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel3.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPanel3.border.titleFont"))); // NOI18N
        jPanel3.setName("jPanel3"); // NOI18N
        jPanel3.setLayout(null);

        rtWord.setBackground(resourceMap.getColor("rtWord.background")); // NOI18N
        buttonGroup1.add(rtWord);
        rtWord.setFont(resourceMap.getFont("rtWord.font")); // NOI18N
        rtWord.setSelected(true);
        rtWord.setText(resourceMap.getString("rtWord.text")); // NOI18N
        rtWord.setName("rtWord"); // NOI18N
        rtWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtWordActionPerformed(evt);
            }
        });
        jPanel3.add(rtWord);
        rtWord.setBounds(60, 30, 90, 23);

        rtExel.setBackground(resourceMap.getColor("rtWord.background")); // NOI18N
        buttonGroup1.add(rtExel);
        rtExel.setFont(resourceMap.getFont("rtWord.font")); // NOI18N
        rtExel.setText(resourceMap.getString("rtExel.text")); // NOI18N
        rtExel.setName("rtExel"); // NOI18N
        rtExel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtExelActionPerformed(evt);
            }
        });
        jPanel3.add(rtExel);
        rtExel.setBounds(60, 60, 80, 23);

        rtPowerPoint.setBackground(resourceMap.getColor("rtPowerPoint.background")); // NOI18N
        buttonGroup1.add(rtPowerPoint);
        rtPowerPoint.setFont(resourceMap.getFont("rtWord.font")); // NOI18N
        rtPowerPoint.setText(resourceMap.getString("rtPowerPoint.text")); // NOI18N
        rtPowerPoint.setName("rtPowerPoint"); // NOI18N
        rtPowerPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtPowerPointActionPerformed(evt);
            }
        });
        jPanel3.add(rtPowerPoint);
        rtPowerPoint.setBounds(150, 30, 110, 23);

        rtCalculadora.setBackground(resourceMap.getColor("rtWord.background")); // NOI18N
        buttonGroup1.add(rtCalculadora);
        rtCalculadora.setFont(resourceMap.getFont("rtWord.font")); // NOI18N
        rtCalculadora.setText(resourceMap.getString("rtCalculadora.text")); // NOI18N
        rtCalculadora.setName("rtCalculadora"); // NOI18N
        rtCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtCalculadoraActionPerformed(evt);
            }
        });
        jPanel3.add(rtCalculadora);
        rtCalculadora.setBounds(320, 30, 110, 23);

        rtTeamViewer.setBackground(resourceMap.getColor("rtWord.background")); // NOI18N
        buttonGroup1.add(rtTeamViewer);
        rtTeamViewer.setFont(resourceMap.getFont("rtWord.font")); // NOI18N
        rtTeamViewer.setText(resourceMap.getString("rtTeamViewer.text")); // NOI18N
        rtTeamViewer.setName("rtTeamViewer"); // NOI18N
        rtTeamViewer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtTeamViewerActionPerformed(evt);
            }
        });
        jPanel3.add(rtTeamViewer);
        rtTeamViewer.setBounds(320, 60, 110, 23);

        rtFerrametaFavorita.setBackground(resourceMap.getColor("rtFerrametaFavorita.background")); // NOI18N
        buttonGroup1.add(rtFerrametaFavorita);
        rtFerrametaFavorita.setFont(resourceMap.getFont("rtFerrametaFavorita.font")); // NOI18N
        rtFerrametaFavorita.setText(resourceMap.getString("rtFerrametaFavorita.text")); // NOI18N
        rtFerrametaFavorita.setName("rtFerrametaFavorita"); // NOI18N
        rtFerrametaFavorita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtFerrametaFavoritaActionPerformed(evt);
            }
        });
        jPanel3.add(rtFerrametaFavorita);
        rtFerrametaFavorita.setBounds(150, 60, 160, 23);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 180, 480, 100);

        jfSelecao.setName("jfSelecao"); // NOI18N
        jPanel1.add(jfSelecao);
        jfSelecao.setBounds(10, 310, 614, 397);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-518)/2, (screenSize.height-327)/2, 518, 327);
    }// </editor-fold>//GEN-END:initComponents

private void rtWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtWordActionPerformed
    cond = 1;
    try {
        tfCaminho.setText(ControleConfiguracao.getCongiguracao().getPath_word());
    } catch (Exception erro) {
    }
}//GEN-LAST:event_rtWordActionPerformed

private void rtExelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtExelActionPerformed
    cond = 2;
    try {
        tfCaminho.setText(ControleConfiguracao.getCongiguracao().getPath_excel());
    } catch (Exception erro) {
    }
}//GEN-LAST:event_rtExelActionPerformed

private void rtPowerPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtPowerPointActionPerformed
    cond = 3;
    try {
        tfCaminho.setText(ControleConfiguracao.getCongiguracao().getPath_pp());
    } catch (Exception erro) {
    }
}//GEN-LAST:event_rtPowerPointActionPerformed

private void rtCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtCalculadoraActionPerformed
    cond = 4;
    try {
        tfCaminho.setText(ControleConfiguracao.getCongiguracao().getPath_calc());
    } catch (Exception erro) {
    }
}//GEN-LAST:event_rtCalculadoraActionPerformed

private void rtTeamViewerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtTeamViewerActionPerformed
    cond = 5;
    try {
        tfCaminho.setText(ControleConfiguracao.getCongiguracao().getPath_team());
    } catch (Exception erro) {
    }
}//GEN-LAST:event_rtTeamViewerActionPerformed

private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
    this.salvar();
}//GEN-LAST:event_btSalvarActionPerformed

private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
    try {
        arquivo = null;
        jfSelecao.setVisible(true);
        int result = jfSelecao.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            arquivo = jfSelecao.getSelectedFile().toString();
            tfCaminho.setText(arquivo);
        }
    } catch (Exception erro) {
    }
}//GEN-LAST:event_btPesquisarActionPerformed

private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
    setVisible(false);
}//GEN-LAST:event_btCancelarActionPerformed

private void rtFerrametaFavoritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtFerrametaFavoritaActionPerformed
    cond = 6;
    try {
        tfCaminho.setText(ControleConfiguracao.getCongiguracao().getPath_favorito());
    } catch (Exception erro) {
    }
}//GEN-LAST:event_rtFerrametaFavoritaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JFileChooser jfSelecao;
    private javax.swing.JRadioButton rtCalculadora;
    private javax.swing.JRadioButton rtExel;
    private javax.swing.JRadioButton rtFerrametaFavorita;
    private javax.swing.JRadioButton rtPowerPoint;
    private javax.swing.JRadioButton rtTeamViewer;
    private javax.swing.JRadioButton rtWord;
    private javax.swing.JTextField tfCaminho;
    // End of variables declaration//GEN-END:variables

    private void salvar() {
        Configuracao c = new Configuracao();
        c = ControleConfiguracao.getCongiguracao();

        if (cond == 1) {
            //Word
            c.setPath_word(converteBarra(tfCaminho.getText()));
        } else if (cond == 2) {
            //Excel
            c.setPath_excel(converteBarra(tfCaminho.getText()));
        } else if (cond == 3) {
            //Power Point
            c.setPath_pp(converteBarra(tfCaminho.getText()));
        } else if (cond == 4) {
            //Calculadora
            c.setPath_calc(converteBarra(tfCaminho.getText()));
        } else if (cond == 5) {
            //Team Viu
            c.setPath_team(converteBarra(tfCaminho.getText()));
        } else if (cond == 6) {
            //Team favorito
            c.setPath_favorito(converteBarra(tfCaminho.getText()));
        }
        ControleConfiguracao.salvarCongiguracao(c);
    }

    private String converteBarra(String arquivo) {
        char a = '\\';
        for (int i = 0; i < arquivo.length(); i++) {
            if (a == arquivo.charAt(i)) {
                arquivo = arquivo.replace("" + arquivo.charAt(i), "/");
            }
        }
        return arquivo;
    }
}
