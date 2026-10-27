package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntregaFactoryTest {

    @Test
    void deveRetornarExcecaoParaEntregaInexistente() {
        try {
            IEntrega entrega = EntregaFactory.obterEntrega("Teletransporte");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Entrega inexistente", e.getMessage());
        }
    }
}
