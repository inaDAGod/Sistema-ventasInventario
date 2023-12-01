package ventasInventario.BD.Controladores;

import ventasInventario.BD.Modelo.Carrito;
import ventasInventario.BD.Modelo.Producto;
import ventasInventario.BD.Modelo.ProductoCarrito;
import ventasInventario.BD.Modelo.Usuario;

public class ControladorCarrito {
	private Carrito carrito;

	public ControladorCarrito(Usuario usuario) {

		this.carrito = new Carrito(usuario);
	}
	
	
	
	public Carrito getCarrito() {
		return carrito;
	}



	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}



	public void anadirACarrito(Producto producto, Integer cantidad) {
		ProductoCarrito productoCarrito = new ProductoCarrito(producto, cantidad);
		carrito.guardarEnCarrito(productoCarrito);
	}
	
	public void  eliminarProducto(ProductoCarrito producto) {
		carrito.eliminarDeCarrito(producto);
	}
	
}
