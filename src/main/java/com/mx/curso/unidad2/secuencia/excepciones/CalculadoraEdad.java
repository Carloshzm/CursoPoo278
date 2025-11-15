package com.mx.curso.unidad2.secuencia.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraEdad {

    static void main(String[] args) {

        int anioActual=2025;

        Scanner scanner = new Scanner(System.in);

        try {
            int anioNacimiento = scanner.nextInt();
            int edad = anioActual - anioNacimiento;
            System.out.println("Tu edad es:" + edad);
        }catch (InputMismatchException e){
            System.out.println("Error: Debes ingresar" + "un numero valido para el anio de nacimiento.");
        }
        scanner.close();
    }
}
