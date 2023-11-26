
package ventanasCliente;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.ScrollPaneConstants;
import java.awt.Font;

public class clienteOfertas extends JFrame {

    private static final long serialVersionUID = 1L;

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

    public clienteOfertas() {
    	float descuento=(float) 0.2;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1200, 800);
        getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1200, 763);
        getContentPane().add(panel);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setForeground(SystemColor.activeCaptionBorder);
        panel_1.setBounds(0, 0, 1190, 140);
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
        panel_2.setBackground(new Color(255, 182, 193));
        panel_2.setBounds(0, 137, 1200, 625);
        panel.add(panel_2);

        JPanel panelTarjetas = new JPanel();
        panelTarjetas.setLayout(new BoxLayout(panelTarjetas, BoxLayout.X_AXIS));
        List<productos> listaProductos = new ArrayList<>();

        productos producto1 = new productos("P1", "Producto 1", "Descripción 1", 19.99f, 100, "Marca1", "Rojo", "M", true, "src/imagenesJhess/personas.jfif");
        productos producto2 = new productos("P2", "Producto 2", "Descripción 2", 29.99f, 50, "Marca2", "Azul", "L", false, "src/imagenesJhess/personassi.jfif");
        productos producto3 = new productos("P3", "Producto 3", "Descripción 3", 15.99f, 80, "Marca3", "Verde", "S", true, "src/imagenesJhess/personassi.jfif");
        productos producto4 = new productos("P4", "Producto 4", "Descripción 4", 24.99f, 60, "Marca4", "Amarillo", "XL", false, "src/imagenesJhess/producto4.jfif");
        productos producto5 = new productos("P5", "Producto 5", "Descripción 5", 34.99f, 30, "Marca5", "Negro", "XXL", true, "src/imagenesJhess/personassi.jfif");
        productos producto6 = new productos("P6", "Producto 6", "Descripción 6", 22.99f, 45, "Marca6", "Blanco", "L", true, "src/imagenesJhess/producto6.jfif");
        productos producto7 = new productos("P6", "Producto 6", "Descripción 6", 22.99f, 45, "Marca6", "Blanco", "L", true, "src/imagenesJhess/producto6.jfif");

        listaProductos.add(producto7);
        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);
        listaProductos.add(producto4);
        listaProductos.add(producto5);
        listaProductos.add(producto6);

       
        
       

        for (productos Productos : listaProductos) {
            if (Productos.isOfetado()) {
                JPanel cardPanel = new JPanel();
                cardPanel.setLayout(new BoxLayout(cardPanel, BoxLayout.Y_AXIS));
                cardPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

                JButton buttonPedido = new JButton();
                buttonPedido.setLayout(new GridBagLayout());

                ImageIcon iconPedido = new ImageIcon(Productos.getRuta_imagen());

                int alturaDeseada = 200;
                int anchuraCalculada = (alturaDeseada * iconPedido.getIconWidth()) / iconPedido.getIconHeight();
                Image imagenOriginal = iconPedido.getImage().getScaledInstance(anchuraCalculada, alturaDeseada, Image.SCALE_SMOOTH);

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
                panelDetalles.setBackground(Color.BLACK);
                panelDetalles.setLayout(new BoxLayout(panelDetalles, BoxLayout.Y_AXIS));
                JLabel labelNumeroCompra = new JLabel("Nombre: " + Productos.getNombre());
                labelNumeroCompra.setForeground(Color.WHITE); 
                float valor = Productos.getPrecio() * descuento;
                JLabel labelFecha = new JLabel("Antes: " + (Productos.getPrecio() + valor));
                labelFecha.setForeground(Color.RED); 
                JLabel labelEstado = new JLabel("Ahora: " + Productos.getPrecio());
                labelEstado.setForeground(Color.GREEN);
                panelDetalles.add(labelNumeroCompra);
                panelDetalles.add(labelFecha);
                panelDetalles.add(labelEstado);

                buttonPedido.add(panelDetalles, gbc);
                buttonPedido.setPreferredSize(new Dimension(anchuraCalculada, alturaDeseada));

                Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

                buttonPedido.setBackground(Color.BLACK);

                buttonPedido.addActionListener(e -> {
                    JFrame frame = (JFrame) SwingUtilities.getRoot(buttonPedido);
                    frame.dispose();
                });
                buttonPedido.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));

                cardPanel.add(buttonPedido);
                
                panelTarjetas.add(cardPanel);
            }
        }
        panel_2.setLayout(null);

        JScrollPane scrollPane = new JScrollPane(panelTarjetas);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(130, 170, 946, 306);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setBackground(Color.white);

        panel_2.add(scrollPane);
        
        JLabel lblNewLabel_1 = new JLabel(" OFERTAS DISPONIBLES");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        lblNewLabel_1.setBounds(10, 29, 413, 53);
        panel_2.add(lblNewLabel_1);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(255, 255, 255));
        panel_3.setBounds(10, 29, 413, 53);
        panel_2.add(panel_3);
    }
}
