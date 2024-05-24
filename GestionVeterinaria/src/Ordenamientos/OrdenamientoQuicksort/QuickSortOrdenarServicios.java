
package Ordenamientos.OrdenamientoQuicksort;

import Modelo.Servicio;
import java.util.LinkedList;


public class QuickSortOrdenarServicios {
    
    //metodo para ordenar por precio
    public static void QuickSortPreASC(LinkedList<Servicio> pila) {
        if(pila.isEmpty()) return;
        LinkedList<Servicio> menores = new LinkedList<>();
        LinkedList<Servicio> mayores = new LinkedList<>();
        Servicio pivot = pila.pop();
        
         while (!pila.isEmpty()) {
            Servicio temp = pila.pop();
            if (temp.getPreciServi() <= pivot.getPreciServi()) {
                menores.push(temp);
            } else {
                mayores.push(temp);
            }
        }

        
        QuickSortPreASC(menores);
        QuickSortPreASC(mayores);
        
        while (!mayores.isEmpty()) {
            pila.push(mayores.pop());
        }
        pila.push(pivot);
        while (!menores.isEmpty()) {
            pila.push(menores.pop());
        }
    }
    
    public static void QuickSortPreDESC(LinkedList<Servicio> pila) {
        if(pila.isEmpty()) return;
        LinkedList<Servicio> menores = new LinkedList<>();
        LinkedList<Servicio> mayores = new LinkedList<>();
        Servicio pivot = pila.pop();
        
         while (!pila.isEmpty()) {
            Servicio temp = pila.pop();
            if (temp.getPreciServi() >= pivot.getPreciServi()) {
                menores.push(temp);
            } else {
                mayores.push(temp);
            }
        }

        
        QuickSortPreDESC(menores);
        QuickSortPreDESC(mayores);
        
        while (!mayores.isEmpty()) {
            pila.push(mayores.pop());
        }
        pila.push(pivot);
        while (!menores.isEmpty()) {
            pila.push(menores.pop());
        }
    }
}
