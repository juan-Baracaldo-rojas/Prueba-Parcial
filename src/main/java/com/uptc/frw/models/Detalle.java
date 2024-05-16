package com.uptc.frw.models;

import jakarta.persistence.*;

@Entity
@Table(name="detalle")
public class Detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="num_factura")
    private long numFactura;
    @Column(name="id_producto_detalle")
    private long idProductoDetalle;
    @Column(name="can_produto_detalle")
    private int canProductoDetalle;
    @Column(name="valor_producto_detalle")
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
