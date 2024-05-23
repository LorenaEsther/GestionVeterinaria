
package Controlador;

import Modelo.*;
import Ordenamientos.OrdenamientoInsercion.InsercionOrdenamientoCitas;
import Busquedas.BusquedaBinaria.BusquedaBinariaCitas;
import Vista.*;


import Procesos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ControladorCitas  implements ActionListener{
    VistaGestionCitas vista;
    ArregloCitas ListaCitas;
    Citas ct;

    public ControladorCitas(VistaGestionCitas vg) {
        vista=vg;
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==vista.btnGuardar){
          ct= ProcesosVistaGestion.LeerCitas(vista);
          ListaCitas.AgregarCita(ct);
          ListaCitas.GuardarEnArchivo();
          
          
          
          ProcesosVistaGestion.MostaraEnTabla(vista,ListaCitas.getListaCitas());
          
          ListaCitas.MostrarResumen(vista.txtaResumen);
          ProcesosVistaGestion.LimpiarEntradas(vista);
          
        }//FIN DEL AGREGAR
        
        if(e.getSource()==vista.btnBuscarBinaria){
            Citas[] auxliar = InsercionOrdenamientoCitas.ordenarPorIDcita(ListaCitas.getListaCitas());//ENLACE EL MISMO CODIGO DE INSERCION(SIN nombre de ASC o DES)
            String codigobusca=Mensajes.LeerTexto("Ingrese el codigo a busacar por favor");
            int posicion= BusquedaBinariaCitas.BuscarPorCodigoCita(auxliar, codigobusca);
            if(posicion==-1){
                Mensajes.MostrarTexto("ID"+codigobusca+"no existe en la lista respectiva :(");
            }else{
                Mensajes.MostrarTexto(auxliar[posicion].toString());
            }  
        }//FIN DEL BUSQUEDA BINARIA
        
    }
   
}
