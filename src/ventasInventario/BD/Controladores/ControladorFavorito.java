package ventasInventario.BD.Controladores;

import java.util.ArrayList;

import ventasInventario.PanelProductoCliente;
import ventasInventario.BD.Modelo.*;

public class ControladorFavorito {
	private Favoritos favoritos;
	
	public ControladorFavorito(Usuario usuario) {
		this.favoritos = new Favoritos(usuario);
	}
	

	public Favoritos getFavoritos() {
		return favoritos;
	}


	public void setFavoritos(Favoritos favoritos) {
		this.favoritos = favoritos;
	}
	
	public ArrayList<Producto> listaFavoritosUsuario(){
	
		return favoritos.getProductos();
	}


	public void anadirFavorito(Producto p) {
		favoritos.guardarProductoFavorito(p);
		
	}
	
	public void  eliminarProducto(Producto producto) {
		favoritos.eliminarDeFavoritos(producto);
	}
	
	
	
	
}
