package ventanasCliente;

public class productos {
	 private String cproducto;
	 private String nombre;
	    private String descripcion;
	    private float precio;
	    private int cantidad;
	    private String marca;
	    private String color;
	    private String talla;
	    private boolean ofetado;
	    private String ruta_imagen;
	    /**
		 * @return the ruta_imagen
		 */
		public String getRuta_imagen() {
			return ruta_imagen;
		}
		/**
		 * @param ruta_imagen the ruta_imagen to set
		 */
		public void setRuta_imagen(String ruta_imagen) {
			this.ruta_imagen = ruta_imagen;
		}
		/**
	 * @return the cproducto
	 */
	public String getCproducto() {
		return cproducto;
	}
	/**
	 * @param cproducto the cproducto to set
	 */
	public void setCproducto(String cproducto) {
		this.cproducto = cproducto;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the precio
	 */
	public float getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the talla
	 */
	public String getTalla() {
		return talla;
	}
	/**
	 * @param talla the talla to set
	 */
	public void setTalla(String talla) {
		this.talla = talla;
	}
	/**
	 * @return the ofetado
	 */
	public boolean isOfetado() {
		return ofetado;
	}
	/**
	 * @param ofetado the ofetado to set
	 */
	public void setOfetado(boolean ofetado) {
		this.ofetado = ofetado;
	}
	public productos(String cproducto, String nombre, String descripcion, float precio, int cantidad, String marca,
			String color, String talla, boolean ofetado, String ruta_imagen) {
		super();
		this.cproducto = cproducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
		this.marca = marca;
		this.color = color;
		this.talla = talla;
		this.ofetado = ofetado;
		this.ruta_imagen = ruta_imagen;
	}
	
	
		
}
