package com.example.domain;

import org.hibernate.annotations.ManyToAny;

import javax.annotation.Generated;
import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by danielpuig on 17/10/2016.
 */

@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private LocalDate fecha;
    private Integer canastas;
    private Integer asistencias;
    private Integer rebotes;
    private String posicion;
    @ManyToOne
    private Equipo equipo;

    public Jugador() {
    }

    public Jugador(String nombre, LocalDate fecha, Integer canastas, Integer asistencias, Integer rebotes, String posicion, Equipo equipo) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.canastas = canastas;
        this.asistencias = asistencias;
        this.rebotes = rebotes;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getCanastas() {
        return canastas;
    }

    public void setCanastas(Integer canastas) {
        this.canastas = canastas;
    }

    public Integer getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(Integer asistencias) {
        this.asistencias = asistencias;
    }

    public Integer getRebotes() {
        return rebotes;
    }

    public void setRebotes(Integer rebotes) {
        this.rebotes = rebotes;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", canastas=" + canastas +
                ", asistencias=" + asistencias +
                ", rebotes=" + rebotes +
                ", posicion='" + posicion + '\'' +
                ", equipo=" + equipo +
                '}';
    }



}
