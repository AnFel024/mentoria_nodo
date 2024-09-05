package org.example;

/*
* Definir un servicio de hospital
*
* 1. Medico, enfermero, aseador, farmaceuta, recepcionista
* 2. Encarga de relacionar personal
* */

import org.example.domains.Persona;
import org.example.services.Enfermero;
import org.example.services.Medico;

public class Main {
  public static void main(String[] args) {

    Persona persona =
        new Medico("Juan", "Perez", "1000000");
    //Medico medico3 = new Persona();
    Medico medico2 = new Medico(
        "Daniela", "Molina", "2000000"
    );

    System.out.println("La persona "
        + persona.getApellido()
        + " tiene un sueldo de "
        + persona.getSueldo());

    System.out.println("La persona "
        + medico2.getApellido()
        + " tiene un sueldo de "
        + medico2.getSueldo());
  }
}