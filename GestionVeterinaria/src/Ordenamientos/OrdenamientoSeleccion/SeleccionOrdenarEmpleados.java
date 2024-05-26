package Ordenamientos.OrdenamientoSeleccion;

import ListasEnlazadas.ListaEnlazadaEmpleados.ListaEmpleados;
import ListasEnlazadas.ListaEnlazadaEmpleados.Nodo;
import Modelo.Empleado;

public class SeleccionOrdenarEmpleados {

    public static ListaEmpleados OrdenarPorApellidoAscendente(ListaEmpleados a) {
        Nodo k;
        for (Nodo i = a.getInicio(); i != null; i = i.getSiguiente()) {
            k = i;
            for (Nodo j = i.getSiguiente(); j != null; j = j.getSiguiente()) {
                if (j.getEmpleado().getApellidos().compareTo(k.getEmpleado().getApellidos()) < 0) {
                    k = j;
                }
            }
            Empleado auxiliar = i.getEmpleado();
            i.setEmpleado(k.getEmpleado());
            k.setEmpleado(auxiliar);
        }
        return a;
    }

    public static ListaEmpleados OrdenarPorApellidoDescendente(ListaEmpleados a) {
        Nodo k;
        for (Nodo i = a.getInicio(); i != null; i = i.getSiguiente()) {
            k = i;
            for (Nodo j = i.getSiguiente(); j != null; j = j.getSiguiente()) {
                if (j.getEmpleado().getApellidos().compareTo(k.getEmpleado().getApellidos()) > 0) {
                    k = j;
                }
            }
            Empleado auxiliar = i.getEmpleado();
            i.setEmpleado(k.getEmpleado());
            k.setEmpleado(auxiliar);
        }
        return a;
    }

    public static ListaEmpleados OrdenarPorSalarioAscendente(ListaEmpleados a) {
        Nodo k;
        for (Nodo i = a.getInicio(); i != null; i = i.getSiguiente()) {
            k = i;
            for (Nodo j = i.getSiguiente(); j != null; j = j.getSiguiente()) {
                if (j.getEmpleado().getSalario().compareTo(k.getEmpleado().getSalario()) < 0) {
                    k = j;
                }
            }
            Empleado auxiliar = i.getEmpleado();
            i.setEmpleado(k.getEmpleado());
            k.setEmpleado(auxiliar);
        }
        return a;
    }

    public static ListaEmpleados OrdenarPorSalarioDescendente(ListaEmpleados a) {
        Nodo k;
        for (Nodo i = a.getInicio(); i != null; i = i.getSiguiente()) {
            k = i;
            for (Nodo j = i.getSiguiente(); j != null; j = j.getSiguiente()) {
                if (j.getEmpleado().getSalario().compareTo(k.getEmpleado().getSalario()) > 0) {
                    k = j;
                }
            }
            Empleado auxiliar = i.getEmpleado();
            i.setEmpleado(k.getEmpleado());
            k.setEmpleado(auxiliar);
        }
        return a;
    }
}
