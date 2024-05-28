package Ordenamientos.OrdenamientoInsercion;

import Modelo.*;

public class InsercionOrdenarClientes {
    
    public static Cliente[] insercionCodASC(Cliente[] arregloClientes) {
        int n = arregloClientes.length;
        Cliente[] nuevo = new Cliente[n];
        int nuevoSize = 0;
        
        for (Cliente actual : arregloClientes) {
            int i;
            for (i = nuevoSize - 1; i >= 0 && nuevo[i].compareTo(actual) > 0; i--) {
                nuevo[i + 1] = nuevo[i];
            }
            nuevo[i + 1] = actual;
            nuevoSize++;
        }

        return nuevo;
    }
    
    public static Cliente[] insercionCodDESC(Cliente[] arregloClientes) {
        int n = arregloClientes.length;
        Cliente[] nuevo = new Cliente[n];
        int nuevoSize = 0;
        
        for (Cliente actual : arregloClientes) {
            int i;
            for (i = nuevoSize - 1; i >= 0 && nuevo[i].compareTo(actual) < 0; i--) {
                nuevo[i + 1] = nuevo[i];
            }
            nuevo[i + 1] = actual;
            nuevoSize++;
        }

        return nuevo;
    }
}
