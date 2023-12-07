package ventanasFuncionario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

//* poner abajo las clases 

import ventanasCliente.clientePedidoDetalle;
import ventasInventario.BD.Modelo.GestorPedidos;
import ventasInventario.BD.Modelo.Pedido;
import ventasInventario.BD.Modelo.ProductoCarrito;

import java.awt.Font;


public class funcionarioPedidoDetalle extends JFrame {
    private static final long serialVersionUID = 1L;
    private Pedido pedido;
   
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	GestorPedidos p = new GestorPedidos();//para probar
                	funcionarioPedidoDetalle frame = new funcionarioPedidoDetalle(p.getTodosPedidos().get(0));
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public funcionarioPedidoDetalle(Pedido p) {
    	this.pedido = p;
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
        panel_2.setBackground(new Color(214,166,190));
        panel_2.setBounds(0, 137, 1200, 625);
        panel_2.setLayout(null);  
        panel.add(panel_2);
        
      

        
        
        JPanel panelTarjetas = new JPanel();
        panelTarjetas.setLayout(new GridLayout(0, 1, 10, 10)); 
        panelTarjetas.setBackground(new Color(162,195,200));//lo de afuera de detalle
        panelTarjetas.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); 
        panel_2.add(panelTarjetas);
        


      
            TarjetaPedido tarjeta = new TarjetaPedido();
          
            panelTarjetas.add(tarjeta);
        panel_2.setLayout(null);
        
        JScrollPane scrollPane = new JScrollPane(panelTarjetas);
        
        
        scrollPane.setBounds(125, 223, 946, 349);

