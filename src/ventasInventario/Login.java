package ventasInventario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Login extends JFrame {
	
	PanelLogin pl;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		getContentPane().setBackground(new Color(193, 123, 160));
		setSize(1200,800);
		getContentPane().setLayout(null);
		setSize(1200,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		setBackground(new Color(204, 102, 153));
		setBounds(0,0,1200,800);
	
		
		PanelLogin pl=new PanelLogin();
        pl.setBounds(0,120,1200,680);
        getContentPane().add(pl);
        
        JButton btnLogo = new JButton("");
        btnLogo.setIcon(new ImageIcon(Login.class.getResource("/imagenes/LogoGris(200x100).jpg")));
        btnLogo.setHorizontalTextPosition(SwingConstants.CENTER);
        btnLogo.setBounds(42, 11, 200, 100);
        getContentPane().add(btnLogo);
        
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
