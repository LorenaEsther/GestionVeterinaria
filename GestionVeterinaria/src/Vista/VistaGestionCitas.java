/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Marco Antonio
 */
public class VistaGestionCitas extends javax.swing.JInternalFrame {

    /**
     * Creates new form ProcesosServicios
     */
    public VistaGestionCitas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JdateChooser = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCitas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        txtPrecioTotal = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btnEditar = new javax.swing.JButton();
        txtIdCita = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        btnBuscarBinaria = new javax.swing.JButton();
        cbxOrdenar = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        btnOrdenar = new javax.swing.JButton();
        rbtnASC = new javax.swing.JRadioButton();
        rbtnDESC = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaResumen = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(102, 255, 102));
        setClosable(true);

        JdateChooser.setBackground(new java.awt.Color(135, 204, 204));
        JdateChooser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(135, 204, 204));
        jButton5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impresora.png"))); // NOI18N
        jButton5.setText("Imprimir");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JdateChooser.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 230, 60));

        tblCitas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblCitas);

        JdateChooser.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 640, 230));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Empleado"));

        jLabel5.setText("ID ");

        jButton6.setBackground(new java.awt.Color(135, 204, 204));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa (2).png"))); // NOI18N

        jLabel9.setText("Nombre");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(20, 20, 20)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        JdateChooser.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 620, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        JdateChooser.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 630, 20));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la Mascota"));

        jLabel6.setText("Nombre");

        jLabel7.setText("Nombre del Cliente");

        jButton7.setBackground(new java.awt.Color(135, 204, 204));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa (2).png"))); // NOI18N

        jButton9.setBackground(new java.awt.Color(135, 204, 204));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                    .addComponent(jTextField4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField4)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        JdateChooser.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 620, -1));

        txtPrecioTotal.setBackground(new java.awt.Color(135, 204, 204));
        txtPrecioTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecioTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecioTotal.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio total"));
        JdateChooser.add(txtPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 570, 150, 40));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        JdateChooser.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 270, 20));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        JdateChooser.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 260, 10));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Servicio"));

        jLabel8.setText("Servicio");

        jButton8.setBackground(new java.awt.Color(135, 204, 204));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa (2).png"))); // NOI18N

        jLabel11.setText("Precio");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addGap(88, 88, 88)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JdateChooser.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 620, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        JdateChooser.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 30, 350));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel14.setText("Guardar");
        JdateChooser.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel15.setText("Eliminar");
        JdateChooser.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("ID Cita");
        JdateChooser.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 29));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel16.setText("Editar");
        JdateChooser.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, -1, -1));

        jLabel3.setText("Fecha");
        JdateChooser.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(135, 204, 204));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar (2).png"))); // NOI18N
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JdateChooser.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 70, 70));

        btnGuardar.setBackground(new java.awt.Color(135, 204, 204));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco-flexible (1).png"))); // NOI18N
        btnGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JdateChooser.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 70, 70));
        JdateChooser.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 135, 29));

        btnEditar.setBackground(new java.awt.Color(135, 204, 204));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar-codigo (2).png"))); // NOI18N
        btnEditar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JdateChooser.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 70, 70));
        JdateChooser.add(txtIdCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 103, 29));

        jLabel12.setText("Hora");
        JdateChooser.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));
        JdateChooser.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 110, 30));

        btnBuscarBinaria.setBackground(new java.awt.Color(255, 204, 51));
        btnBuscarBinaria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarBinaria.setText("BUSQUEDA BINARIA");
        btnBuscarBinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarBinariaActionPerformed(evt);
            }
        });
        JdateChooser.add(btnBuscarBinaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 150, 50));

        cbxOrdenar.setBackground(new java.awt.Color(153, 204, 255));
        cbxOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Cita", "Fecha", "Tipo de Urgencia" }));
        cbxOrdenar.setBorder(javax.swing.BorderFactory.createTitledBorder("Ordenar por"));
        JdateChooser.add(cbxOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 150, 50));

        jLabel17.setText("Tipo de Urgencia");
        JdateChooser.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALTA PRIORIDAD", "MODERADA PRIORIDAD", "BAJA PRIORIDAD", " ", " " }));
        JdateChooser.add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 140, 30));

        btnOrdenar.setBackground(new java.awt.Color(57, 109, 255));
        btnOrdenar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOrdenar.setText("ORDENAR");
        JdateChooser.add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 130, 50));

        rbtnASC.setBackground(new java.awt.Color(135, 204, 204));
        rbtnASC.setText("ASC");
        JdateChooser.add(rbtnASC, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 330, -1, -1));

        rbtnDESC.setBackground(new java.awt.Color(135, 204, 204));
        rbtnDESC.setText("DESC");
        JdateChooser.add(rbtnDESC, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, -1, -1));

        txtaResumen.setColumns(20);
        txtaResumen.setRows(5);
        jScrollPane2.setViewportView(txtaResumen);

        JdateChooser.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 300, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JdateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JdateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarBinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBinariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarBinariaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel JdateChooser;
    public javax.swing.JButton btnBuscarBinaria;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnOrdenar;
    public javax.swing.JComboBox<String> cbxOrdenar;
    public javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    public com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    public javax.swing.JRadioButton rbtnASC;
    public javax.swing.JRadioButton rbtnDESC;
    public javax.swing.JTable tblCitas;
    public javax.swing.JTextField txtHora;
    public javax.swing.JTextField txtIdCita;
    public javax.swing.JTextField txtPrecioTotal;
    public javax.swing.JTextArea txtaResumen;
    // End of variables declaration//GEN-END:variables
}
