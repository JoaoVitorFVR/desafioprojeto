package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoEstadoTest {

    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new PedidoBalcao();
    }

    @Test
    public void deveIniciarComoRecebido() {
        assertEquals(PedidoEstadoRecebido.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveRetornarNomeDoEstado() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertEquals("Recebido", pedido.getNomeEstado());
        pedido.setEstado(PedidoEstadoEmPreparo.getInstance());
        assertEquals("Em preparo", pedido.getNomeEstado());
        pedido.setEstado(PedidoEstadoSaiuParaEntrega.getInstance());
        assertEquals("Saiu para entrega", pedido.getNomeEstado());
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertEquals("Entregue", pedido.getNomeEstado());
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertEquals("Cancelado", pedido.getNomeEstado());
    }

    // Pedido recebido

    @Test
    public void devePrepararPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertTrue(pedido.preparar());
        assertEquals(PedidoEstadoEmPreparo.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveEnviarPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void naoDeveEntregarPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void deveCancelarPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    // Pedido em preparo

    @Test
    public void naoDevePrepararPedidoEmPreparo() {
        pedido.setEstado(PedidoEstadoEmPreparo.getInstance());
        assertFalse(pedido.preparar());
    }

    @Test
    public void deveEnviarPedidoEmPreparo() {
        pedido.setEstado(PedidoEstadoEmPreparo.getInstance());
        assertTrue(pedido.enviar());
        assertEquals(PedidoEstadoSaiuParaEntrega.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveEntregarPedidoEmPreparo() {
        pedido.setEstado(PedidoEstadoEmPreparo.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void deveCancelarPedidoEmPreparo() {
        pedido.setEstado(PedidoEstadoEmPreparo.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    // Pedido saiu para entrega

    @Test
    public void naoDevePrepararPedidoSaiuParaEntrega() {
        pedido.setEstado(PedidoEstadoSaiuParaEntrega.getInstance());
        assertFalse(pedido.preparar());
    }

    @Test
    public void naoDeveEnviarPedidoSaiuParaEntrega() {
        pedido.setEstado(PedidoEstadoSaiuParaEntrega.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void deveEntregarPedidoSaiuParaEntrega() {
        pedido.setEstado(PedidoEstadoSaiuParaEntrega.getInstance());
        assertTrue(pedido.entregar());
        assertEquals(PedidoEstadoEntregue.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveCancelarPedidoSaiuParaEntrega() {
        pedido.setEstado(PedidoEstadoSaiuParaEntrega.getInstance());
        assertFalse(pedido.cancelar());
    }

    // Pedido entregue

    @Test
    public void naoDevePrepararPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.preparar());
    }

    @Test
    public void naoDeveEnviarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void naoDeveEntregarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDeveCancelarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.cancelar());
    }

    // Pedido cancelado

    @Test
    public void naoDevePrepararPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.preparar());
    }

    @Test
    public void naoDeveEnviarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void naoDeveEntregarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDeveCancelarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.cancelar());
    }

}
