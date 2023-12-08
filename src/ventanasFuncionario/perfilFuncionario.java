package ventanasFuncionario;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import general.InicioGeneral;
import ventanasCliente.perfilUsuario;
import ventasInventario.Favoritos;
import ventasInventario.Inventario;
import ventasInventario.ListadoClientes;
import ventasInventario.NuevoFuncionario;
import ventasInventario.NuevoProducto;
import ventasInventario.BD.Modelo.Usuario;

public class perfilFuncionario extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JButton btnEditar;
    private JButton btnCancelar;
    private Usuario usuario;
	private JPanel navegador;
	private JPanel SuperiorNavegador;
	private JButton btnOferta_2;
  
	
    public perfilFuncionario(Usuario u) {
    	this.usuario = u;
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1200, 800);
        contentPane = new JPanel();
        contentPane.setBorder(null);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1200, 800);
        contentPane.add(panel);
        panel.setLayout(null);

      //*======================================INICIO DE PANNEL
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
        buttonProducto5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevoProducto frame = new NuevoProducto(usuario);
				frame.setVisible(true);
				setVisible(false);
			}
		});
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
        buttonMisPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevoFuncionario frame = new NuevoFuncionario(usuario);
				frame.setVisible(true);
				setVisible(false);
			}
		});
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
        buttonListado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListadoClientes frame = new ListadoClientes(usuario);
				frame.setVisible(true);
				setVisible(false);
			}
		});
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
        buttonAjustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcionarioPedidos frame = new funcionarioPedidos(usuario);
                frame.setVisible(true);
				setVisible(false);
			}
		});
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
        buttonEstadisticas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcionarioEstadisticas frame = new funcionarioEstadisticas(usuario);
				frame.setVisible(true);
				setVisible(false);
			}
		});
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
        buttonCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InicioGeneral frame = new InicioGeneral();
				frame.setVisible(true);
				setVisible(false);
			}
		});
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
        btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcionarioInicio frame = new funcionarioInicio(usuario);
                frame.setVisible(true);
				setVisible(false);
			}
		});
        btnNewButton.setBounds(330, 44, 125, 36);
        panel_1.add(btnNewButton);

        JButton btnOferta = new JButton("Inventario");
        btnOferta.setBackground(new Color(220, 100, 150));
        btnOferta.setBorder(BorderFactory.createLineBorder(Color.black, 1)); 
        btnOferta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        btnOferta.setForeground(Color.WHITE);
        btnOferta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inventario frame = new Inventario(usuario);
				frame.setVisible(true);
				setVisible(false);
			}
		});
        btnOferta.setBounds(454, 44, 125, 36);
        panel_1.add(btnOferta);
        
        JButton btnOferta_1_1 = new JButton("Pedidos actuales");
        btnOferta_1_1.setBorder(BorderFactory.createLineBorder(Color.black, 1)); 
        btnOferta_1_1.setBackground(new Color(220, 100, 150));
        btnOferta_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        btnOferta_1_1.setForeground(Color.WHITE);
        btnOferta_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcionarioPedidosActuales frame = new funcionarioPedidosActuales(usuario);
                frame.setVisible(true);
				setVisible(false);
			}
		});
        btnOferta_1_1.setBounds(578, 44, 150, 36);
        panel_1.add(btnOferta_1_1);

        JButton btnOferta_1 = new JButton("Sobre Nea");
        btnOferta_1.setBorder(BorderFactory.createLineBorder(Color.black, 1)); 
        btnOferta_1.setBackground(new Color(220, 100, 150));
        btnOferta_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        btnOferta_1.setForeground(Color.WHITE);
        btnOferta_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcionarioSobreNea frame = new funcionarioSobreNea(usuario);
                frame.setVisible(true);
				setVisible(false);
			}
		});
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

        btnOferta_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               

            	
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
      		//*======================================FIN DE PANNEL
      

        JPanel panel_2 = new JPanel();
        panel_2.setBounds(0, 137, 1200, 663);
        panel.add(panel_2);
        panel_2.setLayout(null);

        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(214, 166, 190));//color fondo 117
        panel_3.setBounds(0, 5, 1190, 647);
        panel_2.add(panel_3);
        panel_3.setLayout(null);

        ImageIcon icon2 = new ImageIcon("/imagenesJhess/personassi.jfif");
        Image image2 = icon2.getImage().getScaledInstance(585, 573, Image.SCALE_SMOOTH);

        JLabel lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setBounds(107, 473, 75, 52);
        panel_3.add(lblNewLabel_5);
        lblNewLabel_5.setIcon(new ImageIcon(image2));

        JPanel panel_4 = new JPanel();
        panel_4.setBackground(SystemColor.text);
        panel_4.setBackground(new Color(239, 222, 230));//contenedor 131
        panel_4.setBounds(300, 59, 584, 523);
        panel_3.add(panel_4);
        panel_4.setLayout(null);

        panel_4.setBorder(BorderFactory.createLineBorder(Color.black, 2)); 
        JLabel lblNewLabel_1_1 = new JLabel("Mi Perfil");
        lblNewLabel_1_1.setBounds(215, 0, 173, 55);
        panel_4.add(lblNewLabel_1_1);
        lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 47));

        JLabel lblNewLabel_1_1_1 = new JLabel("Nombre :");
        lblNewLabel_1_1_1.setBounds(46, 203, 127, 52);
        panel_4.add(lblNewLabel_1_1_1);
        lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        JLabel lblNewLabel_1_1_1_2 = new JLabel("Correo :");
        lblNewLabel_1_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNewLabel_1_1_1_2.setBounds(46, 253, 127, 52);
        panel_4.add(lblNewLabel_1_1_1_2);

        JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Usuario :");
        lblNewLabel_1_1_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNewLabel_1_1_1_2_1.setBounds(46, 306, 127, 52);
        panel_4.add(lblNewLabel_1_1_1_2_1);

        JLabel lblNewLabel_1_1_1_2_1_1 = new JLabel("Contraseña :");
        lblNewLabel_1_1_1_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNewLabel_1_1_1_2_1_1.setBounds(46, 361, 127, 52);
        panel_4.add(lblNewLabel_1_1_1_2_1_1);

        ImageIcon iconVoluntario = new ImageIcon(perfilUsuario.class.getResource("/imagenesJhess/voluntarioIcon.png"));
        Image imageVoluntario = iconVoluntario.getImage().getScaledInstance(173, 134, Image.SCALE_SMOOTH);

        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setBounds(215, 57, 173, 134);
        lblNewLabel_2.setIcon(new ImageIcon(imageVoluntario));
        panel_4.add(lblNewLabel_2);

        textField = new JTextField();
        textField.setBounds(205, 217, 214, 28);
        panel_4.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(205, 267, 214, 28);
        panel_4.add(textField_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(205, 320, 214, 28);
        panel_4.add(textField_2);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(205, 375, 214, 28);
        panel_4.add(textField_3);
       
        inicializarCamposTexto();
        
        JPanel panel_5 = new JPanel();
        panel_5.setBackground(new Color(239, 222, 230));//pnael de boton 192
      
        panel_5.setBounds(3, 450, 575, 63);
        panel_4.add(panel_5);
        panel_5.setLayout(null);

        ImageIcon icon4 = new ImageIcon("C:\\Users\\Desktop\\Documents\\GitHub\\Sistema-ventasInventario\\src\\imagenesJhess\\ubicacion.JPG");
        Image image4 = icon4.getImage().getScaledInstance(585, 182, Image.SCALE_SMOOTH);
        ImageIcon icon5 = new ImageIcon("C:\\Users\\Desktop\\Documents\\GitHub\\Sistema-ventasInventario\\src\\imagenesJhess\\icono-de-llamada-telefonica");
        Image image5 = icon5.getImage().getScaledInstance(75, 52, Image.SCALE_SMOOTH);

        btnEditar = new JButton("Editar");
        btnEditar.setBackground(new Color(162, 195, 200));//boton editar 204
        btnEditar.setForeground(Color.WHITE);  // Color del texto del botón204
        btnEditar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        btnEditar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (btnEditar.getText().equals("Editar")) {
                    
                    editarPerfil();
                } else {
                	guardarCambios();
                }
                btnvolver.setVisible(true);
  				btnOferta_2.setVisible(true);
  				navegador.setVisible(false);
  				SuperiorNavegador.setVisible(false);
  				btnUsuario.setVisible(false);
  				buttonProducto5.setVisible(false);
  				buttonMisPedidos.setVisible(false);
  				buttonCerrar.setVisible(false);
            }
        });
        btnEditar.setBounds(425, 19, 149, 33);
        panel_5.add(btnEditar);
        
        
        

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBackground(new Color(162, 195, 200));//boton editar 223
        btnCancelar.setForeground(Color.WHITE);  // Color del texto del botón 223
        btnCancelar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cancelarEdicion();
                
                btnvolver.setVisible(true);
  				btnOferta_2.setVisible(true);
  				navegador.setVisible(false);
  				SuperiorNavegador.setVisible(false);
  				btnUsuario.setVisible(false);
  				buttonProducto5.setVisible(false);
  				buttonMisPedidos.setVisible(false);
  				buttonCerrar.setVisible(false);
  				
            }
        });
        btnCancelar.setBounds(253, 19, 162, 33);
        btnCancelar.setVisible(false); 
        panel_5.add(btnCancelar);
    }
    private void inicializarCamposTexto() {
        textField.setText(usuario.getNombre());
        textField_1.setText(usuario.getCorreo());
        textField_2.setText(usuario.getUsuario());
        textField_3.setText(usuario.getContrasenia());

        bloquearCamposTexto();
    }
    
    private void bloquearCamposTexto() {
        textField.setEditable(false);
        textField_1.setEditable(false);
        textField_2.setEditable(false);
        textField_3.setEditable(false);
    }

    private void editarPerfil() {
        textField.setEditable(true);
        textField_1.setEditable(true);
        textField_3.setEditable(true);

        btnEditar.setText("Guardar");
        btnCancelar.setVisible(true);
    }

    private void cancelarEdicion() {
        bloquearCamposTexto();
        inicializarCamposTexto();
        btnEditar.setText("Editar");
        btnCancelar.setVisible(false);
    }
    private void guardarCambios() {
        String nombre = textField.getText();
        String correo = textField_1.getText();
        String usuario = textField_2.getText();
        String contraseña = textField_3.getText();
        Usuario editado = new Usuario(usuario, nombre, correo, contraseña);
        this.usuario.editarUsuario(editado);
        btnEditar.setText("Editar");
        btnCancelar.setVisible(false);

    }
}