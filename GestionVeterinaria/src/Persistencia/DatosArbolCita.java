package Persistencia;

import java.io.*;
import EstructuraArbol.ArbolCita;
import EstructuraArbol.NodoCita;
import Modelo.ArregloCitas;
import Modelo.Citas;
import java.util.List;
import javax.swing.JOptionPane;

public class DatosArbolCita {
    
    private static boolean isSyncing = false;

    public static void guardarEnArchivo(ArbolCita arbol) {
        try {
            FileOutputStream fos = new FileOutputStream("DatosArbolCitas.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(arbol);
            oos.close();
            
            if (!isSyncing) {
                isSyncing = true;
                sincronizarConCitas(arbol);
                isSyncing = false;
            }
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
    
    
    public static void actualizarEstadoCitaPorId(String idCita, String nuevoEstado) {
        ArbolCita arbol = recuperarDeArchivo();
        
        //Busca un nodo específico en el árbol utilizando el método buscarPorID
        NodoCita nodo = arbol.buscarPorID(idCita); 
        
        if (nodo != null) {
            Citas cita = nodo.getElemento();
            cita.setEstado(nuevoEstado);
            arbol.actualizarCita(cita);
            guardarEnArchivo(arbol);
            JOptionPane.showMessageDialog(null, "Cita atendida correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cita no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Metodo que sincroniza los datos de ArbolCita con ArregloCitas.
    private static void sincronizarConCitas(ArbolCita arbol) {
        ArregloCitas listaCitas = new ArregloCitas();
        List<NodoCita> nodos = arbol.getInOrder();
        for (NodoCita nodo : nodos) {
            listaCitas.AgregarCita(nodo.getElemento());
        }
        DatosCitas.GuardarEnArchivo(listaCitas);
    }
}

