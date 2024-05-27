
package Persistencia;
import Modelo.*;
import java.io.*;
import Procesos.*;
public class DatosClientes {
    public static void GuardarEnArchivo(Cliente[] listaClientes){
      try{
          FileOutputStream fos =  new FileOutputStream("InfoCitas.bin");
          ObjectOutputStream oos =  new ObjectOutputStream(fos);
          oos.writeObject(listaClientes);
          oos.close();
      }catch(Exception ex){
          Mensajes.MostrarTexto("ERROR no se puede guardar El arreglo.."+ex);
      }
  }//fin guardar
}
