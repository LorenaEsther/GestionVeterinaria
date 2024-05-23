
package Controlador;

import Procesos.*;
import Persistencia.*;
import EstructurasListas.*;
import Vista.*;
import Procesos.Mensajes;
import java.awt.event.ActionEvent;


public class ControladorListaServicios {
    
    PilasServicios Lista;
    ListaServicios vista;
    /*public ControladorListaServicios(ListaServicios ls){
        vista = ls;
        vista.btnNuevo.addActionListener(this);
        vista.btnGuardar.addActionListener(this);
        vista.btnEliminar.addActionListener(this);
        vista.btnEditar.addActionListener(this);
        vista.btnBuscar.addActionListener(this);
        Lista = DatosServicios.RecuperaDeArchivo();
        ProcesosListaServicios.PresentarGestionDeServicios(vista);
        ProcesosListaServicios.MostrarEnTabla(vista, Lista);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.btnAgregarInicio){
            Nodo nuevo =  new Nodo(ProcesosForma02.LeerEstudiante(vista));
            Lista.AgregarNodoInicio(nuevo);
            ProcesosForma02.MostrarDatos(vista, Lista);
            DatosEstudiantes.GuardarEnArchivo(Lista);
            ProcesosForma02.LimpiarEntradas(vista);
        }
        if(e.getSource() == vista.btnAgregarFinal){
            Nodo nuevo =  new Nodo(ProcesosForma02.LeerEstudiante(vista));
            Lista.AgregarNodoFinal(nuevo);
            ProcesosForma02.MostrarDatos(vista, Lista);
            DatosEstudiantes.GuardarEnArchivo(Lista);
            ProcesosForma02.LimpiarEntradas(vista);
        }
         
        if(e.getSource() == vista.btnConsultar){
            String codbuscado = Mensajes.LeerTexto("Ingrese el codigo a buscar :");
            actual = Lista.BuscarEstudiante(codbuscado);
            if(actual==null){
                Mensajes.MostrarTexto("ERROR: codigo "+codbuscado+"no existe en la lista");                 
            }else{
                ProcesosForma02.MostrarDatosNodo(actual, vista);
                vista.txtCodigo.requestFocus();
            }
        }
        if(e.getSource()== vista.btnEliminar){
            if(actual!=null){
                int respuesta = Mensajes.Respuesta("Confirmar!!!",
                    "Desea eliminar "+actual.est.getCodigo()+"-"+actual.est.getNombres()+"?");
                if(respuesta==0){ // Si=0
                    Lista.EliminarEstudiante(actual);
                    ProcesosForma02.MostrarDatos(vista, Lista);            
                    ProcesosForma02.LimpiarEntradas(vista);
                }
            }
        }
         
        if(e.getSource()== vista.btnOrdenar){
            ListaEnlazada listaordenada = Ordenamientos.OrdernarListas.OrdenarPorCarrera(Lista);
            ProcesosForma02.MostrarDatos(vista, listaordenada);
        }  
         
        if(e.getSource()== vista.btnActualizar){
            Estudiante actualizado=ProcesosForma02.LeerEstudiante(vista);
            Lista.Actualizar(actual, actualizado);
            ProcesosForma02.MostrarDatos(vista, Lista);
            DatosEstudiantes.GuardarEnArchivo(Lista);
            ProcesosForma02.LimpiarEntradas(vista);
        }    
         
    }//fin action    
    */
}
