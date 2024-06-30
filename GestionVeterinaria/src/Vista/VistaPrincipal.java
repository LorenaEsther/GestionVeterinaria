
package Vista;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

public class VistaPrincipal extends javax.swing.JFrame {


    public VistaPrincipal() {
        initComponents();
        initFlat();

    }
    
    private void initFlat() {
        FlatLightLaf.setup();
        UIManager.put("Button.arc", 5);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        dspEscritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemClientes = new javax.swing.JMenuItem();
        itemMascotas = new javax.swing.JMenuItem();
        itemTipos = new javax.swing.JMenuItem();
        itemServicios = new javax.swing.JMenuItem();
        itemEmpleados = new javax.swing.JMenuItem();
        itemHistorial = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemProcesos = new javax.swing.JMenuItem();
        itemEstadoCitas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        itemCuenta = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        itemReporte = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        itemGuia = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        itemCreadores = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        itemCerrar = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu10.setText("File");
        jMenuBar3.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar3.add(jMenu11);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dspEscritorio.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PerritoELREAL1.gif"))); // NOI18N
        jLabel1.setText("}");

        dspEscritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dspEscritorioLayout = new javax.swing.GroupLayout(dspEscritorio);
        dspEscritorio.setLayout(dspEscritorioLayout);
        dspEscritorioLayout.setHorizontalGroup(
            dspEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dspEscritorioLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(334, Short.MAX_VALUE))
        );
        dspEscritorioLayout.setVerticalGroup(
            dspEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dspEscritorioLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(135, 204, 204));

        jMenu1.setBackground(new java.awt.Color(135, 204, 204));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mantenimiento (2).png"))); // NOI18N
        jMenu1.setText("Mantenimiento");

        itemClientes.setText("Clientes");
        jMenu1.add(itemClientes);

        itemMascotas.setText("Mascotas");
        jMenu1.add(itemMascotas);

        itemTipos.setText("Tipo de Mascota");
        jMenu1.add(itemTipos);

        itemServicios.setText("Servicios");
        jMenu1.add(itemServicios);

        itemEmpleados.setText("Empleados");
        jMenu1.add(itemEmpleados);

        itemHistorial.setText("Historial Clinico");
        itemHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemHistorialActionPerformed(evt);
            }
        });
        jMenu1.add(itemHistorial);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flujo-de-trabajo (2).png"))); // NOI18N
        jMenu2.setText("Procesos");

        itemProcesos.setText("Procesos de Citas");
        jMenu2.add(itemProcesos);

        itemEstadoCitas.setText("Estado de Citas");
        jMenu2.add(itemEstadoCitas);

        jMenuBar1.add(jMenu2);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/negocio (2).png"))); // NOI18N
        jMenu5.setText("Cuenta de Resultados");

        itemCuenta.setText("Cuenta de Servicios");
        jMenu5.add(itemCuenta);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reporte (1).png"))); // NOI18N
        jMenu6.setText("Reportes");

        itemReporte.setText("Reporte de Procesos Servicios");
        jMenu6.add(itemReporte);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ayudar.png"))); // NOI18N
        jMenu7.setText("Ayuda");

        itemGuia.setText("Guia de usuario");
        jMenu7.add(itemGuia);

        jMenuItem2.setText("Facebook");
        jMenu7.add(jMenuItem2);

        jMenuItem3.setText("Instagram");
        jMenu7.add(jMenuItem3);

        jMenuItem4.setText("WhatsApp");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem4);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anonimo.png"))); // NOI18N
        jMenu8.setText("Autores");

        itemCreadores.setText("Creadores del programa");
        jMenu8.add(itemCreadores);

        jMenuBar1.add(jMenu8);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        jMenu9.setText("Salir");

        itemCerrar.setText("Cerrar Sesion");
        jMenu9.add(itemCerrar);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dspEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dspEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemHistorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemHistorialActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane dspEscritorio;
    public javax.swing.JMenuItem itemCerrar;
    public javax.swing.JMenuItem itemClientes;
    public javax.swing.JMenuItem itemCreadores;
    public javax.swing.JMenuItem itemCuenta;
    public javax.swing.JMenuItem itemEmpleados;
    public javax.swing.JMenuItem itemEstadoCitas;
    public javax.swing.JMenuItem itemGuia;
    public javax.swing.JMenuItem itemHistorial;
    public javax.swing.JMenuItem itemMascotas;
    public javax.swing.JMenuItem itemProcesos;
    public javax.swing.JMenuItem itemReporte;
    public javax.swing.JMenuItem itemServicios;
    public javax.swing.JMenuItem itemTipos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    public javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
