/*
 * GerenciadorClientesView.java
 */
package gerenciadorclientes;

import Controler.ControleConfiguracao;
import GUI.Atualizar.AlterarLoginSenhaUsuario;
import GUI.BackupAutomatico;
import GUI.BackupManual;
import GUI.CadastroClienteFisico;
import GUI.CadastroClienteJuridico;
import GUI.CadastroUsuario;
import GUI.ConfiguracaoFerramentas;
import GUI.HistóricoBackup;
import GUI.LoguinInicial;
import GUI.Pesquisa;
import GUI.PesquisarUsuario;
import GUI.RestauraBackup;
import GUI.TrocarUsuario;
import Util.ConfLook;
import Util.Config;
import org.jdesktop.application.Action;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.TaskMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * The application's main frame.
 */
public class GerenciadorClientesView extends FrameView {

    public GerenciadorClientesView(SingleFrameApplication app) {
        super(app);

        getFrame().setTitle("GCS - Gerenciador de Cliente e Serviços");
        getFrame().setFocusCycleRoot(true);
        getFrame().setFocusTraversalKeysEnabled(true);
        getFrame().setFocusTraversalPolicyProvider(true);
        getFrame().setFocusableWindowState(true);
        getFrame().setLocationByPlatform(true);
        getFrame().setIconImage(ConfLook.icone());
        getFrame().setLocationRelativeTo(null);

        initComponents();



        try {
            tfUsuario.setText("Usúario: " + Config.getUsuario().getNome());
            Config.setTfUsuario(tfUsuario);
            Config.setMenus(MenuBackupAuto, MenuBackupHistorico, MenuBackupRestaurar, MenuUsuario, menuConfiguracao);
            if (Config.getUsuario().isTipo() == true) {
                MenuBackupAuto.setEnabled(false);
                MenuBackupHistorico.setEnabled(false);
                MenuBackupRestaurar.setEnabled(false);
                MenuUsuario.setEnabled(false);
                menuConfiguracao.setEnabled(false);
            }
        } catch (Exception erro) {
            System.out.println("Não mostra usuario. " + erro);
        }

        // status bar initialization - message timeout, idle icon and busy animation, etc
        ResourceMap resourceMap = getResourceMap();
        int messageTimeout = resourceMap.getInteger("StatusBar.messageTimeout");
        messageTimer = new Timer(messageTimeout, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                statusMessageLabel.setText("");
            }
        });
        messageTimer.setRepeats(false);
        int busyAnimationRate = resourceMap.getInteger("StatusBar.busyAnimationRate");
        for (int i = 0; i < busyIcons.length; i++) {
            busyIcons[i] = resourceMap.getIcon("StatusBar.busyIcons[" + i + "]");
        }
        busyIconTimer = new Timer(busyAnimationRate, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                busyIconIndex = (busyIconIndex + 1) % busyIcons.length;
                statusAnimationLabel.setIcon(busyIcons[busyIconIndex]);
            }
        });
        idleIcon = resourceMap.getIcon("StatusBar.idleIcon");
        statusAnimationLabel.setIcon(idleIcon);
        progressBar.setVisible(false);

        // connecting action tasks to status bar via TaskMonitor
        TaskMonitor taskMonitor = new TaskMonitor(getApplication().getContext());
        taskMonitor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {

            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                String propertyName = evt.getPropertyName();
                if ("started".equals(propertyName)) {
                    if (!busyIconTimer.isRunning()) {
                        statusAnimationLabel.setIcon(busyIcons[0]);
                        busyIconIndex = 0;
                        busyIconTimer.start();
                    }
                    progressBar.setVisible(true);
                    progressBar.setIndeterminate(true);
                } else if ("done".equals(propertyName)) {
                    busyIconTimer.stop();
                    statusAnimationLabel.setIcon(idleIcon);
                    progressBar.setVisible(false);
                    progressBar.setValue(0);
                } else if ("message".equals(propertyName)) {
                    String text = (String) (evt.getNewValue());
                    statusMessageLabel.setText((text == null) ? "" : text);
                    messageTimer.restart();
                } else if ("progress".equals(propertyName)) {
                    int value = (Integer) (evt.getNewValue());
                    progressBar.setVisible(true);
                    progressBar.setIndeterminate(false);
                    progressBar.setValue(value);
                }
            }
        });
    }

    @Action
    public void showAboutBox() {
        if (aboutBox == null) {
            JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
            aboutBox = new GerenciadorClientesAboutBox(mainFrame);
            aboutBox.setLocationRelativeTo(mainFrame);
        }
        GerenciadorClientesApp.getApplication().show(aboutBox);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        javax.swing.JMenu fileMenu = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        javax.swing.JMenuItem exitMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        MenuUsuario = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jtBackupManual = new javax.swing.JMenuItem();
        MenuBackupAuto = new javax.swing.JMenuItem();
        MenuBackupRestaurar = new javax.swing.JMenuItem();
        MenuBackupHistorico = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        menuConfiguracao = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        MenuFerramentas = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        javax.swing.JMenu helpMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem aboutMenuItem = new javax.swing.JMenuItem();
        statusPanel = new javax.swing.JPanel();
        javax.swing.JSeparator statusPanelSeparator = new javax.swing.JSeparator();
        statusMessageLabel = new javax.swing.JLabel();
        statusAnimationLabel = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        tfUsuario = new javax.swing.JLabel();

        mainPanel.setName("mainPanel"); // NOI18N

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1042, Short.MAX_VALUE)
        );

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(gerenciadorclientes.GerenciadorClientesApp.class).getContext().getResourceMap(GerenciadorClientesView.class);
        menuBar.setFont(resourceMap.getFont("menuBar.font")); // NOI18N
        menuBar.setName("menuBar"); // NOI18N

        fileMenu.setIcon(resourceMap.getIcon("fileMenu.icon")); // NOI18N
        fileMenu.setMnemonic('a');
        fileMenu.setText(resourceMap.getString("fileMenu.text")); // NOI18N
        fileMenu.setName("fileMenu"); // NOI18N

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setIcon(resourceMap.getIcon("jMenuItem15.icon")); // NOI18N
        jMenuItem15.setText(resourceMap.getString("jMenuItem15.text")); // NOI18N
        jMenuItem15.setName("jMenuItem15"); // NOI18N
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem15);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem16.setIcon(resourceMap.getIcon("jMenuItem16.icon")); // NOI18N
        jMenuItem16.setText(resourceMap.getString("jMenuItem16.text")); // NOI18N
        jMenuItem16.setName("jMenuItem16"); // NOI18N
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem16);

        jSeparator1.setName("jSeparator1"); // NOI18N
        fileMenu.add(jSeparator1);

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(gerenciadorclientes.GerenciadorClientesApp.class).getContext().getActionMap(GerenciadorClientesView.class, this);
        exitMenuItem.setAction(actionMap.get("quit")); // NOI18N
        exitMenuItem.setIcon(resourceMap.getIcon("exitMenuItem.icon")); // NOI18N
        exitMenuItem.setText(resourceMap.getString("exitMenuItem.text")); // NOI18N
        exitMenuItem.setName("exitMenuItem"); // NOI18N
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        jMenu1.setIcon(resourceMap.getIcon("jMenu1.icon")); // NOI18N
        jMenu1.setMnemonic('c');
        jMenu1.setText(resourceMap.getString("jMenu1.text")); // NOI18N
        jMenu1.setName("jMenu1"); // NOI18N

        jMenu4.setIcon(resourceMap.getIcon("jMenu4.icon")); // NOI18N
        jMenu4.setText(resourceMap.getString("jMenu4.text")); // NOI18N
        jMenu4.setName("jMenu4"); // NOI18N

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText(resourceMap.getString("jMenuItem10.text")); // NOI18N
        jMenuItem10.setName("jMenuItem10"); // NOI18N
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText(resourceMap.getString("jMenuItem11.text")); // NOI18N
        jMenuItem11.setName("jMenuItem11"); // NOI18N
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenu1.add(jMenu4);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(resourceMap.getIcon("jMenuItem4.icon")); // NOI18N
        jMenuItem4.setText(resourceMap.getString("jMenuItem4.text")); // NOI18N
        jMenuItem4.setName("jMenuItem4"); // NOI18N
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        menuBar.add(jMenu1);

        MenuUsuario.setIcon(resourceMap.getIcon("MenuUsuario.icon")); // NOI18N
        MenuUsuario.setMnemonic('u');
        MenuUsuario.setText(resourceMap.getString("MenuUsuario.text")); // NOI18N
        MenuUsuario.setName("MenuUsuario"); // NOI18N

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setIcon(resourceMap.getIcon("jMenuItem12.icon")); // NOI18N
        jMenuItem12.setText(resourceMap.getString("jMenuItem12.text")); // NOI18N
        jMenuItem12.setName("jMenuItem12"); // NOI18N
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        MenuUsuario.add(jMenuItem12);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(resourceMap.getIcon("jMenuItem3.icon")); // NOI18N
        jMenuItem3.setText(resourceMap.getString("jMenuItem3.text")); // NOI18N
        jMenuItem3.setName("jMenuItem3"); // NOI18N
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        MenuUsuario.add(jMenuItem3);

        menuBar.add(MenuUsuario);

        jMenu2.setIcon(resourceMap.getIcon("jMenu2.icon")); // NOI18N
        jMenu2.setMnemonic('b');
        jMenu2.setText(resourceMap.getString("jMenu2.text")); // NOI18N
        jMenu2.setName("jMenu2"); // NOI18N

        jtBackupManual.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jtBackupManual.setIcon(resourceMap.getIcon("jtBackupManual.icon")); // NOI18N
        jtBackupManual.setText(resourceMap.getString("jtBackupManual.text")); // NOI18N
        jtBackupManual.setName("jtBackupManual"); // NOI18N
        jtBackupManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBackupManualActionPerformed(evt);
            }
        });
        jMenu2.add(jtBackupManual);

        MenuBackupAuto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        MenuBackupAuto.setIcon(resourceMap.getIcon("MenuBackupAuto.icon")); // NOI18N
        MenuBackupAuto.setText(resourceMap.getString("MenuBackupAuto.text")); // NOI18N
        MenuBackupAuto.setName("MenuBackupAuto"); // NOI18N
        MenuBackupAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBackupAutoActionPerformed(evt);
            }
        });
        jMenu2.add(MenuBackupAuto);

        MenuBackupRestaurar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        MenuBackupRestaurar.setIcon(resourceMap.getIcon("MenuBackupRestaurar.icon")); // NOI18N
        MenuBackupRestaurar.setText(resourceMap.getString("MenuBackupRestaurar.text")); // NOI18N
        MenuBackupRestaurar.setName("MenuBackupRestaurar"); // NOI18N
        MenuBackupRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBackupRestaurarActionPerformed(evt);
            }
        });
        jMenu2.add(MenuBackupRestaurar);

        MenuBackupHistorico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        MenuBackupHistorico.setIcon(resourceMap.getIcon("MenuBackupHistorico.icon")); // NOI18N
        MenuBackupHistorico.setText(resourceMap.getString("MenuBackupHistorico.text")); // NOI18N
        MenuBackupHistorico.setName("MenuBackupHistorico"); // NOI18N
        MenuBackupHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBackupHistoricoActionPerformed(evt);
            }
        });
        jMenu2.add(MenuBackupHistorico);

        menuBar.add(jMenu2);

        jMenu6.setIcon(resourceMap.getIcon("jMenu6.icon")); // NOI18N
        jMenu6.setMnemonic('f');
        jMenu6.setText(resourceMap.getString("jMenu6.text")); // NOI18N
        jMenu6.setName("jMenu6"); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(resourceMap.getIcon("jMenuItem1.icon")); // NOI18N
        jMenuItem1.setText(resourceMap.getString("jMenuItem1.text")); // NOI18N
        jMenuItem1.setName("jMenuItem1"); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem17.setIcon(resourceMap.getIcon("jMenuItem17.icon")); // NOI18N
        jMenuItem17.setText(resourceMap.getString("jMenuItem17.text")); // NOI18N
        jMenuItem17.setName("jMenuItem17"); // NOI18N
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem17);

        jMenuItem18.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem18.setIcon(resourceMap.getIcon("jMenuItem18.icon")); // NOI18N
        jMenuItem18.setText(resourceMap.getString("jMenuItem18.text")); // NOI18N
        jMenuItem18.setName("jMenuItem18"); // NOI18N
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem18);

        jMenuItem19.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem19.setIcon(resourceMap.getIcon("jMenuItem19.icon")); // NOI18N
        jMenuItem19.setText(resourceMap.getString("jMenuItem19.text")); // NOI18N
        jMenuItem19.setName("jMenuItem19"); // NOI18N
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem19);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setIcon(resourceMap.getIcon("jMenuItem2.icon")); // NOI18N
        jMenuItem2.setText(resourceMap.getString("jMenuItem2.text")); // NOI18N
        jMenuItem2.setName("jMenuItem2"); // NOI18N
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setIcon(resourceMap.getIcon("jMenuItem7.icon")); // NOI18N
        jMenuItem7.setText(resourceMap.getString("jMenuItem7.text")); // NOI18N
        jMenuItem7.setName("jMenuItem7"); // NOI18N
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

        menuBar.add(jMenu6);

        menuConfiguracao.setIcon(resourceMap.getIcon("menuConfiguracao.icon")); // NOI18N
        menuConfiguracao.setMnemonic('o');
        menuConfiguracao.setText(resourceMap.getString("menuConfiguracao.text")); // NOI18N
        menuConfiguracao.setName("menuConfiguracao"); // NOI18N

        jMenuItem5.setText(resourceMap.getString("jMenuItem5.text")); // NOI18N
        jMenuItem5.setName("jMenuItem5"); // NOI18N
        menuConfiguracao.add(jMenuItem5);

        MenuFerramentas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        MenuFerramentas.setText(resourceMap.getString("MenuFerramentas.text")); // NOI18N
        MenuFerramentas.setName("MenuFerramentas"); // NOI18N
        MenuFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFerramentasActionPerformed(evt);
            }
        });
        menuConfiguracao.add(MenuFerramentas);

        jMenuItem6.setText(resourceMap.getString("jMenuItem6.text")); // NOI18N
        jMenuItem6.setName("jMenuItem6"); // NOI18N
        menuConfiguracao.add(jMenuItem6);

        menuBar.add(menuConfiguracao);

        helpMenu.setMnemonic('j');
        helpMenu.setText(resourceMap.getString("helpMenu.text")); // NOI18N
        helpMenu.setName("helpMenu"); // NOI18N

        aboutMenuItem.setAction(actionMap.get("showAboutBox")); // NOI18N
        aboutMenuItem.setText(resourceMap.getString("aboutMenuItem.text")); // NOI18N
        aboutMenuItem.setName("aboutMenuItem"); // NOI18N
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        statusPanel.setName("statusPanel"); // NOI18N

        statusPanelSeparator.setName("statusPanelSeparator"); // NOI18N

        statusMessageLabel.setName("statusMessageLabel"); // NOI18N

        statusAnimationLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        statusAnimationLabel.setName("statusAnimationLabel"); // NOI18N

        progressBar.setName("progressBar"); // NOI18N

        tfUsuario.setDisplayedMnemonic('k');
        tfUsuario.setFont(resourceMap.getFont("tfUsuario.font")); // NOI18N
        tfUsuario.setIcon(resourceMap.getIcon("tfUsuario.icon")); // NOI18N
        tfUsuario.setText(resourceMap.getString("tfUsuario.text")); // NOI18N
        tfUsuario.setToolTipText(resourceMap.getString("tfUsuario.toolTipText")); // NOI18N
        tfUsuario.setName("tfUsuario"); // NOI18N
        tfUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfUsuarioMouseClicked(evt);
            }
        });
        tfUsuario.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tfUsuarioAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusPanelSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusMessageLabel)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1236, Short.MAX_VALUE)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusAnimationLabel)
                .addContainerGap())
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addComponent(statusPanelSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(statusPanelLayout.createSequentialGroup()
                        .addComponent(tfUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(statusMessageLabel)
                            .addComponent(statusAnimationLabel))
                        .addGap(3, 3, 3))
                    .addGroup(statusPanelLayout.createSequentialGroup()
                        .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        setComponent(mainPanel);
        setMenuBar(menuBar);
        setStatusBar(statusPanel);
    }// </editor-fold>//GEN-END:initComponents

private void jtBackupManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBackupManualActionPerformed
    //if (backupManual == null) {
    JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
    backupManual = new BackupManual(mainFrame);
    backupManual.setLocationRelativeTo(mainFrame);
    //}
    GerenciadorClientesApp.getApplication().show(backupManual);
    backupManual.setSize(518, 192);
}//GEN-LAST:event_jtBackupManualActionPerformed

