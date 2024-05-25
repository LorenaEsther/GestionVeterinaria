
package Controlador;

import Ordenamientos.OrdenamientoBurbuja.BurbujaOrdenarServicios;
import Ordenamientos.OrdenamientoInsercion.InsercionOrdenarServicios;
import Ordenamientos.OrdenamientoQuicksort.QuickSortOrdenarServicios;
import Modelo.*;
import Procesos.*;
import Persistencia.*;
import Vista.*;
import Procesos.Mensajes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorListaServicios implements ActionListener{
    
    PilasServicios pila;
    ListaServicios vista;
    public ControladorListaServicios(ListaServicios ls){
        vista = ls;
        //vista.btnOrdenar.addActionListener(this);
        vista.btnGuardar.addActionListener(this);
        vista.btnEliminar.addActionListener(this);
        vista.btnEditar.addActionListener(this);
        vista.btnBuscar.addActionListener(this);
        pila = new PilasServicios();
        pila = DatosServicios.RecuperaDeArchivo();
        ProcesosListaServicios.PresentarGestionDeServicios(vista);
        ProcesosListaServicios.MostrarEnTabla(vista, pila);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista.btnGuardar){
            pila.Agregar(ProcesosListaServicios.LeerServicio(vista));         
            ProcesosListaServicios.MostrarEnTabla(vista, pila);
            ProcesosListaServicios.LimpiarEntradas(vista);
        }   
        if(e.getSource() == vista.btnEliminar){   
            pila.Eliminar();  
            ProcesosListaServicios.MostrarEnTabla(vista, pila);
        }
        if(e.getSource()== vista.btnBuscar){
            String codbuscado = Mensajes.LeerTexto("Ingrese el codigo del servicio a buscar");
            pila.BuscarServicio(codbuscado);
        }
        if(e.getSource()== vista.btnEditar){
            Servicio nuevo = ProcesosListaServicios.LeerServicio(vista);
            pila.Actualizar(nuevo, nuevo.getCodServi());
            ProcesosListaServicios.MostrarEnTabla(vista, pila);
        }
        
        /*if (e.getSource() == vista.btnOrdenar) {
            if (vista.cbxOrdenar.getSelectedIndex()==0) { // Ordenar por CODIGO
                PilasServicios nuevaPila = InsercionOrdenarServicios.insercionCodASC(pila);
                ProcesosListaServicios.MostrarEnTabla(vista, nuevaPila);
            }
            if (vista.cbxOrdenar.getSelectedIndex()==1 ) { //Ordenar por SERVICIO
                PilasServicios nuevaPila = BurbujaOrdenarServicios.BurbujaNomASC(pila));//**DUEÑO ORDEN********************************
                ProcesosVistaGestion.MostaraEnTabla(vista, nuevaPila);
                }
            if (vista.cbxOrdenar.getSelectedIndex()==2) {//Ordenar por PRECIO
                Citas[] listaOrdenada = SeleccionOrdenarCitas.ordenarPorIdCitaASC(ListaCitas.getListaCitas(), ListaCitas.getCantCitas());
                ProcesosVistaGestion.MostaraEnTabla(vista, listaOrdenada);
                }
        */    
       
         
    }//fin action    
    
}
