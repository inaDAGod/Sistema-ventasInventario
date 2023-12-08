package ventanasCliente;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import general.InicioGeneral;
import general.generalOfertas;
import ventasInventario.Favoritos;
import ventasInventario.BD.Modelo.Usuario;

import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.SystemColor;

public class clienteSobreNea extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JPanel navegador;
	private JPanel SuperiorNavegador;
	private JButton btnOferta_2;
	private Usuario usuario;
    /**
     * Launch the application.
     */
	/*
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Usuario u = new Usuario("danialee14");
                    clienteSobreNea frame = new clienteSobreNea(u);
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
    public clienteSobreNea(Usuario u) {
    	this.usuario = u;
    	//System.out.println(usuario);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1200, 800); 
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1200, 800);
        contentPane.add(panel);
        panel.setLayout(null);
      //*======================================INICIO DE PANNEL
      		
      		// NARVAR DE UN LADO AL APRETAR EL PERFIL

      		navegador = new JPanel();
      		navegador.setLayout(new BorderLayout());
      		navegador.setBackground(new Color(250, 232, 235));
      		navegador.setLayout(null);
      		navegador.setBorder(BorderFactory.createLineBorder(Color.black, 2));
      		navegador.setBounds(850, 0, 350, 800);
      		panel.add(navegador);
      		navegador.setVisible(false);

      		SuperiorNavegador = new JPanel();
      		SuperiorNavegador.setBackground(new Color(205, 159, 204));
      		SuperiorNavegador.setLayout(null);
      		SuperiorNavegador.setBounds(0, 0, 350, 100);
      		navegador.add(SuperiorNavegador);
      		SuperiorNavegador.setVisible(false);
      		SuperiorNavegador.setBorder(BorderFactory.createLineBorder(Color.black, 2));

      		// BOTON PERFIL
      		JButton btnUsuario = new JButton("   Mi perfil");
      		btnUsuario.setBounds(40, 20, 300, 70);
      		btnUsuario.setLayout(new BorderLayout());
      		btnUsuario.setBorder(BorderFactory.createLineBorder(Color.black, 0));
      		btnUsuario.setVisible(true);
      		btnUsuario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					perfilUsuario frame = new perfilUsuario(usuario);
	                frame.setVisible(true);
					setVisible(false);
				}
			});
      		SuperiorNavegador.add(btnUsuario);
      		btnUsuario.setBackground(new Color(205, 159, 204));
      		btnUsuario.setForeground(Color.WHITE);
      		btnUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 20));
      		ImageIcon iconProducto7 = new ImageIcon("src/imagenesJhess/voluntarioIcon.png");
      		ImageIcon iconRedimensionado7 = new ImageIcon(
      				iconProducto7.getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH));
      		JLabel labelImagen7 = new JLabel(iconRedimensionado7);
      		labelImagen7.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      		btnUsuario.add(labelImagen7, BorderLayout.WEST); // Colocar la imagen a la izquierda

      		// BOTON mIS FAVORITOS
      		JButton buttonProducto5 = new JButton("  Mis Favoritos");
      		buttonProducto5.setBounds(25, 120, 300, 70);
      		buttonProducto5.setBorder(BorderFactory.createLineBorder(Color.black, 0));
      		buttonProducto5.setLayout(new BorderLayout());
      		buttonProducto5.setBackground(new Color(250, 232, 235));
      		buttonProducto5.setVisible(true);
      		buttonProducto5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Favoritos frame = new Favoritos(usuario);
					frame.setVisible(true);
					setVisible(false);
				}
			});
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
      		buttonMisPedidos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					clientePedido frame = new clientePedido(usuario);
	                frame.setVisible(true);
					setVisible(false);
				}
			});
      		buttonMisPedidos.setBackground(new Color(250, 232, 235));
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
      		buttonCerrar.setBackground(new Color(250, 232, 235));
      		buttonCerrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					InicioGeneral frame = new InicioGeneral();
					frame.setVisible(true);
					setVisible(false);
				}
			});
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

      		// FIONNN
      		JPanel panel_1 = new JPanel();
      		panel_1.setBackground(new Color(117, 14, 73));
      		panel_1.setBounds(2, 0, 1190, 136);
      		panel.add(panel_1);
      		panel_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));

      		panel_1.setLayout(null);

      		JLabel lblNewLabel = new JLabel("");
      		ImageIcon icon = new ImageIcon(
      				"src\\imagenes\\logo.jpg");

      		Image image = icon.getImage().getScaledInstance(190, 100, Image.SCALE_SMOOTH);
      		lblNewLabel.setIcon(new ImageIcon(image));
      		lblNewLabel.setBorder(BorderFactory.createLineBorder(Color.black, 1));
      		lblNewLabel.setBounds(24, 11, 190, 100);
      		panel_1.add(lblNewLabel);

      		JButton btnNewButton = new JButton("Inicio");
      		btnNewButton.setBorder(BorderFactory.createLineBorder(Color.black, 1));
      		btnNewButton.setBackground(new Color(220, 100, 150));
      		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
      		btnNewButton.setForeground(Color.WHITE);
      		btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					clienteInicio frame = new clienteInicio(u);
					frame.setVisible(true);
					setVisible(false);
				}
			});
      		btnNewButton.setBounds(330, 44, 125, 36);
      		
      		panel_1.add(btnNewButton);

      		JButton btnOferta = new JButton("Productos");
      		btnOferta.setBackground(new Color(220, 100, 150));
      		btnOferta.setBorder(BorderFactory.createLineBorder(Color.black, 1));
      		btnOferta.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				clienteCatalogo frame = new clienteCatalogo(usuario);
    				frame.setVisible(true);
    				setVisible(false);
    			}
    		});
      		btnOferta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
      		btnOferta.setForeground(Color.WHITE);
      		btnOferta.setBounds(454, 44, 125, 36);
      		panel_1.add(btnOferta);

      		JButton btnOferta_1_1 = new JButton("Oferta");
      		btnOferta_1_1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
      		btnOferta_1_1.setBackground(new Color(220, 100, 150));
      		btnOferta_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
      		btnOferta_1_1.setForeground(Color.WHITE);
      		btnOferta_1_1.setBounds(578, 44, 120, 36);
      		btnOferta_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					clienteOfertas frame = new clienteOfertas(usuario);
	                frame.setVisible(true);
	                setVisible(false);
				}
			});
      		panel_1.add(btnOferta_1_1);

      		JButton btnOferta_1 = new JButton("Quienes somos?");
      		btnOferta_1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
      		btnOferta_1.setBackground(new Color(220, 100, 150));
      
      		btnOferta_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
      		btnOferta_1.setForeground(Color.WHITE);
      		btnOferta_1.setBounds(698, 44, 140, 36);
      		panel_1.add(btnOferta_1);

      		ImageIcon iconPerfil = new ImageIcon("src/imagenesJhess/perfilpersona.png");
      		Image imagePerfil = iconPerfil.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

      		btnOferta_2 = new JButton("");
      		btnOferta_2.setBorder(BorderFactory.createLineBorder(Color.black, 0));
      		btnOferta_2.setBackground(new Color(117, 14, 73));
      		btnOferta_2.setIcon(new ImageIcon(imagePerfil));
      		btnOferta_2.setBounds(990, 15, 100, 100);
      		panel_1.add(btnOferta_2);

      		JButton btnvolver = new JButton(">");
      		btnvolver.setBorder(BorderFactory.createLineBorder(Color.black, 1));
      		btnvolver.setBackground(new Color(220, 100, 150));
      		btnvolver.setFont(new Font("Times New Roman", Font.PLAIN, 20));
      		btnvolver.setForeground(Color.WHITE);
      		btnvolver.setBounds(1130, 50, 50, 40);
      		panel_1.add(btnvolver);
      		
      		btnOferta_2.addActionListener(new ActionListener() {
      			public void actionPerformed(ActionEvent e) {

      				
      				btnvolver.setVisible(false);
      				btnOferta_2.setVisible(false);
      				navegador.setVisible(true);
      				SuperiorNavegador.setVisible(true);
      				btnUsuario.setVisible(true);
      				buttonProducto5.setVisible(true);
      				buttonMisPedidos.setVisible(true);
      				buttonCerrar.setVisible(true);
      			

      			}
      		});
      		
      		//*======================================FIN DE PANNEL

        JPanel panel_2 = new JPanel();
        panel_2.setBounds(0, 137, 1200, 663);
        panel.add(panel_2);
        panel_2.setLayout(null);
        panel_2.setBackground(new Color(239, 222, 230));//CONTENDOR IMAGEN 96

        JPanel panel_3 = new JPanel();
        panel_3.setBounds(0, 5, 595, 647);
        panel_3.setBackground(new Color(239, 222, 230));//CONTENDOR IMAGEN 99
        panel_2.add(panel_3);
        panel_3.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("");
        ImageIcon icon2 = new ImageIcon("src\\imagenesJhess\\personassi.jfif");
        Image image2 = icon2.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        lblNewLabel_2.setIcon(new ImageIcon(image2));
        lblNewLabel_2.setBounds(74, 40, 585, 573);
        panel_3.add(lblNewLabel_2);

        JLabel lblNewLabel_1_1 = new JLabel("Sobre nea");
        lblNewLabel_1_1.setBounds(10, 11, 254, 52);
        lblNewLabel_1_1.setForeground(new Color(112, 76, 94));
        panel_3.add(lblNewLabel_1_1);
        lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 47));

        JPanel panel_3_1 = new JPanel();
        panel_3_1.setBounds(605, 5, 595, 647);
        panel_3_1.setBackground(new Color(241, 200, 219));//CONTENDOR IMAGEN 180
        panel_2.add(panel_3_1);
        panel_3_1.setLayout(null);

        JLabel lblNewLabel_3 = new JLabel("Néa es una empresa que abrió sus puertas en 2021, se dedica a la venta de una amplia variedad de productos cuidadosamente seleccionados de artículos que abarcan accesorios, dermo-cosméticos, cremas, maquillaje, ropa, entre otros productos. ");
        lblNewLabel_3.setBounds(10, 78, 563, 207);
        lblNewLabel_3.setBackground(new Color(0, 0, 0));//CONTENDOR IMAGEN 180
        panel_3_1.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("");
        ImageIcon icon4 = new ImageIcon("src\\imagenesJhess\\ubicacion.JPG");
        Image image4 = icon4.getImage().getScaledInstance(585, 150, Image.SCALE_SMOOTH);
        lblNewLabel_4.setIcon(new ImageIcon(image4));
        lblNewLabel_4.setBounds(20, 420, 555, 182);
        panel_3_1.add(lblNewLabel_4);

        JLabel lblNewLabel_1_1_1 = new JLabel("Contactanos");
        lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNewLabel_1_1_1.setBounds(446, 309, 127, 52);
        panel_3_1.add(lblNewLabel_1_1_1);

        JLabel lblNewLabel_1_1_1_1 = new JLabel("77777761");
        lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNewLabel_1_1_1_1.setBounds(446, 345, 104, 52);
        panel_3_1.add(lblNewLabel_1_1_1_1);

        JLabel lblNewLabel_3_1 = new JLabel("Av....... Calle....");
        lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNewLabel_3_1.setBounds(20, 300, 331, 117);
        panel_3_1.add(lblNewLabel_3_1);

        JLabel lblNewLabel_5 = new JLabel("");
        ImageIcon icon5 = new ImageIcon("src\\imagenesJhess\\icono-de-llamada-telefonica");
        Image image5 = icon5.getImage().getScaledInstance(75, 52, Image.SCALE_SMOOTH);
        lblNewLabel_5.setIcon(new ImageIcon(image5));
        lblNewLabel_5.setBounds(361, 324, 75, 52);
        panel_3_1.add(lblNewLabel_5);

        JLabel lblNewLabel_1_1_2 = new JLabel("¿Donde nos encontramos?");
        lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNewLabel_1_1_2.setBounds(20, 276, 254, 52);
        panel_3_1.add(lblNewLabel_1_1_2);

    }
}