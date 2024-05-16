package com.uptc.frw.models;

import java.util.Date;

public class Factura {
    private long num_factura;
    private Date fecha_factura;
    private double total;
    private long cedula;
    private double iva;

    public Factura() {
    }

    public long getNum_factura() {
        return num_factura;
    }

    public void setNum_factura(long num_factura) {
        this.num_factura = num_factura;
    }

    public Date getFecha_factura() {
        return fecha_factura;
    }

    public void setFecha_factura(Date fecha_factura) {
        this.fecha_factura = fecha_factura;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "num_factura=" + num_factura +
                ", fecha_factura=" + fecha_factura +
                ", total=" + total +
                ", iva=" + iva +
                '}';
    }
}
