/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Luis Acevedo
 */
public class conexion {
    private static Connection connection;
    private static final String DATABASE_NAME = "Directorio";
    private static final String DATABASE_PATH = "D:\\DB\\"; // Make sure to escape backslashes.
    private static final String DATABASE_URL = "jdbc:sqlite:" + DATABASE_PATH + DATABASE_NAME + ".db";

    private conexion() {} // Private constructor to prevent direct instantiation.

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(DATABASE_URL);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
    
    public static void createEmpleadoTable() {
        String sql = "CREATE TABLE IF NOT EXISTS empleado (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombre TEXT NOT NULL," +
                "telefono INTEGER NOT NULL," +
                "cubiculo TEXT NOT NULL," +
                "departamento TEXT NOT NULL," +
                "email TEXT NOT NULL" +
                ");";

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table 'Empleado' created (if not exists).");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

    
