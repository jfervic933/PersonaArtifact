/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.carlos;

import java.time.LocalDate;

/**
 *
 * @author profesor
 */
public class Persona {
    
    private LocalDate fechaNac;
    private String nombre;
    private String apellido1;
    private String nif;

    public Persona(LocalDate fechaNac, String nombre, String apellido1, String nif) {
        this.fechaNac = fechaNac;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.nif = nif;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Persona{" + "fechaNac=" + fechaNac + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", nif=" + nif + '}';
    }
    
    public void saludar (Persona aux){
        System.out.println("Hola " + aux.getNombre());
    }
    
}
