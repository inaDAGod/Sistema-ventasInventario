-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2023-11-23 20:51:47.175

-- tables
-- Table: carrito_productos
CREATE TABLE carrito_productos (
    cusuario varchar(30)  NOT NULL,
    cproducto varchar(20)  NOT NULL,
    cantidad int  NOT NULL,
    monto NUMERIC(10,2) NOT NULL,
    CONSTRAINT carrito_productos_pk PRIMARY KEY (cusuario,cproducto)
);

-- Table: estados_pedido
CREATE TABLE estados_pedido (
    cestado_pedido varchar(30)  NOT NULL,
    detalle varchar(50)  NOT NULL,
    CONSTRAINT estados_pedido_pk PRIMARY KEY (cestado_pedido)
);

-- Table: etiquetas
CREATE TABLE etiquetas (
    cetiqueta varchar(20)  NOT NULL,
    detalle varchar(50)  NOT NULL,
    CONSTRAINT etiquetas_pk PRIMARY KEY (cetiqueta)
);

-- Table: etiquetas_producto
CREATE TABLE etiquetas_producto (
    cetiqueta varchar(20)  NOT NULL,
    cproducto varchar(50)  NOT NULL,
    CONSTRAINT etiquetas_producto_pk PRIMARY KEY (cetiqueta,cproducto)
);

-- Table: favoritos
CREATE TABLE favoritos (
    cproducto varchar(50)  NOT NULL,
    cusuario varchar(30)  NOT NULL,
    CONSTRAINT favoritos_pk PRIMARY KEY (cproducto,cusuario)
);

-- Table: imagenes
CREATE TABLE imagenes (
    ruta varchar(50)  NOT NULL,
    cproducto varchar(50)  NOT NULL,
    CONSTRAINT imagenes_pk PRIMARY KEY (ruta,cproducto)
);

-- Table: imagenes_empresa
CREATE TABLE imagenes_empresa (
    cimagen varchar(50)  NOT NULL,
    ruta varchar(50)  NOT NULL,
    CONSTRAINT imagenes_empresa_pk PRIMARY KEY (cimagen)
);

-- Table: ofertas
CREATE TABLE ofertas (
    cproducto varchar(50)  NOT NULL,
    porcentaje int  NOT NULL,
    preciooferta NUMERIC(10,2) NOT NULL,
    cantidad_inicial int  NOT NULL,
    fecha_inicio date  NOT NULL,
    fecha_fin date  NOT NULL,
    CONSTRAINT ofertas_pk PRIMARY KEY (cproducto)
);

-- Table: pedidos
CREATE TABLE pedidos (
    cpedido varchar(50)  NOT NULL,
    cusuario varchar(30)  NOT NULL,
    cestado_pedido varchar(20)  NOT NULL,
    fecha_reserva date  NOT NULL,
    fecha_limite date  NOT NULL,
    monto_pagar NUMERIC(10,2)  NOT NULL,
    CONSTRAINT pedidos_pk PRIMARY KEY (cpedido)
);

-- Table: pedidos_funcionarios
CREATE TABLE pedidos_funcionarios (
    cpedido varchar(50)  NOT NULL,
    cusuario varchar(30)  NOT NULL,
    detalle varchar(20)  NOT NULL,
    CONSTRAINT pedidos_funcionarios_pk PRIMARY KEY (cpedido,cusuario)
);

-- Table: productos
CREATE TABLE productos (
    cproducto varchar(50)  NOT NULL,
    nombre varchar(30)  NOT NULL,
    descripcion varchar(80)  NOT NULL,
    precio NUMERIC(10,2) NOT NULL,
    cantidad int  NOT NULL,
    marca varchar(30)  NOT NULL,
    color varchar(50)  NOT NULL,
    talla varchar(20)  NOT NULL,
    ofertado boolean  NOT NULL,
    CONSTRAINT productos_pk PRIMARY KEY (cproducto)
);

-- Table: productos_pedido
CREATE TABLE productos_pedido (
    cpedido varchar(50)  NOT NULL,
    cproducto varchar(50)  NOT NULL,
    cantidad int  NOT NULL,
    monto NUMERIC(10,2) NOT NULL,
    CONSTRAINT productos_pedido_pk PRIMARY KEY (cpedido,cproducto)
);

