package ventanasCliente;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;


public class clientePedidoDetalle extends JFrame {
    private static final long serialVersionUID = 1L;
    private List<Pedido> listaPedidos = new ArrayList<>();

    Pedido pedido1 = new Pedido(1, "01/01/2023", "En proceso", "/ruta/imagen1.png");
    Pedido pedido2 = new Pedido(2, "02/01/2023", "Entregado", "/ruta/imagen2.png");
   Pedido pedido11 = new Pedido(1, "01/01/2023", "En proceso", "/ruta/imagen1.png");
    Pedido pedido21 = new Pedido(2, "02/01/2023", "Entregado", "/ruta/imagen2.png");
    

    
    private List<productos> listaProductos = new ArrayList<>();

    productos producto1 = new productos("P1", "Producto 1", "Descripción 1", 19.99f, 100, "Marca1", "Rojo", "M", true, "src/imagenesJhess/personas.jfif");
    productos producto2 = new productos("P2", "Producto 2", "Descripción 2", 29.99f, 50, "Marca2", "Azul", "L", false, "src/imagenesJhess/personassi.jfif");
    productos producto3 = new productos("P3", "Producto 3", "Descripción 3", 15.99f, 80, "Marca3", "Verde", "S", true, "src/imagenesJhess/personassi.jfif");
    productos producto4 = new productos("P4", "Producto 4", "Descripción 4", 24.99f, 60, "Marca4", "Amarillo", "XL", false, "src/imagenesJhess/producto4.jfif");
    productos producto5 = new productos("P5", "Producto 5", "Descripción 5", 34.99f, 30, "Marca5", "Negro", "XXL", true, "src/imagenesJhess/personassi.jfif");
    productos producto6 = new productos("P6", "Producto 6", "Descripción 6", 22.99f, 45, "Marca6", "Blanco", "L", true, "src/imagenesJhess/producto6.jfif");
    productos producto7 = new productos("P6", "Producto 6", "Descripción 6", 22.99f, 45, "Marca6", "Blanco", "L", true, "src/imagenesJhess/producto6.jfif");
    productos producto11 = new productos("P1", "Producto 1", "Descripción 1", 19.99f, 100, "Marca1", "Rojo", "M", true, "src/imagenesJhess/personas.jfif");
    productos producto21 = new productos("P2", "Producto 2", "Descripción 2", 29.99f, 50, "Marca2", "Azul", "L", false, "src/imagenesJhess/personassi.jfif");
    productos producto31 = new productos("P3", "Producto 3", "Descripción 3", 15.99f, 80, "Marca3", "Verde", "S", true, "src/imagenesJhess/personassi.jfif");
    productos producto41 = new productos("P4", "Producto 4", "Descripción 4", 24.99f, 60, "Marca4", "Amarillo", "XL", false, "src/imagenesJhess/producto4.jfif");
    productos producto51 = new productos("P5", "Producto 5", "Descripción 5", 34.99f, 30, "Marca5", "Negro", "XXL", true, "src/imagenesJhess/personassi.jfif");
    productos producto61 = new productos("P6", "Producto 6", "Descripción 6", 22.99f, 45, "Marca6", "Blanco", "L", true, "src/imagenesJhess/producto6.jfif");
    productos producto71 = new productos("P6", "Producto 6", "Descripción 6", 22.99f, 45, "Marca6", "Blanco", "L", true, "src/imagenesJhess/producto6.jfif");

   
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	clientePedidoDetalle frame = new clientePedidoDetalle();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public clientePedidoDetalle() {
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

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(255, 182, 193));
        panel_2.setBounds(0, 137, 1200, 625);
        panel_2.setLayout(null);  
        panel.add(panel_2);
        
