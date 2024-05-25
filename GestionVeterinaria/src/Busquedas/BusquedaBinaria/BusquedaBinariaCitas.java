
package Busquedas.BusquedaBinaria;

import Modelo.*;
public class BusquedaBinariaCitas {
    public static int BuscarPorCodigoCita(Citas[] vector, String codigobuscar) {
        int n = vector.length;
        int inferior = 0, superior = n - 1;
        while (inferior <= superior) {
            int centro = (superior + inferior) / 2;
            if (vector[centro] != null && codigobuscar.equalsIgnoreCase(vector[centro].getIdCita())) {
                return centro;
            } else {
                if (vector[centro] != null && codigobuscar.compareToIgnoreCase(vector[centro].getIdCita()) < 0)
                    superior = centro - 1;
                else
                    inferior = centro + 1;
            }
        }
        return -1;
    }
}
