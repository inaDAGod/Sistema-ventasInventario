package ventanasCliente;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.GroupLayout.Alignment;


public class clienteInicio extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField textFieldBuscar;
    private JRadioButton radioBoton1, radioBoton2, radioBoton3, radioBoton3_1;
    private ButtonGroup grupoRadioBotones;
    private JButton botonBuscar, botonBuscar1;
    private JPanel panelTarjetas;
    private JPanel panelBusqueda;
    private JPanel panel_2;
    private List<etiquetas> listaEtiquetas = new ArrayList<>();
    private List<productos> listaProductos = new ArrayList<>();
    private String textoBusqueda = "";
    private JScrollPane scrollPane;

    // para el carrucel 	
    private JPanel carruselPanel;
    private List<String>  listaImagenes = new ArrayList<>();
    private int currentIndex = 0;
    private Timer timer;
    
    // panelBusqueda.setBackground(Color.blue); define color
    etiquetas etiqueta1 = new etiquetas(1, "Detalle 1");
    etiquetas etiqueta2 = new etiquetas(2, "Detalle 2");
    etiquetas etiqueta3 = new etiquetas(2, "Detalle 3");
  etiquetas etiqueta4 = new etiquetas(2, "Detalle 4");
   etiquetas etiqueta5 = new etiquetas(2, "Detalle 5");
     etiquetas etiqueta6 = new etiquetas(2, "Detalle 6");
   


    productos producto1 = new productos("P1", "Producto 1", "Detalle 1", 19.99f, 100, "Marca1", "Rojo", "M", true, "src/imagenesJhess/personas.jfif");
    productos producto2 = new productos("P2", "Producto 2", "Detalle 2", 29.99f, 50, "Marca2", "Azul", "L", false, "src/imagenesJhess/personassi.jfif");
    productos producto3 = new productos("P3", "Producto 3", "Detalle 3", 15.99f, 80, "Marca3", "Verde", "S", true, "src/imagenesJhess/personassi.jfif");
    productos producto4 = new productos("P4", "Producto 4", "Detalle 2", 24.99f, 60, "Marca4", "Amarillo", "XL", false, "src/imagenesJhess/producto4.jfif");
    productos producto5 = new productos("P5", "Producto 5", "Detalle 5", 34.99f, 30, "Marca5", "Negro", "XXL", true, "src/imagenesJhess/personassi.jfif");
    productos producto6 = new productos("P6", "Producto 6", "Detalle 6", 22.99f, 45, "Marca6", "Blanco", "L", true, "src/imagenesJhess/producto6.jfif");
    productos producto7 = new productos("P6", "Producto 6", "Detalle 1", 22.99f, 45, "Marca6", "Blanco", "L", true, "src/imagenesJhess/producto6.jfif");
    //imagenes carusel	
    
 
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
            	clienteInicio frame = new clienteInicio();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public clienteInicio() {
        listaEtiquetas.add(new etiquetas(1, "Detalle 1"));
        listaEtiquetas.add(new etiquetas(2, "Detalle 2"));
        listaEtiquetas.add(new etiquetas(2, "Detalle 3"));
        listaEtiquetas.add(new etiquetas(2, "Detalle 4"));
        listaEtiquetas.add(new etiquetas(2, "Detalle 5"));
        listaEtiquetas.add(new etiquetas(2, "Detalle 6"));
        listaProductos.add(producto7);
        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);
        listaProductos.add(producto4);
        listaProductos.add(producto5);
        listaProductos.add(producto6);
        
       //imagenes carusel
        listaImagenes.add("src/imagenesJhess/personas.jfif");
        listaImagenes.add("src/imagenesJhess/lapiz");
        listaImagenes.add("src/imagenesJhess/camara");
        listaImagenes.add("src/imagenesJhess/lapiz");
        

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1200, 800);
        getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1200, 763);
        getContentPane().add(panel);
        panel.setLayout(null);

        grupoRadioBotones = new ButtonGroup();

        JPanel panel_1 = new JPanel();
        panel_1.setForeground(Color.WHITE);
        panel_1.setBounds(0, 0, 1200, 140);
        panel.add(panel_1);
       
        panel_1.setLayout(null);

        JLabel lblNewLabel = new JLabel("");
        ImageIcon icon = new ImageIcon(
                "C:\\Users\\Desktop\\Documents\\GitHub\\Sistema-ventasInventario\\src\\imagenesJhess\\personas.jfif");
        Image image = icon.getImage().getScaledInstance(139, 118, Image.SCALE_SMOOTH);
        lblNewLabel.setIcon(new ImageIcon(image));
        lblNewLabel.setBounds(24, 11, 139, 118);
        panel_1.add(lblNewLabel);

        JButton btnNewButton = new JButton("Inicio");
        btnNewButton.setBounds(226, 44, 139, 36);
        panel_1.add(btnNewButton);

        JButton btnOferta = new JButton("Productos");
        btnOferta.setBounds(394, 44, 139, 36);
        panel_1.add(btnOferta);

        JButton btnOferta_1 = new JButton("Quienes somos?");
        btnOferta_1.setBounds(729, 44, 139, 36);
        panel_1.add(btnOferta_1);

        JButton btnOferta_1_1 = new JButton("Oferta");
        btnOferta_1_1.setBounds(564, 44, 139, 36);
        panel_1.add(btnOferta_1_1);

        ImageIcon iconPerfil = new ImageIcon(
                "src/imagenesJhess/perfilpersona.png");
        Image imagePerfil = iconPerfil.getImage().getScaledInstance(130, 118, Image.SCALE_SMOOTH);

        JButton btnOferta_2 = new JButton(" holaaaaaaaaaaa");
        btnOferta_2.setIcon(new ImageIcon(imagePerfil));
        btnOferta_2.setBounds(1048, 11, 130, 118);
        panel_1.add(btnOferta_2);
        
       


        JPanel panelBase = new JPanel();
        panelBase.setBounds(0, 137, 1200, 625);
        panelBase.setLayout(null);
        panel.add(panelBase);


        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(255, 182, 193));
        panel_2.setBounds(0, 0, 1190, 625);
        panel_2.setLayout(new BorderLayout());
        panelBase.add(panel_2);
        
        JPanel panelSuperiorContainer = new JPanel(new BorderLayout());
        panel_2.add(panelSuperiorContainer, BorderLayout.NORTH);
        
       
       
        
        
        
   
      
        panelTarjetas = new JPanel();
        panelTarjetas.setLayout(new GridLayout(0, 1, 10, 10)); 
        panelTarjetas.setBackground(new Color(255, 182, 193)); 
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
                        
         radioBoton2 = new JRadioButton("Accesorios");
                                
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
        
       
        
        
       
        panelBusqueda.setBounds(0, 10, 10, 10);
        panelBusqueda.setBackground(Color.blue);
        agregarTarjetasPedidos(listaEtiquetas);     
        restaurarEstadoOriginal();

    }
    
    

    private void agregarTarjetasPedidos(List<etiquetas> listaEtiquetas) {
    	
    	
    	 
         
        for (etiquetas eti : listaEtiquetas) {
            TarjetaPedido tarjeta = new TarjetaPedido(eti);
      
			System.out.println("blcle de categora"+eti.getCtiquetas());
            panelTarjetas.add(tarjeta); 
        }
      
        panelTarjetas.revalidate();
        panelTarjetas.repaint();
        
       
    }
    
    
    private void filtrarTarjetas(List<etiquetas> listaEtiquetas) {
     
    	panelTarjetas.removeAll();
    	
        String tipoDetalleSeleccionado = obtenerTipoDetalleSeleccionado();
        
        JPanel panelBusqueda = new JPanel();
        
        panelBusqueda.setBounds(0, 0, 0, 0);
        panelBusqueda.setBackground(new Color(255, 182, 193));
        panelBusqueda.setLayout(null);
        
        //*CARRUSEL
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(255, 182, 193));
        panel_2.setBounds(0, 0, 1190, 625);
        panel_2.setLayout(new BorderLayout());
      
        
        JPanel panelSuperiorContainer = new JPanel(new BorderLayout());
        panelSuperiorContainer.setBackground(Color.blue);
        panel_2.add(panelSuperiorContainer, BorderLayout.NORTH);
        
        carruselPanel = new JPanel(new BorderLayout());
        
        getContentPane().add(carruselPanel, BorderLayout.CENTER);
        carruselPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10,10)); 
        JButton prevButton = new JButton("Anterior");
        JButton nextButton = new JButton("Siguiente");

        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showPreviousImage();
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showNextImage();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);
        buttonPanel.setBackground(new Color(255, 182, 193));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0)); 
      
        JLabel labelImagen7 = new JLabel("BIENVENIDOS A NEA");
        labelImagen7.setFont(new Font("Times New Roman", Font.PLAIN, 70));
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
        radioBoton1.setBackground(new Color(255, 182, 193));
        panelBusqueda.add(radioBoton1);

        radioBoton2 = new JRadioButton("Accesorios");
        radioBoton2.setBackground(new Color(255, 182, 193));
        radioBoton2.setBounds(495, 150, 100, 30);
        panelBusqueda.add(radioBoton2);

        radioBoton3 = new JRadioButton("Maquillaje");
        radioBoton3.setBounds(699, 150, 100, 30);
        radioBoton3.setBackground(new Color(255, 182, 193));
        panelBusqueda.add(radioBoton3);
        
        radioBoton3_1 = new JRadioButton("Todo");
        radioBoton3_1.setBounds(861, 150, 100, 30);
        radioBoton3_1.setBackground(new Color(255, 182, 193));
        panelBusqueda.add(radioBoton3_1);
        

        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
        grupoRadioBotones.add(radioBoton3_1);
        
        botonBuscar = new JButton("Buscar");
        botonBuscar.setBounds(911, 263, 100, 30);
        panelBusqueda.add(botonBuscar);
        
        
        JLabel lblNewLabel_11 = new JLabel("Novedades del mes");
        lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 70));
        lblNewLabel_11.setBounds(10, 0, 1200, 150);
        panelBusqueda.add(lblNewLabel_11); 
  
        JLabel lblNewLabel_1 = new JLabel("SELECCIONE LA CATEGORIA:");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(10, 150, 350, 32);
        panelBusqueda.add(lblNewLabel_1); 
        
        
        JLabel lblNewLabel_1_1 = new JLabel("INGRESE DATOS EL NOMBRE DEL PRODUCTO :");
        lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNewLabel_1_1.setBounds(10, 202, 800, 32);
        panelBusqueda.add(lblNewLabel_1_1);
      
   
        
        
      
        
        


        panelTarjetas.add(panelBusqueda);
     
       
        
       
        for (etiquetas eti : listaEtiquetas) {
            if (eti.getDetalle().equals(tipoDetalleSeleccionado)) {
                
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
            }
        });
        radioBoton1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                	filtrarTarjetas(listaEtiquetas);
                }
            }
        });

        radioBoton2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                	filtrarTarjetas(listaEtiquetas);
                }
            }
        });

        radioBoton3.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                
                    filtrarTarjetas(listaEtiquetas);
                }
            }
        });
        radioBoton3_1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                
                	 restaurarEstadoOriginal();
                }
            }
        });
    }

    private String obtenerTipoDetalleSeleccionado() {
        if (radioBoton1.isSelected()) {
            return "Detalle 1";
        } else if (radioBoton2.isSelected()) {
            return "Detalle 2";
        } else if (radioBoton3.isSelected()) {
            return "Detalle 3";
        }
       
        return "";
    }
    
    
    private void restaurarEstadoOriginal() {
        
        panelTarjetas.removeAll();
      filtrarTarjetas(listaEtiquetas);
        agregarTarjetasPedidos(listaEtiquetas);
         panelTarjetas.revalidate();
        panelTarjetas.repaint();
    }
    
    
    
    private void buscarPorNombre(String nombre) {
       

    	filtrarTarjetas(listaEtiquetas); 
    	TarjetaProducto tarjeta = new TarjetaProducto(nombre);
         
			System.out.println("blcle de categora"+nombre);
         panelTarjetas.add(tarjeta);
       
         textFieldBuscar.setText(textoBusqueda);
    
     panelTarjetas.revalidate();
     panelTarjetas.repaint();
        
        
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
        carruselPanel.setBackground(new Color(255, 182, 193));
        String imagePath = listaImagenes.get(currentIndex);
        ImageIcon imageIcon12 = new ImageIcon(new ImageIcon(imagePath).getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT));
        JLabel imageLabel3 = new JLabel(imageIcon12);
        carruselPanel.add(imageLabel3);
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

        public TarjetaPedido(etiquetas etiqueta) {
        	
            setLayout(new BorderLayout()); 
            setBorder(BorderFactory.createLineBorder(Color.WHITE, 1)); 

            JPanel panelTexto = new JPanel();
            panelTexto.setBackground(new Color(0, 0, 0));
            panelTexto.setLayout(new BorderLayout());
            System.out.println(etiqueta.getDetalle());
            JLabel lblRopa = new JLabel(etiqueta.getDetalle());
            lblRopa.setForeground(new Color(255, 255, 255));
            lblRopa.setFont(new Font("Times New Roman", Font.PLAIN, 50));
            lblRopa.setHorizontalAlignment(JLabel.LEFT);

            panelTexto.add(lblRopa, BorderLayout.CENTER);

            
            add(panelTexto, BorderLayout.NORTH);

            JPanel panelTarjetas = new JPanel();
            panelTarjetas.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10)); 
            panelTarjetas.setBackground(Color.black); 
            panelTarjetas.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2)); 

            
           
            for (productos producto11 : listaProductos) {
            	if(etiqueta.getDetalle().equals(producto11.getDescripcion())) {
                JPanel cardPanel = new JPanel();
                cardPanel.setLayout(new BoxLayout(cardPanel, BoxLayout.Y_AXIS));
                cardPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

                JButton buttonProducto = new JButton();
                buttonProducto.setLayout(new GridBagLayout());

                ImageIcon iconProducto = new ImageIcon(producto11.getRuta_imagen());

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

                JPanel panelDetalles = new JPanel();
                panelDetalles.setBackground(Color.BLACK);
         
              

                buttonProducto.add(panelDetalles, gbc);
                buttonProducto.setPreferredSize(new Dimension(anchuraCalculada, alturaDeseada));

                Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

              
                buttonProducto.setBackground(Color.BLACK);

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
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
            scrollPane.setPreferredSize(new Dimension(400, 200));
            scrollPane.setBackground(Color.white);

          
            add(scrollPane, BorderLayout.CENTER);

            setBackground(Color.WHITE);
        }}}
    
    
    
        public class TarjetaProducto extends JPanel {
            private static final long serialVersionUID = 1L;

            public TarjetaProducto(String nombre) {
            	
                setLayout(new BorderLayout());
                setBorder(BorderFactory.createLineBorder(Color.WHITE, 1)); 

              
                JPanel panelTexto = new JPanel();
                panelTexto.setBackground(new Color(0, 0, 0));
                panelTexto.setLayout(new BorderLayout());
                

               
                add(panelTexto, BorderLayout.NORTH);

                JPanel panelTarjetas = new JPanel();
                panelTarjetas.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10)); 
                panelTarjetas.setBackground(Color.black); 
                panelTarjetas.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); 
 for (productos producto11 : listaProductos) {
                	
                	 if (producto11.getNombre().toLowerCase().contains(nombre.toLowerCase())) 
                	 {System.out.println("nombnrProductos ("+producto11.getNombre()+")== nombreBuscado ("+nombre+")");
                	 System.out.println("resultado  ("+producto11.getNombre().toLowerCase().contains(nombre.toLowerCase())+")");
                    JPanel cardPanel = new JPanel();
                    cardPanel.setLayout(new BoxLayout(cardPanel, BoxLayout.Y_AXIS));
                    cardPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

                    JButton buttonProducto = new JButton();
                    buttonProducto.setLayout(new GridBagLayout());

                    ImageIcon iconProducto = new ImageIcon(producto11.getRuta_imagen());

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

                    JPanel panelDetalles = new JPanel();
                    panelDetalles.setBackground(Color.BLACK);
             
                  

                    buttonProducto.add(panelDetalles, gbc);
                    buttonProducto.setPreferredSize(new Dimension(anchuraCalculada, alturaDeseada));

                    Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

                
                    buttonProducto.setBackground(Color.BLACK);

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
                scrollPane.setBackground(Color.white);

               
                add(scrollPane, BorderLayout.CENTER);

                setBackground(Color.WHITE);
            }}

        }}

   
    
    
    
    
    
