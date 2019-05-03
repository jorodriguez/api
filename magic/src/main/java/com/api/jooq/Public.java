/*
 * This file is generated by jOOQ.
 */
package com.api.jooq;


import com.api.jooq.tables.CoAlumno;
import com.api.jooq.tables.CoGrupo;
import com.api.jooq.tables.CoPadre;
import com.api.jooq.tables.CoSucursal;
import com.api.jooq.tables.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 260576334;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.co_alumno</code>.
     */
    public final CoAlumno CO_ALUMNO = com.api.jooq.tables.CoAlumno.CO_ALUMNO;

    /**
     * The table <code>public.co_grupo</code>.
     */
    public final CoGrupo CO_GRUPO = com.api.jooq.tables.CoGrupo.CO_GRUPO;

    /**
     * The table <code>public.co_padre</code>.
     */
    public final CoPadre CO_PADRE = com.api.jooq.tables.CoPadre.CO_PADRE;

    /**
     * The table <code>public.co_sucursal</code>.
     */
    public final CoSucursal CO_SUCURSAL = com.api.jooq.tables.CoSucursal.CO_SUCURSAL;

    /**
     * The table <code>public.usuario</code>.
     */
    public final Usuario USUARIO = com.api.jooq.tables.Usuario.USUARIO;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.CO_ALUMNO_ID_SEQ,
            Sequences.CO_GRUPO_ID_SEQ,
            Sequences.CO_PADRE_ID_SEQ,
            Sequences.CO_SUCURSAL_ID_SEQ,
            Sequences.USUARIO_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            CoAlumno.CO_ALUMNO,
            CoGrupo.CO_GRUPO,
            CoPadre.CO_PADRE,
            CoSucursal.CO_SUCURSAL,
            Usuario.USUARIO);
    }
}
