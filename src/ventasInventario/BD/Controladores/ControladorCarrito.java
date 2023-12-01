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
	
	public void anadirACarrito(Producto producto, Integer cantidad) {
		ProductoCarrito productoCarrito = new ProductoCarrito(producto, cantidad);
		carrito.guardarEnCarrito(productoCarrito);
	}
	
	
}
