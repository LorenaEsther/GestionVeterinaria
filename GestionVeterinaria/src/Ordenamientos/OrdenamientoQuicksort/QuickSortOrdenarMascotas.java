
package Ordenamientos.OrdenamientoQuicksort;

import Modelo.Mascotas;
import java.util.ArrayList;


public class QuickSortOrdenarMascotas {
    
    public static void OrdenarCodigoASC(ArrayList<Mascotas> A,int izq,int der){
        Mascotas pivote=A.get(izq);
        int i=izq;
        int j=der;
        Mascotas aux;
        while(i<j){
            while(A.get(i).getCodigo().compareTo(pivote.getCodigo())<=0 && i<j) i++;
            while(A.get(j).getCodigo().compareTo(pivote.getCodigo())>0) j--;
            if(i<j){
              aux=A.get(i);
              A.set(i,A.get(j));
              A.set(j,aux);
            }
        }//fin while
        A.set(izq,A.get(j));
        A.set(j,pivote);
        if(izq<j+1) OrdenarCodigoASC(A,izq,j-1);
        if(j+1<der) OrdenarCodigoASC(A,j+1,der);    
    }
    
    public static void OrdenarCodigoDESC(ArrayList<Mascotas> A,int izq,int der){
        Mascotas pivote=A.get(izq);
        int i=izq;
        int j=der;
        Mascotas aux;
        while(i<j){
            while(A.get(i).getCodigo().compareTo(pivote.getCodigo())>=0 && i<j) i++;
            while(A.get(j).getCodigo().compareTo(pivote.getCodigo())<0) j--;
            if(i<j){
              aux=A.get(i);
              A.set(i,A.get(j));
              A.set(j,aux);
            }
        }//fin while
        A.set(izq,A.get(j));
        A.set(j,pivote);
        if(izq<j+1) OrdenarCodigoDESC(A,izq,j-1);
        if(j+1<der) OrdenarCodigoDESC(A,j+1,der);            
    }
    
    
}
