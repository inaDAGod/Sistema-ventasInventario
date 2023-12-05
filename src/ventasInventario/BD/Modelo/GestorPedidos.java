package ventasInventario.BD.Modelo;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import ventasInventario.BD.Conexion;

public class GestorPedidos {
	private ArrayList<Pedido> todosPedidos;

	public GestorPedidos() {
		this.todosPedidos = sacarTodosPedidos();
	}
	


	public ArrayList<Pedido> getTodosPedidos() {
		return todosPedidos;
	}



	public void setTodosPedidos(ArrayList<Pedido> todosPedidos) {
		this.todosPedidos = todosPedidos;
	}



	public ArrayList<Pedido> sacarTodosPedidos() {
		ArrayList<Pedido> pedidos = new ArrayList<>();
		  Conexion con = new Conexion();
		    try (Connection conexion = con.getConexionPostgres();
		         PreparedStatement statement = conexion.prepareStatement("SELECT cpedido,cusuario,cestado_pedido,fecha_reserva, fecha_limite, monto_pagar FROM pedidos");
		         ResultSet resultSet = statement.executeQuery()) {
		        while (resultSet.next()) {
		        	 String cpedido = resultSet.getString("cpedido");
		             String cusuario = resultSet.getString("cusuario");
		             String estadoPedido = resultSet.getString("cestado_pedido");
		             Date fecha1 = resultSet.getDate("fecha_reserva");
		             Date fecha2 = resultSet.getDate("fecha_limite");
		             BigDecimal monto = resultSet.getBigDecimal("monto_pagar");
		             double montoPagar= monto.doubleValue();
		             String mmm1 = fecha1.toString();
		             String mmm2 = fecha1.toString();
		             LocalDate fechaReserva = LocalDate.parse(mmm1); 
		             LocalDate fechalimite = LocalDate.parse(mmm2); 
		             ArrayList<ProductoCarrito> productosPedido = obtenerProductosPedido(cpedido, conexion);
		             Pedido p = new Pedido(cpedido, new Usuario(cusuario), estadoPedido, fechaReserva, fechalimite, montoPagar, productosPedido);
		             pedidos.add(p);
		        }
		    } catch (SQLException e) {
		    	JOptionPane.showMessageDialog(null, "Parece que hubo un error", "Uy", JOptionPane.ERROR_MESSAGE);
		    }
		    return pedidos;
	}
	
	private ArrayList<ProductoCarrito> obtenerProductosPedido(String cpedido, Connection conexion) throws SQLException {
	    ArrayList<ProductoCarrito> products = new ArrayList<>();
	    GestorProductos gestorProductos = new GestorProductos();
	    String query = "SELECT cproducto,cantidad,monto from productos_pedido where cpedido = ?";
	    try (PreparedStatement statement = conexion.prepareStatement(query)) {
	        statement.setString(1, cpedido);
	        ResultSet resultSet = statement.executeQuery();
	        while (resultSet.next()) {
	        	Producto p = gestorProductos.buscarProductoEspecifico(resultSet.getString("cproducto"));
	        	Integer cantidad =  resultSet.getInt("cantidad");
	        	BigDecimal mon = resultSet.getBigDecimal("monto");
	        	double monto= mon.doubleValue();
	        	ProductoCarrito pc = new ProductoCarrito(p,cantidad, monto);
	            products.add(pc);
	        }
	    }
	    return products;
	}
	public ArrayList<Pedido> pedidosClienteEspecifico(Usuario u){
		ArrayList<Pedido> pedidos = new ArrayList<>();
		for(Pedido p: this.todosPedidos) {
			if(p.getUsuario().getUsuario().equals(u.getUsuario())) {
				pedidos.add(p);
			}
		}
		return pedidos;
	}
	
	

	
}
