/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectociclo3.reto2.entities;

/**
 *
 * @author LUNEL
 */
class Usuario {
   private long id;
    private long cedula;
    private String nombre;
    private EnumUsuario rol;

    public Usuario() {
    }

    public Usuario(long id, long cedula, String nombre, EnumUsuario rol) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.rol = rol;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public EnumUsuario getRol() {
        return rol;
    }

    public void setRol(EnumUsuario rol) {
        this.rol = rol;
    }
    
        
}
