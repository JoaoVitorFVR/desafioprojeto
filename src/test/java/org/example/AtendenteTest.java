package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendenteTest {

    @Test
    void deveRetornarSalarioAtendenteTurnoDiurno() {
        Turno turno = new Diurno();
        Atendente atendente = new Atendente(1000.0f);
        atendente.setTurno(turno);
        assertEquals(1000.0f, atendente.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAtendenteTurnoNoturno() {
        Turno turno = new Noturno();
        Atendente atendente = new Atendente(1000.0f);
        atendente.setTurno(turno);
        assertEquals(1250.0f, atendente.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAtendenteTurnoMadrugada() {
        Turno turno = new Madrugada();
        Atendente atendente = new Atendente(1000.0f);
        atendente.setTurno(turno);
        assertEquals(1400.0f, atendente.calcularSalario(), 0.01f);
    }

}
