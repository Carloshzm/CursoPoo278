package com.mx.curso.proyectofinal.controlador;

import com.mx.curso.proyectofinal.modelo.Instructor;
import com.mx.curso.proyectofinal.modelo.Maestro;
import com.mx.curso.proyectofinal.modelo.MaterialDidactico;
import com.mx.curso.proyectofinal.modelo.Planeacion;
import com.mx.curso.proyectofinal.servicio.InstructorService;
import com.mx.curso.proyectofinal.servicio.MaestroService;
import com.mx.curso.proyectofinal.servicio.MaterialDidacticoService;
import com.mx.curso.proyectofinal.servicio.PlaneacionService;

public class Controller {

    public static void main(String[] args) {

        PlaneacionService planeacionService = new PlaneacionService();
        MaterialDidacticoService materialService = new MaterialDidacticoService();
        InstructorService instructorService = new InstructorService();
        MaestroService maestroService = new MaestroService();

        Instructor i1 = new Instructor("INS01", "Carlos López", "1234567890", "Matemáticas");
        instructorService.registrarInstructor(i1);

        Planeacion p1 = new Planeacion("MAT01", 2, "2025-01-15", 3, 4, i1);
        planeacionService.registrarPlaneacion(p1);

        MaterialDidactico m1 = new MaterialDidactico("MATD01", "Video Álgebra", "mp4", "MAT01");
        materialService.registrarMaterial(m1);

        Maestro maestro1 = new Maestro("MA01", "Ana Ruiz", "22223333", "ana@escuela.mx",
                "Matemáticas", "2do", "Simón Bolívar");
        maestroService.registrarMaestro(maestro1);

        System.out.println("Sistema inicializado. Datos de prueba cargados.");
    }
}
