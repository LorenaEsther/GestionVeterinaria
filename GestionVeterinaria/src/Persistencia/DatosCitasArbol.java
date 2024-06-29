package Persistencia;

import java.io.*;
import EstructuraArbol.ArbolCita;
import javax.swing.JOptionPane;

public class DatosCitasArbol {

    public static void guardarEnArchivo(ArbolCita arbol) {
        try {
            FileOutputStream fos = new FileOutputStream("DatosArbolCitas.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(arbol);
            oos.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: No se puede guardar " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static ArbolCita recuperarDeArchivo() {
        ArbolCita arbol = new ArbolCita();
        try {
            FileInputStream fis = new FileInputStream("DatosArbolCitas.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            arbol = (ArbolCita) ois.readObject();
            ois.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: No se puede recuperar de archivo " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return arbol;
    }
}
