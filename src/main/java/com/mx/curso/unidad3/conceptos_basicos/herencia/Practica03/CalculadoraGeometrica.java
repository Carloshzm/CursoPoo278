package com.mx.curso.unidad3.conceptos_basicos.herencia.Practica03;

public class CalculadoraGeometrica {

    private String nombreFigura;
    public static double PI = 3.1416;

    public CalculadoraGeometrica(){
        this.nombreFigura = "Desconocida";
    }

    public CalculadoraGeometrica(String nombreFigura){
        this.nombreFigura = nombreFigura;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public double calcularArea(double radio){
        return PI * radio * radio;
    }
    public double calcularArea(double ancho, double alto) {
        return ancho * alto;
    }
    public double calcularArea (double base, int altura) {
        return (base * altura) / 2;
    }

    public static void main (String[] args){
        CalculadoraGeometrica call
                = new CalculadoraGeometrica("Principal");

        System.out.println("Area del circulo " + call.calcularArea(5));

        System.out.println("Area del rectangulo " + call.calcularArea(3, 6));

        System.out.println("Area del triangulo " + call.calcularArea(12, 18));

        System.out.println("*********************");

        CalculadoraGeometrica cal2
                = new CalculadoraGeometrica("Principal");

        System.out.println("Area del circulo " + cal2.calcularArea(10));

        System.out.println("Area del rectangulo " + cal2.calcularArea(5, 7));

        System.out.println("Area del triangulo " + cal2.calcularArea(8, 9));


    }
}
