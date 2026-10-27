package org.example;

public class FuncionarioDono extends Funcionario {

    public FuncionarioDono(Funcionario superior) {
        listaSolicitacoes.add(TipoSolicitacaoReembolso.getTipoSolicitacaoReembolso());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Dono";
    }
}
