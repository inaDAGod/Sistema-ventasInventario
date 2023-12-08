package general;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import ventasInventario.Login;
import ventasInventario.ProductoCliente;
import ventasInventario.Registro;
import ventasInventario.BD.Controladores.ControladorProducto;
import ventasInventario.BD.Modelo.Producto;

public class generalOfertas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	 private JPanel navegador;
		private JPanel SuperiorNavegador;
		private JButton btnOferta_2;
	    private ArrayList<Producto> ofertados;
	    private ControladorProducto controladorProducto;
	
	public generalOfertas() {
		setResizable(false);
		controladorProducto = new ControladorProducto();
    	ofertados = controladorProducto.ofertados();
    	float descuento=(float) 0.2;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1200, 800);
        getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1200, 763);
        getContentPane().add(panel);
        panel.setLayout(null);

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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InicioGeneral frame = new InicioGeneral();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(250, 44, 125, 36);
		panel_1.add(btnNewButton);
		

		JButton btnOferta = new JButton("Productos");
		btnOferta.setBackground(new Color(220, 100, 150));
		btnOferta.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		btnOferta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnOferta.setForeground(Color.WHITE);
		btnOferta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generalProductos frame = new generalProductos();
				frame.setVisible(true);
				setVisible(false);
			}
		});
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
		btnOferta_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generalSobreNea frame = new generalSobreNea();
				frame.setVisible(true);
                setVisible(false);
			}
		});
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
				Registro frame = new Registro();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		panel_1.add(btnvolver2);
      		//*======================================FIN DE PANNEL

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(193, 123, 160));
        panel_2.setBounds(0, 137, 1200, 625);
        panel.add(panel_2);

        JPanel panelTarjetas = new JPanel();
        panelTarjetas.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        panelTarjetas.setBackground(new Color(239, 222, 230)); 
        panelTarjetas.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelTarjetas.setLayout(new BoxLayout(panelTarjetas, BoxLayout.X_AXIS));
      

       
        
       

        for (Producto producto: ofertados) {
                JPanel cardPanel = new JPanel();
                cardPanel.setLayout(new BoxLayout(cardPanel, BoxLayout.Y_AXIS));
                cardPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

                JButton buttonPedido = new JButton();
                buttonPedido.setLayout(new GridBagLayout());

                ImageIcon iconPedido = new ImageIcon(producto.getImagenes().get(0));

                int alturaDeseada = 300;
                int anchuraCalculada = 300;
                Image imagenOriginal = iconPedido.getImage().getScaledInstance(anchuraCalculada, alturaDeseada, Image.SCALE_SMOOTH);

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

                buttonPedido.add(labelImagen, gbc);

                gbc.gridx = 0;
                gbc.gridy = 1;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.anchor = GridBagConstraints.SOUTH;

                JPanel panelDetalles = new JPanel();
                panelDetalles.setBackground(Color.white);
                panelDetalles.setLayout(new BoxLayout(panelDetalles, BoxLayout.Y_AXIS));
                JLabel labelNumeroCompra = new JLabel("Nombre: " + producto.getNombre());
                labelNumeroCompra.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                labelNumeroCompra.setForeground(Color.BLACK); 
                JLabel labelFecha = new JLabel("Antes: " + producto.getPrecioOriginal());
                labelFecha.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                labelFecha.setForeground(Color.RED); 
                JLabel labelEstado = new JLabel("Ahora: " + producto.getOferta().getPrecioOferta());
                labelEstado.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                labelEstado.setForeground(Color.GREEN);
                panelDetalles.add(labelNumeroCompra);
                panelDetalles.add(labelFecha);
                panelDetalles.add(labelEstado);

                buttonPedido.add(panelDetalles, gbc);
                buttonPedido.setPreferredSize(new Dimension(anchuraCalculada, alturaDeseada));

                Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

                buttonPedido.setBackground(Color.white);

                buttonPedido.addActionListener(e -> {
                	ProductoDetalleGeneral frame = new ProductoDetalleGeneral(producto,generalOfertas.this);
					frame.setVisible(true);
					generalOfertas.this.setVisible(false);
                });
                buttonPedido.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));

                cardPanel.add(buttonPedido);
                
                panelTarjetas.add(cardPanel);
            
        }
        panel_2.setLayout(null);

        JScrollPane scrollPane = new JScrollPane(panelTarjetas);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(10, 170, 1170, 456);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setBackground(Color.white);

        panel_2.add(scrollPane);
       
        JLabel lblNewLabel_1 = new JLabel(" OFERTAS DISPONIBLES");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 80));
        lblNewLabel_1.setForeground(Color.white);
        lblNewLabel_1.setBounds(10, 29, 1200, 100);
        panel_2.add(lblNewLabel_1);
        
       
      
        
    }
}
