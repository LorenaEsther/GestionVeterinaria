
package Modelo;


public class Servicios {
    private String codServi;
    private String nomServi;
    private String detallServi;
    private double preciServi;

    public Servicios() {
    }
    public Object[] Regsitro(int num){
        Object fila[]={num,codServi,nomServi,detallServi,preciServi};
        return fila;
    }
    
    public String getCodServi() {
        return codServi;
    }

    public void setCodServi(String codServi) {
        this.codServi = codServi;
    }

    public String getNomServi() {
        return nomServi;
    }

    public void setNomServi(String nomServi) {
        this.nomServi = nomServi;
    }

    public String getDetallServi() {
        return detallServi;
    }

    public void setDetallServi(String detallServi) {
        this.detallServi = detallServi;
    }

    public double getPreciServi() {
        return preciServi;
    }

    public void setPreciServi(double preciServi) {
        this.preciServi = preciServi;
    }
    
    
    
}
