package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntregadorTest {

    @Test
    void deveRetornarSalarioEntregadorTurnoDiurno() {
        Turno turno = new Diurno();
        Entregador entregador = new Entregador(10.0f);
        entregador.setTurno(turno);
        entregador.setNumEntregas(20);
        assertEquals(200.0f, entregador.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioEntregadorTurnoNoturno() {
        Turno turno = new Noturno();
        Entregador entregador = new Entregador(10.0f);
        entregador.setTurno(turno);
        entregador.setNumEntregas(20);
        assertEquals(250.0f, entregador.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioEntregadorTurnoMadrugada() {
        Turno turno = new Madrugada();
        Entregador entregador = new Entregador(10.0f);
        entregador.setTurno(turno);
        entregador.setNumEntregas(20);
        assertEquals(280.0f, entregador.calcularSalario(), 0.01f);
    }

}
