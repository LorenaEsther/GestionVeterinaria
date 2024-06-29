package Modelo;

import javax.swing.table.DefaultTableModel;

public class ModeloTablaCitas {

    public static DefaultTableModel crearModeloCitas() {
        return new DefaultTableModel(
            new Object[][]{},
            new String[]{"ID", "Fecha", "Veterinario", "Mascota", "Dueño", "Servicio", "Precio", "Estado"}
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
}
