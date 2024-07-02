/*package Ordenamientos.HashTable;

import Modelo.Citas;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class OrdenamientoBurbujaCitasHashTable {
    private HashMap<String, List<Citas>> table;

    public OrdenamientoBurbujaCitasHashTable() {
        table = new HashMap<>();
    }

    public void addCita(String key, Citas cita) {
        table.putIfAbsent(key, new ArrayList<>());
        table.get(key).add(cita);
    }

    public List<Citas> getCitas(String key) {
        return table.getOrDefault(key, new ArrayList<>());
    }

    public List<Citas> getAllCitas() {
        List<Citas> allCitas = new ArrayList<>();
        for (List<Citas> citasList : table.values()) {
            allCitas.addAll(citasList);
        }
        return allCitas;
    }
}*/
package Ordenamientos.HashTable;

import Modelo.Citas;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenamientoBurbujaCitasHashTable {

    // Método para ordenar una Hashtable por idCita de forma ascendente
    public static Hashtable<String, Citas> ordenarPorIdCitaASC(Hashtable<String, Citas> citas) {
        List<Citas> listaCitas = new ArrayList<>(citas.values());
        int n = listaCitas.size();
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (listaCitas.get(j).getIdCita().compareTo(listaCitas.get(j + 1).getIdCita()) > 0) {
                    Collections.swap(listaCitas, j, j + 1);
                }
            }
        }
        
        // Actualizar la Hashtable con los elementos ordenados
        Hashtable<String, Citas> citasOrdenadas = new Hashtable<>();
        for (Citas cita : listaCitas) {
            citasOrdenadas.put(cita.getIdCita(), cita);
        }
        
        return citasOrdenadas;
    }
    
    // Método para ordenar una Hashtable por idCita de forma descendente
    public static Hashtable<String, Citas> ordenarPorIdCitaDESC(Hashtable<String, Citas> citas) {
        List<Citas> listaCitas = new ArrayList<>(citas.values());
        int n = listaCitas.size();
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (listaCitas.get(j).getIdCita().compareTo(listaCitas.get(j + 1).getIdCita()) < 0) {
                    Collections.swap(listaCitas, j, j + 1);
                }
            }
        }
        
        // Actualizar la Hashtable con los elementos ordenados
        Hashtable<String, Citas> citasOrdenadas = new Hashtable<>();
        for (Citas cita : listaCitas) {
            citasOrdenadas.put(cita.getIdCita(), cita);
        }
        
        return citasOrdenadas;
    }
}

