package com.uptc.frw.models;

public class Detalle {
    private long numFactura;
    private long idProductoDetalle;
    private int canProductoDetalle;
    private double valorProductoDetalle;

    public Detalle() {
    }

    public long getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(long numFactura) {
        this.numFactura = numFactura;
    }

    public long getIdProductoDetalle() {
        return idProductoDetalle;
    }

    public void setIdProductoDetalle(long idProductoDetalle) {
        this.idProductoDetalle = idProductoDetalle;
    }

    public int getCanProductoDetalle() {
        return canProductoDetalle;
    }

    public void setCanProductoDetalle(int canProductoDetalle) {
        this.canProductoDetalle = canProductoDetalle;
    }

    public double getValorProductoDetalle() {
        return valorProductoDetalle;
    }

    public void setValorProductoDetalle(double valorProductoDetalle) {
        this.valorProductoDetalle = valorProductoDetalle;
    }

    @Override
    public String toString() {
        return "Detalle{" +
                "numFactura=" + numFactura +
                ", idProductoDetalle=" + idProductoDetalle +
                ", canProductoDetalle=" + canProductoDetalle +
                ", valorProductoDetalle=" + valorProductoDetalle +
                '}';
    }
}
