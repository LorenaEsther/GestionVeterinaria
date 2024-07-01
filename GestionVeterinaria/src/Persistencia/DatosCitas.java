
package Persistencia;
import EstructuraArbol.ArbolCita;
import Modelo.Citas;
import Procesos.Mensajes;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import Modelo.*;
import java.util.List;

public class DatosCitas {
    
    private static boolean isSyncing = false; //si esta sincronizado
    
    public static void GuardarEnArchivo(ArregloCitas listaCitas){
      try{
          FileOutputStream fos =  new FileOutputStream("InfoCitas.bin");
          ObjectOutputStream oos =  new ObjectOutputStream(fos);
          oos.writeObject(listaCitas);
          oos.close();
          
          if (!isSyncing) {
                isSyncing = true;
                sincronizarConArbol(listaCitas);
                isSyncing = false;
            }
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
  }//fin recuperar
    
    
    //NO TOCAR!! Método que sincroniza los datos del arreglo citas con arbol cita.
    private static void sincronizarConArbol(ArregloCitas listaCitas) {
        ArbolCita arbol = new ArbolCita();
        List<Citas> citas = listaCitas.getAllCitas(); 
        for (Citas cita : citas) {
            arbol.agregarCita(cita);
        }
        DatosArbolCita.guardarEnArchivo(arbol);
    }
}
