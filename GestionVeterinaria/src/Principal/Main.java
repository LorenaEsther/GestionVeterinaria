
package Principal;

import Vista.*;
import Controlador.*;

public class Main {
    public static void main(String[] args) {
        VistaLogin vistaLogin = new VistaLogin();
        ControladorLogin controladorLogin = new ControladorLogin(vistaLogin);
    }
}
    