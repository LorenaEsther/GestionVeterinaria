package Ordenamientos.OrdenamientoSeleccion;

import Modelo.Cliente;

public class SeleccionOrdenarClientes {

    public static Cliente[] ordenarPorIdClienteASC(Cliente[] listaClientes, int cantClientes) {
        for (int i = 0; i < cantClientes - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < cantClientes; j++) {
                if (listaClientes[j].getCodCliente().compareTo(listaClientes[minIndex].getCodCliente()) < 0) {
                    minIndex = j;
                }
            }
            Cliente temp = listaClientes[minIndex];
            listaClientes[minIndex] = listaClientes[i];
            listaClientes[i] = temp;
        }
        return listaClientes;
    }
}
