package ventasInventario;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import ventasInventario.BD.Controladores.ControladorCarrito;
import ventasInventario.BD.Controladores.ControladorFavorito;
import ventasInventario.BD.Modelo.*;

public class PanelProductoCliente extends JPanel {
	private JTextField txtEtiqueta;
	private JTextField txtEtiqueta2;
	private JTextField txtEtiqueta3;
	private JTextField txPrecio;


	public PanelProductoCliente(Usuario usuario, Producto producto) {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		JLabel lbDescrpcion = new JLabel("Descripción");
		lbDescrpcion.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lbDescrpcion.setBounds(455, 95, 120, 46);
		add(lbDescrpcion);
		
		JLabel foto = new JLabel("New label");
		foto.setIcon(new ImageIcon(producto.getImagenes().get(0)));
		foto.setBounds(103, 119, 300, 400);
		add(foto);
		
		JComboBox cbxCantidad = new JComboBox();
		cbxCantidad.setBounds(800, 550, 100, 25);
		for (int i = 1; i <= producto.getCantidad(); i++) {
			cbxCantidad.addItem(i);
        }
		
		JButton btnAnadir = new JButton("Añadir al carrito");
		btnAnadir.setBounds(927, 542, 165, 50);
		add(btnAnadir);
		add(cbxCantidad); 
		
		JTextArea txaDescripcion = new JTextArea();
		txaDescripcion.setEditable(false);
		txaDescripcion.setFont(new Font("Rockwell", Font.PLAIN, 15));
		txaDescripcion.setLineWrap(true);
		txaDescripcion.setWrapStyleWord(true);
		txaDescripcion.setText(producto.getDescripcion());
		txaDescripcion.setBackground(new Color(193, 123, 160));
		txaDescripcion.setBounds(455, 152, 637, 116);
		add(txaDescripcion);
		
		JLabel lbDetalles = new JLabel("Detalles");
		lbDetalles.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lbDetalles.setBounds(455, 279, 120, 46);
		add(lbDetalles);
		
		JTextArea txaDetalles = new JTextArea();
		txaDetalles.setEditable(false);
		txaDetalles.setFont(new Font("Rockwell", Font.PLAIN, 15));
		txaDetalles.setWrapStyleWord(true);
		txaDetalles.setLineWrap(true);
		txaDetalles.setText("Marca: " + producto.getMarca() +"\nColores: " + producto.getColor() + "\n Tallas:" + producto.getTalla());
		
		txaDetalles.setBackground(new Color(193, 123, 160));
		txaDetalles.setBounds(455, 336, 637, 116);
		add(txaDetalles);
		
		JLabel lbProducto = new JLabel(producto.getNombre());
		lbProducto.setFont(new Font("Times New Roman", Font.PLAIN, 45));
		lbProducto.setBounds(56, 38, 752, 46);
		add(lbProducto);
		
		
		for(int i = 0; i < producto.getEtiquetas().size(); i++) {
			if(i == 0) {
				txtEtiqueta = new JTextField();
				txtEtiqueta.setEditable(false);
				txtEtiqueta.setBackground(new Color(180, 167, 213));
				txtEtiqueta.setText(producto.getEtiquetas().get(i));
				txtEtiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
				txtEtiqueta.setBounds(455, 479, 100, 40);
				add(txtEtiqueta);
				txtEtiqueta.setColumns(10);
			}
			if(i == 1) {
				txtEtiqueta2 = new JTextField();
				txtEtiqueta2.setEditable(false);
				txtEtiqueta2.setText(producto.getEtiquetas().get(i));
				txtEtiqueta2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
				txtEtiqueta2.setColumns(10);
				txtEtiqueta2.setBackground(new Color(162, 195, 200));
				txtEtiqueta2.setBounds(582, 479, 100, 40);
				add(txtEtiqueta2);
			}
			if(i == 2) {
				txtEtiqueta3 = new JTextField();
				txtEtiqueta3.setEditable(false);
				txtEtiqueta3.setHorizontalAlignment(SwingConstants.LEFT);
				txtEtiqueta3.setText(producto.getEtiquetas().get(i));
				txtEtiqueta3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
				txtEtiqueta3.setColumns(10);
				txtEtiqueta3.setBackground(new Color(255, 229, 154));
				txtEtiqueta3.setBounds(708, 479, 100, 40);
				add(txtEtiqueta3);
			}
			
		}
		
		
		
		
		txPrecio = new JTextField();
		txPrecio.setEditable(false);
		txPrecio.setText(producto.getPrecio() + " Bs.");
		txPrecio.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txPrecio.setColumns(10);
		txPrecio.setBackground(new Color(255, 229, 154));
		txPrecio.setBounds(103, 550, 132, 47);
		add(txPrecio);
		
		JButton btnFavorito = new JButton("<3");
		btnFavorito.setBounds(1042, 38, 50, 50);
		add(btnFavorito);
		btnFavorito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usuario == null) {
					JOptionPane.showMessageDialog(null, "Inicia sesion o registrate !", "Uy", JOptionPane.ERROR_MESSAGE);
				}
				else {
					ControladorFavorito controladorFavorito = new ControladorFavorito(usuario);
					controladorFavorito.anadirFavorito(producto);
				}
				
			}
		});
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usuario == null) {
					JOptionPane.showMessageDialog(null, "Inicia sesion o registrate !", "Uy", JOptionPane.ERROR_MESSAGE);
				}
				else {
					ControladorCarrito controladorCarrito =  new ControladorCarrito(usuario);
					controladorCarrito.anadirACarrito(producto,  Integer.parseInt(cbxCantidad.getSelectedItem().toString()));
				}
			}
		});
	}
}
