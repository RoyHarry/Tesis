insert into ciclo (idciclo,nombre,fecha_inicio,fecha_fin) values (2, '2014-1', '2014-01-01', '2014-05-06');
select *from ciclo;
update ciclo 
set fecha_inicio='2014-05-07',
	fecha_fin='2014-12-15',
	nombre='2014-2'
where ciclo.idciclo=2;


insert into detalle_leccion (iddetalle_leccion,numero_pregunta,pregunta,respuesta,estado,mensaje,observacion,puntuacion)
values (2,'2','Where are you from','Perú','activo','Good','Obtuviste buena puntuacion','10');
select *from detalle_leccion;

insert into leccion (idleccion,estado,mensaje,descripcion,examen,nota_final,detalle_leccion_iddetalle_leccion)
values (1,'activo','Bienvenido a la leccion 1','Pronombres', 20, 15, 1);
select *from leccion;

insert into nivel (idnivel,nivel,tema,leccion_idleccion) 
values (1,'basico', 'Irregular verbs',1);

select *from nivel;

insert into curso(idcurso,nombre,puntuacion,descripcion,ciclo_idciclo,nivel_idnivel)
values(1,'English', 100,'Never Stop Learning',1,1);
select *from curso;

insert into usuario (idusuario,password,user,estado,curso_idcurso,tipo)
values(2,'admin','admin','activo',1,'docente');
select *from usuario;

insert into  estudiante (idestudiante,nombre,apellido,dni,usuario_idusuario)
values (1,'Miguel','Leyva','47174471',1);
select *from usuario;

select *from estudiante;

insert into docente(iddocente,nombre,apellido,dni,usuario_idusuario)
values (1,'Roy','Colorado','48254821',2);

update usuario 
set user='1234',
	password='1234'
where usuario.idusuario=2;


select *from docente;

