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
import ventasInventario.BD.Modelo.Usuario;

import java.awt.Color;

public class PanelFavoritos extends JPanel {
	JTable table;
	ArrayList<Producto> productos;
    DefaultTableModel modelo;
    private JTextField tfProductoBuscado;
	public PanelFavoritos(Usuario usuario) {
		setBackground(new Color(193, 123, 160));
		ControladorFavorito controladorFavorito = new ControladorFavorito(usuario);
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
	private void abrirProducto(String producto) {
		
		 JOptionPane.showMessageDialog(this, "Aqui añadimos la ventan de producto hehe: ", producto, JOptionPane.INFORMATION_MESSAGE);
    }
    private void actualizarTabla() {
        table.setModel(modelo);
    }
}
