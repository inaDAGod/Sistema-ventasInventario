package ventasInventario.BD.Controladores;

import javax.swing.JOptionPane;

import ventasInventario.PanelLogin;
import ventasInventario.BD.Modelo.GestorUsuarios;
import ventasInventario.BD.Modelo.Usuario;

public class ControladorLogin {
	private PanelLogin panelLogin;

	public ControladorLogin(PanelLogin panelLogin) {
		this.panelLogin = panelLogin;
	}
	public void verificacionLogin() {
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
				//mandar a inicio de cliente
			}
		}
		
	}
	
	
	
	
}
