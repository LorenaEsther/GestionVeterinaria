
package Modelo;

import java.util.ArrayList;
import java.util.List;

public class ArregloClientes {
    private final List<Cliente> clientes;

    public ArregloClientes() {
        clientes = new ArrayList<>();
        // Inicializar con algunos datos de ejemplo
        clientes.add(new Cliente("001", "Juan Perez", "12345678", "Av. Siempre Viva 123", 30, "123456789", "M", "Masc001"));
        clientes.add(new Cliente("002", "Maria Gomez", "87654321", "Calle Falsa 456", 25, "987654321", "F", "Masc002"));
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
    
    

    

    
