
package Modelo;
import Busquedas.BusquedaBinaria.BusquedaBinariaMascotas;
import Persistencia.DatosMascotas;
import Procesos.Mensajes;
import java.io.Serializable;
import java.util.ArrayList;


public class ColeccionMascotas implements Serializable {
    
    private ArrayList<Mascotas> Lista;

    public ColeccionMascotas(){
        Lista =new ArrayList();
    }//fin constructor
    
    
    //método agrega un docente a la lista (add)
    public void AgregarMascota(Mascotas mas){
        Lista.add(mas);
        DatosMascotas.GuardarEnArchivo(this);
    }
    
    public void Eliminar(int posicion){
        if (Lista.isEmpty()) {
            Mensajes.MostrarTexto("La lista está vacía");
        } else {
            Mascotas eliminado = Lista.remove(posicion);
            Mensajes.MostrarTexto("El objeto eliminado en la posición " + posicion + " es \n\n" + eliminado.toString());
            DatosMascotas.GuardarEnArchivo(this);
        }    
    }
    
    public Mascotas RecuperarMascota(String codBuscado){
        int posicion = BusquedaBinariaMascotas.BuscarPorCodigo(this.getLista(), codBuscado);
        Mascotas nuevo = Lista.get(posicion);
        return nuevo;
    }
    
    public void Actualizar (Mascotas nuevo, String codBuscado){
        int posicion = BusquedaBinariaMascotas.BuscarPorCodigo(this.getLista(), codBuscado);
        Lista.get(posicion).setNombre(nuevo.getNombre());
        Lista.get(posicion).setEdad(nuevo.getEdad());
        Lista.get(posicion).setPeso(nuevo.getPeso());
        Lista.get(posicion).setSexo(nuevo.getSexo());
        Lista.get(posicion).setEspecie(nuevo.getEspecie());
        Lista.get(posicion).setRaza(nuevo.getRaza());
        Lista.get(posicion).setIdDue(nuevo.getIdDue());
        DatosMascotas.GuardarEnArchivo(this);
    }
    
    
    public ArrayList<Mascotas> getLista() { return Lista; }
    public void setLista(ArrayList<Mascotas> Lista) { this.Lista = Lista; }
    
    
}
