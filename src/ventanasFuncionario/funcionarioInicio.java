package ventanasFuncionario;

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
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

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

import ventasInventario.BD.Controladores.ControladorProducto;
import ventasInventario.BD.Modelo.Producto;




public class funcionarioInicio extends JFrame {
	  private static final long serialVersionUID = 1L;
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
	    private JScrollPane scrollPane;
	    
	    
	    private JPanel navegador;
	    private  JPanel SuperiorNavegador;
	    private JButton btnOferta_2;
	    // para el carrucel 	
	    private JPanel carruselPanel;
	    private List<String>  listaImagenes = new ArrayList<>();
	    private int currentIndex = 0;
	    private Timer timer;
	    

	    //imagenes carusel	
	    
	 
	    public static void main(String[] args) {
	        EventQueue.invokeLater(() -> {
	            try {
	            	funcionarioInicio frame = new funcionarioInicio();
	                frame.setVisible(true);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        });
	    }

	    public funcionarioInicio() {
	    	controladorProducto = new ControladorProducto();
			productos = controladorProducto.todosProductos();
			etiquetas = controladorProducto.todasEtiquetas();
	        
	       //imagenes carusel
	        listaImagenes.add("src/imagenesJhess/caru2.jfif");
	        listaImagenes.add("src/imagenesJhess/caru.jpg");
	        listaImagenes.add("src/imagenesJhess/caru1.jpg");
	        listaImagenes.add("src/imagenesJhess/caru5.jpg");
	        

	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 1200, 800);
	        getContentPane().setLayout(null);

	        JPanel panel = new JPanel();
	        panel.setBounds(0, 0, 1200, 763);
	        getContentPane().add(panel);
	        panel.setLayout(null);

	        grupoRadioBotones = new ButtonGroup();
	    //NARVAR DE UN LADO AL APRETAR EL PERFIL
	        
	        navegador = new JPanel();
	        navegador.setLayout(new BorderLayout());
	        navegador.setBackground(new Color(250, 232, 235));
	        navegador.setLayout(null);
	        navegador.setBorder(BorderFactory.createLineBorder(Color.black, 2)); 
	        navegador.setBounds(880, 0, 320, 800);
	        panel.add(navegador);
	        navegador.setVisible(false);
	        
	        SuperiorNavegador = new JPanel();
	        SuperiorNavegador.setBackground(new Color(205, 159, 204));
	        SuperiorNavegador.setLayout(null);
	        SuperiorNavegador.setBounds(0, 0, 350, 100);
	        navegador.add(SuperiorNavegador);
	        SuperiorNavegador.setVisible(false);
	        SuperiorNavegador.setBorder(BorderFactory.createLineBorder(Color.black, 2)); 
	       
	        //BOTON PERFIL
	        JButton btnUsuario = new JButton("   Mi perfil");
	        btnUsuario.setBounds(40, 20, 300, 70);
	        btnUsuario.setLayout(new BorderLayout());
	        btnUsuario.setBorder(BorderFactory.createLineBorder(Color.black, 0)); 
	        btnUsuario.setVisible(true);
	        SuperiorNavegador.add(btnUsuario);
	        btnUsuario.setBackground(new Color(205, 159, 204));
	        btnUsuario.setForeground(Color.WHITE);
	        btnUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	        ImageIcon iconProducto7= new ImageIcon("src/imagenesJhess/voluntarioIcon.png");
	        ImageIcon iconRedimensionado7 = new ImageIcon( iconProducto7.getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH));
	        JLabel labelImagen7 = new JLabel(iconRedimensionado7);
	        labelImagen7.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
	        btnUsuario.add(labelImagen7, BorderLayout.WEST);  // Colocar la imagen a la izquierda
	       
	      //BOTON añadir productos
	        JButton buttonProducto5 = new JButton("  Añadir Producto");
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
	        buttonProducto5.add(labelImagen2, BorderLayout.WEST);  // Colocar la imagen a la izquierda
	        
	        
	      //BOTON añadir funcionario
	        JButton buttonMisPedidos = new JButton("Añadir funcionario");
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
	        buttonMisPedidos.add(labelImagen21, BorderLayout.WEST);  // Colocar la imagen a la izquierda
	        
