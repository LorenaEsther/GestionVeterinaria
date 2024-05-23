
package Busquedas.BusquedaBinaria;

import Modelo.*;
public class BusquedaBinariaCitas {
    public static int BuscarPorCodigoCita(Citas[] vector, String codigobuscar) {
        int n = vector.length;
        int inferior = 0, superior = n - 1;
        while (inferior <= superior) {
            int centro = (superior + inferior) / 2;
            if (codigobuscar.equalsIgnoreCase(vector[centro].getIdCita())) {
                return centro;
            } else {
                if (codigobuscar.compareToIgnoreCase(vector[centro].getIdCita()) < 0)
                    superior = centro - 1;
                else
                    inferior = centro + 1;
            }
        }
        return -1;
    }
}
