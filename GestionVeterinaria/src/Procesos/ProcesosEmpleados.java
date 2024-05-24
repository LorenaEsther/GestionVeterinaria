package Procesos;

import ListasEnlazadas.ListaEnlazadaEmpleados.*;
import Vista.VistaEmpelado.*;
import Modelo.Empleado;
import Vista.VistaEmpelado;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class ProcesosEmpleados {
    public static void LimpiarEntradas(VistaEmpelado vEmplEmpelado) {
        vEmplEmpelado.txtCodigo.setText("");
        vEmplEmpelado.txtNombre.setText("");
        vEmplEmpelado.txtApellido.setText("");
        vEmplEmpelado.txtDni.setText("");
        vEmplEmpelado.txtTelefono.setText("");
        vEmplEmpelado.txtSalario.setText("");
        vEmplEmpelado.dateFechaIngreso.setDate(null);
        vEmplEmpelado.cbxCargo.setSelectedIndex(0);
        vEmplEmpelado.cbxSexo.setSelectedIndex(0);
        vEmplEmpelado.cbxModalidad.setSelectedIndex(0);
        vEmplEmpelado.txtCodigo.requestFocus();
    }
    
    public static Empleado LeerEmpleado(VistaEmpelado vEmpleEmpelado) {
        Empleado empleado = new Empleado();
        empleado.setCodigo(vEmpleEmpelado.txtCodigo.getText());
        empleado.setNombre(vEmpleEmpelado.txtNombre.getText());
        empleado.setApellidos(vEmpleEmpelado.txtApellido.getText());
        empleado.setDni(vEmpleEmpelado.txtDni.getText());
        empleado.setTelefono(vEmpleEmpelado.txtTelefono.getText());
        empleado.setCargo(vEmpleEmpelado.cbxCargo.getSelectedItem().toString());
        empleado.setSexo(vEmpleEmpelado.cbxSexo.getSelectedItem().toString());
        empleado.setModalidad(vEmpleEmpelado.cbxModalidad.getSelectedItem().toString());
        empleado.setSalario(new BigDecimal(vEmpleEmpelado.txtSalario.getText()));
        Date date = vEmpleEmpelado.dateFechaIngreso.getDate();
        if (date != null) {
            LocalDate fechaIngreso = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            empleado.setFechaContratacion(fechaIngreso);
        }
        return empleado;
    }
    

    public static void MostrarDatosDeLista(VistaEmpelado vEmpleado, ListaEmpleados Lista) {
        String titulos[] = {"num", "codigo", "nombre", "apellidos", "sexo", "dni",
            "modalidad", "fechaContratacion", "telefono", "cargo", "salario"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        vEmpleado.tblDatos.setModel(modelo);

        //Declaración de variables
        Nodo auxiliar = Lista.getInicio();
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        int numeracion = 0;
        BigDecimal sumaSalario = BigDecimal.ZERO;

        while (auxiliar != null) {
            numeracion++;
            modelo.addRow(auxiliar.getEmpleado().Registro(numeracion));
            sumaSalario = sumaSalario.add(auxiliar.getEmpleado().getSalario());

            switch (auxiliar.getEmpleado().getCargo()) {
                case "Veterinario":
                    contador1++;
                    break;
                case "Tec. veterinario":
                    contador2++;
                    break;
                case "Asist. veterinario":
                    contador3++;
                    break;
                case "Recepcionista":
                    contador4++;
                    break;
                case "Pers. limpieza":
                    contador5++;
                    break;
            }
            sumaSalario = sumaSalario.add(auxiliar.getEmpleado().getSalario());
            auxiliar = auxiliar.getSiguiente();   
        }
        //Mostrar datos
        vEmpleado.txaResumen.setText("Cantidad de Empleados Veterinarios" + contador1
                + "\nCantidad de Empleados Tec. veterinarios" + contador2
                + "\nCantidad de Empleados Asist. veterinarios" + contador3
                + "\nCantidad de Empleados Recepcionista" + contador4
                + "\nCantidad de Empleados Pers. limpieza" + contador5
                + "\nSuma de todos los cargos de Empleados" + sumaSalario);

    }

    public static void MostrarDatosNodo(Nodo actual, VistaEmpelado vEmpleado) {
        if (actual != null) {
            vEmpleado.txtCodigo.setText(actual.getEmpleado().getCodigo());
            vEmpleado.txtNombre.setText(actual.getEmpleado().getNombre());
            vEmpleado.txtApellido.setText(actual.getEmpleado().getApellidos());
            vEmpleado.txtDni.setText(actual.getEmpleado().getDni());
            vEmpleado.txtTelefono.setText(actual.getEmpleado().getTelefono());
            vEmpleado.txtSalario.setText(actual.getEmpleado().getSalario().toString());
            LocalDate fechaIngreso = actual.getEmpleado().getFechaContratacion();
            if (fechaIngreso != null) {
                Date date = Date.from(fechaIngreso.atStartOfDay(ZoneId.systemDefault()).toInstant());
                vEmpleado.dateFechaIngreso.setDate(date);
            }

            switch (actual.getEmpleado().getCargo()) {
                case "Veterinario":
                    vEmpleado.cbxCargo.setSelectedIndex(0);
                    break;
                case "Tec. veterinario":
                    vEmpleado.cbxCargo.setSelectedIndex(1);
                    break;
                case "Asist. veterinario":
                    vEmpleado.cbxCargo.setSelectedIndex(2);
                    break;
                case "Recepcionista":
                    vEmpleado.cbxCargo.setSelectedIndex(3);
                    break;
                case "Pers. limpieza":
                    vEmpleado.cbxCargo.setSelectedIndex(4);
                    break;
            }

            switch (actual.getEmpleado().getModalidad()) {
                case "PartTime":
                    vEmpleado.cbxSexo.setSelectedIndex(0);
                    break;
                case "FullTime":
                    vEmpleado.cbxSexo.setSelectedIndex(1);
                    break;
            }

            switch (actual.getEmpleado().getSexo()) {
                case "Hombre":
                    vEmpleado.cbxSexo.setSelectedIndex(0);
                    break;
                case "Mujer":
                    vEmpleado.cbxSexo.setSelectedIndex(1);
                    break;
            }
        }
    }
}
