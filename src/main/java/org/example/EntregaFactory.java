package org.example;

public class EntregaFactory {

    public static IEntrega obterEntrega(String tipo) {
        Class<?> classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.Entrega" + tipo);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Entrega inexistente");
        }
        if (!(objeto instanceof IEntrega)) {
            throw new IllegalArgumentException("Entrega inválida");
        }
        return (IEntrega) objeto;
    }
}
