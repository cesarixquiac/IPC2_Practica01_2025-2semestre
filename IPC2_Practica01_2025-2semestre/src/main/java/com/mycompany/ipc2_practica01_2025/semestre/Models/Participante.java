/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc2_practica01_2025.semestre.Models;

/**
 *
 * @author cesar
 */
public class Participante {
    private String correo;
    private String nombre_completo;
    private String tipo_participante;
    private String institucion;

    // Constructor
    public Participante(String correo, String nombre_completo, String tipo_participante, String institucion) {
        this.correo = correo;
        this.nombre_completo = nombre_completo;
        this.tipo_participante = tipo_participante;
        this.institucion = institucion;
    }

    // Getters y setters
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getNombre_completo() { return nombre_completo; }
    public void setNombre_completo(String nombre_completo) { this.nombre_completo = nombre_completo; }

    public String getTipo_participante() { return tipo_participante; }
    public void setTipo_participante(String tipo_participante) { this.tipo_participante = tipo_participante; }

    public String getInstitucion() { return institucion; }
    public void setInstitucion(String institucion) { this.institucion = institucion; }
}