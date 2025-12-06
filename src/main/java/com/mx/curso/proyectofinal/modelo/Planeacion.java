package com.mx.curso.proyectofinal.modelo;

public class Planeacion {
    private String idDisciplina;
    private int grado;
    private String fecha;
    private int numeroSemana;
    private int cantidadSesiones;
    private Instructor instructor;

    public void setIdDisciplina(String idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getNumeroSemana() {
        return numeroSemana;
    }

    public void setNumeroSemana(int numeroSemana) {
        this.numeroSemana = numeroSemana;
    }

    public int getCantidadSesiones() {
        return cantidadSesiones;
    }

    public void setCantidadSesiones(int cantidadSesiones) {
        this.cantidadSesiones = cantidadSesiones;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Planeacion(String idDisciplina, int grado, String fecha, int numeroSemana,
                      int cantidadSesiones, Instructor instructor) {
        this.idDisciplina = idDisciplina;
        this.grado = grado;
        this.fecha = fecha;
        this.numeroSemana = numeroSemana;
        this.cantidadSesiones = cantidadSesiones;
        this.instructor = instructor;
    }

    public String getIdDisciplina() { return idDisciplina; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public String getFecha() { return fecha; }
}


