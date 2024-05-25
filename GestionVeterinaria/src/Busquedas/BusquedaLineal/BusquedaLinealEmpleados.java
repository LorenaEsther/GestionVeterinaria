
package Busquedas.BusquedaLineal;
import ListasEnlazadas.ListaEnlazadaEmpleados.Nodo;
import ListasEnlazadas.ListaEnlazadaEmpleados.ListaEmpleados;
import Modelo.Empleado;

public class BusquedaLinealEmpleados {
    public static Empleado buscarEmpleadoPorDNI(String dniBuscado, ListaEmpleados lista) {
        Nodo auxiliar = lista.getInicio();
        while (auxiliar != null) {
            if (dniBuscado.equalsIgnoreCase(auxiliar.getEmpleado().getDni())) {
                return auxiliar.getEmpleado(); // Retorna el empleado encontrado
            }
            auxiliar = auxiliar.getSiguiente();
        }
        return null; // Indica que el objeto buscado no existe
    }
}
