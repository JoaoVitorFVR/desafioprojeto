package org.example;

public class Mesa {

    private Prato prato;
    private Bebida bebida;

    public Mesa(FabricaAbstrata fabrica) {
        this.prato = fabrica.createPrato();
        this.bebida = fabrica.createBebida();
    }

    public String servirPrato() {
        return this.prato.servir();
    }

    public String servirBebida() {
        return this.bebida.servir();
    }
}
