package ventasInventario.BD.Modelo;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import ventasInventario.BD.Conexion;

public class GestorUsuarios {
	private ArrayList<Usuario> usuarios;

	public GestorUsuarios() {
		this.usuarios = new ArrayList<>();
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public void addUsuario(Usuario usuario) throws SQLException {
	    Conexion con = new Conexion();
	    Connection conexion = con.getConexionPostgres();
	    CallableStatement s = null;
	    String query = "{call registrarse(?, ?, ?, ?)}";
	    try {
	        s = conexion.prepareCall(query);
	        s.setString(1, usuario.getUsuario());
	        s.setString(2, usuario.getNombre());
	        s.setString(3, usuario.getCorreo());
	        s.setString(4, usuario.getContrasenia());
	        s.executeUpdate();
	        JOptionPane.showMessageDialog(null, "Bienvenido a Néa", "Registrado correctamente", JOptionPane.INFORMATION_MESSAGE);
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    } finally {
	        if (s != null) {
	            s.close();
	        }
	        if (conexion != null) {
	            conexion.close();
	        }
	    }
	}

	
	

}
