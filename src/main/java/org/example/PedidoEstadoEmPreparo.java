package org.example;

public class PedidoEstadoEmPreparo extends PedidoEstado {

    private PedidoEstadoEmPreparo() {};
    private static PedidoEstadoEmPreparo instance = new PedidoEstadoEmPreparo();
    public static PedidoEstadoEmPreparo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em preparo";
    }

    public boolean enviar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoSaiuParaEntrega.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }

}
