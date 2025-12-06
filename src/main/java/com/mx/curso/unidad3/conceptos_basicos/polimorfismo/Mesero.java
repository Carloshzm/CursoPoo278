package com.mx.curso.unidad3.conceptos_basicos.polimorfismo;

public class Mesero extends Empleado{
    @Override
    public double calcularSalario() {
        return 3500 * 4;
    }
}
