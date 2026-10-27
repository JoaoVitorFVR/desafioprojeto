package org.example;

public abstract class LancheDecorator implements Lanche {

    private Lanche lanche;

    public LancheDecorator(Lanche lanche) {
        this.lanche = lanche;
    }

    public Lanche getLanche() {
        return lanche;
    }

    public void setLanche(Lanche lanche) {
        this.lanche = lanche;
    }

    public abstract float getPercentualPreco();

    public float getPreco() {
        return this.lanche.getPreco() * (1 + (this.getPercentualPreco() / 100));
    }

    public abstract String getNomeAdicional();

    public String getDescricao() {
        return this.lanche.getDescricao() + " + " + this.getNomeAdicional();
    }
}
