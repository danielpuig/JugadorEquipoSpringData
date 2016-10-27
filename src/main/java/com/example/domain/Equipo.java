package com.example.domain;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by danielpuig on 17/10/2016.
 */

@Entity
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String localidad;
    private LocalDate fecha;

    public Equipo() {
    }

    public Equipo(String nombre, String localidad, LocalDate fecha) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.fecha = fecha;
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

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equipo)) return false;

        Equipo equipo = (Equipo) o;

        if (!id.equals(equipo.id)) return false;
        if (!nombre.equals(equipo.nombre)) return false;
        if (!localidad.equals(equipo.localidad)) return false;
        return fecha.equals(equipo.fecha);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + nombre.hashCode();
        result = 31 * result + localidad.hashCode();
        result = 31 * result + fecha.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
