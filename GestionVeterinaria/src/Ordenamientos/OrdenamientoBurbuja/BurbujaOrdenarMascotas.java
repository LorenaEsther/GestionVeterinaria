
package Ordenamientos.OrdenamientoBurbuja;

import Modelo.Mascotas;
import java.util.ArrayList;


public class BurbujaOrdenarMascotas {
    
    public static ArrayList<Mascotas> OrdenarCodigoASC(ArrayList<Mascotas> coleccion) {
        for (int i = 0; i < coleccion.size() - 1; i++) {
            for (int j = 0; j < coleccion.size() - 1 - i; j++) {
                if (coleccion.get(j).getCodigo().compareTo(coleccion.get(j + 1).getCodigo()) > 0) {
                    Mascotas temp = coleccion.get(j);
                    coleccion.set(j, coleccion.get(j+1));
                    coleccion.set(j+1,temp);
                }
            }
        }
        return coleccion;
    }
    
    public static ArrayList<Mascotas> OrdenarCodigoDESC(ArrayList<Mascotas> coleccion) {
        for (int i = 0; i < coleccion.size() - 1; i++) {
            for (int j = 0; j < coleccion.size() - 1 - i; j++) {
                if (coleccion.get(j).getCodigo().compareTo(coleccion.get(j + 1).getCodigo()) < 0) {
                    Mascotas temp = coleccion.get(j);
                    coleccion.set(j, coleccion.get(j+1));
                    coleccion.set(j+1,temp);
                }
            }
        }
        return coleccion;
    }
    
    
}
