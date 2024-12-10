import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana4 extends JFrame {
	
	private Container panelPrincipal;
	private JLabel etiqueta;
	private JPanel panelNorte;
	private JPanel panelSur;
	
	public Ventana4(String _msg) {
		super(_msg);
		// Contenedor principal
		this.panelPrincipal = this.getContentPane();
		this.etiqueta = new JLabel("Bienvenido a mi cuarto conversor");
		// Creo los botones
		JButton euroADolar = new JButton("Euros a dolares");
		JButton dolarAEuro = new JButton("Dolares a euros");
		// Configuro el panel norte
		this.panelNorte = new JPanel();
		this.panelNorte.setLayout(new FlowLayout());
		this.panelNorte.add(this.etiqueta);
		// Configurar el panel sur
		this.panelSur = new JPanel();
		this.panelSur.setLayout(new FlowLayout());
		this.panelSur.add(euroADolar);
		this.panelSur.add(dolarAEuro);
		// Inserto el panel norte en el contenedor principal
		this.panelPrincipal.add(this.panelNorte, BorderLayout.NORTH);
		// Insertar el panel sur en el contenedor principal
		this.panelPrincipal.add(this.panelSur, BorderLayout.SOUTH);
		// Establezco el resto de propiedades de la ventana
		this.setLocation(50, 100);
		this.setSize(400, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
}