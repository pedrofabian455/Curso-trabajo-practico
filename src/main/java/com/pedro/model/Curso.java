/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pedro.model;

/**
 *
 * @author Fabian
 */
public class Curso {
    
    private Integer id;
    private String nombre;
    private String turno;
    private String cupos;
    private String costo;
    
    public Curso(){
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
     public void setCupos(String cupos) {
        this.cupos = cupos;
    }

    public String getCupos() {
        return cupos;
    }
     public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getCosto() {
        return costo;
    }
    

}
