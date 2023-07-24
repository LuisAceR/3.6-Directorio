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
import javax.swing.DefaultListModel;
import javax.swing.JList;
import modelo.Departamentos;
import modelo.Empleados;


/**
 *
 * @author Luis Acevedo
 */
    public class Departamentosnuevos {
    private Connection connection;

    public Departamentosnuevos(Connection connection) {
        this.connection = connection;
    }

    public void agregarDepartamento(Departamentos departamento) {
        try {

            String sql = "INSERT INTO Departamento (nombre, numero, gerente) VALUES (?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, departamento.getNombre());
            stmt.setInt(2, departamento.getNumero());
            stmt.setString(3, departamento.getGerente());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarDepartamento(Departamentos departamento) {
    String sql = "UPDATE Departamento SET nombre=?, numero=?, gerente=? WHERE departamentoID=?";

    try (PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setString(1, departamento.getNombre());
        statement.setInt(2, departamento.getNumero());
        statement.setString(3, departamento.getGerente());
        statement.setLong(4, departamento.getDepartamentoID());

        statement.executeUpdate();

        System.out.println("Departmento actualizado.");

    } catch (SQLException e) {
        System.err.println("Error actualizando el departamentot.: " + e.getMessage());
    }
    }

    public void eliminarDepartamento(String nombreDepartamento) {
        String query = "DELETE FROM Departamento WHERE nombre = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, nombreDepartamento);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Departamento borrado.");
            } else {
                System.out.println("Fallo en borrar el departamento.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void obtenerDepartamentos(JList<String> jListDepartamentos) {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        jListDepartamentos.setModel(listModel);

        List<String> nombresDepartamentos = fetchDepartamentos();
        for (String nombreDepartamento : nombresDepartamentos) {
            listModel.addElement(nombreDepartamento);
        }
    }

    private List<String> fetchDepartamentos() {
        List<String> nombresDepartamentos = new ArrayList<>();
        String query = "SELECT nombre FROM Departamento";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                nombresDepartamentos.add(nombre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nombresDepartamentos;
    }

    public Departamentos getDepartamentoByName(String departamentoName) {
    Departamentos departamento = null;
    String query = "SELECT * FROM Departamento WHERE nombre = ?";
    try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        preparedStatement.setString(1, departamentoName);
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                int numero = resultSet.getInt("numero");
                String gerente = resultSet.getString("gerente");

                departamento = new Departamentos(nombre, numero, gerente);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return departamento;
    }
    
    public List<Empleados> getEmpleadosByDepartamento(String departamentoName) {
        List<Empleados> empleados = new ArrayList<>();
        String query = "SELECT * FROM Empleados WHERE departamento = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, departamentoName);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    long empleadosid = resultSet.getLong("empleadosid");
                    String nombre = resultSet.getString("nombre");
                    int telefono = resultSet.getInt("telefono");
                    String cubiculo = resultSet.getString("cubiculo");
                    String departamento = resultSet.getString("departamento");
                    String email = resultSet.getString("email");

                    Empleados empleado = new Empleados(empleadosid, nombre, telefono, cubiculo, departamento, email);
                    empleados.add(empleado);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empleados;
    }
}


    
