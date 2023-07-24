/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Empleados;


/**
 *
 * @author Luis Acevedo
 */
public class Empleadonuevo {
    
    private Connection connection;
    
    public Empleadonuevo() {
        connection = conexion.getConnection();
    }
    
    public void agregarempleado(Empleados empleado) {
        String query = "INSERT INTO Empleados (nombre, telefono, cubiculo, departamento, email) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, empleado.nombre);
            preparedStatement.setInt(2, empleado.telefono);
            preparedStatement.setString(3, empleado.cubiculo);
            preparedStatement.setString(4, empleado.departamento);
            preparedStatement.setString(5, empleado.email);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void actualizarempleado(Empleados empleado) {
        String query = "UPDATE Empleados SET nombre = ?, telefono = ?, cubiculo = ?, departamento = ?, email = ? WHERE empleadosid = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, empleado.nombre);
            preparedStatement.setInt(2, empleado.telefono);
            preparedStatement.setString(3, empleado.cubiculo);
            preparedStatement.setString(4, empleado.departamento);
            preparedStatement.setString(5, empleado.email);
            preparedStatement.setLong(6, empleado.getID());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
     public void borrarempleado(long empleadoId) {
        String query = "DELETE FROM Empleados WHERE empleadosid = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setLong(1, empleadoId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void obtenerEmpleado(JTable paramTotalEmpleados) {
        DefaultTableModel modelo = new DefaultTableModel();
        paramTotalEmpleados.setModel(modelo); 

        modelo.addColumn("empleadoid");
        modelo.addColumn("nombre");
        modelo.addColumn("email");
        modelo.addColumn("cubiculo");
        modelo.addColumn("departamento");

        List<Empleados> empleadosList = obtenerEmpleados();
        for (Empleados empleado : empleadosList) {
            Object[] row = new Object[]{
                    empleado.getID(),
                    empleado.nombre,
                    empleado.email,
                    empleado.cubiculo,
                    empleado.departamento
            };
            modelo.addRow(row);
        }
    }

    private List<Empleados> obtenerEmpleados() {
        List<Empleados> empleadosList = new ArrayList<>();
        String query = "SELECT * FROM Empleados";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                long empleadosid = resultSet.getLong("empleadosid");
                String nombre = resultSet.getString("nombre");
                int telefono = resultSet.getInt("telefono");
                String cubiculo = resultSet.getString("cubiculo");
                String departamento = resultSet.getString("departamento");
                String email = resultSet.getString("email");

                Empleados empleado = new Empleados(empleadosid, nombre, telefono, cubiculo, departamento, email);
                empleadosList.add(empleado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empleadosList;
    }
    
    private void eliminarEmpleado(JTable tableempleados) {
    int selectedRow = tableempleados.getSelectedRow();
        if (selectedRow != -1) {
            long empleadoId = (long) tableempleados.getValueAt(selectedRow, 0);
            borrarempleado(empleadoId);
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona el empleado para borrar.", "Empleado no seleccionado", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void eliminatepertxtActionPerformed(java.awt.event.ActionEvent evt, JTable tableempleados) {
        int selectedRow = tableempleados.getSelectedRow();
        if (selectedRow != -1) {
            long empleadoId = (long) tableempleados.getValueAt(selectedRow, 0);
            borrarempleado(empleadoId);
            
            List<Empleados> updatedEmployees = obtenerEmpleados();
            actualizartabla(updatedEmployees, tableempleados);
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un empleado para borrar.", "Empleado no seleccionado", JOptionPane.WARNING_MESSAGE);
        }
    }


    private void actualizartabla(List<Empleados> empleadosList, JTable tableempleados) {
        DefaultTableModel model = (DefaultTableModel) tableempleados.getModel();
        model.setRowCount(0);

        for (Empleados empleado : empleadosList) {
            Object[] row = new Object[]{
                    empleado.getID(),
                    empleado.nombre,
                    empleado.email,
                    empleado.cubiculo,
                    empleado.departamento
            };
            model.addRow(row);
        }
    }
}

