package edu.poniperro.appalma.domain.estacion;

import edu.poniperro.appalma.domain.bicicleta.Movil;
import edu.poniperro.appalma.domain.tarjetausuario.Autentication;

public class Estacion {
    private final int id;
    private final String direccion;
    private final Anclajes anclajes;

    public Estacion(int id, String direccion, int numeroAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(numeroAnclajes);
    }

    private int getId() {
        return id;
    }

    private String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Estacion{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    private Anclaje[] anclajes() {
        return this.anclajes.anclajes();
    }

    private int numAnclajes() {
        return this.anclajes.numAnclajes();
    }

    public void consultarEstacion() {
        System.out.println(this);
    }

    public int anclajesLibres() {
        int anclajesLibres = 0;

        for (Anclaje anclaje: anclajes())
            if (!anclaje.isOcupado())
                anclajesLibres++;

        return anclajesLibres;
    }

    public void anclarBicicleta(Movil bici) {
        if (anclajesLibres() > 0) {
            for (Anclaje anclaje: anclajes())
                if(!anclaje.isOcupado())
                    anclaje.anclarBici(bici);
        }
    }

    public boolean leerTarjetaUsuario(Autentication tarjeta) {
        return tarjeta.isActivada();
    }

    public void retirarBicicleta(Autentication tarjeta) {
        if (leerTarjetaUsuario(tarjeta)) {
            for (Anclaje anclaje: anclajes())
                if (anclaje.isOcupado())
                    anclaje.liberarBici();
        }
    }

    public void consultarAnclajes() {
        int posicion = 0;
        int numeroAnclaje = 0;

        for (Anclaje anclaje : anclajes()) {
            numeroAnclaje = posicion + 1;
            if (anclaje.isOcupado()) {
                System.out.println("Anclaje " + numeroAnclaje + " " + anclaje.getBici().getId());
            } else {
                System.out.println("Anclaje " + numeroAnclaje + " " + " libre");
            }
            posicion++;
        }
    }
}
