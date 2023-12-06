package ventanasCliente;

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

import ventasInventario.BD.Modelo.Usuario;

public class perfilUsuario extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JButton btnEditar;
    private JButton btnCancelar;
    private Usuario usuario;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Usuario u = new Usuario("danialee14");
                    perfilUsuario frame = new perfilUsuario(u);
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
    public perfilUsuario(Usuario u) {
    	this.usuario = u;
        
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

        JPanel panel_1 = new JPanel();
        panel_1.setForeground(SystemColor.activeCaptionBorder);
        panel_1.setBounds(0, 0, 1200, 140);
        panel.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel = new JLabel("");
        ImageIcon icon = new ImageIcon("C:\\Users\\Desktop\\Documents\\GitHub\\Sistema-ventasInventario\\src\\imagenesJhess\\personas.jfif");
        Image image = icon.getImage().getScaledInstance(139, 118, Image.SCALE_SMOOTH);
        lblNewLabel.setIcon(new ImageIcon(image));
        lblNewLabel.setBounds(24, 11, 139, 118);
        panel_1.add(lblNewLabel);

        JButton btnNewButton = new JButton("Inicio");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton.setBounds(226, 44, 139, 36);
        panel_1.add(btnNewButton);

        JButton btnOferta = new JButton("Productos");
        btnOferta.setBounds(394, 44, 139, 36);
        panel_1.add(btnOferta);

        JButton btnOferta_1 = new JButton("Quienes somos?");
        btnOferta_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnOferta_1.setBounds(729, 44, 139, 36);
        panel_1.add(btnOferta_1);

        JButton btnOferta_1_1 = new JButton("Oferta");
        btnOferta_1_1.setBounds(564, 44, 139, 36);
        panel_1.add(btnOferta_1_1);

        ImageIcon iconPerfil = new ImageIcon(perfilUsuario.class.getResource("/imagenesJhess/perfilpersona.png"));
        Image imagePerfil = iconPerfil.getImage().getScaledInstance(130, 118, Image.SCALE_SMOOTH);

        JButton btnOferta_2 = new JButton("");
        btnOferta_2.setIcon(new ImageIcon(imagePerfil));
        btnOferta_2.setBounds(1048, 11, 130, 118);
        panel_1.add(btnOferta_2);
      

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