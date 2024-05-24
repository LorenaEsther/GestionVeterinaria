
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

public class ControladorEmpleado implements ActionListener{
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
        Lista = DatosEmpleados.RecuperarDeArchivo();
        ProcesosEmpleados.MostrarDatosDeLista(vEmpleado, Lista);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vistaEmpleado.btnAgregarInicio){
            Nodo nuevo = new Nodo(ProcesosEmpleados.LeerEmpleado(vistaEmpleado)); 
            Lista.AgregarNodoAlInicio(nuevo);
            ProcesosEmpleados.MostrarDatosDeLista(vistaEmpleado, Lista);
            DatosEmpleados.GuardarEnArchivo(Lista);
            ProcesosEmpleados.LimpiarEntradas(vistaEmpleado);
        }
        
        if(e.getSource() == vistaEmpleado.btnAgregarFinal){
            Nodo nuevo = new Nodo(ProcesosEmpleados.LeerEmpleado(vistaEmpleado)); 
            Lista.agregarNodoAlFinal(nuevo);
            ProcesosEmpleados.MostrarDatosDeLista(vistaEmpleado, Lista);
            DatosEmpleados.GuardarEnArchivo(Lista);
            ProcesosEmpleados.LimpiarEntradas(vistaEmpleado);
        }
        
        if(e.getSource() == vistaEmpleado.btnConsultar){
             String dniBuscado = Mensajes.LeerTexto("Ingrese el DNI a buscar :");
             actual = Lista.BuscarEmpleado(dniBuscado);
             if(actual==null){
                 Mensajes.MostrarTexto("ERROR: codigo "+dniBuscado+" no existe en la lista");                 
             }else{
                 ProcesosEmpleados.MostrarDatosNodo(actual, vistaEmpleado);
                 vistaEmpleado.txtDni.requestFocus();
             }
        }
        
        if (e.getSource() == vistaEmpleado.btnEliminar) {
            if(actual!=null){
                 int respuesta = Mensajes.Respuesta("Confirmar!!!",
                       "Desea eliminar "+actual.getEmpleado().getCodigo()+"-"+ actual.getEmpleado().getNombre()+"?");
                 if(respuesta==0){ // Si=0
                     Lista.EliminarEmpleado(actual);
                      ProcesosEmpleados.MostrarDatosDeLista(vistaEmpleado, Lista);            
                      ProcesosEmpleados.LimpiarEntradas(vistaEmpleado);
                 }
            }
        }
        
        //if(e.getSource() == vistaEmpleado.btnOrdenar){
        //    ListasEnlazadas.ListaEnlazadaEmpleados.ListaEmpleados listaOrdenada = Ordenamientos.
        //}
    }
    
}
