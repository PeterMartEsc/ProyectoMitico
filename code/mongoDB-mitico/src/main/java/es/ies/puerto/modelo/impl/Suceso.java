package es.ies.puerto.modelo.impl;

import java.util.Objects;

public class Suceso {
    private int id;
    private String nombre;

    public Suceso() {
    }

    public Suceso(int id) {
        this.id = id;
    }

    public Suceso(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Suceso suceso = (Suceso) o;
        return id == suceso.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Suceso{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
