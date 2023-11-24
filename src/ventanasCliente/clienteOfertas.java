package ventanasCliente;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

public class clienteOfertas extends JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
    	EventQueue.invokeLater(new Runnable() {
    	    public void run() {
    	        try {
    	        	clienteOfertas frame = new clienteOfertas();
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
    public clienteOfertas() {
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

        ImageIcon iconPerfil =new ImageIcon("C:\\Users\\Desktop\\Documents\\GitHub\\Sistema-ventasInventario\\src\\imagenesJhess\\personas.jfif");
        Image imagePerfil = iconPerfil.getImage().getScaledInstance(130, 118, Image.SCALE_SMOOTH);

        JButton btnOferta_2 = new JButton("");
        btnOferta_2.setIcon(new ImageIcon(imagePerfil));
        btnOferta_2.setBounds(1048, 11, 130, 118);
        panel_1.add(btnOferta_2);

        JPanel panel_2 = new JPanel();
        panel_2.setBounds(0, 137, 1200, 625);
        panel.add(panel_2);

        JPanel panelTarjetas = new JPanel();
        panelTarjetas.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        
        
        
        
        
        
        
        
        List<Pedido> listaPedidos = new ArrayList<>();

        // Simulación de datos para cinco pedidos
        Pedido pedido1 = new Pedido(1, "01/01/2023", "En proceso", "/ruta/imagen1.png");
        Pedido pedido2 = new Pedido(2, "02/01/2023", "Entregado", "/ruta/imagen2.png");
        // ... (resto de la simulación)

        listaPedidos.add(pedido1);
        listaPedidos.add(pedido2);
        // ... (resto de la simulación)

        panelTarjetas.setLayout(new GridLayout(0, 4, 10, 10)); // 4 tarjetas por fila con 10 de espacio entre ellas

        for (Pedido pedido : listaPedidos) {
            JButton buttonPedido = new JButton();
            buttonPedido.setLayout(new BorderLayout()); // Diseño para cada "tarjeta"

            ImageIcon iconPedido = new ImageIcon("C:\\Users\\Desktop\\Documents\\GitHub\\Sistema-ventasInventario\\src\\imagenesJhess\\personas.jfif");
            Image imagenOriginal = iconPedido.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            ImageIcon iconRedimensionado = new ImageIcon(imagenOriginal);
            JLabel labelImagen = new JLabel(iconRedimensionado); // Imagen del pedido

            JPanel panelImagen = new JPanel();
            panelImagen.setLayout(new BorderLayout());
            panelImagen.add(labelImagen, BorderLayout.CENTER);

            JPanel panelDetalles = new JPanel();
            panelDetalles.setLayout(new GridLayout(0, 1)); // Diseño para los detalles del pedido

            JLabel labelNumeroCompra = new JLabel("Número de Compra: " + pedido.getNumeroCompra());
            JLabel labelFecha = new JLabel("Fecha: " + pedido.getFecha());
            JLabel labelEstado = new JLabel("Estado: " + pedido.getEstado());

            panelDetalles.add(labelNumeroCompra);
            panelDetalles.add(labelFecha);
            panelDetalles.add(labelEstado);

            // Botón del basurero
            ImageIcon iconBasurero = new ImageIcon("C:\\Users\\Desktop\\Documents\\GitHub\\Sistema-ventasInventario\\src\\imagenesJhess\\personas.jfif");
            Image imagenBasurero = iconBasurero.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            ImageIcon iconBasureroReducido = new ImageIcon(imagenBasurero);
            JButton buttonBasurero = new JButton(iconBasureroReducido);

            // Panel para el botón del basurero
            JPanel panelBasurero = new JPanel();
            panelBasurero.setLayout(new BorderLayout());
            panelBasurero.add(buttonBasurero, BorderLayout.EAST);

            // Agregar imagen y detalles al panel
            buttonPedido.add(panelImagen, BorderLayout.WEST);
            buttonPedido.add(panelDetalles, BorderLayout.CENTER);

            // Agregar botón de basurero en la esquina inferior derecha
            buttonPedido.add(panelBasurero, BorderLayout.SOUTH);

            buttonPedido.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Borde para los botones

            buttonPedido.addActionListener(e -> {
                JFrame frame = (JFrame) SwingUtilities.getRoot(buttonPedido);
                frame.dispose(); // Cerrar la ventana actual al hacer clic en la tarjeta
            });

            panelTarjetas.add(buttonPedido); // Agregar la "tarjeta" al panel de tarjetas
        }
        panel_2.setLayout(null);

        JScrollPane scrollPane = new JScrollPane(panelTarjetas);
        scrollPane.setBounds(125, 97, 946, 306);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panel_2.add(scrollPane);
      
    }
}