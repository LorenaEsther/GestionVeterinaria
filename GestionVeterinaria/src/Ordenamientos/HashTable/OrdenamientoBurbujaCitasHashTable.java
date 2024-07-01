package Ordenamientos.HashTable;

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
}
