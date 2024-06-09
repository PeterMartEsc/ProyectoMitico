package es.ies.puerto.negocio.dto;

import java.util.Objects;

public class ProcedenciaDTO {
    private int id;
    private String nombre;
    private String anios;

    public ProcedenciaDTO() {
    }

    public ProcedenciaDTO(int id) {
        this.id = id;
    }

    public ProcedenciaDTO(int id, String nombre, String anios) {
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
        ProcedenciaDTO that = (ProcedenciaDTO) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ProcedenciaDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", anios='" + anios + '\'' +
                '}';
    }
}
