
package Ordenamientos.OrdenamientoInsercion;

import Modelo.ArregloCitas;
import Modelo.Citas;

//ORDENAMIENTO POR INSERCION
public class InsercionOrdenamientoCitas {
    //ARREGLO
    
    //ESTO SERVIRIA O YA NO?****************************************************
     public static Citas[] ordenarPorIDcita(Citas a[]){
        for(int i=1;i<ArregloCitas.getCantCitas();i++){
            Citas value=a[i];
            int j=i;
            while(j<0 && a[j-1].getIdCita().compareTo(value.getIdCita())>0){
                a[j]= a[j-1];
                j--;
            }
            a[j] = value;
        }
        return a;
    }
    
    //ESTA BIEN?****************************************************
    public static Citas[] ordenarFechaASC(Citas a[]){
        for(int i=1;i<ArregloCitas.getCantCitas();i++){
            Citas value=a[i];
            int j=i;
            while(j>0 && a[j-1].getFecha().compareTo(value.getFecha())>0){
                a[j]= a[j-1];
                j--;
            }
            a[j] = value;
        }
        return a;
    }
    
    public static Citas[] ordenarFechaDESC(Citas a[]){
        for(int i=1;i<ArregloCitas.getCantCitas();i++){
            Citas value=a[i];
            int j=i;
            while(j>0 && a[j-1].getFecha().compareTo(value.getFecha())<0){
                a[j]= a[j-1];
                j--;
            }
            a[j] = value;
        }
        return a;
    }
    
    
    
    }
