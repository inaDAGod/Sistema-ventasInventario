create or replace function registrarse(usuario varchar(30), nombre varchar(50),correo varchar(40),contrasenia varchar(20))
returns void as $crearUsuario$
begin
    insert into usuarios values (usuario,nombre,correo,contrasenia,FALSE, FALSE);
end;
$crearUsuario$
language plpgsql;

--select registrarse('danialee14','dani','danialee14@gmail.com','admin123');
--select * from usuarios;