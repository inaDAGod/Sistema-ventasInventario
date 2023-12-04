package ventasInventario;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import ventasInventario.BD.Modelo.Usuario;

public class Favoritos extends JFrame {
	JPanel contentPane;
	JScrollPane scrollPane;
	JTable tabla;
	PanelFavoritos pinv;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try { 
					//ejemplo de usuario
					Usuario u = new Usuario("danialee14", null, null, null);
					Favoritos frame = new Favoritos(u);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Favoritos(Usuario usuario) {
		pinv= new PanelFavoritos(usuario);
		getContentPane().setBackground(new Color(255, 255, 255));
		setSize(1200,800);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		setSize(1200,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		setBackground(new Color(204, 102, 153));
		setBounds(0,0,1200,800);
		
		//inventario
		scrollPane= new JScrollPane();
        scrollPane.setBounds(0,120,1185,640);
        getContentPane().add(scrollPane);
        
        scrollPane.setViewportView(pinv);
       
        
		//barra superior
		JButton btnUsuario = new JButton("");
		btnUsuario.setIcon(new ImageIcon(Favoritos.class.getResource("/imagenes/user(100x100).jpg")));
		btnUsuario.setHorizontalTextPosition(SwingConstants.CENTER);
		btnUsuario.setBounds(1000, 10, 100, 100);
		getContentPane().add(btnUsuario);
		
		JButton btnLogo = new JButton("");
        btnLogo.setIcon(new ImageIcon(NuevoFuncionario.class.getResource("/imagenes/LogoGris(200x100).jpg")));
        btnLogo.setHorizontalTextPosition(SwingConstants.CENTER);
        btnLogo.setBounds(42, 10, 200, 100);
        getContentPane().add(btnLogo);
        
        JButton btnBack = new JButton("");
        btnBack.setIcon(new ImageIcon(Favoritos.class.getResource("/imagenes/backblanco(50x50).jpg")));
        btnBack.setHorizontalTextPosition(SwingConstants.CENTER);
        btnBack.setBounds(1124, 35, 50, 50);
        getContentPane().add(btnBack);
        
        JButton btnInicio = new JButton("");
        btnInicio.setIcon(new ImageIcon(Inventario.class.getResource("/imagenes/btnInicio(90x50).jpg")));
        btnInicio.setHorizontalTextPosition(SwingConstants.CENTER);
        btnInicio.setBounds(330, 36, 90, 50);
        getContentPane().add(btnInicio);
        
        JButton btnProductos = new JButton("");
        btnProductos.setIcon(new ImageIcon(Inventario.class.getResource("/imagenes/btnProductos(90x50).jpg")));
        btnProductos.setHorizontalTextPosition(SwingConstants.CENTER);
        btnProductos.setBounds(420, 36, 90, 50);
        getContentPane().add(btnProductos);
        
        JButton btnOfertas = new JButton("");
        btnOfertas.setIcon(new ImageIcon(Inventario.class.getResource("/imagenes/btnOfertas(90x50).jpg")));
        btnOfertas.setHorizontalTextPosition(SwingConstants.CENTER);
        btnOfertas.setBounds(510, 36, 90, 50);
        getContentPane().add(btnOfertas);
        
        JButton btnSobreNea = new JButton("");
        btnSobreNea.setIcon(new ImageIcon(Inventario.class.getResource("/imagenes/btnSobreNea(120x50).jpg")));
        btnSobreNea.setHorizontalTextPosition(SwingConstants.CENTER);
        btnSobreNea.setBounds(600, 36, 120, 50);
        getContentPane().add(btnSobreNea);
     
	}

}
