package com.mx.curso.proyectofinal.modelo;

import java.util.ArrayList;
import java.util.List;

public class SistemaInventario {

    private List<Planeacion> planeaciones;
    private List<Instructor> instructores;
    private List<Maestro> maestros;
    private List<MaterialDidactico> materiales;

    public List<Planeacion> getPlaneaciones() {
        return planeaciones;
    }

    public void setPlaneaciones(List<Planeacion> planeaciones) {
        this.planeaciones = planeaciones;
    }

    public List<Instructor> getInstructores() {
        return instructores;
    }

    public void setInstructores(List<Instructor> instructores) {
        this.instructores = instructores;
    }

    public List<Maestro> getMaestros() {
        return maestros;
    }

    public void setMaestros(List<Maestro> maestros) {
        this.maestros = maestros;
    }

    public List<MaterialDidactico> getMateriales() {
        return materiales;
    }

    public void setMateriales(List<MaterialDidactico> materiales) {
        this.materiales = materiales;
    }

    public SistemaInventario() {
        this.planeaciones = new ArrayList<>();
        this.instructores = new ArrayList<>();
        this.maestros = new ArrayList<>();
        this.materiales = new ArrayList<>();
    }
}

