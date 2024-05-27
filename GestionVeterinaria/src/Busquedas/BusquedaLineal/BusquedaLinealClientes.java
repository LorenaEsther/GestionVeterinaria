package Busquedas.BusquedaLineal;
import Modelo.*;

public class BusquedaLinealClientes {
    public static int Secuencial(String elemento,ArregloClientes Lista){
        int n=ArregloClientes.getCantClientes();
        int i=0;
        while(i<=n-1){
           if(elemento.equals(Lista.getListaClientes()[i].getCodigo())){
             return i;
           }
           i++;
        }//fin del while
        return -1; //indica el objeto buscado no existe
    }//fin método
}
