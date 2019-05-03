/*
 * This file is generated by jOOQ.
 */
package com.api.jooq.tables.records;


import com.api.jooq.tables.CoGrupo;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


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
public class CoGrupoRecord extends UpdatableRecordImpl<CoGrupoRecord> implements Record7<Integer, String, Timestamp, Timestamp, Integer, Integer, Boolean> {

    private static final long serialVersionUID = -1819174500;

    /**
     * Setter for <code>public.co_grupo.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.co_grupo.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.co_grupo.nombre</code>.
     */
    public void setNombre(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.co_grupo.nombre</code>.
     */
    public String getNombre() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.co_grupo.fecha_genero</code>.
     */
    public void setFechaGenero(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.co_grupo.fecha_genero</code>.
     */
    public Timestamp getFechaGenero() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>public.co_grupo.fecha_modifico</code>.
     */
    public void setFechaModifico(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.co_grupo.fecha_modifico</code>.
     */
    public Timestamp getFechaModifico() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>public.co_grupo.genero</code>.
     */
    public void setGenero(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.co_grupo.genero</code>.
     */
    public Integer getGenero() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.co_grupo.modifico</code>.
     */
    public void setModifico(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.co_grupo.modifico</code>.
     */
    public Integer getModifico() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.co_grupo.eliminado</code>.
     */
    public void setEliminado(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.co_grupo.eliminado</code>.
     */
    public Boolean getEliminado() {
        return (Boolean) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, Timestamp, Timestamp, Integer, Integer, Boolean> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, Timestamp, Timestamp, Integer, Integer, Boolean> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CoGrupo.CO_GRUPO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CoGrupo.CO_GRUPO.NOMBRE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return CoGrupo.CO_GRUPO.FECHA_GENERO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return CoGrupo.CO_GRUPO.FECHA_MODIFICO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return CoGrupo.CO_GRUPO.GENERO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return CoGrupo.CO_GRUPO.MODIFICO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return CoGrupo.CO_GRUPO.ELIMINADO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getNombre();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getFechaGenero();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getFechaModifico();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getGenero();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getModifico();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getEliminado();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNombre();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getFechaGenero();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getFechaModifico();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getGenero();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getModifico();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getEliminado();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoGrupoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoGrupoRecord value2(String value) {
        setNombre(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoGrupoRecord value3(Timestamp value) {
        setFechaGenero(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoGrupoRecord value4(Timestamp value) {
        setFechaModifico(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoGrupoRecord value5(Integer value) {
        setGenero(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoGrupoRecord value6(Integer value) {
        setModifico(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoGrupoRecord value7(Boolean value) {
        setEliminado(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoGrupoRecord values(Integer value1, String value2, Timestamp value3, Timestamp value4, Integer value5, Integer value6, Boolean value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CoGrupoRecord
     */
    public CoGrupoRecord() {
        super(CoGrupo.CO_GRUPO);
    }

    /**
     * Create a detached, initialised CoGrupoRecord
     */
    public CoGrupoRecord(Integer id, String nombre, Timestamp fechaGenero, Timestamp fechaModifico, Integer genero, Integer modifico, Boolean eliminado) {
        super(CoGrupo.CO_GRUPO);

        set(0, id);
        set(1, nombre);
        set(2, fechaGenero);
        set(3, fechaModifico);
        set(4, genero);
        set(5, modifico);
        set(6, eliminado);
    }
}