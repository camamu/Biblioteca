/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import javax.swing.ImageIcon;

/**
 *
 * @author carlosmartinmunoz
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio17
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.jpg")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new Panel("/imagenes/estanteria-libros.jpg");
        jMenuBar1 = new javax.swing.JMenuBar();
        insertar = new javax.swing.JMenu();
        insLibros = new javax.swing.JMenuItem();
        insSocios = new javax.swing.JMenuItem();
        modificar = new javax.swing.JMenu();
        modLibros = new javax.swing.JMenuItem();
        modSocios = new javax.swing.JMenuItem();
        consultar = new javax.swing.JMenu();
        consGeneral = new javax.swing.JMenuItem();
        prestamos = new javax.swing.JMenu();
        crearPrestamo = new javax.swing.JMenuItem();
        consultarPrestamo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca");
        setResizable(false);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 712, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        insertar.setText("Insertar");

        insLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/librosicono-5623-96.png"))); // NOI18N
        insLibros.setText("Libros");
        insLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insLibrosActionPerformed(evt);
            }
        });
        insertar.add(insLibros);

        insSocios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personas-de-usuario-hombre-persona-icono-5691-128.png"))); // NOI18N
        insSocios.setText("Socios");
        insSocios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insSociosActionPerformed(evt);
            }
        });
        insertar.add(insSocios);

        jMenuBar1.add(insertar);

        modificar.setText("Modificar");

        modLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/librosicono-5623-96.png"))); // NOI18N
        modLibros.setText("Libros");
        modLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modLibrosActionPerformed(evt);
            }
        });
        modificar.add(modLibros);

        modSocios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personas-de-usuario-hombre-persona-icono-5691-128.png"))); // NOI18N
        modSocios.setText("Socios");
        modSocios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modSociosActionPerformed(evt);
            }
        });
        modificar.add(modSocios);

        jMenuBar1.add(modificar);

        consultar.setText("Consultar");

        consGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar_icono.png"))); // NOI18N
        consGeneral.setText("Consulta General");
        consGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consGeneralActionPerformed(evt);
            }
        });
        consultar.add(consGeneral);

        jMenuBar1.add(consultar);

        prestamos.setText("Prestamos");

        crearPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        crearPrestamo.setText("Hacer Prestamo");
        crearPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearPrestamoActionPerformed(evt);
            }
        });
        prestamos.add(crearPrestamo);

        consultarPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar_icono.png"))); // NOI18N
        consultarPrestamo.setText("Consultar Prestamos");
        consultarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarPrestamoActionPerformed(evt);
            }
        });
        prestamos.add(consultarPrestamo);

        jMenuBar1.add(prestamos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insLibrosActionPerformed
        // TODO add your handling code here:
        InsertarLibro inLibro = new InsertarLibro();
        inLibro.setVisible(true);
        dispose();
    }//GEN-LAST:event_insLibrosActionPerformed

    private void insSociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insSociosActionPerformed
        // TODO add your handling code here:
        InsertarSocios socios =  new InsertarSocios();
        socios.setVisible(true);
        dispose();        
    }//GEN-LAST:event_insSociosActionPerformed

    private void modLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modLibrosActionPerformed
        // TODO add your handling code here:
        ModificarLibros modlib = new ModificarLibros();
        modlib.setVisible(true);
        dispose();
    }//GEN-LAST:event_modLibrosActionPerformed

    private void modSociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modSociosActionPerformed
        // TODO add your handling code here:
        ModificarSocios modsoc = new ModificarSocios();
        modsoc.setVisible(true);
        dispose();
    }//GEN-LAST:event_modSociosActionPerformed

    private void consGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consGeneralActionPerformed
        // TODO add your handling code here:
        ConsultaGen con = new ConsultaGen();
        con.setVisible(true);
        dispose();
    }//GEN-LAST:event_consGeneralActionPerformed

    private void crearPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearPrestamoActionPerformed
        // TODO add your handling code here:
        RealPrestamo rp = new RealPrestamo();
        rp.setVisible(true);
        dispose();
    }//GEN-LAST:event_crearPrestamoActionPerformed

    private void consultarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarPrestamoActionPerformed
        // TODO add your handling code here:
        ConsultaPres cp = new ConsultaPres();
        cp.setVisible(true);
        dispose();
    }//GEN-LAST:event_consultarPrestamoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JMenuItem consGeneral;
    private javax.swing.JMenu consultar;
    private javax.swing.JMenuItem consultarPrestamo;
    private javax.swing.JMenuItem crearPrestamo;
    private javax.swing.JMenuItem insLibros;
    private javax.swing.JMenuItem insSocios;
    private javax.swing.JMenu insertar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem modLibros;
    private javax.swing.JMenuItem modSocios;
    private javax.swing.JMenu modificar;
    private javax.swing.JMenu prestamos;
    // End of variables declaration//GEN-END:variables
}
