package es.ies.puerto.modelo.impl;

import java.util.Objects;

public class Dios {

    private int id;

    private String nombre;

    private String concepto;

    public Dios() {
    }

    public Dios(int id) {
        this.id = id;
    }

    public Dios(int id, String nombre, String concepto) {
        this.id = id;
        this.nombre = nombre;
        this.concepto = concepto;
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

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dios dios = (Dios) o;
        return id == dios.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Dios{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", concepto='" + concepto + '\'' +
                '}';
    }
}
