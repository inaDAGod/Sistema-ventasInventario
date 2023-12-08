
insert into usuarios values
 ('danialee14','dani','correo@gmail.com','admin123',false,false),
 ('jhess','jhess','correo@gmail.com','admin123',false,false),
 ('jhuli','jhuli','correo@gmail.com','admin123',false,false),
 ('funci','dani','correo@gmail.com','admin123',true,false);

 INSERT INTO usuarios VALUES 
    ('user1', 'user1', 'user1@gmail.com', 'password1', false, false),
    ('user2', 'user2', 'user2@gmail.com', 'password2', false, false),
    ('user3', 'user3', 'user3@gmail.com', 'password3', false, false),
    ('user4', 'user4', 'user4@gmail.com', 'password4', false, false),
    ('user5', 'user5', 'user5@gmail.com', 'password5', false, false),
    ('user6', 'user6', 'user6@gmail.com', 'password6', false, false),
    ('user7', 'user7', 'user7@gmail.com', 'password7', false, false),
    ('user8', 'user8', 'user8@gmail.com', 'password8', false, false),
    ('user9', 'user9', 'user9@gmail.com', 'password9', false, false),
    ('user10', 'user10', 'user10@gmail.com', 'password10', false, false);


insert into etiquetas values
('ROPA','ROPA'),
('MAQUILLAJE','MAQUILLAJE'),
('COSMETICO','COSMETICO'),
('CABELLO','CABELLO');

insert into estados_pedido values
('ESPERA PAGO' , 'Reservado'),
('FINALIZADO' , 'Terminado'),
('PAGADO A ENTREGAR' , 'Solo falta entregar'),
('CANCELADO' , 'Ya no quieren');

insert into productos values
('P456','Maquillaje', 'Coleccion de maquillaje de plaza sesamo', 160,100,'Sesamo','Ninguno','Ninguna',false),
('P123','gorrito', 'gorrito para el frio', 20,10,'gucci','Rosa','Ninguna',false),
('P4','Delineador ESSENCE', 'Delineador negro liquido vegano',30,100,'essence','Negro','Ninguna',false),
('P5','Gafas de sol', 'gafas a la moda',20,6,'versace','Cafe','M',false),
('P6','Gafas rojas', 'lentes de sol rojos en forma de corazon',12.50,6,'versace','Rosa','XL',false),
('P1','Bloqueador solar', 'Proteccion UV 50',260,60,'Umbrella','Rosa','Ninguna',false),
('P2','crema de cara', 'caritsimo de paris',110,60,'versace','Rosa','Ninguna',false),
('P3','crema de manos', 'caritsimo de paris',80,6,'versace','Rosa','Ninguna',false),
('P7','tinte rojo de cabello', 'caritsimo de paris',25,55,'versace','Rosa','Ninguna',false);

insert into etiquetas_producto values
('MAQUILLAJE','P4'),
('CABELLO','P7'),
('COSMETICO','P1'),
('COSMETICO','P2'),
('COSMETICO','P3'),
('ROPA','P5'),
('ROPA','P6'),
('MAQUILLAJE','P456'),
('COSMETICO','P456'),
('ROPA','P123');


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

