package com.mx.curso.unidad2.secuencia.excepciones;

public class DivisionSegura {

    static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 7;
        int resultado = 0;
        try{
            resultado = numero2 / numero1;
            System.out.println("El resultado de la division es: " + resultado);
        }catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        }
    }
}
