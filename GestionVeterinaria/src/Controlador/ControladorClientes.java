/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.Cliente;
import Modelo.ClienteDAO;
import Vista.Clientes;

public class ControladorClientes {
    private ClienteDAO modelo;
    private Clientes vista;


public ControladorClientes(Clientes vista) {
        this.vista = vista;
        this.modelo = new ClienteDAO();
    }

    public void buscarClientePorNombre(String nombre) {
        Cliente cliente = modelo.buscarPorNombre(nombre);
        vista.mostrarCliente(cliente);
    }

    public void buscarClientePorCodigo(String codigo) {
        Cliente cliente = modelo.buscarPorCodigo(codigo);
        vista.mostrarCliente(cliente);
    }

    public void buscarClientePorEdad(int edad) {
        Cliente cliente = modelo.buscarPorEdad(edad);
        vista.mostrarCliente(cliente);
    }
}