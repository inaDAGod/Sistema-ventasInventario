package ventasInventario;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class PanelProductoCliente extends JPanel {
	private JTextField txtEtiqueta;
	private JTextField txtEtiqueta2;
	private JTextField txtEtiqueta3;
	private JTextField txPrecio;

	public PanelProductoCliente() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		JLabel lbDescrpcion = new JLabel("Descripción");
		lbDescrpcion.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lbDescrpcion.setBounds(455, 95, 120, 46);
		add(lbDescrpcion);
		
		JLabel foto = new JLabel("New label");
		foto.setIcon(new ImageIcon(PanelProductoCliente.class.getResource("/imagenes/rosa1(1200x800).jpg")));
		foto.setBounds(103, 119, 300, 400);
		add(foto);
		
		ArrayList<Integer> cant= new ArrayList<>();
		ArrayList<String> color= new ArrayList<>();
		cant.add(1); cant.add(2);cant.add(3);
		color.add("negro");color.add("blanco");color.add("cafe");
		
		JComboBox cbxCantidad = new JComboBox();
		cbxCantidad.setBounds(800, 550, 100, 25);
		for (int i = 0; i < cant.size(); i++) {
			cbxCantidad.addItem(cant.get(i));
        }
		
		JButton btnAnadir = new JButton("Añadir al carrito");
		btnAnadir.setBounds(927, 542, 165, 50);
		add(btnAnadir);
		add(cbxCantidad);
		
		JComboBox cbxColor= new JComboBox();
		cbxColor.setBounds(670, 550, 100, 25);
		for (int i = 0; i < color.size(); i++) {
			cbxColor.addItem(color.get(i));
        }
		add(cbxColor);
		
		JTextArea txaDescripcion = new JTextArea();
		txaDescripcion.setEditable(false);
		txaDescripcion.setFont(new Font("Rockwell", Font.PLAIN, 15));
		txaDescripcion.setLineWrap(true);
		txaDescripcion.setWrapStyleWord(true);
		txaDescripcion.setText("gergre ert tre retrtre trtrwe tret rtrewewt tr retre tre tert vtretertet45teqw etreqrewfet  treter gedfdrgre ertwfdre retrtrdfdse trtrwfewe tret rtrfeet tr retre tre tert vtretertet45teqw etreqrewfet  treterewe gergre ert tre retrtre trtrwe tret rtret tr retre tre tert vtretertet45teqw etreqrewfet  treterfwrf");
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
		txaDetalles.setText("gergre ert tre retrtre trtrwe tret rtrewewt tr retre tre tert vtretertet45teqw etreqrewfet  treter gedfdrgre ertwfdre retrtrdfdse trtrwfewe tret rtrfeet tr retre tre tert vtretertet45teqw etreqrewfet  treterewe gergre ert tre retrtre trtrwe tret rtret tr retre tre tert vtretertet45teqw etreqrewfet  treterfwrf");
		txaDetalles.setBackground(new Color(193, 123, 160));
		txaDetalles.setBounds(455, 336, 637, 116);
		add(txaDetalles);
		
		JLabel lbProducto = new JLabel("Nombre del producto");
		lbProducto.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		lbProducto.setBounds(56, 38, 752, 46);
		add(lbProducto);
		
		txtEtiqueta = new JTextField();
		txtEtiqueta.setEditable(false);
		txtEtiqueta.setBackground(new Color(180, 167, 213));
		txtEtiqueta.setText("Etiqueta");
		txtEtiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtEtiqueta.setBounds(455, 479, 100, 40);
		add(txtEtiqueta);
		txtEtiqueta.setColumns(10);
		
		txtEtiqueta2 = new JTextField();
		txtEtiqueta2.setEditable(false);
		txtEtiqueta2.setText("Etiqueta2");
		txtEtiqueta2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtEtiqueta2.setColumns(10);
		txtEtiqueta2.setBackground(new Color(162, 195, 200));
		txtEtiqueta2.setBounds(582, 479, 100, 40);
		add(txtEtiqueta2);
		
		txtEtiqueta3 = new JTextField();
		txtEtiqueta3.setEditable(false);
		txtEtiqueta3.setHorizontalAlignment(SwingConstants.LEFT);
		txtEtiqueta3.setText("Etiqueta3");
		txtEtiqueta3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtEtiqueta3.setColumns(10);
		txtEtiqueta3.setBackground(new Color(255, 229, 154));
		txtEtiqueta3.setBounds(708, 479, 100, 40);
		add(txtEtiqueta3);
		
		txPrecio = new JTextField();
		txPrecio.setEditable(false);
		txPrecio.setText("Bs. precio");
		txPrecio.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txPrecio.setColumns(10);
		txPrecio.setBackground(new Color(255, 229, 154));
		txPrecio.setBounds(103, 550, 132, 47);
		add(txPrecio);
		
		JButton btnFavorito = new JButton("<3");
		btnFavorito.setBounds(1042, 38, 50, 50);
		add(btnFavorito);
	}
}
