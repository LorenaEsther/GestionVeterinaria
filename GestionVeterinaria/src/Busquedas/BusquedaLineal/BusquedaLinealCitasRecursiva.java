package Busquedas.BusquedaLineal;

import Modelo.*;
import java.util.*;

public class BusquedaLinealCitasRecursiva {

    public static Citas busquedaLinealRecursiva(List<Citas> lista, String idBuscar, int indice) {
        if (indice >= lista.size()) {
            return null; // No se encontró la cita
        }

        Citas citaActual = lista.get(indice);
        if (citaActual.getIdCita().equals(idBuscar)) {
            return citaActual; // Se encontró la cita
        } else {
            return busquedaLinealRecursiva(lista, idBuscar, indice + 1);
        }
    }

    public static Citas buscarCita(ArregloCitas arregloCitas, String idBuscar) {
        List<Citas> listaCitas = new ArrayList<>(arregloCitas.getLista().values());
        return busquedaLinealRecursiva(listaCitas, idBuscar, 0);
    }
}
