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
        btnLogo.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\LogoGris(200x100).jpg"));
        btnLogo.setHorizontalTextPosition(SwingConstants.CENTER);
        btnLogo.setBounds(42, 11, 200, 100);
        getContentPane().add(btnLogo);
        
        JButton btnInicio = new JButton("Inicio");
        btnInicio.setBounds(330, 36, 90, 50);
        getContentPane().add(btnInicio);
        
        JButton btnProductos = new JButton("Productos");
        btnProductos.setBounds(420, 36, 90, 50);
        getContentPane().add(btnProductos);
        
        JButton btnOfertas = new JButton("Ofertas");
        btnOfertas.setBounds(510, 36, 90, 50);
        getContentPane().add(btnOfertas);
        
        JButton btnSobreNea = new JButton("¿Quiénes somos?");
        btnSobreNea.setBounds(600, 36, 120, 50);
        getContentPane().add(btnSobreNea);
        pl.setVisible(true);
    	
	}

}