private void MenuBackupAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBackupAutoActionPerformed
    if (backupAutomatico == null) {
        JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
        backupAutomatico = new BackupAutomatico(mainFrame);
        backupAutomatico.setLocationRelativeTo(mainFrame);
    }
    GerenciadorClientesApp.getApplication().show(backupAutomatico);
    backupAutomatico.setSize(598, 258);

}//GEN-LAST:event_MenuBackupAutoActionPerformed

private void MenuBackupRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBackupRestaurarActionPerformed

    JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
    backupRestaurar = new RestauraBackup(mainFrame);
    backupRestaurar.setLocationRelativeTo(mainFrame);

    GerenciadorClientesApp.getApplication().show(backupRestaurar);
    backupRestaurar.setSize(533, 226);

}//GEN-LAST:event_MenuBackupRestaurarActionPerformed

private void MenuBackupHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBackupHistoricoActionPerformed
    if (backupHistorico == null) {
        JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
        backupHistorico = new HistóricoBackup(mainFrame);
        backupHistorico.setLocationRelativeTo(mainFrame);
    }
    GerenciadorClientesApp.getApplication().show(backupHistorico);
    backupHistorico.setSize(949, 335);
}//GEN-LAST:event_MenuBackupHistoricoActionPerformed

private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
    if (cadastroUsuario == null) {
        JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
        cadastroUsuario = new CadastroUsuario(mainFrame);
        cadastroUsuario.setLocationRelativeTo(mainFrame);
    }
    GerenciadorClientesApp.getApplication().show(cadastroUsuario);
    cadastroUsuario.setSize(400, 514);
}//GEN-LAST:event_jMenuItem12ActionPerformed

