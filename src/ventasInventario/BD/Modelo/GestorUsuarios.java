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
	    String query = "{call registrarUsuario(?, ?, ?, ?, ?)}";
	    try {
	        s = conexion.prepareCall(query);
	        s.setString(1, usuario.getUsuario());
	        s.setString(2, usuario.getNombre());
	        s.setString(3, usuario.getCorreo());
	        s.setString(4, usuario.getContrasenia());
	        s.setBoolean(5, usuario.getFuncionario());
	        s.executeUpdate();
	        this.usuarios.add(usuario);
	        JOptionPane.showMessageDialog(null, "Registrado Correctamente", "Bienvenido a Néa", JOptionPane.INFORMATION_MESSAGE);
	    } catch (SQLException e) {
	    	if(e.getSQLState().equals("23505")) {
	    		JOptionPane.showMessageDialog(null, "Ya hay un usuario igual", "Uy", JOptionPane.ERROR_MESSAGE);
	    	}
	    	else {
	    		System.out.println(e.getMessage());
	    	}
	        
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
