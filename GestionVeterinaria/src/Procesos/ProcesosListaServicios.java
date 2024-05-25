package Procesos;

import Modelo.*;
import Vista.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProcesosListaServicios {
    
    public static void LimpiarEntradas(ListaServicios ls){
        ls.txtCod.setText("");
        ls.txtNom.setText("");
        ls.txtBuscar.setText("");
        ls.areaDet.setText("");
        ls.cbxOrdenar.setSelectedIndex(0);
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
        ls.cbxOrdenar.removeAllItems();
        ls.cbxOrdenar.addItem("CODIGO");
        ls.cbxOrdenar.addItem("SERVICIO");
        ls.cbxOrdenar.addItem("PRECIO");
    }//Fin del metodo
    public static void MostrarEnTabla(ListaServicios ls,PilasServicios pila){
        String titulos []={"Num","Codigo","Servicio","Precio","Detalle"};
        DefaultTableModel mt= new DefaultTableModel(null,titulos);
        ls.tblServ.setModel(mt);
        for(int i=0;i<pila.getPila().size();i++){
            Servicio ser = pila.getPila().get(i);
            mt.addRow(ser.Registro(i+1));
        }
    }
    
}
