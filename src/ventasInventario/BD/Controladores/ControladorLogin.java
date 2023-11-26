package ventasInventario.BD.Controladores;

import ventasInventario.PanelLogin;
import ventasInventario.BD.Modelo.GestorUsuarios;

public class ControladorLogin {
	private PanelLogin panelLogin;

	public ControladorLogin(PanelLogin panelLogin) {
		this.panelLogin = panelLogin;
	}
	public  boolean verificacionLogin() {
		String usuario = panelLogin.getUsuario().getText();
		String contrasenia = panelLogin.getContrasenia().getText();
		//System.out.println(usuario + " " + contrasenia);
		GestorUsuarios gu = new GestorUsuarios();
		return gu.verificarCredenciales(usuario, contrasenia);
		
	}
	
	
	
	
}
