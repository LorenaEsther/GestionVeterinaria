package EstructuraArbol;

import Modelo.Citas;
import java.io.Serializable;

public class NodoCita implements Serializable {
    private Citas elemento;
    private NodoCita izq;
    private NodoCita der;

    public NodoCita(Citas elemento) {
        this.elemento = elemento;
        izq = der = null;
    }

    public Citas getElemento() { return elemento; }
    public void setElemento(Citas elemento) { this.elemento = elemento; }
    public NodoCita getIzq() { return izq; }
    public void setIzq(NodoCita izq) { this.izq = izq; }
    public NodoCita getDer() { return der; }
    public void setDer(NodoCita der) { this.der = der; }
}
