package ventasInventario.BD.Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import ventasInventario.BD.Conexion;

public class Favoritos {
	private ArrayList<Producto> productos;
	private Usuario usuario;
	
	public Favoritos(Usuario usuario) {
		this.productos = sacarProductosFavoritos();
		this.usuario = usuario;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Favoritos [productos=" + productos + ", usuario=" + usuario + "]";
	}
	
	public  ArrayList<Producto> sacarProductosFavoritos(){//sacar favoritos del usuario de la BD
		ArrayList<Producto> favs = new ArrayList<>();
		return favs;
	}
	/***
	 * se guarda el producto para favoritos de cierto usuario
	 * @param p producto que se guardara en favoritos del usuario
	 */
	public void guardarProductoFavorito(Producto p) {
	    String cpro = p.getCproducto();
	    String cusuario = this.usuario.getUsuario();
	    Conexion con = new Conexion();
	    Connection conexion = con.getConexionPostgres();
	    CallableStatement s = null;
	    String query = "{call agregaraFavoritos(?,?)}";
	    try {
	        s = conexion.prepareCall(query);
	        s.setString(1, cusuario);
	        s.setString(2, cpro);
	        s.executeUpdate();
	        this.productos.add(p);
	        
	        JOptionPane.showMessageDialog(null, "Producto agregado a favoritos.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
	    } catch (SQLException e) {
	        if (e.getSQLState().equals("23505")) {
	            JOptionPane.showMessageDialog(null, "Este producto ya está en tus favoritos.", "Error de duplicado", JOptionPane.ERROR_MESSAGE);
	        } else {
	            JOptionPane.showMessageDialog(null, "Error al agregar el producto a favoritos.", "Error", JOptionPane.ERROR_MESSAGE);
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
