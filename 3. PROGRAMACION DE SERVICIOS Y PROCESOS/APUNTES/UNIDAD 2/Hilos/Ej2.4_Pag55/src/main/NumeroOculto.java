package main;

import java.util.Random;

class NumeroOculto {
	private final int numOculto;
	private boolean numAdivinado = false;

	/**
	 * Constructora
	 */
	public NumeroOculto() {
		Random r = new Random();
		this.numOculto = r.nextInt(21);
		System.out.printf("[[Creado número oculto: %d]]\n", this.numOculto);
	}

	// Aquí va el método propuestaNumero
	synchronized public int propuestaNumero(int num) {
		if (num == this.numOculto) {
			this.numAdivinado = true;
			return 1;
		} else if (numAdivinado == true) {
			return -1;
		} else {
			return 0;
		}
	}
}
