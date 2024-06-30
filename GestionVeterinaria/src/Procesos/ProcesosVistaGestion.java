
package Procesos;

import Modelo.*;
import Vista.*;
import java.util.Enumeration;

import javax.swing.table.DefaultTableModel;
public class ProcesosVistaGestion {
    public static void LimpiarEntradas(VistaGestionCitas gc){
        gc.txtIdCita.setText("");
        gc.jDateChooser1.setDate(null);
        gc.txtHora.setText("");
        gc.cbxTipo.setSelectedIndex(0);
        //gc.txtPrecioTotal.setText("");
        gc.txtPre.setText("");
        gc.txtIdEmp.setText("");
        gc.txtIdDue.setText("");
        gc.txtIdMas.setText("");
        gc.txtIdSer.setText("");
        gc.txtIdCita.requestFocus();//COLOCA EL CURSOR EN EL TEXTFIELD
    }//fin del metodo
    public static Citas LeerCitas(VistaGestionCitas vg){
        Citas ct =new Citas();
        ct.setIdCita(vg.txtIdCita.getText());
        ct.setFecha(vg.jDateChooser1.getDate());
        ct.setHora(vg.txtHora.getText());
        ct.setUrgencia(vg.cbxTipo.getSelectedItem().toString());
        ct.setPrecio(Double.parseDouble(vg.txtPre.getText()));
        ct.setCodEmp(vg.txtIdEmp.getText());
        ct.setCodDue(vg.txtIdDue.getText());
        ct.setCodMas(vg.txtIdMas.getText());
        ct.setCodSer(vg.txtIdSer.getText());
        ct.ActualizarRelaciones();
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
    
    
    public static void MostaraEnTabla(VistaGestionCitas vg,ArregloCitas ListaCitas){
        String titulos []={"Num","ID","Codigo Empl.","Nombre Empl.","Nom. Mascota","Dueño","Servicio","Precio","Urgencia","Fecha","Hora"};
        DefaultTableModel mt= new DefaultTableModel(null,titulos);
        vg.tblCitas.setModel(mt);
        int cont=0;
        Enumeration<Citas>enumer= ListaCitas.getLista().elements();
        while (enumer.hasMoreElements()) {
            cont++;
            mt.addRow(enumer.nextElement().Registro(cont));
        }
        /*for (int i=0; i<ArregloCitas.getCantCitas();i++){
            mt.addRow(a[i].Registro(i+1));                          
        }*/
    }
      
}//FIN DE LA CLASEISHON
