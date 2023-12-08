package ventanasFuncionario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.stream.Collectors;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



import javax.swing.*;
import java.awt.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.ui.RectangleInsets;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.DefaultXYZDataset;

import ventasInventario.BD.Modelo.GestorPedidos;
import ventasInventario.BD.Modelo.Usuario;




public class funcionarioEstadisticas extends JFrame {
	
    
    private JPanel navegador;
    private  JPanel SuperiorNavegador;
    private JButton btnOferta_2;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Usuario usuario;
    // panelBusqueda.setBackground(Color.blue); define color
 
    

	/**
	 * Launch the application.
	 *//*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario u = new Usuario("funci");
					funcionarioEstadisticas frame = new funcionarioEstadisticas(u);
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
	public funcionarioEstadisticas(Usuario u) {
		this.usuario = u;
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
        
       

        JPanel panelBase = new JPanel();
        panelBase.setBounds(0, 137, 1200, 625);
        panelBase.setLayout(null);
        panel.add(panelBase);

        // Crear panel para el título
        JPanel titlePanel = new JPanel();
        titlePanel.setBounds(0, 0, 1190, 50);
        titlePanel.setBackground(new Color(214, 166, 190));
        panelBase.add(titlePanel);

        // Agregar etiqueta con el título
        JLabel titleLabel = new JLabel("ESTADISTICAS");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
        titlePanel.add(titleLabel);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(214, 166, 190));
        panel_2.setBounds(0, 50, 1190, 575); // Ajustar la posición para dejar espacio para el título
        panel_2.setLayout(new GridLayout(2, 2));
        panelBase.add(panel_2);

    

        // por cantidad de compras de usuarios
        CategoryDataset dataset2 = createDatasetBarrasUsuarios();
        JFreeChart chart2 = createCustomBarChartUsuarios(dataset2, "Clientes con más compras", "Clientes", "Cantidad de compras");
        ChartPanel chartPanel2 = new ChartPanel(chart2);
        panel_2.add(chartPanel2);
        
        

        // PASTEL DE ESTADO DE PEDIDOS
        DefaultPieDataset dataset41 = createDatasetTorta();
        JFreeChart chart41 = createCustomPieChart("Estado de los pedidos", dataset41);
        ChartPanel chartPanel41 = new ChartPanel(chart41);
        panel_2.add(chartPanel41);

        // pastel por categorias
        DefaultPieDataset dataset4 = createDatasetTortaEtiquetas();
        JFreeChart chart4 = createCustomPieChart("Categorias más vendidas", dataset4);
        ChartPanel chartPanel4 = new ChartPanel(chart4);
        panel_2.add(chartPanel4);

        // productos mas vendidos
        DefaultCategoryDataset dataset3 = (DefaultCategoryDataset) createDatasetBarrasProducto();
        JFreeChart chart3 = createCustomBarChart(dataset3, "Productos más vendidos", "Productos", "Cantidad ");
        ChartPanel chartPanel3 = new ChartPanel(chart3);
        panel_2.add(chartPanel3);
        
        btnOferta_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               

            	chartPanel41.setVisible(false);
            	chartPanel3.setVisible(false);
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
	
	
	//* CANTIDAD DE ESTADOS DE PEDIDO
	private static DefaultPieDataset createDatasetTorta() {
        GestorPedidos gestorPedidos = new GestorPedidos();
        HashMap<String, Integer> estadisticas = gestorPedidos.obtenerEstadisticasEstados();

        DefaultPieDataset dataset = new DefaultPieDataset();
        for (String estado : estadisticas.keySet()) {
            dataset.setValue(estado, estadisticas.get(estado));
            System.out.println("Estado: " + estado + ", Cantidad de pedidos: " + estadisticas.get(estado));
            
        }

        return dataset;
    }
	//*CANTIDAD VENDIDA POR ETIQUETAS
	private DefaultPieDataset createDatasetTortaEtiquetas() {
		  System.out.println("entre ");
	    DefaultPieDataset dataset = new DefaultPieDataset();
	    GestorPedidos gestorPedidos = new GestorPedidos();
		  System.out.println("paseo ");

	    // Obtener estadísticas de etiquetas para pedidos finalizados
	    HashMap<String, Integer> estadisticasEtiquetas = gestorPedidos.obtenerEstadisticasEtiquetas("FINALIZADO");
	    System.out.println("Tamaño del HashMap: " + estadisticasEtiquetas.size());
	    System.out.println("sigo ");
	    // Agregar datos al dataset
	    for (Map.Entry<String, Integer> entry : estadisticasEtiquetas.entrySet()) {
	    	System.out.println("ya entreee AAAAAAA ");
	        dataset.setValue(entry.getKey(), entry.getValue());
	        System.out.println("Etiqueta: " + entry.getKey() + ", Cantidad de pedidos: " + entry.getValue());
	    }

	    return dataset;
	}
	
	//* UsuaRIOOS CON MAS COMPRAS
	private CategoryDataset createDatasetBarrasUsuarios() {
	    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	    GestorPedidos gestorPedidos = new GestorPedidos();
	     HashMap<String, Integer> estadisticasUsuarios = gestorPedidos.obtenerEstadisticasUsuarios("FINALIZADO");
	     List<Map.Entry<String, Integer>> usuariosOrdenados = estadisticasUsuarios.entrySet().stream()
	            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
	            .limit(5)
	            .collect(Collectors.toList());
	     for (Map.Entry<String, Integer> entry : usuariosOrdenados) {
	        dataset.addValue(entry.getValue(), "FINALIZADO", entry.getKey());
	    }

	    return dataset;
	}
	//Categorias mas vendidas
	private CategoryDataset createDatasetBarrasProducto() {
	
	    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	    GestorPedidos gestorPedidos = new GestorPedidos();
	   HashMap<String, Integer> estadisticasProductos = gestorPedidos.obtenerEstadisticasProductos("FINALIZADO");
	    List<Map.Entry<String, Integer>> productosOrdenados = estadisticasProductos.entrySet().stream()
	            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
	            .limit(5)
	            .collect(Collectors.toList());
	   for (Map.Entry<String, Integer> entry : productosOrdenados) {
	        dataset.addValue(entry.getValue(), "Productos", entry.getKey());
	        System.out.println(entry.getValue()+"Productos "+ entry.getKey());
	    }
	    
	    return dataset;
	}
	
	
	
	
	private JFreeChart createCustomPieChart(String title, DefaultPieDataset dataset) {
	    JFreeChart chart = ChartFactory.createPieChart(title, dataset, true, true, false);

	    // Obtener el Plot del gráfico
	    PiePlot plot = (PiePlot) chart.getPlot();

	   
	    // Cambiar colores de sección
	    plot.setSectionPaint("MAQUILLAJE", new Color(255, 229, 154));  
	    plot.setSectionPaint("ROPA", new Color(165, 195, 200));   
	    plot.setSectionPaint("COSMETICO", new Color(240, 220, 230));  
	    plot.setSectionPaint("CABELLO", new Color(140, 130, 185));  
	    
	    plot.setSectionPaint("ESPERA PAGO", new Color(165, 195, 200));  
	    plot.setSectionPaint("FINALIZADO", new Color(240, 220, 230));  
	    plot.setSectionPaint("PAGADO A ENTREGAR", new Color(140, 130, 185));  
	    plot.setSectionPaint("CANCELADO", new Color(255, 229, 154)); 

	    // Ajustar el grosor del borde entre las secciones
	    plot.setSectionOutlineStroke("MAQUILLAJ", new BasicStroke(2.0f));
	    plot.setSectionOutlineStroke("ROPA", new BasicStroke(2.0f));
	    plot.setSectionOutlineStroke("CABELLO", new BasicStroke(2.0f));
	    plot.setSectionOutlineStroke("COSMETICO", new BasicStroke(2.0f));
	    
	    plot.setSectionOutlineStroke("ESPERA PAGO", new BasicStroke(2.0f));
	    plot.setSectionOutlineStroke("PAGADO A ENTREGAR", new BasicStroke(2.0f));
	    plot.setSectionOutlineStroke("FINALIZADO", new BasicStroke(2.0f));
	    plot.setSectionOutlineStroke("CANCELADO", new BasicStroke(2.0f));


	    // Cambiar la separación entre las secciones
	    plot.setExplodePercent("CABELLO", 0.1);
	    plot.setExplodePercent("COSMETICO 2", 0.1); 
	    plot.setExplodePercent("ROPA", 0.1);
	    plot.setExplodePercent("MAQUILLAJE", 0.1);
	    
	    plot.setExplodePercent("FINALIZADO", 0.1); 
	    plot.setExplodePercent("PAGADO A ENTREGAR", 0.1);
	    plot.setExplodePercent("MAQUILLAJE", 0.1);
	    plot.setExplodePercent("CANCELADO", 0.1); 


	    // Personalizar el fondo del gráfico
	    chart.setBackgroundPaint(new Color(214, 166, 190));  // Rosado

	    // Personalizar la apariencia de la sección
	    plot.setSectionOutlinesVisible(true);
	    plot.setLabelBackgroundPaint(new Color(255, 229, 154)); // Color del fondo de las etiquetas
	    plot.setLabelOutlinePaint(null); // Desactivar el borde de las etiquetas
	    plot.setLabelShadowPaint(null); // Desactivar la sombra de las etiquetas

	    // Personalizar la leyenda
	    LegendTitle legend = chart.getLegend();
	    legend.setBackgroundPaint(new Color(214, 166, 190)); // Color del fondo de la leyenda
	    legend.setItemPaint(new Color(0, 0, 0)); // Color del texto de la leyenda

	  

	    return chart;
	}

	private JFreeChart createCustomBarChart(DefaultCategoryDataset dataset, String title, String categoryAxisLabel, String valueAxisLabel) {
	    JFreeChart chart = ChartFactory.createBarChart(
	            title,
	            categoryAxisLabel,
	            valueAxisLabel,
	            dataset,
	            PlotOrientation.VERTICAL,
	            true,
	            true,
	            false
	    );

	    // Obtener el Plot del gráfico
	    CategoryPlot plot = chart.getCategoryPlot();

	    // Usar un StackedBarRenderer
	    StackedBarRenderer renderer = new StackedBarRenderer();
	    plot.setRenderer(renderer);

	    // Personalizar colores de las barras
	    renderer.setSeriesPaint(0, new Color(255, 229, 154));  // Púrpura
	    
	    // Ajustar el espacio entre las categorías (opcional)
	    renderer.setItemMargin(0.1);

	    // Personalizar el fondo del gráfico
	    chart.setBackgroundPaint(new Color(214, 166, 190));  // Rosado
	    
	    LegendTitle legend = chart.getLegend();
	    legend.setBackgroundPaint(new Color(214, 166, 190)); // Color del fondo de la leyenda
	    legend.setItemPaint(new Color(0, 0, 0)); // Color del texto de la leyenda
	    return chart;
	}


	//*clientes 
	
	private JFreeChart createCustomBarChartUsuarios(CategoryDataset dataset, String title, String categoryAxisLabel, String valueAxisLabel) {
	    JFreeChart chart = ChartFactory.createBarChart(
	            title,
	            categoryAxisLabel,
	            valueAxisLabel,
	            dataset,
	            PlotOrientation.VERTICAL,
	            true,
	            true,
	            false
	    );

	    CategoryPlot plot = chart.getCategoryPlot();

	    // Usar un StackedBarRenderer
	    StackedBarRenderer renderer = new StackedBarRenderer();
	    plot.setRenderer(renderer);

	    // Personalizar colores de las barras
	    renderer.setSeriesPaint(0, new Color(162, 195, 200));  // Púrpura
	    renderer.setSeriesPaint(1, Color.BLUE);
	    renderer.setSeriesPaint(2, Color.GREEN);
	    renderer.setSeriesPaint(3, Color.YELLOW);

	    // Ajustar el espacio entre las categorías (opcional)
	    renderer.setItemMargin(0.1);

	    // Ajustes adicionales
	    plot.setInsets(new RectangleInsets(10, 0, 0, 0));  // Ajustar márgenes

	    // Personalizar el fondo del gráfico
	    chart.setBackgroundPaint(new Color(214, 166, 190));  // Rosado
	    LegendTitle legend = chart.getLegend();
	    legend.setBackgroundPaint(new Color(214, 166, 190)); // Color del fondo de la leyenda
	    legend.setItemPaint(new Color(0, 0, 0)); // Color del texto de la leyenda
	    return chart;
	}
	
	

}
