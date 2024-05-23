
package Persistencia;

import Procesos.Mensajes;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import Modelo.Servicio;
import EstructurasListas.PilasServicios;

public class DatosServicios {
    public static void GuardarEnArchivo(PilasServicios Lista){
      try{
          FileOutputStream fos =  new FileOutputStream("InfoServicios.bin");
          ObjectOutputStream oos =  new ObjectOutputStream(fos);
          oos.writeObject(Lista);
          oos.close();
      }catch(Exception ex){
          Mensajes.MostrarTexto("ERROR no se puede guardar en Pila.."+ex);
      }
  }//fin guardar 
    
  public static PilasServicios RecuperaDeArchivo(){
    PilasServicios Lista = new PilasServicios();
     try{
          FileInputStream fis =  new FileInputStream("InfoServicios.bin");
          ObjectInputStream ois =  new ObjectInputStream(fis);
          Lista = (PilasServicios) ois.readObject();
          ois.close();
      }catch(Exception ex){
          Mensajes.MostrarTexto("ERROR no se puede recuperar Pila.."+ex);
      }
     return Lista;
  }//fin recuperar
}
