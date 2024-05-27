package Ordenamientos.OrdenamientoInsercion;

import Modelo.*;
import java.util.LinkedList;

public class InsercionOrdenarClientes {
    
    public static LinkedList<Cliente> insercionCodASC(LinkedList<Cliente> listaClientes) {
        LinkedList<Cliente> nuevo = new LinkedList<>();
        
        while (!listaClientes.isEmpty()) {
            Cliente actual = listaClientes.pop();
            int nuevoSize = nuevo.size();
            
            for (int i = 0; i < nuevoSize; i++) {
                if (nuevo.peek().getCodCliente().compareTo(actual.getCodCliente()) > 0) {
                    listaClientes.push(nuevo.pop());
                } else {
                    break;
                }
            }
            
            nuevo.push(actual);
        }

        return nuevo;
    }
    
    public static LinkedList<Cliente> insercionCodDESC(LinkedList<Cliente> listaClientes) {
        LinkedList<Cliente> nuevo = new LinkedList<>();
        
        while (!listaClientes.isEmpty()) {
            Cliente actual = listaClientes.pop();
            int nuevoSize = nuevo.size();
            
            for (int i = 0; i < nuevoSize; i++) {
                if (nuevo.peek().getCodCliente().compareTo(actual.getCodCliente()) < 0) {
                    listaClientes.push(nuevo.pop());
                } else {
                    break;
                }
            }
            
            nuevo.push(actual);
        }

        return nuevo;
    }
}

