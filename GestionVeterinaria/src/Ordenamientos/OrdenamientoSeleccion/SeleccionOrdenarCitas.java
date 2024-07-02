
package Ordenamientos.OrdenamientoSeleccion;

import Modelo.ArregloCitas;
import Modelo.Citas;
import java.util.List;


/*public class SeleccionOrdenarCitas {
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
}*/

public class SeleccionOrdenarCitas {
    public static void ordenarPorIdCitaASC(List<Citas> ListaCitas) {
        int cantCitas = ListaCitas.size();
        for (int i = 0; i < cantCitas - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < cantCitas; j++) {
                if (ListaCitas.get(j).getIdCita().compareTo(ListaCitas.get(minIndex).getIdCita()) < 0) {
                    minIndex = j;
                }
            }
            Citas temp = ListaCitas.get(minIndex);
            ListaCitas.set(minIndex, ListaCitas.get(i));
            ListaCitas.set(i, temp);
        }
    }

    public static void ordenarPorIdCitaDESC(List<Citas> ListaCitas) {
        int cantCitas = ListaCitas.size();
        for (int i = 0; i < cantCitas - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < cantCitas; j++) {
                if (ListaCitas.get(j).getIdCita().compareTo(ListaCitas.get(maxIndex).getIdCita()) > 0) {
                    maxIndex = j;
                }
            }
            Citas temp = ListaCitas.get(maxIndex);
            ListaCitas.set(maxIndex, ListaCitas.get(i));
            ListaCitas.set(i, temp);
        }
    }
}
