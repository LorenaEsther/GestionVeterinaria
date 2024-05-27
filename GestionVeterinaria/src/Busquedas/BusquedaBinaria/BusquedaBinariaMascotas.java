package Busquedas.BusquedaBinaria;

import Modelo.Mascotas;
import java.util.ArrayList;


public class BusquedaBinariaMascotas {
    
    public static int BuscarPorCodigo(ArrayList<Mascotas> coleccion,String codBuscado){
        int n=coleccion.size();
        int inferior=0,superior=n-1;
        while(inferior<=superior){
            int centro=(inferior+superior)/2;
            if(codBuscado.equalsIgnoreCase(coleccion.get(centro).getCodigo())){
                return centro;
            }else{
                if(codBuscado.compareTo(coleccion.get(centro).getCodigo())<0)
                    superior=centro-1;
                else 
                    inferior=centro+1;
          }
      }   
        return -1; //indica que no existe        
    }
    

    
}
