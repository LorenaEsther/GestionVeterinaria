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
import Persistencia.DatosArbolCita;
import Procesos.ProcesosEstadoCita;

public class ControladorEstadoCita implements ActionListener {

    VistaEstadoCita vista;
    DefaultTableModel modTabla;
    ArbolCita listaCitas;

    public ControladorEstadoCita(VistaEstadoCita v) {
        vista = v;
        vista.btnNuevo.addActionListener(this);
        vista.btnAgregarCitaAtendida.addActionListener(this);
        vista.btnBuscarEnTabla.addActionListener(this);
        vista.btnEliminar.addActionListener(this);
        vista.btnCancelar.addActionListener(this);
        vista.btnActualizar.addActionListener(this);
        vista.setVisible(true);
        vista.setTitle("Gestión del Estado de las Citas");
        ProcesosEstadoCita.estadoBotones(false, vista);
        modTabla = (DefaultTableModel) vista.tblEstadoCita.getModel();
        listaCitas = new ArbolCita();
        listaCitas = DatosArbolCita.recuperarDeArchivo();
        listaCitas.listarInOrder(listaCitas.getRaiz(), modTabla);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnNuevo) {
            ProcesosEstadoCita.estadoBotones(false, vista); // Las celdas deben permanecer bloqueadas
            //ProcesosEstadoCita.limpiarEntradas(vista);
            buscarCitaPorID(false);
            vista.btnAgregarCitaAtendida.setEnabled(true);
            vista.btnCancelar.setEnabled(true);
            vista.btnEliminar.setEnabled(false);
            vista.txtBuscarTabla.setEnabled(false);
            vista.btnBuscarEnTabla.setEnabled(false);
        }

        if (e.getSource() == vista.btnAgregarCitaAtendida) {
            actualizarEstadoCita();
            ProcesosEstadoCita.estadoBotones(false, vista);
            ProcesosEstadoCita.limpiarEntradas(vista);
        }

        if (e.getSource() == vista.btnBuscarEnTabla) {
            buscarCitaPorID(true);
            vista.btnActualizar.setEnabled(true);
        }
        
        if (e.getSource() == vista.btnActualizar) {
            actualizarCita();
        }

        if (e.getSource() == vista.btnEliminar) {
            eliminarCita();
        }

        if (e.getSource() == vista.btnCancelar) {
            ProcesosEstadoCita.limpiarEntradas(vista);
            ProcesosEstadoCita.estadoBotones(false, vista);
        }

    }

    /*private void estadoBotones(boolean estado) {
        vista.txtFecha.setEnabled(estado);
        vista.txtVeterinario.setEnabled(estado);
        vista.txtMascota.setEnabled(estado);
        vista.txtDueño.setEnabled(estado);
        vista.txtServicio.setEnabled(estado);
        vista.txtPrecio.setEnabled(estado);
        vista.txtEstado.setEnabled(estado);
        vista.btnEliminar.setEnabled(estado);
        vista.btnCancelar.setEnabled(estado);
        vista.txtBuscarID.setEnabled(!estado);
        vista.btnNuevo.setEnabled(!estado);
        vista.tblEstadoCita.setEnabled(!estado);
    }*/
    private void limpiarTabla() {
        modTabla.setRowCount(0);
    }

    private void buscarCitaPorID(boolean isEdit) {
        String idCita;
        if (isEdit) {

            idCita = vista.txtBuscarTabla.getText().trim();

        } else {
            idCita = vista.txtBuscarID.getText().trim();
            vista.btnAgregarCitaAtendida.setEnabled(true);

        }
        NodoCita citaNodo = listaCitas.buscarPorID(idCita);

        if (citaNodo != null) {
            Citas cita = citaNodo.getElemento();
            System.out.println(cita.getIdCita());
            if (cita != null) {
                System.out.println(cita.getFecha());
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
                    vista.btnCancelar.setEnabled(true);
                    vista.btnAgregarCitaAtendida.setEnabled(false);
                }

            } else {
                JOptionPane.showMessageDialog(vista, "La cita encontrada es nula", "Error", JOptionPane.ERROR_MESSAGE);
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
            DatosArbolCita.guardarEnArchivo(listaCitas);
            vista.txtEstado.setText("Atendida");
            JOptionPane.showMessageDialog(vista, "Cita atendida correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
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
        
        System.out.println(idCita);
        
        if (cita != null) {
            cita.setPrecio(Double.parseDouble(vista.txtPrecio.getText()));
            cita.setEstado(vista.txtEstado.getText());

            listaCitas.actualizarCita(cita);
            DatosArbolCita.guardarEnArchivo(listaCitas);
            JOptionPane.showMessageDialog(vista, "Cita actualizada correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            modTabla.setRowCount(0);
            listaCitas.listarInOrder(listaCitas.getRaiz(), modTabla);
        } else {
            JOptionPane.showMessageDialog(vista, "Cita no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para eliminar una cita
    private void eliminarCita() {
        int fila = vista.tblEstadoCita.getSelectedRow();
        if (fila != -1) { // -1 indica que no hay fila seleccionada
            int resp = JOptionPane.showConfirmDialog(vista, "¿Desea eliminar el registro?", "Confirmar!!!", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                String idCita = (String) vista.tblEstadoCita.getValueAt(fila, 0);
                listaCitas.setRaiz(listaCitas.eliminar(listaCitas.getRaiz(), idCita));
                DatosArbolCita.guardarEnArchivo(listaCitas);
                ProcesosEstadoCita.limpiarEntradas(vista);

                // Obtener el modelo de la tabla y limpiar
                DefaultTableModel modelo = (DefaultTableModel) vista.tblEstadoCita.getModel();
                ProcesosEstadoCita.limpiarTabla(modelo);
                listaCitas.listarInOrder(listaCitas.getRaiz(), modelo);
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Por favor, seleccione una fila para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }
}