	      //BOTON MIS listado de clientes
	        JButton buttonListado = new JButton("Listado de clientes");
	        buttonListado.setBounds(25, 320, 300, 70);
	        buttonListado.setLayout(new BorderLayout());
	        buttonListado.setVisible(true);
	        buttonListado.setBackground(new Color(250, 232, 235));
	        buttonListado.setBorder(BorderFactory.createLineBorder(Color.black, 0)); 
	        buttonListado.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	        buttonListado.setForeground(Color.BLACK);
	        navegador.add(buttonListado);
	        ImageIcon iconProducto218 = new ImageIcon("src/imagenesJhess/pedido.png");
	        Image imagenOriginal218 = iconProducto218.getImage().getScaledInstance(80, 70, Image.SCALE_SMOOTH);
	        ImageIcon iconRedimensionado218 = new ImageIcon(imagenOriginal218);
	        JLabel labelImagen218 = new JLabel(iconRedimensionado218);
	        labelImagen21.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
	        buttonListado.add(labelImagen218, BorderLayout.WEST);  // Colocar la imagen a la izquierda
	        
	       
	        //BOTON todos los pedidos
	        JButton buttonAjustes = new JButton("Todos los pedidos");
	        buttonAjustes.setBounds(25, 420, 300, 70);
	        buttonAjustes.setLayout(new BorderLayout());
	        buttonAjustes.setVisible(true);
	        navegador.add(buttonAjustes);
	        buttonAjustes.setBackground(new Color(250, 232, 235));
	        buttonAjustes.setBorder(BorderFactory.createLineBorder(Color.black, 0)); 
	        buttonAjustes.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	        buttonAjustes.setForeground(Color.BLACK);
	        ImageIcon iconProducto0 = new ImageIcon("src/imagenesJhess/ajus.png");
	        Image imagenOriginal0 = iconProducto0.getImage().getScaledInstance(80, 70, Image.SCALE_SMOOTH);
	        ImageIcon iconRedimensionado0 = new ImageIcon(imagenOriginal0);
	        JLabel labelImagen0 = new JLabel(iconRedimensionado0);
	        labelImagen21.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
	        buttonAjustes.add(labelImagen0, BorderLayout.WEST);  // Colocar la imagen a la izquierda
	        
	        //BOTON MIS CERRAR SESION
	        JButton buttonCerrar = new JButton("Cerrar sesion");
	        buttonCerrar.setBounds(25, 520, 300, 70);
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
	        
	        
	        
	        
	        
	        
	        //FIONNN
	        JPanel panel_1 = new JPanel();
	        panel_1.setBackground(new Color(117, 14, 73));
	        panel_1.setBounds(2, 0, 1190, 136);
	        panel.add(panel_1);
	        panel_1.setBorder(BorderFactory.createLineBorder(Color.black, 2)); 
	       
	        panel_1.setLayout(null);

	        JLabel lblNewLabel = new JLabel("");
	        ImageIcon icon = new ImageIcon(
	        		 "C:\\Users\\Desktop\\Documents\\GitHub\\Sistema-ventasInventario\\src\\imagenes\\logo.jpg");
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

	        JButton btnOferta = new JButton("Inventario");
	        btnOferta.setBackground(new Color(220, 100, 150));
	        btnOferta.setBorder(BorderFactory.createLineBorder(Color.black, 1)); 
	        btnOferta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	        btnOferta.setForeground(Color.WHITE);
	        btnOferta.setBounds(454, 44, 125, 36);
	        panel_1.add(btnOferta);
	        
	        JButton btnOferta_1_1 = new JButton("Pedidos actuales");
	        btnOferta_1_1.setBorder(BorderFactory.createLineBorder(Color.black, 1)); 
	        btnOferta_1_1.setBackground(new Color(220, 100, 150));
	        btnOferta_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	        btnOferta_1_1.setForeground(Color.WHITE);
	        btnOferta_1_1.setBounds(578, 44, 150, 36);
	        panel_1.add(btnOferta_1_1);

