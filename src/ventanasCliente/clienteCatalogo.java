package ventanasCliente;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class clienteCatalogo extends JFrame {
    private static final long serialVersionUID = 1L;

    private JPanel panelTarjetas;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                clienteCatalogo frame = new clienteCatalogo();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public clienteCatalogo() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1200, 800);
        getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1200, 763);
        getContentPane().add(panel);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setForeground(Color.WHITE);
        panel_1.setBounds(0, 0, 1200, 140);
        panel.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel = new JLabel("");
        ImageIcon icon = new ImageIcon(
                "C:\\Users\\Desktop\\Documents\\GitHub\\Sistema-ventasInventario\\src\\imagenesJhess\\personas.jfif");
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
                "src/imagenesJhess/perfilpersona.png");
        Image imagePerfil = iconPerfil.getImage().getScaledInstance(130, 118, Image.SCALE_SMOOTH);

        JButton btnOferta_2 = new JButton("");
        btnOferta_2.setIcon(new ImageIcon(imagePerfil));
        btnOferta_2.setBounds(1048, 11, 130, 118);
        panel_1.add(btnOferta_2);
        
       


        JPanel panelBase = new JPanel();
        panelBase.setBounds(0, 137, 1200, 625);
        panelBase.setLayout(null);
        panel.add(panelBase);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(255, 182, 193));
        panel_2.setBounds(0, 0, 1190, 625);
        panel_2.setLayout(null);  // Cambiado a un diseño nulo
        panelBase.add(panel_2);

        panelTarjetas = new JPanel();
        panelTarjetas.setLayout(new GridLayout(0, 1, 10, 10)); // Cambié el GridLayout a 1 columna
        panelTarjetas.setBackground(new Color(255, 182, 193)); // Establecer el fondo negro al SCROLLL
        panelTarjetas.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Margen de 10 píxeles para la tarjeta

        JScrollPane scrollPane = new JScrollPane(panelTarjetas);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(0, 0, 1190, 625);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS); // Cambié a VERTICAL_SCROLLBAR_ALWAYS
        panel_2.add(scrollPane);

        // Agregar algunas tarjetas de pedidos iniciales
        List<Pedido> listaPedidos = obtenerNuevosPedidos(); // Debes implementar esta función
        agregarTarjetasPedidos(listaPedidos);
    }

    private void agregarTarjetasPedidos(List<Pedido> pedidos) {
        for (Pedido pedido : pedidos) {
            TarjetaPedido tarjeta = new TarjetaPedido(pedido);
            panelTarjetas.add(tarjeta); // Agregar la "tarjeta" al panel de tarjetas
        }
        // Refrescar la vista después de agregar las nuevas tarjetas
        panelTarjetas.revalidate();
        panelTarjetas.repaint();
    }
   
    private List<productos> obtenerListaProductos() {
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
         return listaProductos;
    }
    private List<Pedido> obtenerNuevosPedidos() {
        List<Pedido> listaPedidos = new ArrayList<>();

        Pedido pedido1 = new Pedido(1, "01/01/2023", "PENDIENTE", "/ruta/imagen1.png");
        Pedido pedido2 = new Pedido(2, "02/01/2023", "Entregado", "/ruta/imagen2.png");
        // ... (resto de la simulación)
        Pedido pedido11 = new Pedido(3, "01/01/2023", "En proceso", "/ruta/imagen1.png");
        Pedido pedido21 = new Pedido(4, "02/01/2023", "Entregado", "/ruta/imagen2.png");
        // ... (resto de la simulación)
        // ... (resto de la simulación)
        Pedido pedido113 = new Pedido(5, "01/01/2023", "En proceso", "/ruta/imagen1.png");
        Pedido pedido213 = new Pedido(6, "02/01/2023", "PENDIENTE", "/ruta/imagen2.png");
        // ... (resto de la simulación)
        // ... (resto de la simulación)
        Pedido pedido114 = new Pedido(7, "01/01/2023", "En proceso", "/ruta/imagen1.png");
        Pedido pedido214 = new Pedido(8, "02/01/2023", "PENDIENTE", "/ruta/imagen2.png");

        listaPedidos.add(pedido113);
        listaPedidos.add(pedido213);
        listaPedidos.add(pedido114);
        listaPedidos.add(pedido214);
        listaPedidos.add(pedido11);
        listaPedidos.add(pedido21);
        listaPedidos.add(pedido1);
        listaPedidos.add(pedido2);

        return listaPedidos;
    }

    public class TarjetaPedido extends JPanel {
        private static final long serialVersionUID = 1L;

        public TarjetaPedido(Pedido pedido) {
            setLayout(new BorderLayout()); // Diseño para cada "tarjeta"
            setBorder(BorderFactory.createLineBorder(Color.WHITE, 1)); // Borde para la tarjeta

            // Panel para el texto "Ropa"
            JPanel panelTexto = new JPanel();
            panelTexto.setBackground(new Color(0, 0, 0));
            panelTexto.setLayout(new BorderLayout());

            JLabel lblRopa = new JLabel("Ropa"); // Aquí debes obtener el tipo de producto desde el pedido
            lblRopa.setForeground(new Color(255, 255, 255));
            lblRopa.setFont(new Font("Times New Roman", Font.PLAIN, 50));
            lblRopa.setHorizontalAlignment(JLabel.CENTER);

            panelTexto.add(lblRopa, BorderLayout.CENTER);

            // Agregar panelTexto al panel de tarjeta en la región norte
            add(panelTexto, BorderLayout.NORTH);

            JPanel panelTarjetas = new JPanel();
            panelTarjetas.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10)); // Cambié a FlowLayout y ajusté los espacios
            panelTarjetas.setBackground(Color.black); // Establecer el fondo negro al SCROLLL
            panelTarjetas.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Margen de 10 píxeles para la tarjeta

            List<productos> listaProductos = obtenerListaProductos(); // Debes implementar esta función

            for (productos producto : listaProductos) {
                JPanel cardPanel = new JPanel();
                cardPanel.setLayout(new BoxLayout(cardPanel, BoxLayout.Y_AXIS));
                cardPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

                JButton buttonProducto = new JButton();
                buttonProducto.setLayout(new GridBagLayout());

                ImageIcon iconProducto = new ImageIcon(producto.getRuta_imagen());

                int alturaDeseada = 200;
                int anchuraCalculada = (alturaDeseada * iconProducto.getIconWidth()) / iconProducto.getIconHeight();
                Image imagenOriginal = iconProducto.getImage().getScaledInstance(anchuraCalculada, alturaDeseada, Image.SCALE_SMOOTH);

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

                buttonProducto.add(labelImagen, gbc);

                gbc.gridx = 0;
                gbc.gridy = 1;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.anchor = GridBagConstraints.SOUTH;

                JPanel panelDetalles = new JPanel();
                panelDetalles.setBackground(Color.BLACK);
         
              

                buttonProducto.add(panelDetalles, gbc);
                buttonProducto.setPreferredSize(new Dimension(anchuraCalculada, alturaDeseada));

                Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

                // Cambiar el color de los botones
                buttonProducto.setBackground(Color.BLACK);

                buttonProducto.addActionListener(e -> {
                    // Acción al hacer clic en el botón del producto
                    // Puedes agregar tu lógica aquí
                });

                buttonProducto.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));

                cardPanel.add(buttonProducto);

                // Fijar el tamaño preferido del cardPanel
                cardPanel.setPreferredSize(new Dimension(anchuraCalculada + 20, alturaDeseada + 20));
                panelTarjetas.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); 
                panelTarjetas.add(cardPanel);
            }

            JScrollPane scrollPane = new JScrollPane(panelTarjetas);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); // Cambié a HORIZONTAL_SCROLLBAR_ALWAYS
            scrollPane.setPreferredSize(new Dimension(400, 300));
            scrollPane.setBackground(Color.white);

            // Agregar scrollPane al panel de tarjeta en la región central
            add(scrollPane, BorderLayout.CENTER);

            setBackground(Color.WHITE);
        }
    
}}
