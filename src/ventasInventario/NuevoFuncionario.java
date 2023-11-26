package ventasInventario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import ventasInventario.BD.Controladores.ControladorRegistro;

public class NuevoFuncionario extends JFrame {

	JTextField nombre, correo, contrasenia, usuario;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevoFuncionario frame = new NuevoFuncionario();
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
	public NuevoFuncionario() {
		setSize(1200,800);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		setSize(1200,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		setBackground(new Color(204, 102, 153));
		setBounds(0,0,1200,800);
		
		
		JButton btnAnadir = new JButton("Añadir funcionario");
		btnAnadir.setBounds(738, 622, 300, 50);
		getContentPane().add(btnAnadir);
		
		
		contrasenia = new JTextField();
		contrasenia.setColumns(10);
		contrasenia.setBackground(SystemColor.menu);
		contrasenia.setBounds(630, 503, 350, 40);
		getContentPane().add(contrasenia);
		
		correo = new JTextField();
		correo.setColumns(10);
		correo.setBackground(SystemColor.menu);
		correo.setBounds(630, 450, 350, 40);
		getContentPane().add(correo);
		
		nombre = new JTextField();
		nombre.setBackground(SystemColor.menu);
		nombre.setBounds(630, 387, 350, 40);
		getContentPane().add(nombre);
		nombre.setColumns(10);
		
		usuario = new JTextField();
		usuario.setColumns(10);
		usuario.setBackground(SystemColor.menu);
		usuario.setBounds(630, 325, 350, 40);
		getContentPane().add(usuario);
		
		JLabel txUsuario = new JLabel("Usuario:");
		txUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txUsuario.setBounds(493, 336, 114, 29);
		getContentPane().add(txUsuario);
		
		JLabel imagen = new JLabel("New label");
		imagen.setIcon(new ImageIcon(NuevoFuncionario.class.getResource("/imagenes/rosa1(1200x800).jpg")));
		imagen.setBounds(184, 291, 250, 300);
		getContentPane().add(imagen);
		
		JButton btnSubirFoto = new JButton("-");
		btnSubirFoto.setBounds(184, 600, 50, 50);
		getContentPane().add(btnSubirFoto);
		
		JLabel txContrasenia = new JLabel("Contraseña:");
		txContrasenia.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txContrasenia.setBounds(466, 503, 141, 29);
		getContentPane().add(txContrasenia);
		
		JLabel txCorreo = new JLabel("Correo:");
		txCorreo.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txCorreo.setBounds(510, 450, 99, 29);
		getContentPane().add(txCorreo);
		
		JLabel txRegistrate = new JLabel("Añadir funcionario");
		txRegistrate.setFont(new Font("Times New Roman", Font.BOLD, 50));
		txRegistrate.setBounds(393, 199, 427, 70);
		getContentPane().add(txRegistrate);
		
		JLabel txNombre = new JLabel("Nombre:");
		txNombre.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txNombre.setBounds(493, 398, 114, 29);
		getContentPane().add(txNombre);
		
		JLabel cblanco = new JLabel("New label");
		cblanco.setIcon(new ImageIcon(NuevoFuncionario.class.getResource("/imagenes/blanco(1200x800).jpg")));
		cblanco.setBounds(119, 172, 962, 539);
		getContentPane().add(cblanco);
		
		JLabel fondo = new JLabel("New label");
		fondo.setIcon(new ImageIcon(NuevoFuncionario.class.getResource("/imagenes/rosa2(1200x800).jpg")));
		fondo.setBounds(0, 120, 1200, 680);
		getContentPane().add(fondo);
		
		//barra arriba
		JButton btnUsuario = new JButton("");
		btnUsuario.setIcon(new ImageIcon(NuevoFuncionario.class.getResource("/imagenes/user(100x100).jpg")));
		btnUsuario.setHorizontalTextPosition(SwingConstants.CENTER);
		btnUsuario.setBounds(1000, 10, 100, 100);
		getContentPane().add(btnUsuario);
		
		JButton btnLogo = new JButton("");
        btnLogo.setIcon(new ImageIcon(NuevoFuncionario.class.getResource("/imagenes/LogoGris(200x100).jpg")));
        btnLogo.setHorizontalTextPosition(SwingConstants.CENTER);
        btnLogo.setBounds(42, 10, 200, 100);
        getContentPane().add(btnLogo);
        
        JButton btnBack = new JButton("");
        btnBack.setIcon(new ImageIcon(NuevoFuncionario.class.getResource("/imagenes/backrosa1(50x50).jpg")));
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
        btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorRegistro controladorRegistro =new ControladorRegistro(NuevoFuncionario.this);
				controladorRegistro.registroFuncionario();
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

	public JTextField getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(JTextField contrasenia) {
		this.contrasenia = contrasenia;
	}

	public JTextField getUsuario() {
		return usuario;
	}

	public void setUsuario(JTextField usuario) {
		this.usuario = usuario;
	}
	

}
