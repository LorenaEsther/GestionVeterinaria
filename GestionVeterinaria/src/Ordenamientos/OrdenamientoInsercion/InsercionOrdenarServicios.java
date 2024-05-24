
package Ordenamientos.OrdenamientoInsercion;

import Modelo.Servicio;
import java.util.LinkedList;

public class InsercionOrdenarServicios {
    
    public static LinkedList<Servicio> insercionCodASC(LinkedList<Servicio> pila) {
        LinkedList<Servicio> nuevo = new LinkedList<>();
        
        while (!pila.isEmpty()) {
            Servicio actual = pila.pop();
            int nuevoSize = nuevo.size();
            
            for (int i = 0; i < nuevoSize; i++) {
                if (nuevo.peek().getCodServi().compareTo(actual.getCodServi()) > 0) {
                    pila.push(nuevo.pop());
                } else {
                    break;
                }
            }
            
            nuevo.push(actual);
        }

        return nuevo;
    }
    
    public static LinkedList<Servicio> insercionCodDESC(LinkedList<Servicio> pila) {
        LinkedList<Servicio> nuevo = new LinkedList<>();
        
        while (!pila.isEmpty()) {
            Servicio actual = pila.pop();
            int nuevoSize = nuevo.size();
            
            for (int i = 0; i < nuevoSize; i++) {
                if (nuevo.peek().getCodServi().compareTo(actual.getCodServi()) < 0) {
                    pila.push(nuevo.pop());
                } else {
                    break;
                }
            }
            
            nuevo.push(actual);
        }

        return nuevo;
    }
}
