
package Ordenamientos.OrdenamientoSeleccion;

import Modelo.Mascotas;
import java.util.ArrayList;


public class SeleccionOrdenarMascotas {
    
    public static ArrayList<Mascotas> OrdenarEspecieASC(ArrayList<Mascotas> arreglo) {
        int k;
        for (int i = 0; i < arreglo.size(); i++) {
            k = i;
            for (int j = i + 1; j < arreglo.size(); j++) {
                if (arreglo.get(j).getEspecie().compareTo(arreglo.get(k).getEspecie()) < 0) {
                    k = j;
                }
            }
            Mascotas aux = arreglo.get(i);
            arreglo.set(i, arreglo.get(k));
            arreglo.set(k, aux);
        }
        return arreglo;
    }

    public static ArrayList<Mascotas> OrdenarEspecieDESC(ArrayList<Mascotas> arreglo) {
        int k;
        for (int i = 0; i < arreglo.size(); i++) {
            k = i;
            for (int j = i + 1; j < arreglo.size(); j++) {
                if (arreglo.get(j).getEspecie().compareTo(arreglo.get(k).getEspecie()) > 0) {
                    k = j;
                }
            }
            Mascotas aux = arreglo.get(i);
            arreglo.set(i, arreglo.get(k));
            arreglo.set(k, aux);
        }
        return arreglo;
    }
    
    
}
