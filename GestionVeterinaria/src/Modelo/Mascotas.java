
package Modelo;
import java.io.Serializable;

public class Mascotas implements Serializable {

    
    private String codigo;
    private String nombre;
    private int edad;
    private double peso;
    private String sexo;
    private String especie;
    private String raza;
    private String idDue;
    
    public Mascotas() {
    }
    public Object[] Registro(int num){
        Object fila[]={num,codigo,nombre,edad,peso,sexo,especie,raza,idDue};
        return fila;
    }
    public String toString() {
        return "******* DATOS MASCOTA ********" +
             "\nCodigo Mascota              : " + codigo + 
             "\nNombre            : " + nombre +
             "\nEdad         : " + edad +
             "\nPeso         : " + peso +
             "\nSexo         : " + sexo +
             "\nEspecie         : " + especie +
             "\nRaza         : " + raza +
             "\nCodigo Dueño         : " + idDue;
             
    }
    
    
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }
    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }
    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }
    public String getIdDue() { return idDue; }
    public void setIdDue(String idDue) { this.idDue = idDue; }
    
    
    
    
    
    
    
          
    
}
