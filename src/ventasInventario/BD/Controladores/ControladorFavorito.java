package ventasInventario.BD.Controladores;

import ventasInventario.PanelProductoCliente;
import ventasInventario.BD.Modelo.*;

public class ControladorFavorito {
	private Favoritos favoritos;
	
	public ControladorFavorito(Usuario u) {
		this.favoritos = new Favoritos(u);
	}
	

	public Favoritos getFavoritos() {
		return favoritos;
	}


	public void setFavoritos(Favoritos favoritos) {
		this.favoritos = favoritos;
	}


	public void anadirFavorito(Producto p) {
		favoritos.guardarProductoFavorito(p);
		
	}
	
	
	
	
}
