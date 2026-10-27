package org.example;

public class FuncionarioGerente extends Funcionario {

    public FuncionarioGerente(Funcionario superior) {
        listaSolicitacoes.add(TipoSolicitacaoDesconto.getTipoSolicitacaoDesconto());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }
}
