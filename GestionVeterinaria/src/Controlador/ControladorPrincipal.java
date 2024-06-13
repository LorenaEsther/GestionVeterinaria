
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

    //VistaPrincipal vprin;
    
    public ControladorPrincipal(VistaPrincipal vp){
        Main.vprin=vp;
        vp.setTitle("SITEMA DE VETERINARIA-2024");
        vp.setVisible(true);
        vp.itemClientes.addActionListener(this);
        vp.itemMascotas.addActionListener(this);
        vp.itemTipos.addActionListener(this);
        
        vp.itemServicios.addActionListener(this);
        vp.itemProcesos.addActionListener(this);
        vp.itemCuenta.addActionListener(this);
        vp.itemReporte.addActionListener(this);
        vp.itemGuia.addActionListener(this);
        vp.itemCreadores.addActionListener(this);
        vp.itemEmpleados.addActionListener(this);
        vp.itemHistorial.addActionListener(this);
        
        vp.itemCerrar.addActionListener(this);
    }
    
    
    public void MostrarForma(JInternalFrame internal){
        Main.vprin.dspEscritorio.removeAll();
        Main.vprin.dspEscritorio.add(internal);
        internal.setVisible(true);
        Main.vprin.dspEscritorio.repaint();       
    }  
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== Main.vprin.itemClientes){
           VistaClientes vcliente = new VistaClientes();
           vcliente.setTitle("Clientes Registrados");
           MostrarForma(vcliente);
           PresentarFramePrincipal.Centrar(vcliente,Main.vprin.dspEscritorio);
           ControladorClientes cm = new ControladorClientes(vcliente);
        }        
        if(e.getSource() == Main.vprin.itemMascotas){
           VistaMascotas vmascotas = new VistaMascotas();
           vmascotas.setTitle("Mascotas Registradas");
           MostrarForma(vmascotas);
           PresentarFramePrincipal.Centrar(vmascotas,Main.vprin.dspEscritorio);
           ControladorMascotas cm = new ControladorMascotas(vmascotas);
        }
        if(e.getSource() == Main.vprin.itemCuenta){
           VistaServicios vcuenta = new VistaServicios();
           vcuenta.setTitle("Cuenta de Servicios");
           MostrarForma(vcuenta);
           PresentarFramePrincipal.Centrar(vcuenta,Main.vprin.dspEscritorio);
           
        }
        
        if(e.getSource() == Main.vprin.itemProcesos){
           VistaGestionCitas vprocesos = new VistaGestionCitas();
           vprocesos.setTitle("Procesos de Servicios");
           MostrarForma(vprocesos);
           PresentarFramePrincipal.Centrar(vprocesos,Main.vprin.dspEscritorio);
           ControladorCitas cc = new ControladorCitas(vprocesos);//DEBE HABER CODIGO
        }
        if(e.getSource() == Main.vprin.itemReporte){
           VistaReportesServicios vreporte = new VistaReportesServicios();
           vreporte.setTitle("Reporte de Servicios");
           MostrarForma(vreporte);
           PresentarFramePrincipal.Centrar(vreporte,Main.vprin.dspEscritorio);
        }
        //EMPELADOS
        if(e.getSource() == Main.vprin.itemEmpleados){
           VistaEmpelado vempleados = new VistaEmpelado();
           vempleados.setTitle("Registro de Empleados con Listas Enlazadas");
           MostrarForma(vempleados);
           PresentarFramePrincipal.Centrar(vempleados,Main.vprin.dspEscritorio);
           ControladorEmpleado controladorEmpleado = new ControladorEmpleado(vempleados);
           } 
        //HISTORIAL
        if(e.getSource() == Main.vprin.itemHistorial){
           VistaHistorialClinico vhistorial = new VistaHistorialClinico();
           vhistorial.setTitle("Registro de Historiales Clinicos");
           MostrarForma(vhistorial);
           PresentarFramePrincipal.Centrar(vhistorial,Main.vprin.dspEscritorio);
           }  
        //SERVICIOS
        if(e.getSource() == Main.vprin.itemServicios){
           ListaServicios vLservicios = new ListaServicios();
           vLservicios.setTitle("Registro de Servicios");
           MostrarForma(vLservicios);
           PresentarFramePrincipal.Centrar(vLservicios,Main.vprin.dspEscritorio);
           ControladorListaServicios cls = new ControladorListaServicios(vLservicios);
           }
       
        // Acción para cerrar sesión
        if (e.getSource() == Main.vprin.itemCerrar) {
            int respuesta = JOptionPane.showConfirmDialog(Main.vprin, "¿Estas seguro que deseas cerrar sesion?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                // Volver a la pantalla de login
                VistaLogin vistaLogin = new VistaLogin();
                ControladorLogin controladorLogin = new ControladorLogin(vistaLogin);
                vistaLogin.setVisible(true);
                Main.vprin.dispose(); // Cerrar la ventana principal
            }
        }
        
        

       
    }    
    
}





