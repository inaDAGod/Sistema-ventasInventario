package ventanasFuncionario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

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

import ventanasCliente.etiquetas;
import ventanasCliente.productos;


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
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.DefaultXYZDataset;




public class funcionarioEstadisticas extends JFrame {
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
    
    
    private JPanel navegador;
    private  JPanel SuperiorNavegador;
    private JButton btnOferta_2;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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
    

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					funcionarioEstadisticas frame = new funcionarioEstadisticas();
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
	public funcionarioEstadisticas() {
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

        // Crear panel para el título
        JPanel titlePanel = new JPanel();
        titlePanel.setBounds(0, 0, 1190, 50);
        titlePanel.setBackground(new Color(214, 166, 190));
        panelBase.add(titlePanel);

        // Agregar etiqueta con el título
        JLabel titleLabel = new JLabel("Estadísticas");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titlePanel.add(titleLabel);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(214, 166, 190));
        panel_2.setBounds(0, 50, 1190, 575); // Ajustar la posición para dejar espacio para el título
        panel_2.setLayout(new GridLayout(2, 2));
        panelBase.add(panel_2);

    

        // Crear y agregar el segundo gráfico
        DefaultCategoryDataset dataset2 = createDatasetBarrasApiladas();
        JFreeChart chart2 = createCustomBarChart(dataset2, "Categorías", "Valores", "Gráfico 2");
        ChartPanel chartPanel2 = new ChartPanel(chart2);
        panel_2.add(chartPanel2);

        // Crear y agregar un nuevo diseño de gráfico de pastel
        DefaultPieDataset dataset41 = createDatasetTorta();
        JFreeChart chart41 = createCustomPieChart("Gráfico 1", dataset41);
        ChartPanel chartPanel41 = new ChartPanel(chart41);
        panel_2.add(chartPanel41);

        // Crear y agregar el cuarto gráfico
        DefaultPieDataset dataset4 = createDatasetTorta();
        JFreeChart chart4 = createCustomPieChart("Gráfico 4", dataset4);
        ChartPanel chartPanel4 = new ChartPanel(chart4);
        panel_2.add(chartPanel4);

        // Crear y agregar el tercer gráfico
        CategoryDataset dataset3 = createDatasetLinea();
        JFreeChart chart3 =createCustomLineChart(dataset3, "Categorías", "Valores", "Gráfico 3");
        ChartPanel chartPanel3 = new ChartPanel(chart3);
        panel_2.add(chartPanel3);
    }
	
	private DefaultCategoryDataset createDatasetBarrasApiladas() {
	    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	    dataset.addValue(25, "Categoría 1", "Mes 1");
	    dataset.addValue(40, "Categoría 2", "Mes 1");
	    dataset.addValue(30, "Categoría 3", "Mes 1");
	    dataset.addValue(55, "Categoría 4", "Mes 1");
	    
	    dataset.addValue(15, "Categoría 1", "Mes 2");
	    dataset.addValue(20, "Categoría 2", "Mes 2");
	    dataset.addValue(40, "Categoría 3", "Mes 2");
	    dataset.addValue(30, "Categoría 4", "Mes 2");
	    return dataset;
	}
	
	private CategoryDataset createDatasetLinea() {
	    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	    dataset.addValue(25, "Categoría 1", "Mes 1");
	    dataset.addValue(40, "Categoría 2", "Mes 2");
	    dataset.addValue(30, "Categoría 3", "Mes 3");
	    dataset.addValue(55, "Categoría 4", "Mes 4");
	    return dataset;
	}
	
	private DefaultPieDataset createDatasetTorta() {
	    DefaultPieDataset dataset = new DefaultPieDataset();
	    dataset.setValue("Categoría 1", 25);
	    dataset.setValue("Categoría 2", 40);
	    dataset.setValue("Categoría 3", 30);
	    dataset.setValue("Categoría 4", 55);
	    return dataset;
	}
	
	
	
	private JFreeChart createCustomPieChart(String title, DefaultPieDataset dataset) {
	    JFreeChart chart = ChartFactory.createPieChart(title, dataset, true, true, false);

	    PiePlot plot = (PiePlot) chart.getPlot();
	    
	    // Cambiar colores de sección
	    plot.setSectionPaint("Categoría 1", new Color(255, 0, 0));  // Rojo
	    plot.setSectionPaint("Categoría 2", new Color(0, 0, 255));  // Azul
	    plot.setSectionPaint("Categoría 3", new Color(0, 255, 0));  // Verde
	    plot.setSectionPaint("Categoría 4", new Color(255, 255, 0));  // Amarillo

	    // Ajustar el grosor del borde entre las secciones
	    plot.setSectionOutlineStroke("Categoría 1", new BasicStroke(2.0f));
	    plot.setSectionOutlineStroke("Categoría 2", new BasicStroke(2.0f));
	    plot.setSectionOutlineStroke("Categoría 3", new BasicStroke(2.0f));
	    plot.setSectionOutlineStroke("Categoría 4", new BasicStroke(2.0f));

	    // Cambiar la profundidad del pastel (efecto de 3D)
	   

	    // Cambiar la separación entre las secciones
	    plot.setExplodePercent("Categoría 1", 0.1);
	    plot.setExplodePercent("Categoría 2", 0.0); // No se separa
	    plot.setExplodePercent("Categoría 3", 0.1);
	    plot.setExplodePercent("Categoría 4", 0.0); // No se separa

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

	    CategoryPlot plot = chart.getCategoryPlot();
	    BarRenderer renderer = (BarRenderer) plot.getRenderer();

	    // Personalizar colores de las barras
	    renderer.setSeriesPaint(0, Color.black);
	    renderer.setSeriesPaint(1, Color.BLUE);
	    renderer.setSeriesPaint(2, Color.GREEN);
	    renderer.setSeriesPaint(3, Color.YELLOW);

	    // Ajustar el espacio entre las categorías (opcional)
	    renderer.setItemMargin(0.1);

	    return chart;
	}

	private JFreeChart createCustomLineChart(CategoryDataset dataset, String title, String categoryAxisLabel, String valueAxisLabel) {
	    JFreeChart chart = ChartFactory.createLineChart(
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
	    LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();

	    // Personalizar colores y formas de las líneas y puntos
	    renderer.setSeriesPaint(0, Color.RED);
	    renderer.setSeriesShapesVisible(0, true);
	    renderer.setSeriesShape(0, new Ellipse2D.Double(-2, -2, 4, 4));

	    renderer.setSeriesPaint(1, Color.BLUE);
	    renderer.setSeriesShapesVisible(1, true);
	    renderer.setSeriesShape(1, new Rectangle2D.Double(-2, -2, 4, 4));
	    
	    renderer.setSeriesPaint(2, Color.RED);
	    renderer.setSeriesShapesVisible(2, true);
	    renderer.setSeriesShape(2, new Ellipse2D.Double(-2, -2, 4, 4));

	    renderer.setSeriesPaint(3, Color.BLUE);
	    renderer.setSeriesShapesVisible(3, true);
	    renderer.setSeriesShape(3, new Rectangle2D.Double(-2, -2, 4, 4));

	    // Puedes continuar de manera similar para las demás series

	    return chart;
	}

}
