
package Principal;

import Vista.*;
import Controlador.*;

public class Main {
    public static VistaGestionCitas vg;
    public static VistaEmpelado ve;
   public static VistaPrincipal vprin;
    public static void main(String[] args) {
        VistaLogin vistaLogin = new VistaLogin();
        ControladorLogin controladorLogin = new ControladorLogin(vistaLogin);
        
        vg=new VistaGestionCitas();
        ve = new VistaEmpelado();
       ControladorCitas cc = new ControladorCitas(vg);
        ControladorEmpleado ce = new ControladorEmpleado(ve);
    }
}
    