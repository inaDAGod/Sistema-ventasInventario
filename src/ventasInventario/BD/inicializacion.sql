
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


