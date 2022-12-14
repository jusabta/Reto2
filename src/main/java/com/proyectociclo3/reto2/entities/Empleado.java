/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectociclo3.reto2.entities;

import java.time.LocalDate;

/**
 *
 * @author LUNEL
 */
public class Empleado {
    private long cedula;
    private String nombre;
    private String email;
    public Empresa empresa; 

    public Empleado() {
    }

    public Empleado(long cedula, String nombre, String email, Empresa empresa) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.email = email;
        this.empresa = empresa;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }


}
