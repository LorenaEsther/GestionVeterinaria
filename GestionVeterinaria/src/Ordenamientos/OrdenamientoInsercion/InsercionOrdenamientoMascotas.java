
package Ordenamientos.OrdenamientoInsercion;

import Modelo.Mascotas;
import java.util.ArrayList;


public class InsercionOrdenamientoMascotas {
    
    public static ArrayList<Mascotas> OrdenarNombreASC(ArrayList<Mascotas> arreglo){
     for(int i=1;i<arreglo.size();i++){ 
         Mascotas value=arreglo.get(i); 
         int j=i;
         while(j>0 && arreglo.get(j-1).getNombre().compareTo(value.getNombre())>0){
             arreglo.set(j,arreglo.get(j-1));
             j--;
         }
         arreglo.set(j, value);
     }//fin del for           
      return arreglo; 
 }//fin del método   
    
    public static ArrayList<Mascotas> OrdenarNombreDESC(ArrayList<Mascotas> arreglo){
     for(int i=1;i<arreglo.size();i++){ 
         Mascotas value=arreglo.get(i); 
         int j=i;
         while(j>0 && arreglo.get(j-1).getNombre().compareTo(value.getNombre())<0){
             arreglo.set(j,arreglo.get(j-1));
             j--;
         }
         arreglo.set(j, value);
     }//fin del for           
      return arreglo; 
 }//fin del método   
    
}
