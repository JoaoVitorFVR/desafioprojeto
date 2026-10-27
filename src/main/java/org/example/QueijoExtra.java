package org.example;

public class QueijoExtra extends LancheDecorator {

    public QueijoExtra(Lanche lanche) {
        super(lanche);
    }

    public float getPercentualPreco() {
        return 10.0f;
    }

    public String getNomeAdicional() {
        return "Queijo Extra";
    }
}
