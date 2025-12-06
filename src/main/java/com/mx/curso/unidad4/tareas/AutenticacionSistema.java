package com.mx.curso.unidad4.tareas;

import java.util.Scanner;

class Scratch {

        public class AutenticacionSistema {

             static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                String usuario, contrasena;
                boolean accesoConcedido = false;

                // Ciclo for con 3 intentos maximos
                for (int i = 1; i <= 3; i++) {

                    System.out.print("Ingresa el nombre de usuario: ");
                    usuario = sc.nextLine();

                    System.out.print("Ingresa la contrasena: ");
                    contrasena = sc.nextLine();

                    // Verificacion de credenciales con if anidados
                    if (usuario.equals("medico1") && contrasena.equals("doc123")) {
                        System.out.println("Acceso de Medico exitoso");
                        accesoConcedido = true;
                        break; // Termina el ciclo por acceso exitoso

                    } else if (usuario.equals("enfermera2") && contrasena.equals("enf456")) {
                        System.out.println("Acceso de Enfermera exitoso");
                        accesoConcedido = true;
                        break; // Termina el ciclo por acceso exitoso

                    } else {
                        System.out.println("Credenciales incorrectas. Intento " + i + " de 3.\n");
                        continue; // Pasa a la siguiente iteracion
                    }
                }

                // Si no se logro autenticacion en los 3 intentos
                if (!accesoConcedido) {
                    System.out.println("Demasiados intentos. Acceso denegado.");
                }

                sc.close();
            }
        }
    }


