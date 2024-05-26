package Controlador;

import Modelo.*;
import Vista.VistaEmpelado;
import Procesos.ProcesosEmpleados;
import Procesos.Mensajes;
import Persistencia.DatosEmpleados;
import ListasEnlazadas.ListaEnlazadaEmpleados.ListaEmpleados;
import ListasEnlazadas.ListaEnlazadaEmpleados.Nodo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Ordenamientos.OrdenamientoSeleccion.SeleccionOrdenarEmpleados;
import Ordenamientos.OrdenamientoBurbuja.BurbujaOrdenarEmpleados;
import Busquedas.BusquedaLineal.BusquedaLinealEmpleados;

public class ControladorEmpleado implements ActionListener {

    ListaEmpleados Lista;
    VistaEmpelado vistaEmpleado;
    Nodo actual;

    public ControladorEmpleado(VistaEmpelado vEmpleado) {
        vistaEmpleado = vEmpleado;
        vistaEmpleado.btnAgregarInicio.addActionListener(this);
        vistaEmpleado.btnAgregarFinal.addActionListener(this);
        vistaEmpleado.btnConsultar.addActionListener(this);
        vistaEmpleado.btnEliminar.addActionListener(this);
        vistaEmpleado.btnOrdenar.addActionListener(this);
        vistaEmpleado.btnBusquedaLineal.addActionListener(this);
        Lista = DatosEmpleados.RecuperarDeArchivo();
        ProcesosEmpleados.MostrarDatosDeLista(vEmpleado, Lista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaEmpleado.btnAgregarInicio) {
            Nodo nuevo = new Nodo(ProcesosEmpleados.LeerEmpleado(vistaEmpleado));
            Lista.AgregarNodoAlInicio(nuevo);
            ProcesosEmpleados.MostrarDatosDeLista(vistaEmpleado, Lista);
            DatosEmpleados.GuardarEnArchivo(Lista);
            ProcesosEmpleados.LimpiarEntradas(vistaEmpleado);
        }

        if (e.getSource() == vistaEmpleado.btnAgregarFinal) {
            Nodo nuevo = new Nodo(ProcesosEmpleados.LeerEmpleado(vistaEmpleado));
            Lista.agregarNodoAlFinal(nuevo);
            ProcesosEmpleados.MostrarDatosDeLista(vistaEmpleado, Lista);
            DatosEmpleados.GuardarEnArchivo(Lista);
            ProcesosEmpleados.LimpiarEntradas(vistaEmpleado);
        }

        if (e.getSource() == vistaEmpleado.btnConsultar) {
            String codBuscado = Mensajes.LeerTexto("Ingrese el código a consultar :");
            actual = Lista.BuscarEmpleado(codBuscado);
            if (actual == null) {
                Mensajes.MostrarTexto("ERROR: codigo " + codBuscado + " no existe en la lista");
            } else {
                ProcesosEmpleados.MostrarDatosNodo(actual, vistaEmpleado);
                vistaEmpleado.txtDni.requestFocus();
            }
        }

        if (e.getSource() == vistaEmpleado.btnEliminar) {
            if (actual != null) {
                int respuesta = Mensajes.Respuesta("Confirmar!!!",
                        "Desea eliminar " + actual.getEmpleado().getCodigo() + "-" + actual.getEmpleado().getNombre() + "?");
                if (respuesta == 0) { // Si=0
                    Lista.EliminarEmpleado(actual);
                    ProcesosEmpleados.MostrarDatosDeLista(vistaEmpleado, Lista);
                    ProcesosEmpleados.LimpiarEntradas(vistaEmpleado);
                }
            }
        }

        if (e.getSource() == vistaEmpleado.btnOrdenar) {
            if (vistaEmpleado.rbtAscendente.isSelected()) {
                if (vistaEmpleado.cbxOrdenar.getSelectedIndex() == 0) {
                    ListaEmpleados listaOrdenada = SeleccionOrdenarEmpleados.OrdenarPorApellidoAscendente(Lista);
                    ProcesosEmpleados.MostrarDatosDeLista(vistaEmpleado, listaOrdenada);
                } else if (vistaEmpleado.cbxOrdenar.getSelectedIndex() == 1) { // Ordenar por salario
                    ListaEmpleados listaOrdenada = SeleccionOrdenarEmpleados.OrdenarPorSalarioAscendente(Lista);
                    ProcesosEmpleados.MostrarDatosDeLista(vistaEmpleado, listaOrdenada);
                } else if (vistaEmpleado.cbxOrdenar.getSelectedIndex() == 2) { // Ordenar por fecha de contratación
                    ListaEmpleados listaOrdenada = BurbujaOrdenarEmpleados.OrdenarPorFechaContratacionAscendente(Lista);
                    ProcesosEmpleados.MostrarDatosDeLista(vistaEmpleado, listaOrdenada);
                }
            } else if (vistaEmpleado.rbtDescendente.isSelected()) {
                if (vistaEmpleado.cbxOrdenar.getSelectedIndex() == 0) {
                    ListaEmpleados listaOrdenada = SeleccionOrdenarEmpleados.OrdenarPorApellidoDescendente(Lista);
                    ProcesosEmpleados.MostrarDatosDeLista(vistaEmpleado, listaOrdenada);
                } else if (vistaEmpleado.cbxOrdenar.getSelectedIndex() == 1) { // Ordenar por salario
                    ListaEmpleados listaOrdenada = SeleccionOrdenarEmpleados.OrdenarPorSalarioDescendente(Lista);
                    ProcesosEmpleados.MostrarDatosDeLista(vistaEmpleado, listaOrdenada);
                } else if (vistaEmpleado.cbxOrdenar.getSelectedIndex() == 2) { // Ordenar por fecha de contratación
                    ListaEmpleados listaOrdenada = BurbujaOrdenarEmpleados.OrdenarPorFechaContratacionDescendente(Lista);
                    ProcesosEmpleados.MostrarDatosDeLista(vistaEmpleado, listaOrdenada);
                }
            }
        }
        if (e.getSource() == vistaEmpleado.btnBusquedaLineal) {
            String dniBuscado = Mensajes.LeerTexto("Ingrese el DNI a consultar:");
            Empleado empleado = BusquedaLinealEmpleados.buscarEmpleadoPorDNI(dniBuscado, Lista);
            if (empleado == null) {
                Mensajes.MostrarTexto("ERROR: DNI " + dniBuscado + " no existe en la lista");
            } else {
                Mensajes.MostrarTexto("Empleado encontrado: " + empleado.getNombre() + " " + empleado.getApellidos());
                // Aquí puedes mostrar más detalles del empleado en la vista si lo deseas
            }
        }
    }

}
