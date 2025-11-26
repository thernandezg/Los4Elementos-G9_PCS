/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal.main;

import java.sql.Timestamp;

/**
 *
 * @author Admin
 */
public class Proyecto {
    
    private int id;
    private String nombre;
    private String descripcion;
    private int idUsuarioCreador;
    private Timestamp fechaCreacion;

    // Constructor vacío (necesario para DAO)
    public Proyecto() {
    }

    // Constructor útil para crear un nuevo proyecto
    public Proyecto(String nombre, String descripcion, int idUsuarioCreador) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idUsuarioCreador = idUsuarioCreador;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdUsuarioCreador() {
        return idUsuarioCreador;
    }

    public void setIdUsuarioCreador(int idUsuarioCreador) {
        this.idUsuarioCreador = idUsuarioCreador;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
