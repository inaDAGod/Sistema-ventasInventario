package ventasInventario;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
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

import ventasInventario.BD.Controladores.ControladorUsuario;
import ventasInventario.BD.Modelo.Usuario;

import java.awt.Color;

public class PanelListadoClientes extends JPanel {
	private JTable table;
	private ArrayList<Usuario> usuarios;
	
    DefaultTableModel modelo;
    private JTextField tUsuarioBuscado;
	public PanelListadoClientes() {
		setBackground(new Color(255, 255, 255));
		ControladorUsuario cu = new ControladorUsuario();
		this.usuarios = cu.listaUsuario();
		setLayout(null);
		
        Object[][] datos = new Object[usuarios.size()][3];
        for (int i = 0; i < usuarios.size(); i++) {
            datos[i][0] = usuarios.get(i).getUsuario();
            datos[i][1] = usuarios.get(i).getNombre();
            datos[i][2] = usuarios.get(i).getCorreo();
        }
        
        modelo = new DefaultTableModel(datos, new String[]{"Usuario", "Nombre", "Correo"}) {
            @Override
            public boolean isCellEditable(int row, int column) {
            	return false;
            	//return column == 0 || column == 1 || column == 2; editable
            }
        };
        table = new JTable(modelo);
        table.setBounds(210, 79, 802, 479);

        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        table.getColumnModel().getColumn(1).setPreferredWidth(310);
        table.getColumnModel().getColumn(2).setPreferredWidth(310);
        
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
        
        JLabel lbListaUsuarios = new JLabel("LISTA DE USUARIOS");
        lbListaUsuarios.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        lbListaUsuarios.setBounds(59, 47, 392, 58);
        add(lbListaUsuarios);
        
        tUsuarioBuscado = new JTextField();
        tUsuarioBuscado.setBounds(59, 123, 929, 36);
        tUsuarioBuscado.addActionListener(e -> buscarProducto()); 
        add(tUsuarioBuscado);
        tUsuarioBuscado.setColumns(10);
        
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
                        abrirUsuario(productoSeleccionado);
                    }
                }
            }
        });
	}
	private void buscarProducto() {
        String usuarioBuscado = tUsuarioBuscado.getText().trim().toLowerCase();

        if (usuarioBuscado.isEmpty()) {
            actualizarTabla();
        } else {
            DefaultTableModel modeloFiltrado = new DefaultTableModel(new String[]{"Usuario", "Nombre", "Correo"}, 0);

            boolean seEncontro = false;

            for (int i = 0; i < usuarios.size(); i++) {
                String nombreProducto = usuarios.get(i).getNombre().toLowerCase();

                if (nombreProducto.equals(usuarioBuscado) || nombreProducto.startsWith(usuarioBuscado)) {
                    modeloFiltrado.addRow(new Object[]{usuarios.get(i).getUsuario(), usuarios.get(i).getNombre(), usuarios.get(i).getCorreo()});
                    seEncontro = true;
                }
            }

            if (!seEncontro) {
                JOptionPane.showMessageDialog(this, "No se encontraron resultados para el usuario: " + usuarioBuscado, "Sin coincidencias", JOptionPane.INFORMATION_MESSAGE);
            }
            table.setModel(modeloFiltrado);
       
        }
    }
	private void abrirUsuario(String usuario) {
		 JOptionPane.showMessageDialog(this, "Aqui añadimos la venta de usuario hehe: ", usuario, JOptionPane.INFORMATION_MESSAGE);
    }
    private void actualizarTabla() {
        table.setModel(modelo);
    }
}
