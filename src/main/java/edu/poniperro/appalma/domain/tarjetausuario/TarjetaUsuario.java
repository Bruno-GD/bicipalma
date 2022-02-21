package edu.poniperro.appalma.domain.tarjetausuario;

public class TarjetaUsuario implements Autentication {
    private final String id;
    private boolean activada;

    public TarjetaUsuario(String id, boolean activada) {
        this.id = id;
        this.activada = activada;
    }

    public boolean isActivada() {
        return this.activada;
    }

    public void setActivada(boolean estado) {
        this.activada = estado;
    }

    @Override
    public String toString() {
        return this.id;
    }
}
