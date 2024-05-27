
package Procesos;

import Modelo.*;
import Vista.*;

import javax.swing.table.DefaultTableModel;
public class ProcesosVistaClientes {
    public static void LimpiarEntradas(VistaClientes vc){
        vc.txtCodigo.setText("");
        vc.txtNombre.setText("");
        vc.cbxSexo.setSelectedIndex(0);
        vc.txtDni.setText("");
        vc.txtDireccion.setText("");
        vc.txtEdad.setText("");
        vc.txtTelefono.setText("");
        vc.txtCodigo.requestFocus();
    }//fin del metodo
    public static Cliente LeerClientes(VistaClientes vc){
        Cliente cli =new Cliente();
        cli.setCodigo(vc.txtCodigo.getText());
        cli.setNombre(vc.txtNombre.getText());
        cli.setSexo(vc.cbxSexo.getSelectedItem().toString());
        cli.setDni(vc.txtDni.getText());
        cli.setDireccion(vc.txtDireccion.getText());
        cli.setEdad(Integer.parseInt(vc.txtEdad.getText()));
        cli.setTelefono(vc.txtTelefono.getText());
        return cli;
        
    }
    public static void PresentarClientes(VistaClientes vc){
        vc.setTitle("Gestion de Registro de Clientes");
        vc.cbxSexo.removeAllItems();
        vc.cbxSexo.addItem("MASCULINO");
        vc.cbxSexo.addItem("FEMENINO");
        
        vc.cbxOrdenar.removeAllItems();
        vc.cbxOrdenar.addItem("CODIGO");
        vc.cbxOrdenar.addItem("NOMBRE");
        vc.cbxOrdenar.addItem("EDAD");
    }//Fin del metodo
    public static void MostaraEnTabla(VistaClientes vc,Cliente[] a){
        String titulos []={"Num","Codigo","Nombre","Dni","Direccion","Edad","Telefono","Sexo"};
        DefaultTableModel mt= new DefaultTableModel(null,titulos);
        vc.tblClientes.setModel(mt);
        for (int i=0; i<ArregloClientes.getCantClientes();i++){
            mt.addRow(a[i].Registro(i+1));                          
        }
    }
    
}
