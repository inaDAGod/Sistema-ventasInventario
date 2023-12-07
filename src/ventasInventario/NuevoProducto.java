package ventasInventario;

import java.awt.BorderLayout;
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
import javax.swing.filechooser.FileNameExtensionFilter;

import ventasInventario.BD.Controladores.ControladorProducto;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class NuevoProducto extends JFrame {
	private JTextField nombre,producto, marca, id,  cant,precio;
	private JMenu color,talla;
	private JMenuBar detalles;
	private ArrayList <String> etiquetas;
	private ControladorProducto controladorProducto;
	private JTextArea descripcion;
	private JComboBox cboxEtiquetas1;
	private JComboBox cboxEtiquetas2;
	private JComboBox cboxEtiquetas3;
	private Integer cantEtiquetas;
	String ruta;
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
		getContentPane().setLayout(null);
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
		
		JLabel txPrecio = new JLabel("Precio:");
		txPrecio.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txPrecio.setBounds(166, 635, 83, 32);
		getContentPane().add(txPrecio);
		
		precio = new JTextField();
		precio.setBackground(SystemColor.menu);
		precio.setBounds(260, 637, 149, 32);
		getContentPane().add(precio);
		precio.setColumns(10);
		
		
		JLabel txtId = new JLabel("ID:");
		txtId.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txtId.setBounds(510, 307, 74, 40);
		getContentPane().add(txtId);
		
		id = new JTextField();
		id.setBackground(SystemColor.menu);
		id.setBounds(616, 312, 350, 32);
		getContentPane().add(id);
		id.setColumns(10);
		
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
		txDescripcion.setBounds(430, 446, 149, 40);
		getContentPane().add(txDescripcion);
		
		descripcion = new JTextArea();
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
		getContentPane().add(detalles);
		
		
		
	
		
		JLabel txEtiquetas = new JLabel("Etiquetas:");
		txEtiquetas.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txEtiquetas.setBounds(459, 613, 120, 40);
		getContentPane().add(txEtiquetas);
		int x=620,y=615;
		cboxEtiquetas1 = new JComboBox();
		cboxEtiquetas2 = new JComboBox();
		cboxEtiquetas3 = new JComboBox();
		cboxEtiquetas1.setBounds(x, y, 100, 25);
		getContentPane().add(cboxEtiquetas1);
		controladorProducto = new ControladorProducto(NuevoProducto.this);
		etiquetas = controladorProducto.todasEtiquetas();
		for(String eti: etiquetas) {
			cboxEtiquetas1.addItem(eti);
		}
		cantEtiquetas=1;
		JButton btnMas = new JButton("+");
		btnMas.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(cantEtiquetas==1) {
					
					cboxEtiquetas2.setBounds(x+105, y, 100, 25);
					getContentPane().add(cboxEtiquetas2);
					for(String eti: etiquetas) {
						cboxEtiquetas2.addItem(eti);
					}
				}
				if(cantEtiquetas==2) {
					
					cboxEtiquetas3.setBounds(x+210, y, 100, 25);
					getContentPane().add(cboxEtiquetas3);
					for(String eti: etiquetas) {
						cboxEtiquetas3.addItem(eti);
					}
				}
				if(cantEtiquetas>=3) {
					JOptionPane.showMessageDialog(null,"Solo se pueden añadir 3 etiquetas.");
				}
				cantEtiquetas++;
			}
		});
		btnMas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnMas.setBounds(967, 627, 40, 23);
		getContentPane().add(btnMas);
		
		JLabel txCantidad = new JLabel("Cantidad:");
		txCantidad.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txCantidad.setBounds(468, 540, 120, 40);
		getContentPane().add(txCantidad);
		
		cant= new JTextField();
		cant.setBackground(SystemColor.menu);
		cant.setBounds(616, 545, 66, 32);
		getContentPane().add(cant);
		cant.setColumns(10);
		
		
		JLabel imagen = new JLabel("New label");
		imagen.setIcon(new ImageIcon(NuevoProducto.class.getResource("/imagenes/blanco(1200x800).jpg")));
		imagen.setBounds(159, 256, 250, 300);
		getContentPane().add(imagen);
		
		JButton btnSubirFoto = new JButton("-");
		btnSubirFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
		        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos de imagen", "jpg", "jpeg", "png", "gif"));
		        
		        int seleccion = fileChooser.showOpenDialog(null);
		        
		        if (seleccion == JFileChooser.APPROVE_OPTION) {
		            // Obtiene la ruta del archivo seleccionado
		            ruta = fileChooser.getSelectedFile().getPath();
		            
		            // Actualiza la imagen en el JLabel 'foto'
		            imagen.setIcon(new ImageIcon(ruta));
		        }
			}
		});
		btnSubirFoto.setBounds(343, 567, 66, 32);
		getContentPane().add(btnSubirFoto);
		
		
		JLabel txNProducto = new JLabel("AÑADIR PRODUCTO NUEVO");
		txNProducto.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		txNProducto.setBounds(311, 180, 546, 50);
		getContentPane().add(txNProducto);
		
		//barra Superior
		
		JButton btnUsuario = new JButton("");
		btnUsuario.setIcon(new ImageIcon(NuevoProducto.class.getResource("/imagenes/user(100x100).jpg")));
		btnUsuario.setBounds(1000, 10, 100, 100);
		btnUsuario.setHorizontalTextPosition(SwingConstants.CENTER);
		getContentPane().add(btnUsuario);
		
		JButton btnLogo = new JButton("");
        //btnLogo.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\LogoGris(200x100).jpg"));
        btnLogo.setHorizontalTextPosition(SwingConstants.CENTER);
        btnLogo.setBounds(42, 10, 200, 100);
        getContentPane().add(btnLogo);
        
        JButton btnBack = new JButton("");
        btnBack.setIcon(new ImageIcon(NuevoProducto.class.getResource("/imagenes/backrosa2(50x50).jpg")));
        btnBack.setBounds(1124, 35, 50, 50);
        btnBack.setHorizontalTextPosition(SwingConstants.CENTER);
        getContentPane().add(btnBack);
        
        JButton btnInicio = new JButton("");
        btnInicio.setIcon(new ImageIcon(Inventario.class.getResource("/imagenes/btnInicio(90x50).jpg")));
        btnInicio.setHorizontalTextPosition(SwingConstants.CENTER);
        btnInicio.setBounds(330, 36, 90, 50);
        getContentPane().add(btnInicio);
        
        JButton btnProductos = new JButton("");
        btnProductos.setIcon(new ImageIcon(Inventario.class.getResource("/imagenes/btnProductos(90x50).jpg")));
        btnProductos.setHorizontalTextPosition(SwingConstants.CENTER);
        btnProductos.setBounds(420, 36, 90, 50);
        getContentPane().add(btnProductos);
        
        JButton btnOfertas = new JButton("");
        btnOfertas.setIcon(new ImageIcon(Inventario.class.getResource("/imagenes/btnOfertas(90x50).jpg")));
        btnOfertas.setHorizontalTextPosition(SwingConstants.CENTER);
        btnOfertas.setBounds(510, 36, 90, 50);
        getContentPane().add(btnOfertas);
        
        JButton btnSobreNea = new JButton("");
        btnSobreNea.setIcon(new ImageIcon(Inventario.class.getResource("/imagenes/btnSobreNea(120x50).jpg")));
        btnSobreNea.setHorizontalTextPosition(SwingConstants.CENTER);
        btnSobreNea.setBounds(600, 36, 120, 50);
        getContentPane().add(btnSobreNea);
        
        JLabel crosa = new JLabel("New label");
        crosa.setIcon(new ImageIcon(NuevoProducto.class.getResource("/imagenes/rosa2(1200x800).jpg")));
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
        
        btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controladorProducto.registroProducto();
				
			}
		});
		
	}
	
	public JTextArea getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(JTextArea descripcion) {
		this.descripcion = descripcion;
	}

	public JTextField getNombre() {
		return nombre;
	}

	public void setNombre(JTextField nombre) {
		this.nombre = nombre;
	}
	
	public JTextField getPrecio() {
		return precio;
	}

	public void setPrecio(JTextField precio) {
		this.precio = precio;
	}
	
	public Integer getCantEtiquetas() {
		return cantEtiquetas;
	}

	public void setCantEtiquetas(Integer cantEtiquetas) {
		this.cantEtiquetas = cantEtiquetas;
	}

	public JTextField getProducto() {
		return producto;
	}

	public void setProducto(JTextField producto) {
		this.producto = producto;
	}

	public JTextField getMarca() {
		return marca;
	}

	public void setMarca(JTextField marca) {
		this.marca = marca;
	}

	public JTextField getId() {
		return id;
	}

	public void setId(JTextField id) {
		this.id = id;
	}

	

	public JTextField getCant() {
		return cant;
	}

	public void setCant(JTextField cant) {
		this.cant = cant;
	}

	public JMenu getColor() {
		return color;
	}

	public void setColor(JMenu color) {
		this.color = color;
	}

	public JMenu getTalla() {
		return talla;
	}

	public void setTalla(JMenu talla) {
		this.talla = talla;
	}

	public JMenuBar getDetalles() {
		return detalles;
	}

	public void setDetalles(JMenuBar detalles) {
		this.detalles = detalles;
	}

	

	public ArrayList<String> getEtiquetas() {
		return etiquetas;
	}

	public void setEtiquetas(ArrayList<String> etiquetas) {
		this.etiquetas = etiquetas;
	}

	public ControladorProducto getControladorProducto() {
		return controladorProducto;
	}

	public void setControladorProducto(ControladorProducto controladorProducto) {
		this.controladorProducto = controladorProducto;
	}

	public JComboBox getCboxEtiquetas1() {
		return cboxEtiquetas1;
	}

	public void setCboxEtiquetas1(JComboBox cboxEtiquetas1) {
		this.cboxEtiquetas1 = cboxEtiquetas1;
	}

	public JComboBox getCboxEtiquetas2() {
		return cboxEtiquetas2;
	}

	public void setCboxEtiquetas2(JComboBox cboxEtiquetas2) {
		this.cboxEtiquetas2 = cboxEtiquetas2;
	}

	public JComboBox getCboxEtiquetas3() {
		return cboxEtiquetas3;
	}

	public void setCboxEtiquetas3(JComboBox cboxEtiquetas3) {
		this.cboxEtiquetas3 = cboxEtiquetas3;
	}
	
	
	
	
}
