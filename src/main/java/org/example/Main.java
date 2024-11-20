package org.example;

import org.example.interfaces.IExamen;
import org.example.model.Evaluador;
import org.example.model.ExamenEscrito;
import org.example.model.ExamenOral;
import org.example.model.ExamenProyecto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String estudiante;

        System.out.println("=== Sistema de Evaluación de Estudiantes ===");
        System.out.print("Ingrese el nombre del estudiante: ");
        estudiante = scanner.nextLine();

        while (true) {
            // Menú para que el usuario seleccione el tipo de examen
            System.out.println("\nSeleccione el tipo de examen:");
            System.out.println("1. Examen Escrito");
            System.out.println("2. Examen Oral");
            System.out.println("3. Proyecto");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            IExamen examen;
            switch (opcion) {
                case 1:
                    examen = new ExamenEscrito();// Instanciamos un examen escrito
                    break;
                case 2:
                    examen = new ExamenOral();// Instanciamos un examen oral
                    break;
                case 3:
                    examen = new ExamenProyecto(); // Instanciamos un examen de proyecto
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    continue;
            }


            // Creación del evaluador con el examen seleccionado
            Evaluador evaluador = new Evaluador(examen);
            evaluador.realizarEvaluacion(estudiante);
        }
    }
}