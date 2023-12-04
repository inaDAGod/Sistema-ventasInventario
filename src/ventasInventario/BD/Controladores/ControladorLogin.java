package ventasInventario.BD.Controladores;

import javax.swing.JOptionPane;

import ventanasCliente.clienteInicio;
import ventasInventario.Login;
import ventasInventario.PanelLogin;
import ventasInventario.BD.Modelo.GestorUsuarios;
import ventasInventario.BD.Modelo.Usuario;

public class ControladorLogin {
	private PanelLogin panelLogin;

	public ControladorLogin(PanelLogin panelLogin) {
		this.panelLogin = panelLogin;
	}
	public Boolean verificacionLogin() {
		String usuario = panelLogin.getUsuario().getText();
		String contrasenia = panelLogin.getContrasenia().getText();
		//System.out.println(usuario + " " + contrasenia);
		GestorUsuarios gu = new GestorUsuarios();
		Usuario usu= gu.verificarCredenciales(usuario, contrasenia);
		if(usu != null) {
			if(usu.getFuncionario()) {
				System.out.println("Es funcionario" + usu);
				//mandar a inicio de funcionario
			}
			else {
				System.out.println("No es funcionario" + usu);
				clienteInicio frame = new clienteInicio(); // se deberia mandar el usuario, esto facilitaria todo
                frame.setVisible(true);
                
			}
			return true;
			
		}
		return false;
	}
	
	
	
	
}
