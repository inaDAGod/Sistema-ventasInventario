package ventasInventario;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;

import ventasInventario.BD.Controladores.ControladorRegistro;

import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelRegistro extends JPanel {
	private JTextField nombre;
	private JTextField correo;
	private JPasswordField contrasenia;
	private JPasswordField vContra;
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
	
		
		vContra = new JPasswordField();
		vContra.setColumns(10);
		vContra.setBackground(SystemColor.menu);
		vContra.setBounds(522, 415, 350, 40);
		add(vContra);
		
		contrasenia = new JPasswordField();
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
		cblanco.setIcon(new ImageIcon(PanelRegistro.class.getResource("/imagenes/blanco(1200x800).jpg")));
		cblanco.setBounds(213, 52, 800, 539);
		add(cblanco);
		
		JLabel fondo = new JLabel("New label");
		fondo.setIcon(new ImageIcon(PanelRegistro.class.getResource("/imagenes/rosa2(1200x800).jpg")));
		fondo.setBounds(0, 0, 1200, 680);
		add(fondo);
		
		
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorRegistro controladorRegistro =new ControladorRegistro(PanelRegistro.this);
				controladorRegistro.registroVerificacion();
			}
		});
	}
	public JTextField getNombre() {
		return nombre;
	}
	public void setNombre(JTextField nombre) {
		this.nombre = nombre;
	}
	public JTextField getCorreo() {
		return correo;
	}
	public void setCorreo(JTextField correo) {
		this.correo = correo;
	}
	public JPasswordField getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(JPasswordField contrasenia) {
		this.contrasenia = contrasenia;
	}
	public JPasswordField getvContra() {
		return vContra;
	}
	public void setvContra(JPasswordField vContra) {
		this.vContra = vContra;
	}
	public JTextField getUsuario() {
		return usuario;
	}
	public void setUsuario(JTextField usuario) {
		this.usuario = usuario;
	}
	
	
}
