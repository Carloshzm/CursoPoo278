package com.mx.curso.unidad3.conceptos_basicos.polimorfismo;

public class LavaPlatos extends Empleado {
    @Override
    public double calcularSalario() {
        return 2000 * 4;
    }
}
