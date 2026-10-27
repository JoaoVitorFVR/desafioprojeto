package org.example;

public class Atendente extends Cargo {

    public Atendente(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.turno.percentualAdicional());
    }
}
