/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal.main;

/**
 *
 * @author litzy
 */
import java.util.Date;

public class Sprint {
    
    private int id;
    private String nombre;
    private String objetivo;
    private Date fechaInicio;
    private Date fechaFin;
    private String estado; // "PLANIFICADO", "EN_CURSO", "COMPLETADO"
    private int proyectoId;
    
    // Constructores
    public Sprint() {
        this.estado = "PLANIFICADO";
    }
    
    public Sprint(String nombre, String objetivo, Date fechaInicio, Date fechaFin, int proyectoId) {
        this();
        this.nombre = nombre;
        this.objetivo = objetivo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.proyectoId = proyectoId;
    }
    
    // Getters y Setters
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
    
    public String getObjetivo() {
        return objetivo;
    }
    
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    
    public Date getFechaInicio() {
        return fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    public Date getFechaFin() {
        return fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public int getProyectoId() {
        return proyectoId;
    }
    
    public void setProyectoId(int proyectoId) {
        this.proyectoId = proyectoId;
    }
    
    // Método utilitario
    public boolean estaEnCurso() {
        Date ahora = new Date();
        return "EN_CURSO".equals(estado) && 
               fechaInicio != null && fechaFin != null &&
               ahora.after(fechaInicio) && ahora.before(fechaFin);
    }
    
    @Override
    public String toString() {
        return "Sprint{" + "id=" + id + ", nombre=" + nombre + ", estado=" + estado + ", proyectoId=" + proyectoId + '}';
    }

}
