/*
package Ordenamientos.OrdenamientoBurbuja;
import Modelo.*;
import java.util.*;

public class BurbujaOrdenarClientes {
    // Algoritmo de búsqueda burbuja por código
    public static Cliente[] BuscarPorCodigo(String codigo) {
        burbujaPorCodigo();
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo().equalsIgnoreCase(codigo)) {
                return cliente;
            }
        }
        return null;
    }

    private void burbujaPorCodigo() {
        int n = clientes.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (clientes.get(j).getCodigo().compareTo(clientes.get(j + 1).getCodigo()) > 0) {
                    Cliente temp = clientes.get(j);
                    clientes.set(j, clientes.get(j + 1));
                    clientes.set(j + 1, temp);
                }
            }
        }
    }
}
*/