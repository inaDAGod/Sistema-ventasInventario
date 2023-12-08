package general;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import ventasInventario.Login;
import ventasInventario.ProductoCliente;
import ventasInventario.BD.Controladores.ControladorProducto;
import ventasInventario.BD.Modelo.Producto;

public class generalProductos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldBuscar;
	private JRadioButton radioBoton1, radioBoton2, radioBoton3, radioBoton3_1;
	private ButtonGroup grupoRadioBotones;
	private JButton botonBuscar, botonBuscar1;
	private JPanel panelTarjetas;
	private JPanel panelBusqueda;
	private JPanel panel_2;

	private ControladorProducto controladorProducto;
	private ArrayList<Producto> productos;
	private ArrayList<String> etiquetas;

	private String textoBusqueda = "";
	private JPanel navegador;
	private JPanel SuperiorNavegador;
	private JButton btnOferta_2;
	private JButton btnvolver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					generalProductos frame = new generalProductos();
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
	public generalProductos() {
		 setResizable(false);
			controladorProducto = new ControladorProducto();
			productos = controladorProducto.todosProductos();
			etiquetas = controladorProducto.todasEtiquetas();

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 1200, 800);
			getContentPane().setLayout(null);

			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 1200, 763);
			getContentPane().add(panel);
			panel.setLayout(null);

			grupoRadioBotones = new ButtonGroup();

			//*======================================INICIO DE PANNEL
			
					// NARVAR DE UN LADO AL APRETAR EL PERFIL
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(Color.white);
			panel_1.setBounds(2, 0, 1180, 137);
			panel.add(panel_1);
			panel_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));

			panel_1.setLayout(null);

			JLabel lblNewLabel = new JLabel("");
			ImageIcon icon = new ImageIcon(
					"src\\imagenes\\logo.jpg");
			Image image = icon.getImage().getScaledInstance(180, 118, Image.SCALE_SMOOTH);
			lblNewLabel.setIcon(new ImageIcon(image));
			lblNewLabel.setBorder(BorderFactory.createLineBorder(Color.black, 1));
			lblNewLabel.setBounds(24, 11, 180, 118);
			panel_1.add(lblNewLabel);

			JButton btnNewButton = new JButton("Inicio");
			btnNewButton.setBorder(BorderFactory.createLineBorder(Color.black, 1));
			btnNewButton.setBackground(new Color(220, 100, 150));
			btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setBounds(250, 44, 125, 36);
			panel_1.add(btnNewButton);
			

			JButton btnOferta = new JButton("Productos");
			btnOferta.setBackground(new Color(220, 100, 150));
			btnOferta.setBorder(BorderFactory.createLineBorder(Color.black, 1));
			btnOferta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnOferta.setForeground(Color.WHITE);
			btnOferta.setBounds(374, 44, 125, 36);
			panel_1.add(btnOferta);

			JButton btnOferta_1_1 = new JButton("Oferta");
			btnOferta_1_1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
			btnOferta_1_1.setBackground(new Color(220, 100, 150));
			btnOferta_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnOferta_1_1.setForeground(Color.WHITE);
			btnOferta_1_1.setBounds(498, 44, 120, 36);
			panel_1.add(btnOferta_1_1);

			JButton btnOferta_1 = new JButton("Quienes somos?");
			btnOferta_1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
			btnOferta_1.setBackground(new Color(220, 100, 150));
			btnOferta_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnOferta_1.setForeground(Color.WHITE);
			btnOferta_1.setBounds(618, 44, 140, 36);
			panel_1.add(btnOferta_1);

			JButton btnvolver = new JButton("Iniciar sesion");
			btnvolver.setBorder(BorderFactory.createLineBorder(Color.black, 1));
			btnvolver.setBackground(new Color(117, 14, 73));
			btnvolver.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnvolver.setForeground(Color.WHITE);
			btnvolver.setBounds(850, 44, 150, 40);
			btnvolver.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Login login = new Login();
					login.setVisible(true);
					setVisible(false);
				}
			});
			panel_1.add(btnvolver);

			JButton btnvolver2 = new JButton("Registrate ahora!");
			btnvolver2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
			btnvolver2.setBackground(new Color(229, 75, 171));
			btnvolver2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnvolver2.setForeground(Color.WHITE);
			btnvolver2.setBounds(1020, 44, 150, 40);
			btnvolver2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Login login = new Login();
					login.setVisible(true);
					setVisible(false);
				}
			});
			panel_1.add(btnvolver2);
					//*======================================FIN DE PANNEL

			JPanel panelBase = new JPanel();
			panelBase.setBounds(0, 137, 1200, 625);
			panelBase.setLayout(null);
			panel.add(panelBase);

			JPanel panel_2 = new JPanel();
			panel_2.setBackground(new Color(214, 166, 190));
			panel_2.setBounds(0, 0, 1190, 625);
			panel_2.setLayout(new BorderLayout()); // Cambiado a un BorderLayout
			panelBase.add(panel_2);

			panelTarjetas = new JPanel();
			panelTarjetas.setLayout(new GridLayout(0, 1, 10, 10)); // Cambié el GridLayout a 1 columna
			panelTarjetas.setBackground(new Color(214, 166, 190)); // Establecer el fondo negro al SCROLLL
			panelTarjetas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0)); // Margen de 10 píxeles para la tarjeta

			JPanel panelTexto5 = new JPanel();

			JLabel lblRopa = new JLabel("Ropa"); // Aquí debes obtener el tipo de producto desde el pedido

			JScrollPane scrollPane = new JScrollPane(panelTarjetas);

			JPanel panelBusqueda = new JPanel();

			panelTarjetas.add(panelBusqueda);
			panelBusqueda.setLayout(null);

			// Componentes del buscador
			textFieldBuscar = new JTextField();

			radioBoton1 = new JRadioButton("Ropa");

			panelBusqueda.add(radioBoton1);

			radioBoton2 = new JRadioButton("Cosmetico");

			radioBoton3 = new JRadioButton("Maquillaje");

			radioBoton3_1 = new JRadioButton("Todo");

			grupoRadioBotones.add(radioBoton1);
			grupoRadioBotones.add(radioBoton2);
			grupoRadioBotones.add(radioBoton3);

			botonBuscar = new JButton("Buscar");

			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPane.setBounds(0, 0, 1190, 500);
			panel_2.add(scrollPane);

			panelTarjetas.add(panelBusqueda, BorderLayout.NORTH);

			JLabel lblNewLabel_1 = new JLabel("Busqueda:");

			JLabel lblNewLabel_2 = new JLabel("CATÁLOGO ");

			JLabel lblNewLabel_1_1 = new JLabel("");

			JLabel lblNewLabel_2_1 = new JLabel("NOVEDADES DE LA TEMPORADA");

			agregarTarjetasPedidos();
			restaurarEstadoOriginal();
			restaurarEstiloRadioButtons();

		}

		private void agregarTarjetasPedidos() {

			for (String eti : etiquetas) {
				TarjetaPedido tarjeta = new TarjetaPedido(eti);

				panelTarjetas.add(tarjeta);
			}

			panelTarjetas.revalidate();
			panelTarjetas.repaint();

		}

		private void filtrarTarjetas() {

			panelTarjetas.removeAll();

			String tipoDetalleSeleccionado = obtenerTipoDetalleSeleccionado();

			JPanel panelBusqueda = new JPanel();
			panelBusqueda.setBackground(new Color(214, 166, 190));///// aquiii cambiar color
			panelBusqueda.setLayout(null);

			textFieldBuscar = new JTextField();
			textFieldBuscar.setBounds(300, 263, 530, 30);
			panelBusqueda.add(textFieldBuscar);

			radioBoton1 = new JRadioButton("Ropa");
			radioBoton1.setBounds(304, 205, 100, 30);
			radioBoton1.setBackground(new Color(214, 166, 190));
			radioBoton1.setFont(new Font("Times New Roman", Font.PLAIN, 15));

			panelBusqueda.add(radioBoton1);

			radioBoton2 = new JRadioButton("Cosmetico");
			radioBoton2.setBounds(495, 205, 100, 30);
			radioBoton2.setBackground(new Color(214, 166, 190));
			radioBoton2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			panelBusqueda.add(radioBoton2);

			radioBoton3 = new JRadioButton("Maquillaje");
			radioBoton3.setBounds(699, 205, 100, 30);
			radioBoton3.setBackground(new Color(214, 166, 190));
			radioBoton3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			panelBusqueda.add(radioBoton3);

			radioBoton3_1 = new JRadioButton("Todo");
			radioBoton3_1.setBounds(861, 205, 100, 30);
			radioBoton3_1.setBackground(new Color(214, 166, 190));
			radioBoton3_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			panelBusqueda.add(radioBoton3_1);

			grupoRadioBotones.add(radioBoton1);
			grupoRadioBotones.add(radioBoton2);
			grupoRadioBotones.add(radioBoton3);
			grupoRadioBotones.add(radioBoton3_1);

			botonBuscar = new JButton("Buscar");
			botonBuscar.setBounds(911, 263, 100, 30);
			botonBuscar.setBackground(new Color(162, 195, 200));
			botonBuscar.setForeground(Color.WHITE);
			botonBuscar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			panelBusqueda.add(botonBuscar);

			JLabel lblNewLabel_1 = new JLabel("Ingrese el nombre del producto: ");
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
			lblNewLabel_1.setBounds(20, 260, 364, 32);
			panelBusqueda.add(lblNewLabel_1);

			JLabel lblNewLabel_2 = new JLabel("CATÁLOGO ");
			lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 60));
			lblNewLabel_2.setBounds(10, 0, 362, 115);
			panelBusqueda.add(lblNewLabel_2);

			JLabel lblNewLabel_1_1 = new JLabel(" ");
			lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblNewLabel_1_1.setBounds(10, 202, 274, 32);
			panelBusqueda.add(lblNewLabel_1_1);

			JLabel lblNewLabel_2_1 = new JLabel("NOVEDADES DE LA TEMPORADA");
			lblNewLabel_2_1.setForeground(Color.white);
			lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 37));
			lblNewLabel_2_1.setBounds(21, 100, 677, 82);
			panelBusqueda.add(lblNewLabel_2_1);

			panelTarjetas.add(panelBusqueda);

			for (String eti : etiquetas) {
				if (eti.equals(tipoDetalleSeleccionado)) {

					TarjetaPedido tarjeta = new TarjetaPedido(eti);
					panelTarjetas.add(tarjeta);

				}
			}

			panelTarjetas.revalidate();
			panelTarjetas.repaint();

			botonBuscar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String nombreBusqueda = textFieldBuscar.getText();
					textoBusqueda = nombreBusqueda;
					buscarPorNombre(nombreBusqueda);
					btnvolver.setVisible(true);
					radioBoton3_1.setVisible(true);
					navegador.setVisible(false);
					SuperiorNavegador.setVisible(false);
					btnOferta_2.setVisible(true);
					botonBuscar.setVisible(true);

				}
			});
			radioBoton1.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						filtrarTarjetas();
						restaurarEstiloRadioButtons();
						
						cambiarEstiloRadioButton(radioBoton1);
						btnvolver.setVisible(true);
						radioBoton3_1.setVisible(true);
						navegador.setVisible(false);
						SuperiorNavegador.setVisible(false);
						btnOferta_2.setVisible(true);
						botonBuscar.setVisible(true);
					}
				}
			});

			radioBoton2.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						filtrarTarjetas();
						restaurarEstiloRadioButtons();
						cambiarEstiloRadioButton(radioBoton2);
						btnvolver.setVisible(true);
						radioBoton3_1.setVisible(true);
						navegador.setVisible(false);
						SuperiorNavegador.setVisible(false);
						btnOferta_2.setVisible(true);
						botonBuscar.setVisible(true);
					}
				}
			});

			radioBoton3.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if (e.getStateChange() == ItemEvent.SELECTED) {

						filtrarTarjetas();
						restaurarEstiloRadioButtons();
						cambiarEstiloRadioButton(radioBoton3);
						btnvolver.setVisible(true);
						radioBoton3_1.setVisible(true);
						navegador.setVisible(false);
						SuperiorNavegador.setVisible(false);
						btnOferta_2.setVisible(true);
						botonBuscar.setVisible(true);
					}
				}
			});
			radioBoton3_1.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if (e.getStateChange() == ItemEvent.SELECTED) {

						restaurarEstadoOriginal();
						restaurarEstiloRadioButtons();
						cambiarEstiloRadioButton(radioBoton3_1);
					}
				}
			});
		}

		private String obtenerTipoDetalleSeleccionado() {
			if (radioBoton1.isSelected()) {
				return "ROPA";
			} else if (radioBoton2.isSelected()) {
				return "COSMETICO";
			} else if (radioBoton3.isSelected()) {
				return "MAQUILLAJE";
			}

			return "";
		}

		private void restaurarEstadoOriginal() {
			panelTarjetas.removeAll();
			filtrarTarjetas();
			agregarTarjetasPedidos();
			panelTarjetas.revalidate();
			panelTarjetas.repaint();
		}

		private void buscarPorNombre(String nombre) {
			filtrarTarjetas();
			TarjetaProducto tarjeta = new TarjetaProducto(nombre);
			panelTarjetas.add(tarjeta);
			textFieldBuscar.setText(textoBusqueda);
			panelTarjetas.revalidate();
			panelTarjetas.repaint();

		}

		private void cambiarEstiloRadioButton(JRadioButton radioButton) {
			radioButton.setForeground(Color.white); // Cambia el color del texto cuando está seleccionado
			// También puedes cambiar otros estilos, por ejemplo:
			// radioButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		}

		// Agrega este método para restaurar el estilo de todos los JRadioButton
		private void restaurarEstiloRadioButtons() {
			radioBoton1.setForeground(Color.BLACK);
			radioBoton2.setForeground(Color.BLACK);
			radioBoton3.setForeground(Color.BLACK);
			radioBoton3_1.setForeground(Color.BLACK);
			// También puedes restaurar otros estilos a su valor original
		}

		public class TarjetaPedido extends JPanel {
			private static final long serialVersionUID = 1L;

			public TarjetaPedido(String etiqueta) {
				setLayout(new BorderLayout());
				setBorder(BorderFactory.createLineBorder(Color.black, 3));

				JPanel panelTexto = new JPanel();
				panelTexto.setBackground(new Color(193, 123, 160));
				panelTexto.setLayout(new BorderLayout());
				add(panelTexto, BorderLayout.NORTH);
				panelTexto.setBorder(BorderFactory.createLineBorder(Color.black, 2));

				// boorras desde aqui pa mas bonito
				JLabel lblRopa = new JLabel(etiqueta);
				lblRopa.setForeground(new Color(0, 0, 0));
				lblRopa.setFont(new Font("Times New Roman", Font.PLAIN, 40));
				lblRopa.setHorizontalAlignment(JLabel.LEFT);

				panelTexto.add(lblRopa, BorderLayout.CENTER);
				add(panelTexto, BorderLayout.NORTH);
				// hasta aqui
				// scroll conde se acumulan los productos por categoria
				JPanel panelTarjetas = new JPanel();
				panelTarjetas.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
				panelTarjetas.setBackground(new Color(239, 222, 230));
				panelTarjetas.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

				for (Producto producto11 : controladorProducto.etiquetaProductos(etiqueta)) {
					JPanel cardPanel = new JPanel();
					cardPanel.setLayout(new BoxLayout(cardPanel, BoxLayout.Y_AXIS));
					cardPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));// borde de cada producto

					JButton buttonProducto = new JButton();
					buttonProducto.setLayout(new GridBagLayout());

					ImageIcon iconProducto = new ImageIcon(producto11.getImagenes().get(0));

					int alturaDeseada = 200;
					int anchuraCalculada = (alturaDeseada * iconProducto.getIconWidth()) / iconProducto.getIconHeight();
					Image imagenOriginal = iconProducto.getImage().getScaledInstance(anchuraCalculada, alturaDeseada,
							Image.SCALE_SMOOTH);

					ImageIcon iconRedimensionado = new ImageIcon(imagenOriginal);
					JLabel labelImagen = new JLabel(iconRedimensionado);
					labelImagen.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));

					GridBagConstraints gbc = new GridBagConstraints();
					gbc.gridx = 0;
					gbc.gridy = 0;
					gbc.fill = GridBagConstraints.HORIZONTAL;
					gbc.weightx = 1.0;
					gbc.weighty = 1.0;
					gbc.anchor = GridBagConstraints.NORTH;

					buttonProducto.add(labelImagen, gbc);

					gbc.gridx = 0;
					gbc.gridy = 1;
					gbc.fill = GridBagConstraints.HORIZONTAL;
					gbc.anchor = GridBagConstraints.SOUTH;

					// JPanel panelDetalles = new JPanel();
					// panelDetalles.setBackground(Color.WHITE);

					// buttonProducto.add(panelDetalles, gbc);
					buttonProducto.setPreferredSize(new Dimension(anchuraCalculada, alturaDeseada));

					Border border = BorderFactory.createLineBorder(Color.black, 1);

					buttonProducto.setBackground(Color.WHITE);

					buttonProducto.addActionListener(e -> {
						ProductoCliente frame = new ProductoCliente(null,producto11);
						frame.setVisible(true);

					});

					buttonProducto.setBorder(
							BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));

					cardPanel.add(buttonProducto);

					cardPanel.setPreferredSize(new Dimension(anchuraCalculada + 20, alturaDeseada + 20));
					panelTarjetas.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
					panelTarjetas.add(cardPanel);

					JScrollPane scrollPane = new JScrollPane(panelTarjetas);
					scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
					scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					scrollPane.setPreferredSize(new Dimension(400, 300));
					scrollPane.setBackground(Color.black);

					add(scrollPane, BorderLayout.CENTER);

					setBackground(Color.WHITE);
				}
			}
		}

		public class TarjetaProducto extends JPanel {
			private static final long serialVersionUID = 1L;

			public TarjetaProducto(String nombre) {

				setLayout(new BorderLayout());
				setBorder(BorderFactory.createLineBorder(Color.black, 3));
				JPanel panelTexto = new JPanel();
				panelTexto.setBackground(new Color(193, 123, 160));
				panelTexto.setLayout(new BorderLayout());
				add(panelTexto, BorderLayout.NORTH);
				panelTexto.setBorder(BorderFactory.createLineBorder(Color.black, 2));

				// boorras desde aqui pa mas bonito
				JLabel lblRopa = new JLabel("Buscas esto .....");
				lblRopa.setForeground(new Color(0, 0, 0));
				lblRopa.setFont(new Font("Times New Roman", Font.PLAIN, 40));
				lblRopa.setHorizontalAlignment(JLabel.LEFT);

				panelTexto.add(lblRopa, BorderLayout.CENTER);
				add(panelTexto, BorderLayout.NORTH);
				// hasta aqui
				// scroll conde se acumulan los productos por categoria

				JPanel panelTarjetas = new JPanel();
				panelTarjetas.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
				panelTarjetas.setBackground(new Color(239, 222, 230));
				panelTarjetas.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
				panelTarjetas.setBorder(BorderFactory.createLineBorder(Color.black, 2));
				for (Producto producto11 : productos) {

					if (producto11.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
						JPanel cardPanel = new JPanel();
						cardPanel.setLayout(new BoxLayout(cardPanel, BoxLayout.Y_AXIS));
						cardPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

						JButton buttonProducto = new JButton();
						buttonProducto.setLayout(new GridBagLayout());

						ImageIcon iconProducto = new ImageIcon(producto11.getImagenes().get(0));

						int alturaDeseada = 200;
						int anchuraCalculada = (alturaDeseada * iconProducto.getIconWidth()) / iconProducto.getIconHeight();
						Image imagenOriginal = iconProducto.getImage().getScaledInstance(anchuraCalculada, alturaDeseada,
								Image.SCALE_SMOOTH);

						ImageIcon iconRedimensionado = new ImageIcon(imagenOriginal);
						JLabel labelImagen = new JLabel(iconRedimensionado);
						labelImagen.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));

						GridBagConstraints gbc = new GridBagConstraints();
						gbc.gridx = 0;
						gbc.gridy = 0;
						gbc.fill = GridBagConstraints.HORIZONTAL;
						gbc.weightx = 1.0;
						gbc.weighty = 1.0;
						gbc.anchor = GridBagConstraints.NORTH;

						buttonProducto.add(labelImagen, gbc);

						gbc.gridx = 0;
						gbc.gridy = 1;
						gbc.fill = GridBagConstraints.HORIZONTAL;
						gbc.anchor = GridBagConstraints.SOUTH;

						// JPanel panelDetalles = new JPanel();
						// panelDetalles.setBackground(Color.black);

						// buttonProducto.add(panelDetalles, gbc);
						buttonProducto.setPreferredSize(new Dimension(anchuraCalculada, alturaDeseada));

						Border border = BorderFactory.createLineBorder(Color.black, 1);

						buttonProducto.setBackground(Color.white);

						buttonProducto.addActionListener(e -> {

						});

						buttonProducto.setBorder(BorderFactory.createCompoundBorder(border,
								BorderFactory.createEmptyBorder(10, 10, 10, 10)));

						cardPanel.add(buttonProducto);
						cardPanel.setPreferredSize(new Dimension(anchuraCalculada + 20, alturaDeseada + 20));
						panelTarjetas.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
						panelTarjetas.add(cardPanel);
					}

					JScrollPane scrollPane = new JScrollPane(panelTarjetas);
					scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
					scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					scrollPane.setPreferredSize(new Dimension(400, 300));
					scrollPane.setBackground(Color.black);

					add(scrollPane, BorderLayout.CENTER);

					setBackground(Color.WHITE);
				}
			}

		}
	}
