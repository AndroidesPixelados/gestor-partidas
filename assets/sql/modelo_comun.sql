drop table if exists atributo;
CREATE TABLE "atributo" (
"id" integer NOT NULL,
"valor" varchar(255),
"tipo_atributo_fk" integer NOT NULL,
"personaje_fk" integer NOT NULL,
PRIMARY KEY ("id" ASC)CONSTRAINT "atributo_tipo_atributo_fk" FOREIGN KEY ("tipo_atributo_fk") REFERENCES "tipo_atributo" ("id") ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT "modelo_base_fk" FOREIGN KEY ("id") REFERENCES "modelo_base" ("id") ON DELETE CASCADE ON UPDATE CASCADE
);
drop table if exists efecto_combate;
CREATE TABLE "efecto_combate" (
"id" INTEGER NOT NULL,
"icono" INTEGER,
PRIMARY KEY ("id") ,
CONSTRAINT "icono_fk" FOREIGN KEY ("icono") REFERENCES "imagen" ("id") ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT "efecto_combate_por_personaje_fk" FOREIGN KEY ("id") REFERENCES "efecto_combate_por_personaje" ("efecto_combate_fk") ON DELETE CASCADE ON UPDATE CASCADE
);
drop table if exists efecto_combate_por_personaje;
CREATE TABLE "efecto_combate_por_personaje" (
"personaje_fk" INTEGER NOT NULL,
"efecto_combate_fk" INTEGER NOT NULL,
PRIMARY KEY ("personaje_fk", "efecto_combate_fk") 
);
drop table if exists encuentro;
CREATE TABLE "encuentro" (
"id" INTEGER NOT NULL,
PRIMARY KEY ("id") ,
CONSTRAINT "encuentro_imagen_por_encuentro_fk" FOREIGN KEY ("id") REFERENCES "imagen_por_encuentro" ("encuentro_fk") ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT "encuentro_sonido_por_encuentro_fk" FOREIGN KEY ("id") REFERENCES "sonido_por_encuentro" ("encuentro_fk") ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT "encuentro_trama_por_encuentro_fk" FOREIGN KEY ("id") REFERENCES "trama_por_encuentro" ("encuentro_fk") ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT "modelo_base_fk" FOREIGN KEY ("id") REFERENCES "modelo_base" ("id") ON DELETE CASCADE ON UPDATE CASCADE
);
drop table if exists etiqueta;
CREATE TABLE "etiqueta" (
"id" integer NOT NULL,
PRIMARY KEY ("id") ,
CONSTRAINT "modelo_base_fk" FOREIGN KEY ("id") REFERENCES "modelo_base" ("id") ON DELETE CASCADE ON UPDATE CASCADE
);drop table if exists imagen;
CREATE TABLE "imagen" (
"id" INTEGER NOT NULL,
PRIMARY KEY ("id") ,CONSTRAINT "imagen_por_encuentro_fk" FOREIGN KEY ("id") REFERENCES "imagen_por_encuentro" ("imagen_fk") ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT "recurso_multimedia_fk" FOREIGN KEY ("id") REFERENCES "recurso_multimedia" ("id") ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT "imagen_por_personaje_fk" FOREIGN KEY ("id") REFERENCES "imagen_por_personaje" ("imagen_fk") ON DELETE CASCADE ON UPDATE CASCADE
);
drop table if exists imagen_por_encuentro;
CREATE TABLE "imagen_por_encuentro" (
"encuentro_fk" INTEGER NOT NULL,
"imagen_fk" INTEGER NOT NULL,
PRIMARY KEY ("encuentro_fk", "imagen_fk") 
);
drop table if exists imagen_por_personaje;
CREATE TABLE "imagen_por_personaje" (
"personaje_fk" INTEGER NOT NULL,
"imagen_fk" INTEGER NOT NULL,
PRIMARY KEY ("personaje_fk", "imagen_fk") 
);
drop table if exists modelo_base;
CREATE TABLE "modelo_base" (
"id" INTEGER NOT NULL,
"nombre" TEXT(50) NOT NULL,
PRIMARY KEY ("id" ASC) 
);
drop table if exists partida;
CREATE TABLE "partida" (
"id" integer NOT NULL,
PRIMARY KEY ("id") 
);
drop table if exists personaje;
CREATE TABLE "personaje" (
"id" integer NOT NULL,
PRIMARY KEY ("id") ,
CONSTRAINT "imagen_por_personaje_fk" FOREIGN KEY ("id") REFERENCES "imagen_por_personaje" ("personaje_fk") ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT "trama_por_personaje_fk" FOREIGN KEY ("id") REFERENCES "trama_por_personaje" ("personaje_fk") ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT "modelo_base_fk" FOREIGN KEY ("id") REFERENCES "modelo_base" ("id") ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT "efecto_combate_por_personaje_fk" FOREIGN KEY ("id") REFERENCES "efecto_combate_por_personaje" ("personaje_fk") ON DELETE CASCADE ON UPDATE CASCADE
);
drop table if exists raza;
CREATE TABLE "raza" (
"id" INTEGER NOT NULL,
PRIMARY KEY ("id") ,
CONSTRAINT "modelo_base_fk" FOREIGN KEY ("id") REFERENCES "modelo_base" ("id") ON DELETE CASCADE ON UPDATE CASCADE
);
drop table if exists recurso_multimedia;
CREATE TABLE "recurso_multimedia" (
"id" integer NOT NULL,
"ruta" varchar(255) NOT NULL,
PRIMARY KEY ("id") ,
CONSTRAINT "modelo_base_fk" FOREIGN KEY ("id") REFERENCES "modelo_base" ("id") ON DELETE CASCADE ON UPDATE CASCADE
);
drop table if exists sistema;
CREATE TABLE "sistema" (
"id" integer NOT NULL,
PRIMARY KEY ("id") ,
CONSTRAINT "sistema_modelo_base_fk" FOREIGN KEY ("id") REFERENCES "modelo_base" ("id"),
CONSTRAINT "tipo_atributo_por_sistema_fk" FOREIGN KEY ("id") REFERENCES "tipo_atributo_por_sistema" ("sistema_fk")
);
drop table if exists sonido;
CREATE TABLE "sonido" (
"id" INTEGER NOT NULL,
PRIMARY KEY ("id") ,
CONSTRAINT "sonido_sonido_por_encuentro_fk" FOREIGN KEY ("id") REFERENCES "sonido_por_encuentro" ("sonido_fk") ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT "recurso_multimedia_fk" FOREIGN KEY ("id") REFERENCES "recurso_multimedia" ("id") ON DELETE CASCADE ON UPDATE CASCADE
);
drop table if exists sonido_por_encuentro;
CREATE TABLE "sonido_por_encuentro" (
"sonido_fk" INTEGER NOT NULL,
"encuentro_fk" INTEGER NOT NULL,
PRIMARY KEY ("sonido_fk", "encuentro_fk") 
);drop table if exists tipo_atributo;
CREATE TABLE "tipo_atributo" (
"id" integer NOT NULL,
"tipo_semantico" varchar(255) NOT NULL,
"tipo_sintactico" integer NOT NULL,
PRIMARY KEY ("id") ,
CONSTRAINT "tipo_atributo_por_sistema_fk" FOREIGN KEY ("id") REFERENCES "tipo_atributo_por_sistema" ("tipo_atributo_fk") ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT "modelo_base_fk" FOREIGN KEY ("id") REFERENCES "modelo_base" ("id") ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT "tipo_dato_fk" FOREIGN KEY ("tipo_sintactico") REFERENCES "tipo_dato" ("id") ON DELETE CASCADE ON UPDATE CASCADE
);
drop table if exists tipo_atributo_por_sistema;
CREATE TABLE "tipo_atributo_por_sistema" (
"tipo_atributo_fk" INTEGER NOT NULL,
"sistema_fk" INTEGER NOT NULL,
PRIMARY KEY ("tipo_atributo_fk", "sistema_fk") 
);
drop table if exists tipo_dato;
CREATE TABLE "tipo_dato" (
"id" INTEGER NOT NULL,
"valor" INTEGER NOT NULL,
PRIMARY KEY ("id" ASC) 
);
drop table if exists trama;
CREATE TABLE "trama" (
"id" integer NOT NULL,
"texto" text NOT NULL,
PRIMARY KEY ("id") ,
CONSTRAINT "trama_trama_por_encuentro_fk" FOREIGN KEY ("id") REFERENCES "trama_por_encuentro" ("trama_fk") ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT "modelo_base_fk" FOREIGN KEY ("id") REFERENCES "modelo_base" ("id") ON DELETE CASCADE ON UPDATE CASCADE,CONSTRAINT "trama_por_personaje_fk" FOREIGN KEY ("id") REFERENCES "trama_por_personaje" ("trama_fk") ON DELETE CASCADE ON UPDATE CASCADE
);
drop table if exists trama_por_encuentro;
CREATE TABLE "trama_por_encuentro" (
"encuentro_fk" INTEGER NOT NULL,
"trama_fk" INTEGER NOT NULL,
PRIMARY KEY ("encuentro_fk", "trama_fk") 
);
drop table if exists trama_por_personaje;
CREATE TABLE "trama_por_personaje" (
"personaje_fk" INTEGER NOT NULL,
"trama_fk" INTEGER NOT NULL,
PRIMARY KEY ("personaje_fk", "trama_fk") 
);

