
package Procesos;

import Modelo.*;
import Vista.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class ProcesosVistaGestion {
    public static void LimpiarEntradas(VistaGestionCitas gc){
        gc.txtIdCita.setText("");
        gc.jDateChooser1.setDate(null);
        gc.txtHora.setText("");
        gc.cbxTipo.setSelectedIndex(0);
        
        
        
        gc.txtIdCita.requestFocus();
        
        
    }//fin del metodo
}
