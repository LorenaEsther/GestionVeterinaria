    
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
    
    /*
    // Ordenar por urgencia en orden ascendente
    public static Citas[] OrdenarPorUrgenciaAscendente(Citas[] ListaCitas) {
        int cantCitas = ListaCitas.length;
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
    
    // Ordenar por urgencia en orden descendente
    public static Citas[] OrdenarPorUrgenciaDescendente(Citas[] ListaCitas) {
        int cantCitas = ListaCitas.length;
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
    
    
    */
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    //Algoritmo de ordenamiento de burbuja
    public static String[] Burbuja(String[] arreglo){
        String auxiliar;
        for(int i=1;i<arreglo.length;i++){
            for(int j=0; j<arreglo.length-i;j++){
                if(arreglo[j].compareTo(arreglo[j+1])>0){
                    auxiliar=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=auxiliar;
                }//fin del if
            }//fin del 2do for
        }//fin del 1er for
        return arreglo;
    }//fin del método 
*/

