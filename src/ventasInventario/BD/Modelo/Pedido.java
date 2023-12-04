package ventasInventario.BD.Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.time.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import ventasInventario.BD.Conexion;

public class Pedido {
	private String cpedido;
	private Usuario usuario;
	private String estadoPedido;
	private LocalDate fecha_reserva;
	private LocalDate fecha_limite;
	private Double total;
	private ArrayList<ProductoCarrito> productos;
	
	public Pedido(String cpedido, Usuario usuario, LocalDate fecha_reserva) {
		this.cpedido = cpedido;
		this.usuario = usuario;
		this.fecha_reserva = fecha_reserva;
		this.estadoPedido = EstadoPedido.confirmado;
		this.fecha_limite = fecha_reserva.plusDays(3);
		this.productos = new ArrayList<>();
		this.total = 0.0;
	}
	
	
	public Pedido(Usuario usuario) {
		this.usuario = usuario;
		this.productos = new ArrayList<>();
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


	public ArrayList<ProductoCarrito> getProductos() {
		return productos;
	}


	public void setProductos(ArrayList<ProductoCarrito> productos) {
		this.productos = productos;
	}


	@Override
	public String toString() {
		return "Pedido [cpedido=" + cpedido + ", usuario=" + usuario + ", estadoPedido=" + estadoPedido
				+ ", fecha_reserva=" + fecha_reserva + ", fecha_limite=" + fecha_limite + ", total=" + total
				+ ", productos=" + productos + "]";
	}
	
	public String nuevoPedido() {
	    Conexion con = new Conexion();
	    Connection conexion = con.getConexionPostgres();
	    CallableStatement s = null;
	    String query = "{? = call confirmarCarrito(?)}";
	    String pedidoGenerado = null;
	    try {
	        s = conexion.prepareCall(query);
	        s.registerOutParameter(1, Types.VARCHAR); 
	        s.setString(2, usuario.getUsuario());
	        s.execute();
	        
	        pedidoGenerado = s.getString(1);

	        JOptionPane.showMessageDialog(null, "Se confirmó correctamente el carrito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
	    } catch (SQLException e) {
	        JOptionPane.showMessageDialog(null, "Error al realizar el pedido", "Error", JOptionPane.ERROR_MESSAGE);
	        System.out.println(e.getMessage());
	    } finally {
	        try {
	            if (s != null) {
	                s.close();
	            }
	            if (conexion != null) {
	                conexion.close();
	            }
	        } catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión.", "Error", JOptionPane.ERROR_MESSAGE);
	            System.out.println(ex.getMessage());
	        }
	    }
	    return pedidoGenerado; 
	}

	
	
	
	
	
}
