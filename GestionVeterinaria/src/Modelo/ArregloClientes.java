
package Modelo;

import Busquedas.BusquedaLineal.BusquedaLinealClientes;
import Persistencia.DatosClientes;
import java.io.Serializable;

public class ArregloClientes implements Serializable{
    
    private static int cantClientes=0;
    
    private Cliente[] ListaClientes;

    public ArregloClientes(){
        ListaClientes = new Cliente[50];
    }
    public void AgregarClientes(Cliente cli){
        ListaClientes [cantClientes]=cli;
        cantClientes++;
    }
    public Cliente RecuperarCliente (String codBuscado){
        int posicion = BusquedaLinealClientes.Secuencial(codBuscado, this);
        Cliente nuevo = ListaClientes[posicion];
        return nuevo;
    }
    public void EliminarClientes(int posicion){
        for(int j=posicion;j<cantClientes-1;j++){
            ListaClientes[j]=ListaClientes[j+1];
        }
        cantClientes--;
    }//fin
    
    public void Actualizar (Cliente nuevo, String codBuscado){
        int posicion = BusquedaLinealClientes.Secuencial(codBuscado,this);
        ListaClientes[posicion].setNombre(nuevo.getNombre());
        ListaClientes[posicion].setDni(nuevo.getDni());
        ListaClientes[posicion].setDireccion(nuevo.getDireccion());
        ListaClientes[posicion].setEdad(nuevo.getEdad());
        ListaClientes[posicion].setTelefono(nuevo.getTelefono());
        ListaClientes[posicion].setSexo(nuevo.getSexo());
        DatosClientes.GuardarEnArchivo(this);
    }
    
    public void ActualizarCantidadClientes(){
        cantClientes=0;
        for(Cliente cli: ListaClientes){
            if(cli!=null) cantClientes++;
        }
        
    }

    public static int getCantClientes() {
        return cantClientes;
    }

    public static void setCantClientes(int cantClientes) {
        ArregloClientes.cantClientes = cantClientes;
    }

    public Cliente[] getListaClientes() {
        return ListaClientes;
    }

    public void setListaClientes(Cliente[] ListaClientes) {
        this.ListaClientes = ListaClientes;
    }
}
    
    

    

    
