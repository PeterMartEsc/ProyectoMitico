package es.ies.puerto.modelo.impl;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document("Bestia")
public class Bestia {
    @Id
    private int id;
    private String nombre;
    private String cualidad;

    public Bestia() {
    }

    public Bestia(int id) {
        this.id = id;
    }

    public Bestia(int id, String nombre, String cualidad) {
        this.id = id;
        this.nombre = nombre;
        this.cualidad = cualidad;
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

    public String getCualidad() {
        return cualidad;
    }

    public void setCualidad(String cualidad) {
        this.cualidad = cualidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bestia bestia = (Bestia) o;
        return id == bestia.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Bestia{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cualidad='" + cualidad + '\'' +
                '}';
    }
}
