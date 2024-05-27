package Busquedas.BusquedaLineal;
import Modelo.*;
import Vista.Clientes;

public class BusquedaLinealClientes {
public Cliente buscarCliente(String keyword) {
        for (Cliente cliente : Clientes) {
            if (cliente.getCodigo().equalsIgnoreCase(keyword) || 
                cliente.getNombre().equalsIgnoreCase(keyword) || 
                cliente.getDni().equalsIgnoreCase(keyword)) {
                return cliente;
            }
        }
        return null;
    }    
}
