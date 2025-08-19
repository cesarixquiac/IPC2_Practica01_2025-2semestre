/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc2_practica01_2025.semestre.Models;

import java.sql.Date;

/**
 *
 * @author cesar
 */
public class Evento {

    public String getCodigoEvento() {
        return codigoEvento;
    }

    public void setCodigoEvento(String codigoEvento) {
        this.codigoEvento = codigoEvento;
    }

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public double getCostoInscripcion() {
        return costoInscripcion;
    }

    public void setCostoInscripcion(double costoInscripcion) {
        this.costoInscripcion = costoInscripcion;
    }

    public Evento(String codigoEvento, String tipoEvento, String titulo, String ubicacion, int cupoMaximo, double costoInscripcion,Date fechaEvento) {
        this.codigoEvento = codigoEvento;
        this.fechaEvento = fechaEvento;
        this.tipoEvento = tipoEvento;
        this.titulo = titulo;
        this.ubicacion = ubicacion;
        this.cupoMaximo = cupoMaximo;
        this.costoInscripcion = costoInscripcion;
    }
    private String codigoEvento;
    private java.sql.Date fechaEvento;
    private String tipoEvento;
    private String titulo;
    private String ubicacion;
    private int cupoMaximo;
    private double costoInscripcion;
    
    
}
