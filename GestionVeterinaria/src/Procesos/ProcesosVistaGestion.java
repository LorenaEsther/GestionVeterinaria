
package Procesos;

import Modelo.*;
import Vista.*;

import javax.swing.table.DefaultTableModel;
public class ProcesosVistaGestion {
    public static void LimpiarEntradas(VistaGestionCitas gc){
        gc.txtIdCita.setText("");
        gc.jDateChooser1.setDate(null);
        gc.txtHora.setText("");
        gc.cbxTipo.setSelectedIndex(0);
        //gc.txtPrecioTotal.setText("");
        
        gc.txtIdCita.requestFocus();//COLOCA EL CURSOR EN EL TEXTFIELD
    }//fin del metodo
    public static Citas LeerCitas(VistaGestionCitas vg){
        Citas ct =new Citas();
        ct.setIdCita(vg.txtIdCita.getText());
        ct.setFecha(vg.jDateChooser1.getDate());
        ct.setHora(vg.txtHora.getText());
        ct.setUrgencia(vg.cbxTipo.getSelectedItem().toString());
        //ct.setPrecioTotal(Double.parseDouble(vg.txtPrecioTotal.getText())); //ATRIUBUTO PRECIO TOTAL
        return ct;
        
    }
    public static void PresentarGestionDeCitas(VistaGestionCitas vg){
        vg.setTitle("Gestion de Registro de Citas");
        vg.cbxTipo.removeAllItems();
        vg.cbxTipo.addItem("ALTA PRIORIDAD");
        vg.cbxTipo.addItem("MODERADA PRIORIDAD");
        vg.cbxTipo.addItem("BAJA PRIORIDAD");
    }//Fin del metodo
    public static void MostaraEnTabla(VistaGestionCitas vg,Citas[] a){
        String titulos []={"Num","ID","Codigo Empl.","Nombre Empl.","Nom. Mascota","Dueño","Servicio","Precio","Urgencia","Fecha","Hora"};
        DefaultTableModel mt= new DefaultTableModel(null,titulos);
        vg.tblCitas.setModel(mt);
        for (int i=0; i<ArregloCitas.getCantCitas();i++){
            mt.addRow(a[i].Registro(i+1));                          
        }
    }
    
    
}//FIN DE LA CLASEISHON
