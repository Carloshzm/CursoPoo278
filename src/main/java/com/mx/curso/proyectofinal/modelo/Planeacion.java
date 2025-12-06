package com.mx.curso.proyectofinal.modelo;

public class Planeacion {
    private String idDisciplina;
    private int grado;
    private String fecha;
    private int numeroSemana;
    private int cantidadSesiones;
    private Instructor instructor;

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


