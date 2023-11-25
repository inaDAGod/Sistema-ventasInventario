package ventasInventario.POO;

import java.util.ArrayList;

public class Favoritos {
	private ArrayList<Producto> productos;
	private Usuario usuario;
	
	public Favoritos(Usuario usuario) {
		this.productos = new ArrayList();
		this.usuario = usuario;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Favoritos [productos=" + productos + ", usuario=" + usuario + "]";
	}
	
	
	
	
	
}
