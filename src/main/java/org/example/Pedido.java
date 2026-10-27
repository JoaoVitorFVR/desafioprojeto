package org.example;

import java.util.Observable;

public abstract class Pedido extends Observable {

    private int numero;
    protected String cliente;
    private float subtotal;
    private PedidoEstado estado;

    public Pedido() {
        this.estado = PedidoEstadoRecebido.getInstance();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public abstract float calcularTaxa();

    public float calcularTotal() {
        return this.subtotal + this.calcularTaxa();
    }

    public String getTipo() {
        return "Pedido";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "numero=" + this.numero +
                ", cliente='" + this.cliente + "'" +
                ", total=" + this.calcularTotal() +
                "}";
    }

    public PedidoEstado getEstado() {
        return estado;
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
        setChanged();
        notifyObservers();
    }

    public boolean preparar() {
        return estado.preparar(this);
    }

    public boolean enviar() {
        return estado.enviar(this);
    }

    public boolean entregar() {
        return estado.entregar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numero=" + this.numero +
                ", status='" + this.getNomeEstado() + "'" +
                "}";
    }
}
