
package Ordenamientos.OrdenamientoSeleccion;

import Modelo.ArregloCitas;
import Modelo.Citas;


public class SeleccionOrdenarCitas {
    //ESTARA BIEN ?****************************************************************faltan importar paquetes
    public static Citas[] ordenarPorIdCitaASC(Citas[] ListaCitas, int cantCitas) {
        for (int i = 0; i < cantCitas - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < cantCitas; j++) {
                if (ListaCitas[j].getIdCita().compareTo(ListaCitas[minIndex].getIdCita()) < 0) {
                    minIndex = j;
                }
            }
            Citas temp = ListaCitas[minIndex];
            ListaCitas[minIndex] = ListaCitas[i];
            ListaCitas[i] = temp;
        }
        return ListaCitas;
    }

    public static Citas[] ordenarPorIdCitaDESC(Citas[] ListaCitas, int cantCitas) {
        for (int i = 0; i < cantCitas - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < cantCitas; j++) {
                if (ListaCitas[j].getIdCita().compareTo(ListaCitas[maxIndex].getIdCita()) > 0) {
                    maxIndex = j;
                }
            }
            Citas temp = ListaCitas[maxIndex];
            ListaCitas[maxIndex] = ListaCitas[i];
            ListaCitas[i] = temp;
        }
        return ListaCitas;
    }
}
