package ventasInventario.BD.Modelo;

import java.time.*;

public class Oferta {
	private Integer porcentaje;
	private Double precioOferta;
	private Integer cantidadInicial;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	
	public Oferta(Double precio, Double precioOferta, Integer cantidadInicial, LocalDate fechaInicio, LocalDate fechaFin) {
		
		this.precioOferta = precioOferta;
		this.cantidadInicial = cantidadInicial;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.porcentaje = (int) (((precioOferta-precio)/precio)*100);
	}
	

	public Oferta(Integer porcentaje, Double precioOferta, Integer cantidadInicial, LocalDate fechaInicio,
			LocalDate fechaFin) {
		this.porcentaje = porcentaje;
		this.precioOferta = precioOferta;
		this.cantidadInicial = cantidadInicial;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}


	public Integer getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(Integer porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Double getPrecioOferta() {
		return precioOferta;
	}

	public void setPrecioOferta(Double precioOferta) {
		this.precioOferta = precioOferta;
	}

	public Integer getCantidadInicial() {
		return cantidadInicial;
	}

	public void setCantidadInicial(Integer cantidadInicial) {
		this.cantidadInicial = cantidadInicial;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Override
	public String toString() {
		return "Oferta [porcentaje=" + porcentaje + ", precioOferta=" + precioOferta + ", cantidadInicial="
				+ cantidadInicial + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + "]";
	}
	
	
	
}
