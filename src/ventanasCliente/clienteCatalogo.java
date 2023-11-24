package ventanasCliente;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class clienteCatalogo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	  private JTextField txtDatoABuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clienteCatalogo frame = new clienteCatalogo();
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
	public clienteCatalogo() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1200, 800);
        getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1200, 763);
        getContentPane().add(panel);
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
        btnNewButton.setBounds(226, 44, 139, 36);
        panel_1.add(btnNewButton);

        JButton btnOferta = new JButton("Productos");
        btnOferta.setBounds(394, 44, 139, 36);
        panel_1.add(btnOferta);

        JButton btnOferta_1 = new JButton("Quienes somos?");
        btnOferta_1.setBounds(729, 44, 139, 36);
        panel_1.add(btnOferta_1);

        JButton btnOferta_1_1 = new JButton("Oferta");
        btnOferta_1_1.setBounds(564, 44, 139, 36);
        panel_1.add(btnOferta_1_1);

        ImageIcon iconPerfil = new ImageIcon(
                "C:\\Users\\Desktop\\Documents\\GitHub\\Sistema-ventasInventario\\src\\imagenesJhess\\personas.jfif");
        Image imagePerfil = iconPerfil.getImage().getScaledInstance(130, 118, Image.SCALE_SMOOTH);

        JButton btnOferta_2 = new JButton("");
        btnOferta_2.setIcon(new ImageIcon(imagePerfil));
        btnOferta_2.setBounds(1048, 11, 130, 118);
        panel_1.add(btnOferta_2);

        JPanel panel_2 = new JPanel();
        panel_2.setBounds(0, 137, 1200, 625);
        panel.add(panel_2);

        JPanel panelTarjetas = new JPanel();
        panelTarjetas.setLayout(new BoxLayout(panelTarjetas, BoxLayout.X_AXIS));

        List<Pedido> listaPedidos = new ArrayList<>();

        Pedido pedido1 = new Pedido(1, "01/01/2023", "En proceso", "/ruta/imagen1.png");
        Pedido pedido2 = new Pedido(2, "02/01/2023", "Entregado", "/ruta/imagen2.png");

        listaPedidos.add(pedido1);
        listaPedidos.add(pedido2);

        Pedido pedido11 = new Pedido(1, "01/01/2023", "En proceso", "/ruta/imagen1.png");
        Pedido pedido21 = new Pedido(2, "02/01/2023", "Entregado", "/ruta/imagen2.png");

        listaPedidos.add(pedido11);
        listaPedidos.add(pedido21);

        Pedido pedido13 = new Pedido(1, "01/01/2023", "En proceso", "/ruta/imagen1.png");
        Pedido pedido23 = new Pedido(2, "02/01/2023", "Entregado", "/ruta/imagen2.png");

        listaPedidos.add(pedido13);
        listaPedidos.add(pedido23);
        Pedido pedido134 = new Pedido(1, "01/01/2023", "En proceso", "/ruta/imagen1.png");
        Pedido pedido234 = new Pedido(2, "02/01/2023", "Entregado", "/ruta/imagen2.png");

        listaPedidos.add(pedido134);
        listaPedidos.add(pedido234);

        for (Pedido pedido : listaPedidos) {
            JPanel cardPanel = new JPanel();
            cardPanel.setLayout(new BoxLayout(cardPanel, BoxLayout.Y_AXIS));
            cardPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            JButton buttonPedido = new JButton();
            buttonPedido.setLayout(new GridBagLayout());

            ImageIcon iconPedido = new ImageIcon(
                    "C:\\Users\\Desktop\\Documents\\GitHub\\Sistema-ventasInventario\\src\\imagenesJhess\\personas.jfif");
            Image imagenOriginal = iconPedido.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            ImageIcon iconRedimensionado = new ImageIcon(imagenOriginal);
            JLabel labelImagen = new JLabel(iconRedimensionado);
            labelImagen.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.weightx = 1.0;
            gbc.weighty = 1.0;
            gbc.anchor = GridBagConstraints.NORTH;

            buttonPedido.add(labelImagen, gbc);

            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.anchor = GridBagConstraints.SOUTH;

            JPanel panelDetalles = new JPanel();
            panelDetalles.setLayout(new BoxLayout(panelDetalles, BoxLayout.Y_AXIS));
            JLabel labelNumeroCompra = new JLabel("Número de Compra: " + pedido.getNumeroCompra());
            JLabel labelFecha = new JLabel("Fecha: " + pedido.getFecha());
            JLabel labelEstado = new JLabel("Estado: " + pedido.getEstado());
            panelDetalles.add(labelNumeroCompra);
            panelDetalles.add(labelFecha);
            panelDetalles.add(labelEstado);

            buttonPedido.add(panelDetalles, gbc);

            Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
            buttonPedido.setBorder(BorderFactory.createCompoundBorder(border,
                    BorderFactory.createEmptyBorder(10, 10, 10, 10)));

            buttonPedido.addActionListener(e -> {
                JFrame frame = (JFrame) SwingUtilities.getRoot(buttonPedido);
                frame.dispose();
            });

            cardPanel.add(buttonPedido);
            panelTarjetas.add(cardPanel);
        }

        panel_2.setLayout(null);

        JScrollPane scrollPane = new JScrollPane(panelTarjetas);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(0, 97, 1178, 528);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        panel_2.add(scrollPane);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBounds(0, 0, 1190, 100);
        panel_2.add(panel_3);
    }
}
