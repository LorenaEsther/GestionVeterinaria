
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Vista.*;
import java.util.ArrayList;


public class ControladorLogin implements ActionListener {
    VistaLogin vista;
    ArrayList<String[]> credencialesYNombres;
    
    //SOLO PARA ENTRAR RAPIDO------NO ELIMINAR LOS CODIGOS COMENTADOS!!!!!
    
    public ControladorLogin(VistaLogin fl) {
        vista = fl;
        vista.setTitle("Login de la Veterinaria");
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        vista.btnIngresar.addActionListener(this);

        // Inicializar el ArrayList con las credenciales y nombres de los veterinarios
        credencialesYNombres = new ArrayList<>();
        credencialesYNombres.add(new String[]{"VT001", "marco", "Dr. Marco Flores"});
        credencialesYNombres.add(new String[]{"VT002", "lorena", "Dra. Lorena"});
        credencialesYNombres.add(new String[]{"VT003", "fabricio", "Sr. Fabricio"});
        credencialesYNombres.add(new String[]{"VT004", "juan", "Dr. Juan"});
        credencialesYNombres.add(new String[]{"VT005", "marcelino", "Prof. Willabardo Astrada"});
        credencialesYNombres.add(new String[]{"0", "0", "0000"});
        // Puedes agregar más credenciales y nombres según sea necesario

        // Ordenar el ArrayList por código de veterinario usando el algoritmo de selección
        ordenarPorSeleccion();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String codigoVeterinario = vista.txtCodigo.getText();
        String contrasenia = vista.txtContraseña.getText();

        if (codigoVeterinario.isEmpty() || contrasenia.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Se identificaron campos vacíos");
        } else {
            int posicion = busquedaBinaria(codigoVeterinario, contrasenia);
            if (posicion != -1) {
                String nombreVeterinario = credencialesYNombres.get(posicion)[2];
                JOptionPane.showMessageDialog(null, "Bienvenido " + nombreVeterinario);
                VistaPrincipal vistaPrincipal = new VistaPrincipal();
                ControladorPrincipal controladorPrincipal = new ControladorPrincipal(vistaPrincipal);
                vistaPrincipal.setVisible(true);
                vista.dispose(); // Cerrar la ventana de login
            } else {
                JOptionPane.showMessageDialog(null, "Su código o contraseña es incorrecta");
            }
        }
    }

    private void ordenarPorSeleccion() {
        int n = credencialesYNombres.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (credencialesYNombres.get(j)[0].compareTo(credencialesYNombres.get(minIndex)[0]) < 0) {
                    minIndex = j;
                }
            }
            String[] temp = credencialesYNombres.get(minIndex);
            credencialesYNombres.set(minIndex, credencialesYNombres.get(i));
            credencialesYNombres.set(i, temp);
        }
    }

    private int busquedaBinaria(String codigoVeterinario, String passw) {
        int izquierda = 0;
        int derecha = credencialesYNombres.size() - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            String[] credencial = credencialesYNombres.get(medio);

            int comparacionCodigo = credencial[0].compareTo(codigoVeterinario);
            int comparacionContrasenia = credencial[1].compareTo(passw);

            if (comparacionCodigo == 0 && comparacionContrasenia == 0) {
                return medio; // Credenciales encontradas
            } else if (comparacionCodigo < 0 || (comparacionCodigo == 0 && comparacionContrasenia < 0)) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return -1; // Credenciales no encontradas
    }
}

