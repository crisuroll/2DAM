import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana3 extends JFrame {
	
	private Container panelPrincipal;
	private JLabel etiqueta;
	
	public Ventana3(String _msg) {
		super(_msg);
		// Contenedor principal
		this.panelPrincipal = this.getContentPane();
		this.etiqueta = new JLabel("Bienvenido a mi tercer conversor");
		// Creo los botones
		JButton euroADolar = new JButton("Euros a dolares");
		JButton dolarAEuro = new JButton("Dolares a euros");
		// Inserto los elementos en el contenedor principal
		this.panelPrincipal.add(this.etiqueta);
		this.panelPrincipal.add(euroADolar);
		this.panelPrincipal.add(dolarAEuro);
		// Establezco el resto de propiedades de la ventana
		this.setLocation(50, 100);
		this.setSize(400, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
}