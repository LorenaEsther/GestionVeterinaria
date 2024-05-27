package Controlador;

import Modelo.*;
import Busquedas.BusquedaLineal.BusquedaLinealClientes;
/*import Ordenamientos.OrdenamientoInsercion.InsercionOrdenarClientes;
import Ordenamientos.OrdenamientoSeleccion.SeleccionOrdenarClientes;*/
import Vista.*;
import Procesos.*;
import Persistencia.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorClientes implements ActionListener {
    VistaClientes vista;
    ArregloClientes listaClientes;
    Cliente cliente;

    public ControladorClientes(VistaClientes vc) {
        vista = vc;

        // Añadir los listeners a los botones
        vista.btnGuardar.addActionListener(this);
        vista.btnBuscar.addActionListener(this);
        vista.btnEliminar.addActionListener(this);
        vista.btnOrdenar.addActionListener(this);
        vista.btnEditar.addActionListener(this);

        listaClientes = new ArregloClientes(); // Inicializar el arreglo de clientes
        listaClientes = DatosClientes.RecuperaDeArchivo();
        listaClientes.ActualizarCantidadClientes();
        ProcesosVistaClientes.MostaraEnTabla(vista, listaClientes.getListaClientes());
        ProcesosVistaClientes.PresentarClientes(vista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnGuardar) {
            cliente = ProcesosVistaClientes.LeerClientes(vista);
            listaClientes.AgregarClientes(cliente);
            DatosClientes.GuardarEnArchivo(listaClientes);

            ProcesosVistaClientes.MostaraEnTabla(vista, listaClientes.getListaClientes());
            ProcesosVistaClientes.LimpiarEntradas(vista);
        }

        if (e.getSource() == vista.btnEliminar) {
            String elemento = Mensajes.LeerTexto("Ingrese el código a eliminar por favor...");
            int posicion = BusquedaLinealClientes.Secuencial(elemento, listaClientes);
            if (posicion == -1) {
                Mensajes.MostrarTexto("Código " + elemento + " a eliminar no existe...");
            } else {
                int resp = Mensajes.Respuesta("Confirmar eliminación",
                        "¿Deseas eliminar el código " + elemento + " de " +
                                listaClientes.RecuperarCliente(elemento).getNombre() + "?");
                if (resp == 0) {
                    listaClientes.EliminarClientes(posicion);
                    DatosClientes.GuardarEnArchivo(listaClientes);
                    ProcesosVistaClientes.MostaraEnTabla(vista, listaClientes.getListaClientes());
                }
            }
        }
        if (e.getSource() == vista.btnEditar) {
            Cliente nuevo = ProcesosVistaClientes.LeerClientes(vista);
            listaClientes.Actualizar(nuevo, nuevo.getCodigo());
            ProcesosVistaClientes.MostaraEnTabla(vista, listaClientes.getListaClientes());
        }

        /*if (e.getSource() == vista.btnOrdenar) {
            if (vista.cbxOrdenar.getSelectedIndex() == 0 && vista.rbtnASC.isSelected()) { // Ordenar por Nombre
                VistaClientes[] listaOrdenada = InsercionOrdenamientoClientes.ordenarNombreASC(listaClientes.getListaClientes());
                ProcesosVistaGestion.MostaraEnTabla(vista, listaOrdenada);
            }
            if (vista.cbxOrdenar.getSelectedIndex() == 0 && vista.rbtnDESC.isSelected()) {
                VistaClientes[] listaOrdenada = InsercionOrdenamientoClientes.ordenarNombreDESC(listaClientes.getListaClientes());
                ProcesosVistaGestion.MostaraEnTabla(vista, listaOrdenada);
            }
            if (vista.cbxOrdenar.getSelectedIndex() == 1 && vista.rbtnASC.isSelected()) { // Ordenar por ID
                VistaClientes[] listaOrdenada = SeleccionOrdenarClientes.ordenarPorIdClienteASC(listaClientes.getListaClientes(), listaClientes.getCantClientes());
                ProcesosVistaGestion.MostaraEnTabla(vista, listaOrdenada);
            }
            if (vista.cbxOrdenar.getSelectedIndex() == 1 && vista.rbtnDESC.isSelected()) {
                VistaClientes[] listaOrdenada = SeleccionOrdenarClientes.ordenarPorIdClienteDESC(listaClientes.getListaClientes(), listaClientes.getCantClientes());
                ProcesosVistaGestion.MostaraEnTabla(vista, listaOrdenada);
            }
        }

        if (e.getSource() == vista.btnBuscar) {
            // Ordenar primero por ID antes de hacer la búsqueda binaria
            VistaClientes[] auxiliar = SeleccionOrdenarClientes.ordenarPorIdClienteASC(listaClientes.getListaClientes(), listaClientes.getCantClientes());
            String codigoBuscar = Mensajes.LeerTexto("Ingrese el código a buscar por favor");
            int posicion = BusquedaClientes.BuscarPorCodigoCliente(auxiliar, codigoBuscar);
            if (posicion == -1) {
                Mensajes.MostrarTexto("ID " + codigoBuscar + " no existe en la lista...");
            } else {
                Mensajes.MostrarTexto(auxiliar[posicion].toString());
            }
        }*/
    }
}