	        JButton btnOferta_1 = new JButton("Sobre Nea");
	        btnOferta_1.setBorder(BorderFactory.createLineBorder(Color.black, 1)); 
	        btnOferta_1.setBackground(new Color(220, 100, 150));
	        btnOferta_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	        btnOferta_1.setForeground(Color.WHITE);
	        btnOferta_1.setBounds(728, 44, 150, 36);
	        panel_1.add(btnOferta_1);

	      
	        ImageIcon iconPerfil = new ImageIcon(
	                "src/imagenesJhess/perfilpersona.png");
	        Image imagePerfil = iconPerfil.getImage().getScaledInstance(130, 118, Image.SCALE_SMOOTH);

	        btnOferta_2 = new JButton("");
	        btnOferta_2.setBorder(BorderFactory.createLineBorder(Color.black, 1)); 
	        btnOferta_2.setIcon(new ImageIcon(imagePerfil));
	        btnOferta_2.setBounds(990, 11, 130, 118);
	        panel_1.add(btnOferta_2);
	       
	        

	        
	        JButton btnvolver = new JButton(">");
	        btnvolver.setBorder(BorderFactory.createLineBorder(Color.black, 1)); 
	        btnvolver.setBackground(new Color(220, 100, 150));
	        btnvolver.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	        btnvolver.setForeground(Color.WHITE);
	        btnvolver.setBounds(1130, 50, 50, 40);
	        panel_1.add(btnvolver);
	        
	       


	        JPanel panelBase = new JPanel();
	        panelBase.setBounds(0, 137, 1200, 625);
	        panelBase.setLayout(null);
	        panel.add(panelBase);


	        JPanel panel_2 = new JPanel();
	        panel_2.setBackground(new Color(214, 166, 190));
	        panel_2.setBounds(0, 0, 1190, 625);
	        panel_2.setLayout(new BorderLayout());
	        panelBase.add(panel_2);
	        
	        JPanel panelSuperiorContainer = new JPanel(new BorderLayout());
	        panel_2.add(panelSuperiorContainer, BorderLayout.NORTH);
	         
	        panelTarjetas = new JPanel();
	        panelTarjetas.setLayout(new GridLayout(0, 1, 10, 10)); 
	        panelTarjetas.setBackground(new Color(214, 166, 190));
	        JPanel panelTexto5 = new JPanel();
	        panelTexto5.setBackground(Color.blue);
	      
	      
	        panelTexto5.setBackground(new Color(0, 0, 0));
	        panelTexto5.setLayout(new BorderLayout());

	        JLabel lblRopa = new JLabel("Ropa"); 
	        lblRopa.setForeground(new Color(255, 255, 255));
	        lblRopa.setFont(new Font("Times New Roman", Font.PLAIN, 50));
	        lblRopa.setHorizontalAlignment(JLabel.LEFT);
	        
	       
	        JScrollPane scrollPane = new JScrollPane(panelTarjetas);
	        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	        scrollPane.setBounds(0, 0, 1190, 625);
	        
	        JPanel panelBusqueda = new JPanel();
	        panelBusqueda.setBackground(new Color(255, 182, 193));
	        panelBusqueda.setBounds(0, 0, 100, 300);
	        
	        panelTarjetas.add(panelBusqueda);
	        panelTarjetas.add(panelSuperiorContainer);
	        
	           
	        textFieldBuscar = new JTextField();
	                
	         radioBoton1 = new JRadioButton("Ropa");
	                        
	         radioBoton2 = new JRadioButton("Cosmetico");
	                                
	          radioBoton3 = new JRadioButton("Maquillaje");
	                                        
	                                        radioBoton3_1 = new JRadioButton("Todo");
	                                      
	                                        
	                                        
