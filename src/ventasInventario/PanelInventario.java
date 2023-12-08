package ventasInventario;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ventasInventario.BD.Controladores.ControladorProducto;
import ventasInventario.BD.Modelo.Producto;
import ventasInventario.BD.Modelo.Usuario;

import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class PanelInventario extends JPanel {
	JTable table;
	private ArrayList<Producto> productos;
	private ControladorProducto controladorProducto;
    DefaultTableModel modelo;
    private Usuario usuario;
    private JTextField tfProductoBuscado;
	public PanelInventario(Usuario u) {
		this.usuario = u;
		controladorProducto = new ControladorProducto(PanelInventario.this);
        productos = controladorProducto.todosProductos();
		setLayout(null);
		
        Object[][] datos = new Object[productos.size()][3];
        for (int i = 0; i < productos.size(); i++) {
            datos[i][0] = productos.get(i).getNombre();
            datos[i][1] = productos.get(i).getCantidad();
            datos[i][2] = productos.get(i).getPrecio();
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
        
        JLabel lbInventario = new JLabel("INVENTARIO");
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
                        abrirProducto(productos.get(filaSeleccionada));
                    }
                }
            }
        });
        
        JLabel fondo = new JLabel("New label");
        fondo.setIcon(new ImageIcon(PanelInventario.class.getResource("/imagenes/rosa1(1200x800).jpg")));
        fondo.setBounds(0, 0, 1190, 640);
        add(fondo);
	    
	}
	
	private void buscarProducto() {

        String productoBuscado = tfProductoBuscado.getText().trim().toLowerCase();

        if (productoBuscado.isEmpty()) {
            actualizarTabla();
        } else {
            DefaultTableModel modeloFiltrado = new DefaultTableModel(new String[]{"Productos", "Cantidad", "Precio"}, 0);

            boolean seEncontro = false;

            for (int i = 0; i < productos.size(); i++) {
                String nombreProducto = productos.get(i).getNombre().toLowerCase();

                if (nombreProducto.equals(productoBuscado) || nombreProducto.startsWith(productoBuscado)) {
                    modeloFiltrado.addRow(new Object[]{productos.get(i).getNombre(),productos.get(i).getCantidad(), productos.get(i).getPrecio()});
                    seEncontro = true;
                }
            }

            if (!seEncontro) {
                JOptionPane.showMessageDialog(this, "No se encontraron resultados para el producto: " + productoBuscado, "Sin coincidencias", JOptionPane.INFORMATION_MESSAGE);
            }

            table.setModel(modeloFiltrado);
       
        }
    }
	private void abrirProducto(Producto p) {
		 ProductoFuncionario frame = new ProductoFuncionario(p,usuario);
			frame.setVisible(true);
			setVisible(false);
			getTopLevelAncestor().setVisible(false);
    }
    private void actualizarTabla() {
        table.setModel(modelo);
    }
}
