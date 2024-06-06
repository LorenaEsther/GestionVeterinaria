package Ordenamientos.OrdenamientoSeleccion;

import Modelo.Cliente;

public class SeleccionOrdenarClientes {

    public static Cliente[] ordenarNombASC(Cliente[] listaClientes, int cantClientes) {
        for (int i = 0; i < cantClientes - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < cantClientes; j++) {
                if (listaClientes[j].getNombre().compareTo(listaClientes[minIndex].getNombre()) < 0) {
                    minIndex = j;
                }
            }
            Cliente temp = listaClientes[minIndex];
            listaClientes[minIndex] = listaClientes[i];
            listaClientes[i] = temp;
        }
        return listaClientes;
    }

    public static Cliente[] ordenarNombDESC(Cliente[] listaClientes, int cantCitas) {
        for (int i = 0; i < cantCitas - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < cantCitas; j++) {
                if (listaClientes[j].getNombre().compareTo(listaClientes[maxIndex].getNombre()) > 0) {
                    maxIndex = j;
                }
            }
            Cliente temp = listaClientes[maxIndex];
            listaClientes[maxIndex] = listaClientes[i];
            listaClientes[i] = temp;
        }
        return listaClientes;
    }
}
