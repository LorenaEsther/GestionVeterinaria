
package Modelo;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ArregloCitas implements Serializable{
    private Citas[] ListaCitas; 
    private ArregloServicios ListaServicios;
   
    
    private static int cantCitas=0;
    public ArregloCitas(){
        ListaCitas = new Citas[50];
    }
    public void AgregarCita(Citas ct){
        ListaCitas [cantCitas]=ct;
        cantCitas++;
    }
    public Citas RecuperarCita (int posicion){
        return ListaCitas[posicion];
    }
    public void EliminarCita(int posicion){
        for(int j=posicion;j<cantCitas-1;j++){
            ListaCitas[j]=ListaCitas[j+1];
        }
        cantCitas--;
    }//fin
    
    public void GuardarEnArchivo(){
        try {
            FileOutputStream fos= new FileOutputStream("ListaCitas.bin");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(ListaCitas);
            oos.close();
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "ERROR no se puede guarda..."+ex);
        }
    }
    
    public void ActualizarCantidadCitas(){
        cantCitas=0;
        for(Citas ct: ListaCitas){
            if(ct!=null) cantCitas++;
        }
        
    }
    public void MostratResunen(JTextArea txa){
        double suma=0;
        
        int c1=0,c2=0,c3=0;
        for(int i=0;i<cantCitas;i++){
            suma=suma +ListaCitas[i].getPrecServi();
            switch (ListaCitas[i].){
                case "ALTA PRIORIDAD": c1++;break;
                case "MODERADA PRIORIDAD" : c2++;break;
                case "BAJA PRIORIDAD" : c3++;break;
                
            }
        }
        txa.setText("Cantidad de Citas                  :"+cantCitas+
                    "\nSuma de Precios                  :"+suma+
                    "\nCitas con alta prioridad         :"+c1+
                    "\nCitas con moderada prioridad     :"+c2+
                    "\nCitas con baja prioridad         :"+c3);
                    
        
        
    }//FIN DEL METODO

    
    //GETTERS AND SETTERS
    public Citas[] getListaCitas() {return ListaCitas;}
    public void setListaCitas(Citas[] ListaCitas) {this.ListaCitas = ListaCitas; }
    public static int getCantCitas() {return cantCitas; }

    public static void setCantCitas(int acantCitas) { cantCitas = acantCitas;}//POR QUE SE QUITA EL ARREGLO?
     
}//FIN
