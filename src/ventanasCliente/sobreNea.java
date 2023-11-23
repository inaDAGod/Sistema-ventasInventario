package ventanasCliente;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class sobreNea extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public sobreNea() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1200, 800);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1200, 140);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Desktop\\Documents\\GitHub\\Sistema-ventasInventario\\src\\imagenesJhess\\personas.jfif"));
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
		panel_2.setBounds(0, 137, 1200, 663);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 5, 595, 647);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Sobre Nea");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 43));
		lblNewLabel_1.setBounds(185, 41, 188, 52);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Desktop\\Documents\\GitHub\\Sistema-ventasInventario\\src\\imagenesJhess\\personassi.jfif"));
		lblNewLabel_2.setBounds(10, 134, 585, 513);
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(605, 5, 595, 647);
		panel_2.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(273, 5, 49, 14);
		panel_3_1.add(lblNewLabel_3);

	}
}
