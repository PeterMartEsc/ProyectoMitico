package es.ies.puerto.negocio.dto;

import java.util.Objects;

public class LugarDTO {
    private int id;
    private String nombre;
    private String localizacion;

    public LugarDTO() {
    }

    public LugarDTO(int id) {
        this.id = id;
    }

    public LugarDTO(int id, String nombre, String localizacion) {
        this.id = id;
        this.nombre = nombre;
        this.localizacion = localizacion;
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

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LugarDTO lugarDTO = (LugarDTO) o;
        return id == lugarDTO.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "LugarDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localizacion='" + localizacion + '\'' +
                '}';
    }
}
