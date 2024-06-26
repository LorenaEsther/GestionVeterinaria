
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import javax.swing.JInternalFrame;

public class ControladorPrincipal implements ActionListener{

    VistaPrincipal vprin;
    
    public ControladorPrincipal(VistaPrincipal vp){
        this.vprin=vp;
        vp.setTitle("Programa princial - Venta de Productos");
        vp.setVisible(true);
        vp.itemClientes.addActionListener(this);
        vp.itemMascotas.addActionListener(this);
        vp.itemTipos.addActionListener(this);
        vp.itemCitas.addActionListener(this);
        vp.itemServicios.addActionListener(this);
        vp.itemGestionCitas.addActionListener(this);
        vp.itemCuenta.addActionListener(this);
        vp.itemReporte.addActionListener(this);
        vp.itemGuia.addActionListener(this);
        vp.itemCreadores.addActionListener(this);
        vp.itemEmpleados.addActionListener(this);
        vp.itemHistorial.addActionListener(this);
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
           Clientes vcliente = new Clientes();
           vcliente.setTitle("Clientes Registrados");
           MostrarForma(vcliente);           
        }        
        if(e.getSource() == vprin.itemMascotas){
           Mascotas vmascotas = new Mascotas();
           vmascotas.setTitle("Mascotas Registradas");
           MostrarForma(vmascotas);
        }
        if(e.getSource() == vprin.itemCuenta){
           CuentaSeervicios vcuenta = new CuentaSeervicios();
           vcuenta.setTitle("Cuenta de Servicios");
           MostrarForma(vcuenta);
        }
        if(e.getSource() == vprin.itemCitas){
           VistaCitas vcitas = new VistaCitas();
           vcitas.setTitle("Citas");
           MostrarForma(vcitas);
        }
        if(e.getSource() == vprin.itemGestionCitas){
           VistaGestionCita vprocesos = new VistaGestionCita();
           vprocesos.setTitle("Procesos de Servicios");
           MostrarForma(vprocesos);
        }
        if(e.getSource() == vprin.itemReporte){
           VistaReportesServicios vreporte = new VistaReportesServicios();
           vreporte.setTitle("Reporte de Servicios");
           MostrarForma(vreporte);
        }
        //EMPELADOS
        if(e.getSource() == vprin.itemEmpleados){
           VistaEmpelado vempleados = new VistaEmpelado();
           vempleados.setTitle("Registro de Empleados");
           MostrarForma(vempleados);
           } 
        //HISTORIAL
        if(e.getSource() == vprin.itemHistorial){
           VistaHistorialClinico vhistorial = new VistaHistorialClinico();
           vhistorial.setTitle("Registro de Historiales Clinicos");
           MostrarForma(vhistorial);
           }
        if(e.getSource() == vprin.itemServicios){
           VistaServicios vservicios = new VistaServicios();
           vservicios.setTitle("Registro de Servicios");
           MostrarForma(vservicios);
        }

       
    }    
    
}





