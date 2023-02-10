/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alumnos.alumnos2023.Entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Alumnos {

    @Id
    private String idAlumnos;
    private String nombre;
    private Integer dni;

    @Temporal(TemporalType.DATE)
    private Date alta;

    public Alumnos() {
    }

    public String getIdAlumnos() {
        return idAlumnos;
    }

    public void setIdAlumnos(String idAlumnos) {
        this.idAlumnos = idAlumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Date getAlta() {
        return alta;
    }

    public void setAlta(Date alta) {
        this.alta = alta;
    }

}
