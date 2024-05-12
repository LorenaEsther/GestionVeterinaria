
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Vista.*;

public class ControladorLogin implements ActionListener {
    VistaLogin vista;
    
    public ControladorLogin(VistaLogin fl) {
        vista = fl;
        vista.setTitle("Login de la Veterinaria");
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        vista.btnIngresar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String veterinario = vista.txtCodigo.getText();
        String contraseña = vista.txtContraseña.getText();

        if (veterinario.isEmpty() || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Se identificaron campos vacíos");
        } else {
            if (veterinario.equals("VT001FR") && contraseña.equals("soyguapo")) {
                JOptionPane.showMessageDialog(null, "Bienvenido");
                VistaPrincipal vistaPrincipal = new VistaPrincipal();
                ControladorPrincipal controladorPrincipal = new ControladorPrincipal(vistaPrincipal);
                vistaPrincipal.setVisible(true);
                vista.dispose(); // Cerrar la ventana de login
            } else {
                JOptionPane.showMessageDialog(null, "Su código o contraseña es incorrecta");
            }
        }
    }
}


