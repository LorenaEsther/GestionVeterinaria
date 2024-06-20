package Controlador;

import Modelo.*;
import Busquedas.BusquedaBinaria.BusquedaBinariaCitas;
import Ordenamientos.OrdenamientoBurbuja.BurbujaOrdenarCitas;
import Ordenamientos.OrdenamientoInsercion.InsercionOrdenamientoCitas;
import Ordenamientos.OrdenamientoSeleccion.SeleccionOrdenarCitas;
import Persistencia.DatosCitas;
import Principal.Main;

import Vista.*;
import Procesos.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCitas implements ActionListener {
    VistaGestionCitas vista;//LISTO
    ArregloCitas ListaCitas;
   
    Citas ct;   

    public ControladorCitas(VistaGestionCitas vg) {
        vista = vg;
        
        //TRANSFERENCIA 
        vista.btnBuscar1.addActionListener(this);
        vista.setVisible(true);
        
        
        vista.btnGuardar.addActionListener(this);
        vista.btnBuscarBinaria.addActionListener(this);//BUSQUEDA DE FORMA BINARIA
        vista.btnEliminar.addActionListener(this);
        vista.btnOrdenar.addActionListener(this);
        vista.btnEditar.addActionListener(this);
        
        
        ListaCitas = new ArregloCitas(); // Inicializar el arreglo de citas
        ListaCitas = DatosCitas.RecuperaDeArchivo();//DEVUELVE LISTA DE CITAS
        ListaCitas.ActualizarCantidadCitas();
        ProcesosVistaGestion.MostaraEnTabla(vista, ListaCitas.getListaCitas());
        ListaCitas.MostrarResumen(vista.txtaResumen);
        ProcesosVistaGestion.PresentarGestionDeCitas(vista);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnGuardar) {
            ct = ProcesosVistaGestion.LeerCitas(vista);
            ListaCitas.AgregarCita(ct);
            
            DatosCitas.GuardarEnArchivo(ListaCitas);

            ProcesosVistaGestion.MostaraEnTabla(vista, ListaCitas.getListaCitas());
            ListaCitas.MostrarResumen(vista.txtaResumen);
            ProcesosVistaGestion.LimpiarEntradas(vista);
        }

        if (e.getSource() == vista.btnEliminar) {
            String elemento = Mensajes.LeerTexto("Ingrese el código a eliminar por favor...");
            int posicion = BusquedaBinariaCitas.BuscarPorCodigoCita(ListaCitas.getListaCitas(), elemento);
            if (posicion == -1) {
                Mensajes.MostrarTexto("Código " + elemento + " a eliminar no existe...");
            } else {
                int resp = Mensajes.Respuesta("Confirmar eliminación",
                        "¿Deseas eliminar el código " + elemento + " de " +
                                ListaCitas.RecuperarCita(posicion).getUrgencia() + "?");
                if (resp == 0) {
                    ListaCitas.EliminarCita(posicion);
                    DatosCitas.GuardarEnArchivo(ListaCitas);
                    ProcesosVistaGestion.MostaraEnTabla(vista, ListaCitas.getListaCitas());
                    ListaCitas.MostrarResumen(vista.txtaResumen);
                }
            }
        }
        
        if (e.getSource() == vista.btnEditar) {
        Citas nuevo = ProcesosVistaGestion.LeerCitas(vista); 
        ListaCitas.Actualizar(nuevo, nuevo.getIdCita());
        ProcesosVistaGestion.MostaraEnTabla(vista, ListaCitas.getListaCitas());
        ListaCitas.MostrarResumen(vista.txtaResumen);
        ProcesosVistaGestion.LimpiarEntradas(vista);
    }
        
        
        

        if (e.getSource() == vista.btnOrdenar) {
                if (vista.cbxOrdenar.getSelectedIndex()==1 && vista.rbtnASC.isSelected()) { // Ordenar por Fecha
           
                    Citas[] listaOrdenada = InsercionOrdenamientoCitas.ordenarDueñoASC(ListaCitas.getListaCitas());//**DUEÑO ORDEN************************
                    ProcesosVistaGestion.MostaraEnTabla(vista, listaOrdenada);
                }
                if (vista.cbxOrdenar.getSelectedIndex()==1 && vista.rbtnDESC.isSelected()) {
                    
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
                if (vista.cbxOrdenar.getSelectedIndex()==2 && vista.rbtnASC.isSelected()) {
                    
                    Citas[] listaOrdenada = BurbujaOrdenarCitas.OrdenarPorUrgenciaASC(ListaCitas.getListaCitas(),ListaCitas.getCantCitas());
                    ProcesosVistaGestion.MostaraEnTabla(vista, listaOrdenada);
                }
                //NO FUNCIONA
                if (vista.cbxOrdenar.getSelectedIndex()==2 && vista.rbtnDESC.isSelected()){
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
            
        }
        //TRANSFERENCIA
        if(e.getSource()==vista.btnBuscar1){
            VistaEmpelado vempleado = new VistaEmpelado();
            VistaPrincipal.dspEscritorio.add(vempleado);
            vempleado.toFront();
            
            vempleado.setTitle("Registro de Empleados con Listas Enlazadas");
            ControladorEmpleado controladorEmpleado = new ControladorEmpleado(vempleado);
            vempleado.setVisible(true);
            
            
        }
    }
}

