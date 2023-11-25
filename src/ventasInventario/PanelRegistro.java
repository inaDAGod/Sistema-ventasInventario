package ventasInventario;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelRegistro extends JPanel {
	private JTextField nombre;
	private JTextField correo;
	private JTextField contrasenia;
	private JTextField vContra;
	private JTextField usuario;
	public PanelRegistro() {
		setLayout(null);
		
		JButton btnBack = new JButton(">");
		btnBack.setBounds(1114, 22, 50, 50);
		add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelLogin pr=new PanelLogin();
				pr.setBounds(0,0,1200,680);
				removeAll();
			    add(pr,BorderLayout.CENTER);
				revalidate();
				repaint();
				pr.setVisible(true);
			}
		});
		
		
		
		JButton btnRegistrar = new JButton("Regístrate");
		btnRegistrar.setBounds(466, 489, 300, 50);
		add(btnRegistrar);
		
		vContra = new JTextField();
		vContra.setColumns(10);
		vContra.setBackground(SystemColor.menu);
		vContra.setBounds(522, 415, 350, 40);
		add(vContra);
		
		contrasenia = new JTextField();
		contrasenia.setColumns(10);
		contrasenia.setBackground(SystemColor.menu);
		contrasenia.setBounds(522, 364, 350, 40);
		add(contrasenia);
		
		correo = new JTextField();
		correo.setColumns(10);
		correo.setBackground(SystemColor.menu);
		correo.setBounds(522, 309, 350, 40);
		add(correo);
		
		nombre = new JTextField();
		nombre.setBackground(SystemColor.menu);
		nombre.setBounds(522, 258, 350, 40);
		add(nombre);
		nombre.setColumns(10);
		
		usuario = new JTextField();
		usuario.setColumns(10);
		usuario.setBackground(SystemColor.menu);
		usuario.setBounds(522, 199, 350, 40);
		add(usuario);
		
		JLabel txUsuario = new JLabel("Usuario:");
		txUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txUsuario.setBounds(398, 210, 114, 29);
		add(txUsuario);
		
		JLabel txVeriContra = new JLabel("Verificar \r\ncontraseña:");
		txVeriContra.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txVeriContra.setBounds(263, 409, 263, 40);
		add(txVeriContra);
		
		JLabel txContrasenia = new JLabel("Contraseña:");
		txContrasenia.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txContrasenia.setBounds(371, 364, 141, 29);
		add(txContrasenia);
		
		JLabel txCorreo = new JLabel("Correo:");
		txCorreo.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txCorreo.setBounds(416, 320, 114, 29);
		add(txCorreo);
		
		JLabel txRegistrate = new JLabel("¡Regístrate ahora!");
		txRegistrate.setFont(new Font("Times New Roman", Font.BOLD, 50));
		txRegistrate.setBounds(416, 89, 401, 70);
		add(txRegistrate);
		
		JLabel txNombre = new JLabel("Nombre:");
		txNombre.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txNombre.setBounds(398, 269, 114, 29);
		add(txNombre);
		
		JLabel cblanco = new JLabel("New label");
		cblanco.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\blanco(1200x800).jpg"));
		cblanco.setBounds(213, 52, 800, 539);
		add(cblanco);
		
		JLabel fondo = new JLabel("New label");
		fondo.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\rosa2(1200x800).jpg"));
		fondo.setBounds(0, 0, 1200, 680);
		add(fondo);
		
	}
}
