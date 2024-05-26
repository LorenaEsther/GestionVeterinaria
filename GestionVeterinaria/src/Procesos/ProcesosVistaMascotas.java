package Procesos;

import Modelo.*;
import Vista.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProcesosVistaMascotas {
    
    public static void LimpiarEntradas(VistaMascotas vm){
        vm.txtCod.setText("");
        vm.txtNom.setText("");
        vm.txtEdad.setText("");
        vm.txtPeso.setText("");
        vm.txtEsp.setText("");
        vm.txtRaza.setText("");
        vm.txtIdDue.setText("");
        vm.cbxSexo.setSelectedIndex(0);
        vm.txtCod.requestFocus();
    }//fin del metodo
    
    public static Mascotas LeerMascota(VistaMascotas vm){
        Mascotas masc = new Mascotas();
        masc.setCodigo(vm.txtCod.getText());
        masc.setNombre(vm.txtNom.getText());
        masc.setEdad(Integer.parseInt(vm.txtEdad.getText()));
        masc.setPeso(Double.parseDouble(vm.txtPeso.getText()));
        masc.setSexo(vm.cbxSexo.getSelectedItem().toString());
        masc.setEspecie(vm.txtEsp.getText());
        masc.setRaza(vm.txtRaza.getText());
        masc.setIdDue(vm.txtIdDue.getText());
        return masc;
        
    }
    public static void PresentarGestionDeServicios(VistaMascotas vm){
        vm.setTitle("Gestion de Registro de Mascotas");
        vm.cbxSexo.removeAllItems();
        vm.cbxSexo.addItem("MACHO");
        vm.cbxSexo.addItem("HEMBRA");
    }//Fin del metodo
    
    
    public static void MostrarEnTabla(VistaMascotas vm,ColeccionMascotas cm){
        String titulos []={"Num","Codigo","Nombre","Edad","Peso","Sexo","Especie","Raza","IDdueño"};
        DefaultTableModel mt= new DefaultTableModel(null,titulos);
        vm.tblMas.setModel(mt);
        for(int i=0;i<cm.getLista().size();i++){
            Mascotas masc = cm.getLista().get(i);
            mt.addRow(masc.Registro(i+1));
        }
    }
    
}
