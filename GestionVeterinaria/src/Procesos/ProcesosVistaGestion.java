
package Procesos;

import Modelo.*;
import Vista.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class ProcesosVistaGestion {
    public static void LimpiarEntradas(VistaGestionCita gc){
        gc.txtIdCita.setText("");
        gc.dateChooser1.setDate(null);
        gc.txtHora.setText("");
        gc.cbxTipo.setSelectedIndex(0);
        
        
        gc.txtIdCita.requestFocus();
        
        
    }//fin del metodo
}
