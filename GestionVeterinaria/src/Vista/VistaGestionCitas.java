
package Vista;

public class VistaGestionCitas extends javax.swing.JInternalFrame {

    public VistaGestionCitas() {
        initComponents();

    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        JdateChooser = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCitas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnBuscar1 = new javax.swing.JButton();
        txtIdEmp = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdMas = new javax.swing.JTextField();
        txtIdDue = new javax.swing.JTextField();
        btnBuscar2 = new javax.swing.JButton();
        btnBuscar3 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtIdSer = new javax.swing.JTextField();
        btnBuscar4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtPre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
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
        cbxTipo = new javax.swing.JComboBox<>();
        btnOrdenar = new javax.swing.JButton();
        rbtnASC = new javax.swing.JRadioButton();
        rbtnDESC = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaResumen = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        btnConsultar = new javax.swing.JButton();

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

        JdateChooser.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 690, 190));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Empleado"));

        jLabel5.setText("ID                           : ");

        btnBuscar1.setBackground(new java.awt.Color(135, 204, 204));
        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel5)
                .addGap(58, 58, 58)
                .addComponent(txtIdEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdEmp)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        JdateChooser.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 620, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        JdateChooser.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 630, 20));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la Mascota"));

        jLabel6.setText("ID Mascota                 :");

        jLabel7.setText("ID Dueño                    :");

        btnBuscar2.setBackground(new java.awt.Color(135, 204, 204));
        btnBuscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa (2).png"))); // NOI18N

        btnBuscar3.setBackground(new java.awt.Color(135, 204, 204));
        btnBuscar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdMas, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdDue, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(txtIdMas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addComponent(txtIdDue)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        JdateChooser.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 620, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        JdateChooser.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 160, 270, 20));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        JdateChooser.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, 260, 10));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Servicio"));

        jLabel8.setText("ID Servicio");

        btnBuscar4.setBackground(new java.awt.Color(135, 204, 204));
        btnBuscar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa (2).png"))); // NOI18N

        jLabel11.setText("Precio");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addGap(56, 56, 56)
                .addComponent(txtIdSer, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPre, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(btnBuscar4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtIdSer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(txtPre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JdateChooser.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 620, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        JdateChooser.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 30, 590));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel14.setText("Guardar");
        JdateChooser.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel15.setText("Eliminar");
        JdateChooser.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel16.setText("Editar");
        JdateChooser.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, -1, -1));

        jLabel3.setText("Fecha");
        JdateChooser.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(135, 204, 204));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar (2).png"))); // NOI18N
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JdateChooser.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 70, 70));

        btnGuardar.setBackground(new java.awt.Color(135, 204, 204));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco-flexible (1).png"))); // NOI18N
        btnGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JdateChooser.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 70, 70));
        JdateChooser.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 135, 40));

        btnEditar.setBackground(new java.awt.Color(135, 204, 204));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar-codigo (2).png"))); // NOI18N
        btnEditar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JdateChooser.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 70, 70));

        txtIdCita.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Cita"));
        txtIdCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCitaActionPerformed(evt);
            }
        });
        JdateChooser.add(txtIdCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 10, 130, 40));

        jLabel12.setText("Hora");
        JdateChooser.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, -1, -1));
        JdateChooser.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 110, 40));

        btnBuscarBinaria.setBackground(new java.awt.Color(255, 204, 51));
        btnBuscarBinaria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarBinaria.setText("BUSQUEDA RECURSIVA");
        btnBuscarBinaria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarBinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarBinariaActionPerformed(evt);
            }
        });
        JdateChooser.add(btnBuscarBinaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 240, 50));

        cbxOrdenar.setBackground(new java.awt.Color(153, 204, 255));
        cbxOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha", "Dueño" }));
        cbxOrdenar.setBorder(javax.swing.BorderFactory.createTitledBorder("Ordenar por"));
        JdateChooser.add(cbxOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 150, 50));

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALTA PRIORIDAD", "MODERADA PRIORIDAD", "BAJA PRIORIDAD", " ", " " }));
        cbxTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Urgencia"));
        JdateChooser.add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 140, 40));

        btnOrdenar.setBackground(new java.awt.Color(57, 109, 255));
        btnOrdenar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOrdenar.setText("ORDENAR");
        btnOrdenar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JdateChooser.add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 130, 50));

        rbtnASC.setBackground(new java.awt.Color(135, 204, 204));
        rbtnASC.setText("ASC");
        JdateChooser.add(rbtnASC, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, -1, -1));

        rbtnDESC.setBackground(new java.awt.Color(135, 204, 204));
        rbtnDESC.setText("DESC");
        JdateChooser.add(rbtnDESC, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, -1, -1));

        txtaResumen.setBackground(new java.awt.Color(222, 254, 255));
        txtaResumen.setColumns(20);
        txtaResumen.setRows(5);
        jScrollPane2.setViewportView(txtaResumen);

        JdateChooser.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, 240, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ositogay.gif"))); // NOI18N
        JdateChooser.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 180, 310, 360));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        JdateChooser.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 30, 350));

        jLabel10.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 42)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MASCOTAS");
        JdateChooser.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 90, -1, -1));

        jLabel13.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 42)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("FIORI, AMANDO");
        JdateChooser.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 50, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        JdateChooser.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 270, 20));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        JdateChooser.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 50, 270, 20));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        JdateChooser.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 50, 270, 20));

        btnConsultar.setBackground(new java.awt.Color(255, 204, 51));
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 204, 204), null, null));
        btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JdateChooser.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 200, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JdateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 1398, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void txtIdCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCitaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel JdateChooser;
    public javax.swing.JButton btnBuscar1;
    public javax.swing.JButton btnBuscar2;
    public javax.swing.JButton btnBuscar3;
    public javax.swing.JButton btnBuscar4;
    public javax.swing.JButton btnBuscarBinaria;
    public javax.swing.JButton btnConsultar;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnOrdenar;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox<String> cbxOrdenar;
    public javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JButton jButton5;
    public com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    public javax.swing.JRadioButton rbtnASC;
    public javax.swing.JRadioButton rbtnDESC;
    public javax.swing.JTable tblCitas;
    public javax.swing.JTextField txtHora;
    public javax.swing.JTextField txtIdCita;
    public javax.swing.JTextField txtIdDue;
    public javax.swing.JTextField txtIdEmp;
    public javax.swing.JTextField txtIdMas;
    public javax.swing.JTextField txtIdSer;
    public javax.swing.JTextField txtPre;
    public javax.swing.JTextArea txtaResumen;
    // End of variables declaration//GEN-END:variables
}
