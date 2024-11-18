
class NumeroOculto {

    private final int MIN_NUM_PARTIDA = 1;
    private final int MAX_NUM_PARTIDA = Integer.MAX_VALUE;

    private int numPartida = MIN_NUM_PARTIDA; // Hace innecesario boolean numAdivinado, hilos proponen número para una
                                                // partida
    private int numOculto;

    private final Random rand = new Random();

    public NumeroOculto() {
        this.generaNumeroOculto();
    }

    private void generaNumeroOculto() {
        this.numOculto = this.rand.nextInt(21);
        System.out.printf("[[Partida: %d, creado número oculto: %d]]\n", numPartida, this.numOculto);
    }

    private void nuevaPartida() {
        if (this.numPartida < MAX_NUM_PARTIDA) {
            this.numPartida++;
        } else {
            this.numPartida = MIN_NUM_PARTIDA;
        }
        this.generaNumeroOculto();
    }

    synchronized public int getNumPartida() {
        return this.numPartida;
    }

    synchronized public int propuestaNumero(int partida, int num) {
        int result = 0; // Por defecto: no adivinado
        if (partida != this.numPartida) {
            result = -1; // Otro ha adivinado, es decir, ya se está en otra partida
        } else if (num == this.numOculto) {
            result = 1;
            this.nuevaPartida();
        }
        return result;
    }
}