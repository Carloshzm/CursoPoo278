package com.mx.curso.unidad2.secuencia.excepciones;

import java.util.Scanner;

public class ConversorNumerico {

    static void main(String[] args) {
        String text = " ";
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Ingresa un texto");
            text = scanner.nextLine();
            int numero = Integer.parseInt(text);
            System.out.println("numero: " + numero);
        }catch (NumberFormatException e) {
            System.out.println("El formato no corresponde a un numero " +
                    "entero valido");
        }
    }
}
