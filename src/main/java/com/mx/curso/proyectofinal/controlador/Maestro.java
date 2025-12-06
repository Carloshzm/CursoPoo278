package com.mx.curso.proyectofinal.controlador;

public class Maestro {

        private String idMaestro;
        private String nombre;
        private String telefono;
        private String correo;
        private String disciplina;
        private int grado;
        private String escuela;

        public Maestro(String idMaestro, String nombre, String telefono,
                       String correo, String disciplina, int grado, String escuela) {

            this.idMaestro = idMaestro;
            this.nombre = nombre;
            this.telefono = telefono;
            this.correo = correo;
            this.disciplina = disciplina;
            this.grado = grado;
            this.escuela = escuela;
        }

        public void mostrarInfo() {
            System.out.println("Maestro:");
            System.out.println("ID: " + idMaestro);
            System.out.println("Nombre: " + nombre);
            System.out.println("Telefono: " + telefono);
            System.out.println("Correo: " + correo);
            System.out.println("Disciplina: " + disciplina);
            System.out.println("Grado: " + grado);
            System.out.println("Escuela: " + escuela);
            System.out.println("---------------------");
        }

        public static void main(String[] args) {

            Maestro m = new Maestro("MAE01", "Laura Torres", "5587654321",
                    "laura.t@simonbolivar.edu.mx", "Historia", 3, "Simon Bolivar");

            System.out.println("Mostrando maestro:");
            m.mostrarInfo();
        }
    }


