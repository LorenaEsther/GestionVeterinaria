
package Persistencia;
import Modelo.*;
import java.io.*;
import Procesos.*;
public class DatosClientes {
    public static void GuardarEnArchivo(ArregloClientes listaClientes){
      try{
          FileOutputStream fos =  new FileOutputStream("InfoClientes.bin");
          ObjectOutputStream oos =  new ObjectOutputStream(fos);
          oos.writeObject(listaClientes);
          oos.close();
      }catch(Exception ex){
          Mensajes.MostrarTexto("ERROR no se puede guardar El arreglo.."+ex);
      }
  }//fin guardar
    public static ArregloClientes RecuperaDeArchivo(){
     ArregloClientes listaClientes =  new ArregloClientes();
     try{
          FileInputStream fis =  new FileInputStream("InfoClientes.bin");
          ObjectInputStream ois =  new ObjectInputStream(fis);
          listaClientes = (ArregloClientes) ois.readObject();
          ois.close();
      }catch(Exception ex){
          Mensajes.MostrarTexto("ERROR no se puede recuperar el arreglo.."+ex);
      }
     return listaClientes;
  }//fin recuperar
}
