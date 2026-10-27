package org.example;

public class EntregaMoto implements IEntrega {

    public String despachar() {
        return "Moto despachada";
    }

    public String cancelar() {
        return "Moto cancelada";
    }
}
