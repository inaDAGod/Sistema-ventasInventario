package ventanasFuncionario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import ventasInventario.BD.Controladores.ControladorPedidos;
import ventasInventario.BD.Modelo.GestorPedidos;
import ventasInventario.BD.Modelo.Pedido;
import ventasInventario.BD.Modelo.Usuario;

import java.awt.Font;



public class funcionarioPedidos extends JFrame {
    private static final long serialVersionUID = 1L;
    
    private JPanel navegador;
    private  JPanel SuperiorNavegador;
    private JButton btnOferta_2;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	ControladorPedidos controladorPedidos = new ControladorPedidos();
                	 ArrayList<Pedido> listaPedidos = controladorPedidos.pedidosTodos();
                	funcionarioPedidos frame = new funcionarioPedidos(listaPedidos);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public class TarjetaPedido extends JPanel {
        private static final long serialVersionUID = 1L;

        public TarjetaPedido(Pedido pedido) {
        	 
        	 setLayout(new BorderLayout()); 
             setBorder(BorderFactory.createLineBorder(Color.BLACK, 0)); 
             

            ImageIcon iconPedido = new ImageIcon(
                    "src\\imagenesJhess\\carritos3.png");
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
            buttonInfo.setBorder(BorderFactory.createLineBorder(Color.black, 2)); 
            buttonInfo.setBounds(0, 0, 300, 1500);
            buttonInfo.setBackground(new Color(167, 134, 252)); 
            
            
           
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
    public funcionarioPedidos(ArrayList<Pedido> listaPedidos) {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1200, 800);
        getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1200, 763);
        getContentPane().add(panel);
        panel.setLayout(null);

        //=============================================INICIOOOO DEL NARVAR TODOO
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
  	        
  	        
  	        
  	        
  	        
  	        
  	        //FIONNN
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
  	        Image imagePerfil = iconPerfil.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

  	        btnOferta_2 = new JButton("");
  	        btnOferta_2.setBorder(BorderFactory.createLineBorder(Color.black, 0));
  	        btnOferta_2.setBackground(new Color(117, 14, 73));
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
  //*INTERACCION DEL NARVAR

  	        
  	       
  //=============================================FIN DEL NARVAR TODOO

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(214, 166, 190));
        panel_2.setBounds(0, 137, 1200, 625);
        panel_2.setLayout(null);  
        panel.add(panel_2);
        
        JPanel panelTarjetas = new JPanel();
        panelTarjetas.setLayout(new GridLayout(0, 1, 10, 10)); 
        panelTarjetas.setBackground(Color.black); 
        panelTarjetas.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel_2.add(panelTarjetas);
        
        panelTarjetas.setBorder(BorderFactory.createLineBorder(Color.black, 2)); 
        panelTarjetas.setBackground(new Color(255, 229, 154)); 
 
        
        for (Pedido pedido : listaPedidos) {
            TarjetaPedido tarjeta = new TarjetaPedido(pedido);
          
            panelTarjetas.add(tarjeta);
        }
        panel_2.setLayout(null);
        

        JScrollPane scrollPane = new JScrollPane(panelTarjetas);
        scrollPane.setBounds(125, 147, 946, 425);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.black, 1)); 
        panel_2.add(scrollPane);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(0, 0, 0));
        panel_3.setBounds(125, 49, 946, 98);
        panel_2.add(panel_3);
        panel_3.setLayout(null);
        panel_3.setBackground(new Color(255, 229, 154)); 
        panel_3.setBorder(BorderFactory.createLineBorder(Color.black, 2)); 
        
        JLabel lblNewLabel_1 = new JLabel("Todos los pedidos");
        lblNewLabel_1.setForeground(new Color(0, 0, 0));
        lblNewLabel_1.setBounds(28, 21, 500, 66);
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 57));
        panel_3.add(lblNewLabel_1);

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
    }}
