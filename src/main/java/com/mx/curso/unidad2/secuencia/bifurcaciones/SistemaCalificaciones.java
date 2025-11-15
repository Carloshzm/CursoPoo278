package com.mx.curso.unidad2.secuencia.bifurcaciones;

public class SistemaCalificaciones {
    static void main(String[] args) {
        int notaExamen = 95;

        if (notaExamen>=60){
            System.out.println("Felicidades aprobaste el curso");
            if (notaExamen>=90){
                System.out.println("Excelente desempeño");
            }
        }else {
            System.out.println("Lo sentimos, ho has aprobado");
        }

        switch (notaExamen){
            case 90:
                System.out.println("Obtuviste una A");
                break;
            case 80:
                System.out.println("Obtuviste una B");
                break;
            case 70:
                System.out.println("Obtuviste una C");
            case 60:
                System.out.println("Obtuviste una D");
            case 50:
                System.out.println("Obtuviste una E");
        }
    }
}
