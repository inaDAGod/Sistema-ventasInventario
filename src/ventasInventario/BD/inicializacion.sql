
insert into usuarios
values ('danialee14','dani','correo@gmail.com','admin123',false,false);

insert into productos values
('P456','Maquillaje de plaza sesamo', 'Coleccion de maquillaje inspirada en plaza sesamo',120,6,'Sesamo','Rosa','XL',false),
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
('P4','Delineador ESSENCE', 'delineador negro liquido vegano',30,100,'essence','Negro','Ninguna',false),
('P5','Gafas de sol', 'gafas a la moda',20,6,'versace','Cafe','M',false),
('P6','gafas rojas', 'caritsimo de paris',12.50,6,'versace','Rosa','XL',false),
('P1','Bloqueador solar', 'Proteccion UV 50',12.50,6,'Umbrella','Rosa','XL',false),
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
('src/imagenes/productos/gorro.jpg','P123'),
('src/imagenes/productos/bloqueador.jpg','P1'),
('src/imagenes/productos/crema.jpg','P2'),
('src/imagenes/productos/manos.jpg','P3'),
('src/imagenes/productos/delineador.jpg','P4'),
('src/imagenes/productos/gafassol.jpg','P5'),
('src/imagenes/productos/gafas.jpg','P6'),
('src/imagenes/productos/tinte.jpg','P7'),
('src/imagenes/productos/plaza.jpg','P456');

