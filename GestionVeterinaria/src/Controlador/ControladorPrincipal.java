
package Controlador;

import Principal.Main;
import Procesos.PresentarFramePrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import Vista.VistaPrincipal;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;


public class ControladorPrincipal implements ActionListener{

    VistaPrincipal vprin;
    
    public ControladorPrincipal(VistaPrincipal vp){
        vprin = vp;
        vprin.setTitle("SITEMA DE VETERINARIA-2024");
        vprin.setVisible(true);
        vprin.itemClientes.addActionListener(this);
        vprin.itemMascotas.addActionListener(this);
        vprin.itemTipos.addActionListener(this);
        
        vprin.itemServicios.addActionListener(this);
        vprin.itemProcesos.addActionListener(this);
        vprin.itemCuenta.addActionListener(this);
        vprin.itemReporte.addActionListener(this);
        vprin.itemGuia.addActionListener(this);
        vprin.itemCreadores.addActionListener(this);
        vprin.itemEmpleados.addActionListener(this);
        vprin.itemHistorial.addActionListener(this);
        
        vprin.itemCerrar.addActionListener(this);
    }
    
    
    public void MostrarForma(JInternalFrame internal){
        vprin.dspEscritorio.removeAll();
        vprin.dspEscritorio.add(internal);
        internal.setVisible(true);
        vprin.dspEscritorio.repaint();       
    }  
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vprin.itemClientes){
           VistaClientes vcliente = new VistaClientes();
           vcliente.setTitle("Clientes Registrados");
           MostrarForma(vcliente);
           PresentarFramePrincipal.Centrar(vcliente,vprin.dspEscritorio);
           ControladorClientes cm = new ControladorClientes(vcliente);
        }        
        if(e.getSource() == vprin.itemMascotas){
           VistaMascotas vmascotas = new VistaMascotas();
           vmascotas.setTitle("Mascotas Registradas");
           MostrarForma(vmascotas);
           PresentarFramePrincipal.Centrar(vmascotas,vprin.dspEscritorio);
           ControladorMascotas cm = new ControladorMascotas(vmascotas);
        }
        if(e.getSource() == vprin.itemCuenta){
           VistaServicios vcuenta = new VistaServicios();
           vcuenta.setTitle("Cuenta de Servicios");
           MostrarForma(vcuenta);
           PresentarFramePrincipal.Centrar(vcuenta,vprin.dspEscritorio);
           
        }
        
        if(e.getSource() == vprin.itemProcesos){
           VistaGestionCitas vprocesos = new VistaGestionCitas();
           vprocesos.setTitle("Procesos de Servicios");
           MostrarForma(vprocesos);
           PresentarFramePrincipal.Centrar(vprocesos,vprin.dspEscritorio);
           ControladorCitas cc = new ControladorCitas(vprocesos);//DEBE HABER CODIGO
        }
        if(e.getSource() == vprin.itemReporte){
           VistaReportesServicios vreporte = new VistaReportesServicios();
           vreporte.setTitle("Reporte de Servicios");
           MostrarForma(vreporte);
           PresentarFramePrincipal.Centrar(vreporte,vprin.dspEscritorio);
        }
        //EMPELADOS
        if(e.getSource() == vprin.itemEmpleados){
           VistaEmpelado vempleados = new VistaEmpelado();
           vempleados.setTitle("Registro de Empleados con Listas Enlazadas");
           MostrarForma(vempleados);
           PresentarFramePrincipal.Centrar(vempleados,vprin.dspEscritorio);
           ControladorEmpleado controladorEmpleado = new ControladorEmpleado(vempleados);
           } 
        //HISTORIAL
        if(e.getSource() == vprin.itemHistorial){
           VistaHistorialClinico vhistorial = new VistaHistorialClinico();
           vhistorial.setTitle("Registro de Historiales Clinicos");
           MostrarForma(vhistorial);
           PresentarFramePrincipal.Centrar(vhistorial,vprin.dspEscritorio);
           }  
        //SERVICIOS
        if(e.getSource() == vprin.itemServicios){
           ListaServicios vLservicios = new ListaServicios();
           vLservicios.setTitle("Registro de Servicios");
           MostrarForma(vLservicios);
           PresentarFramePrincipal.Centrar(vLservicios,vprin.dspEscritorio);
           ControladorListaServicios cls = new ControladorListaServicios(vLservicios);
           }
       
        // Acción para cerrar sesión
        if (e.getSource() == vprin.itemCerrar) {
            int respuesta = JOptionPane.showConfirmDialog(vprin, "¿Estas seguro que deseas cerrar sesion?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                // Volver a la pantalla de login
                VistaLogin vistaLogin = new VistaLogin();
                ControladorLogin controladorLogin = new ControladorLogin(vistaLogin);
                vistaLogin.setVisible(true);
                vprin.dispose(); // Cerrar la ventana principal
            }
        }
        
        

       
    }    
    
}





