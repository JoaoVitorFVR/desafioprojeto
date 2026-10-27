package org.example;

public class TipoSolicitacaoBrinde implements TipoSolicitacao {

    private static TipoSolicitacaoBrinde tipoSolicitacaoBrinde = new TipoSolicitacaoBrinde();

    private TipoSolicitacaoBrinde() {};

    public static TipoSolicitacaoBrinde getTipoSolicitacaoBrinde() {
        return tipoSolicitacaoBrinde;
    }
}
