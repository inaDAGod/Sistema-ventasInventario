package ventasInventario.BD.Modelo;

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
		this.funcionario = false;
		this.super_usuario = false;
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
	
	
}
