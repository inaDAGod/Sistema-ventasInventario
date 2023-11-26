package ventasInventario.BD.Modelo;

import java.util.*;

public class Carrito {
	private Usuario usuario;
	private ArrayList<ProductoCarrito> productos; 
	private Double total;
	
	public Carrito(Usuario usuario) {
		this.usuario = usuario;
		this.productos = new ArrayList<>();
		this.total = 0.0;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public ArrayList<ProductoCarrito> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<ProductoCarrito> productos) {
		this.productos = productos;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Carrito [usuario=" + usuario + ", productos=" + productos + ", total=" + total + "]";
	}
	
	
	
	
	
}
