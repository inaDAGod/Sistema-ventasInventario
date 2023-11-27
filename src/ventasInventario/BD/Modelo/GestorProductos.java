package ventasInventario.BD.Modelo;

import java.math.BigDecimal;
import java.sql.*;
import java.util.*;

import javax.swing.JOptionPane;

import ventasInventario.BD.Conexion;

public class GestorProductos {
	private ArrayList<Producto> productos;
	private ArrayList<String> etiquetas;

	public GestorProductos() {
		this.productos = new ArrayList<>();//cambiar por funcion que saca de la base de datos
		this.etiquetas = obtenerEtiquetas();
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}
	
	

	public ArrayList<String> getEtiquetas() {
		return etiquetas;
	}

	public void setEtiquetas(ArrayList<String> etiquetas) {
		this.etiquetas = etiquetas;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
		this.etiquetas = obtenerEtiquetas();
	}
	
	public void addProducto(Producto producto) throws SQLException {
	    Conexion con = new Conexion();
	    Connection conexion = con.getConexionPostgres();
	    CallableStatement s = null;
	    CallableStatement sEtiqueta = null;
	    BigDecimal precio = BigDecimal.valueOf(producto.getPrecio());
	    String query = "{call registrarProducto(?, ?, ?, ?, ?,?,?,?)}";
	    
	    try {
	        s = conexion.prepareCall(query);
	        s.setString(1, producto.getCproducto());
	        s.setString(2, producto.getNombre());
	        s.setString(3, producto.getDescripcion());
	        s.setBigDecimal(4, precio);
	        s.setInt(5, producto.getCantidad());
	        s.setString(6, producto.getMarca());
	        s.setString(7, producto.getColor());
	        s.setString(8, producto.getTalla());
	        s.executeUpdate();

	        String queryEtiqueta = "{call agregarEtiquetaProducto(?, ?)}";
	        sEtiqueta = conexion.prepareCall(queryEtiqueta); // Aquí se inicializa sEtiqueta
	        
	        for (String etiqueta : producto.getEtiquetas()) {
	            sEtiqueta.setString(1, etiqueta);
	            sEtiqueta.setString(2, producto.getCproducto());
	            sEtiqueta.executeUpdate();
	        }

	        this.productos.add(producto);
	        JOptionPane.showMessageDialog(null, "Registrado Correctamente", "Producto nuevo", JOptionPane.INFORMATION_MESSAGE);
	    } catch (SQLException e) {
	        if (e.getSQLState().equals("23505")) {
	            JOptionPane.showMessageDialog(null, "Ya hay un producto con ese ID", "Uy", JOptionPane.ERROR_MESSAGE);
	        } else {
	            System.out.println(e.getMessage());
	        }
	    } finally {
	        if (s != null) {
	            s.close();
	        }
	        if (sEtiqueta != null) { // Verifica que sEtiqueta no sea nulo antes de cerrarlo
	            sEtiqueta.close();
	        }
	        if (conexion != null) {
	            conexion.close();
	        }
	    }
	}

	
	public ArrayList<String> obtenerEtiquetas() {
	    ArrayList<String> etiquetas = new ArrayList<>();
	    Conexion con = new Conexion();

	    try (Connection conexion = con.getConexionPostgres();
	         PreparedStatement statement = conexion.prepareStatement("SELECT cetiqueta FROM etiquetas");
	         ResultSet resultSet = statement.executeQuery()) {

	        while (resultSet.next()) {
	            String etiqueta = resultSet.getString("cetiqueta");
	            etiquetas.add(etiqueta);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return etiquetas;
	}

	
	
}
