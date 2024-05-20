
package Modelo;

public class Cliente {
    private String codigo;
    private String nombre;
    private String dni;
    private String direccion;
    private int edad;
    private String telefono;
    private String sexo;
    private String idMascota;

    public Cliente(String codigo, String nombre, String dni, String direccion, int edad, String telefono, String sexo, String idMascota) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.edad = edad;
        this.telefono = telefono;
        this.sexo = sexo;
        this.idMascota = idMascota;
    }

    // Getters y setters para cada campo
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public String getDireccion() { return direccion; }
    public int getEdad() { return edad; }
    public String getTelefono() { return telefono; }
    public String getSexo() { return sexo; }
    public String getIdMascota() { return idMascota; }
}
