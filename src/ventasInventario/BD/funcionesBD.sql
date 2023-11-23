create or replace function registrarse(usuario varchar(30), nombre varchar(50),correo varchar(40),contrasenia varchar(20))
returns void as $crearUsuario$
begin
    insert into usuarios values (usuario,nombre,correo,contrasenia,FALSE, FALSE);
end;
$crearUsuario$
language plpgsql;

--select registrarse('danialee14','dani','danialee14@gmail.com','admin123');


create or replace function registrarFuncionario(usuario varchar(30), nombre varchar(50),correo varchar(40),contrasenia varchar(20))
returns void as $crearFuncionario$
begin
    insert into usuarios values (usuario,nombre,correo,contrasenia,TRUE, FALSE);
end;
$crearFuncionario$
language plpgsql;

--select registrarFuncionario('funci','funcionario','funcionario@gmail.com','admin123');
--select * from usuarios;

create or replace function registrarProducto(cproducto varchar(50),nombre varchar(30),descripcion varchar(80),precio numeric,cantidad integer, marca varchar(30), color varchar(50), talla varchar(20))
returns void as $registrarProducto$
begin
    insert into productos values (cproducto,nombre,descripcion,precio,cantidad, marca, color, talla,FALSE);
end;
$registrarProducto$
language plpgsql;

--select registrarProducto('P123', 'gorrito niño', 'gorro para niño', 10.50, 10, 'Gucci', 'Rojo', 'S');
--select *from productos