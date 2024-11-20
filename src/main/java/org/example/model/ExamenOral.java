package org.example.model;

import org.example.interfaces.IExamen;

public class ExamenOral implements IExamen {
   // SRP (Responsabilidad Única): Al igual que la clase ExamenEscrito, la clase ExamenOral tiene una única responsabilidad: evaluar al estudiante a través de un examen oral.
   //LSP (Sustitución de Liskov): Al implementar IExamen, ExamenOral puede ser usada en cualquier lugar donde se espere un objeto de tipo IExamen.
    @Override
    public void evaluar(String estudiante) {
        System.out.println("Evaluando el examen oral del estudiante: " + estudiante);
    }
}
