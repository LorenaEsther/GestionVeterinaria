
package ListasEnlazadas.ListaEnlazadaEmpleados;
import java.io.Serializable;
import Modelo.*;
public class Nodo implements Serializable{
    private Empleado empleado;
    public Nodo siguiente;
    public Nodo (Empleado e){
        this.empleado = e;
        this.siguiente = null;
        
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
