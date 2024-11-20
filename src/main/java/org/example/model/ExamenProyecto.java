package org.example.model;

import org.example.interfaces.IExamen;

public class ExamenProyecto implements IExamen {
   // SRP (Responsabilidad Única): Esta clase también tiene una única responsabilidad: evaluar el proyecto de un estudiante.
    // LSP (Sustitución de Liskov): Al ser una implementación de IExamen, esta clase puede sustituir a ExamenEscrito o ExamenOral en cualquier parte del sistema sin romperlo.

    @Override
    public void evaluar(String estudiante) {
        System.out.println("Evaluando el proyecto del estudiante: " + estudiante);
    }
}
