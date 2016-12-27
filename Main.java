package desktopapplication1;

import server.window;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author burhan
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public Main(){}

    public void startServer()
    {
        // TODO code application logic here
        window w = new window();
        w.setVisible(true);
    }
}