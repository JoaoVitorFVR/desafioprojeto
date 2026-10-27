package org.example;

public class Gerente extends Cargo {

    public Gerente(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase;
    }
}
