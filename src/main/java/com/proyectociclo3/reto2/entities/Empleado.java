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
    private String apellidos;    
    private String email;
    private Enum_RoleName rol;
    private Transaccion [] transacciones;
    private LocalDate fechacreacion;
    private LocalDate fechaactualizacion;    

    public Empleado() {
    }

    public Empleado(long cedula, String nombre, String apellidos, String email, Enum_RoleName rol, Transaccion[] transacciones, LocalDate fechacreacion, LocalDate fechaactualizacion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.rol = rol;
        this.transacciones = transacciones;
        this.fechacreacion = fechacreacion;
        this.fechaactualizacion = fechaactualizacion;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enum_RoleName getRol() {
        return rol;
    }

    public void setRol(Enum_RoleName rol) {
        this.rol = rol;
    }

    public Transaccion[] getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(Transaccion[] transacciones) {
        this.transacciones = transacciones;
    }

    public LocalDate getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(LocalDate fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public LocalDate getFechaactualizacion() {
        return fechaactualizacion;
    }

    public void setFechaactualizacion(LocalDate fechaactualizacion) {
        this.fechaactualizacion = fechaactualizacion;
    }

    
}
