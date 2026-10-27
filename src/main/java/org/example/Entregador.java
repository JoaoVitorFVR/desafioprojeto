package org.example;

public class Entregador extends Cargo {

    private int numEntregas;

    public Entregador(float salarioBase) {
        super(salarioBase);
    }

    public void setNumEntregas(int numEntregas) {
        this.numEntregas = numEntregas;
    }

    public float calcularSalario() {
        return this.salarioBase * this.numEntregas * (1 + this.turno.percentualAdicional());
    }
}
