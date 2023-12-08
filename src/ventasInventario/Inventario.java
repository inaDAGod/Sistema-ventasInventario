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
import ventanasFuncionario.funcionarioEstadisticas;
import ventanasFuncionario.funcionarioInicio;
import ventanasFuncionario.funcionarioPedidos;
import ventanasFuncionario.funcionarioPedidosActuales;
import ventanasFuncionario.funcionarioSobreNea;
import ventanasFuncionario.perfilFuncionario;
import ventasInventario.BD.Modelo.Usuario;

public class Inventario extends JFrame {
	JPanel contentPane;
	JScrollPane scrollPane;
	JTable tabla;
	PanelInventario pinv;
	private Usuario usuario;
	 private JPanel navegador;
	 private  JPanel SuperiorNavegador;
	 /*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario u = new Usuario("funci");
					Inventario frame = new Inventario(u);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	public Inventario(Usuario u) {
		this.usuario = u;
		pinv= new PanelInventario(u);
		setResizable(false);
		getContentPane().setBackground(new Color(193, 123, 160));
		setSize(1200,800);
		getContentPane().setLayout(null);
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
        btnMiPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				perfilFuncionario frame = new perfilFuncionario (usuario);
                frame.setVisible(true);
				setVisible(false);
			}
		});
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
        buttonProducto5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevoProducto frame = new NuevoProducto(usuario);
				frame.setVisible(true);
				setVisible(false);
			}
		});
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
        buttonMisPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevoFuncionario frame = new NuevoFuncionario(usuario);
				frame.setVisible(true);
				setVisible(false);
			}
		});
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
        buttonListado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListadoClientes frame = new ListadoClientes(usuario);
				frame.setVisible(true);
				setVisible(false);
			}
		});
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
        buttonAjustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcionarioPedidos frame = new funcionarioPedidos(usuario);
                frame.setVisible(true);
				setVisible(false);
			}
		});
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
        buttonEstadisticas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcionarioEstadisticas frame = new funcionarioEstadisticas(usuario);
				frame.setVisible(true);
				setVisible(false);
			}
		});
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
        ImageIcon iconProducto215 = new ImageIcon("src/imagenesJhess/salir.png");
        Image imagenOriginal215 = iconProducto215.getImage().getScaledInstance(80, 70, Image.SCALE_SMOOTH);
        ImageIcon iconRedimensionado215 = new ImageIcon(imagenOriginal215);
        JLabel labelImagen215 = new JLabel(iconRedimensionado215);
        labelImagen21.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
        buttonCerrar.add(labelImagen215, BorderLayout.WEST);  // Colocar la imagen a la izquierda
        
        
		
		JButton btnUsuario = new JButton("");
		btnUsuario.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		SuperiorNavegador.setVisible(true);
        		navegador.setVisible(true);
        		btnUsuario.setVisible(false);
        	}
        });
		btnUsuario.setIcon(new ImageIcon(NuevoProducto.class.getResource("/imagenes/user(100x100).jpg")));
		btnUsuario.setBounds(1000, 10, 100, 100);
		btnUsuario.setHorizontalTextPosition(SwingConstants.CENTER);
		getContentPane().add(btnUsuario);
		
        
        JButton btnBack = new JButton("");
        btnBack.setIcon(new ImageIcon(NuevoProducto.class.getResource("/imagenes/backrosa2(50x50).jpg")));
        btnBack.setBounds(1124, 35, 50, 50);
        btnBack.setHorizontalTextPosition(SwingConstants.CENTER);
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
				funcionarioInicio frame = new funcionarioInicio(usuario);
                frame.setVisible(true);
				setVisible(false);
			}
		});
		btnInicio.setBounds(330, 44, 125, 36);
		getContentPane().add(btnInicio);

		JButton btnProductos = new JButton("Inventario");
		btnProductos.setBackground(new Color(220, 100, 150));
		btnProductos.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		btnProductos.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnProductos.setForeground(Color.WHITE);
		btnProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inventario frame = new Inventario(usuario);
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnProductos.setBounds(454, 44, 125, 36);
		getContentPane().add(btnProductos);

		JButton btnOferta = new JButton("Pedidos Actuales");
		btnOferta.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		btnOferta.setBackground(new Color(220, 100, 150));
		btnOferta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnOferta.setForeground(Color.WHITE);
		btnOferta.setBounds(578, 44, 120, 36);
		btnOferta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcionarioPedidosActuales frame = new funcionarioPedidosActuales(usuario);
                frame.setVisible(true);
				setVisible(false);
			}
		});
		getContentPane().add(btnOferta);

		JButton btnSobreNea = new JButton("Quienes somos?");
		btnSobreNea.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		btnSobreNea.setBackground(new Color(220, 100, 150));
		btnSobreNea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnSobreNea.setForeground(Color.WHITE);
		btnSobreNea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcionarioSobreNea frame = new funcionarioSobreNea(usuario);
                frame.setVisible(true);
				setVisible(false);
			}
		});
		btnSobreNea.setBounds(698, 44, 140, 36);
		getContentPane().add(btnSobreNea);
            
        
        scrollPane= new JScrollPane();
        scrollPane.setBounds(0,120,1185,640);
        getContentPane().add(scrollPane);
        
        scrollPane.setViewportView(pinv);
	}

}
