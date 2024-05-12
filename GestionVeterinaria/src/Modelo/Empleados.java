
package Modelo;

import java.io.*;
import java.util.Date;


public class Empleados implements Serializable{
    private String nombre;
    private String DNI;
    private int edad;
    private Date nacimiento; // Modificación del tipo de dato
    private String telefono;
    private String sexo;
    private String cargo;

    public Empleados() {}
    
    public Object[] Registro(int num){
        Object fila[]= {
            num,nombre,DNI,edad,nacimiento,telefono,sexo,cargo};
            return fila;
    }

    @Override
    public String toString() {
        return  "\nNombre      :"+nombre+
                "\nDNI         :"+ DNI+
                "\nEdad        :"+edad+
                "\nNacimiento  :"+nacimiento+
                "\nTelefono    :"+telefono+
                "\nsexo        :"+sexo+
                "\ncargo       :"+cargo;       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
}
    
    
    
    
    
    
    
    

