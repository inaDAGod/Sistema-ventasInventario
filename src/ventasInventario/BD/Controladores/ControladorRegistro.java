package ventasInventario.BD.Controladores;

import java.sql.SQLException;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import ventasInventario.NuevoFuncionario;
import ventasInventario.PanelRegistro;
import ventasInventario.BD.Modelo.GestorUsuarios;
import ventasInventario.BD.Modelo.Usuario;

public class ControladorRegistro {
    private PanelRegistro panelRegistro;
    private NuevoFuncionario nuevoFuncionario;

    public ControladorRegistro(PanelRegistro panelRegistro) {
        this.panelRegistro = panelRegistro;
    }
   

    public ControladorRegistro(NuevoFuncionario nuevoFuncionario) {

		this.nuevoFuncionario = nuevoFuncionario;
	}


	public void registroVerificacion() {
    	
        String nombre = panelRegistro.getNombre().getText();
        String correo = panelRegistro.getCorreo().getText();
        String contrasenia = panelRegistro.getContrasenia().getText();
        String vContra = panelRegistro.getvContra().getText();
        String usuario = panelRegistro.getUsuario().getText();
        if(!nombre.isEmpty() && !correo.isEmpty() && !contrasenia.isEmpty() && !vContra.isEmpty() && !usuario.isEmpty()) {
        	if(contrasenia.equals(vContra)) {
        		GestorUsuarios usuarios = new GestorUsuarios();
        		Usuario u = new Usuario(usuario, nombre, correo, contrasenia);
        		try {
					usuarios.addUsuario(u);
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Parece que hubo un error vuelve a intentarlo", "Uy", JOptionPane.ERROR_MESSAGE);
				}	
            }
            else {
            	JOptionPane.showMessageDialog(null, "Verifica tu contraseña", "Uy", JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
       	 JOptionPane.showMessageDialog(null, "Revisa lo campo y llena todos", "Uy", JOptionPane.ERROR_MESSAGE);
        }
 
        
    }
	public void registroFuncionario() {
    	
        String nombre = nuevoFuncionario.getNombre().getText();
        String correo = nuevoFuncionario.getCorreo().getText();
        String contrasenia = nuevoFuncionario.getContrasenia().getText();
        String usuario = nuevoFuncionario.getUsuario().getText();
        if(!nombre.isEmpty() && !correo.isEmpty() && !contrasenia.isEmpty() && !usuario.isEmpty()) {
        		GestorUsuarios usuarios = new GestorUsuarios();
        		Usuario u = new Usuario(usuario, nombre, correo, contrasenia,true);
        		try {
					usuarios.addUsuario(u);
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Parece que hubo un error vuelve a intentarlo", "Uy", JOptionPane.ERROR_MESSAGE);
				}
   		 
        }
        else {
       	 JOptionPane.showMessageDialog(null, "Revisa lo campo y llena todos", "Uy", JOptionPane.ERROR_MESSAGE);
        }
 
        
    }
}
