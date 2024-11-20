package org.example.model;

import org.example.interfaces.IExamen;

public class ExamenEscrito  implements IExamen {

   // SRP (Responsabilidad Única): La clase ExamenEscrito se encarga de evaluar a un estudiante a través de un examen escrito. Su única responsabilidad es este tipo de evaluación.
   // LSP (Sustitución de Liskov): ExamenEscrito es una implementación de la interfaz IExamen. Por lo tanto, puede ser reemplazada por cualquier otra clase que implemente esta interfaz sin afectar el funcionamiento del sistema.
    @Override
    public void evaluar(String estudiante) {
        System.out.println("Evaluando el examen escrito del estudiante: " + estudiante);
    }
}