private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
    if (trocarUsuario == null) {
        JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
        trocarUsuario = new TrocarUsuario();
        trocarUsuario.setLocationRelativeTo(mainFrame);
    }
    GerenciadorClientesApp.getApplication().show(trocarUsuario);
    trocarUsuario.setSize(384, 267);
}//GEN-LAST:event_jMenuItem15ActionPerformed

private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
    JFrame tela = new LoguinInicial();
    tela.setVisible(true);
    getFrame().setVisible(false);

}//GEN-LAST:event_jMenuItem16ActionPerformed

private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    if (pesquisarCliente == null) {
        JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
        pesquisarCliente = new Pesquisa(mainFrame);
        //cadastroUsuario.setLocationRelativeTo(mainFrame);
    }
    GerenciadorClientesApp.getApplication().show(pesquisarCliente);
    pesquisarCliente.setSize(914, 431);
}//GEN-LAST:event_jMenuItem4ActionPerformed

private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
    if (cadastroJuriico == null) {
        JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
        cadastroJuriico = new CadastroClienteJuridico(mainFrame);
        cadastroJuriico.setLocationRelativeTo(mainFrame);
    }
    GerenciadorClientesApp.getApplication().show(cadastroJuriico);
    cadastroJuriico.setSize(843, 601);
}//GEN-LAST:event_jMenuItem11ActionPerformed

