package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolicitacaoTest {

    FuncionarioDono dono;
    FuncionarioGerente gerente;
    FuncionarioAtendente atendente;

    @BeforeEach
    void setUp() {
        dono = new FuncionarioDono(null);
        gerente = new FuncionarioGerente(dono);
        atendente = new FuncionarioAtendente(gerente);
    }

    @Test
    void deveRetornarAtendenteParaAutorizacaoBrinde() {
        assertEquals("Atendente", atendente.autorizar(new Solicitacao(TipoSolicitacaoBrinde.getTipoSolicitacaoBrinde())));
    }

    @Test
    void deveRetornarGerenteParaAutorizacaoDesconto() {
        assertEquals("Gerente", atendente.autorizar(new Solicitacao(TipoSolicitacaoDesconto.getTipoSolicitacaoDesconto())));
    }

    @Test
    void deveRetornarDonoParaAutorizacaoReembolso() {
        assertEquals("Dono", atendente.autorizar(new Solicitacao(TipoSolicitacaoReembolso.getTipoSolicitacaoReembolso())));
    }

    @Test
    void deveRetornarSemAutorizacaoParaFiado() {
        assertEquals("Sem autorização", atendente.autorizar(new Solicitacao(TipoSolicitacaoFiado.getTipoSolicitacaoFiado())));
    }

    @Test
    void deveRetornarSemAutorizacaoQuandoNaoHaSuperior() {
        FuncionarioAtendente atendenteSozinho = new FuncionarioAtendente(null);
        assertEquals("Sem autorização", atendenteSozinho.autorizar(new Solicitacao(TipoSolicitacaoDesconto.getTipoSolicitacaoDesconto())));
    }

    @Test
    void naoDeveRepassarSolicitacaoParaBaixo() {
        assertEquals("Sem autorização", gerente.autorizar(new Solicitacao(TipoSolicitacaoBrinde.getTipoSolicitacaoBrinde())));
    }

}
