/*
 * This file is generated by jOOQ.
 */
package com.api.jooq.tables;


import com.api.jooq.Indexes;
import com.api.jooq.Keys;
import com.api.jooq.Public;
import com.api.jooq.tables.records.CoAlumnoRecord;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class CoAlumno extends TableImpl<CoAlumnoRecord> {

    private static final long serialVersionUID = -524381130;

    /**
     * The reference instance of <code>public.co_alumno</code>
     */
    public static final CoAlumno CO_ALUMNO = new CoAlumno();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CoAlumnoRecord> getRecordType() {
        return CoAlumnoRecord.class;
    }

    /**
     * The column <code>public.co_alumno.id</code>.
     */
    public final TableField<CoAlumnoRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('co_alumno_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.co_alumno.co_sucursal</code>.
     */
    public final TableField<CoAlumnoRecord, Integer> CO_SUCURSAL = createField("co_sucursal", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.co_alumno.co_grupo</code>.
     */
    public final TableField<CoAlumnoRecord, Integer> CO_GRUPO = createField("co_grupo", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.co_alumno.co_padre</code>.
     */
    public final TableField<CoAlumnoRecord, Integer> CO_PADRE = createField("co_padre", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.co_alumno.nombre</code>.
     */
    public final TableField<CoAlumnoRecord, String> NOMBRE = createField("nombre", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.co_alumno.fecha_nacimiento</code>.
     */
    public final TableField<CoAlumnoRecord, Date> FECHA_NACIMIENTO = createField("fecha_nacimiento", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>public.co_alumno.alergias</code>.
     */
    public final TableField<CoAlumnoRecord, String> ALERGIAS = createField("alergias", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.co_alumno.nota</code>.
     */
    public final TableField<CoAlumnoRecord, String> NOTA = createField("nota", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.co_alumno.hora_salida</code>.
     */
    public final TableField<CoAlumnoRecord, Time> HORA_SALIDA = createField("hora_salida", org.jooq.impl.SQLDataType.TIME.nullable(false), this, "");

    /**
     * The column <code>public.co_alumno.costo_inscripcion</code>.
     */
    public final TableField<CoAlumnoRecord, BigDecimal> COSTO_INSCRIPCION = createField("costo_inscripcion", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>public.co_alumno.costo_colegiatura</code>.
     */
    public final TableField<CoAlumnoRecord, BigDecimal> COSTO_COLEGIATURA = createField("costo_colegiatura", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>public.co_alumno.minutos_gracia</code>.
     */
    public final TableField<CoAlumnoRecord, Integer> MINUTOS_GRACIA = createField("minutos_gracia", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.co_alumno.foto</code>.
     */
    public final TableField<CoAlumnoRecord, String> FOTO = createField("foto", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.co_alumno.fecha_reinscripcion</code>.
     */
    public final TableField<CoAlumnoRecord, Date> FECHA_REINSCRIPCION = createField("fecha_reinscripcion", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>public.co_alumno.fecha_genero</code>.
     */
    public final TableField<CoAlumnoRecord, Timestamp> FECHA_GENERO = createField("fecha_genero", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>public.co_alumno.fecha_modifico</code>.
     */
    public final TableField<CoAlumnoRecord, Timestamp> FECHA_MODIFICO = createField("fecha_modifico", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.co_alumno.genero</code>.
     */
    public final TableField<CoAlumnoRecord, Integer> GENERO = createField("genero", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.co_alumno.modifico</code>.
     */
    public final TableField<CoAlumnoRecord, Integer> MODIFICO = createField("modifico", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.co_alumno.eliminado</code>.
     */
    public final TableField<CoAlumnoRecord, Boolean> ELIMINADO = createField("eliminado", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>public.co_alumno</code> table reference
     */
    public CoAlumno() {
        this(DSL.name("co_alumno"), null);
    }

    /**
     * Create an aliased <code>public.co_alumno</code> table reference
     */
    public CoAlumno(String alias) {
        this(DSL.name(alias), CO_ALUMNO);
    }

    /**
     * Create an aliased <code>public.co_alumno</code> table reference
     */
    public CoAlumno(Name alias) {
        this(alias, CO_ALUMNO);
    }

    private CoAlumno(Name alias, Table<CoAlumnoRecord> aliased) {
        this(alias, aliased, null);
    }

    private CoAlumno(Name alias, Table<CoAlumnoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CoAlumno(Table<O> child, ForeignKey<O, CoAlumnoRecord> key) {
        super(child, key, CO_ALUMNO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CO_ALUMNO_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CoAlumnoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CO_ALUMNO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CoAlumnoRecord> getPrimaryKey() {
        return Keys.CO_ALUMNO_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CoAlumnoRecord>> getKeys() {
        return Arrays.<UniqueKey<CoAlumnoRecord>>asList(Keys.CO_ALUMNO_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoAlumno as(String alias) {
        return new CoAlumno(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoAlumno as(Name alias) {
        return new CoAlumno(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CoAlumno rename(String name) {
        return new CoAlumno(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoAlumno rename(Name name) {
        return new CoAlumno(name, null);
    }
}
