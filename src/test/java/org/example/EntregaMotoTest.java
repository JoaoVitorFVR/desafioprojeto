package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntregaMotoTest {

    @Test
    void deveObterEntregaMoto() {
        IEntrega entrega = EntregaFactory.obterEntrega("Moto");
        assertTrue(entrega instanceof EntregaMoto);
    }

    @Test
    void deveDespacharMoto() {
        IEntrega entrega = EntregaFactory.obterEntrega("Moto");
        assertEquals("Moto despachada", entrega.despachar());
    }

    @Test
    void deveCancelarMoto() {
        IEntrega entrega = EntregaFactory.obterEntrega("Moto");
        assertEquals("Moto cancelada", entrega.cancelar());
    }

}
