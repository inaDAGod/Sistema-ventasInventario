
insert into usuarios
values ('danialee14','dani','correo@gmail.com','admin123',false,false);

insert into productos values
('P456','maquillaje de plaza sesamo', 'caritsimo de paris',12.50,6,'versace','Rosa','XL',false),
('P123','gorrito', 'gorrito para el frio', 10,10,'gucci','Rosa','XL',false);

insert into etiquetas values
('ROPA','ROPA'),
('MAQUILLAJE','MAQUILLAJE'),
('COSMETICO','COSMETICO'),
('CABELLO','CABELLO');

insert into etiquetas_producto values
('MAQUILLAJE','P456'),
('COSMETICO','P456'),
('ROPA','P123');

insert into estados_pedido values
('ESPERA PAGO' , 'En espera'),
('FINALIZADO' , 'En espera'),
('PAGADO A ENTREGAR' , 'En espera'),
('CANCELADO' , 'En espera');

insert into productos values
('P4','delineador', 'caritsimo de paris',12.50,6,'versace','Rosa','XL',false),
('P5','gafas de sol', 'caritsimo de paris',12.50,6,'versace','Rosa','XL',false),
('P6','gafas rojas', 'caritsimo de paris',12.50,6,'versace','Rosa','XL',false),
('P1','bloqueador solar', 'caritsimo de paris',12.50,6,'versace','Rosa','XL',false),
('P2','crema de cara', 'caritsimo de paris',12.50,6,'versace','Rosa','XL',false),
('P3','crema de manos', 'caritsimo de paris',12.50,6,'versace','Rosa','XL',false),
('P7','tinte rojo de cabello', 'caritsimo de paris',12.50,6,'versace','Rosa','XL',false);

insert into etiquetas_producto values
('MAQUILLAJE','P4'),
('CABELLO','P7'),
('COSMETICO','P1'),
('COSMETICO','P2'),
('COSMETICO','P3'),
('ROPA','P5'),
('ROPA','P6');

insert into imagenes values
('src/imagenesJhess/personas.jfif','P123'),
('src/imagenesJhess/personas.jfif','P1'),
('src/imagenesJhess/personassi.jfif','P2'),
('src/imagenesJhess/personas.jfif','P3'),
('src/imagenesJhess/personas.jfif','P4'),
('src/imagenesJhess/personassi.jfif','P5'),
('src/imagenesJhess/personas.jfif','P6'),
('src/imagenesJhess/personas.jfif','P7'),
('src/imagenesJhess/personassi.jfif','P456');

