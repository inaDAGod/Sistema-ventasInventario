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
    private JPanel panelSuperior; 
    private JPanel panelInferior;
    
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

        JButton btnOferta_2 = new JButton("");
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

        this.panelSuperior = new JPanel();
        this.panelSuperior.setBackground(new Color(255, 182, 193));
        this.panelSuperior.setLayout(new FlowLayout(FlowLayout.CENTER)); 
        panelSuperiorContainer.add(new JScrollPane(panelSuperior), BorderLayout.CENTER);
        	
        
        
        ImageIcon imagen1 = new ImageIcon("src/imagenesJhess/perfilpersona.png");
        JLabel labelImagen1 = new JLabel(imagen1);
        this.panelSuperior.add(labelImagen1);

        ImageIcon imagen2 = new ImageIcon("src/imagenesJhess/perfilpersona.png");
        JLabel labelImagen2 = new JLabel(imagen2);
        this.panelSuperior.add(labelImagen2);

        ImageIcon imagen3 = new ImageIcon("src/imagenesJhess/perfilpersona.png");
        JLabel labelImagen3 = new JLabel(imagen3);
        this.panelSuperior.add(labelImagen3);

       
        panelTarjetas = new JPanel();
        panelTarjetas.setLayout(new GridLayout(0, 1, 10, 10)); 
        panelTarjetas.setBackground(new Color(255, 182, 193)); 
        panelTarjetas.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); 
        JPanel panelTexto5 = new JPanel();
   
      
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
       
        panelTarjetas.add(panelBusqueda);
        
           
        textFieldBuscar = new JTextField();
                
                        radioBoton1 = new JRadioButton("Ropa");
                        
                                radioBoton2 = new JRadioButton("Accesorios");
                                
                                        radioBoton3 = new JRadioButton("Maquillaje");
                                        
                                        radioBoton3_1 = new JRadioButton("Todo");
                                      
                                        
                                        
                                        grupoRadioBotones.add(radioBoton1);
                                        grupoRadioBotones.add(radioBoton2);
                                        grupoRadioBotones.add(radioBoton3);
                                       
                                        
                                                botonBuscar = new JButton("Buscar");
                                                
                                                      
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
                                                        
                                                        
                                                        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
                                                        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS); // Cambié a VERTICAL_SCROLLBAR_ALWAYS
                                                        scrollPane.setBounds(0, 0, 1190, 500);
                                                        panel_2.add(scrollPane);
       
        panelTarjetas.add(panelBusqueda, BorderLayout.NORTH);
        
        JLabel lblNewLabel_1 = new JLabel("INGRESE DATOS A BUSCAR :");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        
       
        
        JLabel lblNewLabel_1_1 = new JLabel("SELECCIONE EL DATO:");
        lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));

       
        panelTarjetas.add(panelBusqueda, BorderLayout.NORTH);
        GroupLayout gl_panelBusqueda = new GroupLayout(panelBusqueda);
        gl_panelBusqueda.setHorizontalGroup(
        	gl_panelBusqueda.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panelBusqueda.createSequentialGroup()
        			.addGap(10)
        			.addGroup(gl_panelBusqueda.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_panelBusqueda.createSequentialGroup()
        					.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
        					.addGap(10)
        					.addComponent(radioBoton1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        					.addGap(65)
        					.addComponent(radioBoton2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        					.addGap(80)
        					.addComponent(radioBoton3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        					.addGap(77)
        					.addComponent(radioBoton3_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
        				.addGroup(gl_panelBusqueda.createSequentialGroup()
        					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
        					.addGap(30)
        					.addComponent(textFieldBuscar, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE)
        					.addGap(55)
        					.addComponent(botonBuscar, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))))
        );
        gl_panelBusqueda.setVerticalGroup(
        	gl_panelBusqueda.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panelBusqueda.createSequentialGroup()
        			.addGap(11)
        			.addGroup(gl_panelBusqueda.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
        				.addGroup(gl_panelBusqueda.createSequentialGroup()
        					.addGap(3)
        					.addComponent(radioBoton1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        				.addGroup(gl_panelBusqueda.createSequentialGroup()
        					.addGap(3)
        					.addComponent(radioBoton2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        				.addGroup(gl_panelBusqueda.createSequentialGroup()
        					.addGap(3)
        					.addComponent(radioBoton3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        				.addGroup(gl_panelBusqueda.createSequentialGroup()
        					.addGap(3)
        					.addComponent(radioBoton3_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
        			.addGap(27)
        			.addGroup(gl_panelBusqueda.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
        				.addGroup(gl_panelBusqueda.createSequentialGroup()
        					.addGap(3)
        					.addComponent(textFieldBuscar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        				.addGroup(gl_panelBusqueda.createSequentialGroup()
        					.addGap(3)
        					.addComponent(botonBuscar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))))
        );
        panelBusqueda.setLayout(gl_panelBusqueda);

     
        agregarTarjetasPedidos(listaEtiquetas);
        
       
      

     
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
        panelBusqueda.setBackground(new Color(255, 182, 193));
        panelBusqueda.setLayout(null);

        textFieldBuscar = new JTextField();
        textFieldBuscar.setBounds(294, 263, 530, 30);
        panelBusqueda.add(textFieldBuscar);

        radioBoton1 = new JRadioButton("Ropa");
        radioBoton1.setBounds(304, 205, 100, 30);
        panelBusqueda.add(radioBoton1);

        radioBoton2 = new JRadioButton("Accesorios");
        radioBoton2.setBounds(495, 205, 100, 30);
        panelBusqueda.add(radioBoton2);

        radioBoton3 = new JRadioButton("Maquillaje");
        radioBoton3.setBounds(699, 205, 100, 30);
        panelBusqueda.add(radioBoton3);
        
        radioBoton3_1 = new JRadioButton("Todo");
        radioBoton3_1.setBounds(861, 205, 100, 30);
        panelBusqueda.add(radioBoton3_1);
        

        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
        grupoRadioBotones.add(radioBoton3_1);
        
        botonBuscar = new JButton("Buscar");
        botonBuscar.setBounds(911, 263, 100, 30);
        panelBusqueda.add(botonBuscar);
        
        JLabel lblNewLabel_1 = new JLabel("INGRESE DATOS A BUSCAR :");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(10, 260, 274, 32);
        panelBusqueda.add(lblNewLabel_1); 
        
        
        JLabel lblNewLabel_1_1 = new JLabel("SELECCIONE EL DATO:");
        lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNewLabel_1_1.setBounds(10, 202, 274, 32);
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
                int anchuraCalculada = (alturaDeseada * iconProducto.getIconWidth()) / iconProducto.getIconHeight();
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
            scrollPane.setPreferredSize(new Dimension(400, 300));
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
                    int anchuraCalculada = (alturaDeseada * iconProducto.getIconWidth()) / iconProducto.getIconHeight();
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

   
    
    
    
    
    
