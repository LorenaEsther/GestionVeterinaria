    
package Ordenamientos.OrdenamientoBurbuja;

import Modelo.Citas;

public class BurbujaOrdenarCitas {
    
    
    //TIPO DE URGENCIA**********************************************************
    
    public static Citas[] OrdenarPorUrgenciaASC(Citas[] ListaCitas, int cantCitas) {
        for (int i = 0; i < cantCitas - 1; i++) {
            for (int j = 0; j < cantCitas - 1 - i; j++) {
                if (ListaCitas[j].getUrgencia().compareTo(ListaCitas[j + 1].getUrgencia()) > 0) {
                    Citas temp = ListaCitas[j];
                    ListaCitas[j] = ListaCitas[j + 1];
                    ListaCitas[j + 1] = temp;
                }
            }
        }
        return ListaCitas;
    }

    public static Citas[] OrdenarPorUrgenciaDESC(Citas[] ListaCitas, int cantCitas) {
        for (int i = 0; i < cantCitas - 1; i++) {
            for (int j = 0; j < cantCitas - 1 - i; j++) {
                if (ListaCitas[j].getUrgencia().compareTo(ListaCitas[j + 1].getUrgencia()) < 0) {
                    Citas temp = ListaCitas[j];
                    ListaCitas[j] = ListaCitas[j + 1];
                    ListaCitas[j + 1] = temp;
                }
            }
        }
        return ListaCitas;
    }
}
    


