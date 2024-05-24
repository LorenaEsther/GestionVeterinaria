package Persistencia;

import java.io.*;
import Procesos.*;
import ListasEnlazadas.ListaEnlazadaEmpleados.*;

public class DatosEmpleados {
    public static void GuardarEnArchivo (ListaEmpleados Lista){
        try {
            var fos = new FileOutputStream("InfoEmpleados.bin");
            var oos = new ObjectOutputStream(fos);
            oos.writeObject(Lista);
            oos.close();
        } catch (Exception e) {
            Mensajes.MostrarTexto("Error no se puede guardar Empleados"+ e);
        }
    }
    
    public static ListaEmpleados RecuperarDeArchivo(){
        var Lista = new ListaEmpleados();
        try {
            var fos = new FileInputStream("InfoEmpleados.bin");
            var ois = new ObjectInputStream(fos);
            Lista = (ListaEmpleados)ois.readObject();
            ois.close();
        } catch (Exception e) {
            Mensajes.MostrarTexto("Error no se puede recuerar Empleados"+ e);
        }
        return Lista;
    }
}
