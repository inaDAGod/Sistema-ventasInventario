package ventanasCliente;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;


import javax.swing.SpringLayout;

public class generalInicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel catalogo;
	 private JRadioButton radioBoton1, radioBoton2, radioBoton3, radioBoton3_1;
	    private JPanel panelTarjetas;
	    private JPanel panelBusqueda;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					generalInicio frame = new generalInicio();
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
	public generalInicio() {
		
	        
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		getContentPane().setLayout(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.red); //tdod el fondo iniciarl 
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Base = new JPanel();////tdod el fondo b
		Base.setBounds(0, 0, 1200, 800);
		Base.setBackground(Color.gray); 
		Base.setLayout(null);
		contentPane.add(Base);
		
		JPanel panelNarvar = new JPanel();//narvar
		panelNarvar.setBounds(0, 0, 1200, 140);
		panelNarvar.setBackground(Color.cyan);
		Base.add(panelNarvar);
		
		JPanel panelCuerpo = new JPanel();// cuerpo que vba debajo del narvar
		panelCuerpo.setBackground(Color.red);
		panelCuerpo.setBounds(0, 140, 1200, 625);
		panelCuerpo.setLayout(null);
		Base.add(panelCuerpo);
		
		
		
		 
		catalogo = new JPanel();
		catalogo.setBackground(Color.BLACK); 
		catalogo.setBounds(0, 200, 1200, 1000);
		
		
		JPanel panelParte1 = new JPanel();
		panelParte1.setBackground(Color.gray); 
		panelParte1.setBounds(0, 0, 1200, 300);
		panelParte1.setBorder(BorderFactory.createEmptyBorder(200, 0, 200, 20)); 
		panelParte1.setLayout(new BorderLayout());
        
        
		JPanel panelParte2 = new JPanel();
        panelParte2.setBackground(Color.BLUE); 
        panelParte2.setBounds(0, 100, 1200, 200);
        panelParte2.setLayout(new BorderLayout());
        
        JPanel panelParte3 = new JPanel();
        panelParte3.setBackground(Color.GREEN); 
        panelParte3.setBounds(0, 200, 1200, 200);
        panelParte3.setLayout(new BorderLayout());
        panelParte2.add(panelParte1);
		
		 JScrollPane scrollPane = new JScrollPane(catalogo);
	     scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	     scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	     scrollPane.setBounds(0, 0, 1185, 625);
	    
	     
	     panelCuerpo.add(scrollPane, BorderLayout.CENTER);
	     catalogo.add(panelParte1);
	     catalogo.add(panelParte2);
	     catalogo.add(panelParte3);
	}
	
	
	}










