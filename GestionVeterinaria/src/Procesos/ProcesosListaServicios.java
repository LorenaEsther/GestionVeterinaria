package Procesos;

import EstructurasListas.*;
import Modelo.*;
import Vista.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProcesosListaServicios {
    
    public static void LimpiarEntradas(ListaServicios ls){
        ls.txtCod.setText("");
        ls.txtBuscar.setText("");
        ls.areaDet.setText("");
        ls.cbxBuscar.setSelectedIndex(0);
        ls.txtPre.setText("");
        ls.txtCod.requestFocus();
    }//fin del metodo
    
    public static Servicio LeerServicio(ListaServicios ls){
        Servicio se =new Servicio();
        se.setCodServi(ls.txtCod.getText());
        se.setNomServi(ls.txtNom.getText());
        se.setDetallServi(ls.areaDet.getText());
        se.setPreciServi(Double.parseDouble(ls.txtPre.getText())); //ATRIUBUTO PRECIO TOTAL
        return se;
        
    }
    public static void PresentarGestionDeServicios(ListaServicios ls){
        ls.setTitle("Gestion de Registro de Servicios");
        ls.cbxBuscar.removeAllItems();
        ls.cbxBuscar.addItem("ALTA PRIORIDAD");
        ls.cbxBuscar.addItem("MODERADA PRIORIDAD");
        ls.cbxBuscar.addItem("BAJA PRIORIDAD");
    }//Fin del metodo
    public static void MostrarEnTabla(ListaServicios ls,Servicio[] a){
        String titulos []={"Num","Codigo","Servicio","Precio"};
        DefaultTableModel mt= new DefaultTableModel(null,titulos);
        ls.tblServ.setModel(mt);
        for (int i=0; i<ArregloCitas.getCantCitas();i++){
            mt.addRow(a[i].Registro(i+1));
        }
    }
    
}
