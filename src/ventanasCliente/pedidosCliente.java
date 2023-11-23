package ventanasCliente;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;


class TarjetaPedido extends JPanel {
    private JLabel lblImagen;
    private JLabel lblCompra;
    private JLabel lblFecha;
    private JLabel lblEstado;

    public TarjetaPedido(String rutaImagen, String compra, String fecha, String estado) {
        setLayout(new BorderLayout());

        lblImagen = new JLabel();
        ImageIcon iconPedido = new ImageIcon(rutaImagen);
        Image imagePedido = iconPedido.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        lblImagen.setIcon(new ImageIcon(imagePedido));

        lblCompra = new JLabel("Compra #" + compra);
        lblFecha = new JLabel("Fecha: " + fecha);
        lblEstado = new JLabel("Estado: " + estado);

        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(new GridLayout(3, 1));
        panelDatos.add(lblCompra);
        panelDatos.add(lblFecha);
        panelDatos.add(lblEstado);

        add(lblImagen, BorderLayout.WEST);
        add(panelDatos, BorderLayout.CENTER);
    }
}

public class pedidosCliente extends JPanel {
	

	private static final long serialVersionUID = 1L;
	private List<Pedido> listaPedidos;
	/**
	 * Create the panel.
	 */
	public pedidosCliente() {
		 setLayout(null);

	        JPanel panel = new JPanel();
	        panel.setBounds(0, 0, 1200, 800);
	        add(panel);
	        panel.setLayout(null);

	        JPanel panel_1 = new JPanel();
	        panel_1.setForeground(SystemColor.activeCaptionBorder);
	        panel_1.setBounds(0, 0, 1200, 140);
	        panel.add(panel_1);
	        panel_1.setLayout(null);

	        JLabel lblNewLabel = new JLabel("");
	        ImageIcon icon = new ImageIcon("/imagenesJhess/personas.jfif");
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
		
		ImageIcon iconPerfil = new ImageIcon("/imagenesJhess/perfilpersona.png");
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
	        panel_3.setBackground(new Color(255, 153, 204));
	        panel_3.setBounds(0, 5, 1200, 658);
	        panel_2.add(panel_3);
	        panel_3.setLayout(null);
	        
	        JScrollPane scrollPane = new JScrollPane();
	        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	        scrollPane.setBounds(95, 132, 972, 480);
	        panel_3.add(scrollPane);
	        
	        JPanel panel_4 = new JPanel();
	        panel_4.setBackground(new Color(224, 255, 255));
	        panel_4.setBounds(95, 11, 972, 122);
	        panel_3.add(panel_4);
	        panel_4.setLayout(null);
	        
	        JLabel lblNewLabel_1 = new JLabel("MIS PEDIDOS");
	        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 45));
	        lblNewLabel_1.setBounds(300, 11, 321, 92);
	        panel_4.add(lblNewLabel_1);

	        // Crear el panel que contendrá la lista de tarjetas de pedidos
	        JPanel panelTarjetasPedidos = new JPanel();
	        panelTarjetasPedidos.setLayout(new BoxLayout(panelTarjetasPedidos, BoxLayout.Y_AXIS));

	        // Iterar sobre la lista de pedidos y agregar TarjetasPedido al panel de tarjetas de pedidos
	        for (Pedido pedido : listaPedidos) {
	            TarjetaPedido tarjetaPedido = new TarjetaPedido(pedido.getRutaImagen(),
	                    Integer.toString(pedido.getNumeroCompra()), pedido.getFecha(), pedido.getEstado());
	            panelTarjetasPedidos.add(tarjetaPedido);
	        }

	        scrollPane.setViewportView(panelTarjetasPedidos);
	    }
	}