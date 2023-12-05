package ventasInventario.BD.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import ventasInventario.BD.Conexion;

public class Usuario {
	
	private String usuario;
	private String nombre;
	private String correo;
	private String contrasenia;
	private Boolean funcionario;
	private Boolean super_usuario;
	
	public Usuario(String usuario, String nombre, String correo, String contrasenia) {
		super();
		this.usuario = usuario;
		this.nombre = nombre;
		this.correo = correo;
		this.contrasenia = contrasenia;
		this.funcionario = false;
		this.super_usuario = false;
	}
	public Usuario(String usuario, String nombre, String correo, String contrasenia,Boolean funcionario) {
		super();
		this.usuario = usuario;
		this.nombre = nombre;
		this.correo = correo;
		this.contrasenia = contrasenia;
		this.funcionario = funcionario;
		this.super_usuario = false;
	}
	
	

	public Usuario(String usuario) {
		
		this.usuario = usuario;
		obtenerUsuario();
		
	}
	public Usuario(String usuario, String nombre, String correo, String contrasenia, Boolean funcionario,
			Boolean super_usuario) {
	
		this.usuario = usuario;
		this.nombre = nombre;
		this.correo = correo;
		this.contrasenia = contrasenia;
		this.funcionario = funcionario;
		this.super_usuario = super_usuario;
	}
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Boolean getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Boolean funcionario) {
		this.funcionario = funcionario;
	}

	public Boolean getSuper_usuario() {
		return super_usuario;
	}

	public void setSuper_usuario(Boolean super_usuario) {
		this.super_usuario = super_usuario;
	}

	@Override
	public String toString() {
		return "Usuario [usuario=" + usuario + ", nombre=" + nombre + ", correo=" + correo + ", contrasenia="
				+ contrasenia + ", funcionario=" + funcionario + ", super_usuario=" + super_usuario + "]";
	}
	
	public void obtenerUsuario() {
	    Conexion con = new Conexion();
	    Connection conexion = con.getConexionPostgres();
	    PreparedStatement statement = null;
	    ResultSet resultSet = null;

	    try {
	        String query = "SELECT nombre, correo, contrasenia, funcionario, super_usuario FROM usuarios where cusuario = ?";
	        
	        statement = conexion.prepareStatement(query);
	        statement.setString(1, this.usuario); 
	        resultSet = statement.executeQuery();

	        // Mover el cursor del ResultSet
	        if (resultSet.next()) {
	            this.nombre = resultSet.getString("nombre");
	            this.correo = resultSet.getString("correo");
	            this.contrasenia = resultSet.getString("contrasenia");
	            this.funcionario = resultSet.getBoolean("funcionario");
	            this.super_usuario = resultSet.getBoolean("super_usuario");
	        }

	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "Parece que hubo un error", "Uy", JOptionPane.ERROR_MESSAGE);
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
	        	JOptionPane.showMessageDialog(null, "Parece que hubo un error", "Uy", JOptionPane.ERROR_MESSAGE);
	        }
	    }
	}
	
	public void editarUsuario(Usuario usuarioEditado) {
	    Conexion con = new Conexion();
	    Connection conexion = con.getConexionPostgres();
	    PreparedStatement statement = null;

	    try {
	        String query = "UPDATE usuarios SET nombre = ?, correo = ?, contrasenia = ?, funcionario = ?, super_usuario = ? WHERE cusuario = ?";

	        statement = conexion.prepareStatement(query);
	        statement.setString(1, usuarioEditado.getNombre());
	        statement.setString(2, usuarioEditado.getCorreo());
	        statement.setString(3, usuarioEditado.getContrasenia());
	        statement.setBoolean(4, usuarioEditado.getFuncionario());
	        statement.setBoolean(5, usuarioEditado.getSuper_usuario());
	        statement.setString(6, this.getUsuario()); 
	        int rowsUpdated = statement.executeUpdate();
	        if (rowsUpdated > 0) {
	        	JOptionPane.showMessageDialog(null, "Se guardaron los cambios", "Producto nuevo", JOptionPane.INFORMATION_MESSAGE);
	            this.setNombre(usuarioEditado.getNombre());
	            this.setCorreo(usuarioEditado.getCorreo());
	            this.setContrasenia(usuarioEditado.getContrasenia());
	            this.setFuncionario(usuarioEditado.getFuncionario());
	            this.setSuper_usuario(usuarioEditado.getSuper_usuario());
	        } else {
	        	JOptionPane.showMessageDialog(null, "Parece que hubo un error", "Uy", JOptionPane.ERROR_MESSAGE);
	        }

	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "Parece que hubo un error", "Uy", JOptionPane.ERROR_MESSAGE);
	    } finally {
	        try {
	            if (statement != null) {
	                statement.close();
	            }
	            if (conexion != null) {
	                conexion.close();
	            }
	        } catch (SQLException ex) {
	        	JOptionPane.showMessageDialog(null, "Parece que hubo un error", "Uy", JOptionPane.ERROR_MESSAGE);
	        }
	    }
	}


	
	
}
