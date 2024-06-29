package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import Vista.VistaEstadoCita;
import EstructuraArbol.ArbolCita;
import EstructuraArbol.NodoCita;
import Modelo.Citas;
import Modelo.ModeloTablaCitas;
import Procesos.ProcesosEstadoCita;
import Persistencia.DatosCitasArbol;

public class ControladorEstadoCita implements ActionListener {
    VistaEstadoCita vista;    
    DefaultTableModel modTabla;
    ArbolCita arbol;
    NodoCita actual;

    public ControladorEstadoCita(VistaEstadoCita v) {
        vista = v;
        vista.btnNuevo.addActionListener(this);
        vista.btnMarcarAtendida1.addActionListener(this);
        vista.btnBuscarEnTabla.addActionListener(this);
        vista.btnEliminar.addActionListener(this);
        vista.btnActualizar.addActionListener(this);          
        vista.setVisible(true);
        vista.setTitle("Gestión del Estado de las Citas");
        ProcesosEstadoCita.estadoBotones(false, vista);
        modTabla = ModeloTablaCitas.crearModeloCitas();  // Utiliza el modelo de la clase TablaCitasModel
        vista.tblEstadoCita.setModel(modTabla);  // Asegúrate de que la tabla use el modelo correcto
        arbol = DatosCitasArbol.recuperarDeArchivo();
        ProcesosEstadoCita.listarCitasEnTabla(modTabla, arbol);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnNuevo) {
            ProcesosEstadoCita.limpiarEntradas(vista);
            ProcesosEstadoCita.estadoBotones(true, vista);
        }

        if (e.getSource() == vista.btnMarcarAtendida1) {
            ProcesosEstadoCita.actualizarEstadoCita(vista, arbol);
            ProcesosEstadoCita.limpiarEntradas(vista);
            DatosCitasArbol.guardarEnArchivo(arbol);
            ProcesosEstadoCita.listarCitasEnTabla(modTabla, arbol);
            ProcesosEstadoCita.estadoBotones(false, vista);
        }

        if (e.getSource() == vista.btnBuscarEnTabla) {
            String texto = vista.txtBuscarTabla.getText().trim();
            NodoCita nodo = arbol.buscarPorID(texto);
            if (nodo == null) {
                JOptionPane.showMessageDialog(vista, "Cita no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                Citas cita = nodo.getElemento();
                vista.txtFecha.setText(cita.getFecha().toString());
                vista.txtVeterinario.setText(cita.getNomEmp());
                vista.txtMascota.setText(cita.getNomMas());
                vista.txtDueño.setText(cita.getNomDue());
                vista.txtServicio.setText(cita.getNomSer());
                vista.txtPrecio.setText(String.valueOf(cita.getPrecio()));
                vista.txtEstado.setText(cita.getEstado());
                ProcesosEstadoCita.estadoBotones(true, vista);
            }
        }

        if (e.getSource() == vista.btnEliminar) {
            int fila = vista.tblEstadoCita.getSelectedRow();
            if (fila != -1) {
                int resp = JOptionPane.showConfirmDialog(vista, "Desea eliminar el registro?", "Confirmar", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    String idCita = (String) modTabla.getValueAt(fila, 0);
                    arbol.eliminarCita(idCita);
                    DatosCitasArbol.guardarEnArchivo(arbol);
                    ProcesosEstadoCita.limpiarEntradas(vista);
                    ProcesosEstadoCita.listarCitasEnTabla(modTabla, arbol);
                }
            }
        }

        if (e.getSource() == vista.btnActualizar) {
            String idCita = vista.txtBuscarID.getText().trim();
            NodoCita nodo = arbol.buscarPorID(idCita);
            if (nodo != null) {
                Citas cita = nodo.getElemento();
                cita.setFecha(java.sql.Date.valueOf(vista.txtFecha.getText()));
                cita.setNomEmp(vista.txtVeterinario.getText());
                cita.setNomMas(vista.txtMascota.getText());
                cita.setNomDue(vista.txtDueño.getText());
                cita.setNomSer(vista.txtServicio.getText());
                cita.setPrecio(Double.valueOf(vista.txtPrecio.getText()));
                cita.setEstado(vista.txtEstado.getText());
                arbol.actualizarCita(cita);
                DatosCitasArbol.guardarEnArchivo(arbol);
                ProcesosEstadoCita.limpiarEntradas(vista);
                ProcesosEstadoCita.listarCitasEnTabla(modTabla, arbol);
                ProcesosEstadoCita.estadoBotones(false, vista);
            }
        }
    }
}

