package ventanasFuncionario;



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
import javax.swing.SwingUtilities;

import ventasInventario.BD.Controladores.ControladorPedidos;
import ventasInventario.BD.Modelo.GestorPedidos;
import ventasInventario.BD.Modelo.Pedido;
import ventasInventario.BD.Modelo.Usuario;

import java.awt.Font;

class TarjetaPedido extends JPanel {
    private static final long serialVersionUID = 1L;

    public TarjetaPedido(Pedido pedido) {
    	 
    	 setLayout(new BorderLayout()); 
         setBorder(BorderFactory.createLineBorder(Color.BLACK, 0)); 
         

        ImageIcon iconPedido = new ImageIcon(
                "src\\imagenesJhess\\carritos3.png");
        Image imagenOriginal = iconPedido.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon iconRedimensionado = new ImageIcon(imagenOriginal);
        JLabel labelImagen = new JLabel(iconRedimensionado); 

        JPanel panelImagen = new JPanel();
        panelImagen.setLayout(new BorderLayout());
        panelImagen.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelImagen.add(labelImagen, BorderLayout.WEST); 
        panelImagen.setBackground(Color.WHITE); 
        JPanel panelDetalles = new JPanel();
        panelDetalles.setLayout(new GridLayout(0, 1)); 
       
        JLabel labelNumeroCompra = new JLabel("PEDIDO " + pedido.getCpedido());
        JLabel labelFecha = new JLabel("Fecha: " + pedido.getFecha_reserva());
        JLabel labelEstado = new JLabel("Estado: " + pedido.getEstadoPedido());

       

        panelDetalles.add(labelNumeroCompra);
        panelDetalles.add(labelFecha);
        panelDetalles.add(labelEstado);
        panelDetalles.setBackground(Color.WHITE); 
      
        JButton buttonInfo = new JButton("Más Información");
        buttonInfo.setForeground(Color.WHITE);
        buttonInfo.setBorder(BorderFactory.createLineBorder(Color.black, 2)); 
        buttonInfo.setBounds(0, 0, 300, 1500);
        buttonInfo.setBackground(new Color(167, 134, 252)); 
        
        
       
        Font font = new Font("Times New Roman", Font.PLAIN, 30);
        labelNumeroCompra.setFont(font);
        labelFecha.setFont(font);
        labelEstado.setFont(font);
        buttonInfo.setFont(font);

        JPanel panelInfo = new JPanel();
        panelInfo.setLayout(new BorderLayout());
        panelInfo.setBorder(BorderFactory.createEmptyBorder(10, 20, 150, 10)); 
        panelInfo.add(buttonInfo, BorderLayout.CENTER); 
        panelInfo.setBackground(Color.WHITE);
      
        add(panelImagen, BorderLayout.WEST);
        add(panelDetalles, BorderLayout.CENTER);

      
        add(panelInfo, BorderLayout.EAST);
        setBackground(Color.WHITE);
    }
    }


public class funcionarioPedidosActuales extends JFrame {
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	ControladorPedidos controladorPedidos = new ControladorPedidos();
                	 ArrayList<Pedido> listaPedidos = controladorPedidos.pedidosPendientes();
                	funcionarioPedidosActuales frame = new funcionarioPedidosActuales(listaPedidos);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public funcionarioPedidosActuales(ArrayList<Pedido> listaPedidos) {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1200, 800);
        getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1200, 763);
        getContentPane().add(panel);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setForeground(new Color(239, 222, 230));
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
        panel_2.setBackground(new Color(214, 166, 190));
        panel_2.setBounds(0, 137, 1200, 625);
        panel_2.setLayout(null);  
        panel.add(panel_2);
        
        JPanel panelTarjetas = new JPanel();
        panelTarjetas.setLayout(new GridLayout(0, 1, 10, 10)); 
        panelTarjetas.setBackground(Color.black); 
        panelTarjetas.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel_2.add(panelTarjetas);
        
        panelTarjetas.setBorder(BorderFactory.createLineBorder(Color.black, 2)); 
        panelTarjetas.setBackground(new Color(255, 229, 154)); 
 
        
        for (Pedido pedido : listaPedidos) {
            TarjetaPedido tarjeta = new TarjetaPedido(pedido);
          
            panelTarjetas.add(tarjeta);
        }
        panel_2.setLayout(null);
        

        JScrollPane scrollPane = new JScrollPane(panelTarjetas);
        scrollPane.setBounds(125, 147, 946, 425);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.black, 1)); 
        panel_2.add(scrollPane);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(0, 0, 0));
        panel_3.setBounds(125, 49, 946, 98);
        panel_2.add(panel_3);
        panel_3.setLayout(null);
        panel_3.setBackground(new Color(255, 229, 154)); 
        panel_3.setBorder(BorderFactory.createLineBorder(Color.black, 2)); 
        
        JLabel lblNewLabel_1 = new JLabel("Pedidos Pendientes");
        lblNewLabel_1.setForeground(new Color(0, 0, 0));
        lblNewLabel_1.setBounds(28, 21, 500, 66);
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 57));
        panel_3.add(lblNewLabel_1);
    }}

