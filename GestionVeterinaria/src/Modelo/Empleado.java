
package Modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Empleado implements Serializable {
    private String codigo;
    private String nombre;
    private String apellidos;
    private String sexo;
    private String dni;
    private int horasLaborables;
    private LocalDate fechaContratacion;
    private String telefono;
    private String cargo;
    private BigDecimal salario;

    public Empleado() {
    }
    
    public Object[] Registro (int num) {
        Object[] fila = {num, codigo,nombre, apellidos, sexo, dni, horasLaborables, fechaContratacion, telefono, cargo, salario};
        return fila;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getHorasLaborables() {
        return horasLaborables;
    }

    public void setHorasLaborables(int horasLaborables) {
        this.horasLaborables = horasLaborables;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
    
}
