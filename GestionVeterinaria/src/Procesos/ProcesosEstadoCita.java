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
        f.btnEliminar.setEnabled(estado);
        f.btnActualizar.setEnabled(estado);
        f.txtBuscarID.setEnabled(!estado);
        f.btnNuevo.setEnabled(!estado);
        f.tblEstadoCita.setEnabled(!estado);
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

    public static void buscarCitaPorID(VistaEstadoCita f, ArbolCita arbol) {
        String idCita = f.txtBuscarID.getText().trim();
        NodoCita nodoCita = arbol.buscarPorID(idCita);

        if (nodoCita != null) {
            Citas cita = nodoCita.getElemento();
            f.txtFecha.setText(cita.getFecha().toString());
            f.txtVeterinario.setText(cita.getNomEmp());
            f.txtMascota.setText(cita.getNomMas());
            f.txtDueño.setText(cita.getNomDue());
            f.txtServicio.setText(cita.getNomSer());
            f.txtPrecio.setText(String.valueOf(cita.getPrecio()));
            f.txtEstado.setText("No Atendida");  // Suponiendo que la búsqueda es para citas no atendidas
        } else {
            JOptionPane.showMessageDialog(f, "Cita no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(f, "Cita actualizada correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(f, "Cita no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void listarCitasEnTabla(DefaultTableModel modelo, ArbolCita arbol) {
        limpiarTabla(modelo);
        arbol.listarInOrder(arbol.getRaiz(), modelo);
    }

    public static void eliminarCita(VistaEstadoCita f, ArbolCita arbol) {
        String idCita = f.txtBuscarID.getText().trim();
        arbol.eliminarCita(idCita);
        JOptionPane.showMessageDialog(f, "Cita eliminada correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void buscarEnTabla(VistaEstadoCita f, ArbolCita arbol) {
        String textoBusqueda = f.txtBuscarTabla.getText().trim();
        // Implementar lógica de búsqueda en la tabla
    }
}
