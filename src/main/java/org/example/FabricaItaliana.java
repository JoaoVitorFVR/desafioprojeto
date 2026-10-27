package org.example;

public class FabricaItaliana implements FabricaAbstrata {

    @Override
    public Prato createPrato() {
        return new PratoItaliano();
    }

    @Override
    public Bebida createBebida() {
        return new BebidaItaliana();
    }
}
