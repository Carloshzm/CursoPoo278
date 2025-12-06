package com.mx.curso.proyectofinal.controlador;

public class Planeacion {

        private String idDisciplina;
        private int grado;
        private String fecha;
        private int numeroSemana;
        private int cantidadSesiones;
        private String instructor;

        public Planeacion(String idDisciplina, int grado, String fecha,
                          int numeroSemana, int cantidadSesiones, String instructor) {
            this.idDisciplina = idDisciplina;
            this.grado = grado;
            this.fecha = fecha;
            this.numeroSemana = numeroSemana;
            this.cantidadSesiones = cantidadSesiones;
            this.instructor = instructor;
        }

        public String getIdDisciplina() {
            return idDisciplina;
        }

        public String getFecha() {
            return fecha;
        }

        public void setFecha(String nuevaFecha) {
            this.fecha = nuevaFecha;
        }

        public void mostrarInfo() {
            System.out.println("Planeacion:");
            System.out.println("ID Disciplina: " + idDisciplina);
            System.out.println("Grado: " + grado);
            System.out.println("Fecha: " + fecha);
            System.out.println("Numero semana: " + numeroSemana);
            System.out.println("Cantidad sesiones: " + cantidadSesiones);
            System.out.println("Instructor: " + instructor);
            System.out.println("---------------------");
        }

        public static void main(String[] args) {

            Planeacion p = new Planeacion("MAT01", 2, "2025-02-10", 4, 5, "Prof. Lopez");

            System.out.println("Mostrando planeacion creada");
            p.mostrarInfo();

            System.out.println("Actualizando fecha...");
            p.setFecha("2025-02-15");

            p.mostrarInfo();
        }
    }

