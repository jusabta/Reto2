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
public class Transaccion {
    private long id;
    private String concepto;
    private float valor;
    private Empresa empresa;
    private LocalDate fechacreacion;
    private LocalDate fechaactualizacion;    

    public Transaccion() {
    }

    public Transaccion(long id, String concepto, float valor, Empresa empresa, LocalDate fechacreacion, LocalDate fechaactualizacion) {
        this.id = id;
        this.concepto = concepto;
        this.valor = valor;
        this.empresa = empresa;
        this.fechacreacion = fechacreacion;
        this.fechaactualizacion = fechaactualizacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
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
