/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proyectoFinal;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author T-107
 */
@Entity
@Table(name = "sala")
public class Sala implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fechaFuncion;
    private int numSala;
    @ManyToOne
    @JoinColumn(name = "id_pelicula")
    private Pelicula pelis;

    public Pelicula getPelis() {
        return pelis;
    }

    public void setPelis(Pelicula pelis) {
        this.pelis = pelis;
    }

    @Override
    public String toString() {
        return "Sala{" + "id=" + id + ", fechaFuncion=" + fechaFuncion + ", numSala=" + numSala + ", pelis=" + pelis + '}';
    }

    public Sala(Long id) {
        this.id = id;
    }

    public Sala(Date fechaFuncion, int numSala, Pelicula pelis) {
        this.fechaFuncion = fechaFuncion;
        this.numSala = numSala;
        this.pelis = pelis;
    }

    public Sala() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaFuncion() {
        return fechaFuncion;
    }

    public void setFechaFuncion(Date fechaFuncion) {
        this.fechaFuncion = fechaFuncion;
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }


}
