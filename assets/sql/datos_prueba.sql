delete from sistema;
insert into sistema (id,nombre) values(0,"Ánima");
insert into sistema (id,nombre) values(1,"Dungeons 4ª");
insert into sistema (id,nombre) values(2,"Vampiro");
insert into sistema (id,nombre) values(3,"Cthulhu");

delete from partida;
insert into partida (id,nombre,sistema_fk) values (0,"Vientos de LOL",0);
insert into partida (id,nombre,sistema_fk) values (1,"Munchkinismo LOL",1);

delete from etiqueta;
insert into etiqueta (id,nombre) values (0,"ambiente");
insert into etiqueta (id,nombre) values (1,"triste");
insert into etiqueta (id,nombre) values (2,"accion");
insert into etiqueta (id,nombre) values (3,"boss");
insert into etiqueta (id,nombre) values (4,"pueblo");