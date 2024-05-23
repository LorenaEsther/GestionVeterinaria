
package Modelo;

import java.util.Date;
import java.io.*;

public class Citas {
    
    private String idCita;
    private Date fecha;
    private String hora;
    private String urgencia;
    private double PrecioTotal ;
    
    
    public Object[] Registro(int num){
        Object fila[]={ num, idCita,fecha,hora,urgencia};
        return fila;
    }

  
    @Override
    public String toString() {//*********************************************
        return "IdCita     :"+idCita+
               "fecha     :"+fecha+
                "hora     :"+hora+
               "urgencia    :"+urgencia;
               
    }

    public String getIdCita() {
        return idCita;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    public double getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(double PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }
    
    

    


    
    
}
