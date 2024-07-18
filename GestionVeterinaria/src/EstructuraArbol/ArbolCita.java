package EstructuraArbol;

import Modelo.Citas;
import java.io.Serializable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArbolCita implements Serializable {

    private NodoCita raiz;

    public ArbolCita() {
        raiz = null;
    }

    public NodoCita getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoCita raiz) {
        this.raiz = raiz;
    }

    // Método que inserta el nodo cita al árbol ordenándolo por la fecha de la cita
    public NodoCita agregar(NodoCita nodo, Citas elemento) {
        if (nodo == null) {
            NodoCita nuevo = new NodoCita(elemento);
            return nuevo;
        } else {
            if (elemento.getFecha().compareTo(nodo.getElemento().getFecha()) > 0) {
                nodo.setDer(agregar(nodo.getDer(), elemento));
            } else {
                nodo.setIzq(agregar(nodo.getIzq(), elemento));
            }
        }
        return nodo;
    }

    
    public void agregarCita(Citas elemento) {
        raiz = agregar(raiz, elemento);
    }//fin del método

    // Método que muestra los datos del árbol en una tabla
    /*public void listarInOrder(NodoCita nodo, DefaultTableModel modelo) {
        if (nodo != null) {
            listarInOrder(nodo.getIzq(), modelo);
            modelo.addRow(nodo.getElemento().Registro(modelo.getRowCount() + 1));
            listarInOrder(nodo.getDer(), modelo);
        }
    }*/
    // Método que muestra los datos del árbol en una tabla
    public void listarInOrder(NodoCita nodo, DefaultTableModel modelo) {
        if (nodo != null) {
            listarInOrder(nodo.getIzq(), modelo);
            Citas cita = nodo.getElemento();
            Object[] fila = {
                cita.getIdCita(),
                cita.getFecha(),
                cita.getNomEmp(),
                cita.getNomMas(),
                cita.getNomDue(),
                cita.getNomSer(),
                cita.getPrecio(),
                cita.getEstado()
            };
            modelo.addRow(fila);
            listarInOrder(nodo.getDer(), modelo);
        }
    }

    public void filtrarPendientes(NodoCita nodo, DefaultTableModel modelo) {
        if (nodo != null) {
            filtrarPendientes(nodo.getIzq(), modelo);
            Citas cita = nodo.getElemento();
            Date fechaActual = new Date();

            // Solo agregar filas con fecha posterior a la fecha actual
            if (cita.getFecha().compareTo(fechaActual) > 0) {
                Object[] fila = {
                    cita.getIdCita(),
                    cita.getFecha(),
                    cita.getNomEmp(),
                    cita.getNomMas(),
                    cita.getNomDue(),
                    cita.getNomSer(),
                    cita.getPrecio(),
                    cita.getEstado()
                };
                modelo.addRow(fila);
            }
            filtrarPendientes(nodo.getDer(), modelo);
        }
    }
    
    // Método que busca una cita por ID
    public NodoCita buscarPorID(String id) {
        NodoCita aux = raiz;
        while (aux != null) {
            if (aux.getElemento().getIdCita().equals(id)) {
                return aux;
            } else {
                if (id.compareTo(aux.getElemento().getIdCita()) > 0) {
                    aux = aux.getDer();
                } else {
                    aux = aux.getIzq();
                }
            }
        }
        return null;
    }

    // Método que busca el mayor elemento del subárbol izquierdo
    public NodoCita buscarMayorIzquierda(NodoCita auxiliar) {
        if (auxiliar != null) {
            while (auxiliar.getDer() != null) {
                auxiliar = auxiliar.getDer();
            }
        }
        return auxiliar;
    }

    // Método que elimina el mayor elemento del subárbol izquierdo
    public NodoCita eliminarMayorIzquierda(NodoCita auxiliar) {
        if (auxiliar == null) {
            return null;
        } else if (auxiliar.getDer() != null) {
            auxiliar.setDer(eliminarMayorIzquierda(auxiliar.getDer()));
            return auxiliar;
        }
        return auxiliar.getIzq();
    }

    // Método que elimina un nodo del árbol
    public NodoCita eliminar(NodoCita auxiliar, String id) {
        if (auxiliar == null) {
            return null;
        }
        if (id.compareTo(auxiliar.getElemento().getIdCita()) < 0) {
            auxiliar.setIzq(eliminar(auxiliar.getIzq(), id));
        } else if (id.compareTo(auxiliar.getElemento().getIdCita()) > 0) {
            auxiliar.setDer(eliminar(auxiliar.getDer(), id));
        } else if (auxiliar.getIzq() != null && auxiliar.getDer() != null) {
            auxiliar.setElemento(buscarMayorIzquierda(auxiliar.getIzq()).getElemento());
            auxiliar.setIzq(eliminarMayorIzquierda(auxiliar.getIzq()));
        } else {
            auxiliar = (auxiliar.getIzq() != null) ? auxiliar.getIzq() : auxiliar.getDer();
        }
        System.out.println(auxiliar.getElemento().getIdCita());
        return auxiliar;
    }

    // Método para actualizar los detalles de una cita
    public void actualizarCita(Citas citaActualizada) {
        NodoCita nodo = buscarPorID(citaActualizada.getIdCita());
        if (nodo != null) {
            nodo.setElemento(citaActualizada);
        }
    }

    // Método que retorna una lista de nodos en orden (InOrder)
    public List<NodoCita> getInOrder() {
        List<NodoCita> nodos = new ArrayList<>();
        inOrderTraversal(raiz, nodos);
        return nodos;
    }

    private void inOrderTraversal(NodoCita nodo, List<NodoCita> nodos) {
        if (nodo != null) {
            inOrderTraversal(nodo.getIzq(), nodos);
            nodos.add(nodo);
            inOrderTraversal(nodo.getDer(), nodos);
        }
    }
}
