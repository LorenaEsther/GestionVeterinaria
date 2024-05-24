
package Ordenamientos.OrdenamientoBurbuja;

import Modelo.Servicio;
import java.util.LinkedList;

public class BurbujaOrdenarServicios {
    
    public static void BurbujaNomASC(LinkedList<Servicio> pila) {
        int n = pila.size();

        for (int i = 0; i < n - 1; i++) {
            LinkedList<Servicio> temporal = new LinkedList<>();
            boolean isSorted = true; // Indica si la lista está ordenada

            for (int j = 0; j < n - 1 - i; j++) {
                Servicio first = pila.pop();
                Servicio second = pila.pop();

                if (first.getNomServi().compareTo(second.getNomServi()) > 0) {
                    temporal.push(first);
                    pila.push(second);
                    isSorted = false; // Si hay intercambio, la lista no está ordenada
                } else {
                    temporal.push(second);
                    pila.push(first);
                }
            }

            temporal.push(pila.pop()); // Mover el último elemento de la pila original a la temporal

            while (!temporal.isEmpty()) {
                pila.push(temporal.pop()); // Volver a poner todos los elementos en la pila original
            }

            if (isSorted) break; // Si la lista está ordenada, salir del bucle
        }
    }

    public static void BurbujaNomDESC(LinkedList<Servicio> pila) {
        int n = pila.size();

        for (int i = 0; i < n - 1; i++) {
            LinkedList<Servicio> temporal = new LinkedList<>();
            boolean isSorted = true; // Indica si la lista está ordenada

            for (int j = 0; j < n - 1 - i; j++) {
                Servicio first = pila.pop();
                Servicio second = pila.pop();

                if (first.getNomServi().compareTo(second.getNomServi()) < 0) {
                    temporal.push(first);
                    pila.push(second);
                    isSorted = false; // Si hay intercambio, la lista no está ordenada
                } else {
                    temporal.push(second);
                    pila.push(first);
                }
            }

            temporal.push(pila.pop()); // Mover el último elemento de la pila original a la temporal

            while (!temporal.isEmpty()) {
                pila.push(temporal.pop()); // Volver a poner todos los elementos en la pila original
            }

            if (isSorted) break; // Si la lista está ordenada, salir del bucle
        }
    }
}
