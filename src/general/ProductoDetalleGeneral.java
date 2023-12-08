package general;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import ventasInventario.Carrito;
import ventasInventario.PanelProductoCliente;
import ventasInventario.ProductoCliente;
import ventasInventario.BD.Modelo.GestorProductos;
import ventasInventario.BD.Modelo.Producto;
import ventasInventario.BD.Modelo.Usuario;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductoDetalleGeneral extends JFrame {

	JPanel contentPane;
	JScrollPane scrollPane;
	JTable tabla;
	PanelProductoCliente pinv;
	private JPanel navegador;
	private JPanel SuperiorNavegador;
	private JFrame framePasada;
	
	public ProductoDetalleGeneral( Producto producto,JFrame framePasada) {
		this.framePasada = framePasada;
		setResizable(false);
        //narvar
        navegador = new JPanel();
		navegador.setLayout(new BorderLayout());
		navegador.setBackground(new Color(250, 232, 235));
		navegador.setLayout(null);
		navegador.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		navegador.setBounds(850, 0, 350, 800);
		getContentPane().add(navegador);
		navegador.setVisible(false);

		SuperiorNavegador = new JPanel();
		SuperiorNavegador.setBackground(new Color(205, 159, 204));
		SuperiorNavegador.setLayout(null);
		SuperiorNavegador.setBounds(0, 0, 350, 100);
		navegador.add(SuperiorNavegador);
		SuperiorNavegador.setVisible(false);
		SuperiorNavegador.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		
        //panel superior
        
	
        
        JButton btnBack = new JButton("");
        btnBack.setIcon(new ImageIcon(ProductoCliente.class.getResource("/imagenes/backrosa1(50x50).jpg")));
        btnBack.setHorizontalTextPosition(SwingConstants.CENTER);
        btnBack.setBounds(1124, 35, 50, 50);
        btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				framePasada.setVisible(true);
				setVisible(false);
			}
		});
        getContentPane().add(btnBack);
        
        JButton btnLogo = new JButton("");
        btnLogo.setIcon(new ImageIcon(Carrito.class.getResource("/imagenes/logo.jpg")));
        btnLogo.setHorizontalTextPosition(SwingConstants.CENTER);
        btnLogo.setBounds(42, 10, 200, 100);
        getContentPane().add(btnLogo);
        
        JButton btnInicio = new JButton("Inicio");
		btnInicio.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		btnInicio.setBackground(new Color(220, 100, 150));
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InicioGeneral frame = new InicioGeneral();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnInicio.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnInicio.setForeground(Color.WHITE);
		btnInicio.setBounds(330, 44, 125, 36);
		getContentPane().add(btnInicio);

		JButton btnProductos = new JButton("Productos");
		btnProductos.setBackground(new Color(220, 100, 150));
		btnProductos.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		btnProductos.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnProductos.setForeground(Color.WHITE);
		btnProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generalProductos frame = new generalProductos();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnProductos.setBounds(454, 44, 125, 36);
		getContentPane().add(btnProductos);

		JButton btnOferta = new JButton("Oferta");
		btnOferta.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		btnOferta.setBackground(new Color(220, 100, 150));
		btnOferta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnOferta.setForeground(Color.WHITE);
		btnOferta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generalOfertas frame = new generalOfertas();
				frame.setVisible(true);
                setVisible(false);
			}
		});
		btnOferta.setBounds(578, 44, 120, 36);
		getContentPane().add(btnOferta);

		JButton btnSobreNea = new JButton("Quienes somos?");
		btnSobreNea.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		btnSobreNea.setBackground(new Color(220, 100, 150));
		btnSobreNea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnSobreNea.setForeground(Color.WHITE);
		btnSobreNea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generalSobreNea frame = new generalSobreNea();
				frame.setVisible(true);
                setVisible(false);
			}
		});
		btnSobreNea.setBounds(698, 44, 140, 36);
		getContentPane().add(btnSobreNea); 
        
   
       
     	
     		pinv = new PanelProductoCliente(null,producto);
    		getContentPane().setLayout(null);
    		setSize(1200,800);
    		getContentPane().setLayout(null);
    		getContentPane().setLayout(null);
    		setSize(1200,800);
    		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		setBounds(100, 100, 1200, 800);
    		setBackground(new Color(204, 102, 153));
    		setBounds(0,0,1200,800);
    		
    		
    		scrollPane= new JScrollPane();
            scrollPane.setBounds(0,120,1185,640);
            getContentPane().add(scrollPane);
            
            scrollPane.setViewportView(pinv);
	}

}