        scrollPane.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
       scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
       JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(162,195,200));//lo de afuera de la tabla
        panel_3.setBounds(125, 49, 946, 176);
        panel_2.add(panel_3);
        panel_3.setLayout(null);

        panel_3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        JLabel lblNewLabel_1 = new JLabel("");
        ImageIcon iconCarrito = new ImageIcon(clientePedidoDetalle.class.getResource("/imagenesJhess/carritos3.png"));
        Image imageCarrito = iconCarrito.getImage().getScaledInstance(204, 130, Image.SCALE_SMOOTH);
        lblNewLabel_1.setIcon(new ImageIcon(imageCarrito));
        lblNewLabel_1.setBounds(10, 24, 204, 130);
        panel_3.add(lblNewLabel_1);
        
       
        
        
        JPanel panel_4 = new JPanel();
        panel_4.setBackground(new Color(239, 222, 230));
        panel_4.setBounds(250, 24, 650, 130);
        panel_3.add(panel_4);
        panel_4.setLayout(null);
        panel_4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        JLabel lblNewLabel_2 = new JLabel("Pedido :"+pedido.getCpedido());
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        lblNewLabel_2.setBounds(24, 11, 296, 23);
        panel_4.add(lblNewLabel_2);
        
        JLabel lblNewLabel_2_1 = new JLabel("Fecha :"+pedido.getCpedido());
        lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        lblNewLabel_2_1.setBounds(24, 39, 296, 23);
        panel_4.add(lblNewLabel_2_1);
        
        JLabel lblNewLabel_2_1_1 = new JLabel("Estado :");
        lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        lblNewLabel_2_1_1.setBounds(24, 65, 253, 23);
        panel_4.add(lblNewLabel_2_1_1);
        
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("ESPERA PAGO");
        comboBox.addItem("CANCELADO");
        comboBox.addItem("PAGADO A ENTREGAR");
        comboBox.addItem("FINALIZADO");
        
        comboBox.setBounds(110, 65, 200, 23);
        panel_4.add(comboBox);
        comboBox.setEnabled(false);
        
       JLabel lblNewLabel_2_1_2 = new JLabel("Pago :");
        lblNewLabel_2_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        lblNewLabel_2_1_2.setBounds(24, 90, 253, 29);
        panel_4.add(lblNewLabel_2_1_2);
        
        JComboBox comboBox2 = new JComboBox();
        comboBox2.addItem("ESPERA PAGO");
        comboBox2.addItem("CANCELADO");
        comboBox2.addItem("PAGADO A ENTREGAR");
        comboBox2.addItem("FINALIZADO");
        
        comboBox2.setBounds(110, 95, 200, 23);
        panel_4.add(comboBox2);
        panel_2.add(scrollPane, BorderLayout.CENTER);
        comboBox2.setEnabled(false);
        
        
        
        JButton btnEditar = new JButton("EDITAR");
        btnEditar.setBackground(new Color(162, 195, 200));//boton editar 204
        btnEditar.setForeground(Color.WHITE); 
        btnEditar.setBounds(500, 10, 139, 36);
        panel_4.add(btnEditar);

        JButton btnCancelar = new JButton("CANCELAR");
        btnCancelar.setBackground(new Color(162, 195, 200));//boton editar 204
        btnCancelar.setForeground(Color.WHITE); 
        btnCancelar.setBounds(360, 10, 139, 36);
        btnCancelar.setVisible(false);
        panel_4.add(btnCancelar);

        JButton btnGuardar = new JButton("GUARDAR");
        btnGuardar.setBackground(new Color(162, 195, 200));//boton editar 204
        btnGuardar.setForeground(Color.WHITE); 
        btnGuardar.setBounds(500, 10, 139, 36);
        btnGuardar.setVisible(false);
        panel_4.add(btnGuardar);

        btnEditar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	comboBox2.setEnabled(true);
            	comboBox.setEnabled(true);
            	
                btnEditar.setVisible(false);
                btnCancelar.setVisible(true);
                btnGuardar.setVisible(true);
            }
        });

        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	comboBox2.setEnabled(false);
            	comboBox.setEnabled(false);

                btnEditar.setVisible(true);
                btnCancelar.setVisible(false);
                btnGuardar.setVisible(false);
            }
        });

        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	comboBox2.setEnabled(false);
            	comboBox.setEnabled(false);

                btnEditar.setVisible(true);
                btnCancelar.setVisible(false);
                btnGuardar.setVisible(false);
            }
        });
        
    }


    public class TarjetaPedido extends JPanel {
        private static final long serialVersionUID = 1L;

        public TarjetaPedido() {
            setLayout(new BorderLayout()); 
            setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            DefaultTableModel modeloTabla = new DefaultTableModel();
           
       
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Descripción");
            modeloTabla.addColumn("Cantidad");
            modeloTabla.addColumn("Marca");
            modeloTabla.addColumn("Precio");

            for (ProductoCarrito produc  : pedido.getProductos()) {
                modeloTabla.addRow(new Object[] {
                    
                        produc.getProducto().getNombre(),
                        produc.getProducto().getDescripcion(),
                        produc.getCantidad(),
                        produc.getProducto().getMarca(),
                        produc.getProducto().getPrecio(),
                  
                });
              
            }
            
            

            JTable tablaProductos = new JTable(modeloTabla);

         // Personalizar colores de celdas y encabezados
         personalizarTabla(tablaProductos);

         JScrollPane scrollPane = new JScrollPane(tablaProductos);

       
            tablaProductos.setBackground(new Color(255,229,154));//boton editar 204
            tablaProductos.setForeground(Color.BLACK); 
            tablaProductos.setBounds(500, 10, 139, 36);
           

            JLabel labelMonto = new JLabel("Monto Total: " + pedido.getTotal() + " Bs.");
            labelMonto.setFont(new Font("Times New Roman", Font.PLAIN, 20));
            labelMonto.setForeground(Color.white); 

            JPanel panelMonto = new JPanel();
            panelMonto.add(labelMonto);
            panelMonto.setBackground(new Color(184, 140, 158));//boton editar 204
            
            panelMonto.setBounds(500, 10, 139, 36);
           
            add(scrollPane, BorderLayout.CENTER); 
            add(panelMonto, BorderLayout.SOUTH); 
            setBackground(Color.WHITE);
            Dimension preferredSize = new Dimension(500, 0); 
            setPreferredSize(preferredSize);
        }
    }
    private void personalizarTabla(JTable tabla) {
       DefaultTableCellRenderer renderizador = new DefaultTableCellRenderer();
        renderizador.setBackground(new Color(239, 222, 230)); // Cambia el color a tu elección
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(renderizador);
        }

        JTableHeader encabezados = tabla.getTableHeader();
        encabezados.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
        encabezados.setBackground(new Color(184, 140, 158)); // Cambia el color a tu elección
        encabezados.setForeground(Color.white);
    }
    }

