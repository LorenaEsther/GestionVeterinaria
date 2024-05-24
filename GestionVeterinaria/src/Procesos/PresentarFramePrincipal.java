
package Procesos;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;


public class PresentarFramePrincipal {
     public static void Centrar(JInternalFrame frame,JDesktopPane escritorio){
        escritorio.removeAll();        
        escritorio.add(frame);
        frame.setVisible(true);
        Dimension tamañoEscritorio = escritorio.getSize();
        Dimension tamañoframe= frame.getSize();
        int x=(tamañoEscritorio.width-tamañoframe.width)/2;
        int y=(tamañoEscritorio.height-tamañoframe.height)/2;
        frame.setLocation(x, y);
        frame.show();
        escritorio.repaint();
    } 
}
