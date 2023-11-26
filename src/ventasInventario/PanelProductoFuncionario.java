package ventasInventario;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelProductoFuncionario extends JPanel {
	JTextField txtEtiqueta, txtEtiqueta2, txtEtiqueta3, txPrecio;
	JComboBox<String> comboBoxEtiquetas,cboxEtiquetas2,cboxEtiquetas3;
	JButton btnMas, btnGuardar,btnSubirFoto;
	JTextArea txaDescripcion,txaDetalles;
	boolean modoEditar=false;
	public PanelProductoFuncionario() {
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
		
		
		txaDescripcion = new JTextArea();
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
		
		txaDetalles = new JTextArea();
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
		
		JButton btnEditar = new JButton("Editar campos");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				habilitarModoEdicion();
			}
		});
		btnEditar.setBounds(927, 38, 165, 50);
		add(btnEditar);
		
		JButton btnOfertar = new JButton("Ofertar");
		btnOfertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ofertar ventanaOfertar = new Ofertar();
			    ventanaOfertar.setVisible(true);
			}
		});
		btnOfertar.setBounds(927, 552, 165, 50);
		add(btnOfertar);
		
	}
	
	private void habilitarModoEdicion() {
        btnSubirFoto = new JButton("Subir foto");
        btnSubirFoto.setBounds(314, 530, 89, 23);
        add(btnSubirFoto);
        btnSubirFoto.setVisible(true);
        btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deshabilitarModoEdicion();
            }
        });
        btnGuardar.setBounds(729, 552, 165, 50);
        add(btnGuardar);
        btnGuardar.setVisible(true);
        
        txtEtiqueta.setVisible(false);
        txtEtiqueta2.setVisible(false);
        txtEtiqueta3.setVisible(false);

        comboBoxEtiquetas = new JComboBox<>();
        comboBoxEtiquetas.setBounds(470, 490, 100, 25);
        add(comboBoxEtiquetas);
        comboBoxEtiquetas.addItem("item1");
        comboBoxEtiquetas.addItem("item2");
        comboBoxEtiquetas.addItem("item3");
        comboBoxEtiquetas.addItem("item4");

        btnMas = new JButton("+");
        btnMas.setBounds(1000, 490, 80, 30);
        btnMas.addActionListener(new ActionListener() {
            int c = 1;

            public void actionPerformed(ActionEvent e) {
                if (c == 1) {
                    cboxEtiquetas2 = new JComboBox<>();
                    cboxEtiquetas2.setBounds(575, 490, 100, 25);
                    add(cboxEtiquetas2);
                    cboxEtiquetas2.addItem("item1");
                    cboxEtiquetas2.addItem("item2");
                    cboxEtiquetas2.addItem("item3");
                    cboxEtiquetas2.addItem("item4");
                }
                if (c == 2) {
                    cboxEtiquetas3 = new JComboBox<>();
                    cboxEtiquetas3.setBounds(680, 490, 100, 25);
                    add(cboxEtiquetas3);
                    cboxEtiquetas3.addItem("item1");
                    cboxEtiquetas3.addItem("item2");
                    cboxEtiquetas3.addItem("item3");
                    cboxEtiquetas3.addItem("item4");
                }
                if (c >= 3) {
                    JOptionPane.showMessageDialog(null, "Solo se pueden añadir 3 etiquetas.");
                }
                c++;
            }
        });
        add(btnMas);
        revalidate();
        repaint();
        
    }
    private void deshabilitarModoEdicion() {
    	txaDescripcion.setEditable(false);
		txaDetalles.setEditable(false);
		txtEtiqueta.setEditable(false);
		txtEtiqueta2.setEditable(false);
		txtEtiqueta3.setEditable(false);
		txPrecio.setEditable(false);
		
		txtEtiqueta.setVisible(true);
        txtEtiqueta2.setVisible(true);
        txtEtiqueta3.setVisible(true);
		
		btnMas.setVisible(false);
		remove(btnMas);
		btnSubirFoto.setVisible(false);
		remove(btnSubirFoto);
        btnMas.setVisible(false);
        remove(btnMas);
        btnSubirFoto.setVisible(false);
        remove(btnSubirFoto);
        btnGuardar.setVisible(false);
		remove(btnGuardar);

        if (comboBoxEtiquetas != null) {
            comboBoxEtiquetas.setVisible(false);
        }
        if (cboxEtiquetas2 != null) {
            cboxEtiquetas2.setVisible(false);
        }
        if (cboxEtiquetas3 != null) {
            cboxEtiquetas3.setVisible(false);
        }
        revalidate();
        repaint();
    }
 
}