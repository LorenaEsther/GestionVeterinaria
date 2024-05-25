
package Ordenamientos.OrdenamientoBurbuja;

import ListasEnlazadas.ListaEnlazadaEmpleados.ListaEmpleados;
import ListasEnlazadas.ListaEnlazadaEmpleados.Nodo;
import Modelo.Empleado;

public class BurbujaOrdenarEmpleados {

    public static ListaEmpleados OrdenarPorFechaContratacionAscendente(ListaEmpleados lista) {
        Nodo inicio = lista.getInicio();
        if (inicio == null) {
            return lista;
        }

        int n = contarNodos(lista);
        for (int i = 1; i < n; i++) {
            Nodo actual = inicio;
            for (int j = 0; j < n - i; j++) {
                Nodo siguiente = actual.getSiguiente();
                if (actual.getEmpleado().getFechaContratacion().isAfter(siguiente.getEmpleado().getFechaContratacion())) {
                    // Intercambiar empleados
                    Empleado auxiliar = actual.getEmpleado();
                    actual.setEmpleado(siguiente.getEmpleado());
                    siguiente.setEmpleado(auxiliar);
                }
                actual = siguiente;
            }
        }
        return lista;
    }

    public static ListaEmpleados OrdenarPorFechaContratacionDescendente(ListaEmpleados lista) {
        Nodo inicio = lista.getInicio();
        if (inicio == null) {
            return lista;
        }

        int n = contarNodos(lista);
        for (int i = 1; i < n; i++) {
            Nodo actual = inicio;
            for (int j = 0; j < n - i; j++) {
                Nodo siguiente = actual.getSiguiente();
                if (actual.getEmpleado().getFechaContratacion().isBefore(siguiente.getEmpleado().getFechaContratacion())) {
                    // Intercambiar empleados
                    Empleado auxiliar = actual.getEmpleado();
                    actual.setEmpleado(siguiente.getEmpleado());
                    siguiente.setEmpleado(auxiliar);
                }
                actual = siguiente;
            }
        }
        return lista;
    }

    private static int contarNodos(ListaEmpleados lista) {
        Nodo actual = lista.getInicio();
        int contador = 0;
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }
}
