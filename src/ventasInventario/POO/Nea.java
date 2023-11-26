package ventasInventario.POO;

public class Nea {
	private String telefono;
	private String correo;
	private String intaLink;
	private String intaUsuario;
	private String faceLink;
	private String faceUsuario;
	private String tiktokLink;
	private String tiktokUsuario;
	private String direccion;
	private String direccionLink;
	
	public Nea(String telefono, String correo, String intaLink, String intaUsuario, String faceLink, String faceUsuario,
			String tiktokLink, String tiktokUsuario, String direccion, String direccionLink) {
		this.telefono = telefono;
		this.correo = correo;
		this.intaLink = intaLink;
		this.intaUsuario = intaUsuario;
		this.faceLink = faceLink;
		this.faceUsuario = faceUsuario;
		this.tiktokLink = tiktokLink;
		this.tiktokUsuario = tiktokUsuario;
		this.direccion = direccion;
		this.direccionLink = direccionLink;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getIntaLink() {
		return intaLink;
	}

	public void setIntaLink(String intaLink) {
		this.intaLink = intaLink;
	}

	public String getIntaUsuario() {
		return intaUsuario;
	}

	public void setIntaUsuario(String intaUsuario) {
		this.intaUsuario = intaUsuario;
	}

	public String getFaceLink() {
		return faceLink;
	}

	public void setFaceLink(String faceLink) {
		this.faceLink = faceLink;
	}

	public String getFaceUsuario() {
		return faceUsuario;
	}

	public void setFaceUsuario(String faceUsuario) {
		this.faceUsuario = faceUsuario;
	}

	public String getTiktokLink() {
		return tiktokLink;
	}

	public void setTiktokLink(String tiktokLink) {
		this.tiktokLink = tiktokLink;
	}

	public String getTiktokUsuario() {
		return tiktokUsuario;
	}

	public void setTiktokUsuario(String tiktokUsuario) {
		this.tiktokUsuario = tiktokUsuario;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDireccionLink() {
		return direccionLink;
	}

	public void setDireccionLink(String direccionLink) {
		this.direccionLink = direccionLink;
	}

	@Override
	public String toString() {
		return "Nea [telefono=" + telefono + ", correo=" + correo + ", intaLink=" + intaLink + ", intaUsuario="
				+ intaUsuario + ", faceLink=" + faceLink + ", faceUsuario=" + faceUsuario + ", tiktokLink=" + tiktokLink
				+ ", tiktokUsuario=" + tiktokUsuario + ", direccion=" + direccion + ", direccionLink=" + direccionLink
				+ "]";
	}
	
	
	
	
	
}
