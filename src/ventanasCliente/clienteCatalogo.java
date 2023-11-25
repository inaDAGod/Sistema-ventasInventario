package ventanasCliente;
import javax.swing.*;
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
        panel_2.setBounds(0, 0, 1200, 625);
        panel_2.setLayout(null);  // Cambiado a un diseño nulo
        panelBase.add(panel_2);

        panelTarjetas = new JPanel();
        panelTarjetas.setLayout(new GridLayout(0, 1, 10, 10)); // Cambié el GridLayout a 1 columna
        panelTarjetas.setBackground(Color.black); // Establecer el fondo negro al SCROLLL
        panelTarjetas.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Margen de 10 píxeles para la tarjeta

        JScrollPane scrollPane = new JScrollPane(panelTarjetas);
        scrollPane.setBounds(125, 147, 946, 425);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // Cambié a VERTICAL_SCROLLBAR_ALWAYS
        panel_2.add(scrollPane);

        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(0, 0, 0));
        panel_3.setBounds(125, 49, 946, 98);
        panel_2.add(panel_3);
        panel_3.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Mis pedidos");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setBounds(28, 21, 303, 66);
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 57));
        panel_3.add(lblNewLabel_1);

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

    class TarjetaPedido extends JPanel {
        private static final long serialVersionUID = 1L;

        public TarjetaPedido(Pedido pedido) {
            setLayout(new BorderLayout()); // Diseño para cada "tarjeta"
            setBorder(BorderFactory.createLineBorder(Color.BLACK, 1)); // Borde para la tarjeta

            // Panel para el texto "Ropa"
            JPanel panelTexto = new JPanel();
            panelTexto.setBackground(new Color(0, 0, 0));
            panelTexto.setLayout(new BorderLayout());

            JLabel lblRopa = new JLabel("Ropa");
            lblRopa.setForeground(new Color(255, 255, 255));
            lblRopa.setFont(new Font("Times New Roman", Font.PLAIN, 50));
            lblRopa.setHorizontalAlignment(JLabel.CENTER);

            panelTexto.add(lblRopa, BorderLayout.CENTER);

            // Agregar panelTexto al panel de tarjeta en la región norte
            add(panelTexto, BorderLayout.NORTH);

            // Simulación de scrollPane
            JScrollPane scrollPane = new JScrollPane();
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

            // Establecer la altura del JScrollPane
            Dimension scrollPaneSize = new Dimension(200, 200);
            scrollPane.setPreferredSize(scrollPaneSize);

            // Agregar scrollPane al panel de tarjeta
            add(scrollPane, BorderLayout.CENTER);

            setBackground(Color.WHITE);
        }
    }
}
