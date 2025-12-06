package com.mx.curso.unidad3.conceptos_basicos.herencia.Practica05;

public class Articulo {

    private String codigo;
    private int cantidadStock;
    private double precioUnitario;

    public Articulo(String codigo){
        this.codigo = codigo;
        this.cantidadStock = 0;
        this.precioUnitario = 1.0;
    }

    public Articulo(String codigo, int cantidadStock, double precioUnitario){
        this.codigo = codigo;
        this.cantidadStock = cantidadStock;
        this.precioUnitario = precioUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int nuevaCantidad) {
        this.cantidadStock = nuevaCantidad;
    }
}
