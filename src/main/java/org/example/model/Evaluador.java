package org.example.model;

import org.example.interfaces.IExamen;

public class Evaluador {

    /*
    DIP (Inversión de Dependencias): La clase Evaluador depende de la interfaz IExamen, no de clases concretas. Esto permite que Evaluador sea flexible y pueda trabajar con cualquier tipo de examen sin necesidad de saber qué tipo de examen se está usando.
    OCP (Abierto/Cerrado): Si se agrega un nuevo tipo de examen, no es necesario modificar Evaluador. Solo se debe crear una nueva clase que implemente IExamen, y Evaluador podrá seguir funcionando con esa nueva clase sin cambios.
    */
    private final IExamen examen;

    // Constructor que recibe cualquier implementación de IExamen
    public Evaluador(IExamen examen) {
        this.examen = examen;
    }

    // Método que ejecuta la evaluación del estudiante
    public void realizarEvaluacion(String estudiante) {
        examen.evaluar(estudiante);
    }
}
