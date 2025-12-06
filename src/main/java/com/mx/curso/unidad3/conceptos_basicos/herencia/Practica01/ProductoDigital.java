package com.mx.curso.unidad3.conceptos_basicos.herencia.Practica01;

public class ProductoDigital {

    private String nombre;
    private double precio;
    private boolean esDescargable;
    private static int contadorProductos=0;


    public ProductoDigital(String nombre, double precio, boolean esDescargable) {
        this.nombre = nombre;
        this.precio = precio;
        this.esDescargable = esDescargable;
        contadorProductos++;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    public void setPrecio(double nuevoPrecio){
        this.precio = nuevoPrecio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isEsDescargable() {
        return esDescargable;
    }

    public void setEsDescargable(boolean esDescargable) {
        this.esDescargable = esDescargable;
    }
}

