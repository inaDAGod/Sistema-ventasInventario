package ventasInventario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ofertar extends JFrame {

	private JPanel contentPane;
	private JTextField txtBsPrecio;
	private JTextField txFechaInicio;
	private JTextField txtDdmmyyyy;
	private JTextField txPrecioOferta;
	private JLabel lbPrecioOferta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ofertar frame = new Ofertar();
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
	public Ofertar() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(162, 195, 200));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbPrecioOferta = new JLabel("Precio oferta:");
		lbPrecioOferta.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lbPrecioOferta.setBounds(62, 85, 100, 26);
		contentPane.add(lbPrecioOferta);
		
		txPrecioOferta = new JTextField();
		txPrecioOferta.setBounds(180, 83, 86, 20);
		contentPane.add(txPrecioOferta);
		txPrecioOferta.setColumns(10);
		
		JLabel lbPrecioActual = new JLabel("Precio actual:");
		lbPrecioActual.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(lbPrecioActual);
		lbPrecioActual.setBounds(10,24,100,26);
		
		txtBsPrecio = new JTextField();
		txtBsPrecio.setEditable(false);
		txtBsPrecio.setText("Bs. Precio");
		txtBsPrecio.setBounds(101, 27, 61, 22);
		contentPane.add(txtBsPrecio);
		txtBsPrecio.setColumns(10);
		
		JLabel lbFInicio = new JLabel("Fecha inicio: ");
		lbFInicio.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lbFInicio.setBounds(62, 127, 100, 26);
		contentPane.add(lbFInicio);
		
		txFechaInicio = new JTextField();
		txFechaInicio.setText("dd/mm/yyyy");
		txFechaInicio.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txFechaInicio.setBounds(180, 130, 160, 20);
		contentPane.add(txFechaInicio);
		txFechaInicio.setColumns(10);
		
		JLabel lbFFin = new JLabel("Fecha fin: ");
		lbFFin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lbFFin.setBounds(62, 166, 100, 26);
		contentPane.add(lbFFin);
		
		txtDdmmyyyy = new JTextField();
		txtDdmmyyyy.setText("dd/mm/yyyy");
		txtDdmmyyyy.setColumns(10);
		txtDdmmyyyy.setBounds(180, 170, 156, 20);
		contentPane.add(txtDdmmyyyy);
		
		JButton btnOfertar = new JButton("Ofertar");
		btnOfertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmarOferta();
			}
		});
		btnOfertar.setBounds(312, 215, 89, 23);
		contentPane.add(btnOfertar);
		
	}
	private void confirmarOferta() {
        // Obtener confirmación del usuario
        int confirmacion = JOptionPane.showConfirmDialog(
                Ofertar.this,
                "¿Estás seguro de ofertar este producto?",
                "Confirmar oferta",
                JOptionPane.YES_NO_OPTION);

        // Procesar la respuesta del usuario
        if (confirmacion == JOptionPane.YES_OPTION) {
            realizarOferta();
        } else {
        }
    }

    private void realizarOferta() {
        
        JOptionPane.showMessageDialog(
                Ofertar.this,
                "Oferta realizada con éxito",
                "Oferta Exitosa",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
