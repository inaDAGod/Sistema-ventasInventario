
package ventanasCliente;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import ventasInventario.BD.Controladores.ControladorProducto;
import ventasInventario.BD.Modelo.Producto;
import ventasInventario.BD.Modelo.Usuario;

import javax.swing.ScrollPaneConstants;
import java.awt.Font;

public class clienteOfertas extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel navegador;
	private JPanel SuperiorNavegador;
	private JButton btnOferta_2;
    private ArrayList<Producto> ofertados;
    private ControladorProducto controladorProducto;
    private Usuario usuario;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Usuario usu = new Usuario("danialee14");
                	clienteOfertas frame = new clienteOfertas(usu);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public clienteOfertas(Usuario u) {
    	this.usuario = u;
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
      				"src/imagenes/logo.jpg");
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
      		btnNewButton.setBounds(330, 44, 125, 36);
      		panel_1.add(btnNewButton);

      		JButton btnOferta = new JButton("Productos");
      		btnOferta.setBackground(new Color(220, 100, 150));
      		btnOferta.setBorder(BorderFactory.createLineBorder(Color.black, 1));
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
                    JFrame frame = (JFrame) SwingUtilities.getRoot(buttonPedido);
                    frame.dispose();
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
        
        btnOferta_2.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {

  				//panelTarjetas.setVisible(false);
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
      
        
    }
}