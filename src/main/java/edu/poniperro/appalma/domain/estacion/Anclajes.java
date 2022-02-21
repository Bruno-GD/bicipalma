package edu.poniperro.appalma.domain.estacion;

import edu.poniperro.appalma.domain.bicicleta.Movil;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Anclajes {
    private final Anclaje[] anclajes;

    Anclajes(int numAnclajes) {
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }

    private void crearAnclajes() {
        for (int i = 0; i < this.anclajes.length; i++) {
            this.anclajes[i] = new Anclaje();
        }
    }

    Anclaje[] anclajes() {
        return this.anclajes;
    }

    int numAnclajes() {
        return this.anclajes.length;
    }

    void ocuparAnclaje(int anclaje, Movil bici) {
        this.anclajes[anclaje].anclarBici(bici);
    }

    boolean isAnclajeOcupado(int anclaje) {
        return this.anclajes[anclaje].isOcupado();
    }

    void liberarAnclaje(int anclaje) {
        this.anclajes[anclaje].liberarBici();
    }

    Movil getBiciAt(int anclaje) {
        return this.anclajes[anclaje].getBici();
    }

    int seleccionarAnclaje() {
        return ThreadLocalRandom.current().nextInt(0, numAnclajes());
    }

    @Override
    public String toString() {
        return "Anclajes{" +
                "anclajes=" + numAnclajes() +
                '}';
    }
}
