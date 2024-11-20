package org.example.interfaces;

public interface IExamen {
    // Este método representa una operación que se implementará en todas las clases de examen


   // SRP (Responsabilidad Única): La interfaz IExamen tiene una única responsabilidad: definir el contrato para cualquier tipo de examen.
   //OCP (Abierto/Cerrado): Esta interfaz está cerrada para modificaciones pero abierta para ser extendida por nuevas clases de examen, como ExamenEscrito, ExamenOral, etc.
    void evaluar(String estudiante);
}
