package Controlador;

import Modelo.*;
import Busquedas.BusquedaBinaria.BusquedaBinariaCitas;
import Ordenamientos.OrdenamientoBurbuja.BurbujaOrdenarCitas;
import Ordenamientos.OrdenamientoInsercion.InsercionOrdenamientoCitas;
import Ordenamientos.OrdenamientoSeleccion.SeleccionOrdenarCitas;
import Persistencia.DatosCitas;


import Vista.*;
import Procesos.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCitas implements ActionListener {
    VistaGestionCitas vista; 
    ArregloCitas ListaCitas;
    String id;
    Citas ct;   

    public ControladorCitas(VistaGestionCitas vg) {
        vista = vg;
        
        //TRANSFERENCIA 
        //vista.btnBuscar1.addActionListener(this);
        //vista.setVisible(true);
        
        
        vista.btnGuardar.addActionListener(this);
        vista.btnBuscarBinaria.addActionListener(this);//BUSQUEDA DE FORMA BINARIA
        vista.btnEliminar.addActionListener(this);
        vista.btnOrdenar.addActionListener(this);
        vista.btnEditar.addActionListener(this);
        vista.btnConsultar.addActionListener(this);
        
        
        
        ListaCitas = new ArregloCitas(); // Inicializar el arreglo de citas
        ListaCitas = DatosCitas.RecuperaDeArchivo();//DEVUELVE LISTA DE CITAS
        System.out.println("Citas cargadas al iniciar: " + ListaCitas.CantidadCitas());
        //ListaCitas.ActualizarCantidadCitas();
        //ProcesosVistaGestion.MostaraEnTabla(vista, ListaCitas.getListaCitas());
        //ListaCitas.MostrarResumen(vista.txtaResumen);
        ProcesosVistaGestion.PresentarGestionDeCitas(vista);
        ActualizarVistaCitas();
    }
    private void ActualizarVistaCitas(){
        ProcesosVistaGestion.MostaraEnTabla(vista, ListaCitas);
        ProcesosVistaGestion.LimpiarEntradas(vista);
        vista.lblcantCitas.setText("Cantidad de Citas:"+ListaCitas.CantidadCitas());
        
    
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnGuardar) {
            ct = ProcesosVistaGestion.LeerCitas(vista);
            ListaCitas.AgregarCita(ct);
            DatosCitas.GuardarEnArchivo(ListaCitas);

            //ProcesosVistaGestion.MostaraEnTabla(vista, ListaCitas.getListaCitas());
            //ListaCitas.MostrarResumen(vista.txtaResumen);
            ProcesosVistaGestion.LimpiarEntradas(vista);
            ActualizarVistaCitas();
        }
        
        
        if (e.getSource() == vista.btnConsultar) {
            id=Mensajes.LeerTexto("Ingrese el ID a consultar:");
            boolean existe= ListaCitas.VerificarCitas(id);
            if (existe==false) {
                Mensajes.MostrarTexto("El ID"+id+" no existe en la tabla");
            }else{
                ct=ListaCitas.obtenerCitas(id);
                vista.txtIdCita.setText(ct.getIdCita());
                vista.txtIdEmp.setText(ct.getCodEmp());
                vista.txtIdMas.setText(ct.getCodMas());
                vista.txtIdDue.setText(ct.getCodDue());
                vista.txtIdSer.setText(ct.getCodSer());
                vista.jDateChooser1.setDate(ct.getFecha());
                vista.txtPre.setText(String.valueOf(ct.getPrecio()));
                vista.txtHora.setText(ct.getHora());
                switch (ct.getUrgencia()) {
                    case "ALTA PRIORIDAD ":vista.cbxTipo.setSelectedIndex(0);break;
                    case "MEDIANA PRIORIDAD ":vista.cbxTipo.setSelectedIndex(1);break;
                    case "BAJA PRIORIDAD ":vista.cbxTipo.setSelectedIndex(2);break;
                }
            }      
        }
        
        
        if (e.getSource() == vista.btnEditar) {
            ct = ProcesosVistaGestion.LeerCitas(vista); 
            ListaCitas.ActualizarCitas(ct);
            Mensajes.MostrarTexto("Registro actualizado...");
            DatosCitas.GuardarEnArchivo(ListaCitas);
            ActualizarVistaCitas();
            //ProcesosVistaGestion.MostaraEnTabla(vista, ListaCitas.getListaCitas());
            //ListaCitas.MostrarResumen(vista.txtaResumen);
            //ProcesosVistaGestion.LimpiarEntradas(vista);
        }
        
        if (e.getSource() == vista.btnEliminar) {
            int respuesta= Mensajes.Respuesta("RESPONDER POR FAVOR...!",
                                    "Deseas eliminar:"+id+"?");
            if(respuesta==0){
                ListaCitas.EliminarCitas(id);
                Mensajes.MostrarTexto("Registro eliminado...");
                DatosCitas.GuardarEnArchivo(ListaCitas);
                ActualizarVistaCitas();
            }
            //ProcesosVistaGestion.MostaraEnTabla(vista, ListaCitas.getListaCitas());
            //ListaCitas.MostrarResumen(vista.txtaResumen);
            //ProcesosVistaGestion.LimpiarEntradas(vista);
        }
        
        
        
        
        /*

        if (e.getSource() == vista.btnEliminar) {
            String elemento = Mensajes.LeerTexto("Ingrese el código a eliminar por favor...");
            int posicion = BusquedaBinariaCitas.BuscarPorCodigoCita(ListaCitas.getListaCitas(), elemento);
            if (posicion == -1) {
                Mensajes.MostrarTexto("Código " + elemento + " a eliminar no existe...");
            } else {
                int resp = Mensajes.Respuesta("Confirmar eliminación",
                        "¿Deseas eliminar el código " + elemento + " de " +
                                ListaCitas.RecuperarCita(posicion).getUrgencia() + "?");
                if (resp == 0) {
                    ListaCitas.EliminarCita(posicion);
                    DatosCitas.GuardarEnArchivo(ListaCitas);
                    ProcesosVistaGestion.MostaraEnTabla(vista, ListaCitas.getListaCitas());
                    ListaCitas.MostrarResumen(vista.txtaResumen);
                }
            }
        }
        
        if (e.getSource() == vista.btnEditar) {
        Citas nuevo = ProcesosVistaGestion.LeerCitas(vista); 
        ListaCitas.Actualizar(nuevo, nuevo.getIdCita());
        ProcesosVistaGestion.MostaraEnTabla(vista, ListaCitas.getListaCitas());
        ListaCitas.MostrarResumen(vista.txtaResumen);
        ProcesosVistaGestion.LimpiarEntradas(vista);
        }
        
        
        

        if (e.getSource() == vista.btnOrdenar) {
                if (vista.cbxOrdenar.getSelectedIndex()==1 && vista.rbtnASC.isSelected()) { // Ordenar por Fecha
           
                    Citas[] listaOrdenada = InsercionOrdenamientoCitas.ordenarDueñoASC(ListaCitas.getListaCitas());//**DUEÑO ORDEN************************
                    ProcesosVistaGestion.MostaraEnTabla(vista, listaOrdenada);
                }
                if (vista.cbxOrdenar.getSelectedIndex()==1 && vista.rbtnDESC.isSelected()) {
                    
                    Citas[] listaOrdenada = InsercionOrdenamientoCitas.ordenarDueñoDESC(ListaCitas.getListaCitas());//**DUEÑO ORDEN********************************
                    ProcesosVistaGestion.MostaraEnTabla(vista, listaOrdenada);
                }
                if (vista.cbxOrdenar.getSelectedIndex()==0 && vista.rbtnASC.isSelected()) {//ordenar por ID 
                    
                    Citas[] listaOrdenada = SeleccionOrdenarCitas.ordenarPorIdCitaASC(ListaCitas.getListaCitas(), ListaCitas.getCantCitas());
                    ProcesosVistaGestion.MostaraEnTabla(vista, listaOrdenada);
                }
                if (vista.cbxOrdenar.getSelectedIndex()==0 && vista.rbtnDESC.isSelected()) {
                    
                    Citas[] listaOrdenada = SeleccionOrdenarCitas.ordenarPorIdCitaDESC(ListaCitas.getListaCitas(), ListaCitas.getCantCitas());
                    ProcesosVistaGestion.MostaraEnTabla(vista, listaOrdenada);
                }
                //NO FUNCIONA
                if (vista.cbxOrdenar.getSelectedIndex()==2 && vista.rbtnASC.isSelected()) {
                    
                    Citas[] listaOrdenada = BurbujaOrdenarCitas.OrdenarPorUrgenciaASC(ListaCitas.getListaCitas(),ListaCitas.getCantCitas());
                    ProcesosVistaGestion.MostaraEnTabla(vista, listaOrdenada);
                }
                //NO FUNCIONA
                if (vista.cbxOrdenar.getSelectedIndex()==2 && vista.rbtnDESC.isSelected()){
                    Citas[] listaOrdenada = BurbujaOrdenarCitas.OrdenarPorUrgenciaDESC(ListaCitas.getListaCitas(),ListaCitas.getCantCitas());
                    ProcesosVistaGestion.MostaraEnTabla(vista, listaOrdenada);
                }
                
                
                
            }

        /*if (e.getSource() == vista.btnBuscarBinaria) {
            // Ordenar primero por ID antes de hacer la búsqueda binaria
            Citas[] auxiliar = SeleccionOrdenarCitas.ordenarPorIdCitaASC(ListaCitas.getListaCitas(), ListaCitas.getCantCitas());
            String codigoBuscar = Mensajes.LeerTexto("Ingrese el código a buscar por favor");
            int posicion = BusquedaBinariaCitas.BuscarPorCodigoCita(auxiliar, codigoBuscar);
            if (posicion == -1) {
                Mensajes.MostrarTexto("ID " + codigoBuscar + " no existe en la lista...");
            } else {
                Mensajes.MostrarTexto(auxiliar[posicion].toString());
            }
            
        }*/
        //TRANSFERENCIA
        /*
        if(e.getSource()==vista.btnBuscar1){
            VistaEmpelado vempleado = new VistaEmpelado();
            VistaPrincipal.dspEscritorio.add(vempleado);
            vempleado.toFront();//PARA PONERLO AL FRENTE
            
            vempleado.setTitle("Registro de Empleados con Listas Enlazadas");
            ControladorEmpleado controladorEmpleado = new ControladorEmpleado(vempleado);
            vempleado.setVisible(true);
            
            
        }
        */ 
    }
}

