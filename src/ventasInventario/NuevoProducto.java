package ventasInventario;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class NuevoProducto extends JFrame {
	JTextField nombre,producto, marca, tipo, cantidad, cant;
	JMenu color,talla;
	JMenuBar detalles;
	ArrayList <String> colores;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevoProducto frame = new NuevoProducto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NuevoProducto() {
		setLayout(null);
		setSize(1200,800);
		getContentPane().setLayout(null);
		setSize(1200,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		setBackground(new Color(204, 102, 153));
		setBounds(0,0,1200,800);
		
		
		
		
		JButton btnAnadir = new JButton("Añadir producto");
		btnAnadir.setBounds(909, 670, 110, 50);
		getContentPane().add(btnAnadir);
		
		JLabel txNombre = new JLabel("Nombre:");
		txNombre.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txNombre.setBounds(468, 256, 111, 40);
		getContentPane().add(txNombre);
		
		nombre = new JTextField();
		nombre.setBackground(SystemColor.menu);
		nombre.setBounds(616, 266, 350, 32);
		getContentPane().add(nombre);
		nombre.setColumns(10);
		
		
		JLabel txTipo = new JLabel("Tipo:");
		txTipo.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txTipo.setBounds(510, 307, 74, 40);
		getContentPane().add(txTipo);
		
		tipo = new JTextField();
		tipo.setBackground(SystemColor.menu);
		tipo.setBounds(616, 312, 350, 32);
		getContentPane().add(tipo);
		tipo.setColumns(10);
		
		JLabel txMarca = new JLabel("Marca:");
		txMarca.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txMarca.setBounds(489, 358, 90, 40);
		getContentPane().add(txMarca);
		
		marca = new JTextField();
		marca.setBackground(SystemColor.menu);
		marca.setBounds(616, 365, 350, 32);
		getContentPane().add(marca);
		marca.setColumns(10);
		
		
		JLabel txDescripcion = new JLabel("Descripcion:");
		txDescripcion.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txDescripcion.setBounds(430, 415, 149, 40);
		getContentPane().add(txDescripcion);
		
		JTextArea descripcion = new JTextArea();
		descripcion.setBackground(SystemColor.menu);
		descripcion.setBounds(616, 413, 350, 108);
		getContentPane().add(descripcion);
		
		detalles=new JMenuBar();
		detalles.isVisible();
		detalles.setBounds(800, 530, 100, 50);
		
		color= new JMenu("Color");
		JCheckBoxMenuItem ninguno=new JCheckBoxMenuItem("Ninguno");
		JCheckBoxMenuItem negro=new JCheckBoxMenuItem("Negro");
		JCheckBoxMenuItem blanco=new JCheckBoxMenuItem("Blanco");
		JCheckBoxMenuItem gris=new JCheckBoxMenuItem("Gris");
		JCheckBoxMenuItem rosa=new JCheckBoxMenuItem("Rosa");
		JCheckBoxMenuItem cafe=new JCheckBoxMenuItem("cafe");
		JCheckBoxMenuItem azul=new JCheckBoxMenuItem("Azul");
		JCheckBoxMenuItem verde=new JCheckBoxMenuItem("Verde");	
		color.add(negro);
		color.add(blanco);
		color.add(gris);
		color.add(rosa);
		color.add(cafe);
		color.add(azul);
		color.add(verde);
		color.add(ninguno);
		detalles.add(color);
		
		talla= new JMenu("Talla");
		JCheckBoxMenuItem xs=new JCheckBoxMenuItem("XS");
		JCheckBoxMenuItem s=new JCheckBoxMenuItem("S");
		JCheckBoxMenuItem m=new JCheckBoxMenuItem("M");
		JCheckBoxMenuItem l=new JCheckBoxMenuItem("L");
		JCheckBoxMenuItem xl=new JCheckBoxMenuItem("XL");
		JCheckBoxMenuItem ninguna=new JCheckBoxMenuItem("Ninguna");
		talla.add(xs);
		talla.add(s);
		talla.add(m);
		talla.add(l);
		talla.add(xl);
		talla.add(ninguna);
		detalles.add(talla);
		
		add(detalles);
		
		JLabel txEtiquetas = new JLabel("Etiquetas:");
		txEtiquetas.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txEtiquetas.setBounds(459, 613, 120, 40);
		getContentPane().add(txEtiquetas);
		int x=620,y=615;
		JComboBox cboxEtiquetas1 = new JComboBox();
		cboxEtiquetas1.setBounds(x, y, 100, 25);
		getContentPane().add(cboxEtiquetas1);
		cboxEtiquetas1.addItem("item1");
		cboxEtiquetas1.addItem("item2");
		cboxEtiquetas1.addItem("item3");
		cboxEtiquetas1.addItem("item4");
		
		JButton btnMas = new JButton("+");
		btnMas.addActionListener(new ActionListener() {
			int c=1;
			public void actionPerformed(ActionEvent e) {
				if(c==1) {
					JComboBox cboxEtiquetas2 = new JComboBox();
					cboxEtiquetas2.setBounds(x+105, y, 100, 25);
					getContentPane().add(cboxEtiquetas2);
					cboxEtiquetas2.addItem("item1");
					cboxEtiquetas2.addItem("item2");
					cboxEtiquetas2.addItem("item3");
					cboxEtiquetas2.addItem("item4");
				}
				if(c==2) {
					JComboBox cboxEtiquetas3 = new JComboBox();
					cboxEtiquetas3.setBounds(x+210, y, 100, 25);
					getContentPane().add(cboxEtiquetas3);
					cboxEtiquetas3.addItem("item1");
					cboxEtiquetas3.addItem("item2");
					cboxEtiquetas3.addItem("item3");
					cboxEtiquetas3.addItem("item4");
				}
				if(c>=3) {
					JOptionPane.showMessageDialog(null,"Solo se pueden añadir 3 etiquetas.");
				}
				c++;
			}
		});
		btnMas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnMas.setBounds(967, 627, 40, 23);
		getContentPane().add(btnMas);
		
		JLabel txCantidad = new JLabel("Cantidad:");
		txCantidad.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txCantidad.setBounds(464, 529, 120, 40);
		getContentPane().add(txCantidad);
		
		cant= new JTextField();
		cant.setBackground(SystemColor.menu);
		cant.setBounds(616, 532, 66, 32);
		getContentPane().add(cant);
		cant.setColumns(10);
		
		
		JLabel imagen = new JLabel("New label");
		imagen.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\blanco(1200x800).jpg"));
		imagen.setBounds(159, 256, 250, 300);
		getContentPane().add(imagen);
		
		JButton btnSubirFoto = new JButton("-");
		btnSubirFoto.setBounds(159, 567, 50, 50);
		getContentPane().add(btnSubirFoto);
		
		
		JLabel txNProducto = new JLabel("AÑADIR PRODUCTO NUEVO");
		txNProducto.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		txNProducto.setBounds(311, 180, 546, 50);
		getContentPane().add(txNProducto);
		
		//barra Superior
		
		JButton btnUsuario = new JButton("usuario");
		btnUsuario.setBounds(1000, 10, 100, 100);
		getContentPane().add(btnUsuario);
		
		JButton btnLogo = new JButton("");
        btnLogo.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\LogoGris(200x100).jpg"));
        btnLogo.setHorizontalTextPosition(SwingConstants.CENTER);
        btnLogo.setBounds(42, 10, 200, 100);
        getContentPane().add(btnLogo);
        
        JButton btnBack = new JButton(">");
        btnBack.setBounds(1124, 35, 50, 50);
        getContentPane().add(btnBack);
        
        JButton btnInicio = new JButton("Inicio");
        btnInicio.setBounds(330, 36, 90, 50);
        getContentPane().add(btnInicio);
        
        JButton btnProductos = new JButton("Productos");
        btnProductos.setBounds(420, 36, 90, 50);
        getContentPane().add(btnProductos);
        
        JButton btnOfertas = new JButton("Ofertas");
        btnOfertas.setBounds(510, 36, 90, 50);
        getContentPane().add(btnOfertas);
        
        JButton btnSobreNea = new JButton("¿Quiénes somos?");
        btnSobreNea.setBounds(600, 36, 120, 50);
        getContentPane().add(btnSobreNea);
        
        JLabel crosa = new JLabel("New label");
        crosa.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\rosa2(1200x800).jpg"));
        crosa.setBounds(111, 150, 941, 582);
        getContentPane().add(crosa);
        
        JLabel fondobarra = new JLabel("New label");
        fondobarra.setIcon(new ImageIcon(NuevoProducto.class.getResource("/imagenes/rosa2(1200x800).jpg")));
        fondobarra.setBounds(0, 0, 1200, 120);
        getContentPane().add(fondobarra);
        
        JLabel fondo = new JLabel("New label");
        fondo.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\blanco(1200x800).jpg"));
        fondo.setBounds(0, 120, 1200, 680);
        getContentPane().add(fondo);
	}
}
