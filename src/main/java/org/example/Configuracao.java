package org.example;

public class Configuracao {

    private Configuracao() {};
    private static Configuracao instance = new Configuracao();
    public static Configuracao getInstance() {
        return instance;
    }

    private String nomeRestaurante;
    private String atendenteLogado;

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public String getAtendenteLogado() {
        return atendenteLogado;
    }

    public void setAtendenteLogado(String atendenteLogado) {
        this.atendenteLogado = atendenteLogado;
    }
}
