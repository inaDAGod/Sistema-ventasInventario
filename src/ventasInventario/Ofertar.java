package ventasInventario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ventasInventario.BD.Controladores.ControladorOferta;
import ventasInventario.BD.Modelo.*;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Ofertar extends JFrame {

	private JPanel contentPane;
	private JTextField txtBsPrecio;
	private JTextField txFechaInicio;
	private JTextField txtDdmmyyyy;
	private JTextField txPrecioOferta;
	private JLabel lbPrecioOferta;
	private Producto producto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//ejemplo producto
					ArrayList<String> eti = new ArrayList<>();
					eti.add("ROPA");
					eti.add("NIÑO");
					Producto p = new Producto("P456", "gorrito", "gorritos para el frio", 10.5, 10, "gucci", "ROSA", "S" , null,eti);
					Ofertar frame = new Ofertar(p);
					frame.setVisible(true);
				} catch (Exception e) {
					System.out.println(e);
					
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ofertar(Producto p) {
		this.producto = p;
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
		txtBsPrecio.setText(Double.toString(producto.getPrecio()));
		txtBsPrecio.setBounds(101, 27, 61, 22);
		contentPane.add(txtBsPrecio);
		txtBsPrecio.setColumns(10);
		
		JLabel lbFInicio = new JLabel("Fecha inicio: ");
		lbFInicio.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lbFInicio.setBounds(62, 127, 100, 26);
		contentPane.add(lbFInicio);
		
		txFechaInicio = new JTextField();
		txFechaInicio.setText("yyyy-mm-dd");
		txFechaInicio.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txFechaInicio.setBounds(180, 130, 160, 20);
		contentPane.add(txFechaInicio);
		txFechaInicio.setColumns(10);
		
		JLabel lbFFin = new JLabel("Fecha fin: ");
		lbFFin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lbFFin.setBounds(62, 166, 100, 26);
		contentPane.add(lbFFin);
		
		txtDdmmyyyy = new JTextField();
		txtDdmmyyyy.setText("yyyy-mm-dd");
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
          
            ControladorOferta controladorOferta = new ControladorOferta(Ofertar.this);
           
            controladorOferta.ofertarProducto(producto);
            
            
        } else {
        }
    }

	public JTextField getTxtBsPrecio() {
		return txtBsPrecio;
	}

	public void setTxtBsPrecio(JTextField txtBsPrecio) {
		this.txtBsPrecio = txtBsPrecio;
	}

	public JTextField getTxFechaInicio() {
		return txFechaInicio;
	}

	public void setTxFechaInicio(JTextField txFechaInicio) {
		this.txFechaInicio = txFechaInicio;
	}

	public JTextField getTxtDdmmyyyy() {
		return txtDdmmyyyy;
	}

	public void setTxtDdmmyyyy(JTextField txtDdmmyyyy) {
		this.txtDdmmyyyy = txtDdmmyyyy;
	}

	public JTextField getTxPrecioOferta() {
		return txPrecioOferta;
	}

	public void setTxPrecioOferta(JTextField txPrecioOferta) {
		this.txPrecioOferta = txPrecioOferta;
	}

	public JLabel getLbPrecioOferta() {
		return lbPrecioOferta;
	}

	public void setLbPrecioOferta(JLabel lbPrecioOferta) {
		this.lbPrecioOferta = lbPrecioOferta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
    
    
}
