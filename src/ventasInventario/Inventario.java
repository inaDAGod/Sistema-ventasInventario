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

public class Inventario extends JFrame {
	JPanel contentPane;
	JScrollPane scrollPane;
	JTable tabla;
	PanelInventario pinv= new PanelInventario();
	
	 private JPanel navegador;
	 private  JPanel SuperiorNavegador;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventario frame = new Inventario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Inventario() {
		getContentPane().setBackground(new Color(193, 123, 160));
		setSize(1200,800);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		setSize(1200,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		setBackground(new Color(204, 102, 153));
		setBounds(0,0,1200,800);
		
		//narvar
       
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
        
        
        
        
		//barra superior
		JButton btnUsuario = new JButton("");
		btnUsuario.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		SuperiorNavegador.setVisible(true);
        		navegador.setVisible(true);
        		btnUsuario.setVisible(false);
        	}
        });
		btnUsuario.setIcon(new ImageIcon(Inventario.class.getResource("/imagenes/user(100x100).jpg")));
		btnUsuario.setHorizontalTextPosition(SwingConstants.CENTER);
		btnUsuario.setBounds(1000, 10, 100, 100);
		getContentPane().add(btnUsuario);
		
		JButton btnLogo = new JButton("");
        //btnLogo.setIcon(new ImageIcon(NuevoFuncionario.class.getResource("/imagenes/LogoGris(200x100).jpg")));
        btnLogo.setHorizontalTextPosition(SwingConstants.CENTER);
        btnLogo.setBounds(42, 10, 200, 100);
        getContentPane().add(btnLogo);
        
        JButton btnBack = new JButton("");
        btnBack.setIcon(new ImageIcon(Inventario.class.getResource("/imagenes/backrosa3(50x50).jpg")));
        btnBack.setHorizontalTextPosition(SwingConstants.CENTER);
        btnBack.setBounds(1124, 35, 50, 50);
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
        
        
        scrollPane= new JScrollPane();
        scrollPane.setBounds(0,120,1185,640);
        getContentPane().add(scrollPane);
        
        scrollPane.setViewportView(pinv);
	}

}
