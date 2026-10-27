package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario {

    protected List<TipoSolicitacao> listaSolicitacoes = new ArrayList<>();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String autorizar(Solicitacao solicitacao) {
        if (listaSolicitacoes.contains(solicitacao.getTipoSolicitacao())) {
            return getDescricaoCargo();
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.autorizar(solicitacao);
            }
            else {
                return "Sem autorização";
            }
        }
    }
}
