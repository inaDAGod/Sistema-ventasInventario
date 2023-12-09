package ventasInventario;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Desktop;

public class PanelEnlaceNea extends JPanel {    
	public PanelEnlaceNea(String numeroPedido) {
        setLayout(null);
        
        JTextArea txtrParaCompletarEl = new JTextArea();
        txtrParaCompletarEl.setBackground(new Color(255, 255, 255));
        txtrParaCompletarEl.setFont(new Font("Rockwell", Font.PLAIN, 25));
        txtrParaCompletarEl.setWrapStyleWord(true);
        txtrParaCompletarEl.setLineWrap(true);
        txtrParaCompletarEl.setText("Para completar el proceso del pedido comunícate con Néa para coordinar el pago, a través del enlace de WhatsApp, manda el numero de pedido que sale en pantalla");
        txtrParaCompletarEl.setBounds(394, 228, 434, 184);
        add(txtrParaCompletarEl);
        
        JLabel fondo2 = new JLabel("New label");
        fondo2.setIcon(new ImageIcon(PanelEnlaceNea.class.getResource("/imagenes/rosa1(1200x800).jpg")));
        fondo2.setBounds(359, 189, 500, 265);
        add(fondo2);
        
        JLabel lbPedido = new JLabel("Pedido: P" + numeroPedido);
        System.out.println("Pedido: P" + numeroPedido);
        lbPedido.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbPedido.setBounds(364, 131, 67, 25);
        add(lbPedido);
        
        JLabel lbCarrito = new JLabel("¡Contáctanos!");
        lbCarrito.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        lbCarrito.setBounds(68, 56, 218, 47);
        add(lbCarrito);
        
        JButton btnEnlace = new JButton("¡Enlazate ahora!");
        btnEnlace.setBounds(463, 489, 300, 50);
        btnEnlace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
			            Desktop.getDesktop().browse(new URI("https://wa.link/c625hp"));
			        } catch (Exception ex) {
			            ex.printStackTrace();
			        }
			}
		});
        add(btnEnlace);
        
        
        JLabel fondo = new JLabel("New label");
        fondo.setIcon(new ImageIcon(PanelEnlaceNea.class.getResource("/imagenes/blanco(1200x800).jpg")));
        fondo.setBounds(0, 0, 1250, 800);
        add(fondo);
	}
}
