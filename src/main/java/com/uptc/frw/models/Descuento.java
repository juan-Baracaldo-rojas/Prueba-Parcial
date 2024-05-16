package com.uptc.frw.models;

public class Descuento {
    private long cod;
    private String nombre;
    private String tipo;
    private double valor;

    public Descuento() {
    }

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Descuento{" +
                "cod=" + cod +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", valor=" + valor +
                '}';
    }
}