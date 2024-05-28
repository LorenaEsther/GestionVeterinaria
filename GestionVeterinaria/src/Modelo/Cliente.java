package Modelo;

import java.io.Serializable;

public class Cliente implements Serializable {
    private String codigo;
    private String nombre;
    private String dni;
    private String direccion;
    private int edad;
    private String telefono;
    private String sexo;

    public Cliente() {
    }

    public Object[] Registro(int num) {
        Object fila[] = {num, codigo, nombre, dni, direccion, edad, telefono, sexo};
        return fila;
    }

    @Override

    public String toString() {//*********************************************
        return "Id Codigo            :  "+codigo+
               "\nCod Nombre         :  "+nombre+
               "\nNombre DNI         :  "+dni+
               "\nNombre Direccion   :  "+direccion+
               "\nEdad               :  "+edad+
               "\ntelefono           :  "+telefono+
               "\nSexo               :  "+sexo;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public String getCodCliente() {
        return codigo;
    }

}
