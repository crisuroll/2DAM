package main;

/*
Pregunta: ¿Cómo podemos crear múltiples hilos definidos por el usuario?

Hay dos formas de crear más de un hilo definido por el usuario:

  -  Crear múltiples objetos subclase de thread y llamar al método start() en cada objeto thread.
  -  Crear múltiples subclases de una clase thread, crear su objeto y llamar al método start.
  
En el primer enfoque, todos los hilos ejecutan la misma lógica de método de ejecución, porque todos sus objetos hilo se crean a partir 
de la misma clase. Este enfoque se recomienda sólo para ejecutar la misma lógica concurrentemente con diferentes estados de objeto.
 */

public class Main extends Thread {
    public void run () {
        for (int i = 0; i < 5; i++)
            System.out.println (getName () + " ¦ Run:" + i);
    }
    
    public static void main (String[]args) {
    	Main mt1 = new Main ();
        mt1.start ();
        Main mt2 = new Main ();
        mt2.start ();
        Main mt3 = new Main ();
        mt3.start ();
    }
}