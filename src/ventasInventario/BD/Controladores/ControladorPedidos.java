package ventasInventario.BD.Controladores;

import java.util.ArrayList;

import ventasInventario.BD.Modelo.GestorPedidos;
import ventasInventario.BD.Modelo.Pedido;
import ventasInventario.BD.Modelo.Usuario;

public class ControladorPedidos {
	private GestorPedidos gestorPedido;

	public ControladorPedidos() {
		this.gestorPedido = new GestorPedidos();
	}
	
	public ArrayList<Pedido> pedidosCliente(Usuario usuario){
		return this.gestorPedido.pedidosClienteEspecifico(usuario);
	}
	
	
}
