
package Ordenamientos;
import Modelo.*;

public class OrdenarArreglos {
    
    public static Citas[] OrdernarPorIdCita(Citas a[]){ //ORDENAMIENTO POR INSERCION.............
        for(int i=1;i<ArregloCitas.getCantCitas();i++){
            Citas value=a[i];
            int j=i;
            while(j>0 && a[j-1].getIdCita().compareTo(value.getIdCita())>0){
                a[j] = a[j-1];
                j--;
            }
            a[j] = value;
        }
        return a;
    }  
    
    
}
