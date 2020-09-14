create database prueba_4_jsp_servlet;

use prueba_4_jsp_servlet;

create table usuarios(
	id_usuario integer auto_increment,
    nombre_usuario varchar(50),
    clave_usuario varchar(50),
    constraint pk_id_usuario primary key (id_usuario)
);

create table astros_chinos(
	id_astro integer auto_increment,
    signo_chino varchar(50),
    constraint pk_id_astro primary key (id_astro)
);

create table astros_chinos_elemento(
	id_astro_elem integer auto_increment,
    astro_chino_elemento varchar(50),
    constraint pk_id_astro_elem primary key (id_astro_elem)
);


insert into usuarios( nombre_usuario, clave_usuario)
values( "alejandro parra", "111111");
insert into usuarios( nombre_usuario, clave_usuario)
values( "daniela mardones", "111112");
insert into usuarios( nombre_usuario, clave_usuario)
values( "jose fuentes", "111113");
insert into usuarios( nombre_usuario, clave_usuario)
values( "oscar lombardi", "111114");
insert into usuarios( nombre_usuario, clave_usuario)
values( "fernando lara", "111115");
insert into usuarios( nombre_usuario, clave_usuario)
values( "romina carmona", "111116");
insert into usuarios( nombre_usuario, clave_usuario)
values( "bastian montecinos", "111117");
insert into usuarios( nombre_usuario, clave_usuario)
values( "roberto rubier", "111118");
insert into usuarios( nombre_usuario, clave_usuario)
values( "catalina lobos", "111119");
insert into usuarios( nombre_usuario, clave_usuario)
values( "aileen muñoz", "111120");

insert into astros_chinos(signo_chino)
values("Rata");
insert into astros_chinos(signo_chino)
values("Buey");
insert into astros_chinos(signo_chino)
values("Tigre");
insert into astros_chinos(signo_chino)
values("Conejo");
insert into astros_chinos(signo_chino)
values("Dragón");
insert into astros_chinos(signo_chino)
values("Serpiente");
insert into astros_chinos(signo_chino)
values("Caballo");
insert into astros_chinos(signo_chino)
values("Cabra");
insert into astros_chinos(signo_chino)
values("Mono");
insert into astros_chinos(signo_chino)
values("Gallo");
insert into astros_chinos(signo_chino)
values("Perro");
insert into astros_chinos(signo_chino)
values("Cerdo");


insert into astros_chinos_elemento(astro_chino_elemento)
values("Metal");
insert into astros_chinos_elemento(astro_chino_elemento)
values("Agua");
insert into astros_chinos_elemento(astro_chino_elemento)
values("Madera");
insert into astros_chinos_elemento(astro_chino_elemento)
values("Fuego");
insert into astros_chinos_elemento(astro_chino_elemento)
values("Tierra");

select * from astros_chinos;
select nombre_usuario from usuarios where nombre_usuario like '%c%';
INSERT INTO usuarios(nombre_usuario,clave_usuario) VALUES('prueba111',111121);
