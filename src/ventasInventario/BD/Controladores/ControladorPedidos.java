package ventasInventario.BD.Controladores;

import java.util.ArrayList;

import ventasInventario.BD.Modelo.EstadoPedido;
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
	
	
	
	public ArrayList<Pedido> pedidosPendientes(){
		ArrayList<Pedido> pendientes = new ArrayList<>();
		for(Pedido p : this.gestorPedido.getTodosPedidos()) {
			if(!p.getEstadoPedido().equals(EstadoPedido.entregado) && !p.getEstadoPedido().equals(EstadoPedido.cancelado) ) {
				pendientes.add(p);
			}
		}
		return pendientes;
	}
	/*
	public ArrayList<Pedido> pedidosTodos(){
		ArrayList<Pedido> pendientes = new ArrayList<>();
		for(Pedido p : this.gestorPedido.getTodosPedidos()) {
			pendientes.add(p);
		}
		return pendientes;
	}
	*/
	public ArrayList<Pedido> pedidosTodos(){ // ^ creo que es lo que se queria hacer
		return this.gestorPedido.getTodosPedidos();
	}
	
}
