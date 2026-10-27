package org.example;

public class FuncionarioAtendente extends Funcionario {

    public FuncionarioAtendente(Funcionario superior) {
        listaSolicitacoes.add(TipoSolicitacaoBrinde.getTipoSolicitacaoBrinde());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Atendente";
    }
}
