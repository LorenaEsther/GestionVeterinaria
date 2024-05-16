
package Modelo;
import java.io.*; //librería de archivos
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ListaEmpleados {
    public ArrayList<Empleado> Lista;
    
    public ListaEmpleados() {
        Lista = new ArrayList();
    }//fin constructor
    
    //Método que agrega un empleado a la lista (add)
    public void AgregarEmpleado(Empleado empleado){
        Lista.add(empleado);
    }
    
    //Método que guarda la lista de docentes al archivo binario
    public void GuardarEnBinario(){
        try {
            var fos = new FileOutputStream("DatosEmpleados.bin");
            var oos = new ObjectOutputStream(fos);
            oos.writeObject(Lista);
            oos.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar en archivo.."+e);
        }
    }//fin del método
    
    //Método que recupera los datos del archivo a la ListaEmpleados
    public void RecuperarEnArchivo(){
        try {
            var fis = new FileInputStream("DatosEmpleados.bin");
            var ois = new ObjectInputStream(fis);
            Lista = (ArrayList<Empleado>)ois.readObject();
            ois.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                   "ERROR al recuperar de archivo.."+e);  
        }
    }//fin de método
    
    
}
