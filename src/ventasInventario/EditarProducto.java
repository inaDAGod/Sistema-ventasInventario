package ventasInventario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
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
import ventasInventario.BD.Modelo.Producto;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class EditarProducto extends JFrame {
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
	JLabel imagen;
	
	 private JPanel navegador;
	 private  JPanel SuperiorNavegador;

	public EditarProducto(Producto producto) {
		getContentPane().setLayout(null);
		setSize(1200,800);
		setResizable(false);
		getContentPane().setLayout(null);
		setSize(1200,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		setBackground(new Color(204, 102, 153));
		setBounds(0,0,1200,800);	
		
		navegador = new JPanel();
        navegador.setLayout(new BorderLayout());
        navegador.setBackground(new Color(250, 232, 235));
        navegador.setLayout(null);
        navegador.setBorder(BorderFactory.createLineBorder(Color.black, 2)); 
        navegador.setBounds(880, 0, 320, 800);
        getContentPane().add(navegador);
        navegador.setVisible(false);
        
        SuperiorNavegador = new JPanel();
        SuperiorNavegador.setBackground(new Color(205, 159, 204));
        SuperiorNavegador.setLayout(null);
        SuperiorNavegador.setBounds(0, 0, 350, 100);
        navegador.add(SuperiorNavegador);
        SuperiorNavegador.setVisible(false);
        SuperiorNavegador.setBorder(BorderFactory.createLineBorder(Color.black, 2)); 
        
      //BOTON PERFIL
        JButton btnMiPerfil = new JButton("   Mi perfil");
        btnMiPerfil.setBounds(40, 20, 300, 70);
        btnMiPerfil.setLayout(new BorderLayout());
        btnMiPerfil.setBorder(BorderFactory.createLineBorder(Color.black, 0)); 
        btnMiPerfil.setVisible(true);
        SuperiorNavegador.add(btnMiPerfil);
        btnMiPerfil.setBackground(new Color(205, 159, 204));
        btnMiPerfil.setForeground(Color.WHITE);
        btnMiPerfil.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        ImageIcon iconProducto7= new ImageIcon("src/imagenesJhess/voluntarioIcon.png");
        ImageIcon iconRedimensionado7 = new ImageIcon( iconProducto7.getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH));
        JLabel labelImagen7 = new JLabel(iconRedimensionado7);
        labelImagen7.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnMiPerfil.add(labelImagen7, BorderLayout.WEST);  // Colocar la imagen a la izquierda
       
      //BOTON añadir productos
        JButton buttonProducto5 = new JButton("    Añadir Producto");
        buttonProducto5.setBounds(25, 120, 300, 70);
        buttonProducto5.setBorder(BorderFactory.createLineBorder(Color.black, 0)); 
        buttonProducto5.setLayout(new BorderLayout());
        buttonProducto5.setBackground(new Color(250, 232, 235));
        buttonProducto5.setVisible(true);
        navegador.add(buttonProducto5);
        buttonProducto5.setForeground(Color.BLACK);
        buttonProducto5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        ImageIcon iconProducto2 = new ImageIcon("src/imagenesJhess/aProducto.png");
        Image imagenOriginal2 = iconProducto2.getImage().getScaledInstance(80, 70, Image.SCALE_SMOOTH);
        ImageIcon iconRedimensionado2 = new ImageIcon(imagenOriginal2);
        JLabel labelImagen2 = new JLabel(iconRedimensionado2);
        labelImagen2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
        buttonProducto5.add(labelImagen2, BorderLayout.WEST);  // Colocar la imagen a la izquierda
        
        
      //BOTON añadir funcionario
        JButton buttonMisPedidos = new JButton("    Añadir funcionario");
        buttonMisPedidos.setBounds(25, 220, 300, 70);
        buttonMisPedidos.setLayout(new BorderLayout());
        buttonMisPedidos.setVisible(true);
        buttonMisPedidos.setBackground(new Color(250, 232, 235));
        buttonMisPedidos.setBorder(BorderFactory.createLineBorder(Color.black, 0)); 
        buttonMisPedidos.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        buttonMisPedidos.setForeground(Color.BLACK);
        navegador.add(buttonMisPedidos);
        ImageIcon iconProducto21 = new ImageIcon("src/imagenesJhess/aFuncionario.png");
        Image imagenOriginal21 = iconProducto21.getImage().getScaledInstance(80, 70, Image.SCALE_SMOOTH);
        ImageIcon iconRedimensionado21 = new ImageIcon(imagenOriginal21);
        JLabel labelImagen21 = new JLabel(iconRedimensionado21);
        labelImagen21.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
        buttonMisPedidos.add(labelImagen21, BorderLayout.WEST);  // Colocar la imagen a la izquierda
        
      //BOTON MIS listado de clientes
        JButton buttonListado = new JButton("      Listado de clientes");
        buttonListado.setBounds(25, 320, 300, 70);
        buttonListado.setLayout(new BorderLayout());
        buttonListado.setVisible(true);
        buttonListado.setBackground(new Color(250, 232, 235));
        buttonListado.setBorder(BorderFactory.createLineBorder(Color.black, 0)); 
        buttonListado.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        buttonListado.setForeground(Color.BLACK);
        navegador.add(buttonListado);
        ImageIcon iconProducto218 = new ImageIcon("src/imagenesJhess/listaCliente.png");
        Image imagenOriginal218 = iconProducto218.getImage().getScaledInstance(80, 70, Image.SCALE_SMOOTH);
        ImageIcon iconRedimensionado218 = new ImageIcon(imagenOriginal218);
        JLabel labelImagen218 = new JLabel(iconRedimensionado218);
        labelImagen21.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
        buttonListado.add(labelImagen218, BorderLayout.WEST);  // Colocar la imagen a la izquierda
        
       
        //BOTON todos los pedidos
        JButton buttonAjustes = new JButton("     Todos los pedidos");
        buttonAjustes.setBounds(25, 420, 300, 70);
        buttonAjustes.setLayout(new BorderLayout());
        buttonAjustes.setVisible(true);
        navegador.add(buttonAjustes);
        buttonAjustes.setBackground(new Color(250, 232, 235));
        buttonAjustes.setBorder(BorderFactory.createLineBorder(Color.black, 0)); 
        buttonAjustes.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        buttonAjustes.setForeground(Color.BLACK);
        ImageIcon iconProducto0 = new ImageIcon("src/imagenesJhess/todosPedidos.png");
        Image imagenOriginal0 = iconProducto0.getImage().getScaledInstance(80, 70, Image.SCALE_SMOOTH);
        ImageIcon iconRedimensionado0 = new ImageIcon(imagenOriginal0);
        JLabel labelImagen0 = new JLabel(iconRedimensionado0);
        labelImagen21.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
        buttonAjustes.add(labelImagen0, BorderLayout.WEST);  // Colocar la imagen a la izquierda
        
        //BOTON ESTADISTICAS
        JButton buttonEstadisticas = new JButton("Estadisticas");
        buttonEstadisticas.setBounds(25, 520, 300, 70);
        buttonEstadisticas.setLayout(new BorderLayout());
        buttonEstadisticas.setVisible(true);
        buttonEstadisticas.setBackground(new Color(250, 232, 235));
        buttonEstadisticas.setBorder(BorderFactory.createLineBorder(Color.black, 0)); 
        buttonEstadisticas.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        buttonEstadisticas.setForeground(Color.BLACK);
        navegador.add(buttonEstadisticas);
        ImageIcon iconProducto25 = new ImageIcon("src/imagenesJhess/estaditicas.png");
        Image imagenOriginal25 = iconProducto25.getImage().getScaledInstance(80, 70, Image.SCALE_SMOOTH);
        ImageIcon iconRedimensionado25 = new ImageIcon(imagenOriginal25);
        JLabel labelImagen25 = new JLabel(iconRedimensionado25);
        labelImagen21.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
        buttonEstadisticas.add(labelImagen25, BorderLayout.WEST);  // Colocar la imagen a la izquierda
        
        //BOTON MIS CERRAR SESION
        JButton buttonCerrar = new JButton("Cerrar sesion");
        buttonCerrar.setBounds(25, 620, 300, 70);
        buttonCerrar.setLayout(new BorderLayout());
        buttonCerrar.setVisible(true);
        buttonCerrar.setBackground(new Color(250, 232, 235));
        buttonCerrar.setBorder(BorderFactory.createLineBorder(Color.black, 0)); 
        buttonCerrar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        buttonCerrar.setForeground(Color.BLACK);
        navegador.add(buttonCerrar);
        ImageIcon iconProducto215 = new ImageIcon("src/imagenesJhess/salir.png");
        Image imagenOriginal215 = iconProducto215.getImage().getScaledInstance(80, 70, Image.SCALE_SMOOTH);
        ImageIcon iconRedimensionado215 = new ImageIcon(imagenOriginal215);
        JLabel labelImagen215 = new JLabel(iconRedimensionado215);
        labelImagen21.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
        buttonCerrar.add(labelImagen215, BorderLayout.WEST);  // Colocar la imagen a la izquierda
        
        
		
		
		JButton btnAnadir = new JButton("Guardar");
		btnAnadir.setBounds(909, 670, 110, 50);
		getContentPane().add(btnAnadir);
		
		JLabel txNombre = new JLabel("Nombre:");
		txNombre.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txNombre.setBounds(474, 268, 111, 40);
		getContentPane().add(txNombre);
		
		nombre = new JTextField();
		nombre.setBackground(SystemColor.menu);
		nombre.setBounds(616, 276, 350, 32);
		getContentPane().add(nombre);
		nombre.setText(producto.getNombre());
		nombre.setColumns(10);
		
		JLabel txPrecio = new JLabel("Precio:");
		txPrecio.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txPrecio.setBounds(495, 225, 111, 40);
		getContentPane().add(txPrecio);
		
		precio = new JTextField();
		precio.setBackground(SystemColor.menu);
		precio.setBounds(616, 233, 350, 32);
		getContentPane().add(precio);
		precio.setText(Double.toString(producto.getPrecio()));
		precio.setColumns(10);
		
		
		JLabel txtId = new JLabel("ID:");
		txtId.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txtId.setBounds(532, 327, 74, 40);
		getContentPane().add(txtId);
		
		id = new JTextField();
		id.setBackground(SystemColor.menu);
		id.setBounds(616, 327, 350, 32);
		getContentPane().add(id);
		
		id.setText(producto.getCproducto());
		id.setEditable(false);
		id.setColumns(10);
		
		JLabel txMarca = new JLabel("Marca:");
		txMarca.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txMarca.setBounds(495, 371, 90, 40);
		getContentPane().add(txMarca);
		
		marca = new JTextField();
		marca.setBackground(SystemColor.menu);
		marca.setBounds(616, 379, 350, 32);
		marca.setText(producto.getMarca());
		getContentPane().add(marca);
		marca.setColumns(10);
		
		
		JLabel txDescripcion = new JLabel("Descripcion:");
		txDescripcion.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txDescripcion.setBounds(430, 434, 149, 40);
		getContentPane().add(txDescripcion);
		
		descripcion = new JTextArea();
		descripcion.setBackground(SystemColor.menu);
		descripcion.setBounds(616, 433, 350, 88);
		descripcion.setText(producto.getDescripcion());
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
		controladorProducto = new ControladorProducto();
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
		txCantidad.setBounds(468, 549, 120, 40);
		getContentPane().add(txCantidad);
		
		cant= new JTextField();
		cant.setBackground(SystemColor.menu);
		cant.setBounds(616, 548, 66, 32);
		getContentPane().add(cant);
		cant.setText(Integer.toString(producto.getCantidad()));
		cant.setColumns(10);
		
		
		imagen = new JLabel("New label");
		imagen.setIcon(new ImageIcon(NuevoProducto.class.getResource("/imagenes/blanco(1200x800).jpg")));
		imagen.setBounds(159, 256, 250, 300);
		getContentPane().add(imagen);
		
		JButton btnSubirFoto = new JButton("-");
		btnSubirFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
		        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos de imagen", "jpg", "jpeg", "png", "gif","jfif"));
		        int seleccion = fileChooser.showOpenDialog(null);        
		        if (seleccion == JFileChooser.APPROVE_OPTION) {
		            ruta = fileChooser.getSelectedFile().getPath();
		            ImageIcon imageIcon = new ImageIcon(new ImageIcon(ruta).getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT));
		            imagen.setIcon(imageIcon);
		        }	
			}
		});
		btnSubirFoto.setBounds(159, 567, 50, 50);
		getContentPane().add(btnSubirFoto);
		
		
		JLabel txNProducto = new JLabel("EDITAR");
		txNProducto.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		txNProducto.setBounds(147, 164, 546, 50);
		getContentPane().add(txNProducto);
		
		//barra Superior
		
		JButton btnUsuario = new JButton("");
		btnUsuario.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		SuperiorNavegador.setVisible(true);
	        		navegador.setVisible(true);
	        		btnUsuario.setVisible(false);
	        	}
	        });
		btnUsuario.setIcon(new ImageIcon(EditarProducto.class.getResource("/imagenes/perfil(100x100(.jpg")));
		btnUsuario.setBounds(1000, 10, 100, 100);
		btnUsuario.setHorizontalTextPosition(SwingConstants.CENTER);
		getContentPane().add(btnUsuario);
		
        
        JButton btnBack = new JButton("");
        btnBack.setIcon(new ImageIcon(NuevoProducto.class.getResource("/imagenes/backrosa2(50x50).jpg")));
        btnBack.setBounds(1124, 35, 50, 50);
        btnBack.setHorizontalTextPosition(SwingConstants.CENTER);
        getContentPane().add(btnBack);
        
        btnUsuario.setIcon(new ImageIcon(Carrito.class.getResource("/imagenes/user(100x100).jpg")));
        btnUsuario.setHorizontalTextPosition(SwingConstants.CENTER);
		btnUsuario.setBounds(1000, 10, 100, 100);
		getContentPane().add(btnUsuario);
		
		JButton btnLogo = new JButton("");
        btnLogo.setIcon(new ImageIcon(Carrito.class.getResource("/imagenes/logo.jpg")));
        btnLogo.setHorizontalTextPosition(SwingConstants.CENTER);
        btnLogo.setBounds(42, 10, 200, 100);
        getContentPane().add(btnLogo);
        
        JButton btnInicio = new JButton("Inicio");
		btnInicio.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		btnInicio.setBackground(new Color(220, 100, 150));
		btnInicio.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnInicio.setForeground(Color.WHITE);
		btnInicio.setBounds(330, 44, 125, 36);
		getContentPane().add(btnInicio);

		JButton btnProductos = new JButton("Inventario");
		btnProductos.setBackground(new Color(220, 100, 150));
		btnProductos.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		btnProductos.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnProductos.setForeground(Color.WHITE);
		btnProductos.setBounds(454, 44, 125, 36);
		getContentPane().add(btnProductos);

		JButton btnOferta = new JButton("Pedidos actuales");
		btnOferta.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		btnOferta.setBackground(new Color(220, 100, 150));
		btnOferta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnOferta.setForeground(Color.WHITE);
		btnOferta.setBounds(578, 44, 160, 36);
		getContentPane().add(btnOferta);

		JButton btnSobreNea = new JButton("Quienes somos?");
		btnSobreNea.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		btnSobreNea.setBackground(new Color(220, 100, 150));
		btnSobreNea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnSobreNea.setForeground(Color.WHITE);
		btnSobreNea.setBounds(738, 44, 140, 36);
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
				ControladorProducto control = new ControladorProducto(EditarProducto.this);
				control.editarProducto();
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
