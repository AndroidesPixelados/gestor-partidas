--<ScriptOptions statementTerminator=";"/>
--Tabla sistema
drop table if exists sistema;
create table sistema (
	id integer not null 
		constraint sistema_pk primary key autoincrement, 
	nombre varchar(255) not null
		constraint sistema_nombre_uq unique
);

--Tabla partida
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

--tabla etiqueta
drop table if exists etiqueta;
create table etiqueta (
	id integer not null
		constraint etiqueta_pk primary key autoincrement,
	nombre varchar(255) not null unique
);