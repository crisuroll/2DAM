package main;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;

class ResultadosEncuesta {
    private final HashMap<String, Integer> totalPorRespuesta = new HashMap<>();
    private final HashMap<String, Integer> totalPorZona = new HashMap<>();

    // Suma una o nÃºmero de respuestas para la zona y para la respuesta
    synchronized public void anotaRespuesta(String idZona, String respuesta) {
        // HashMap del numero de respuestas (votos) de cada tipo
        Integer numRespValor = this.totalPorRespuesta.get(respuesta);
        
        /*
        int numero;
        if(numRespValor == null)
        	numero = 1;
        else
			numero = numRespValor+1;
         */
        
        this.totalPorRespuesta.put(respuesta, numRespValor == null ? 1 : numRespValor + 1);
        // HashMap del numero de respuestas (votantes) por zona
        Integer numRespZona = this.totalPorZona.get(idZona);
        this.totalPorZona.put(idZona, numRespZona == null ? 1 : numRespZona + 1);
    }

    synchronized public Set<String> obtenZonas() {
        return this.totalPorZona.keySet();
    }

    synchronized public Set<String> obtenRespuestas() {
        return this.totalPorRespuesta.keySet();
    }

    synchronized public int obtenNumRespuestasZona(String zona) {
        return this.totalPorZona.get(zona);
    }

    synchronized public int obtenNumRespuestas(String respuesta) {
        return this.totalPorRespuesta.get(respuesta);
    }
}
