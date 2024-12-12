package ej2;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		Queue mazoJugador1 = new LinkedList<Integer>();
		Queue mazoJugador2 = new LinkedList<Integer>();
		
		/*mazoJugador1.add(2);
		mazoJugador1.add(4);
		mazoJugador1.add(6);
		mazoJugador1.add(8);
		mazoJugador1.add(10);
		
		mazoJugador2.add(1);
		mazoJugador2.add(3);
		mazoJugador2.add(5);
		mazoJugador2.add(7);
		mazoJugador2.add(9);*/
		
		mazoJugador1.add(4);
		mazoJugador1.add(3);
		mazoJugador2.add(7);
		mazoJugador2.add(1);
		
		String j1 = "Jugador 1";
		String j2 = "Jugador 2";
		int carta1;
		int carta2;
		
		System.out.println("Mazo inicial del " + j1 + ": " + mazoJugador1.toString());
		System.out.println("Mazo inicial del " + j2 + ": " + mazoJugador2.toString());
		
		while (!mazoJugador1.isEmpty() && !mazoJugador2.isEmpty()) {
			carta1 = (int) mazoJugador1.peek();
			carta2 = (int) mazoJugador2.peek();
			System.out.println(j1 + " juega: " + mazoJugador1.poll());
			System.out.println(j2 + " juega: " + mazoJugador2.poll());
			if (carta1 > carta2) {
				System.out.println(j1 + " gana la ronda");
				mazoJugador1.add(carta1);
				mazoJugador1.add(carta2);
			} else {
				System.out.println(j2 + " gana la ronda");
				mazoJugador2.add(carta2);
				mazoJugador2.add(carta1);
			}
			System.out.println("Estado actual del mazo " + j1 + ": " + mazoJugador1.toString());
			System.out.println("Estado actual del mazo " + j2 + ": " + mazoJugador2.toString());
		}
		
		if (mazoJugador1.isEmpty()) {
			System.out.println(j2 + " gana el juego");
		} else {
			System.out.println(j1 + " gana el juego");
		}

	}

}