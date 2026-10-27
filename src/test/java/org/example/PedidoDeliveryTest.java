package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoDeliveryTest {

    @Test
    void deveCobrarTaxa() {
        PedidoDelivery pedido = new PedidoDelivery();
        pedido.setSubtotal(99.0f);
        assertEquals(8.0f, pedido.calcularTaxa(), 0.01f);
        assertEquals(107.0f, pedido.calcularTotal(), 0.01f);
    }

    @Test
    void deveTerFreteGratisAPartirDeCem() {
        PedidoDelivery pedido = new PedidoDelivery();
        pedido.setSubtotal(100.0f);
        assertEquals(0.0f, pedido.calcularTaxa(), 0.01f);
        assertEquals(100.0f, pedido.calcularTotal(), 0.01f);
    }

    @Test
    void deveRetornarInformacoes() {
        PedidoDelivery pedido = new PedidoDelivery();
        pedido.setSubtotal(50.0f);
        pedido.setCliente("Ana");
        pedido.setNumero(1);
        assertEquals("PedidoDelivery{numero=1, cliente='Ana', total=58.0}", pedido.getInfo());
    }
}
