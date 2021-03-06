/*
 * This file is generated by jOOQ.
 */
package com.api.jooq.tables;


import com.api.jooq.Indexes;
import com.api.jooq.Keys;
import com.api.jooq.Public;
import com.api.jooq.tables.records.CoPadreRecord;

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
public class CoPadre extends TableImpl<CoPadreRecord> {

    private static final long serialVersionUID = -349078067;

    /**
     * The reference instance of <code>public.co_padre</code>
     */
    public static final CoPadre CO_PADRE = new CoPadre();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CoPadreRecord> getRecordType() {
        return CoPadreRecord.class;
    }

    /**
     * The column <code>public.co_padre.id</code>.
     */
    public final TableField<CoPadreRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('co_padre_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.co_padre.nombre</code>.
     */
    public final TableField<CoPadreRecord, String> NOMBRE = createField("nombre", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.co_padre.correo</code>.
     */
    public final TableField<CoPadreRecord, String> CORREO = createField("correo", org.jooq.impl.SQLDataType.VARCHAR(60).nullable(false), this, "");

    /**
     * The column <code>public.co_padre.password</code>.
     */
    public final TableField<CoPadreRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(15).nullable(false), this, "");

    /**
     * The column <code>public.co_padre.telefono</code>.
     */
    public final TableField<CoPadreRecord, String> TELEFONO = createField("telefono", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.co_padre.fecha_genero</code>.
     */
    public final TableField<CoPadreRecord, Timestamp> FECHA_GENERO = createField("fecha_genero", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>public.co_padre.fecha_modifico</code>.
     */
    public final TableField<CoPadreRecord, Timestamp> FECHA_MODIFICO = createField("fecha_modifico", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.co_padre.genero</code>.
     */
    public final TableField<CoPadreRecord, Integer> GENERO = createField("genero", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.co_padre.modifico</code>.
     */
    public final TableField<CoPadreRecord, Integer> MODIFICO = createField("modifico", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.co_padre.eliminado</code>.
     */
    public final TableField<CoPadreRecord, Boolean> ELIMINADO = createField("eliminado", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>public.co_padre</code> table reference
     */
    public CoPadre() {
        this(DSL.name("co_padre"), null);
    }

    /**
     * Create an aliased <code>public.co_padre</code> table reference
     */
    public CoPadre(String alias) {
        this(DSL.name(alias), CO_PADRE);
    }

    /**
     * Create an aliased <code>public.co_padre</code> table reference
     */
    public CoPadre(Name alias) {
        this(alias, CO_PADRE);
    }

    private CoPadre(Name alias, Table<CoPadreRecord> aliased) {
        this(alias, aliased, null);
    }

    private CoPadre(Name alias, Table<CoPadreRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CoPadre(Table<O> child, ForeignKey<O, CoPadreRecord> key) {
        super(child, key, CO_PADRE);
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
        return Arrays.<Index>asList(Indexes.CO_PADRE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CoPadreRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CO_PADRE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CoPadreRecord> getPrimaryKey() {
        return Keys.CO_PADRE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CoPadreRecord>> getKeys() {
        return Arrays.<UniqueKey<CoPadreRecord>>asList(Keys.CO_PADRE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoPadre as(String alias) {
        return new CoPadre(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoPadre as(Name alias) {
        return new CoPadre(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CoPadre rename(String name) {
        return new CoPadre(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoPadre rename(Name name) {
        return new CoPadre(name, null);
    }
}
