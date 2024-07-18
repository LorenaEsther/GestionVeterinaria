package Procesos;

import Vista.VistaEstadoCita;
import EstructuraArbol.ArbolCita;
import EstructuraArbol.NodoCita;
import Modelo.Citas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProcesosEstadoCita {

    public static void estadoBotones(boolean estado, VistaEstadoCita f) {
        f.txtFecha.setEnabled(estado);
        f.txtVeterinario.setEnabled(estado);
        f.txtMascota.setEnabled(estado);
        f.txtDueño.setEnabled(estado);
        f.txtServicio.setEnabled(estado);
        f.txtPrecio.setEnabled(estado);
        f.txtEstado.setEnabled(estado);
        f.txtBuscarID.setEnabled(true);
        f.txtBuscarTabla.setEnabled(true);
        f.btnBuscarEnTabla.setEnabled(true);
        f.btnEliminar.setEnabled(true);
        f.btnCancelar.setEnabled(false);
        f.btnActualizar.setEnabled(false);
        f.btnNuevo.setEnabled(true);
        f.btnAgregarCitaAtendida.setEnabled(false);
        f.tblEstadoCita.setEnabled(!estado);
        f.btnCancelar.setEnabled(estado);
        f.btnNuevo.setEnabled(!estado);
        f.btnCancelarCita.setEnabled(false);
        
    }

    public static void limpiarEntradas(VistaEstadoCita f) {
        f.txtFecha.setText("");
        f.txtVeterinario.setText("");
        f.txtMascota.setText("");
        f.txtDueño.setText("");
        f.txtServicio.setText("");
        f.txtPrecio.setText("");
        f.txtEstado.setText("");
        f.txtBuscarID.setText("");
        f.txtFecha.requestFocus();
    }

    public static void limpiarTabla(DefaultTableModel modtabla) {
        modtabla.setRowCount(0);
    }

    public static void buscarCitaPorID(VistaEstadoCita vista, ArbolCita arbol) {
        String idCita = vista.txtBuscarID.getText().trim();
        NodoCita nodoCita = arbol.buscarPorID(idCita);

        if (nodoCita != null) {
            Citas cita = nodoCita.getElemento();
            vista.txtFecha.setText(cita.getFecha().toString());
            vista.txtVeterinario.setText(cita.getNomEmp());
            vista.txtMascota.setText(cita.getNomMas());
            vista.txtDueño.setText(cita.getNomDue());
            vista.txtServicio.setText(cita.getNomSer());
            vista.txtPrecio.setText(String.valueOf(cita.getPrecio()));
            vista.txtEstado.setText("No Atendida");  
        } else {
            JOptionPane.showMessageDialog(vista, "Cita no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void actualizarEstadoCita(VistaEstadoCita f, ArbolCita arbol) {
        String idCita = f.txtBuscarID.getText().trim();
        NodoCita nodoCita = arbol.buscarPorID(idCita);

        if (nodoCita != null) {
            Citas cita = nodoCita.getElemento();
            cita.setEstado("Atendida");
            arbol.actualizarCita(cita);
            f.txtEstado.setText("Atendida");
            JOptionPane.showMessageDialog(f, "Cita marcada como atendida", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(f, "Cita no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void listarCitasEnTabla(DefaultTableModel modelo, ArbolCita arbol) {
        limpiarTabla(modelo);
        arbol.listarInOrder(arbol.getRaiz(), modelo);
    }

    public static void buscarEnTabla(VistaEstadoCita f, ArbolCita arbol) {
        String textoBusqueda = f.txtBuscarTabla.getText().trim();
        // Implementar lógica de búsqueda en la tabla
    }
}


