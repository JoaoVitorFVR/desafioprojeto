package org.example;

public class MolhoEspecial extends LancheDecorator {

    public MolhoEspecial(Lanche lanche) {
        super(lanche);
    }

    public float getPercentualPreco() {
        return 5.0f;
    }

    public String getNomeAdicional() {
        return "Molho Especial";
    }
}
