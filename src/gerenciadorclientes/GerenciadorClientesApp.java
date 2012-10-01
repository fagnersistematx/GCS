/*
 * GerenciadorClientesApp.java
 */

package gerenciadorclientes;

import GUI.LoguinInicial;
import Util.ThreadIniciadora;
import javax.swing.JFrame;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class GerenciadorClientesApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new GerenciadorClientesView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of GerenciadorClientesApp
     */
    public static GerenciadorClientesApp getApplication() {
        return Application.getInstance(GerenciadorClientesApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
                
        JFrame tela = new LoguinInicial();
        tela.setVisible(true); 
        
        ThreadIniciadora t = new ThreadIniciadora();
        t.start();
    }
    public static void gerenciador(String[] args){
        launch(GerenciadorClientesApp.class, args);
    }
}
