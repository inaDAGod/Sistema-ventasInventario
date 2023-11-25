package ventanasCliente;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class TarjetaPedido extends JPanel {
    private static final long serialVersionUID = 1L;

    public TarjetaPedido(Pedido pedido) {
        setLayout(new BorderLayout()); // Diseño para cada "tarjeta"
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1)); // Borde para la tarjeta

        ImageIcon iconPedido = new ImageIcon(
        		"src/imagenesJhess/carritos3.png");
        Image imagenOriginal = iconPedido.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon iconRedimensionado = new ImageIcon(imagenOriginal);
        JLabel labelImagen = new JLabel(iconRedimensionado); // Imagen del pedido

        JPanel panelImagen = new JPanel();
        panelImagen.setLayout(new BorderLayout());
        panelImagen.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Margen de 10 píxeles
        panelImagen.add(labelImagen, BorderLayout.WEST); // Imagen a la izquierda
        panelImagen.setBackground(Color.WHITE); // Fondo blanco
        JPanel panelDetalles = new JPanel();
        panelDetalles.setLayout(new GridLayout(0, 1)); // Diseño para los detalles del pedido

        JLabel labelNumeroCompra = new JLabel("PEDIDO " + pedido.getNumeroCompra());
        JLabel labelFecha = new JLabel("Fecha: " + pedido.getFecha());
        JLabel labelEstado = new JLabel("Estado: " + pedido.getEstado());

        panelDetalles.add(labelNumeroCompra);
        panelDetalles.add(labelFecha);
        panelDetalles.add(labelEstado);
        panelDetalles.setBackground(Color.WHITE); // Fondo blanco
        // Botón para más información
        JButton buttonInfo = new JButton("Más Información");
        buttonInfo.setForeground(Color.WHITE);
        buttonInfo.setBackground(new Color(255, 182, 193)); // Fondo rosado

        // Aumentar el tamaño de la fuente para los detalles
        Font font = new Font("Times New Roman", Font.PLAIN, 30);
        labelNumeroCompra.setFont(font);
        labelFecha.setFont(font);
        labelEstado.setFont(font);
        buttonInfo.setFont(font);

        // Panel para el botón de más información
        JPanel panelInfo = new JPanel();
        panelInfo.setLayout(new BorderLayout());
        panelInfo.setBorder(BorderFactory.createEmptyBorder(10, 20, 150, 10)); // Margen de 10 píxeles
        panelInfo.add(buttonInfo, BorderLayout.CENTER); // Botón en el centro
        panelInfo.setBackground(Color.WHITE); // Fondo blanco
        // Agregar imagen y detalles al panel
        add(panelImagen, BorderLayout.WEST);
        add(panelDetalles, BorderLayout.CENTER);

        // Agregar botón de más información a la misma altura que la imagen
        add(panelInfo, BorderLayout.EAST);
        setBackground(Color.WHITE);
    }
}


