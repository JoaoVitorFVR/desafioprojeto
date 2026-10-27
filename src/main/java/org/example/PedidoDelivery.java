package org.example;

public class PedidoDelivery extends Pedido {

    public float calcularTaxa() {
        if (this.getSubtotal() >= 100.0f) {
            return 0.0f;
        }
        else {
            return 8.0f;
        }
    }

    @Override
    public String getTipo() {
        return "PedidoDelivery";
    }
}
