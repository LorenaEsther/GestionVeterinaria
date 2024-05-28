package Ordenamientos.OrdenamientoInsercion;

import Modelo.*;

public class InsercionOrdenarClientes {
    
    public static Cliente[] ordenarEdadASC(Cliente[] Arreglo) {
        for(int i=1;i<ArregloClientes.getCantClientes();i++){
            Cliente value=Arreglo[i];
            int j=i;
            while(j > 0 && Arreglo[j - 1].getEdad() > value.getEdad()){
                Arreglo[j]= Arreglo[j-1];
                j--;
            }
            Arreglo[j] = value;
        }
        return Arreglo;
    }
    
    public static Cliente[] ordenarEdadDESC(Cliente[] Arreglo) {
        for(int i=1;i<ArregloClientes.getCantClientes();i++){
            Cliente value=Arreglo[i];
            int j=i;
            while(j > 0 && Arreglo[j - 1].getEdad() < value.getEdad()){
                Arreglo[j]= Arreglo[j-1];
                j--;
            }
            Arreglo[j] = value;
        }
        return Arreglo;
    }
}
