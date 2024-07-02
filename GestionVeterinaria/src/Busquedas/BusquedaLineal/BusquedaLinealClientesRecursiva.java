package Busquedas.BusquedaLineal;

import Modelo.*;
import java.util.*;

public class BusquedaLinealClientesRecursiva {

    public static Cliente busquedaLinealRecursiva(List<Cliente> lista, String idBuscar, int indice) {
        if (indice >= lista.size()) {
            return null; // No se encontró el cliente
        }

        Cliente clienteActual = lista.get(indice);
        if (clienteActual.getCodigo().equals(idBuscar)) {
            return clienteActual; // Se encontró el cliente
        } else {
            return busquedaLinealRecursiva(lista, idBuscar, indice + 1);
        }
    }

    public static Cliente buscarCliente(ArregloClientes arregloClientes, String idBuscar) {
        List<Cliente> listaClientes = new ArrayList<>(Arrays.asList(arregloClientes.getListaClientes()));
        return busquedaLinealRecursiva(listaClientes, idBuscar, 0);
    }
}

