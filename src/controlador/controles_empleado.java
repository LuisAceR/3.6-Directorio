/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.JTextField;
import modelo.Empleados;

/**
 *
 * @author Luis Acevedo
 */
public class controles_empleado {
    private Empleadonuevo empleadonuevo;

    public controles_empleado() {
        empleadonuevo = new Empleadonuevo();
    }

    public void agregarEmpleado(String nombre, int telefono, String departamento, String email, String cubiculo) {
        Empleados empleado = new Empleados(0, nombre, telefono, cubiculo, departamento, email);
        empleadonuevo.agregarempleado(empleado);
    }

    public void modificarEmpleado(long empleadoId, String nombre, int telefono, String cubiculo, String departamento, String email) {
    try {
        Empleados empleado = new Empleados(empleadoId, nombre, telefono, cubiculo, departamento, email);
        Empleadonuevo empleadonuevo = new Empleadonuevo();
        empleadonuevo.actualizarempleado(empleado);
    } catch (NumberFormatException e) {
        e.printStackTrace();
        // Handle the NumberFormatException as needed, such as showing an error message to the user.
    }
    }

    public void borrarEmpleado(long empleadosid) {
        empleadonuevo.borrarempleado(empleadosid);
    }
    }