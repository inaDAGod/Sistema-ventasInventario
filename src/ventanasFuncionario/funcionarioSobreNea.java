package ventanasFuncionario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ventanasCliente.clienteSobreNea;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.JTextField;
import java.awt.Color;

public class funcionarioSobreNea extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtNaEsUna;
    private JTextField txtAvCalle;
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

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 255, 255));
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

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(255, 182, 193));
        panel_2.setBounds(0, 137, 1200, 663);
        panel.add(panel_2);
        panel_2.setLayout(null);

        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(255, 182, 193));
        panel_3.setBounds(0, 5, 595, 647);
        panel_2.add(panel_3);
        panel_3.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("");
        ImageIcon icon2 = new ImageIcon("C:\\Users\\Desktop\\Documents\\GitHub\\Sistema-ventasInventario\\src\\imagenesJhess\\personassi.jfif");
        Image image2 = icon2.getImage().getScaledInstance(585, 573, Image.SCALE_SMOOTH);
        lblNewLabel_2.setIcon(new ImageIcon(image2));
        lblNewLabel_2.setBounds(10, 74, 585, 573);
        panel_3.add(lblNewLabel_2);

        JLabel lblNewLabel_1_1 = new JLabel("Sobre nea");
        lblNewLabel_1_1.setBounds(10, 11, 254, 52);
        panel_3.add(lblNewLabel_1_1);
        lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 47));

        JButton btnNewButton_1 = new JButton("");
        ImageIcon iconButton1 = new ImageIcon("C:\\Users\\Desktop\\Documents\\GitHub\\Sistema-ventasInventario\\src\\imagenesJhess\\camara2.jpg");
        Image imageButton1 = iconButton1.getImage().getScaledInstance(83, 43, Image.SCALE_SMOOTH);
        btnNewButton_1.setIcon(new ImageIcon(imageButton1));
        btnNewButton_1.setBounds(512, 30, 83, 43);
        panel_3.add(btnNewButton_1);

        JPanel panel_3_1 = new JPanel();
        panel_3_1.setBackground(new Color(255, 182, 193));
        panel_3_1.setBounds(605, 5, 595, 647);
        panel_2.add(panel_3_1);
        panel_3_1.setLayout(null);

        JLabel lblNewLabel_4 = new JLabel("");
        ImageIcon icon4 = new ImageIcon("C:\\Users\\Desktop\\Documents\\GitHub\\Sistema-ventasInventario\\src\\imagenesJhess\\ubicacion.JPG");
        Image image4 = icon4.getImage().getScaledInstance(585, 182, Image.SCALE_SMOOTH);
        lblNewLabel_4.setIcon(new ImageIcon(image4));
        lblNewLabel_4.setBounds(0, 465, 585, 182);
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
        Image imageButton1_1 = iconButton1_1.getImage().getScaledInstance(83, 43, Image.SCALE_SMOOTH);
        btnNewButton_1_1.setIcon(new ImageIcon(imageButton1_1));
        btnNewButton_1_1.setBounds(502, 421, 83, 43);
        panel_3_1.add(btnNewButton_1_1);

        JButton btnNewButton_2 = new JButton("");
        ImageIcon iconButton2 = new ImageIcon("C:\\Users\\Desktop\\Documents\\GitHub\\Sistema-ventasInventario\\src\\imagenesJhess\\jiji.jpng.png");
        Image imageButton2 = iconButton2.getImage().getScaledInstance(83, 43, Image.SCALE_SMOOTH);
        btnNewButton_2.setIcon(new ImageIcon(imageButton2));
        btnNewButton_2.setBounds(243, 276, 83, 43);
        panel_3_1.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("");
        ImageIcon iconButton3 = new ImageIcon("C:\\Users\\Desktop\\Documents\\GitHub\\Sistema-ventasInventario\\src\\imagenesJhess\\jiji.jpng.png");
        Image imageButton3 = iconButton3.getImage().getScaledInstance(83, 43, Image.SCALE_SMOOTH);
        btnNewButton_3.setIcon(new ImageIcon(imageButton3));
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción del botón
                txtNaEsUna.setEditable(true);
            }
        });
        btnNewButton_3.setBounds(512, 276, 83, 43);
        panel_3_1.add(btnNewButton_3);

        JButton btnNewButton_4 = new JButton("");
        ImageIcon iconButton4 = new ImageIcon("C:\\Users\\Desktop\\Documents\\GitHub\\Sistema-ventasInventario\\src\\imagenesJhess\\jiji.jpng.png");
        Image imageButton4 = iconButton4.getImage().getScaledInstance(83, 43, Image.SCALE_SMOOTH);
        btnNewButton_4.setIcon(new ImageIcon(imageButton4));
        btnNewButton_4.setBounds(512, 28, 83, 43);
        panel_3_1.add(btnNewButton_4);

        txtNaEsUna = new JTextField();
        txtNaEsUna.setEditable(false); // Bloquear el JTextField
        txtNaEsUna.setText("Néa es una empresa que abrió sus puertas en 2021, se dedica a la venta de una amplia variedad de productos cuidadosamente seleccionados de artículos que abarcan accesorios, dermo-cosméticos, cremas, maquillaje, ropa, entre otros productos. ");
        txtNaEsUna.setBounds(10, 78, 585, 187);
        panel_3_1.add(txtNaEsUna);
        txtNaEsUna.setColumns(10);

        txtAvCalle = new JTextField();
        txtAvCalle.setEditable(false); // Bloquear el JTextField
        txtAvCalle.setText("Av....... Calle....");
        txtAvCalle.setBounds(10, 327, 316, 107);
        panel_3_1.add(txtAvCalle);
        txtAvCalle.setColumns(10);

        textField = new JTextField();
        textField.setEditable(false); // Bloquear el JTextField
        textField.setText("77777761");
        textField.setBounds(446, 355, 127, 36);
        panel_3_1.add(textField);
        textField.setColumns(10);

        JButton btnEditar = new JButton("EDITAR");
        btnEditar.setBounds(0, 0, 139, 36);
        panel_3_1.add(btnEditar);

        JButton btnCancelar = new JButton("CANCELAR");
        btnCancelar.setBounds(150, 0, 139, 36);
        btnCancelar.setVisible(false);
        panel_3_1.add(btnCancelar);

        JButton btnGuardar = new JButton("GUARDAR");
        btnGuardar.setBounds(0, 0, 139, 36);
        btnGuardar.setVisible(false);
        panel_3_1.add(btnGuardar);

        btnEditar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción del botón Editar
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
                // Acción del botón Cancelar
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
                // Acción del botón Guardar
                txtNaEsUna.setEditable(false);
                txtAvCalle.setEditable(false);
                textField.setEditable(false);

                btnEditar.setVisible(true);
                btnCancelar.setVisible(false);
                btnGuardar.setVisible(false);
            }
        });
    }
}