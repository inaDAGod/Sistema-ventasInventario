package ventanasCliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class CarruselEjemplo extends JFrame {

    private JPanel carruselPanel;
    private List<String> listaImagenes;
    private int currentIndex = 0;
    private Timer timer;
    
    
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
            	CarruselEjemplo frame = new CarruselEjemplo();
                frame.setVisible(true);
        	} catch (Exception e) {
				e.printStackTrace();
			}
	
	});
}
    
    
    public CarruselEjemplo() {
        setTitle("Ejemplo de Carrusel");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        listaImagenes = new ArrayList<>();
        listaImagenes.add("src/imagenesJhess/perfilpersona.png");
        listaImagenes.add("src/imagenesJhess/lapiz");
        listaImagenes.add("src/imagenesJhess/perfilpersona.png");
        listaImagenes.add("src/imagenesJhess/lapiz");

        carruselPanel = new JPanel(new BorderLayout());
        getContentPane().add(carruselPanel, BorderLayout.CENTER);

        JButton prevButton = new JButton("Anterior");
        JButton nextButton = new JButton("Siguiente");

        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showPreviousImage();
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showNextImage();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);

        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        startTimer();
        showImage();
    }

    private void startTimer() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                showNextImage();
            }
        }, 0, 1000); // Cambia 3000 a la cantidad de milisegundos entre imágenes
    }

    private void showImage() {
        carruselPanel.removeAll();

        String imagePath = listaImagenes.get(currentIndex);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(imagePath).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
        JLabel imageLabel = new JLabel(imageIcon);
        carruselPanel.add(imageLabel, BorderLayout.SOUTH);

        revalidate();
        repaint();
    }

    private void showNextImage() {
        currentIndex = (currentIndex + 1) % listaImagenes.size();
        showImage();
    }

    private void showPreviousImage() {
        currentIndex = (currentIndex - 1 + listaImagenes.size()) % listaImagenes.size();
        showImage();
    }

  
    
    
}
