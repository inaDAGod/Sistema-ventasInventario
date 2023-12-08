package general;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ventasInventario.Login;

public class generalSobreNea extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JPanel navegador;
	private JPanel SuperiorNavegador;
	private JButton btnOferta_2;
	
	public generalSobreNea() {
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
	      //*======================================INICIO DE PANNEL
	      		
	      		// NARVAR DE UN LADO AL APRETAR EL PERFIL

	        JPanel panel_1 = new JPanel();
			panel_1.setBackground(Color.white);
			panel_1.setBounds(2, 0, 1180, 137);
			panel.add(panel_1);
			panel_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));

			panel_1.setLayout(null);

			JLabel lblNewLabel = new JLabel("");
			ImageIcon icon = new ImageIcon(
					"src\\imagenes\\logo.jpg");
			Image image = icon.getImage().getScaledInstance(180, 118, Image.SCALE_SMOOTH);
			lblNewLabel.setIcon(new ImageIcon(image));
			lblNewLabel.setBorder(BorderFactory.createLineBorder(Color.black, 1));
			lblNewLabel.setBounds(24, 11, 180, 118);
			panel_1.add(lblNewLabel);

			JButton btnNewButton = new JButton("Inicio");
			btnNewButton.setBorder(BorderFactory.createLineBorder(Color.black, 1));
			btnNewButton.setBackground(new Color(220, 100, 150));
			btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setBounds(250, 44, 125, 36);
			btnNewButton.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				InicioGeneral frame = new InicioGeneral();
    				frame.setVisible(true);
    				setVisible(false);
    			}
    		});
			panel_1.add(btnNewButton);
			

			JButton btnOferta = new JButton("Productos");
			btnOferta.setBackground(new Color(220, 100, 150));
			btnOferta.setBorder(BorderFactory.createLineBorder(Color.black, 1));
			btnOferta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnOferta.setForeground(Color.WHITE);
			btnOferta.setBounds(374, 44, 125, 36);
			panel_1.add(btnOferta);

			JButton btnOferta_1_1 = new JButton("Oferta");
			btnOferta_1_1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
			btnOferta_1_1.setBackground(new Color(220, 100, 150));
			btnOferta_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnOferta_1_1.setForeground(Color.WHITE);
			btnOferta_1_1.setBounds(498, 44, 120, 36);
			btnOferta_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					generalOfertas frame = new generalOfertas();
					frame.setVisible(true);
	                setVisible(false);
				}
			});
			panel_1.add(btnOferta_1_1);

			JButton btnOferta_1 = new JButton("Quienes somos?");
			btnOferta_1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
			btnOferta_1.setBackground(new Color(220, 100, 150));
			btnOferta_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnOferta_1.setForeground(Color.WHITE);
			btnOferta_1.setBounds(618, 44, 140, 36);
			panel_1.add(btnOferta_1);

			JButton btnvolver = new JButton("Iniciar sesion");
			btnvolver.setBorder(BorderFactory.createLineBorder(Color.black, 1));
			btnvolver.setBackground(new Color(117, 14, 73));
			btnvolver.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnvolver.setForeground(Color.WHITE);
			btnvolver.setBounds(850, 44, 150, 40);
			btnvolver.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Login login = new Login();
					login.setVisible(true);
					setVisible(false);
				}
			});
			panel_1.add(btnvolver);

			JButton btnvolver2 = new JButton("Registrate ahora!");
			btnvolver2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
			btnvolver2.setBackground(new Color(229, 75, 171));
			btnvolver2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			btnvolver2.setForeground(Color.WHITE);
			btnvolver2.setBounds(1020, 44, 150, 40);
			btnvolver2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Login login = new Login();
					login.setVisible(true);
					setVisible(false);
				}
			});
			panel_1.add(btnvolver2);
	      		
	      		//*======================================FIN DE PANNEL

	        JPanel panel_2 = new JPanel();
	        panel_2.setBounds(0, 137, 1200, 663);
	        panel.add(panel_2);
	        panel_2.setLayout(null);
	        panel_2.setBackground(new Color(239, 222, 230));//CONTENDOR IMAGEN 96

	        JPanel panel_3 = new JPanel();
	        panel_3.setBounds(0, 5, 595, 647);
	        panel_3.setBackground(new Color(239, 222, 230));//CONTENDOR IMAGEN 99
	        panel_2.add(panel_3);
	        panel_3.setLayout(null);

	        JLabel lblNewLabel_2 = new JLabel("");
	        ImageIcon icon2 = new ImageIcon("src\\imagenesJhess\\personassi.jfif");
	        Image image2 = icon2.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
	        lblNewLabel_2.setIcon(new ImageIcon(image2));
	        lblNewLabel_2.setBounds(74, 40, 585, 573);
	        panel_3.add(lblNewLabel_2);

	        JLabel lblNewLabel_1_1 = new JLabel("Sobre nea");
	        lblNewLabel_1_1.setBounds(10, 11, 254, 52);
	        lblNewLabel_1_1.setForeground(new Color(112, 76, 94));
	        panel_3.add(lblNewLabel_1_1);
	        lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 47));

	        JPanel panel_3_1 = new JPanel();
	        panel_3_1.setBounds(605, 5, 595, 647);
	        panel_3_1.setBackground(new Color(241, 200, 219));//CONTENDOR IMAGEN 180
	        panel_2.add(panel_3_1);
	        panel_3_1.setLayout(null);

	        JLabel lblNewLabel_3 = new JLabel("Néa es una empresa que abrió sus puertas en 2021, se dedica a la venta de una amplia variedad de productos cuidadosamente seleccionados de artículos que abarcan accesorios, dermo-cosméticos, cremas, maquillaje, ropa, entre otros productos. ");
	        lblNewLabel_3.setBounds(10, 78, 563, 207);
	        lblNewLabel_3.setBackground(new Color(0, 0, 0));//CONTENDOR IMAGEN 180
	        panel_3_1.add(lblNewLabel_3);

	        JLabel lblNewLabel_4 = new JLabel("");
	        ImageIcon icon4 = new ImageIcon("src\\imagenesJhess\\ubicacion.JPG");
	        Image image4 = icon4.getImage().getScaledInstance(585, 150, Image.SCALE_SMOOTH);
	        lblNewLabel_4.setIcon(new ImageIcon(image4));
	        lblNewLabel_4.setBounds(20, 420, 555, 182);
	        panel_3_1.add(lblNewLabel_4);

	        JLabel lblNewLabel_1_1_1 = new JLabel("Contactanos");
	        lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	        lblNewLabel_1_1_1.setBounds(446, 309, 127, 52);
	        panel_3_1.add(lblNewLabel_1_1_1);

	        JLabel lblNewLabel_1_1_1_1 = new JLabel("77777761");
	        lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	        lblNewLabel_1_1_1_1.setBounds(446, 345, 104, 52);
	        panel_3_1.add(lblNewLabel_1_1_1_1);

	        JLabel lblNewLabel_3_1 = new JLabel("Av....... Calle....");
	        lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
	        lblNewLabel_3_1.setBounds(20, 300, 331, 117);
	        panel_3_1.add(lblNewLabel_3_1);

	        JLabel lblNewLabel_5 = new JLabel("");
	        ImageIcon icon5 = new ImageIcon("src\\imagenesJhess\\icono-de-llamada-telefonica");
	        Image image5 = icon5.getImage().getScaledInstance(75, 52, Image.SCALE_SMOOTH);
	        lblNewLabel_5.setIcon(new ImageIcon(image5));
	        lblNewLabel_5.setBounds(361, 324, 75, 52);
	        panel_3_1.add(lblNewLabel_5);

	        JLabel lblNewLabel_1_1_2 = new JLabel("¿Donde nos encontramos?");
	        lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	        lblNewLabel_1_1_2.setBounds(20, 276, 254, 52);
	        panel_3_1.add(lblNewLabel_1_1_2);

	    }
	}
