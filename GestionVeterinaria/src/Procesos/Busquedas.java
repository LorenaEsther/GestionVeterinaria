
package Procesos;

import Modelo.*;
import java.util.ArrayList;
public class Busquedas {
    public int BuscarPorCodigoCita(ArrayList<Citas> vector, String elemento){
        int n=vector.size();
        int inferior=0,superior=n-1;
        while (inferior<=superior) {
            int centro= (superior+inferior)/2;
            if(elemento.equalsIgnoreCase(vector.get(centro).getIdCita())){
                return centro;
            }
            else{
                if (elemento.compareTo(vector.get(centro).getIdCita())<0){
                    superior=centro-1;
                }
                else{
                    inferior=centro+1;
                }
            }
            
        }
        return -1;
    }
}
