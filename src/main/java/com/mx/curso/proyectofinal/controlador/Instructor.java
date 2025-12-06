package com.mx.curso.proyectofinal.controlador;

public class Instructor {

        private String idInstructor;
        private String nombre;
        private String contacto;
        private String disciplina;

        public Instructor(String idInstructor, String nombre, String contacto, String disciplina) {
            this.idInstructor = idInstructor;
            this.nombre = nombre;
            this.contacto = contacto;
            this.disciplina = disciplina;
        }

        public String getIdInstructor() {
            return idInstructor;
        }

        public void mostrarInfo() {
            System.out.println("Instructor:");
            System.out.println("ID: " + idInstructor);
            System.out.println("Nombre: " + nombre);
            System.out.println("Contacto: " + contacto);
            System.out.println("Disciplina: " + disciplina);
            System.out.println("---------------------");
        }

        public static void main(String[] args) {

            Instructor ins = new Instructor("INS01", "Juan Perez", "2281298039", "Matematicas");

            System.out.println("Mostrando instructor:");
            ins.mostrarInfo();
        }
    }


