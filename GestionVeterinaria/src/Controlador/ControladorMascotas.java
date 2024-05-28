
package Controlador;


import Busquedas.BusquedaBinaria.BusquedaBinariaMascotas;
import Modelo.*;
import Vista.*;
import Procesos.*;
import Persistencia.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControladorMascotas implements ActionListener{
    
    VistaMascotas vista;
    ColeccionMascotas coleccion;
    ColeccionMascotas auxiliar;
    
    public ControladorMascotas (VistaMascotas vm) {
        vista = vm;
        
        vista.btnGuardar.addActionListener(this);
        vista.btnEditar.addActionListener(this);//BUSQUEDA DE FORMA BINARIA
        vista.btnEliminar.addActionListener(this);
        vista.btnBuscar.addActionListener(this);
        vista.btnOrdenar.addActionListener(this);
        
        
        coleccion = new ColeccionMascotas(); // Inicializar el arreglo de citas
        coleccion = DatosMascotas.RecuperarDeArchivo();
        ProcesosVistaMascotas.MostrarEnTabla(vista, coleccion);
        ProcesosVistaMascotas.PresentarGestionDeServicios(vista);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnGuardar) {
            coleccion.AgregarMascota(ProcesosVistaMascotas.LeerMascota(vista));
            ProcesosVistaMascotas.MostrarEnTabla(vista, coleccion);
            ProcesosVistaMascotas.LimpiarEntradas(vista);
        }

        if (e.getSource() == vista.btnEliminar) {
            String codigo = Mensajes.LeerTexto("Ingrese el código a eliminar por favor...");
            int posicion = BusquedaBinariaMascotas.BuscarPorCodigo(coleccion.getLista(), codigo);
            if (posicion == -1) {
                Mensajes.MostrarTexto("Código " + codigo + " a eliminar no existe...");
            } else {
                int resp = Mensajes.Respuesta("Confirmar eliminación",
                        "¿Deseas eliminar el código " + codigo + " ?");
                if (resp == 0) {
                    coleccion.Eliminar(posicion);
                    ProcesosVistaMascotas.MostrarEnTabla(vista, coleccion);
                }
            }
        }
        
        if (e.getSource() == vista.btnEditar) {
            Mascotas nuevo = ProcesosVistaMascotas.LeerMascota(vista);
            coleccion.Actualizar(nuevo, nuevo.getCodigo()); 
            ProcesosVistaMascotas.MostrarEnTabla(vista, coleccion);
        }
        
        if(e.getSource()==vista.btnOrdenar){
            if(vista.cbxOrdenar.getSelectedIndex()==0 && vista.rBtnASC.isSelected()){ 
                auxiliar = DatosMascotas.RecuperarDeArchivo();
                Ordenamientos.OrdenamientoQuicksort.QuickSortOrdenarMascotas.OrdenarCodigoASC(auxiliar.getLista(), 0, auxiliar.getLista().size()-1);
                ProcesosVistaMascotas.MostrarEnTabla(vista,auxiliar);
            }
            if(vista.cbxOrdenar.getSelectedIndex()==0 && vista.rBtnDESC.isSelected()){ 
                auxiliar = DatosMascotas.RecuperarDeArchivo();
                Ordenamientos.OrdenamientoQuicksort.QuickSortOrdenarMascotas.OrdenarCodigoDESC(auxiliar.getLista(), 0, auxiliar.getLista().size()-1);
                ProcesosVistaMascotas.MostrarEnTabla(vista,auxiliar);
            }
            if(vista.cbxOrdenar.getSelectedIndex()==1 && vista.rBtnASC.isSelected()){ 
                auxiliar = DatosMascotas.RecuperarDeArchivo();
                auxiliar.setLista(Ordenamientos.OrdenamientoInsercion.InsercionOrdenamientoMascotas.OrdenarNombreASC(coleccion.getLista()));
                ProcesosVistaMascotas.MostrarEnTabla(vista,auxiliar);
            }
            if(vista.cbxOrdenar.getSelectedIndex()==1 && vista.rBtnDESC.isSelected()){ 
                auxiliar = DatosMascotas.RecuperarDeArchivo();
                auxiliar.setLista(Ordenamientos.OrdenamientoInsercion.InsercionOrdenamientoMascotas.OrdenarNombreDESC(coleccion.getLista()));
                ProcesosVistaMascotas.MostrarEnTabla(vista,auxiliar);
            }
            if(vista.cbxOrdenar.getSelectedIndex()==2 && vista.rBtnASC.isSelected()){ 
                auxiliar = DatosMascotas.RecuperarDeArchivo();
                auxiliar.setLista(Ordenamientos.OrdenamientoSeleccion.SeleccionOrdenarMascotas.OrdenarEspecieASC(coleccion.getLista()));
                ProcesosVistaMascotas.MostrarEnTabla(vista,auxiliar);
            }
            if(vista.cbxOrdenar.getSelectedIndex()==2 && vista.rBtnDESC.isSelected()){ 
                auxiliar = DatosMascotas.RecuperarDeArchivo();
                auxiliar.setLista(Ordenamientos.OrdenamientoSeleccion.SeleccionOrdenarMascotas.OrdenarEspecieDESC(coleccion.getLista()));              
                ProcesosVistaMascotas.MostrarEnTabla(vista,auxiliar);
            }
        }      

        if (e.getSource() == vista.btnBuscar) {
            // Ordenar primero por ID antes de hacer la búsqueda binaria
            Ordenamientos.OrdenamientoQuicksort.QuickSortOrdenarMascotas.OrdenarCodigoASC(coleccion.getLista(), 0, coleccion.getLista().size()-1);
            String codigoBuscar = Mensajes.LeerTexto("Ingrese el código a buscar por favor");
            int posicion = BusquedaBinariaMascotas.BuscarPorCodigo(coleccion.getLista(), codigoBuscar);
            if (posicion == -1) {
                Mensajes.MostrarTexto("ID " + codigoBuscar + " no existe en la lista...");
            } else {
                Mensajes.MostrarTexto(coleccion.getLista().get(posicion).toString());
            }
        }
  
    }

}

