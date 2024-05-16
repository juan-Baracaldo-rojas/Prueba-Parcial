package com.uptc.frw.models;

import java.util.Date;

public class Producto {
    private long idProducto;
    private long id_provedor;
    private long cod_descuento;
    private String nombre;
    private double valor_compra;
    private double valor_venta;
    private Date fecha_entrega;
    private Date fecha_salida;
    private int cantidad;
    private String tipo;

    public Producto() {
    }

    public long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }

    public long getId_provedor() {
        return id_provedor;
    }

    public void setId_provedor(long id_provedor) {
        this.id_provedor = id_provedor;
    }

    public long getCod_descuento() {
        return cod_descuento;
    }

    public void setCod_descuento(long cod_descuento) {
        this.cod_descuento = cod_descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(double valor_compra) {
        this.valor_compra = valor_compra;
    }

    public double getValor_venta() {
        return valor_venta;
    }

    public void setValor_venta(double valor_venta) {
        this.valor_venta = valor_venta;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
        }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", valor_compra=" + valor_compra +
                ", valor_venta=" + valor_venta +
                ", fecha_entrega=" + fecha_entrega +
                ", fecha_salida=" + fecha_salida +
                ", cantidad=" + cantidad +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
