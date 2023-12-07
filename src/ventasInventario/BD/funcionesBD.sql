create or replace function registrarse(usuario varchar(30), nombre varchar(50),correo varchar(40),contrasenia varchar(20))
returns void as $crearUsuario$
begin
    insert into usuarios values (usuario,nombre,correo,contrasenia,FALSE, FALSE);
end;
$crearUsuario$
language plpgsql;

create or replace function registrarUsuario(usuario varchar(30), nombre varchar(50),correo varchar(40),contrasenia varchar(20),funcionario boolean)
returns void as $crearUsuario$
begin
    insert into usuarios values (usuario,nombre,correo,contrasenia,funcionario, FALSE);
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
returns void as $etiquetar$
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


create or replace function agregaraFavoritos(cusuario varchar(30),cpro varchar(30))
returns void as $fav$
begin 
    insert into favoritos values(cpro,cusuario);
end;
$fav$
language plpgsql;

--select agregaraFavoritos('danialee14','P123');
--select *from favoritos;

create or replace function confirmarCarrito(cusu varchar(30))
returns varchar as $confiCarrito$
declare
    fin date;
    total numeric;
    next_key varchar(50);
    curs cursor for select *from carrito_productos where cusuario = cusu;
    row record;
begin 
    next_key := (select CAST(COALESCE(MAX(CAST(cpedido AS INTEGER)), 0) + 1 AS VARCHAR) FROM pedidos);
    fin:= CURRENT_DATE + INTERVAL '3 days';
    total :=(select sum(a.monto)
            from carrito_productos a
            where cusuario = cusu);
    insert into pedidos values( next_key,cusu,'ESPERA PAGO',CURRENT_DATE,fin,total);

    open curs;
    loop
        fetch from curs into row;
        exit when not found;
            insert into productos_pedido values (next_key,row.cproducto, row.cantidad,row.monto);
    end loop;
    close curs;

    delete from carrito_productos where cusuario = cusu;
	return next_key;
end;
$confiCarrito$
language plpgsql;

create or replace function pagarPedido(cped varchar(50))
returns void as $pagar$
declare

    curs cursor for select  *from productos_pedido where cpedido = cped;
    row record;
begin 
    open curs;
    loop
        fetch from curs into row;
        exit when not found;
            update productos set cantidad = cantidad - row.cantidad where cproducto = row.cproducto ;
    end loop;
    close curs;
end;
$pagar$
language plpgsql;

--select confirmarCarrito('danialee14');

--select *from  carrito_productos
--select *from pedidos
--select *from productos_pedido



