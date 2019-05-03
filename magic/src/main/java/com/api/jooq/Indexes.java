/*
 * This file is generated by jOOQ.
 */
package com.api.jooq;


import com.api.jooq.tables.CoAlumno;
import com.api.jooq.tables.CoGrupo;
import com.api.jooq.tables.CoPadre;
import com.api.jooq.tables.CoSucursal;
import com.api.jooq.tables.Usuario;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index CO_ALUMNO_PKEY = Indexes0.CO_ALUMNO_PKEY;
    public static final Index CO_GRUPO_PKEY = Indexes0.CO_GRUPO_PKEY;
    public static final Index CO_PADRE_PKEY = Indexes0.CO_PADRE_PKEY;
    public static final Index CO_SUCURSAL_PKEY = Indexes0.CO_SUCURSAL_PKEY;
    public static final Index USUARIO_PKEY = Indexes0.USUARIO_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index CO_ALUMNO_PKEY = Internal.createIndex("co_alumno_pkey", CoAlumno.CO_ALUMNO, new OrderField[] { CoAlumno.CO_ALUMNO.ID }, true);
        public static Index CO_GRUPO_PKEY = Internal.createIndex("co_grupo_pkey", CoGrupo.CO_GRUPO, new OrderField[] { CoGrupo.CO_GRUPO.ID }, true);
        public static Index CO_PADRE_PKEY = Internal.createIndex("co_padre_pkey", CoPadre.CO_PADRE, new OrderField[] { CoPadre.CO_PADRE.ID }, true);
        public static Index CO_SUCURSAL_PKEY = Internal.createIndex("co_sucursal_pkey", CoSucursal.CO_SUCURSAL, new OrderField[] { CoSucursal.CO_SUCURSAL.ID }, true);
        public static Index USUARIO_PKEY = Internal.createIndex("usuario_pkey", Usuario.USUARIO, new OrderField[] { Usuario.USUARIO.ID }, true);
    }
}
