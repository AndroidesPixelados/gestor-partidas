-- Tablas pertenecientes al modelo comúndrop table if exists modelo_base;CREATE TABLE modelo_base (id INTEGER NOT NULL,nombre TEXT(255) NOT NULL,PRIMARY KEY (id) );drop table if exists atributo;
CREATE TABLE atributo (
id integer NOT NULL,
valor varchar(255),
tipo_atributo_fk integer NOT NULL,
personaje_fk integer NOT NULL,
PRIMARY KEY (id)CONSTRAINT atributo_tipo_atributo_fk FOREIGN KEY (tipo_atributo_fk) REFERENCES tipo_atributo (id) ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT modelo_base_fk FOREIGN KEY (id) REFERENCES modelo_base (id) ON DELETE CASCADE ON UPDATE CASCADE
);
drop table if exists efecto_combate;
CREATE TABLE efecto_combate (
id INTEGER NOT NULL,
imagen INTEGER NOT NULL,
PRIMARY KEY (id) ,
CONSTRAINT imagen_fk FOREIGN KEY (imagen) REFERENCES imagen (id) ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT efecto_combate_por_personaje_fk FOREIGN KEY (id) REFERENCES efecto_combate_por_personaje (efecto_combate_fk) ON DELETE CASCADE ON UPDATE CASCADE
);
drop table if exists efecto_combate_por_personaje;
CREATE TABLE efecto_combate_por_personaje (
personaje_fk INTEGER NOT NULL,
efecto_combate_fk INTEGER NOT NULL,
PRIMARY KEY (personaje_fk, efecto_combate_fk) 
);
drop table if exists encuentro;
CREATE TABLE encuentro (
id INTEGER NOT NULL,
PRIMARY KEY (id) ,
CONSTRAINT encuentro_imagen_por_encuentro_fk FOREIGN KEY (id) REFERENCES imagen_por_encuentro (encuentro_fk) ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT encuentro_sonido_por_encuentro_fk FOREIGN KEY (id) REFERENCES sonido_por_encuentro (encuentro_fk) ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT encuentro_trama_por_encuentro_fk FOREIGN KEY (id) REFERENCES trama_por_encuentro (encuentro_fk) ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT modelo_base_fk FOREIGN KEY (id) REFERENCES modelo_base (id) ON DELETE CASCADE ON UPDATE CASCADE
);
drop table if exists etiqueta;
CREATE TABLE etiqueta (
id integer NOT NULL,
PRIMARY KEY (id) ,
CONSTRAINT modelo_base_fk FOREIGN KEY (id) REFERENCES modelo_base (id) ON DELETE CASCADE ON UPDATE CASCADE
);drop table if exists imagen;
CREATE TABLE imagen (
id INTEGER NOT NULL,
PRIMARY KEY (id) ,CONSTRAINT recurso_multimedia_fk FOREIGN KEY (id) REFERENCES recurso_multimedia (id) ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT imagen_por_encuentro_fk FOREIGN KEY (id) REFERENCES imagen_por_encuentro (imagen_fk) ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT imagen_por_personaje_fk FOREIGN KEY (id) REFERENCES imagen_por_personaje (imagen_fk) ON DELETE CASCADE ON UPDATE CASCADECONSTRAINT imagen_por_escena_fk FOREIGN KEY (id) REFERENCES imagen_por_escena (imagen_fk) ON DELETE CASCADE ON UPDATE CASCADE
);
drop table if exists imagen_por_encuentro;
CREATE TABLE imagen_por_encuentro (
encuentro_fk INTEGER NOT NULL,
imagen_fk INTEGER NOT NULL,
PRIMARY KEY (encuentro_fk, imagen_fk) 
);
drop table if exists imagen_por_personaje;
CREATE TABLE imagen_por_personaje (
personaje_fk INTEGER NOT NULL,
imagen_fk INTEGER NOT NULL,
PRIMARY KEY (personaje_fk, imagen_fk) 
);
drop table if exists personaje;
CREATE TABLE personaje (
id integer NOT NULL,
PRIMARY KEY (id) ,
CONSTRAINT imagen_por_personaje_fk FOREIGN KEY (id) REFERENCES imagen_por_personaje (personaje_fk) ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT trama_por_personaje_fk FOREIGN KEY (id) REFERENCES trama_por_personaje (personaje_fk) ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT modelo_base_fk FOREIGN KEY (id) REFERENCES modelo_base (id) ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT efecto_combate_por_personaje_fk FOREIGN KEY (id) REFERENCES efecto_combate_por_personaje (personaje_fk) ON DELETE CASCADE ON UPDATE CASCADE
);
drop table if exists raza;
CREATE TABLE raza (
id INTEGER NOT NULL,
PRIMARY KEY (id) ,
CONSTRAINT modelo_base_fk FOREIGN KEY (id) REFERENCES modelo_base (id) ON DELETE CASCADE ON UPDATE CASCADE
);
drop table if exists recurso_multimedia;
CREATE TABLE recurso_multimedia (
id integer NOT NULL,
ruta varchar(255) NOT NULL,
PRIMARY KEY (id) ,
CONSTRAINT modelo_base_fk FOREIGN KEY (id) REFERENCES modelo_base (id) ON DELETE CASCADE ON UPDATE CASCADE
);
drop table if exists sistema;
CREATE TABLE sistema (
id integer NOT NULL,
PRIMARY KEY (id) ,
CONSTRAINT sistema_modelo_base_fk FOREIGN KEY (id) REFERENCES modelo_base (id),
CONSTRAINT tipo_atributo_por_sistema_fk FOREIGN KEY (id) REFERENCES tipo_atributo_por_sistema (sistema_fk)
);
drop table if exists sonido;
CREATE TABLE sonido (
id INTEGER NOT NULL,
PRIMARY KEY (id) ,
CONSTRAINT sonido_sonido_por_encuentro_fk FOREIGN KEY (id) REFERENCES sonido_por_encuentro (sonido_fk) ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT recurso_multimedia_fk FOREIGN KEY (id) REFERENCES recurso_multimedia (id) ON DELETE CASCADE ON UPDATE CASCADE
);
drop table if exists sonido_por_encuentro;
CREATE TABLE sonido_por_encuentro (
sonido_fk INTEGER NOT NULL,
encuentro_fk INTEGER NOT NULL,
PRIMARY KEY (sonido_fk, encuentro_fk) 
);drop table if exists tipo_atributo;
CREATE TABLE tipo_atributo (
id integer NOT NULL,
tipo_semantico varchar(255) NOT NULL,
tipo_sintactico integer NOT NULL,
PRIMARY KEY (id) ,
CONSTRAINT tipo_atributo_por_sistema_fk FOREIGN KEY (id) REFERENCES tipo_atributo_por_sistema (tipo_atributo_fk) ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT modelo_base_fk FOREIGN KEY (id) REFERENCES modelo_base (id) ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT tipo_dato_fk FOREIGN KEY (tipo_sintactico) REFERENCES tipo_dato (id) ON DELETE CASCADE ON UPDATE CASCADE
);
drop table if exists tipo_atributo_por_sistema;
CREATE TABLE tipo_atributo_por_sistema (
tipo_atributo_fk INTEGER NOT NULL,
sistema_fk INTEGER NOT NULL,
PRIMARY KEY (tipo_atributo_fk, sistema_fk) 
);
drop table if exists tipo_dato;
CREATE TABLE tipo_dato (
id INTEGER NOT NULL,
valor INTEGER NOT NULL,
PRIMARY KEY (id) 
);
drop table if exists trama;
CREATE TABLE trama (
id integer NOT NULL,
texto text NOT NULL,
PRIMARY KEY (id) ,
CONSTRAINT trama_por_encuentro_fk FOREIGN KEY (id) REFERENCES trama_por_encuentro (trama_fk) ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT modelo_base_fk FOREIGN KEY (id) REFERENCES modelo_base (id) ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT trama_por_personaje_fk FOREIGN KEY (id) REFERENCES trama_por_personaje (trama_fk) ON DELETE CASCADE ON UPDATE CASCADECONSTRAINT trama_por_escena FOREIGN KEY (id) REFERENCES trama_por_escena (trama_fk) ON DELETE CASCADE ON UPDATE CASCADE
);
drop table if exists trama_por_encuentro;
CREATE TABLE trama_por_encuentro (
encuentro_fk INTEGER NOT NULL,
trama_fk INTEGER NOT NULL,
PRIMARY KEY (encuentro_fk, trama_fk) 
);
drop table if exists trama_por_personaje;
CREATE TABLE trama_por_personaje (
personaje_fk INTEGER NOT NULL,
trama_fk INTEGER NOT NULL,
PRIMARY KEY (personaje_fk, trama_fk) 
);-- Fin de Tablas pertenecientes al modelo común-- Tablas pertenecientes al modelo de DD4drop table if exists partida;CREATE TABLE partida (id INTEGER NOT NULL,PRIMARY KEY (id)CONSTRAINT escena_por_partida_fk FOREIGN KEY (id) REFERENCES escena_por_partida (partida_fk) ON DELETE CASCADE ON UPDATE CASCADE );drop table if exists escena_por_partida;CREATE TABLE escena_por_partida (escena_fk INTEGER NOT NULL,partida_fk INTEGER NOT NULL,PRIMARY KEY (escena_fk, partida_fk));drop table if exists clase_personaje;CREATE TABLE clase_personaje (id INTEGER NOT NULL,VALOR INTEGER(2) NOT NULL,PRIMARY KEY (id)CONSTRAINT clase_personaje_por_personaje_jugador_fk FOREIGN KEY (id) REFERENCES clase_personaje_por_personaje_jugador (clase_personaje_fk) ON DELETE CASCADE ON UPDATE CASCADE );drop table if exists rol;CREATE TABLE rol (id INTEGER NOT NULL,elite INTEGER(1) NOT NULL,lider INTEGER(1) NOT NULL,PRIMARY KEY (id)CONSTRAINT modelo_base_fk FOREIGN KEY (id) REFERENCES modelo_base (id) ON DELETE CASCADE ON UPDATE CASCADE );drop table if exists resistencia;CREATE TABLE resistencia (id INTEGER NOT NULL,valor INTEGER(3) NOT NULL,PRIMARY KEY (id)CONSTRAINT resistencia_por_monstruo_fk FOREIGN KEY (id) REFERENCES resistencia_por_monstruo (resistencia_fk) ON DELETE CASCADE ON UPDATE CASCADE );drop table if exists inmunidad;CREATE TABLE inmunidad (id INTEGER NOT NULL,valor INTEGER(3) NOT NULL,PRIMARY KEY (id)CONSTRAINT inmunidad_por_monstruo_fk FOREIGN KEY (id) REFERENCES inmunidad_por_monstruo (inmunidad_fk) ON DELETE CASCADE ON UPDATE CASCADE );drop table if exists habilidad;CREATE TABLE habilidad (id INTEGER NOT NULL,valor INTEGER(3) NOT NULL,PRIMARY KEY (id)CONSTRAINT modelo_base_fk FOREIGN KEY (id) REFERENCES modelo_base (id) ON DELETE CASCADE ON UPDATE CASCADECONSTRAINT habilidad_por_personaje_No_jugador_fk FOREIGN KEY (id) REFERENCES habilidad_por_personaje_no_jugador (habilidad_fk) ON DELETE CASCADE ON UPDATE CASCADE );drop table if exists personaje_dungeons;CREATE TABLE personaje_dungeons (id INTEGER NOT NULL,ruta TEXT(255) NOT NULL,PRIMARY KEY (id)CONSTRAINT personaje_fk FOREIGN KEY (id) REFERENCES personaje (id) ON DELETE CASCADE ON UPDATE CASCADECONSTRAINT personaje_dungeons_por_escena_fk FOREIGN KEY (id) REFERENCES personaje_dungeons_por_escena (personaje_dungeons_fk) ON DELETE CASCADE ON UPDATE CASCADE );drop table if exists personaje_jugador;CREATE TABLE personaje_jugador (id INTEGER NOT NULL,raza_fk INTEGER(4) NOT NULL,PRIMARY KEY (id)CONSTRAINT personaje_dungeons_fk FOREIGN KEY (id) REFERENCES personaje_dungeons (id) ON DELETE CASCADE ON UPDATE CASCADECONSTRAINT raza_fk FOREIGN KEY (raza_fk) REFERENCES raza (id) ON DELETE CASCADE ON UPDATE CASCADECONSTRAINT clase_personaje_por_personaje_jugador_fk FOREIGN KEY (id) REFERENCES clase_personaje_por_personaje_jugador (personaje_jugador_fk) ON DELETE CASCADE ON UPDATE CASCADE   );drop table if exists clase_personaje_por_personaje_jugador;CREATE TABLE clase_personaje_por_personaje_jugador (personaje_jugador_fk INTEGER NOT NULL,clase_personaje_fk INTEGER NOT NULL,PRIMARY KEY (personaje_jugador_fk, clase_personaje_fk) );drop table if exists personaje_no_jugador;CREATE TABLE personaje_no_jugador (id INTEGER NOT NULL,PRIMARY KEY (id)CONSTRAINT personaje_jugador_fk FOREIGN KEY (id) REFERENCES personaje_jugador (id) ON DELETE CASCADE ON UPDATE CASCADECONSTRAINT habilidad_por_personaje_no_jugador_fk FOREIGN KEY (id) REFERENCES habilidad_por_personaje_no_jugador (personaje_no_jugador_fk) ON DELETE CASCADE ON UPDATE CASCADE   );drop table if exists habilidad_por_personaje_no_jugador;CREATE TABLE habilidad_por_personaje_no_jugador (personaje_no_jugador_fk INTEGER NOT NULL,habilidad_fk INTEGER NOT NULL,PRIMARY KEY (personaje_no_jugador_fk, habilidad_fk) );drop table if exists monstruo;CREATE TABLE monstruo (id INTEGER NOT NULL,rol_fk INTEGER NOT NULL,PRIMARY KEY (id)CONSTRAINT rol_fk FOREIGN KEY (rol_fk) REFERENCES rol (id) ON DELETE CASCADE ON UPDATE CASCADECONSTRAINT resistencia_por_monstruo_fk FOREIGN KEY (id) REFERENCES resistencia_por_monstruo (monstruo_fk) ON DELETE CASCADE ON UPDATE CASCADECONSTRAINT inmunidad_por_monstruo_fk FOREIGN KEY (id) REFERENCES inmunidad_por_monstruo (monstruo_fk) ON DELETE CASCADE ON UPDATE CASCADECONSTRAINT monstruo_por_encuentro_dungeons FOREIGN KEY (id) REFERENCES monstruo_por_encuentro_dungeons (monstruo_fk) ON DELETE CASCADE ON UPDATE CASCADE   );drop table if exists resistencia_por_monstruo;CREATE TABLE resistencia_por_monstruo (monstruo_fk INTEGER NOT NULL,resistencia_fk INTEGER NOT NULL,PRIMARY KEY (monstruo_fk, resistencia_fk) );drop table if exists inmunidad_por_monstruo;CREATE TABLE inmunidad_por_monstruo (monstruo_fk INTEGER NOT NULL,inmunidad_fk INTEGER NOT NULL,PRIMARY KEY (monstruo_fk, inmunidad_fk) );drop table if exists encuentro_dungeons;CREATE TABLE encuentro_dungeons (id INTEGER NOT NULL,PRIMARY KEY (id)CONSTRAINT encuentro_fk FOREIGN KEY (id) REFERENCES encuentro (id) ON DELETE CASCADE ON UPDATE CASCADECONSTRAINT monstruo_por_encuentro_dungeons FOREIGN KEY (id) REFERENCES monstruo_por_encuentro_dungeons (encuentro_dungeons_fk) ON DELETE CASCADE ON UPDATE CASCADECONSTRAINT encuentro_dungeons_por_escena_fk FOREIGN KEY (id) REFERENCES encuentro_dungeons_por_escena (encuentro_dungeons_fk) ON DELETE CASCADE ON UPDATE CASCADE);drop table if exists monstruo_por_encuentro_dungeons;CREATE TABLE monstruo_por_encuentro_dungeons (encuentro_dungeons_fk INTEGER NOT NULL,monstruo_fk INTEGER NOT NULL,PRIMARY KEY (encuentro_dungeons_fk, monstruo_fk) );drop table if exists escena;CREATE TABLE escena (id INTEGER NOT NULL,PRIMARY KEY (id)CONSTRAINT modelo_base_fk FOREIGN KEY (id) REFERENCES modelo_base (id) ON DELETE CASCADE ON UPDATE CASCADECONSTRAINT trama_por_escena_fk FOREIGN KEY (id) REFERENCES trama_por_escena (escena_fk) ON DELETE CASCADE ON UPDATE CASCADECONSTRAINT encuentro_dungeons_por_escena_fk FOREIGN KEY (id) REFERENCES encuentro_dungeons_por_escena (escena_fk) ON DELETE CASCADE ON UPDATE CASCADECONSTRAINT personaje_dungeons_por_escena_fk FOREIGN KEY (id) REFERENCES personaje_dungeons_por_escena (escena_fk) ON DELETE CASCADE ON UPDATE CASCADECONSTRAINT imagen_por_escena_fk FOREIGN KEY (id) REFERENCES imagen_por_escena (escena_fk) ON DELETE CASCADE ON UPDATE CASCADECONSTRAINT escena_por_partida_fk FOREIGN KEY (id) REFERENCES escena_por_partida (escena_fk) ON DELETE CASCADE ON UPDATE CASCADE);drop table if exists trama_por_escena;CREATE TABLE trama_por_escena (trama_fk INTEGER NOT NULL,escena_fk INTEGER NOT NULL,PRIMARY KEY (trama_fk, escena_fk) );drop table if exists encuentro_dungeons_por_escena;CREATE TABLE encuentro_dungeons_por_escena (encuentro_dungeons_fk INTEGER NOT NULL,escena_fk INTEGER NOT NULL,PRIMARY KEY (encuentro_dungeons_fk, escena_fk) );drop table if exists personaje_dungeons_por_escena;CREATE TABLE personaje_dungeons_por_escena (personaje_dungeons_fk INTEGER NOT NULL,escena_fk INTEGER NOT NULL,PRIMARY KEY (personaje_dungeons_fk, escena_fk) );drop table if exists imagen_por_escena;CREATE TABLE imagen_por_escena (imagen_fk INTEGER NOT NULL,escena_fk INTEGER NOT NULL,PRIMARY KEY (imagen_fk, escena_fk) );-- Fin de Tablas pertenecientes al modelo de DD4
