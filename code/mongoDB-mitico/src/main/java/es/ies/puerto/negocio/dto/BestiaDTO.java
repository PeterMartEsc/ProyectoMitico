package es.ies.puerto.negocio.dto;

import java.util.Objects;

/**
 * Clase Dto para la clase Bestia
 */
public class BestiaDTO {
    private int id;
    private String nombre;
    private String cualidad;

    public BestiaDTO() {
    }

    public BestiaDTO(int id) {
        this.id = id;
    }

    public BestiaDTO(int id, String nombre, String cualidad) {
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
        BestiaDTO bestiaDTO = (BestiaDTO) o;
        return id == bestiaDTO.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "BestiaDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cualidad='" + cualidad + '\'' +
                '}';
    }
}
