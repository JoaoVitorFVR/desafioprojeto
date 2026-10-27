package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntregaBicicletaTest {

    @Test
    void deveObterEntregaBicicleta() {
        IEntrega entrega = EntregaFactory.obterEntrega("Bicicleta");
        assertTrue(entrega instanceof EntregaBicicleta);
    }

    @Test
    void deveDespacharBicicleta() {
        IEntrega entrega = EntregaFactory.obterEntrega("Bicicleta");
        assertEquals("Bicicleta despachada", entrega.despachar());
    }

    @Test
    void deveCancelarBicicleta() {
        IEntrega entrega = EntregaFactory.obterEntrega("Bicicleta");
        assertEquals("Bicicleta cancelada", entrega.cancelar());
    }

}
