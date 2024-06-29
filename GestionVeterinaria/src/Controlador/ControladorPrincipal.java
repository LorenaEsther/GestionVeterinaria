
package Controlador;

import Procesos.PresentarFramePrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class ControladorPrincipal implements ActionListener {

    VistaPrincipal vprin;

    public ControladorPrincipal(VistaPrincipal vp) {
        this.vprin = vp;
        vp.setTitle("SISTEMA DE VETERINARIA-2024");
        vp.setVisible(true);
        vp.itemClientes.addActionListener(this);
        vp.itemMascotas.addActionListener(this);
        vp.itemTipos.addActionListener(this);
        vp.itemServicios.addActionListener(this);
        vp.itemProcesos.addActionListener(this);
        vp.itemEstadoCitas.addActionListener(this);
        vp.itemCuenta.addActionListener(this);
        vp.itemReporte.addActionListener(this);
        vp.itemGuia.addActionListener(this);
        vp.itemCreadores.addActionListener(this);
        vp.itemEmpleados.addActionListener(this);
        vp.itemHistorial.addActionListener(this);
        vp.itemCerrar.addActionListener(this);
    }

    public void MostrarForma(JInternalFrame internal) {
        vprin.dspEscritorio.removeAll();
        vprin.dspEscritorio.add(internal);
        vprin.dspEscritorio.revalidate(); // Asegurarse de que el layout se actualice
        internal.pack(); // Ajustar el tamaño del internal frame
        internal.setVisible(true);
        vprin.dspEscritorio.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vprin.itemClientes) {
            VistaClientes vcliente = new VistaClientes();
            vcliente.setTitle("Clientes Registrados");
            MostrarForma(vcliente);
            PresentarFramePrincipal.Centrar(vcliente, vprin.dspEscritorio);
            new ControladorClientes(vcliente);
        }
        if (e.getSource() == vprin.itemMascotas) {
            VistaMascotas vmascotas = new VistaMascotas();
            vmascotas.setTitle("Mascotas Registradas");
            MostrarForma(vmascotas);
            PresentarFramePrincipal.Centrar(vmascotas, vprin.dspEscritorio);
            new ControladorMascotas(vmascotas);
        }
        if (e.getSource() == vprin.itemCuenta) {
            VistaServicios vcuenta = new VistaServicios();
            vcuenta.setTitle("Cuenta de Servicios");
            MostrarForma(vcuenta);
            PresentarFramePrincipal.Centrar(vcuenta, vprin.dspEscritorio);
        }
        if (e.getSource() == vprin.itemProcesos) {
            VistaGestionCitas vprocesos = new VistaGestionCitas();
            vprocesos.setTitle("Procesos de Servicios");
            MostrarForma(vprocesos);
            PresentarFramePrincipal.Centrar(vprocesos, vprin.dspEscritorio);
            new ControladorCitas(vprocesos);
        }
        if (e.getSource() == vprin.itemEstadoCitas) {
            VistaEstadoCita vEstadoCita = new VistaEstadoCita();
            vEstadoCita.setTitle("Gestión del Estado de las Citas");
            MostrarForma(vEstadoCita);
            PresentarFramePrincipal.Centrar(vEstadoCita, vprin.dspEscritorio);
            new ControladorEstadoCita(vEstadoCita);
        }
        if (e.getSource() == vprin.itemReporte) {
            VistaReportesServicios vreporte = new VistaReportesServicios();
            vreporte.setTitle("Reporte de Servicios");
            MostrarForma(vreporte);
            PresentarFramePrincipal.Centrar(vreporte, vprin.dspEscritorio);
        }
        if (e.getSource() == vprin.itemEmpleados) {
            VistaEmpelado vempleados = new VistaEmpelado();
            vempleados.setTitle("Registro de Empleados con Listas Enlazadas");
            MostrarForma(vempleados);
            PresentarFramePrincipal.Centrar(vempleados, vprin.dspEscritorio);
            new ControladorEmpleado(vempleados);
        }
        if (e.getSource() == vprin.itemHistorial) {
            VistaHistorialClinico vhistorial = new VistaHistorialClinico();
            vhistorial.setTitle("Registro de Historiales Clinicos");
            MostrarForma(vhistorial);
            PresentarFramePrincipal.Centrar(vhistorial, vprin.dspEscritorio);
        }
        if (e.getSource() == vprin.itemServicios) {
            ListaServicios vLservicios = new ListaServicios();
            vLservicios.setTitle("Registro de Servicios");
            MostrarForma(vLservicios);
            PresentarFramePrincipal.Centrar(vLservicios, vprin.dspEscritorio);
            new ControladorListaServicios(vLservicios);
        }
        if (e.getSource() == vprin.itemCerrar) {
            int respuesta = JOptionPane.showConfirmDialog(vprin, "¿Estás seguro que deseas cerrar sesión?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                VistaLogin vistaLogin = new VistaLogin();
                new ControladorLogin(vistaLogin);
                vistaLogin.setVisible(true);
                vprin.dispose();
            }
        }
    }
}
