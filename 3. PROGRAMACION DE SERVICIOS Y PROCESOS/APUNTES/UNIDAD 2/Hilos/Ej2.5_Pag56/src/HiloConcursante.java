
class HiloConcursante implements Runnable {

    private final NumeroOculto numOculto;

    private final String id;
    private Random r = new Random();

    HiloConcursante(NumeroOculto numOculto, String id) {
        this.numOculto = numOculto;
        this.id = id;
    }

    @Override
    public void run() {
        System.out.printf(">> Hilo %s comienza.\n", this.id);
        int numPartida = numOculto.getNumPartida();

        while (true) {

            int num = r.nextInt(21);
            System.out.printf("Hilo %s propone número %d para partida %d.\n", this.id, num, numPartida);

            int resultado = numOculto.propuestaNumero(numPartida, num);
            if (resultado == -1) {
                int numPartidaAnt = numPartida;
                numPartida = numOculto.getNumPartida();
                System.out.printf("Hilo %s: otro hilo ha acertado en partida %d, nueva partida: %d.\n", this.id,
                        numPartidaAnt, numPartida);
            } else if (resultado == 1) {
                System.out.printf("¡¡¡ Hilo %s acierta con el número: %d en partida: %d !!!\n", this.id, num,
                        numPartida);
                numPartida = this.numOculto.getNumPartida();
            }

        }
    }
}
