
package Persistencia;
import Modelo.Citas;
import Procesos.Mensajes;
import java.io.*;
import Modelo.*;

public class DatosCitas {
    public static void GuardarEnArchivo(ArregloCitas listaCitas){
      try{
          FileOutputStream fos =  new FileOutputStream("InfoCitas.bin");
          ObjectOutputStream oos =  new ObjectOutputStream(fos);
          oos.writeObject(listaCitas);
          oos.close();
      }catch(Exception ex){
          Mensajes.MostrarTexto("ERROR no se puede guardar El arreglo.."+ex);
      }
  }//fin guardar 
    
    public static ArregloCitas RecuperaDeArchivo(){
     ArregloCitas listaCitas =  new ArregloCitas();
     try{
          FileInputStream fis =  new FileInputStream("InfoCitas.bin");
          ObjectInputStream ois =  new ObjectInputStream(fis);
          listaCitas = (ArregloCitas) ois.readObject();
          ois.close();
      }catch(Exception ex){
          Mensajes.MostrarTexto("ERROR no se puede recuperar el arreglo.."+ex);
      }
     return listaCitas;
  }//fin recuperar*/
}
