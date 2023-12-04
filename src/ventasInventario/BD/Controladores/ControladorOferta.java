package ventasInventario.BD.Controladores;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;

import ventasInventario.Ofertar;
import ventasInventario.BD.Modelo.Oferta;
import ventasInventario.BD.Modelo.Producto;

public class ControladorOferta {
	private Ofertar ofertarVentana;

	public ControladorOferta(Ofertar ofertarVentana) {
	
		this.ofertarVentana = ofertarVentana;
	}

	public Ofertar getOfertarVentana() {
		return ofertarVentana;
	}

	public void setOfertarVentana(Ofertar ofertarVentana) {
		this.ofertarVentana = ofertarVentana;
	}
	
	public void  ofertarProducto(Producto producto) {
		String precioOfertaString = ofertarVentana.getTxPrecioOferta().getText();
		Double precioOferta = null;
			try {
			    precioOferta = Double.parseDouble(precioOfertaString);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Verifica que ingresaste un precio valido!", "Uy", JOptionPane.ERROR_MESSAGE);
				
			  
			}
			String fechaInicioString = ofertarVentana.getTxFechaInicio().getText();
			String fechaFinString = ofertarVentana.getTxtDdmmyyyy().getText();
			LocalDate fechaInicio = null;
			LocalDate fechaFin = null;

			try {
			    fechaInicio = LocalDate.parse(fechaInicioString);
			    fechaFin = LocalDate.parse(fechaFinString);
			    
			} catch (DateTimeParseException e) {
				JOptionPane.showMessageDialog(null, "Alguna fecha es incorrecta! ('dd/mm/yyyy')", "Uy", JOptionPane.ERROR_MESSAGE);
			  
			  
			}
			
			Oferta oferta = new Oferta(producto.getPrecio(), precioOferta, 1, fechaInicio, fechaFin);
			producto.ofertar(oferta);
		
	}
	
}
