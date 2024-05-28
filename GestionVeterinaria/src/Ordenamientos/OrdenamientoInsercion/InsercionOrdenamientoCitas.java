
package Ordenamientos.OrdenamientoInsercion;

import Modelo.ArregloCitas;
import Modelo.Citas;

//ORDENAMIENTO POR INSERCION
public class InsercionOrdenamientoCitas {
    
    public static Citas[] ordenarDueñoASC(Citas a[]){
        for(int i=1;i<ArregloCitas.getCantCitas();i++){
            Citas value=a[i];
            int j=i;
            while(j>0 && a[j-1].getNomDue().compareTo(value.getNomDue())>0){
                a[j]= a[j-1];
                j--;
            }
            a[j] = value;
        }
        return a;
    }
    
    public static Citas[] ordenarDueñoDESC(Citas a[]){
        for(int i=1;i<ArregloCitas.getCantCitas();i++){
            Citas value=a[i];
            int j=i;
            while(j>0 && a[j-1].getNomDue().compareTo(value.getNomDue())<0){
                a[j]= a[j-1];
                j--;
            }
            a[j] = value;
        }
        return a;
    }
    
    
    
    }
