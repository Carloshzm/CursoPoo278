package com.mx.curso.unidad4.tareas;

import java.util.InputMismatchException;
import java.util.Scanner;

        public class Citas {

            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                try {
                    // Solicitar hora de la cita
                    System.out.print("Ingresa la hora de la cita (entero, por ejemplo 14): ");
                    int hora = sc.nextInt();
                    sc.nextLine(); // limpiar buffer

                    // Solicitar dia de la semana
                    System.out.print("Ingresa el dia de la semana (por ejemplo: lunes): ");
                    String dia = sc.nextLine().toLowerCase();

                    // Validar la hora
                    if (hora >= 9 && hora <= 17) {

                        // Validar que no sea sabado ni domingo
                        if (!dia.equals("sabado") && !dia.equals("domingo")) {
                            System.out.println("Cita agendada con exito.");
                        } else {
                            System.out.println("Error: No se agendan citas en fines de semana.");
                        }

                    } else {
                        System.out.println("Error: La hora debe estar entre 9 y 17.");
                    }

                } catch (InputMismatchException e) {
                    // Manejo del error si el usuario ingresa algo que no sea un numero entero
                    System.out.println("Error: La hora debe ser un numero entero.");
                }

                sc.close();
            }
        }

