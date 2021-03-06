/*
 * This file is generated by jOOQ.
 */
package com.api.jooq.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
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
public class CoAlumno implements Serializable {

    private static final long serialVersionUID = 2084508112;

    private Integer    id;
    private Integer    coSucursal;
    private Integer    coGrupo;
    private Integer    coPadre;
    private String     nombre;
    private Date       fechaNacimiento;
    private String     alergias;
    private String     nota;
    private Time       horaSalida;
    private BigDecimal costoInscripcion;
    private BigDecimal costoColegiatura;
    private Integer    minutosGracia;
    private String     foto;
    private Date       fechaReinscripcion;
    private Timestamp  fechaGenero;
    private Timestamp  fechaModifico;
    private Integer    genero;
    private Integer    modifico;
    private Boolean    eliminado;

    public CoAlumno() {}

    public CoAlumno(CoAlumno value) {
        this.id = value.id;
        this.coSucursal = value.coSucursal;
        this.coGrupo = value.coGrupo;
        this.coPadre = value.coPadre;
        this.nombre = value.nombre;
        this.fechaNacimiento = value.fechaNacimiento;
        this.alergias = value.alergias;
        this.nota = value.nota;
        this.horaSalida = value.horaSalida;
        this.costoInscripcion = value.costoInscripcion;
        this.costoColegiatura = value.costoColegiatura;
        this.minutosGracia = value.minutosGracia;
        this.foto = value.foto;
        this.fechaReinscripcion = value.fechaReinscripcion;
        this.fechaGenero = value.fechaGenero;
        this.fechaModifico = value.fechaModifico;
        this.genero = value.genero;
        this.modifico = value.modifico;
        this.eliminado = value.eliminado;
    }

