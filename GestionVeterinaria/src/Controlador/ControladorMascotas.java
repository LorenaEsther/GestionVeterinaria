
package Controlador;


import Busquedas.BusquedaBinaria.BusquedaBinariaMascotas;
import Modelo.*;
import Vista.*;
import Procesos.*;
import Persistencia.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorMascotas implements ActionListener{
    
    VistaMascotas vista;
    ColeccionMascotas coleccion;
    
    public ControladorMascotas (VistaMascotas vm) {
        vista = vm;
        
        vista.btnGuardar.addActionListener(this);
        vista.btnEditar.addActionListener(this);//BUSQUEDA DE FORMA BINARIA
        vista.btnEliminar.addActionListener(this);
        /*vista.btnBuscar.addActionListener(this);
        vista.btnOrdenar.addActionListener(this);*/
        
        
        coleccion = new ColeccionMascotas(); // Inicializar el arreglo de citas
        coleccion = DatosMascotas.RecuperarDeArchivo();
        ProcesosVistaMascotas.MostrarEnTabla(vista, coleccion);
        ProcesosVistaMascotas.PresentarGestionDeServicios(vista);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnGuardar) {
            coleccion.AgregarMascota(ProcesosVistaMascotas.LeerMascota(vista));
            ProcesosVistaMascotas.MostrarEnTabla(vista, coleccion);
            ProcesosVistaMascotas.LimpiarEntradas(vista);
        }

        if (e.getSource() == vista.btnEliminar) {
            String codigo = Mensajes.LeerTexto("Ingrese el código a eliminar por favor...");
            int posicion = BusquedaBinariaMascotas.BuscarPorCodigo(coleccion.getLista(), codigo);
            if (posicion == -1) {
                Mensajes.MostrarTexto("Código " + codigo + " a eliminar no existe...");
            } else {
                int resp = Mensajes.Respuesta("Confirmar eliminación",
                        "¿Deseas eliminar el código " + codigo + " ?");
                if (resp == 0) {
                    coleccion.Eliminar(posicion);
                    ProcesosVistaMascotas.MostrarEnTabla(vista, coleccion);
                }
            }
        }
        
        if (e.getSource() == vista.btnEditar) {
            Mascotas nuevo = ProcesosVistaMascotas.LeerMascota(vista);
            coleccion.Actualizar(nuevo, nuevo.getCodigo()); 
            ProcesosVistaMascotas.MostrarEnTabla(vista, coleccion);
        }
        
        /*if (e.getSource() == vista.btnOrdenar) {
                if (vista.cbxOrdenar.getSelectedIndex()==0 && vista.rbtnASC.isSelected()) { // Ordenar por Fecha
           
                    Citas[] listaOrdenada = InsercionOrdenamientoCitas.ordenarDueñoASC(ListaCitas.getListaCitas());//**DUEÑO ORDEN************************
                    ProcesosVistaGestion.MostaraEnTabla(vista, listaOrdenada);
                }
                if (vista.cbxOrdenar.getSelectedIndex()==0 && vista.rbtnDESC.isSelected()) {
                    
                    Citas[] listaOrdenada = InsercionOrdenamientoCitas.ordenarDueñoDESC(ListaCitas.getListaCitas());//**DUEÑO ORDEN********************************
                    ProcesosVistaGestion.MostaraEnTabla(vista, listaOrdenada);
                }
                if (vista.cbxOrdenar.getSelectedIndex()==0 && vista.rbtnASC.isSelected()) {//ordenar por ID 
                    
                    Citas[] listaOrdenada = SeleccionOrdenarCitas.ordenarPorIdCitaASC(ListaCitas.getListaCitas(), ListaCitas.getCantCitas());
                    ProcesosVistaGestion.MostaraEnTabla(vista, listaOrdenada);
                }
                if (vista.cbxOrdenar.getSelectedIndex()==0 && vista.rbtnDESC.isSelected()) {
                    
                    Citas[] listaOrdenada = SeleccionOrdenarCitas.ordenarPorIdCitaDESC(ListaCitas.getListaCitas(), ListaCitas.getCantCitas());
                    ProcesosVistaGestion.MostaraEnTabla(vista, listaOrdenada);
                }
                //NO FUNCIONA
                if (vista.cbxOrdenar.getSelectedIndex()==0 && vista.rbtnASC.isSelected()) {
                    
                    Citas[] listaOrdenada = BurbujaOrdenarCitas.OrdenarPorUrgenciaASC(ListaCitas.getListaCitas(),ListaCitas.getCantCitas());
                    ProcesosVistaGestion.MostaraEnTabla(vista, listaOrdenada);
                }
                //NO FUNCIONA
                if (vista.cbxOrdenar.getSelectedIndex()==0 && vista.rbtnDESC.isSelected()){
                    Citas[] listaOrdenada = BurbujaOrdenarCitas.OrdenarPorUrgenciaDESC(ListaCitas.getListaCitas(),ListaCitas.getCantCitas());
                    ProcesosVistaGestion.MostaraEnTabla(vista, listaOrdenada);
                }
                
                
                
            }

        if (e.getSource() == vista.btnBuscarBinaria) {
            // Ordenar primero por ID antes de hacer la búsqueda binaria
            Citas[] auxiliar = SeleccionOrdenarCitas.ordenarPorIdCitaASC(ListaCitas.getListaCitas(), ListaCitas.getCantCitas());
            String codigoBuscar = Mensajes.LeerTexto("Ingrese el código a buscar por favor");
            int posicion = BusquedaBinariaCitas.BuscarPorCodigoCita(auxiliar, codigoBuscar);
            if (posicion == -1) {
                Mensajes.MostrarTexto("ID " + codigoBuscar + " no existe en la lista...");
            } else {
                Mensajes.MostrarTexto(auxiliar[posicion].toString());
            }
        }*/
    }
    
}
