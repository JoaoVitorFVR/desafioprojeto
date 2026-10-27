package org.example;

public class FabricaJaponesa implements FabricaAbstrata {

    @Override
    public Prato createPrato() {
        return new PratoJapones();
    }

    @Override
    public Bebida createBebida() {
        return new BebidaJaponesa();
    }
}
