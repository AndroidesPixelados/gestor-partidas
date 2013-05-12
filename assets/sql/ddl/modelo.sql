--Comúndrop table if exists sistema;create table sistema (	id integer not null,	nombre text not null,	primary key (id));drop table if exists partida;create table partida (	id integer not null,	nombre text not null,	sistema_fk integer not null,	primary key (id),	constraint partida_sistema foreign key (sistema_fk) references sistema (id) on delete cascade on update cascade);drop table if exists escena;create table escena (	id integer not null,	nombre text not null,		primary key (id));drop table if exists encuentro;create table encuentro (	id integer not null,	nombre text not null,	primary key (id));drop table if exists encuentro_por_escena;create table encuentro_por_escena (	encuentro_fk integer not null,	escena_fk integer not null,		primary key (encuentro_fk,escena_fk),	constraint encuentro_por_escena_encuentro foreign key (encuentro_fk) references encuentro (id) on delete cascade on update cascade,	constraint encuentro_por_escena_escena foreign key (escena_fk) references escena (id) on delete cascade on update cascade);drop table if exists personaje;create table personaje (		id integer not null,	nombre text not null,	es_jugador integer not null default 0,		primary key (id));drop table if exists personaje_por_partida;create table personaje_por_partida (	personaje_fk integer not null,	partida_fk integer not null,		primary key (personaje_fk,partida_fk),	constraint personaje_por_partida_personaje foreign key (personaje_fk) references personaje (id) on delete cascade on update cascade,	constraint personaje_por_partida_partida foreign key (partida_fk) references partida (id) on delete cascade on update cascade);drop table if exists personaje_por_escena;create table personaje_por_escena (	personaje_fk integer not null,	escena_fk integer not null,		primary key (personaje_fk,escena_fk),	constraint personaje_por_escena_personaje foreign key (personaje_fk) references personaje (id) on delete cascade on update cascade,	constraint personaje_por_escena_escena foreign key (escena_fk) references escena (id) on delete cascade on update cascade);drop table if exists personaje_por_encuentro;create table personaje_por_encuentro (	personaje_fk integer not null,	encuentro_fk integer not null,		primary key (personaje_fk,encuentro_fk),	constraint personaje_por_encuentro_personaje foreign key (personaje_fk) references personaje (id) on delete cascade on update cascade,	constraint personaje_por_encuentro_encuentro foreign key (encuentro_fk) references encuentro (id) on delete cascade on update cascade);drop table if exists trama;create table trama (	id integer not null,	nombre text not null,	texto text not null,	primary key (id));drop table if exists trama_por_escena;create table trama_por_escena (	trama_fk integer not null,	escena_fk integer not null,		primary key (trama_fk, escena_fk),	constraint trama_por_escena_trama foreign key (trama_fk) references trama (id) on delete cascade on update cascade,	constraint trama_por_escena_escena foreign key (escena_fk) references escena (id) on delete cascade on update cascade);drop table if exists trama_por_encuentro;create table trama_por_encuentro (	trama_fk integer not null,	encuentro_fk integer not null,		primary key (trama_fk, encuentro_fk),	constraint trama_por_encuentro_trama foreign key (trama_fk) references trama (id) on delete cascade on update cascade,	constraint trama_por_encuentro_encuentro foreign key (encuentro_fk) references encuentro (id) on delete cascade on update cascade);drop table if exists trama_por_personaje;create table trama_por_personaje (	trama_fk integer not null,	personaje_fk integer not null,		primary key (trama_fk, personaje_fk),	constraint trama_por_escena_trama foreign key (trama_fk) references trama (id) on delete cascade on update cascade,	constraint trama_por_escena_personaje foreign key (personaje_fk) references personaje (id) on delete cascade on update cascade);drop table if exists trama_por_personaje_por_escena;create table trama_por_personaje_por_escena (	escena_fk integer not null,	personaje_fk integer not null,	trama_fk integer not null,		primary key (escena_fk,personaje_fk,trama_fk),	constraint trama_por_personaje_por_escena_escena foreign key (escena_fk) references escena (id) on delete cascade on update cascade,	constraint trama_por_personaje_por_escena_personaje foreign key (personaje_fk) references personaje (id) on delete cascade on update cascade,	constraint trama_por_personaje_por_escena_trama foreign key (trama_fk) references trama (id) on delete cascade on update cascade);drop table if exists trama_por_personaje_por_encuentro;create table trama_por_personaje_por_encuentro (	encuentro_fk integer not null,	personaje_fk integer not null,	trama_fk integer not null,		primary key (encuentro_fk,personaje_fk,trama_fk),	constraint trama_por_personaje_por_encuentro_encuentro foreign key (encuentro_fk) references encuentro (id) on delete cascade on update cascade,	constraint trama_por_personaje_por_encuentro_personaje foreign key (personaje_fk) references personaje (id) on delete cascade on update cascade,	constraint trama_por_personaje_por_encuentro_trama foreign key (trama_fk) references trama (id) on delete cascade on update cascade);drop table if exists tipo_atributo;create table tipo_atributo (	id integer not null,	nombre text not null,	descripcion text,	tipo_semantico text,	tipo_sintactico integer not null,	sistema_fk integer not null,	primary key (id),	foreign key sistema_fk references sistema(id) on delete cascade on update cascade);drop table if exists atributo_por_personaje;create table atributo_por_personaje (	personaje_fk integer not null,	tipo_atributo_fk integer not null,	valor text,		primary key (personaje_fk,tipo_atributo_fk),	constraint atributo_por_personaje_personaje foreign key (personaje_fk) references personaje (id) on delete cascade on update cascade,	constraint atributo_por_personaje_tipo_atributo foreign key (tipo_atributo_fk) references tipo_atributo (id) on delete cascade on update cascade);drop table if exists efecto_combate;create table efecto_combate (	id integer not null,	nombre text not null,	descripcion text,	imagen text,		primary key (id));drop table if exists recurso_por_etiqueta;create table recurso_por_etiqueta (	etiqueta text not null,	recurso text not null,		primary key (etiqueta,recurso));drop table if exists raza;create table raza (	id integer not null,	nombre text not null,	descripcion text,		primary key (id));--Ánima--Dungeons 4ªdrop table if exists dd4_personaje;create table dd4_personaje (	id integer not null,	ruta text,	primary key (id),	constraint dd4_personaje_personaje foreign key (id) references personaje (id) on delete cascade on update cascade);drop table if exists dd4_personaje_monstruo;create table dd4_personaje_monstruo (	id integer not null,	rol integer,	es_lider integer,	es_elite integer,	es_solo integer,	primary key (id),	constraint dd4_personaje_monstruo_personaje foreign key (id) references dd4_personaje (id) on delete cascade on update cascade);drop table if exists dd4_clase_personaje;create table dd4_clase_personaje (	id integer not null,	nombre text not null,	descripcion text,	primary key (id));drop table if exists dd4_clase_personaje_por_personaje;create table dd4_clase_personaje_por_personaje (	dd4_clase_personaje_fk integer not null,	dd4_personaje_fk integer not null,	primary key (dd4_clase_personaje_fk,dd4_personaje_fk),	constraint dd4_clase_personaje_por_personaje_personaje foreign key (dd4_personaje_fk) references dd4_personaje (id) on delete cascade on update cascade,	constraint dd4_clase_personaje_por_personaje_clase_personaje foreign key (dd4_clase_personaje_fk) references dd4_clase_personaje (id) on delete cascade on update cascade);drop table if exists dd4_poder;create table dd4_poder (	id integer not null,	nombre text not null,	descripcion text,		primary key (id)	);