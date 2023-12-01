package ventasInventario.BD.Modelo;

import java.time.*;
import java.util.ArrayList;

public class Pedido {
	private String cpedido;
	private Usuario usuario;
	private String estadoPedido;
	private LocalDate fecha_reserva;
	private LocalDate fecha_limite;
	private Double total;
	private ArrayList<ProductosPedido> productos;
	
	public Pedido(String cpedido, Usuario usuario, LocalDate fecha_reserva) {
		this.cpedido = cpedido;
		this.usuario = usuario;
		this.fecha_reserva = fecha_reserva;
		this.estadoPedido = EstadoPedido.confirmado;
		this.fecha_limite = fecha_reserva.plusDays(3);
		this.productos = new ArrayList<>();
		this.total = 0.0;
	}

	public String getCpedido() {
		return cpedido;
	}

	public void setCpedido(String cpedido) {
		this.cpedido = cpedido;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getEstadoPedido() {
		return estadoPedido;
	}

	public void setEstadoPedido(String estadoPedido) {
		this.estadoPedido = estadoPedido;
	}

	public LocalDate getFecha_reserva() {
		return fecha_reserva;
	}

	public void setFecha_reserva(LocalDate fecha_reserva) {
		this.fecha_reserva = fecha_reserva;
	}

	public LocalDate getFecha_limite() {
		return fecha_limite;
	}

	public void setFecha_limite(LocalDate fecha_limite) {
		this.fecha_limite = fecha_limite;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public ArrayList<ProductosPedido> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<ProductosPedido> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Pedido [cpedido=" + cpedido + ", usuario=" + usuario + ", estadoPedido=" + estadoPedido
				+ ", fecha_reserva=" + fecha_reserva + ", fecha_limite=" + fecha_limite + ", total=" + total
				+ ", productos=" + productos + "]";
	}
	
	
	
}