        JPanel panelTarjetas = new JPanel();
        panelTarjetas.setLayout(new GridLayout(0, 1, 10, 10)); 
        panelTarjetas.setBackground(Color.black);
        panelTarjetas.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); 
        panel_2.add(panelTarjetas);
        

        listaPedidos.add(pedido11);
        listaPedidos.add(pedido21);
        listaPedidos.add(pedido1);
        listaPedidos.add(pedido2);
        
        listaProductos.add(producto7);
        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);
        listaProductos.add(producto4);
        listaProductos.add(producto5);
        listaProductos.add(producto6);
        listaProductos.add(producto71);
        listaProductos.add(producto11);
        listaProductos.add(producto21);
        listaProductos.add(producto31);
        listaProductos.add(producto41);
        listaProductos.add(producto51);
        listaProductos.add(producto61);

      
            TarjetaPedido tarjeta = new TarjetaPedido(pedido11,listaProductos);
          
            panelTarjetas.add(tarjeta);
        panel_2.setLayout(null);
        
        JScrollPane scrollPane = new JScrollPane(panelTarjetas);
        
        
        scrollPane.setBounds(125, 223, 946, 349);
       scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
       JPanel panel_3 = new JPanel();
        panel_3.setBackground(Color.BLACK);
        panel_3.setBounds(125, 49, 946, 176);
        panel_2.add(panel_3);
        panel_3.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("");
        ImageIcon iconCarrito = new ImageIcon(clientePedidoDetalle.class.getResource("/imagenesJhess/carritos3.png"));
        Image imageCarrito = iconCarrito.getImage().getScaledInstance(204, 130, Image.SCALE_SMOOTH);
        lblNewLabel_1.setIcon(new ImageIcon(imageCarrito));
        lblNewLabel_1.setBounds(10, 24, 204, 130);
        panel_3.add(lblNewLabel_1);
        
        
        
        
        JPanel panel_4 = new JPanel();
        panel_4.setBackground(Color.WHITE);
        panel_4.setBounds(250, 24, 650, 130);
        panel_3.add(panel_4);
        panel_4.setLayout(null);
        
        JLabel lblNewLabel_2 = new JLabel("Pedido :"+pedido11.getNumeroCompra());
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        lblNewLabel_2.setBounds(24, 11, 296, 23);
        panel_4.add(lblNewLabel_2);
        
        JLabel lblNewLabel_2_1 = new JLabel("Fecha :"+pedido11.getFecha());
        lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        lblNewLabel_2_1.setBounds(24, 39, 296, 23);
        panel_4.add(lblNewLabel_2_1);
        
        JLabel lblNewLabel_2_1_1 = new JLabel("Estado :"+pedido11.getEstado());
        lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        lblNewLabel_2_1_1.setBounds(24, 65, 253, 23);
        panel_4.add(lblNewLabel_2_1_1);
        
        JLabel lblNewLabel_2_1_2 = new JLabel("Pago :"+pedido11.getEstado());
        lblNewLabel_2_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        lblNewLabel_2_1_2.setBounds(24, 90, 253, 29);
        panel_4.add(lblNewLabel_2_1_2);
        panel_2.add(scrollPane, BorderLayout.CENTER); // Agrega el JScrollPane al centro

    }


    public class TarjetaPedido extends JPanel {
        private static final long serialVersionUID = 1L;

        public TarjetaPedido(Pedido pedido, List<productos> listaProductos) {
            setLayout(new BorderLayout()); 
            setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            DefaultTableModel modeloTabla = new DefaultTableModel();
          
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Descripción");
            modeloTabla.addColumn("Cantidad");
            modeloTabla.addColumn("Marca");
            modeloTabla.addColumn("Precio");
            float montoTotal = 0;
            for (productos producto : listaProductos) {
                modeloTabla.addRow(new Object[] {
                    
                        producto.getNombre(),
                        producto.getDescripcion(),
                        producto.getCantidad(),
                        producto.getMarca(),
                        producto.getPrecio()
                       
                  
                });
                montoTotal += producto.getPrecio() * producto.getCantidad();
            }
            JTable tablaProductos = new JTable(modeloTabla);

            JScrollPane scrollPane = new JScrollPane(tablaProductos);

           
           
            JLabel labelMonto = new JLabel("Monto Total: " + montoTotal + " Bs.");
            labelMonto.setFont(new Font("Times New Roman", Font.PLAIN, 20));

            JPanel panelMonto = new JPanel();
            panelMonto.add(labelMonto);

           
            add(scrollPane, BorderLayout.CENTER); 
            add(panelMonto, BorderLayout.SOUTH); 
            setBackground(Color.WHITE);
            Dimension preferredSize = new Dimension(500, 10); 
            setPreferredSize(preferredSize);
        }
    }}
