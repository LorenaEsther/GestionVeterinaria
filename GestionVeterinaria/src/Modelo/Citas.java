
package Modelo;

import java.util.Date;


public class Citas {
    
    private String idCita;
    private Date fecha;
    private String hora;
    private String urgencia;
    private double serviID;
    private double precServi;
    
    public Object[] Registro(int num){
        Object fila[]={ num, idCita,fecha,hora,urgencia,serviID,precServi};
        return fila;
    }

  
    @Override
    public String toString() {
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

    public double getServiID() {
        return serviID;
    }

    public void setServiID(double serviID) {
        this.serviID = serviID;
    }

    public double getPrecServi() {
        return precServi;
    }

    public void setPrecServi(double precServi) {
        this.precServi = precServi;
    }


    
    
}