private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
    if (cadastroCliente == null) {
        JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
        cadastroCliente = new CadastroClienteFisico(mainFrame);
        cadastroCliente.setLocationRelativeTo(mainFrame);
    }
    GerenciadorClientesApp.getApplication().show(cadastroCliente);
    cadastroCliente.setSize(845, 599);
}//GEN-LAST:event_jMenuItem10ActionPerformed

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    try {
        Runtime.getRuntime().exec("" + ControleConfiguracao.getCongiguracao().getPath_word());

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, " Não foi possível abrir o Word. \n Verifique o caminho.", " Atenção ", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
    try {
        Runtime.getRuntime().exec(ControleConfiguracao.getCongiguracao().getPath_pp());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, " Não foi possível abrir o PowerPoint. \n Verifique o caminho.", " Atenção ", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_jMenuItem18ActionPerformed

private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
    try {
        Runtime.getRuntime().exec(ControleConfiguracao.getCongiguracao().getPath_excel());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, " Não foi possível abrir o Excel. \n Verifique o caminho.", " Atenção ", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_jMenuItem17ActionPerformed

private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
    try {
        Runtime.getRuntime().exec(ControleConfiguracao.getCongiguracao().getPath_team());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, " Não foi possível abrir o Team Viewer. \n Verifique o caminho.", " Atenção ", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_jMenuItem19ActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    try {
        Runtime.getRuntime().exec(ControleConfiguracao.getCongiguracao().getPath_calc());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, " Não foi possível abrir a Calculadora. \n Verifique o caminho.", " Atenção ", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

    JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
    pesquisarUsuario = new PesquisarUsuario(mainFrame);

    GerenciadorClientesApp.getApplication().show(pesquisarUsuario);
    pesquisarUsuario.setSize(957, 474);
}//GEN-LAST:event_jMenuItem3ActionPerformed

private void tfUsuarioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tfUsuarioAncestorAdded
// TODO add your handling code here:
}//GEN-LAST:event_tfUsuarioAncestorAdded

private void tfUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUsuarioMouseClicked

    JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
    alterarLoginSenha = new AlterarLoginSenhaUsuario(mainFrame);
    alterarLoginSenha.setLocationRelativeTo(mainFrame);
    GerenciadorClientesApp.getApplication().show(alterarLoginSenha);
    alterarLoginSenha.setSize(334, 364);
}//GEN-LAST:event_tfUsuarioMouseClicked

private void MenuFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFerramentasActionPerformed
    if (ferramentas == null) {
        JFrame mainFrame = GerenciadorClientesApp.getApplication().getMainFrame();
        ferramentas = new ConfiguracaoFerramentas(mainFrame);
        ferramentas.setLocationRelativeTo(mainFrame);
    }
    GerenciadorClientesApp.getApplication().show(ferramentas);
    ferramentas.setSize(518, 333);
}//GEN-LAST:event_MenuFerramentasActionPerformed

private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
    try {
        Runtime.getRuntime().exec(ControleConfiguracao.getCongiguracao().getPath_favorito());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, " Favorito não encontrado. \n Verifique o caminho.", " Atenção ", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_jMenuItem7ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuBackupAuto;
    private javax.swing.JMenuItem MenuBackupHistorico;
    private javax.swing.JMenuItem MenuBackupRestaurar;
    private javax.swing.JMenuItem MenuFerramentas;
    private javax.swing.JMenu MenuUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jtBackupManual;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuConfiguracao;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel statusAnimationLabel;
    private javax.swing.JLabel statusMessageLabel;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JLabel tfUsuario;
    // End of variables declaration//GEN-END:variables
    private final Timer messageTimer;
    private final Timer busyIconTimer;
    private final Icon idleIcon;
    private final Icon[] busyIcons = new Icon[15];
    private int busyIconIndex = 0;
    private JDialog aboutBox;
    private JDialog backupHistorico;
    private JDialog backupRestaurar;
    private JDialog backupManual;
    private JDialog backupAutomatico;
    private JDialog cadastroJuriico;
    private JDialog cadastroCliente;
    private JDialog ferramentas;
    private JDialog cadastroUsuario;
    private JDialog pesquisarCliente;
    private JDialog trocarUsuario;
    private JDialog pesquisarUsuario;
    private JDialog alterarLoginSenha;
}