    public CoAlumno(
        Integer    id,
        Integer    coSucursal,
        Integer    coGrupo,
        Integer    coPadre,
        String     nombre,
        Date       fechaNacimiento,
        String     alergias,
        String     nota,
        Time       horaSalida,
        BigDecimal costoInscripcion,
        BigDecimal costoColegiatura,
        Integer    minutosGracia,
        String     foto,
        Date       fechaReinscripcion,
        Timestamp  fechaGenero,
        Timestamp  fechaModifico,
        Integer    genero,
        Integer    modifico,
        Boolean    eliminado
    ) {
        this.id = id;
        this.coSucursal = coSucursal;
        this.coGrupo = coGrupo;
        this.coPadre = coPadre;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.alergias = alergias;
        this.nota = nota;
        this.horaSalida = horaSalida;
        this.costoInscripcion = costoInscripcion;
        this.costoColegiatura = costoColegiatura;
        this.minutosGracia = minutosGracia;
        this.foto = foto;
        this.fechaReinscripcion = fechaReinscripcion;
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

    public Integer getCoSucursal() {
        return this.coSucursal;
    }

    public void setCoSucursal(Integer coSucursal) {
        this.coSucursal = coSucursal;
    }

    public Integer getCoGrupo() {
        return this.coGrupo;
    }

    public void setCoGrupo(Integer coGrupo) {
        this.coGrupo = coGrupo;
    }

    public Integer getCoPadre() {
        return this.coPadre;
    }

    public void setCoPadre(Integer coPadre) {
        this.coPadre = coPadre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getAlergias() {
        return this.alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getNota() {
        return this.nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Time getHoraSalida() {
        return this.horaSalida;
    }

    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }

    public BigDecimal getCostoInscripcion() {
        return this.costoInscripcion;
    }

    public void setCostoInscripcion(BigDecimal costoInscripcion) {
        this.costoInscripcion = costoInscripcion;
    }

    public BigDecimal getCostoColegiatura() {
        return this.costoColegiatura;
    }

    public void setCostoColegiatura(BigDecimal costoColegiatura) {
        this.costoColegiatura = costoColegiatura;
    }

    public Integer getMinutosGracia() {
        return this.minutosGracia;
    }

    public void setMinutosGracia(Integer minutosGracia) {
        this.minutosGracia = minutosGracia;
    }

    public String getFoto() {
        return this.foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Date getFechaReinscripcion() {
        return this.fechaReinscripcion;
    }

    public void setFechaReinscripcion(Date fechaReinscripcion) {
        this.fechaReinscripcion = fechaReinscripcion;
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
        final CoAlumno other = (CoAlumno) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (coSucursal == null) {
            if (other.coSucursal != null)
                return false;
        }
        else if (!coSucursal.equals(other.coSucursal))
            return false;
        if (coGrupo == null) {
            if (other.coGrupo != null)
                return false;
        }
        else if (!coGrupo.equals(other.coGrupo))
            return false;
        if (coPadre == null) {
            if (other.coPadre != null)
                return false;
        }
        else if (!coPadre.equals(other.coPadre))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        }
        else if (!nombre.equals(other.nombre))
            return false;
        if (fechaNacimiento == null) {
            if (other.fechaNacimiento != null)
                return false;
        }
        else if (!fechaNacimiento.equals(other.fechaNacimiento))
            return false;
        if (alergias == null) {
            if (other.alergias != null)
                return false;
        }
        else if (!alergias.equals(other.alergias))
            return false;
        if (nota == null) {
            if (other.nota != null)
                return false;
        }
        else if (!nota.equals(other.nota))
            return false;
        if (horaSalida == null) {
            if (other.horaSalida != null)
                return false;
        }
        else if (!horaSalida.equals(other.horaSalida))
            return false;
        if (costoInscripcion == null) {
            if (other.costoInscripcion != null)
                return false;
        }
        else if (!costoInscripcion.equals(other.costoInscripcion))
            return false;
        if (costoColegiatura == null) {
            if (other.costoColegiatura != null)
                return false;
        }
        else if (!costoColegiatura.equals(other.costoColegiatura))
            return false;
        if (minutosGracia == null) {
            if (other.minutosGracia != null)
                return false;
        }
        else if (!minutosGracia.equals(other.minutosGracia))
            return false;
        if (foto == null) {
            if (other.foto != null)
                return false;
        }
        else if (!foto.equals(other.foto))
            return false;
        if (fechaReinscripcion == null) {
            if (other.fechaReinscripcion != null)
                return false;
        }
        else if (!fechaReinscripcion.equals(other.fechaReinscripcion))
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
        result = prime * result + ((this.coSucursal == null) ? 0 : this.coSucursal.hashCode());
        result = prime * result + ((this.coGrupo == null) ? 0 : this.coGrupo.hashCode());
        result = prime * result + ((this.coPadre == null) ? 0 : this.coPadre.hashCode());
        result = prime * result + ((this.nombre == null) ? 0 : this.nombre.hashCode());
        result = prime * result + ((this.fechaNacimiento == null) ? 0 : this.fechaNacimiento.hashCode());
        result = prime * result + ((this.alergias == null) ? 0 : this.alergias.hashCode());
        result = prime * result + ((this.nota == null) ? 0 : this.nota.hashCode());
        result = prime * result + ((this.horaSalida == null) ? 0 : this.horaSalida.hashCode());
        result = prime * result + ((this.costoInscripcion == null) ? 0 : this.costoInscripcion.hashCode());
        result = prime * result + ((this.costoColegiatura == null) ? 0 : this.costoColegiatura.hashCode());
        result = prime * result + ((this.minutosGracia == null) ? 0 : this.minutosGracia.hashCode());
        result = prime * result + ((this.foto == null) ? 0 : this.foto.hashCode());
        result = prime * result + ((this.fechaReinscripcion == null) ? 0 : this.fechaReinscripcion.hashCode());
        result = prime * result + ((this.fechaGenero == null) ? 0 : this.fechaGenero.hashCode());
        result = prime * result + ((this.fechaModifico == null) ? 0 : this.fechaModifico.hashCode());
        result = prime * result + ((this.genero == null) ? 0 : this.genero.hashCode());
        result = prime * result + ((this.modifico == null) ? 0 : this.modifico.hashCode());
        result = prime * result + ((this.eliminado == null) ? 0 : this.eliminado.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CoAlumno (");

        sb.append(id);
        sb.append(", ").append(coSucursal);
        sb.append(", ").append(coGrupo);
        sb.append(", ").append(coPadre);
        sb.append(", ").append(nombre);
        sb.append(", ").append(fechaNacimiento);
        sb.append(", ").append(alergias);
        sb.append(", ").append(nota);
        sb.append(", ").append(horaSalida);
        sb.append(", ").append(costoInscripcion);
        sb.append(", ").append(costoColegiatura);
        sb.append(", ").append(minutosGracia);
        sb.append(", ").append(foto);
        sb.append(", ").append(fechaReinscripcion);
        sb.append(", ").append(fechaGenero);
        sb.append(", ").append(fechaModifico);
        sb.append(", ").append(genero);
        sb.append(", ").append(modifico);
        sb.append(", ").append(eliminado);

        sb.append(")");
        return sb.toString();
    }
}
