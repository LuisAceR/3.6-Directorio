/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JTable;
import controlador.Empleadonuevo;
import javax.swing.JOptionPane;
import modelo.Empleados;

/**
 *
 * @author Luis Acevedo
 */
public class Modificar_personal extends javax.swing.JFrame {
    private javax.swing.JTable tableempleados;
    private Empleadonuevo empleadonuevo;

    public static void mostrarmodper(Empleadonuevo empleadonuevo, JTable tableempleados) {
        Modificar_personal modificar_personal = new Modificar_personal(tableempleados, empleadonuevo);
        modificar_personal.setVisible(true);
        modificar_personal.requestFocus();
    }
    
    public Modificar_personal(JTable tableempleados, Empleadonuevo empleadonuevo) {
        initComponents();
        this.tableempleados = tableempleados;
        this.empleadonuevo = empleadonuevo;
    }
    
    public Modificar_personal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        modificaremailpertxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        modificarcubiculopertxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        modificarnombrepertxt = new javax.swing.JTextField();
        modificartelefonopertxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        modificarguardarperbutton = new javax.swing.JButton();
        modificarcancelarperbutton = new javax.swing.JButton();
        modificarpertxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modificar Personal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        modificaremailpertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaremailpertxtActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cubiculo");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Telefono");

        modificarcubiculopertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarcubiculopertxtActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre del empleado:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Email");

        modificarnombrepertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarnombrepertxtActionPerformed(evt);
            }
        });

        modificartelefonopertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificartelefonopertxtActionPerformed(evt);
            }
        });

        jLabel5.setText("Departamento");

        modificarguardarperbutton.setText("Guardar");
        modificarguardarperbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarguardarperbuttonActionPerformed(evt);
            }
        });

        modificarcancelarperbutton.setText("Cancelar");
        modificarcancelarperbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarcancelarperbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modificarguardarperbutton)
                        .addGap(7, 7, 7)
                        .addComponent(modificarcancelarperbutton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modificarnombrepertxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modificartelefonopertxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modificaremailpertxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modificarcubiculopertxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modificarpertxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarnombrepertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificartelefonopertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificaremailpertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarcubiculopertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(modificarpertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarguardarperbutton)
                    .addComponent(modificarcancelarperbutton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modificarguardarperbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarguardarperbuttonActionPerformed
    int selectedRow = tableempleados.getSelectedRow();
    if (selectedRow != -1) {
        long empleadoId = (long) tableempleados.getValueAt(selectedRow, 0);
        String nombre = modificarnombrepertxt.getText(); // Use the existing instance variable
        String telefonoTxt = modificartelefonopertxt.getText();
        String cubiculo = modificarcubiculopertxt.getText();
        String departamento = modificarpertxt.getText();
        String email = modificaremailpertxt.getText();

        try {
            int telefono = Integer.parseInt(telefonoTxt);
            Empleados empleado = new Empleados(empleadoId, nombre, telefono, cubiculo, departamento, email);
            // Call the method from Empleadonuevo class to update the employee
            empleadonuevo.actualizarempleado(empleado);

            empleadonuevo.obtenerEmpleado(tableempleados);
            JOptionPane.showMessageDialog(this, "Empleado modificado");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    } else {
        JOptionPane.showMessageDialog(this, "Selecciona el Empleado a modificar", "Empleado no seleccionado ", JOptionPane.WARNING_MESSAGE);
    }       
    dispose();
    
    }//GEN-LAST:event_modificarguardarperbuttonActionPerformed

    private void modificarcubiculopertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarcubiculopertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarcubiculopertxtActionPerformed

    private void modificarnombrepertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarnombrepertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarnombrepertxtActionPerformed

    private void modificartelefonopertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificartelefonopertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificartelefonopertxtActionPerformed

    private void modificaremailpertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaremailpertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificaremailpertxtActionPerformed

    private void modificarcancelarperbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarcancelarperbuttonActionPerformed
        dispose();
    }//GEN-LAST:event_modificarcancelarperbuttonActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton modificarcancelarperbutton;
    private javax.swing.JTextField modificarcubiculopertxt;
    private javax.swing.JTextField modificaremailpertxt;
    private javax.swing.JButton modificarguardarperbutton;
    private javax.swing.JTextField modificarnombrepertxt;
    private javax.swing.JTextField modificarpertxt;
    private javax.swing.JTextField modificartelefonopertxt;
    // End of variables declaration//GEN-END:variables
}