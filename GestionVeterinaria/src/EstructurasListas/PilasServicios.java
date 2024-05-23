
package EstructurasListas;

import java.io.Serializable;
import Procesos.Mensajes;
import Persistencia.*;
import Modelo.Servicio;
import java.util.*;

public class PilasServicios implements Serializable{
    private LinkedList<Servicio> pila;
    public PilasServicios(){
         pila = new LinkedList();
         pila = DatosServicios.RecuperaDeArchivo().getPila();
    }
    //metodo para agregar a un operario a la pila
    public void Agregar(Servicio serv){
        pila.push(serv);
        DatosServicios.GuardarEnArchivo(this);
    }
    //metodo que elimina un objeto en la lista
    public void Eliminar(){
       if(pila.isEmpty()){
           Mensajes.MostrarTexto("La pila esta vacìa");
       }else{
           Servicio eliminado = pila.pop();
           Mensajes.MostrarTexto("El objeto eliminado es \n\n"+eliminado.toString());
       }       
    }
    //metodo que muestra el primero elemento de la pila
    public void MostrarPrimeroPila(){
        Mensajes.MostrarTexto("El primero de la pila es : \n\n"+pila.peekFirst().toString());
    }
    //mètodo que muestra el ultimo elemento de la pila
    public void MostrarUltimoPila(){
         Mensajes.MostrarTexto("El último de la pila es : \n\n"+pila.peekLast().toString());
    }
    //mètodo que busca un operario por su codigo y lo muestra en pantalla
    public void BuscarServicio(String codbuscado){
        boolean encontrado=false;
        int posicion=-1;
        for(int i=0;i<pila.size();i++){
            if(codbuscado.equalsIgnoreCase(pila.get(i).getCodServi())){
                posicion=i;
                encontrado=true;
                break;
            }
        }
        if(encontrado==false) Mensajes.MostrarTexto("Codigo "+codbuscado+" no existe en la pila");
        else Mensajes.MostrarTexto("DATO ENCONTRADO!!!! \n\n"+pila.get(posicion).toString());
    }  
   //getter y setter
    public LinkedList<Servicio> getPila() {     return pila;    }
    public void setPila(LinkedList<Servicio> pila) {   this.pila = pila;    }
}
