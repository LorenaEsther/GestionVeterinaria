
package Principal;

import Vista.*;
import Controlador.*;

public class Main {
   
    public static void main(String[] args) {
        VistaLogin vistaLogin = new VistaLogin();
        ControladorLogin controladorLogin = new ControladorLogin(vistaLogin);
        
    }
}

/*
package Principal;

import Modelo.Citas;
import Ordenamientos.OrdenamientoSeleccion.SeleccionOrdenarCitas;
import Ordenamientos.HashTable.OrdenamientoSeleccionCitasHashTable;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        OrdenamientoSeleccionCitasHashTable citasHashTable = new OrdenamientoSeleccionCitasHashTable();

        // Agregar algunas citas
        citasHashTable.addCita("2024-06-30 09:00", new Citas("1", new Date(), "09:00", "Alta", 100.0, 100.0, "E001", "Emp1", "M001", "Masc1", "D001", "Due1", "S001", "Ser1", "Pendiente"));
        citasHashTable.addCita("2024-06-30 10:00", new Citas("2", new Date(), "10:00", "Baja", 100.0, 100.0, "E002", "Emp2", "M002", "Masc2", "D002", "Due2", "S002", "Ser2", "Pendiente"));
        citasHashTable.addCita("2024-06-30 11:00", new Citas("3", new Date(), "11:00", "Media", 100.0, 100.0, "E003", "Emp3", "M003", "Masc3", "D003", "Due3", "S003", "Ser3", "Pendiente"));

        // Obtener todas las citas y ordenarlas por ID de cita ascendente
        List<Citas> todasLasCitas = citasHashTable.getAllCitas();
        SeleccionOrdenarCitas.ordenarPorIdCitaASC(todasLasCitas);

        // Mostrar citas ordenadas
        for (Citas cita : todasLasCitas) {
            System.out.println("Cita con ID: " + cita.getIdCita());
        }
    }
}
*/