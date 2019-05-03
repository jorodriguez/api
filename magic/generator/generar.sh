#!/bin/bash
java -classpath jooq-3.11.3.jar:jooq-meta-3.11.3.jar:jooq-codegen-3.11.3.jar:postgresql-9.2-1002.jdbc4.jar:connector-api-1.5.jar:. org.jooq.codegen.GenerationTool library.xml
