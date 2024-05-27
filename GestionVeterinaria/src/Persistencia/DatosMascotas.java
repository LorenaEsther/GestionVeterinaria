
package Persistencia;

import Procesos.Mensajes;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import Modelo.ColeccionMascotas;

public class DatosMascotas {
    
    public static void GuardarEnArchivo(ColeccionMascotas Lista){
      try{
          FileOutputStream fos =  new FileOutputStream("InfoMascotas.bin");
          ObjectOutputStream oos =  new ObjectOutputStream(fos);
          oos.writeObject(Lista);
          oos.close();
      }catch(Exception ex){
          Mensajes.MostrarTexto("ERROR no se puede guardar en Pila.."+ex);
      }
  }//fin guardar 
    
  public static ColeccionMascotas RecuperarDeArchivo(){
    ColeccionMascotas Lista = new ColeccionMascotas();
     try{
          FileInputStream fis =  new FileInputStream("InfoMascotas.bin");
          ObjectInputStream ois =  new ObjectInputStream(fis);
          Lista = (ColeccionMascotas) ois.readObject();
          ois.close();
      }catch(Exception ex){
          Mensajes.MostrarTexto("ERROR no se puede recuperar Pila.."+ex);
      }
     return Lista;
  }//fin recuperar
    
}
