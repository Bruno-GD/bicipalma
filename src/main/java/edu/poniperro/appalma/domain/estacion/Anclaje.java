package edu.poniperro.appalma.domain.estacion;

import edu.poniperro.appalma.domain.bicicleta.Movil;

public class Anclaje {
    private boolean isOcupado;
    private Movil bici;

    Anclaje() {};

    boolean isOcupado() {
        return isOcupado;
    }

    Movil getBici() {
        return bici;
    }

    void anclarBici(Movil bici) {
        this.bici = bici;
        this.isOcupado = true;
    }

    void liberarBici() {
        this.bici = null;
        this.isOcupado = false;
    }

    @Override
    public String toString() {
        return "Anclaje{" +
                "isOcupado=" + isOcupado +
                ", bici=" + bici +
                '}';
    }
}
