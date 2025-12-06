package com.mx.curso.proyectofinal.controlador;

public class MaterialDidactico {

        private String idMaterial;
        private String titulo;
        private String tipo;
        private String idDisciplina;

        public MaterialDidactico(String idMaterial, String titulo, String tipo, String idDisciplina) {
            this.idMaterial = idMaterial;
            this.titulo = titulo;
            this.tipo = tipo;
            this.idDisciplina = idDisciplina;
        }

        public void setTitulo(String nuevoTitulo) {
            this.titulo = nuevoTitulo;
        }

        public String getIdMaterial() {
            return idMaterial;
        }

        public String getTitulo() {
            return titulo;
        }

        public void mostrarInfo() {
            System.out.println("Material Didactico:");
            System.out.println("ID Material: " + idMaterial);
            System.out.println("Titulo: " + titulo);
            System.out.println("Tipo: " + tipo);
            System.out.println("ID Disciplina: " + idDisciplina);
            System.out.println("---------------------");
        }

        public static void main(String[] args) {

            MaterialDidactico m = new MaterialDidactico("MATD01", "Video Introduccion", "mp4", "MAT01");

            System.out.println("Mostrando material creado:");
            m.mostrarInfo();

            System.out.println("Actualizando titulo...");
            m.setTitulo("Video de Introduccion a Matematicas");

            m.mostrarInfo();
        }
    }