-- Table: sobre_empresa
CREATE TABLE sobre_empresa (
    csobre_nea int  NOT NULL,
    numero_contacto varchar(20)  NOT NULL,
    correo_contacto varchar(20)  NOT NULL,
    intagram_link varchar(50)  NOT NULL,
    instagram_usuario varchar(20)  NOT NULL,
    facebook_link varchar(50)  NOT NULL,
    facebook_usuario varchar(20)  NOT NULL,
    tiktok_link varchar(50)  NOT NULL,
    tiktok_usuario varchar(20)  NOT NULL,
    direccion_descripcion varchar(50)  NOT NULL,
    direccion_link varchar(50)  NOT NULL,
    CONSTRAINT sobre_empresa_pk PRIMARY KEY (csobre_nea)
);

-- Table: usuarios
CREATE TABLE usuarios (
    cusuario varchar(30)  NOT NULL,
    nombre varchar(50)  NOT NULL,
    correo varchar(40)  NOT NULL,
    contrasenia varchar(20)  NOT NULL,
    funcionario boolean  NOT NULL,
    super_usuario boolean  NOT NULL,
    CONSTRAINT usuarios_pk PRIMARY KEY (cusuario)
);

-- foreign keys
-- Reference: carritos_productos (table: carrito_productos)
ALTER TABLE carrito_productos ADD CONSTRAINT carritos_productos
    FOREIGN KEY (cproducto)
    REFERENCES productos (cproducto)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: carritos_usuarios (table: carrito_productos)
ALTER TABLE carrito_productos ADD CONSTRAINT carritos_usuarios
    FOREIGN KEY (cusuario)
    REFERENCES usuarios (cusuario)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: categoria_producto_etiquetas (table: etiquetas_producto)
ALTER TABLE etiquetas_producto ADD CONSTRAINT categoria_producto_etiquetas
    FOREIGN KEY (cetiqueta)
    REFERENCES etiquetas (cetiqueta)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: categoria_producto_productos (table: etiquetas_producto)
ALTER TABLE etiquetas_producto ADD CONSTRAINT categoria_producto_productos
    FOREIGN KEY (cproducto)
    REFERENCES productos (cproducto)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: favoritos_productos (table: favoritos)
ALTER TABLE favoritos ADD CONSTRAINT favoritos_productos
    FOREIGN KEY (cproducto)
    REFERENCES productos (cproducto)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: favoritos_usuarios (table: favoritos)
ALTER TABLE favoritos ADD CONSTRAINT favoritos_usuarios
    FOREIGN KEY (cusuario)
    REFERENCES usuarios (cusuario)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: imagenes_productos_publico (table: imagenes)
ALTER TABLE imagenes ADD CONSTRAINT imagenes_productos_publico
    FOREIGN KEY (cproducto)
    REFERENCES productos (cproducto)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: ofertas_producto (table: ofertas)
ALTER TABLE ofertas ADD CONSTRAINT ofertas_producto
    FOREIGN KEY (cproducto)
    REFERENCES productos (cproducto)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: pedidos_estados_pedido (table: pedidos)
ALTER TABLE pedidos ADD CONSTRAINT pedidos_estados_pedido
    FOREIGN KEY (cestado_pedido)
    REFERENCES estados_pedido (cestado_pedido)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: pedidos_funcionarios_pedidos (table: pedidos_funcionarios)
ALTER TABLE pedidos_funcionarios ADD CONSTRAINT pedidos_funcionarios_pedidos
    FOREIGN KEY (cpedido)
    REFERENCES pedidos (cpedido)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: pedidos_funcionarios_usuarios (table: pedidos_funcionarios)
ALTER TABLE pedidos_funcionarios ADD CONSTRAINT pedidos_funcionarios_usuarios
    FOREIGN KEY (cusuario)
    REFERENCES usuarios (cusuario)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: productos_pedido_pedidos (table: productos_pedido)
ALTER TABLE productos_pedido ADD CONSTRAINT productos_pedido_pedidos
    FOREIGN KEY (cpedido)
    REFERENCES pedidos (cpedido)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: productos_pedido_productos (table: productos_pedido)
ALTER TABLE productos_pedido ADD CONSTRAINT productos_pedido_productos
    FOREIGN KEY (cproducto)
    REFERENCES productos (cproducto)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: venta_usuarios (table: pedidos)
ALTER TABLE pedidos ADD CONSTRAINT venta_usuarios
    FOREIGN KEY (cusuario)
    REFERENCES usuarios (cusuario)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- End of file.

