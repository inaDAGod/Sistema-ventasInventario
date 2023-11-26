package ventasInventario;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class PanelLogin extends JPanel {
	private JTextField usuario;
	private JPasswordField contrasenia;

	public PanelLogin() {
		setLayout(null);
		
		usuario = new JTextField();
		usuario.setBackground(SystemColor.menu);
		usuario.setBounds(417, 252, 370, 40);
		add(usuario);
		usuario.setColumns(10);
		
		contrasenia = new JPasswordField();
		contrasenia.setBackground(SystemColor.menu);
		contrasenia.setBounds(417, 368, 370, 40);
		add(contrasenia);
		
		JButton btnIniciar = new JButton("Iniciar sesión");
		btnIniciar.setBounds(377, 450, 150, 50);
		add(btnIniciar);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelRegistro pr=new PanelRegistro();
				pr.setBounds(0,0,1200,680);
				removeAll();
			    add(pr,BorderLayout.CENTER);
				revalidate();
				repaint();
				pr.setVisible(true);
			}
		});
		btnRegistrarse.setBounds(681, 450, 150, 50);
		add(btnRegistrarse);
		
		JLabel txContrasenia = new JLabel("Contraseña:");
		txContrasenia.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txContrasenia.setBounds(359, 315, 125, 30);
		add(txContrasenia);
		
		JLabel txUsuario = new JLabel("Usuario:");
		txUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txUsuario.setBounds(356, 202, 84, 30);
		add(txUsuario);
		
		JLabel txBienvenida = new JLabel("¡Bienvenido a Néa!");
		txBienvenida.setFont(new Font("Times New Roman", Font.BOLD, 50));
		txBienvenida.setBounds(404, 108, 415, 68);
		add(txBienvenida);
		
		JLabel cblanco = new JLabel("");
		cblanco.setIcon(new ImageIcon(PanelLogin.class.getResource("/imagenes/blanco(550x450).jpg")));
		cblanco.setBounds(326, 80, 550, 450);
		add(cblanco);
		
		JLabel crosa = new JLabel("");
		crosa.setIcon(new ImageIcon(PanelLogin.class.getResource("/imagenes/rosa2(600x500).jpg")));
		crosa.setBackground(new Color(255, 153, 255));
		crosa.setBounds(300, 55, 600, 500);
		add(crosa);
		
		JLabel fondo = new JLabel("New label");
		fondo.setHorizontalAlignment(SwingConstants.CENTER);
		fondo.setIcon(new ImageIcon(PanelLogin.class.getResource("/imagenes/rosa1(1200x800).jpg")));
		fondo.setBounds(0, 0, 1200, 680);
		add(fondo);
	}
}
