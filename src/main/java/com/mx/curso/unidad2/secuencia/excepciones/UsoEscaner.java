package com.mx.curso.unidad2.secuencia.excepciones;

import java.util.Scanner;

public class UsoEscaner {

    static void main(String[] args) {
        int dato = 0;
        Scanner scanner = new Scanner(System.in);

        scanner.close();

        try {
            System.out.println("Ingresa dato de Scanner: ");

        }catch (IllegalArgumentException e){
            System.out.println("Error: no es posible leer" +
                    "porque el scanner ya esta cerrado" + e.getMessage());
        }
    }

}
