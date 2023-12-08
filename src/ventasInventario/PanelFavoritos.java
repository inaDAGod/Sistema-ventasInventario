package ventasInventario;

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

import ventasInventario.BD.Controladores.ControladorFavorito;
import ventasInventario.BD.Modelo.Producto;
import ventasInventario.BD.Modelo.ProductoCarrito;
import ventasInventario.BD.Modelo.Usuario;

import java.awt.Color;

public class PanelFavoritos extends JPanel {
	JTable table;
	ArrayList<Producto> productos;
    DefaultTableModel modelo;
    private JTextField tfProductoBuscado;
    private ControladorFavorito controladorFavorito ;
    private Usuario usuario;
	public PanelFavoritos(Usuario u) {
		this.usuario = u;
		setBackground(new Color(193, 123, 160));
		controladorFavorito = new ControladorFavorito(usuario);
		productos = controladorFavorito.listaFavoritosUsuario();
		setLayout(null);
		
        Object[][] datos = new Object[productos.size()][2];
        for (int i = 0; i < productos.size(); i++) {
            datos[i][0] = productos.get(i).getNombre(); 
            datos[i][1] = productos.get(i).getPrecio();
        }
        
        modelo = new DefaultTableModel(datos, new String[]{"Productos", "Precio"}) {
            @Override
            public boolean isCellEditable(int row, int column) {
            	return false;
            	//return column == 0 || column == 1 || column == 2; editable
            }
        };
        table = new JTable(modelo);
        table.setBounds(210, 79, 802, 479);

        table.getColumnModel().getColumn(0).setPreferredWidth(320);
        table.getColumnModel().getColumn(1).setPreferredWidth(100);
        
        JButton btnTodo = new JButton("Mostrar Todo");
        btnTodo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		actualizarTabla();
        	}
        });
        btnTodo.setBounds(59, 170, 130, 30);
        add(btnTodo);
       
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(59, 211, 1050, 381);
        add(scrollPane);
        
        JLabel lbInventario = new JLabel("FAVORITOS");
        lbInventario.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        lbInventario.setBounds(59, 47, 245, 58);
        add(lbInventario);
        
        tfProductoBuscado = new JTextField();
        tfProductoBuscado.setBounds(59, 123, 929, 36);
        tfProductoBuscado.addActionListener(e -> buscarProducto()); 
        add(tfProductoBuscado);
        tfProductoBuscado.setColumns(10);
        
        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.addActionListener(e -> buscarProducto());
        btnBuscar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		buscarProducto();
        	}
        });
        btnBuscar.setBounds(1020, 123, 89, 36);
        add(btnBuscar);
        
        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		confirmarEliminacion();
        	}
        });
        btnEliminar.setBounds(1007, 174, 102, 26);
        add(btnEliminar);
        
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) { // Detectar doble clic
                    int filaSeleccionada = table.getSelectedRow();
                    if (filaSeleccionada != -1) {
                      
                        abrirProducto(productos.get(filaSeleccionada));
                    }
                }
            }
        });
	}
	private void buscarProducto() {

        String productoBuscado = tfProductoBuscado.getText().trim().toLowerCase();

        if (productoBuscado.isEmpty()) {
            actualizarTabla();
        } else {
            DefaultTableModel modeloFiltrado = new DefaultTableModel(new String[]{"Productos", "Precio"}, 0);

            boolean seEncontro = false;

            for (int i = 0; i < productos.size(); i++) {
                String nombreProducto = productos.get(i).getNombre().toLowerCase();

                if (nombreProducto.equals(productoBuscado) || nombreProducto.startsWith(productoBuscado)) {
                    modeloFiltrado.addRow(new Object[]{productos.get(i).getNombre(), productos.get(i).getPrecio()});
                    seEncontro = true;
                }
            }

            if (!seEncontro) {
                JOptionPane.showMessageDialog(this, "No se encontraron resultados para el producto: " + productoBuscado, "Sin coincidencias", JOptionPane.INFORMATION_MESSAGE);
            }

            table.setModel(modeloFiltrado);
       
        }
    }
	private void confirmarEliminacion() {
        int filaSeleccionada = table.getSelectedRow();

        if (filaSeleccionada != -1) {
            // Obtener el nombre del producto en la fila seleccionada
            String productoAEliminar = (String) table.getValueAt(filaSeleccionada, 0);

            // Mostrar cuadro de diálogo de confirmación
            int confirmacion = JOptionPane.showConfirmDialog(
                    PanelFavoritos.this,
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
	        Producto productoAEliminar = productos.get(filaSeleccionada);

	      
	        productos.remove(productoAEliminar);
	        modelo.removeRow(filaSeleccionada);
	        controladorFavorito.eliminarProducto(productoAEliminar);
	        JOptionPane.showMessageDialog(this, "Producto eliminado del favoritos: " + productoAEliminar.getNombre(), "Eliminado", JOptionPane.INFORMATION_MESSAGE);
	    } else {
	        JOptionPane.showMessageDialog(this, "Por favor, selecciona un producto para eliminar.", "Sin selección", JOptionPane.WARNING_MESSAGE);
	    }
	}
	
	private void abrirProducto(Producto producto) {
		getTopLevelAncestor().setVisible(false);
		ProductoCliente frame = new ProductoCliente(usuario,producto,null);
		frame.setVisible(true);
		
    }
    private void actualizarTabla() {
        table.setModel(modelo);
    }
}
