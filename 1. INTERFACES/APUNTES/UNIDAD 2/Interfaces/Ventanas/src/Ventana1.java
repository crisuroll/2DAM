import javax.swing.JFrame;

public class Ventana1 extends JFrame {
	/**
	* Constructora que recibe el título de la ventana
	* @param _msg
	*/
	public Ventana1(String _msg) {
		super(_msg);
		this.setLocation(50, 100);
		this.setSize(400, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
