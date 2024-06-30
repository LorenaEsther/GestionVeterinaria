
package Modelo;
import Busquedas.BusquedaBinaria.BusquedaBinariaCitas;
import Ordenamientos.OrdenamientoSeleccion.SeleccionOrdenarCitas;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Persistencia.DatosCitas;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
public class ArregloCitas implements Serializable{
    private Hashtable<String,Citas> Lista;
    public ArregloCitas() {
        Lista =new Hashtable<>();
    }
    
    public void AgregarCita(Citas ct){
        getLista().put(ct.getIdCita(), ct);
        Persistencia.DatosCitas.GuardarEnArchivo(this);
        
        
    // Código de verificación
    System.out.println("Cita guardada. Verificando...");
    ArregloCitas verificacion = Persistencia.DatosCitas.RecuperaDeArchivo();
    if (verificacion.obtenerCitas(ct.getIdCita()) != null) {
        System.out.println("Cita verificada correctamente en el archivo.");
    } else {
        System.out.println("ERROR: La cita no se guardó correctamente.");
    }
    

    }
    
    public Citas obtenerCitas(String id){
        return getLista().get(id);
    }
    
    public void ActualizarCitas(Citas actualizado){
        getLista().replace(actualizado.getIdCita(), actualizado);
        Persistencia.DatosCitas.GuardarEnArchivo(this);
    }
    public void EliminarCitas(String clave){
        getLista().remove(clave);
        Persistencia.DatosCitas.GuardarEnArchivo(this);
    }
    public boolean VerificarCitas(String id){
        return getLista().containsKey(id);
    }
    
    public int CantidadCitas(){
        return getLista().size();
    }
   
    public Hashtable<String,Citas> getLista(){ return Lista;}
    
    public void setLista(Hashtable<String,Citas> Lista){ 
        this.Lista=Lista;
    }
    
    public List<Citas> getAllCitas() {
        return new ArrayList<>(Lista.values());
    }
    
    
    /*
    
    
    private Citas[] ListaCitas;*/
    
    //private static int cantCitas=0;
    /*
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
        for(int j=posicion;j<cantCitas;j++){
            ListaCitas[j]=ListaCitas[j+1];
        }
        cantCitas--;
    }//fin
   
    
    public void ActualizarCantidadCitas(){
        cantCitas=0;
        for(Citas ct: ListaCitas){
            if(ct!=null) cantCitas++;
        }
        
    }
    public void Actualizar(Citas nuevo, String codBuscado) {
    ListaCitas= SeleccionOrdenarCitas.ordenarPorIdCitaASC(this.getListaCitas(), this.getCantCitas());    
    int posicion = BusquedaBinariaCitas.BuscarPorCodigoCita(ListaCitas, codBuscado);

        ListaCitas[posicion].setIdCita(nuevo.getIdCita());
        ListaCitas[posicion].setFecha(nuevo.getFecha());
        ListaCitas[posicion].setHora(nuevo.getHora());
        ListaCitas[posicion].setUrgencia(nuevo.getUrgencia());
        ListaCitas[posicion].setPrecioTotal(nuevo.getPrecioTotal());
        ListaCitas[posicion].setCodEmp(nuevo.getCodEmp());
        ListaCitas[posicion].setNomEmp(nuevo.getNomEmp());
        ListaCitas[posicion].setCodMas(nuevo.getCodMas());
        ListaCitas[posicion].setNomMas(nuevo.getNomMas());
        ListaCitas[posicion].setCodDue(nuevo.getCodDue());
        ListaCitas[posicion].setNomDue(nuevo.getNomDue());
        ListaCitas[posicion].setCodSer(nuevo.getCodSer());
        ListaCitas[posicion].setNomSer(nuevo.getNomSer());
        DatosCitas.GuardarEnArchivo(this);
    
    
    

    
    
    
    public void MostrarResumen(JTextArea txa){
        double suma=0;
        int c1=0,c2=0,c3=0;
        for(int i=0;i<cantCitas;i++){
            suma=suma +Lista[i].getPrecioTotal(); //PRECIO TOTAL (Como atriubuto de la clase cita)................
            switch (ListaCitas[i].getUrgencia()){ //SOLO CONTARA EL TIPO DE URGENCIA DEPENDIENDO LO QUE SE SELECIONE
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
    /*
    
    public Citas[] getListaCitas() {return ListaCitas;}
    public void setListaCitas(Citas[] ListaCitas) {this.ListaCitas = ListaCitas; }
    public static int getCantCitas() {return cantCitas; }
    

    public static void setCantCitas(int acantCitas) { cantCitas = acantCitas;}//POR QUE SE QUITA EL ARREGLO?
    */
    


}
