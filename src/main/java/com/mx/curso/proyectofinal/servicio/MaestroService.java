package com.mx.curso.proyectofinal.servicio;

import com.mx.curso.proyectofinal.modelo.Maestro;

import java.util.ArrayList;

public class MaestroService {

    private ArrayList<Maestro> maestros = new ArrayList<>();

    public void registrarMaestro(Maestro m) {
        maestros.add(m);
    }
}
