import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana5 extends JFrame {
	
	private Container panelPrincipal;
	private JLabel etiqueta;
	private JPanel panelNorte;
	private JPanel panelSur;
	private JPanel panelCentral;
	private JLabel pedirCambio;
	private JTextField cambio;
	private JLabel pedirCantidad;
	private JTextField cantidad;
	
	public Ventana5(String _msg) {
		super(_msg);
		// Contenedor principal
		this.panelPrincipal = this.getContentPane();
		this.etiqueta = new JLabel("Bienvenido a mi quinto conversor");
		// Creo los botones
		JButton euroADolar = new JButton("Euros a dolares");
		JButton dolarAEuro = new JButton("Dolares a euros");
		// Configuro el panel norte
		this.panelNorte = new JPanel();
		this.panelNorte.setLayout(new FlowLayout());
		this.panelNorte.add(this.etiqueta);
		
		// Configurar el panel central
		this.panelCentral = new JPanel();
		this.pedirCambio = new JLabel("Introducir el cambio");
		this.cambio = new JTextField();
		this.pedirCantidad = new JLabel("Cantidad");
		this.cantidad = new JTextField();
		this.panelCentral.setLayout(new FlowLayout());
		this.panelCentral.add(pedirCambio);
		this.panelCentral.add(cambio);
		this.panelCentral.add(pedirCantidad);
		this.panelCentral.add(cantidad);
		
		// Configurar el panel sur
		this.panelSur = new JPanel();
		this.panelSur.setLayout(new FlowLayout());
		this.panelSur.add(euroADolar);
		this.panelSur.add(dolarAEuro);
		// Inserto el panel norte en el contenedor principal
		this.panelPrincipal.add(this.panelNorte, BorderLayout.NORTH);
		// Insertar el panel central en el contenedor principal
		this.panelPrincipal.add(this.panelCentral, BorderLayout.CENTER);
		// Insertar el panel sur en el contenedor principal
		this.panelPrincipal.add(this.panelSur, BorderLayout.SOUTH);
		// Establezco el resto de propiedades de la ventana
		this.setLocation(50, 100);
		this.setSize(400, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
}