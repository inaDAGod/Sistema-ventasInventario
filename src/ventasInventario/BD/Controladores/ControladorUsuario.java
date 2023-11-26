package ventasInventario.BD.Controladores;

import java.util.ArrayList;

import ventasInventario.BD.Modelo.GestorUsuarios;
import ventasInventario.BD.Modelo.Usuario;

public class ControladorUsuario {
	private GestorUsuarios  listaUsuarios;

	public ControladorUsuario() {
		this.listaUsuarios = new GestorUsuarios();
	}
	public GestorUsuarios getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(GestorUsuarios listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	
	public ArrayList<Usuario> listaUsuario()
	{
		return this.listaUsuarios.getUsuarios();
	}
	

	
	
	

}
