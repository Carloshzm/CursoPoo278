package com.mx.curso.unidad3.conceptos_basicos.polimorfismo;

import java.util.List;

public class Test {

    static void main(String[] args) {

        List<Empleado> empleado = List.of(new Cocinero(), new Mesero(), new LavaPlatos());

        /**
         * Creamos un ciclo que itera la lista de empleados
         * e imprima el metodo correspondiente calcularSalario
         */
        for (Empleado e : empleado){
            System.out.println("Salario empleado: " + e.calcularSalario());
        }
    }
}
