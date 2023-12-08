package ventanasFuncionario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ventanasCliente.clienteSobreNea;

import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;

public class funcionarioSobreNea extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtNaEsUna;
    private JTextField txtAvCalle;
    private JPanel navegador;
    private  JPanel SuperiorNavegador;
    private JButton btnOferta_2;
    private JTextField textField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	funcionarioSobreNea frame = new funcionarioSobreNea();
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
    public funcionarioSobreNea() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1200, 800);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1200, 800);
        contentPane.add(panel);
        panel.setLayout(null);

        //=============================================INICIOOOO DEL NARVAR TODOO
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
	        JButton buttonProducto5 = new JButton("    Añadir Producto");
	        buttonProducto5.setBounds(25, 120, 300, 70);
	        buttonProducto5.setBorder(BorderFactory.createLineBorder(Color.black, 0)); 
	        buttonProducto5.setLayout(new BorderLayout());
	        buttonProducto5.setBackground(new Color(250, 232, 235));
	        buttonProducto5.setVisible(true);
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
//*INTERACCION DEL NARVAR

	       
	       
//=============================================FIN DEL NARVAR TODOO

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(214, 166, 190));//CONTNEDRO 1 99
        panel_2.setBounds(0, 137, 1200, 663);
        panel.add(panel_2);
        panel_2.setLayout(null);

        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(214, 166, 190));//CONTNEDRO 2 105
        panel_3.setBounds(0, 5, 595, 621);
        panel_2.add(panel_3);
        panel_3.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("");
        ImageIcon icon2 = new ImageIcon("C:\\Users\\Desktop\\Documents\\GitHub\\Sistema-ventasInventario\\src\\imagenesJhess\\personassi.jfif");
        Image image2 = icon2.getImage().getScaledInstance(465, 476, Image.SCALE_SMOOTH);
        lblNewLabel_2.setIcon(new ImageIcon(image2));
        lblNewLabel_2.setBounds(72, 97, 465, 476);
        panel_3.add(lblNewLabel_2);

        JLabel lblNewLabel_1_1 = new JLabel("SOBRE NEA");
        lblNewLabel_1_1.setForeground(Color.WHITE); //letras nea 118
        lblNewLabel_1_1.setBounds(10, 11, 500, 52);
        panel_3.add(lblNewLabel_1_1);
        lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 47));

        JButton btnNewButton_1 = new JButton("");
        ImageIcon iconButton1 = new ImageIcon("C:\\Users\\Desktop\\Documents\\GitHub\\Sistema-ventasInventario\\src\\imagenesJhess\\camara2.jpg");
        Image imageButton1 = iconButton1.getImage().getScaledInstance(70, 50, Image.SCALE_SMOOTH);
        btnNewButton_1.setIcon(new ImageIcon(imageButton1));
        btnNewButton_1.setBounds(512, 30, 70, 50);
        panel_3.add(btnNewButton_1);
        
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(null);

                if (result == JFileChooser.APPROVE_OPTION) {
                    String imagePath = fileChooser.getSelectedFile().getAbsolutePath();
                    System.out.println(imagePath);
                    ImageIcon selectedImageIcon = new ImageIcon(imagePath);
                    lblNewLabel_2.setIcon(selectedImageIcon);
                }
            }
        });

        JPanel panel_3_1 = new JPanel();
        panel_3_1.setBackground(new Color(214, 166, 190));//CONTNEDRO 3 144
        panel_3_1.setBounds(605, 5, 595, 647);
        panel_2.add(panel_3_1);
        panel_3_1.setLayout(null);

        JLabel lblNewLabel_4 = new JLabel("");
        ImageIcon icon4 = new ImageIcon("src\\imagenesJhess\\ubicacion.JPG");
        Image image4 = icon4.getImage().getScaledInstance(555, 140, Image.SCALE_SMOOTH);
        lblNewLabel_4.setIcon(new ImageIcon(image4));
        lblNewLabel_4.setBounds(0, 455, 585, 182);
        panel_3_1.add(lblNewLabel_4);

        JLabel lblNewLabel_1_1_1 = new JLabel("Contactanos");
        lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNewLabel_1_1_1.setBounds(446, 309, 127, 52);
        panel_3_1.add(lblNewLabel_1_1_1);

        JLabel lblNewLabel_5 = new JLabel("");
        ImageIcon icon5 = new ImageIcon("C:\\Users\\Desktop\\Documents\\GitHub\\Sistema-ventasInventario\\src\\imagenesJhess\\icono-de-llamada-telefonica");
        Image image5 = icon5.getImage().getScaledInstance(75, 52, Image.SCALE_SMOOTH);
        lblNewLabel_5.setIcon(new ImageIcon(image5));
        lblNewLabel_5.setBounds(361, 324, 75, 52);
        panel_3_1.add(lblNewLabel_5);

        JLabel lblNewLabel_1_1_2 = new JLabel("¿Donde nos encontramos?");
        lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNewLabel_1_1_2.setBounds(20, 276, 254, 52);
        panel_3_1.add(lblNewLabel_1_1_2);

        JButton btnNewButton_1_1 = new JButton("");
        ImageIcon iconButton1_1 = new ImageIcon("C:\\Users\\Desktop\\Documents\\GitHub\\Sistema-ventasInventario\\src\\imagenesJhess\\camara2.jpg");
        Image imageButton1_1 = iconButton1_1.getImage().getScaledInstance(70, 50, Image.SCALE_SMOOTH);
        btnNewButton_1_1.setIcon(new ImageIcon(imageButton1_1));
        btnNewButton_1_1.setBounds(502, 421, 70, 50);
        panel_3_1.add(btnNewButton_1_1);

        btnNewButton_1_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(null);

                if (result == JFileChooser.APPROVE_OPTION) {
                    String imagePath2 = fileChooser.getSelectedFile().getAbsolutePath();
                    ImageIcon selectedImageIcon2 = new ImageIcon(imagePath2);
                    lblNewLabel_4.setIcon(selectedImageIcon2);
                }
            }
        });

        txtNaEsUna = new JTextField();
        txtNaEsUna.setEditable(false); 
        txtNaEsUna.setText("Néa es una empresa que abrió sus puertas en 2021, se dedica a la venta de una amplia variedad de productos cuidadosamente seleccionados de artículos que abarcan accesorios, dermo-cosméticos, cremas, maquillaje, ropa, entre otros productos. ");
        txtNaEsUna.setBackground(new Color(239, 222, 230));//INPUT
        txtNaEsUna.setBounds(10, 78, 585, 187);
        panel_3_1.add(txtNaEsUna);
        txtNaEsUna.setColumns(10);

        txtAvCalle = new JTextField();
        txtAvCalle.setEditable(false);
        txtAvCalle.setBackground(new Color(239, 222, 230));//INPUT
        txtAvCalle.setText("Av....... Calle....");
        txtAvCalle.setBounds(10, 327, 316, 107);
        panel_3_1.add(txtAvCalle);
        txtAvCalle.setColumns(10);

        textField = new JTextField();
        textField.setEditable(false); 
        textField.setBackground(new Color(239, 222, 230));//INPUT
        textField.setText("77777761");
        textField.setBounds(446, 355, 127, 36);
        panel_3_1.add(textField);
        textField.setColumns(10);

        JButton btnEditar = new JButton("EDITAR");
        btnEditar.setBackground(new Color(162, 195, 200));//boton editar 204
        btnEditar.setForeground(Color.WHITE); 
        btnEditar.setBounds(425, 10, 139, 36);
        panel_3_1.add(btnEditar);

        JButton btnCancelar = new JButton("CANCELAR");
        btnCancelar.setBackground(new Color(162, 195, 200));//boton editar 204
        btnCancelar.setForeground(Color.WHITE); 
        btnCancelar.setBounds(280, 10, 139, 36);
        btnCancelar.setVisible(false);
        panel_3_1.add(btnCancelar);

        JButton btnGuardar = new JButton("GUARDAR");
        btnGuardar.setBackground(new Color(162, 195, 200));//boton editar 204
        btnGuardar.setForeground(Color.WHITE); 
        btnGuardar.setBounds(425, 10, 139, 36);
        btnGuardar.setVisible(false);
        panel_3_1.add(btnGuardar);

        btnEditar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtNaEsUna.setEditable(true);
                txtAvCalle.setEditable(true);
                textField.setEditable(true);

                btnEditar.setVisible(false);
                btnCancelar.setVisible(true);
                btnGuardar.setVisible(true);
            }
        });

        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               txtNaEsUna.setEditable(false);
                txtAvCalle.setEditable(false);
                textField.setEditable(false);

                btnEditar.setVisible(true);
                btnCancelar.setVisible(false);
                btnGuardar.setVisible(false);
            }
        });

        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtNaEsUna.setEditable(false);
                txtAvCalle.setEditable(false);
                textField.setEditable(false);

                btnEditar.setVisible(true);
                btnCancelar.setVisible(false);
                btnGuardar.setVisible(false);
            }
        });
        
        btnOferta_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               

            	btnEditar.setVisible(false);
            	btnCancelar.setVisible(false);
            	btnvolver.setVisible(false);
            	btnOferta_2.setVisible(false);
            	navegador.setVisible(true);
            	SuperiorNavegador.setVisible(true);
    	        btnUsuario.setVisible(true);
    	        buttonProducto5.setVisible(true);
    	        buttonMisPedidos.setVisible(true);
    	        buttonCerrar.setVisible(true);
    	        btnGuardar.setVisible(false);
    	        btnNewButton_1_1.setVisible(false);
               
            }
        });
        
    }
}