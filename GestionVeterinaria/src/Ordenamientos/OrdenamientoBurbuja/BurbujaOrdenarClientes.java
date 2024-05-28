package Ordenamientos.OrdenamientoBurbuja;

import Modelo.Cliente;

public class BurbujaOrdenarClientes {
    public static Cliente[] ordenarCodASC(Cliente[] listaClientes, int cantClientes) {
        for (int i = 0; i < cantClientes - 1; i++) {
            for (int j = 0; j < cantClientes - 1 - i; j++) {
                if (listaClientes[j].getCodigo().compareTo(listaClientes[j + 1].getCodigo()) > 0) {
                    Cliente temp = listaClientes[j];
                    listaClientes[j] = listaClientes[j + 1];
                    listaClientes[j + 1] = temp;
                }
            }
        }
        return listaClientes;
    }

    public static Cliente[] ordenarCodDESC(Cliente[] listaClientes, int cantClientes) {
        for (int i = 0; i < cantClientes - 1; i++) {
            for (int j = 0; j < cantClientes - 1 - i; j++) {
                if (listaClientes[j].getCodigo().compareTo(listaClientes[j + 1].getCodigo()) < 0) {
                    Cliente temp = listaClientes[j];
                    listaClientes[j] = listaClientes[j + 1];
                    listaClientes[j + 1] = temp;
                }
            }
        }
        return listaClientes;
    }
}
