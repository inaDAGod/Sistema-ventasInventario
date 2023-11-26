package ventasInventario.BD.Modelo;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import ventasInventario.BD.Conexion;

public class GestorUsuarios {
	private ArrayList<Usuario> usuarios;

	public GestorUsuarios() {
		this.usuarios = obtenerTodosLosUsuarios();
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	@Override
	public String toString() {
		return "GestorUsuarios [usuarios=" + usuarios + "]";
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
	
	public ArrayList<Usuario> obtenerTodosLosUsuarios() {
	    ArrayList<Usuario> usuarios = new ArrayList<>();
	    Conexion con = new Conexion();
	    Connection conexion = con.getConexionPostgres();
	    PreparedStatement statement = null;
	    ResultSet resultSet = null;

	    try {
	        String query = "SELECT cusuario, nombre, correo, contrasenia, funcionario, super_usuario FROM usuarios";
	        statement = conexion.prepareStatement(query);
	        resultSet = statement.executeQuery();

	        while (resultSet.next()) {
	            String usuario = resultSet.getString("cusuario");
	            String nombre = resultSet.getString("nombre");
	            String correo = resultSet.getString("correo");
	            String contrasenia = resultSet.getString("contrasenia");
	            Boolean funcionario = resultSet.getBoolean("funcionario");
	            Boolean superUsuario = resultSet.getBoolean("super_usuario");
	            Usuario user = new Usuario(usuario, nombre, correo, contrasenia, funcionario, superUsuario);
	            usuarios.add(user);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (resultSet != null) {
	                resultSet.close();
	            }
	            if (statement != null) {
	                statement.close();
	            }
	            if (conexion != null) {
	                conexion.close();
	            }
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }
	    }

	    return usuarios;
	}

	 public boolean verificarCredenciales(String usuario, String contrasenia) {
		 	boolean bandera = false;
	        for (Usuario u : usuarios) {
	            if (u.getUsuario().equals(usuario) ) {
	            	if(u.getContrasenia().equals(contrasenia))  {
	            		 return true; 
	            	}
	            	else {
	            		JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Uy", JOptionPane.ERROR_MESSAGE);
	            		return false;
	            	}
	            }
	        }
	        if(bandera) {
	        	return true;
	        }
	        else {
	        	JOptionPane.showMessageDialog(null, "No se encontro el usuario", "Uy", JOptionPane.ERROR_MESSAGE);
	        	return false;
	        }
	    }
	
	

}
