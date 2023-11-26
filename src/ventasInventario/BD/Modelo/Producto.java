package ventasInventario.BD.Modelo;

import java.util.ArrayList;

public class Producto {
	private String cproducto;
	private String nombre;
	private String descripcion;
	private Double precio;
	private Integer cantidad;
	private String marca;
	private String color;
	private String talla;
	private Boolean ofertado;
	private Oferta oferta;
	private ArrayList<String> imagenes;
	private ArrayList<String> etiquetas;
	
	public Producto(String cproducto, String nombre, String descripcion, Double precio, Integer cantidad, String marca,
			String color, String talla, ArrayList<String> imagenes, ArrayList<String> etiquetas) {
		super();
		this.cproducto = cproducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
		this.marca = marca;
		this.color = color;
		this.talla = talla;
		this.imagenes = imagenes;
		this.etiquetas = etiquetas;
	}

	public String getCproducto() {
		return cproducto;
	}

	public void setCproducto(String cproducto) {
		this.cproducto = cproducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public Boolean getOfertado() {
		return ofertado;
	}

	public void setOfertado(Boolean ofertado) {
		this.ofertado = ofertado;
	}

	public Oferta getOferta() {
		return oferta;
	}

	public void setOferta(Oferta oferta) {
		this.oferta = oferta;
	}

	public ArrayList<String> getImagenes() {
		return imagenes;
	}

	public void setImagenes(ArrayList<String> imagenes) {
		this.imagenes = imagenes;
	}

	public ArrayList<String> getEtiquetas() {
		return etiquetas;
	}

	public void setEtiquetas(ArrayList<String> etiquetas) {
		this.etiquetas = etiquetas;
	}

	@Override
	public String toString() {
		return "Producto [cproducto=" + cproducto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio="
				+ precio + ", cantidad=" + cantidad + ", marca=" + marca + ", color=" + color + ", talla=" + talla
				+ ", ofertado=" + ofertado + ", oferta=" + oferta + ", imagenes=" + imagenes + ", etiquetas="
				+ etiquetas + "]";
	}
	
	
	
	
}
