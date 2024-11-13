package main;

import java.util.Random;

class HiloConcursante implements Runnable {
	private final NumeroOculto numOculto;
	private final String id;
	private Random r = new Random();

	/**
	 * Constructora
	 * @param numOculto
	 * @param id
	 */
	public HiloConcursante(NumeroOculto numOculto, String id) {
		this.numOculto = numOculto;
		this.id = id;
	}

	@Override
	public void run() {
		System.out.printf(">> Hilo %s comienza.\n", this.id);
		boolean juegoTerminado = false;
		while (!juegoTerminado) {
			// El hilo i-esimo propone un numero en [0, 20]
			int num = r.nextInt(21);
			System.out.printf("Hilo " + this.id + " propone el numero " + num + "\n");
			// Se comprueba si se ha acertado llamando al metodo propuestaNumero(), y se guarda el resultado para hacer el if y elseif que viene a continuación
			int propuesta = this.numOculto.propuestaNumero(num);
			// Si el resultado es -1, el juego termina, se imprime qué otro hilo ha acertado
			// Aquí va un if
			// Si es  1, se imprime que el hilo i-esimo ha acertado
			// Aquí va un elseif
			if (propuesta == 1) {
				System.out.println("El hilo " + this.id + " ha acertado el número oculto.");
			} else if (propuesta == -1) {
				System.out.println("Juego terminado. Otro hilo ha acertado.");
				juegoTerminado = true;
			}
		}
		// Al salir del bucle, el hilo ha terminado. Asi que se imprime eso mismo
		System.out.printf("## Hilo %s termina.\n", this.id);
	}
}
