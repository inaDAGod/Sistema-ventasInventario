package ventasInventario.BD.Controladores;

import java.util.ArrayList;

import ventasInventario.BD.Modelo.GestorProductos;

public class ControladorProducto {
	private GestorProductos gestorProductos;

	public ControladorProducto() {
		this.gestorProductos = new GestorProductos();
	}

	public GestorProductos getGestorProductos() {
		return gestorProductos;
	}

	public void setGestorProductos(GestorProductos gestorProductos) {
		this.gestorProductos = gestorProductos;
	}
	
	public ArrayList<String> todasEtiquetas(){
		return this.gestorProductos.getEtiquetas();
	}
	
	
}
