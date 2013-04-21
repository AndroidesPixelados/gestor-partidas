drop table if exists sistema;
create table sistema (
	id integer not null 
		constraint sistema_pk primary key autoincrement, 
	nombre varchar(255) not null
		constraint sistema_nombre_uq unique
);
drop table if exists partida;
create table partida (
	id integer not null
		constraint partida_pk primary key autoincrement, 
	nombre varchar(255) not null
		constraint partida_nombre_uq unique,
	sistema_fk integer not null
		constraint partida_sistema_fk references sistema (id)
			on delete cascade
			on update cascade
);
drop table if exists etiqueta;
create table etiqueta (
	id integer not null
		constraint etiqueta_pk primary key autoincrement,
	nombre varchar(255) not null unique
);
drop table if exists personaje;
create table personaje (
	id integer not null
		constraint personaje_pk primary key autoincrement,
	nombre varchar(255) not null unique,
	partida_fk integer not null
		constraint personaje_partida_fk references partida (id)
			on delete cascade
			on update cascade
		
);
drop table if exists tipo_atributo;
create table tipo_atributo (
	id integer not null
		constraint tipo_atributo_pk primary key autoincrement,
	nombre varchar(255) not null unique,
	tipo_semantico varchar(255) not null,
	tipo_sintactico integer not null
);
drop table if exists atributo;
create table atributo (
	id integer not null
		constraint atributo_pk primary key autoincrement,
	nombre varchar(255) not null unique,
	valor varchar(255),
	tipo_atributo_fk integer not null
		constraint atributo_tipo_atributo_fk references tipo_atributo(id)
			on delete cascade
			on update cascade,
	personaje_fk integer not null
		constraint atributo_personaje_fk references personaje(id)
			on delete cascade
			on update cascade
);
drop table if exists recurso;
create table recurso (
	id integer not null
		constraint recurso_pk primary key autoincrement,
	nombre varchar(255),
	ruta varchar(255) not null,
	contexto integer not null
);
drop table if exists trama;
create table trama (
	id integer not null
		constraint trama_pk primary key autoincrement,
	nombre varchar(255),
	texto text not null,
	contexto integer not null
);