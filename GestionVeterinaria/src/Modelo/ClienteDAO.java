
package Modelo;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private List<Cliente> clientes;

    public ClienteDAO() {
        clientes = new ArrayList<>();
        // Inicializar con algunos datos de ejemplo
        clientes.add(new Cliente("001", "Juan Perez", "12345678", "Av. Siempre Viva 123", 30, "123456789", "M", "Masc001"));
        clientes.add(new Cliente("002", "Maria Gomez", "87654321", "Calle Falsa 456", 25, "987654321", "F", "Masc002"));
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscarCliente(String keyword) {
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo().equalsIgnoreCase(keyword) || 
                cliente.getNombre().equalsIgnoreCase(keyword) || 
                cliente.getDni().equalsIgnoreCase(keyword)) {
                return cliente;
            }
        }
        return null;
    }
    // Algoritmo de búsqueda de selección por nombre
    public Cliente buscarPorNombre(String nombre) {
        seleccionarPorNombre();
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                return cliente;
            }
        }
        return null;
    }

    private void seleccionarPorNombre() {
        int n = clientes.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (clientes.get(j).getNombre().compareTo(clientes.get(minIndex).getNombre()) < 0) {
                    minIndex = j;
                }
            }
            Cliente temp = clientes.get(minIndex);
            clientes.set(minIndex, clientes.get(i));
            clientes.set(i, temp);
        }
    }

    // Algoritmo de búsqueda burbuja por código
    public Cliente buscarPorCodigo(String codigo) {
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

    // Algoritmo de búsqueda por inserción por edad
    public Cliente buscarPorEdad(int edad) {
        insercionPorEdad();
        for (Cliente cliente : clientes) {
            if (cliente.getEdad() == edad) {
                return cliente;
            }
        }
        return null;
    }

    private void insercionPorEdad() {
        int n = clientes.size();
        for (int i = 1; i < n; i++) {
            Cliente key = clientes.get(i);
            int j = i - 1;
            while (j >= 0 && clientes.get(j).getEdad() > key.getEdad()) {
                clientes.set(j + 1, clientes.get(j));
                j = j - 1;
            }
            clientes.set(j + 1, key);
        }
    }
}
