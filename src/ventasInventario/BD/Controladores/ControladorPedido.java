package ventasInventario.BD.Controladores;

import ventasInventario.BD.Modelo.Pedido;
import ventasInventario.BD.Modelo.Usuario;

public class ControladorPedido {
	
	private Pedido pedidoNuevo;
	
	
	public ControladorPedido(Usuario usuario) {
		this.pedidoNuevo = new Pedido(usuario);
	}


	public void confirmarCarrito() {
		pedidoNuevo.nuevoPedido();
	}
}
