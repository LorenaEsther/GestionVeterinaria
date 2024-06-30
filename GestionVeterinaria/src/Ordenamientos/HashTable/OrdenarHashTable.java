
package Ordenamientos.HashTable;

import Modelo.Citas;
import java.util.*;
public class OrdenarHashTable {
    
    /*
    // Ordenamiento por Selección
    public static List<Citas> ordenarPorSeleccion(Hashtable<String, Citas> listaCitas, Comparator<Citas> comparator, TipoOrden tipoOrden) {
        List<Citas> lista = new ArrayList<>(listaCitas.values());
        int n = lista.size();

        for (int i = 0; i < n - 1; i++) {
            int indiceSeleccionado = i;
            for (int j = i + 1; j < n; j++) {
                if (tipoOrden == TipoOrden.ASC ? comparator.compare(lista.get(j), lista.get(indiceSeleccionado)) < 0
                                               : comparator.compare(lista.get(j), lista.get(indiceSeleccionado)) > 0) {
                    indiceSeleccionado = j;
                }
            }
            Collections.swap(lista, i, indiceSeleccionado);
        }
        return lista;
    }
    
    
    // Ordenamiento por Burbuja
    public static List<Citas> ordenarPorBurbuja(Hashtable<String, Citas> listaCitas, Comparator<Citas> comparator, TipoOrden tipoOrden) {
        List<Citas> lista = new ArrayList<>(listaCitas.values());
        int n = lista.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tipoOrden == TipoOrden.ASC ? comparator.compare(lista.get(j), lista.get(j + 1)) > 0
                                               : comparator.compare(lista.get(j), lista.get(j + 1)) < 0) {
                    Collections.swap(lista, j, j + 1);
                }
            }
        }
        return lista;
    }
    */
    
    
    
}
