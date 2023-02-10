/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alumnos.alumnos2023.Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Materias {

    @Id
    private String idMaterias;

    private String asignatura;

    public Materias() {
    }

    public String getIdMaterias() {
        return idMaterias;
    }

    public void setIdMaterias(String idMaterias) {
        this.idMaterias = idMaterias;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

}
