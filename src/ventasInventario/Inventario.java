package ventasInventario;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Inventario extends JFrame  {
	JTable tabla;
    DefaultTableModel modelo;
    JButton btnAgregar, btnEliminar;
    String[] encabezados;
    int [] cantidad;
    Double[] precio;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventario frame = new Inventario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inventario() {
		setSize(1200,800);
		getContentPane().setLayout(null);
		setSize(1200,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		setBackground(new Color(204, 102, 153));
		setBounds(0,0,1200,800);
		
		
		
		Object[][] datos = new Object[encabezados.length][3];
        for (int i = 0; i < encabezados.length; i++) {
            datos[i][0] = encabezados[i];
            datos[i][1] = cantidad[i];
            datos[i][2] = precio[i];
        }
        
		this.modelo = new DefaultTableModel(datos, new String[]{"Producto", "Cantidad", "Precio"}) {
            @Override
            public boolean isCellEditable(int row, int column) {
            	return column == 0 || column == 1 || column == 2;
            }
        };
        this.tabla = new JTable(this.modelo);
        
        this.btnAgregar = new JButton("Agregar Fila");
        //this.btnAgregar.addActionListener(this);


        this.btnEliminar = new JButton("Eliminar Fila");
        //this.btnEliminar.addActionListener(this);
        
     //panel de botones 
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());
        panelBotones.add(btnAgregar);
        panelBotones.add(btnEliminar);

        //panel principal
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.add(new JScrollPane(tabla), BorderLayout.CENTER);
        panelPrincipal.add(panelBotones, BorderLayout.SOUTH);

        // Agregación del panel principal a la ventana
        add(panelPrincipal);

	}

}
