create table pelicula(
id int not null auto_increment primary key,
nombre varchar(30),
genero varchar(30),
clasificacion varchar(3));

create table sala(
id int not null auto_increment primary key,
fechaFuncion date,
numSala int,
id_pelicula int,
foreign key(id_pelicula)references pelicula(id));  

select * from pelicula;
select * from sala;

