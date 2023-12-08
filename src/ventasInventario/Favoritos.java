package ventasInventario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import general.InicioGeneral;
import ventanasCliente.clienteCatalogo;
import ventanasCliente.clienteInicio;
import ventanasCliente.clienteOfertas;
import ventanasCliente.clientePedido;
import ventanasCliente.clienteSobreNea;
import ventanasCliente.perfilUsuario;
import ventasInventario.BD.Modelo.Usuario;

public class Favoritos extends JFrame {
	JPanel contentPane;
	JScrollPane scrollPane;
	JTable tabla;
	PanelFavoritos pinv;
	
	private JPanel navegador;
	private JPanel SuperiorNavegador;
	private Usuario usuario;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try { 
					//ejemplo de usuario
					Usuario u = new Usuario("danialee14", null, null, null);
					Favoritos frame = new Favoritos(u);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Favoritos(Usuario u) {
		this.usuario = u;
		navegador = new JPanel();
		navegador.setLayout(new BorderLayout());
		navegador.setBackground(new Color(250, 232, 235));
		navegador.setLayout(null);
		navegador.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		navegador.setBounds(850, 0, 350, 800);
		getContentPane().add(navegador);
		navegador.setVisible(false);

		SuperiorNavegador = new JPanel();
		SuperiorNavegador.setBackground(new Color(205, 159, 204));
		SuperiorNavegador.setLayout(null);
		SuperiorNavegador.setBounds(0, 0, 350, 100);
		navegador.add(SuperiorNavegador);
		SuperiorNavegador.setVisible(false);
		SuperiorNavegador.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		
		JButton btnPerfil = new JButton("   Mi perfil");
 		btnPerfil.setBounds(40, 20, 300, 70);
 		btnPerfil.setLayout(new BorderLayout());
 		btnPerfil.setBorder(BorderFactory.createLineBorder(Color.black, 0));
 		btnPerfil.setVisible(true);
 		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				perfilUsuario frame = new perfilUsuario(usuario);
                frame.setVisible(true);
				setVisible(false);
			}
		});
 		SuperiorNavegador.add(btnPerfil);
 		btnPerfil.setBackground(new Color(205, 159, 204));
 		btnPerfil.setForeground(Color.WHITE);
 		btnPerfil.setFont(new Font("Times New Roman", Font.PLAIN, 20));
 		ImageIcon iconProducto7 = new ImageIcon("src/imagenesJhess/voluntarioIcon.png");
 		ImageIcon iconRedimensionado7 = new ImageIcon(
 				iconProducto7.getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH));
 		JLabel labelImagen7 = new JLabel(iconRedimensionado7);
 		labelImagen7.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
 		btnPerfil.add(labelImagen7, BorderLayout.WEST); // Colocar la imagen a la izquierda

 		// BOTON mIS FAVORITOS
 		JButton buttonProducto5 = new JButton("  Mis Favoritos");
 		buttonProducto5.setBounds(25, 120, 300, 70);
 		buttonProducto5.setBorder(BorderFactory.createLineBorder(Color.black, 0));
 		buttonProducto5.setLayout(new BorderLayout());
 		buttonProducto5.setBackground(new Color(250, 232, 235));
 		buttonProducto5.setVisible(true);
 		navegador.add(buttonProducto5);
 		buttonProducto5.setForeground(Color.BLACK);
 		buttonProducto5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
 		ImageIcon iconProducto2 = new ImageIcon("src/imagenesJhess/favo.png");
 		Image imagenOriginal2 = iconProducto2.getImage().getScaledInstance(80, 70, Image.SCALE_SMOOTH);
 		ImageIcon iconRedimensionado2 = new ImageIcon(imagenOriginal2);
 		JLabel labelImagen2 = new JLabel(iconRedimensionado2);
 		labelImagen2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
 		buttonProducto5.add(labelImagen2, BorderLayout.WEST); // Colocar la imagen a la izquierda

 		// BOTON MIS PEDIDOS
 		JButton buttonMisPedidos = new JButton("Mis Pedidos");
 		buttonMisPedidos.setBounds(25, 220, 300, 70);
 		buttonMisPedidos.setLayout(new BorderLayout());
 		buttonMisPedidos.setVisible(true);
 		buttonMisPedidos.setBackground(new Color(250, 232, 235));
 		buttonMisPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clientePedido frame = new clientePedido(usuario);
                frame.setVisible(true);
				setVisible(false);
			}
		});
 		buttonMisPedidos.setBorder(BorderFactory.createLineBorder(Color.black, 0));
 		buttonMisPedidos.setFont(new Font("Times New Roman", Font.PLAIN, 20));
 		buttonMisPedidos.setForeground(Color.BLACK);
 		navegador.add(buttonMisPedidos);
 		ImageIcon iconProducto21 = new ImageIcon("src/imagenesJhess/pedido.png");
 		Image imagenOriginal21 = iconProducto21.getImage().getScaledInstance(80, 70, Image.SCALE_SMOOTH);
 		ImageIcon iconRedimensionado21 = new ImageIcon(imagenOriginal21);
 		JLabel labelImagen21 = new JLabel(iconRedimensionado21);
 		labelImagen21.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
 		buttonMisPedidos.add(labelImagen21, BorderLayout.WEST); // Colocar la imagen a la izquierda

 		

 		// BOTON MIS CERRAR SESION
 		JButton buttonCerrar = new JButton("Cerrar sesion");
 		buttonCerrar.setBounds(25, 320, 300, 70);
 		buttonCerrar.setLayout(new BorderLayout());
 		buttonCerrar.setVisible(true);
 		buttonCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InicioGeneral frame = new InicioGeneral();
				frame.setVisible(true);
				setVisible(false);
			}
		});
 		buttonCerrar.setBackground(new Color(250, 232, 235));
 		buttonCerrar.setBorder(BorderFactory.createLineBorder(Color.black, 0));
 		buttonCerrar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
 		buttonCerrar.setForeground(Color.BLACK);
 		navegador.add(buttonCerrar);
 		ImageIcon iconProducto8 = new ImageIcon("src/imagenesJhess/salir.png");
 		Image imagenOrigina8 = iconProducto8.getImage().getScaledInstance(80, 70, Image.SCALE_SMOOTH);
 		ImageIcon iconRedimensionado8 = new ImageIcon(imagenOrigina8);
 		JLabel labelImagen8 = new JLabel(iconRedimensionado8);
 		labelImagen8.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
 		buttonCerrar.add(labelImagen8, BorderLayout.WEST); // Colocar la imagen a la izquierda
 		
 		
        
		//barra superior
		JButton btnUsuario = new JButton("");
		btnUsuario.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		SuperiorNavegador.setVisible(true);
        		navegador.setVisible(true);
        		btnUsuario.setVisible(false);
        	}
        });
		btnUsuario.setIcon(new ImageIcon(Favoritos.class.getResource("/imagenes/user(100x100).jpg")));
		btnUsuario.setHorizontalTextPosition(SwingConstants.CENTER);
		btnUsuario.setBounds(1000, 10, 100, 100);
		getContentPane().add(btnUsuario);
        
        JButton btnBack = new JButton("");
        btnBack.setIcon(new ImageIcon(Favoritos.class.getResource("/imagenes/backblanco(50x50).jpg")));
        btnBack.setHorizontalTextPosition(SwingConstants.CENTER);
        btnBack.setBounds(1124, 35, 50, 50);
        getContentPane().add(btnBack);
        
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
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clienteInicio frame = new clienteInicio(u);
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnInicio.setBounds(330, 44, 125, 36);
		getContentPane().add(btnInicio);

		JButton btnProductos = new JButton("Productos");
		btnProductos.setBackground(new Color(220, 100, 150));
		btnProductos.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		btnProductos.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnProductos.setForeground(Color.WHITE);
		btnProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clienteCatalogo frame = new clienteCatalogo(usuario);
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnProductos.setBounds(454, 44, 125, 36);
		getContentPane().add(btnProductos);

		JButton btnOferta = new JButton("Oferta");
		btnOferta.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		btnOferta.setBackground(new Color(220, 100, 150));
		btnOferta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnOferta.setForeground(Color.WHITE);
		btnOferta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clienteOfertas frame = new clienteOfertas(usuario);
                frame.setVisible(true);
                setVisible(false);
			}
		});
		btnOferta.setBounds(578, 44, 120, 36);
		getContentPane().add(btnOferta);

		JButton btnSobreNea = new JButton("Quienes somos?");
		btnSobreNea.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		btnSobreNea.setBackground(new Color(220, 100, 150));
		btnSobreNea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnSobreNea.setForeground(Color.WHITE);
		btnSobreNea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clienteSobreNea frame = new clienteSobreNea(u);
                frame.setVisible(true);
                setVisible(false);
			}
		});
		btnSobreNea.setBounds(698, 44, 140, 36);
		getContentPane().add(btnSobreNea); 
        
        pinv= new PanelFavoritos(usuario);
		getContentPane().setBackground(new Color(255, 255, 255));
		setSize(1200,800);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		setSize(1200,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		setBackground(new Color(204, 102, 153));
		setBounds(0,0,1200,800);
		
		//inventario
		scrollPane= new JScrollPane();
        scrollPane.setBounds(0,120,1185,640);
        getContentPane().add(scrollPane);
        
        scrollPane.setViewportView(pinv);
     
	}

}
