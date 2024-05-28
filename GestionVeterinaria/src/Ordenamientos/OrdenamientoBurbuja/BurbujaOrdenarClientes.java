package Ordenamientos.OrdenamientoBurbuja;

import Modelo.Cliente;
import java.util.List;

public class BurbujaOrdenarClientes {
    private static List<Cliente> clientes;

    // Método para inicializar la lista de clientes
    public static void setClientes(List<Cliente> listaClientes) {
        clientes = listaClientes;
    }

    // Algoritmo de búsqueda burbuja por código
    public static Cliente buscarPorCodigo(String codigo) {
        burbujaPorCodigo();
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo().equalsIgnoreCase(codigo)) {
                return cliente;
            }
        }
        return null;
    }

    private static void burbujaPorCodigo() {
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
