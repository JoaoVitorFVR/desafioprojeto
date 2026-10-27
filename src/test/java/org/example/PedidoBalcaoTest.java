package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoBalcaoTest {

    @Test
    void naoDeveCobrarTaxa() {
        PedidoBalcao pedido = new PedidoBalcao();
        pedido.setSubtotal(50.0f);
        assertEquals(0.0f, pedido.calcularTaxa(), 0.01f);
    }

    @Test
    void deveCalcularTotalSemTaxa() {
        PedidoBalcao pedido = new PedidoBalcao();
        pedido.setSubtotal(50.0f);
        assertEquals(50.0f, pedido.calcularTotal(), 0.01f);
    }

    @Test
    void deveRetornarInformacoes() {
        PedidoBalcao pedido = new PedidoBalcao();
        pedido.setSubtotal(30.0f);
        pedido.setCliente("Bruno");
        pedido.setNumero(2);
        assertEquals("Pedido{numero=2, cliente='Bruno', total=30.0}", pedido.getInfo());
    }
}
