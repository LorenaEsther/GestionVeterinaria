
package Modelo;
import java.io.Serializable;

public class Servicio implements Serializable{
    private String codServi;
    private String nomServi;
    private String detallServi;
    private double preciServi;

    public Servicio() {
    }
    public Object[] Registro(int num){
        Object fila[]={num,codServi,nomServi,preciServi,detallServi};
        return fila;
    }
    public String toString() {
        return "******* DATOS SERVICIO ********" +
             "\nCodigo              : " + codServi + 
             "\nNombre del Servicio            : " + nomServi +
             "\nPrecio del Servicio         : " + preciServi +
             "\nDetalle del Servicio           : " + detallServi;
             
    }
    
    public String getCodServi() {   return codServi;    }

    public void setCodServi(String codServi) {  this.codServi = codServi;    }

    public String getNomServi() {   return nomServi;    }

    public void setNomServi(String nomServi) {    this.nomServi = nomServi;    }

    public String getDetallServi() {  return detallServi;    }

    public void setDetallServi(String detallServi) {    this.detallServi = detallServi;    }

    public double getPreciServi() {    return preciServi;    }

    public void setPreciServi(double preciServi) {    this.preciServi = preciServi;    }
    
    
    
}
