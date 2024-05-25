package ListasEnlazadas.ListaEnlazadaEmpleados;

import java.io.*;

public class ListaEmpleados implements Serializable {

    private Nodo inicio;
    private Nodo fin;

    public ListaEmpleados() {
        inicio = null;
        fin = null;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

    //Metodo que agrega un nodo al inicio de la lista
    public void AgregarNodoAlInicio(Nodo nuevo) {
        if (inicio == null && fin == null) {
            inicio = fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    } // fin del metodo

    //metodo que agrega un nodo al final de la lista
    public void agregarNodoAlFinal(Nodo nuevo) {
        if (inicio == null && fin == null) {
            inicio =nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        fin.siguiente = null;
    }

    //Algoritmo para buscar un nodo por medio de su DNI
    public Nodo BuscarEmpleado(String dniBuscado) {
        Nodo auxiliar = inicio;
        while (auxiliar != null && !dniBuscado.equalsIgnoreCase(auxiliar.getEmpleado().getDni())) {
            auxiliar = auxiliar.getSiguiente();
        }
        return auxiliar;
    }
    
    //Metodo que elimina un nodo de la lista
    public void EliminarEmpleado(Nodo actual){
        Nodo anterior = inicio;
        while (anterior.siguiente != actual && anterior.siguiente != null){
            anterior = anterior.siguiente;
        }
        if (actual != null){
            if(inicio == actual){
                inicio = actual.siguiente;
            }
        else {
            anterior.siguiente = actual.siguiente;
            }
        }
    }
}