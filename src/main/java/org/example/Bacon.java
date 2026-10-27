package org.example;

public class Bacon extends LancheDecorator {

    public Bacon(Lanche lanche) {
        super(lanche);
    }

    public float getPercentualPreco() {
        return 20.0f;
    }

    public String getNomeAdicional() {
        return "Bacon";
    }
}
