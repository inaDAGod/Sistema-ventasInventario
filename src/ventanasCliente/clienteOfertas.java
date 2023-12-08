
package ventanasCliente;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

import ventasInventario.ProductoCliente;
import ventasInventario.BD.Controladores.ControladorProducto;
import ventasInventario.BD.Modelo.Producto;
import ventasInventario.BD.Modelo.Usuario;

import javax.swing.ScrollPaneConstants;
import java.awt.Font;

public class clienteOfertas extends JFrame {

    private static final long serialVersionUID = 1L;
    private ArrayList<Producto> ofertados;
    private ControladorProducto controladorProducto;
    private Usuario usuario;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Usuario u = new Usuario("danialee14");
                	clienteOfertas frame = new clienteOfertas(u);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public clienteOfertas(Usuario u) {
    	this.usuario = u;
        setResizable(false);
    	controladorProducto = new ControladorProducto();
    	ofertados = controladorProducto.ofertados();
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
        panel_2.setBackground(new Color(193, 123, 160));
        panel_2.setBounds(0, 137, 1200, 625);
        panel.add(panel_2);

        JPanel panelTarjetas = new JPanel();
        panelTarjetas.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        panelTarjetas.setBackground(new Color(239, 222, 230)); 
        panelTarjetas.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelTarjetas.setLayout(new BoxLayout(panelTarjetas, BoxLayout.X_AXIS));
      

       
        
       

        for (Producto producto: ofertados) {
                JPanel cardPanel = new JPanel();
                cardPanel.setLayout(new BoxLayout(cardPanel, BoxLayout.Y_AXIS));
                cardPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

                JButton buttonPedido = new JButton();
                buttonPedido.setLayout(new GridBagLayout());
                buttonPedido.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ProductoCliente frame = new ProductoCliente(usuario,producto);
						frame.setVisible(true);
					}
				});
                ImageIcon iconPedido = new ImageIcon(producto.getImagenes().get(0));

                int alturaDeseada = 300;
                int anchuraCalculada = 300;
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
                panelDetalles.setBackground(Color.white);
                panelDetalles.setLayout(new BoxLayout(panelDetalles, BoxLayout.Y_AXIS));
                JLabel labelNumeroCompra = new JLabel("Nombre: " + producto.getNombre());
                labelNumeroCompra.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                labelNumeroCompra.setForeground(Color.BLACK); 
                JLabel labelFecha = new JLabel("Antes: " + producto.getPrecio());
                labelFecha.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                labelFecha.setForeground(Color.RED); 
                JLabel labelEstado = new JLabel("Ahora: " + producto.getOferta().getPrecioOferta());
                labelEstado.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                labelEstado.setForeground(Color.GREEN);
                panelDetalles.add(labelNumeroCompra);
                panelDetalles.add(labelFecha);
                panelDetalles.add(labelEstado);

                buttonPedido.add(panelDetalles, gbc);
                buttonPedido.setPreferredSize(new Dimension(anchuraCalculada, alturaDeseada));

                Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

                buttonPedido.setBackground(Color.white);

                buttonPedido.addActionListener(e -> {
                    JFrame frame = (JFrame) SwingUtilities.getRoot(buttonPedido);
                    frame.dispose();
                });
                buttonPedido.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));

                cardPanel.add(buttonPedido);
                
                panelTarjetas.add(cardPanel);
            
        }
        panel_2.setLayout(null);

        JScrollPane scrollPane = new JScrollPane(panelTarjetas);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(10, 170, 1170, 456);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setBackground(Color.white);

        panel_2.add(scrollPane);
       
        JLabel lblNewLabel_1 = new JLabel(" OFERTAS DISPONIBLES");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 80));
        lblNewLabel_1.setForeground(Color.white);
        lblNewLabel_1.setBounds(10, 29, 1200, 100);
        panel_2.add(lblNewLabel_1);
        
      
        
    }
}
