package com.mx.curso.proyectofinal.controlador;

import java.util.ArrayList;
import java.util.List;

public class SistemaInventario {

    private List<Planeacion> planeaciones;
    private List<MaterialDidactico> materiales;
    private List<Instructor> instructores;
    private List<Maestro> maestros;

    public SistemaInventario() {
        planeaciones = new ArrayList<>();
        materiales = new ArrayList<>();
        instructores = new ArrayList<>();
        maestros = new ArrayList<>();
    }

    public void registrarPlaneacion(Planeacion p) {
        planeaciones.add(p);
        System.out.println("Planeacion registrada.");
    }

    public void registrarMaterial(MaterialDidactico m) {
        materiales.add(m);
        System.out.println("Material registrado.");
    }

    public void registrarInstructor(Instructor i) {
        instructores.add(i);
        System.out.println("Instructor registrado.");
    }

    public void registrarMaestro(Maestro m) {
        maestros.add(m);
        System.out.println("Maestro registrado.");
    }

    public void buscarPlaneacionPorDisciplina(String id) {
        System.out.println("Buscando planeaciones por disciplina...");
        for (Planeacion p : planeaciones) {
            if (p.getIdDisciplina().equals(id)) {
                p.mostrarInfo();
            }
        }
    }

    public void buscarMaterialPorTitulo(String nombre) {
        System.out.println("Buscando material por titulo...");
        for (MaterialDidactico m : materiales) {
            if (m.getTitulo().equalsIgnoreCase(nombre)) {
                m.mostrarInfo();
            }
        }
    }

    public static void main(String[] args) {

        SistemaInventario sistema = new SistemaInventario();

        System.out.println("Agregando datos de ejemplo...");

        Instructor i = new Instructor("INS01", "Carlos Diaz", "5522334455", "Matematicas");
        Maestro m = new Maestro("MAE01", "Ana Ruiz", "5511223344", "ana@escuela.mx",
                "Matematicas", 2, "Simon Bolivar");
        Planeacion p = new Planeacion("MAT01", 2, "2025-01-20", 3, 4, "Carlos Diaz");
        MaterialDidactico md = new MaterialDidactico("MD01", "Guia Matematicas", "doc", "MAT01");

        sistema.registrarInstructor(i);
        sistema.registrarMaestro(m);
        sistema.registrarPlaneacion(p);
        sistema.registrarMaterial(md);

        System.out.println("\nBusqueda de planeaciones por disciplina:");
        sistema.buscarPlaneacionPorDisciplina("MAT01");

        System.out.println("\nBusqueda de material por titulo:");
        sistema.buscarMaterialPorTitulo("Guia Matematicas");
    }
}

