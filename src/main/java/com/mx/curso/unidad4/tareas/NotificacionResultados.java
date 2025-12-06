package com.mx.curso.unidad4.tareas;

import java.util.Scanner;

        public class NotificacionResultados {

            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                String estado = "";

                // El ciclo se ejecuta mientras el estado NO sea "Listo para revision"
                while (!estado.equalsIgnoreCase("Listo para revision")) {

                    System.out.print("Ingresa el estado actual del resultado: ");
                    estado = sc.nextLine();

                    switch (estado.toLowerCase()) {

                        case "en proceso":
                            // continue saltara directamente a la siguiente iteracion del ciclo
                            System.out.println("El resultado sigue en proceso...");
                            continue;

                        case "error en muestra":
                            // break rompe el ciclo completamente
                            System.out.println("Error detectado. Deteniendo proceso de notificacion.");
                            break;

                        case "listo para revision":
                            System.out.println("El resultado esta listo para revision.");
                            break;

                        default:
                            System.out.println("Estado no reconocido. Continua el proceso.");
                            continue;
                    }

                    // Si se ejecuta break, se rompe el ciclo
                    if (estado.equalsIgnoreCase("error en muestra")) {
                        break;
                    }
                }

                sc.close();
            }
        }