	                                        grupoRadioBotones.add(radioBoton1);
	                                        grupoRadioBotones.add(radioBoton2);
	                                        grupoRadioBotones.add(radioBoton3);
	                                       
	                                        
	                                             
	                                                        
	                                                        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	                                                        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS); // Cambié a VERTICAL_SCROLLBAR_ALWAYS
	                                                        scrollPane.setBounds(0, 0, 1190, 500);
	                                                        panel_2.add(scrollPane);
	       
	        panelTarjetas.add(panelBusqueda, BorderLayout.NORTH);
	        
	        JLabel lblNewLabel_1 = new JLabel("INGRESE DATOS A BUSCAR :");
	        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	        
	       
	        
	        panelBusqueda.setOpaque(true);
	       
	        panelBusqueda.setBounds(0, 10, 10, 10);
	        panelBusqueda.setBackground(Color.blue);
	        agregarTarjetasPedidos();     
	        restaurarEstadoOriginal();

	        
	        btnOferta_2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	               

	            	carruselPanel.setVisible(false);
	            	radioBoton3_1.setVisible(false);
	            	btnvolver.setVisible(false);
	            	btnOferta_2.setVisible(false);
	            	navegador.setVisible(true);
	            	SuperiorNavegador.setVisible(true);
	    	        btnUsuario.setVisible(true);
	    	        buttonProducto5.setVisible(true);
	    	        buttonMisPedidos.setVisible(true);
	    	        buttonCerrar.setVisible(true);
	    	        botonBuscar.setVisible(false);
	    	       
	               
	            }
	        });

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
	        
	        panelBusqueda.setBounds(0, 0, 0, 0);
	        panelBusqueda.setBackground(new Color(239, 222, 230));
	        panelBusqueda.setLayout(null);
	        
	        //*CARRUSEL
	        JPanel panel_2 = new JPanel();
	        panel_2.setBackground(new Color(214, 166, 190));
	        panel_2.setBounds(0, 0, 1190, 625);
	        panel_2.setLayout(new BorderLayout());
	      
	        
	        JPanel panelSuperiorContainer = new JPanel(new BorderLayout());
	        panelSuperiorContainer.setBackground(Color.blue);
	        panel_2.add(panelSuperiorContainer, BorderLayout.NORTH);
	        
	        carruselPanel = new JPanel(new BorderLayout());
	        
	        getContentPane().add(carruselPanel, BorderLayout.CENTER);
	        carruselPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10,10)); 
	        JButton prevButton = new JButton("<");
	        prevButton.setBackground(new Color(162, 195, 200));
	        prevButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	        prevButton.setForeground(Color.WHITE);
	        JButton nextButton = new JButton(">");
	        nextButton.setBackground(new Color(162, 195, 200));
	        nextButton.setForeground(Color.WHITE);
	        nextButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));

	        prevButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                showPreviousImage();
	                

	            	carruselPanel.setVisible(true);
	            	radioBoton3_1.setVisible(true);
	            	navegador.setVisible(false);
	            	SuperiorNavegador.setVisible(false);
	            	btnOferta_2.setVisible(true);
	            	botonBuscar.setVisible(true);
	    	        
	    	        
	            }
	        });

	        nextButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                showNextImage();
	                
	                carruselPanel.setVisible(true);
	            	radioBoton3_1.setVisible(true);
	            	navegador.setVisible(false);
	            	SuperiorNavegador.setVisible(false);
	            	btnOferta_2.setVisible(true);
	            	botonBuscar.setVisible(true);
	            }
	        });

	        JPanel buttonPanel = new JPanel();
	        buttonPanel.add(prevButton);
	        buttonPanel.add(nextButton);
	        buttonPanel.setBackground(new Color(214, 166, 190));
	        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0)); 
	      
	        JLabel labelImagen7 = new JLabel("BIENVENIDOS A NEA");
	        labelImagen7.setFont(new Font("Times New Roman", Font.PLAIN, 70));
	        labelImagen7.setForeground(Color.WHITE);
	        labelImagen7.setBounds(400, 100, 800, 100);
	        panel_2.add(buttonPanel, BorderLayout.SOUTH );
	        panel_2.add(labelImagen7, BorderLayout.NORTH);
	        startTimer();
	        showImage();
	        panel_2.add(carruselPanel);
	        panelTarjetas.add(panel_2);
	        //*FIN
	        
	        

	        textFieldBuscar = new JTextField();
	        textFieldBuscar.setBounds(100, 263, 730, 30);
	        panelBusqueda.add(textFieldBuscar);

	        radioBoton1 = new JRadioButton("Ropa");
	        radioBoton1.setBounds(304, 150, 100, 30);
	        radioBoton1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
	        radioBoton1.setBackground(new Color(239, 222, 230));
	        panelBusqueda.add(radioBoton1);

	        radioBoton2 = new JRadioButton("Cosmetico");
	        radioBoton2.setBackground(new Color(239, 222, 230));
	        radioBoton2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
	        radioBoton2.setBounds(495, 150, 100, 30);
	        panelBusqueda.add(radioBoton2);

	        radioBoton3 = new JRadioButton("Maquillaje");
	        radioBoton3.setBounds(699, 150, 100, 30);
	        radioBoton3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
	        radioBoton3.setBackground(new Color(239, 222, 230));
	        panelBusqueda.add(radioBoton3);
	        
	        radioBoton3_1 = new JRadioButton("Todo");
	        radioBoton3_1.setBounds(861, 150, 100, 30);
	        radioBoton3_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
	        radioBoton3_1.setBackground(new Color(239, 222, 230));
	        panelBusqueda.add(radioBoton3_1);
	        

	        grupoRadioBotones.add(radioBoton1);
	        grupoRadioBotones.add(radioBoton2);
	        grupoRadioBotones.add(radioBoton3);
	        grupoRadioBotones.add(radioBoton3_1);
	        
	        botonBuscar = new JButton("Buscar");
	        botonBuscar.setBounds(911, 263, 100, 30);
	        botonBuscar.setBackground(new Color(218, 207, 242));
	        botonBuscar.setForeground(Color.WHITE);
	        botonBuscar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	        panelBusqueda.add(botonBuscar);
	        
	        
	        JLabel lblNewLabel_11 = new JLabel("Novedades del mes");
	        lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 70));
	        lblNewLabel_11.setBounds(10, 0, 1200, 150);
	        panelBusqueda.add(lblNewLabel_11); 
	  
	        JLabel lblNewLabel_1 = new JLabel("SELECCIONE LA CATEGORIA:");
	        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	        lblNewLabel_1.setBounds(10, 150, 350, 32);
	        panelBusqueda.add(lblNewLabel_1); 
	        
	        
	        JLabel lblNewLabel_1_1 = new JLabel("INGRESE EL NOMBRE DEL PRODUCTO :");
	        lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	        lblNewLabel_1_1.setBounds(10, 202, 800, 32);
	        panelBusqueda.add(lblNewLabel_1_1);
	      
	   
	        
	        
	      
	        
	        


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
	                carruselPanel.setVisible(true);
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
	                 
	                }
	                carruselPanel.setVisible(true);
	            	radioBoton3_1.setVisible(true);
	            	navegador.setVisible(false);
	            	SuperiorNavegador.setVisible(false);
	            	btnOferta_2.setVisible(true);
	            	botonBuscar.setVisible(true);
	            }
	        });

	        radioBoton2.addItemListener(new ItemListener() {
	            public void itemStateChanged(ItemEvent e) {
	                if (e.getStateChange() == ItemEvent.SELECTED) {
	                	filtrarTarjetas();
	               	 restaurarEstiloRadioButtons();
	                 cambiarEstiloRadioButton(radioBoton2);
	                }
	                carruselPanel.setVisible(true);
	            	radioBoton3_1.setVisible(true);
	            	navegador.setVisible(false);
	            	SuperiorNavegador.setVisible(false);
	            	btnOferta_2.setVisible(true);
	            	botonBuscar.setVisible(true);
	            }
	        });

	        radioBoton3.addItemListener(new ItemListener() {
	            public void itemStateChanged(ItemEvent e) {
	                if (e.getStateChange() == ItemEvent.SELECTED) {
	                
	                    filtrarTarjetas();
	                    restaurarEstiloRadioButtons();
	                    cambiarEstiloRadioButton(radioBoton3);
	                }
	                carruselPanel.setVisible(true);
	            	radioBoton3_1.setVisible(true);
	            	navegador.setVisible(false);
	            	SuperiorNavegador.setVisible(false);
	            	btnOferta_2.setVisible(true);
	            	botonBuscar.setVisible(true);
	            }
	        });
	        radioBoton3_1.addItemListener(new ItemListener() {
	            public void itemStateChanged(ItemEvent e) {
	                if (e.getStateChange() == ItemEvent.SELECTED) {
	                
	                	 restaurarEstadoOriginal();
	                	 restaurarEstiloRadioButtons();
	                     cambiarEstiloRadioButton(radioBoton3_1);
	                }
	                carruselPanel.setVisible(true);
	            	radioBoton3_1.setVisible(true);
	            	navegador.setVisible(false);
	            	SuperiorNavegador.setVisible(false);
	            	btnOferta_2.setVisible(true);
	            	botonBuscar.setVisible(true);
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
	        radioButton.setForeground(Color.white);  // Cambia el color del texto cuando está seleccionado
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
	    
	    //funciones caruel
	    private void startTimer() {
	        timer = new Timer();
	        timer.scheduleAtFixedRate(new TimerTask() {
	            @Override
	            public void run() {
	                showNextImage();
	            }
	        }, 0, 3000); // Cambia 3000 a la cantidad de milisegundos entre imágenes
	    }

	    private void showImage() {
	        carruselPanel.removeAll();
	        carruselPanel.setBackground(new Color(193, 123, 160));
	        String imagePath = listaImagenes.get(currentIndex);
	        ImageIcon imageIcon127 = new ImageIcon(new ImageIcon(imagePath).getImage().getScaledInstance(550, 220, Image.SCALE_DEFAULT));
	        JLabel imageLabel37 = new JLabel(imageIcon127);
	        carruselPanel.add(imageLabel37);
	       
	        //PARA QUE SE VAYA HACIA ARRIBA EL SROLL
	        carruselPanel.revalidate();
	        carruselPanel.repaint();
	    }

	    private void showNextImage() {
	        currentIndex = (currentIndex + 1) % listaImagenes.size();
	        showImage();
	    }

	    private void showPreviousImage() {
	        currentIndex = (currentIndex - 1 + listaImagenes.size()) % listaImagenes.size();
	        showImage();
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
	        
	            
	            //boorras desde aqui pa mas bonito
	            JLabel lblRopa = new JLabel(etiqueta); 
	            lblRopa.setForeground(new Color(0,0,0));
	            lblRopa.setFont(new Font("Times New Roman", Font.PLAIN, 40));
	            lblRopa.setHorizontalAlignment(JLabel.LEFT);
	            

	            panelTexto.add(lblRopa, BorderLayout.CENTER);
	            add(panelTexto, BorderLayout.NORTH);
	            	//hasta aqui
	            //scroll conde se acumulan los productos por categoria
	            JPanel panelTarjetas = new JPanel();
	            panelTarjetas.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
	            panelTarjetas.setBackground(new Color(239, 222, 230)); 
	            panelTarjetas.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

	         
	            for (Producto producto11 : controladorProducto.etiquetaProductos(etiqueta)) {
	            	
	                JPanel cardPanel = new JPanel();
	                cardPanel.setLayout(new BoxLayout(cardPanel, BoxLayout.Y_AXIS));
	                cardPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

	                JButton buttonProducto = new JButton();
	                buttonProducto.setLayout(new GridBagLayout());

	                ImageIcon iconProducto = new ImageIcon(producto11.getImagenes().get(0));

	                int alturaDeseada = 200;
	                int anchuraCalculada = 200;
	                Image imagenOriginal = iconProducto.getImage().getScaledInstance(anchuraCalculada, alturaDeseada, Image.SCALE_SMOOTH);

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

	                //JPanel panelDetalles = new JPanel();
	                //panelDetalles.setBackground(Color.BLACK);
	         
	              

	                //buttonProducto.add(panelDetalles, gbc);
	                buttonProducto.setPreferredSize(new Dimension(anchuraCalculada, alturaDeseada));

	                Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

	              
	                buttonProducto.setBackground(Color.white);

	                buttonProducto.addActionListener(e -> {
	                    
	                });

	                buttonProducto.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));

	                cardPanel.add(buttonProducto);

	                cardPanel.setPreferredSize(new Dimension(anchuraCalculada + 20, alturaDeseada + 20));
	                panelTarjetas.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); 
	                panelTarjetas.add(cardPanel);
	            

	            JScrollPane scrollPane = new JScrollPane(panelTarjetas);
	            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
	            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
	            scrollPane.setPreferredSize(new Dimension(400, 200));
	            scrollPane.setBackground(Color.black);

	          
	            add(scrollPane, BorderLayout.CENTER);

	            setBackground(Color.WHITE);
	        }}}
	    
	    
	    
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
	   
	                
	                //boorras desde aqui pa mas bonito
	                JLabel lblRopa = new JLabel("Buscas esto ....."); 
	                lblRopa.setForeground(new Color(0,0,0));
	                lblRopa.setFont(new Font("Times New Roman", Font.PLAIN, 40));
	                lblRopa.setHorizontalAlignment(JLabel.LEFT);
	                

	                panelTexto.add(lblRopa, BorderLayout.CENTER);
	                add(panelTexto, BorderLayout.NORTH);
	                	//hasta aqui
	                //scroll conde se acumulan los productos por categoria
	      

	                JPanel panelTarjetas = new JPanel();
	                panelTarjetas.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10)); 
	                panelTarjetas.setBackground(new Color(239, 222, 230)); 
	                panelTarjetas.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
	                panelTarjetas.setBorder(BorderFactory.createLineBorder(Color.black, 2)); 
	                
	                for (Producto producto11 : productos) {
	                	
	                	 if (producto11.getNombre().toLowerCase().contains(nombre.toLowerCase())) 
	                	 {
	                    JPanel cardPanel = new JPanel();
	                    cardPanel.setLayout(new BoxLayout(cardPanel, BoxLayout.Y_AXIS));
	                    cardPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

	                    JButton buttonProducto = new JButton();
	                    buttonProducto.setLayout(new GridBagLayout());

	                    ImageIcon iconProducto = new ImageIcon(producto11.getImagenes().get(0));

	                    int alturaDeseada = 200;
	                    int anchuraCalculada = 200;
	                    Image imagenOriginal = iconProducto.getImage().getScaledInstance(anchuraCalculada, alturaDeseada, Image.SCALE_SMOOTH);

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

	                    //JPanel panelDetalles = new JPanel();
	                    //panelDetalles.setBackground(Color.BLACK);
	             
	                  

	                    //buttonProducto.add(panelDetalles, gbc);
	                    buttonProducto.setPreferredSize(new Dimension(anchuraCalculada, alturaDeseada));

	                    Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

	                
	                    buttonProducto.setBackground(Color.white);

	                    buttonProducto.addActionListener(e -> {
	                   
	                    });

	                    buttonProducto.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));

	                    cardPanel.add(buttonProducto);

	                    
	                    cardPanel.setPreferredSize(new Dimension(anchuraCalculada + 20, alturaDeseada + 20));
	                    panelTarjetas.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); 
	                    panelTarjetas.add(cardPanel);
	                }

	                JScrollPane scrollPane = new JScrollPane(panelTarjetas);
	                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
	                scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); // Cambié a HORIZONTAL_SCROLLBAR_ALWAYS
	                scrollPane.setPreferredSize(new Dimension(400, 300));
	                scrollPane.setBackground(Color.black);

	               
	                add(scrollPane, BorderLayout.CENTER);

	                setBackground(Color.WHITE);
	            }}

	        }}

	   