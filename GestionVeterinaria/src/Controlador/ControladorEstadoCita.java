package Controlador;

import EstructuraArbol.ArbolCita;
import EstructuraArbol.NodoCita;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import Vista.VistaEstadoCita;
import Modelo.Citas;
import Modelo.ArregloCitas;
import Persistencia.DatosCitas;
import Persistencia.DatosCitasArbol;

public class ControladorEstadoCita implements ActionListener {

    VistaEstadoCita vista;
    DefaultTableModel modTabla;
    ArbolCita listaCitas;

    public ControladorEstadoCita(VistaEstadoCita v) {
        vista = v;
        vista.btnNuevo.addActionListener(this);
        vista.btnMarcarAtendida.addActionListener(this);
        vista.btnBuscarEnTabla.addActionListener(this);
        vista.btnEliminar.addActionListener(this);
        vista.btnActualizar.addActionListener(this);
        vista.setVisible(true);
        vista.setTitle("Gestión del Estado de las Citas");
        estadoBotones(false);
        modTabla = (DefaultTableModel) vista.tblEstadoCita.getModel();
        listaCitas = new ArbolCita();
        listaCitas = DatosCitasArbol.recuperarDeArchivo();
        listaCitas.listarInOrder(listaCitas.getRaiz(), modTabla);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnNuevo) {
            buscarCitaPorID(false);
            estadoBotones(false); // Las celdas deben permanecer bloqueadas
        }

        if (e.getSource() == vista.btnMarcarAtendida) {
            actualizarEstadoCita();
            estadoBotones(false);
        }

        if (e.getSource() == vista.btnBuscarEnTabla) {
            buscarCitaPorID(true);
        }

        if (e.getSource() == vista.btnEliminar) {
            //eliminarCita();
        }

        if (e.getSource() == vista.btnActualizar) {
            actualizarCita();
        }
    }

    private void estadoBotones(boolean estado) {
        vista.txtFecha.setEnabled(estado);
        vista.txtVeterinario.setEnabled(estado);
        vista.txtMascota.setEnabled(estado);
        vista.txtDueño.setEnabled(estado);
        vista.txtServicio.setEnabled(estado);
        vista.txtPrecio.setEnabled(estado);
        vista.txtEstado.setEnabled(estado);
        vista.btnEliminar.setEnabled(estado);
        vista.btnActualizar.setEnabled(estado);
        vista.txtBuscarID.setEnabled(!estado);
        vista.btnNuevo.setEnabled(!estado);
        vista.tblEstadoCita.setEnabled(!estado);
    }

    private void limpiarEntradas() {
        vista.txtFecha.setText("");
        vista.txtVeterinario.setText("");
        vista.txtMascota.setText("");
        vista.txtDueño.setText("");
        vista.txtServicio.setText("");
        vista.txtPrecio.setText("");
        vista.txtEstado.setText("");
        vista.txtBuscarID.setText("");
        vista.txtFecha.requestFocus();
    }

    private void limpiarTabla() {
        modTabla.setRowCount(0);
    }

    private void buscarCitaPorID(boolean isEdit) {
        String idCita;
        if (isEdit) {

            idCita = vista.txtBuscarTabla.getText().trim();

        } else {
            idCita = vista.txtBuscarID.getText().trim();
        }

        NodoCita citaNodo = listaCitas.buscarPorID(idCita);
        Citas cita = citaNodo.getElemento();

        if (cita != null) {
            vista.txtFecha.setText(cita.getFecha().toString());
            vista.txtVeterinario.setText(cita.getNomEmp());
            vista.txtMascota.setText(cita.getNomMas());
            vista.txtDueño.setText(cita.getNomDue());
            vista.txtServicio.setText(cita.getNomSer());
            vista.txtPrecio.setText(String.valueOf(cita.getPrecio()));
            vista.txtEstado.setText(cita.getEstado());

            if (isEdit) {
                vista.txtPrecio.setEnabled(true);
                vista.txtEstado.setEnabled(true);
                vista.btnActualizar.setEnabled(true);
                vista.btnMarcarAtendida.setEnabled(false);
            }

        } else {
            JOptionPane.showMessageDialog(vista, "Cita no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void actualizarEstadoCita() {
        String idCita = vista.txtBuscarID.getText().trim();
        NodoCita citaNodo = listaCitas.buscarPorID(idCita);
        Citas cita = citaNodo.getElemento();

        if (cita != null) {
            cita.setEstado("Atendida");
            listaCitas.actualizarCita(cita);
            DatosCitasArbol.guardarEnArchivo(listaCitas);
            vista.txtEstado.setText("Atendida");
            JOptionPane.showMessageDialog(vista, "Cita actualizada correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            modTabla.setRowCount(0);
            listaCitas.listarInOrder(listaCitas.getRaiz(), modTabla);
        } else {
            JOptionPane.showMessageDialog(vista, "Cita no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void actualizarCita() {
        String idCita = vista.txtBuscarTabla.getText().trim();
        NodoCita citaNodo = listaCitas.buscarPorID(idCita);
        Citas cita = citaNodo.getElemento();

        if (cita != null) {
            cita.setPrecio(Double.parseDouble(vista.txtPrecio.getText()));
            cita.setEstado(vista.txtEstado.getText());
            
            
            listaCitas.actualizarCita(cita);
            DatosCitasArbol.guardarEnArchivo(listaCitas);
            JOptionPane.showMessageDialog(vista, "Cita actualizada correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            modTabla.setRowCount(0);
            listaCitas.listarInOrder(listaCitas.getRaiz(), modTabla);
        } else {
            JOptionPane.showMessageDialog(vista, "Cita no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
