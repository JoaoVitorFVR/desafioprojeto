package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    private Pedido novoPedido(int numero) {
        Pedido pedido = new PedidoDelivery();
        pedido.setNumero(numero);
        return pedido;
    }

    @Test
    void deveNotificarUmCliente() {
        Pedido pedido = novoPedido(1);
        Cliente cliente = new Cliente("Cliente 1");
        cliente.acompanhar(pedido);
        pedido.preparar();
        assertEquals("Cliente 1, atualização no Pedido{numero=1, status='Em preparo'}", cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClientes() {
        Pedido pedido = novoPedido(1);
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");
        cliente1.acompanhar(pedido);
        cliente2.acompanhar(pedido);
        pedido.preparar();
        pedido.enviar();
        assertEquals("Cliente 1, atualização no Pedido{numero=1, status='Saiu para entrega'}", cliente1.getUltimaNotificacao());
        assertEquals("Cliente 2, atualização no Pedido{numero=1, status='Saiu para entrega'}", cliente2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarCliente() {
        Pedido pedido = novoPedido(1);
        Cliente cliente = new Cliente("Cliente 1");
        pedido.preparar();
        assertEquals(null, cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClienteDoPedido1() {
        Pedido pedido1 = novoPedido(1);
        Pedido pedido2 = novoPedido(2);
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");
        cliente1.acompanhar(pedido1);
        cliente2.acompanhar(pedido2);
        pedido1.cancelar();
        assertEquals("Cliente 1, atualização no Pedido{numero=1, status='Cancelado'}", cliente1.getUltimaNotificacao());
        assertEquals(null, cliente2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarClienteQueDeixouDeAcompanhar() {
        Pedido pedido = novoPedido(1);
        Cliente cliente = new Cliente("Cliente 1");
        cliente.acompanhar(pedido);
        cliente.deixarDeAcompanhar(pedido);
        pedido.preparar();
        assertEquals(null, cliente.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarQuandoOperacaoNaoForPermitida() {
        Pedido pedido = novoPedido(1);
        Cliente cliente = new Cliente("Cliente 1");
        cliente.acompanhar(pedido);
        assertFalse(pedido.entregar());
        assertEquals(null, cliente.getUltimaNotificacao());
    }
}
