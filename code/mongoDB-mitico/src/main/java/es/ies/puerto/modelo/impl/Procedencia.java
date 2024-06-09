package es.ies.puerto.modelo.impl;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document("Procedencia")
public class Procedencia {
    @Id
    private int id;

    private String nombre;

    private String anios;

    public Procedencia() {
    }

    public Procedencia(int id) {
        this.id = id;
    }

    public Procedencia(int id, String nombre, String anios) {
        this.id = id;
        this.nombre = nombre;
        this.anios = anios;
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

    public String getAnios() {
        return anios;
    }

    public void setAnios(String anios) {
        this.anios = anios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Procedencia that = (Procedencia) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Procedencia{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", anios='" + anios + '\'' +
                '}';
    }
}
