package org.example;

public class TipoSolicitacaoFiado implements TipoSolicitacao {

    private static TipoSolicitacaoFiado tipoSolicitacaoFiado = new TipoSolicitacaoFiado();

    private TipoSolicitacaoFiado() {};

    public static TipoSolicitacaoFiado getTipoSolicitacaoFiado() {
        return tipoSolicitacaoFiado;
    }
}
