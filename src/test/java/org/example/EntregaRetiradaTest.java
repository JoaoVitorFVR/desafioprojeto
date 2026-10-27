package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntregaRetiradaTest {

    @Test
    void deveObterEntregaRetirada() {
        IEntrega entrega = EntregaFactory.obterEntrega("Retirada");
        assertTrue(entrega instanceof EntregaRetirada);
    }

    @Test
    void deveDespacharRetirada() {
        IEntrega entrega = EntregaFactory.obterEntrega("Retirada");
        assertEquals("Retirada liberada", entrega.despachar());
    }

    @Test
    void deveCancelarRetirada() {
        IEntrega entrega = EntregaFactory.obterEntrega("Retirada");
        assertEquals("Retirada cancelada", entrega.cancelar());
    }

}
