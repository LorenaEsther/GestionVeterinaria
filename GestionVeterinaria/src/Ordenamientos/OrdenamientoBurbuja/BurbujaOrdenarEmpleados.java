package Ordenamientos.OrdenamientoBurbuja;

import ListasEnlazadas.ListaEnlazadaEmpleados.ListaEmpleados;
import ListasEnlazadas.ListaEnlazadaEmpleados.Nodo;
import Modelo.Empleado;
import java.math.BigDecimal;

public class BurbujaOrdenarEmpleados {

    // Método de burbuja para ordenar empleados por código en orden ascendente
    public static ListaEmpleados OrdenarPorCodigoAscendente(ListaEmpleados lista) {
        if (lista.getInicio() == null || lista.getInicio().getSiguiente() == null) {
            return lista; // Lista vacía o con un solo elemento, ya está ordenada
        }

        boolean intercambiado = true;
        while (intercambiado) {
            intercambiado = false;
            Nodo actual = lista.getInicio();
            Nodo siguiente = actual.getSiguiente();

            while (siguiente != null) {
                String codigoActual = actual.getEmpleado().getCodigo();
                String codigoSiguiente = siguiente.getEmpleado().getCodigo();

                if (codigoActual.compareToIgnoreCase(codigoSiguiente) > 0) {
                    // Intercambiar actual y siguiente
                    Empleado temp = actual.getEmpleado();
                    actual.setEmpleado(siguiente.getEmpleado());
                    siguiente.setEmpleado(temp);
                    intercambiado = true;
                }
                actual = siguiente;
                siguiente = siguiente.getSiguiente();
            }
        }

        return lista;
    }

    // Método de burbuja para ordenar empleados por código en orden descendente
    public static ListaEmpleados OrdenarPorCodigoDescendente(ListaEmpleados lista) {
        if (lista.getInicio() == null || lista.getInicio().getSiguiente() == null) {
            return lista; // Lista vacía o con un solo elemento, ya está ordenada
        }

        boolean intercambiado = true;
        while (intercambiado) {
            intercambiado = false;
            Nodo actual = lista.getInicio();
            Nodo siguiente = actual.getSiguiente();

            while (siguiente != null) {
                String codigoActual = actual.getEmpleado().getCodigo();
                String codigoSiguiente = siguiente.getEmpleado().getCodigo();

                if (codigoActual.compareToIgnoreCase(codigoSiguiente) < 0) {
                    // Intercambiar actual y siguiente
                    Empleado temp = actual.getEmpleado();
                    actual.setEmpleado(siguiente.getEmpleado());
                    siguiente.setEmpleado(temp);
                    intercambiado = true;
                }
                actual = siguiente;
                siguiente = siguiente.getSiguiente();
            }
        }

        return lista;
    }

}
