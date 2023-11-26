package ventasInventario;
import java.text.DecimalFormat;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PanelCarrito extends JPanel {
	JTable table;
	ArrayList<String> productos;
	ArrayList<Integer>  cantidad;
	ArrayList<Double>  precio;
    DefaultTableModel modelo;
	public PanelCarrito() {
		productos = new ArrayList<>();
        cantidad = new ArrayList<>();
        precio = new ArrayList<>();
        
		setLayout(null);
		productos.add("Prod1"); cantidad.add(1); precio.add(110.1);
		productos.add("Prod2"); cantidad.add(10); precio.add(120.1);
		productos.add("Prod3"); cantidad.add(12); precio.add(130.1);
		
        Object[][] datos = new Object[productos.size()][3];
        for (int i = 0; i < productos.size(); i++) {
            datos[i][0] = productos.get(i);
            datos[i][1] = cantidad.get(i);
            datos[i][2] = precio.get(i);
        }
        
        modelo = new DefaultTableModel(datos, new String[]{"Productos", "Cantidad", "Precio"}) {
            @Override
            public boolean isCellEditable(int row, int column) {
            	return false;
            	//return column == 0 || column == 1 || column == 2; editable
            }
        };
        table = new JTable(modelo);
        table.setBounds(210, 79, 802, 479);

        table.getColumnModel().getColumn(0).setPreferredWidth(320);
        table.getColumnModel().getColumn(1).setPreferredWidth(60);
        table.getColumnModel().getColumn(2).setPreferredWidth(60);
        
        DecimalFormat DosDecimales = new DecimalFormat("#.##");
        String total = DosDecimales.format(TotalCarrito(precio));
        
        JButton btnPedido = new JButton("Realizar pedido");
        btnPedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               PanelEnlaceNea enlace= new PanelEnlaceNea();
            	enlace.setSize(1200,790);
				enlace.setLocation(0,0);
				removeAll();
			    add(enlace,BorderLayout.CENTER);
				revalidate();
				repaint();
            }
        });
        btnPedido.setBounds(943, 550, 170, 50);
        add(btnPedido);
        
        JLabel LTotal = new JLabel("Total: \t\tBs. \t\t "+total);
        LTotal.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        LTotal.setBounds(915, 490, 188, 24);
        add(LTotal);
        
        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(59, 483, 74, 50);
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                confirmarEliminacion();
            }
        });
        add(btnEliminar);
        
       
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(59, 128, 1050, 334);
        add(scrollPane);
        
        JLabel lbCarrito = new JLabel("CARRITO ACTUAL");
        lbCarrito.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        lbCarrito.setBounds(59, 47, 353, 58);
        add(lbCarrito);
        
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) { // Detectar doble clic
                    int filaSeleccionada = table.getSelectedRow();
                    if (filaSeleccionada != -1) {
                      
                        String productoSeleccionado = (String) table.getValueAt(filaSeleccionada, 0);
                        abrirProducto(productoSeleccionado);
                    }
                }
            }
        });
        
        JLabel fondo = new JLabel("New label");
        fondo.setIcon(new ImageIcon(PanelInventario.class.getResource("/imagenes/rosa1(1200x800).jpg")));
        fondo.setBounds(0, 0, 1190, 640);
        add(fondo);
	}
	private void confirmarEliminacion() {
        int filaSeleccionada = table.getSelectedRow();

        if (filaSeleccionada != -1) {
            // Obtener el nombre del producto en la fila seleccionada
            String productoAEliminar = (String) table.getValueAt(filaSeleccionada, 0);

            // Mostrar cuadro de diálogo de confirmación
            int confirmacion = JOptionPane.showConfirmDialog(
                    PanelCarrito.this,
                    "¿Estás seguro de eliminar el producto '" + productoAEliminar + "' del carrito?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION);

            // Si el usuario selecciona 'Sí' (Aceptar), proceder con la eliminación
            if (confirmacion == JOptionPane.YES_OPTION) {
                eliminarFilaSeleccionada();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un producto para eliminar.", "Sin selección", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Método para eliminar la fila seleccionada de la tabla
    private void eliminarFilaSeleccionada() {
    	int filaSeleccionada = table.getSelectedRow();

    	if (filaSeleccionada != -1) {
           
            String productoAEliminar = (String) table.getValueAt(filaSeleccionada, 0);

            int indice = productos.indexOf(productoAEliminar);
            if (indice != -1) {
                productos.remove(indice);
                cantidad.remove(indice);
                precio.remove(indice);
            }

            modelo.removeRow(filaSeleccionada);

            actualizarTotalCarrito();

            JOptionPane.showMessageDialog(this, "Producto eliminado del carrito: " + productoAEliminar, "Eliminado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un producto para eliminar.", "Sin selección", JOptionPane.WARNING_MESSAGE);
        }
    }
    
   private void abrirProducto(String producto) {
		 JOptionPane.showMessageDialog(this, "Aqui añadimos la venta de producto hehe: ", producto, JOptionPane.INFORMATION_MESSAGE);
   }
   private void actualizarTotalCarrito() {
       DecimalFormat DosDecimales = new DecimalFormat("#.##");
       String total = DosDecimales.format(TotalCarrito(precio));

       JLabel LTotal = (JLabel) getComponentAt(915, 490);
       LTotal.setText("Total: \t\tBs. \t\t " + total);
   }
   private void actualizarTabla() {
       table.setModel(modelo);
   }
   public static double TotalCarrito(ArrayList<Double> precios) {
       double suma = 0.0;
       for (Double elemento : precios) {
           suma += elemento;
       }
       return suma;
   }
}
