/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alumnos.alumnos2023.Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Escuelas {

    @Id
    private String idEscuelas;

    private String nombre;
    private String direccion;

    public Escuelas() {
    }

    public String getIdEscuelas() {
        return idEscuelas;
    }

    public void setIdEscuelas(String idEscuelas) {
        this.idEscuelas = idEscuelas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
