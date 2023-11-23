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

create or replace function agregarEtiquetaProducto(cetiqueta varchar(20),cproducto varchar(50))
return void as $etiquetar$
begin
    insert into etiquetas_producto values(cetiqueta,cproducto);
end;
$etiquetar$
language plpgsql;

create or replace function ofertar(cpro varchar(50), preciooferta numeric, cantidad_inicial integer, fecha_inicio date, fecha_fin date)
returns void as $ofertar$
declare 
    precio_antiguo numeric;
    porcentaje integer;
begin
    precio_antiguo :=   (select a.precio
                        from productos a 
                        where a.cproducto = cpro);  
    porcentaje :=((preciooferta-precio_antiguo)/precio_antiguo)*100;
    insert into ofertas values (cpro,porcentaje,preciooferta,cantidad_inicial,fecha_inicio,fecha_fin);
    update productos set ofertado = TRUE
        where cproducto = cpro;
end;
$ofertar$
language plpgsql;

--select ofertar('P123',5,1,'2023-11-2','2023-11-2');
--select *from ofertas 
--select *from productos


create or replace function agregaraCarrito(cusuario varchar(30),cpro varchar(30),cantidad integer)
returns void as $carrito$
declare 
    suma numeric;
    precio numeric;
    ofertado boolean;
begin 
    ofertado := (select a.ofertado
                from productos a 
                where a.cproducto = cpro); 
    if (ofertado) then
        precio :=   (select a.preciooferta
                    from ofertas a
                    where a.cproducto = cpro);
    else
        precio :=   (select a.precio
                    from productos a 
                    where a.cproducto = cpro); 
    end if;
    suma := precio * cantidad;
    insert into carrito_productos values(cusuario,cpro,cantidad,suma);
end;
$carrito$
language plpgsql;

--select agregaraCarrito('danialee14','P123',3);
--select *from carrito_productos;