
package Modelo;

import Persistencia.DatosServicios;
import java.util.Date;
import java.io.*;

public class Citas implements Serializable{
    
    private String idCita;
    private Date fecha;
    private String hora;
    private String urgencia;
    private double PrecioTotal;
    
    private String codEmp;
    private String nomEmp="";//
    private String codMas;
    private String nomMas="";
    private String codDue;
    private String nomDue="";
    private String codSer;
    private String nomSer;

    
 
    public String getCodEmp() { return codEmp; }
    public void setCodEmp(String codEmp) { this.codEmp = codEmp; }
    public String getNomEmp() { return nomEmp; }
    public void setNomEmp(String nomEmp) { this.nomEmp = nomEmp; }
    public String getCodMas() { return codMas; }
    public void setCodMas(String codMas) { this.codMas = codMas; }
    public String getNomMas() { return nomMas; }
    public void setNomMas(String nomMas) { this.nomMas = nomMas; }
    public String getCodDue() { return codDue; }
    public void setCodDue(String codDue) { this.codDue = codDue; }
    public String getNomDue() { return nomDue; }
    public void setNomDue(String nomDue) { this.nomDue = nomDue; }
    public String getCodSer() { return codSer; }
    public void setCodSer(String codSer) { this.codSer = codSer; }
    public String getNomSer() { return nomSer; }
    public void setNomSer(String nomSer) { this.nomSer = nomSer; }
    
    
    
    public Object[] Registro(int num){
        Object fila[]={ num,idCita,codEmp,nomEmp,nomMas,nomDue,nomSer,fecha,hora,urgencia}; //"Num","ID","Codigo Empl.","Nombre Empl.","Nom. Mascota","Dueño","Servicio","Precio","Urgencia","Fecha","Hora"
        return fila;
    }

    
    public void ActualizarRelaciones(){
        //Obtener Nombre de Empleado
        //Obtener Nombre de Mascota
        //Obtener Nombre de Dueño 
        /*ClienteDAO cliArreglo = new ClienteDAO();
        Cliente cliente = cliArreglo.buscarPorCodigo(codEmp);
        nomDue = cliente.getNombre();*/
        //Obtener Servicio
        PilasServicios pilaServ =  DatosServicios.RecuperaDeArchivo();
        Servicio servicio = pilaServ.ObtenerServicio(codSer);
        nomSer = servicio.getNomServi();
    }
    
    
    
    @Override
    public String toString() {//*********************************************
        return "Id Cita       :  "+idCita+
               "\nCod Empleado       :  "+codEmp+
               "\nNombre Empleado        :  "+nomEmp+
               "\nNombre Mascota       :  "+nomMas+
               "\nDueño        :  "+nomDue+
               "\nServicio       :  "+nomSer+
               "\nFecha       :  "+fecha+
               "\nHora        :  "+hora+
               "\nUrgencia    :  "+urgencia;
               
    }

    public String getIdCita() {
        return idCita;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    public double getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(double PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }
    

}
