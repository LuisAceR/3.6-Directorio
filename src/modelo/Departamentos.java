/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Luis Acevedo
 */
public class Departamentos {
    long departamentoID;
    public String nombre;
    public int numero;
    public String gerente;

    public Departamentos(String nombre, int numero, String gerente) {
        this.departamentoID = departamentoID;
        this.nombre = nombre;
        this.numero = numero;
        this.gerente = gerente;
    }
    
     public long getDepartamentoID() {
        return departamentoID;
    }

    public void setDepartamentoID(long departamentoID) {
        this.departamentoID = departamentoID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
}