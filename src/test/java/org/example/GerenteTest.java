package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    @Test
    void deveRetornarSalarioGerenteTurnoDiurno() {
        Turno turno = new Diurno();
        Gerente gerente = new Gerente(3000.0f);
        gerente.setTurno(turno);
        assertEquals(3000.0f, gerente.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioGerenteTurnoNoturno() {
        Turno turno = new Noturno();
        Gerente gerente = new Gerente(3000.0f);
        gerente.setTurno(turno);
        assertEquals(3000.0f, gerente.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioGerenteTurnoMadrugada() {
        Turno turno = new Madrugada();
        Gerente gerente = new Gerente(3000.0f);
        gerente.setTurno(turno);
        assertEquals(3000.0f, gerente.calcularSalario(), 0.01f);
    }

}
