/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author carlosmartinmunoz
 */
public class InsertarSocios extends javax.swing.JFrame {

    /**
     * Creates new form InsertarLibro
     */
    public InsertarSocios() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.jpg")).getImage());
        setLocationRelativeTo(null);
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/Biblioteca", "root", "");
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Socios");

            while (rs.next()) {
                jTextArea1.append("Id: " + rs.getInt(1) + "\n" + "Nombre: " + rs.getString(2) + "\n" + "Apellidos: " + rs.getString(3) + "\n" + "Edad: " + rs.getInt(4) + "\n" + "Dirección: "
                        + rs.getString(5) + "\n" + "Teléfono: " + rs.getInt(6) + "\n" + "------------------------- \n");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InsertarSocios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InsertarSocios.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Insertar Socios");
        setResizable(false);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre:");

        jLabel4.setText("Apellidos:");

        jLabel3.setText("Dirección:");

        jLabel5.setText("Edad:");

        jLabel6.setText("Teléfono:");

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(guardar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(apellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(edad, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(direccion, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(telefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                    .addComponent(volver, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guardar)
                            .addComponent(volver)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("");
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/Biblioteca", "root", "");
            Statement st = conexion.createStatement();
            st.executeUpdate("INSERT INTO Socios VALUES (" + id.getText() + ", '" + nombre.getText() + "','" + apellidos.getText() + "'," 
                    + edad.getText() + ",'" + direccion.getText() + "'," + telefono.getText() + ")");
            ResultSet rs = st.executeQuery("SELECT * FROM Socios");

            while (rs.next()) {
                jTextArea1.append("Id: " + rs.getInt(1) + "\n" + "Nombre: " + rs.getString(2) + "\n" + "Apellidos: " + rs.getString(3) + "\n" + "Edad: " + rs.getInt(4) + "\n" + "Dirección: "
                        + rs.getString(5) + "\n" + "Teléfono: " + rs.getInt(6) + "\n" + "------------------------- \n");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InsertarSocios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InsertarSocios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_guardarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        Principal principal = new Principal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_volverActionPerformed

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
            java.util.logging.Logger.getLogger(InsertarSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarSocios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField edad;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField telefono;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
