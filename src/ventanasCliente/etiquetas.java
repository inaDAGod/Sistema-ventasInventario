package ventanasCliente;

public class etiquetas {
	private int ctiquetas;
	private String detalle;
	/**
	 * @return the ctiquetas
	 */
	public int getCtiquetas() {
		return ctiquetas;
	}
	/**
	 * @param ctiquetas the ctiquetas to set
	 */
	public void setCtiquetas(int ctiquetas) {
		this.ctiquetas = ctiquetas;
	}
	/**
	 * @return the detalle
	 */
	public String getDetalle() {
		return detalle;
	}
	/**
	 * @param detalle the detalle to set
	 */
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	
	
	@Override
	public String toString() {
		return "etiquetas [ctiquetas=" + ctiquetas + ", detalle=" + detalle + "]";
	}
	public etiquetas(int ctiquetas, String detalle) {
		super();
		this.ctiquetas = ctiquetas;
		this.detalle = detalle;
	}
	
}
