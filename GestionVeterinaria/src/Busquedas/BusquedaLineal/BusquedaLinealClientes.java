package Busquedas.BusquedaLineal;
import Modelo.*;

public class BusquedaLinealClientes {
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
}
