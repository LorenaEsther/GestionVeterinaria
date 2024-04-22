
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;

public class ControladorLogin implements ActionListener{

    VistaLogin vista;
    public ControladorLogin(VistaLogin fl){
        vista=fl;
        vista.setTitle("Login de la Veterinaria");
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);        
        vista.btnIngresar.addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

      if(e.getSource()== vista.btnIngresar){
           ControladorPrincipal cmenu =  new ControladorPrincipal(new VistaPrincipal());
           vista.setVisible(false);
      }
          
        
    }
    
}
