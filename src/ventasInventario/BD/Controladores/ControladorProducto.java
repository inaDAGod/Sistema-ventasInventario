package ventasInventario.BD.Controladores;

import java.awt.*;
import java.sql.SQLException;
import java.util.*;

import javax.swing.*;

import ventasInventario.NuevoProducto;
import ventasInventario.PanelInventario;
import ventasInventario.BD.Modelo.GestorProductos;
import ventasInventario.BD.Modelo.Producto;

public class ControladorProducto {
	private GestorProductos gestorProductos;
	private NuevoProducto nuevoProducto;
	private PanelInventario panelInventario;
	
	public ControladorProducto(NuevoProducto nuevoProducto) {
		this.gestorProductos = new GestorProductos();
		this.nuevoProducto = nuevoProducto;
	}
	
	

	public ControladorProducto(PanelInventario panelInventario) {
		this.gestorProductos = new GestorProductos();
		this.panelInventario = panelInventario;
	}

	

	public NuevoProducto getNuevoProducto() {
		return nuevoProducto;
	}



	public void setNuevoProducto(NuevoProducto nuevoProducto) {
		this.nuevoProducto = nuevoProducto;
	}



	public PanelInventario getPanelInventario() {
		return panelInventario;
	}



	public void setPanelInventario(PanelInventario panelInventario) {
		this.panelInventario = panelInventario;
	}



	public GestorProductos getGestorProductos() {
		return gestorProductos;
	}

	public void setGestorProductos(GestorProductos gestorProductos) {
		this.gestorProductos = gestorProductos;
	}
	
	public ArrayList<String> todasEtiquetas(){
		return this.gestorProductos.getEtiquetas();
	}
	
	public ArrayList<Producto> todosProductos(){
		return this.gestorProductos.getProductos();
	}
	
	public void registroProducto() {
		if(!nuevoProducto.getId().getText().isEmpty() && !nuevoProducto.getNombre().getText().isEmpty() && !nuevoProducto.getDescripcion().getText().isEmpty() && !nuevoProducto.getPrecio().getText().isEmpty() && 
				!nuevoProducto.getCant().getText().isEmpty()) {
			String cprodu = nuevoProducto.getId().getText();
			String nombre = nuevoProducto.getNombre().getText();
			String descrip = nuevoProducto.getDescripcion().getText();
			Double precio = Double.parseDouble(nuevoProducto.getPrecio().getText());
			Integer cantidad = Integer.parseInt(nuevoProducto.getCant().getText());
			String marca = nuevoProducto.getMarca().getText();
			String color = "";
			for (Component comp : nuevoProducto.getColor().getPopupMenu().getComponents()) {
			    if (comp instanceof JCheckBoxMenuItem) {
			        JCheckBoxMenuItem checkBoxMenuItem = (JCheckBoxMenuItem) comp;
			        if (checkBoxMenuItem.isSelected()) {
			            color += checkBoxMenuItem.getText() + "\n";
			        }
			    }
			}
			String talla = "";
			for (Component comp : nuevoProducto.getTalla().getPopupMenu().getComponents()) {
			    if (comp instanceof JCheckBoxMenuItem) {
			        JCheckBoxMenuItem checkBoxMenuItem = (JCheckBoxMenuItem) comp;
			        if (checkBoxMenuItem.isSelected()) {
			        	talla += checkBoxMenuItem.getText() + "\n";
			        }
			    }
			}
			
			
			
			ArrayList<String> eti = new ArrayList<>();
			for(int i = 0 ; i < nuevoProducto.getCantEtiquetas();i++) {
				if(i == 0) {
					eti.add((String) nuevoProducto.getCboxEtiquetas1().getSelectedItem());
				}
				if(i == 1) {
					eti.add((String) nuevoProducto.getCboxEtiquetas2().getSelectedItem());
				}	
				if(i == 2) {
					eti.add((String) nuevoProducto.getCboxEtiquetas3().getSelectedItem());
				}
			}
			Producto producto = new Producto(cprodu, nombre, descrip, precio, cantidad, marca, color, talla, eti);
			try {
				gestorProductos.addProducto(producto);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Parece que hubo un error", "Uy", JOptionPane.ERROR_MESSAGE);
			}
			
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Revisa lo campo y llena todos", "Uy", JOptionPane.ERROR_MESSAGE);
		}
		
		
		
	}
	
	
}
