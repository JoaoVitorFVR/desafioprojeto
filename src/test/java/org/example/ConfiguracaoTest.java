package org.example;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoTest {

    @Test
    void deveRetornarNomeRestaurante() {
        Configuracao.getInstance().setNomeRestaurante("Cantina 1");
        assertEquals("Cantina 1", Configuracao.getInstance().getNomeRestaurante());
    }

    @Test
    void deveRetornarAtendenteLogado() {
        Configuracao.getInstance().setAtendenteLogado("Atendente 1");
        assertEquals("Atendente 1", Configuracao.getInstance().getAtendenteLogado());
    }

    @Test
    void deveRetornarSempreAMesmaInstancia() {
        assertSame(Configuracao.getInstance(), Configuracao.getInstance());
    }

    @Test
    void deveCompartilharDadosEntreChamadas() {
        Configuracao.getInstance().setNomeRestaurante("Cantina 2");
        Configuracao outra = Configuracao.getInstance();
        assertEquals("Cantina 2", outra.getNomeRestaurante());
    }

    @Test
    void construtorDeveSerPrivado() throws Exception {
        Constructor<Configuracao> construtor = Configuracao.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(construtor.getModifiers()));
    }
}
