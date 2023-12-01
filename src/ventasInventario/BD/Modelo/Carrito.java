package ventasInventario.BD.Modelo;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import javax.swing.JOptionPane;

import ventasInventario.BD.Conexion;

public class Carrito {
	private Usuario usuario;
	private ArrayList<ProductoCarrito> productos; 
	private Double total;
	
	public Carrito(Usuario usuario) {
		this.usuario = usuario;
		this.productos = sacarProductosCarrito();
		this.total = calculoTotal();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public ArrayList<ProductoCarrito> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<ProductoCarrito> productos) {
		this.productos = productos;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Carrito [usuario=" + usuario + ", productos=" + productos + ", total=" + total + "]";
	}
	
	public ArrayList<ProductoCarrito> sacarProductosCarrito() {
	    ArrayList<ProductoCarrito> productosCarrito = new ArrayList<ProductoCarrito>();
	    GestorProductos gestorProductos = new GestorProductos();
	    Conexion con = new Conexion();
	    try (Connection conexion = con.getConexionPostgres();
	         PreparedStatement statement = conexion.prepareStatement("select cproducto,cantidad,monto  from carrito_productos where cusuario = ?")) {
	        statement.setString(1, usuario.getUsuario());
	        ResultSet resultSet = statement.executeQuery();
	        while (resultSet.next()) {
	            String cproducto = resultSet.getString("cproducto");
	            Integer cantidad = resultSet.getInt("cantidad");
	            BigDecimal montoB = resultSet.getBigDecimal("monto");
	            double monto = montoB.doubleValue();
	            ProductoCarrito productoCarrito = new ProductoCarrito(gestorProductos.buscarProductoEspecifico(cproducto), cantidad);
	            productosCarrito.add(productoCarrito);
	        }
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "Parece que ocurrio un error", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
	    }
	    
	    return productosCarrito;
	}
	
	public Double calculoTotal() {
		Double total = 0.0;
		for(ProductoCarrito productoCarrito: productos) {
			total += productoCarrito.getMonto();
		}
		return total;
	}
	
	public void guardarEnCarrito(ProductoCarrito pc) {
	    Conexion con = new Conexion();
	    Connection conexion = con.getConexionPostgres();
	    CallableStatement s = null;
	    String query = "{call agregaraCarrito(?,?,?)}";
	    try {
	        s = conexion.prepareCall(query);
	        s.setString(1, usuario.getUsuario());
	        s.setString(2, pc.getProducto().getCproducto());
	        s.setInt(3, pc.getCantidad());
	        s.executeUpdate();
	        this.productos.add(pc);
	        
	        JOptionPane.showMessageDialog(null, "Producto agregado al carrito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
	    } catch (SQLException e) {
	        if (e.getSQLState().equals("23505")) {
	            JOptionPane.showMessageDialog(null, "Este producto ya está en tu carrito.", "Error de duplicado", JOptionPane.ERROR_MESSAGE);
	        } else {
	            JOptionPane.showMessageDialog(null, "Error al agregar el producto al carrito.", "Error", JOptionPane.ERROR_MESSAGE);
	            System.out.println(e.getMessage());
	        }
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
	}
	
	
	
	
	
}
