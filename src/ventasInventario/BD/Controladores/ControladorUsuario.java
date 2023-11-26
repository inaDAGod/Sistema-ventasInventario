package ventasInventario.BD.Controladores;

import ventasInventario.BD.Modelo.GestorUsuarios;

public class ControladorUsuario {
	private GestorUsuarios  listaUsuarios;

	public ControladorUsuario(GestorUsuarios listaUsuarios) {
	
		this.listaUsuarios = listaUsuarios;
	}

	public GestorUsuarios getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(GestorUsuarios listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	
	

	
	
	

}
