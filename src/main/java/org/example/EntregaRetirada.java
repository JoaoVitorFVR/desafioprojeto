package org.example;

public class EntregaRetirada implements IEntrega {

    public String despachar() {
        return "Retirada liberada";
    }

    public String cancelar() {
        return "Retirada cancelada";
    }
}
