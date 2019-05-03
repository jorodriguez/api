/*
 * This file is generated by jOOQ.
 */
package com.api.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoGrupo implements Serializable {

    private static final long serialVersionUID = 989374853;

    private Integer   id;
    private String    nombre;
    private Timestamp fechaGenero;
    private Timestamp fechaModifico;
    private Integer   genero;
    private Integer   modifico;
    private Boolean   eliminado;

    public CoGrupo() {}

    public CoGrupo(CoGrupo value) {
        this.id = value.id;
        this.nombre = value.nombre;
        this.fechaGenero = value.fechaGenero;
        this.fechaModifico = value.fechaModifico;
        this.genero = value.genero;
        this.modifico = value.modifico;
        this.eliminado = value.eliminado;
    }

    public CoGrupo(
        Integer   id,
        String    nombre,
        Timestamp fechaGenero,
        Timestamp fechaModifico,
        Integer   genero,
        Integer   modifico,
        Boolean   eliminado
    ) {
        this.id = id;
        this.nombre = nombre;
        this.fechaGenero = fechaGenero;
        this.fechaModifico = fechaModifico;
        this.genero = genero;
        this.modifico = modifico;
        this.eliminado = eliminado;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Timestamp getFechaGenero() {
        return this.fechaGenero;
    }

    public void setFechaGenero(Timestamp fechaGenero) {
        this.fechaGenero = fechaGenero;
    }

    public Timestamp getFechaModifico() {
        return this.fechaModifico;
    }

    public void setFechaModifico(Timestamp fechaModifico) {
        this.fechaModifico = fechaModifico;
    }

    public Integer getGenero() {
        return this.genero;
    }

    public void setGenero(Integer genero) {
        this.genero = genero;
    }

    public Integer getModifico() {
        return this.modifico;
    }

    public void setModifico(Integer modifico) {
        this.modifico = modifico;
    }

    public Boolean getEliminado() {
        return this.eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final CoGrupo other = (CoGrupo) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        }
        else if (!nombre.equals(other.nombre))
            return false;
        if (fechaGenero == null) {
            if (other.fechaGenero != null)
                return false;
        }
        else if (!fechaGenero.equals(other.fechaGenero))
            return false;
        if (fechaModifico == null) {
            if (other.fechaModifico != null)
                return false;
        }
        else if (!fechaModifico.equals(other.fechaModifico))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        }
        else if (!genero.equals(other.genero))
            return false;
        if (modifico == null) {
            if (other.modifico != null)
                return false;
        }
        else if (!modifico.equals(other.modifico))
            return false;
        if (eliminado == null) {
            if (other.eliminado != null)
                return false;
        }
        else if (!eliminado.equals(other.eliminado))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.nombre == null) ? 0 : this.nombre.hashCode());
        result = prime * result + ((this.fechaGenero == null) ? 0 : this.fechaGenero.hashCode());
        result = prime * result + ((this.fechaModifico == null) ? 0 : this.fechaModifico.hashCode());
        result = prime * result + ((this.genero == null) ? 0 : this.genero.hashCode());
        result = prime * result + ((this.modifico == null) ? 0 : this.modifico.hashCode());
        result = prime * result + ((this.eliminado == null) ? 0 : this.eliminado.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CoGrupo (");

        sb.append(id);
        sb.append(", ").append(nombre);
        sb.append(", ").append(fechaGenero);
        sb.append(", ").append(fechaModifico);
        sb.append(", ").append(genero);
        sb.append(", ").append(modifico);
        sb.append(", ").append(eliminado);

        sb.append(")");
        return sb.toString();
    }
}