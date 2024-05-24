
package Persistencia;

import Modelo.Citas;
import Procesos.Mensajes;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import Modelo.*;

public class DatosCitas {
    public static void GuardarEnArchivo(Citas[] listaCitas){
      try{
          FileOutputStream fos =  new FileOutputStream("InfoEstudiantes.bin");
          ObjectOutputStream oos =  new ObjectOutputStream(fos);
          oos.writeObject(listaCitas);
          oos.close();
      }catch(Exception ex){
          Mensajes.MostrarTexto("ERROR no se puede guardar Lista Enlazada.."+ex);
      }
  }//fin guardar 
    
    public static ArregloCitas RecuperaDeArchivo(){
     ArregloCitas listaCitas =  new ArregloCitas();
     try{
          FileInputStream fis =  new FileInputStream("InfoEstudiantes.bin");
          ObjectInputStream ois =  new ObjectInputStream(fis);
          listaCitas = (ArregloCitas) ois.readObject();
          ois.close();
      }catch(Exception ex){
          Mensajes.MostrarTexto("ERROR no se puede recuperar Lista Enlazada.."+ex);
      }
     return listaCitas;
  }//fin recuperar
   
    
    
    
    
    
    
}
