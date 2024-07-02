
package Busquedas.BusquedaBinaria;

import Modelo.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class BusquedaBinariaCitasRecursiva {
   public static Citas busquedaBinariaRecursiva(List<Citas> lista, String idBuscar, int inicio, int fin) {
        if (inicio > fin) {
            return null; // No se encontró la cita
        }
        int medio = (inicio + fin) / 2;
        Citas citaMedio = lista.get(medio);
        int comparacion = idBuscar.compareTo(citaMedio.getIdCita());

        if (comparacion == 0) {
            return citaMedio; // Se encontró la cita
        } else if (comparacion < 0) {
            return busquedaBinariaRecursiva(lista, idBuscar, inicio, medio - 1);
        } else {
            return busquedaBinariaRecursiva(lista, idBuscar, medio + 1, fin);
        }
    }
    public static Citas buscarCita(ArregloCitas arregloCitas, String idBuscar) {
        List<Citas> listaCitas = new ArrayList<>(arregloCitas.getLista().values());
        Collections.sort(listaCitas, (c1, c2) -> c1.getIdCita().compareTo(c2.getIdCita()));
        return busquedaBinariaRecursiva(listaCitas, idBuscar, 0, listaCitas.size() - 1);
    }
    }
    
    /*public static int BuscarPorCodigoCita(Citas[] vector, String codigobuscar) {
        int n = ArregloCitas.getCantCitas();
        int inferior = 0, superior = n - 1;
        while (inferior <= superior) {
            int centro = (superior + inferior) / 2;
            if (codigobuscar.equalsIgnoreCase(vector[centro].getIdCita())) {
                return centro;
            } else {
                if (codigobuscar.compareToIgnoreCase(vector[centro].getIdCita()) < 0)
                    superior = centro - 1;
                else
                    inferior = centro + 1;
            }
        }
        return -1;
    }
*/

