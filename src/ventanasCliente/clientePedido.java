package ventanasCliente;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

import general.InicioGeneral;
import ventasInventario.Favoritos;
import ventasInventario.BD.Controladores.ControladorPedidos;
import ventasInventario.BD.Modelo.GestorPedidos;
import ventasInventario.BD.Modelo.Pedido;
import ventasInventario.BD.Modelo.Usuario;

import java.awt.Font;

class TarjetaPedido extends JPanel {
    private static final long serialVersionUID = 1L;

    public TarjetaPedido(Pedido pedido,clientePedido clipedido) {
    	
    	 setLayout(new BorderLayout()); 
         setBorder(BorderFactory.createLineBorder(Color.BLACK, 1)); 
         

        ImageIcon iconPedido = new ImageIcon(
                "src/imagenesJhess/carritos3.png");
        Image imagenOriginal = iconPedido.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon iconRedimensionado = new ImageIcon(imagenOriginal);
        JLabel labelImagen = new JLabel(iconRedimensionado); 

        JPanel panelImagen = new JPanel();
        panelImagen.setLayout(new BorderLayout());
        panelImagen.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelImagen.add(labelImagen, BorderLayout.WEST); 
        panelImagen.setBackground(Color.WHITE); 
        JPanel panelDetalles = new JPanel();
        panelDetalles.setLayout(new GridLayout(0, 1)); 

        JLabel labelNumeroCompra = new JLabel("PEDIDO " + pedido.getCpedido());
        JLabel labelFecha = new JLabel("Fecha: " + pedido.getFecha_reserva());
        JLabel labelEstado = new JLabel("Estado: " + pedido.getEstadoPedido());

       

        panelDetalles.add(labelNumeroCompra);
        panelDetalles.add(labelFecha);
        panelDetalles.add(labelEstado);
        panelDetalles.setBackground(Color.WHITE); 
        
        
        JButton buttonInfo = new JButton("Más Información");
        buttonInfo.setForeground(Color.WHITE);
        buttonInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clientePedidoDetalle frame = new clientePedidoDetalle(pedido);
                frame.setVisible(true);
				clipedido.setVisible(false);
			}
		});
        buttonInfo.setBackground(new Color(112, 76, 94)); 
        buttonInfo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); 
        
       
        Font font = new Font("Times New Roman", Font.PLAIN, 30);
        labelNumeroCompra.setFont(font);
        labelFecha.setFont(font);
        labelEstado.setFont(font);
        buttonInfo.setFont(font);

        JPanel panelInfo = new JPanel();
        panelInfo.setLayout(new BorderLayout());
        panelInfo.setBorder(BorderFactory.createEmptyBorder(10, 20, 150, 10)); 
        panelInfo.add(buttonInfo, BorderLayout.CENTER); 
        panelInfo.setBackground(Color.WHITE);
        
      
        add(panelImagen, BorderLayout.WEST);
        add(panelDetalles, BorderLayout.CENTER);

      
        add(panelInfo, BorderLayout.EAST);
        setBackground(Color.WHITE);
    }
    }


public class clientePedido extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel navegador;
	private JPanel SuperiorNavegador;
	private JButton btnOferta_2;
	private Usuario usuario;
   
    public clientePedido(Usuario usuario) {
    	this.usuario = usuario;
        setResizable(false);
    	ControladorPedidos controladorPedidos = new ControladorPedidos();
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
      		btnUsuario.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				perfilUsuario frame = new perfilUsuario(usuario);
                    frame.setVisible(true);
    				setVisible(false);
    			}
    		});
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
      		buttonCerrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					InicioGeneral frame = new InicioGeneral();
					frame.setVisible(true);
					setVisible(false);
				}
			});
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
      		btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					clienteInicio frame = new clienteInicio(usuario);
					frame.setVisible(true);
					setVisible(false);
				}
			});
      		btnNewButton.setBounds(330, 44, 125, 36);
      		panel_1.add(btnNewButton);

      		JButton btnOferta = new JButton("Productos");
      		btnOferta.setBackground(new Color(220, 100, 150));
      		btnOferta.setBorder(BorderFactory.createLineBorder(Color.black, 1));
      		btnOferta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
      		btnOferta.setForeground(Color.WHITE);
      		btnOferta.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				clienteCatalogo frame = new clienteCatalogo(usuario);
    				frame.setVisible(true);
    				setVisible(false);
    			}
    		});
      		btnOferta.setBounds(454, 44, 125, 36);
      		panel_1.add(btnOferta);

      		JButton btnOferta_1_1 = new JButton("Oferta");
      		btnOferta_1_1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
      		btnOferta_1_1.setBackground(new Color(220, 100, 150));
      		btnOferta_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
      		btnOferta_1_1.setForeground(Color.WHITE);
      		btnOferta_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					clienteOfertas frame = new clienteOfertas(usuario);
	                frame.setVisible(true);
	                setVisible(false);
				}
			});
      		btnOferta_1_1.setBounds(578, 44, 120, 36);
      		panel_1.add(btnOferta_1_1);

      		JButton btnOferta_1 = new JButton("Quienes somos?");
      		btnOferta_1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
      		btnOferta_1.setBackground(new Color(220, 100, 150));
      		btnOferta_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
      		btnOferta_1.setForeground(Color.WHITE);
      		btnOferta_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					clienteSobreNea frame = new clienteSobreNea(usuario);
	                frame.setVisible(true);
	                setVisible(false);
				}
			});
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
        panel_2.setBackground(new Color(241, 200, 219));
        panel_2.setBounds(0, 137, 1200, 625);
        panel_2.setLayout(null);  
        panel.add(panel_2);
        
        JPanel panelTarjetas = new JPanel();
        panelTarjetas.setLayout(new GridLayout(0, 1, 10, 10)); 
        panelTarjetas.setBackground(new Color(184, 140, 158)); 
        panelTarjetas.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel_2.add(panelTarjetas);
        
 
        ArrayList<Pedido> listaPedidos = controladorPedidos.pedidosCliente(usuario);
        for (Pedido pedido : listaPedidos) {
            TarjetaPedido tarjeta = new TarjetaPedido(pedido,clientePedido.this);
            tarjeta.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); 
            
            panelTarjetas.add(tarjeta);
        }
        panel_2.setLayout(null);
        

        JScrollPane scrollPane = new JScrollPane(panelTarjetas);
        scrollPane.setBounds(125, 147, 946, 425);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); 
        panel_2.add(scrollPane);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(255, 255, 255));
        panel_3.setBounds(125, 49, 946, 98);
        panel_2.add(panel_3);
        panel_3.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("Mis pedidos");
        lblNewLabel_1.setForeground(new Color(112, 76, 94));
        lblNewLabel_1.setBounds(28, 21, 303, 66);
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 57));
        panel_3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); 
        panel_3.add(lblNewLabel_1);
        
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
  				//panelTarjetas.setVisible(false);
  			
  			}
  		});
        
    }}

