
package Controlador;

import Modelo.PilasServicios;
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
        vista.btnNuevo.addActionListener(this);
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
            String codbuscado = Mensajes.LeerTexto("Ingrese el codigo a eliminar");
            pila.BuscarServicio(codbuscado);
        }
        
       
         
    }//fin action    
    
}
