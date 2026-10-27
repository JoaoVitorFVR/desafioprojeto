package org.example;

public class EntregaBicicleta implements IEntrega {

    public String despachar() {
        return "Bicicleta despachada";
    }

    public String cancelar() {
        return "Bicicleta cancelada";
    }
}
