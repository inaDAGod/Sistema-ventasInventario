package ventasInventario.BD.Modelo;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import ventasInventario.BD.Conexion;

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
	

	public Producto(String cproducto, String nombre, String descripcion, Double precio, Integer cantidad, String marca,
			String color, String talla, ArrayList<String> etiquetas) {

		this.cproducto = cproducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
		this.marca = marca;
		this.color = color;
		this.talla = talla;
		this.imagenes = new ArrayList<>();
		this.ofertado = false;
		this.etiquetas = etiquetas;
	}
	

	public Producto(String cproducto, String nombre, String descripcion, Double precio, Integer cantidad, String marca,
			String color, String talla, Boolean ofertado, Oferta oferta, ArrayList<String> imagenes,
			ArrayList<String> etiquetas) {
		super();
		this.cproducto = cproducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
		this.marca = marca;
		this.color = color;
		this.talla = talla;
		this.ofertado = ofertado;
		this.oferta = oferta;
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
		if(this.ofertado) {
			return this.oferta.getPrecioOferta();
		}
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
	
	/***
	 * guarda la oferta de un producto en la BD 
	 * @param oferta del producto 
	 */
	public void ofertar(Oferta oferta) {
	    Conexion con = new Conexion();
	    Connection conexion = con.getConexionPostgres();
	    CallableStatement s = null;
	    String query = "{call ofertar(?, ?, ?, ?, ?)}";

	    try {
	        s = conexion.prepareCall(query);
	        s.setString(1, getCproducto());
	        s.setBigDecimal(2, BigDecimal.valueOf(oferta.getPrecioOferta()));
	        s.setInt(3, oferta.getCantidadInicial());
	        s.setDate(4, java.sql.Date.valueOf(oferta.getFechaInicio()));
	        s.setDate(5, java.sql.Date.valueOf(oferta.getFechaFin()));
	        s.executeUpdate();

	        // Actualización del campo "ofertado" en la base de datos
	        String updateQuery = "UPDATE productos SET ofertado = true WHERE cproducto = ?";
	        PreparedStatement updateStatement = conexion.prepareStatement(updateQuery);
	        updateStatement.setString(1, getCproducto());
	        updateStatement.executeUpdate();
	      JOptionPane.showMessageDialog(null,"Oferta realizada con éxito","Oferta Exitosa", JOptionPane.INFORMATION_MESSAGE);

	    } catch (SQLException e) {
	    	if (e.getSQLState().equals("23505")) {
	            JOptionPane.showMessageDialog(null, "La oferta para este producto ya existe.", "Error de duplicado", JOptionPane.ERROR_MESSAGE);
	        } else {
	     
	            JOptionPane.showMessageDialog(null, "Error al procesar la oferta.", "Error", JOptionPane.ERROR_MESSAGE);
	            System.out.println(e.getMessage()); 
	        }
	    } finally {
	        try {
	            if (s != null) {
	                s.close();
	            }
	            if (conexion != null) {
	                conexion.close();
	            }
	        } catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, "Parece que hubo un error", "Uy", JOptionPane.ERROR_MESSAGE);
	            System.out.println(ex);
	        }
	    }
	}

	
	
	
	
}
