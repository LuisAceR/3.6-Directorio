/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Luis Acevedo
 */
public class Empleados {
    long empleadosid;
    public String nombre;
    public int telefono;
    public String cubiculo;
    public String departamento;
    public String email;

    public Empleados(long empleadosid, String nombre, int telefono, String cubiculo, String departamento, String email) {
        this.empleadosid = empleadosid;
        this.nombre = nombre;
        this.telefono = telefono;
        this.cubiculo = cubiculo;
        this.departamento = departamento;
        this.email = email;
    }
    
    public void setID(long empleadosid){
        this.empleadosid = empleadosid;
    }
    
    public long getID(){
        return empleadosid;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCubiculo() {
        return cubiculo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getEmail() {
        return email;
    }
    
}
