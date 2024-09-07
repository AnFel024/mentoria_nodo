package org.example.services;

/*
* Definir un servicio de hospital
*
* 1. Medico, enfermero, aseador, farmaceuta, recepcionista
* 2. Encarga de relacionar personal
* */

import org.example.domains.*;
import org.example.domains.abstracts.Empleado;

import java.util.Map;

public class Main {
  public static void main(String[] args) {

    Medico medico =
        new Medico("Juan", "Perez", 10L);

    Empleado enfermero =
        new Enfermero("Maria", "Lopez", 20L);

    Empleado aseador =
        new Aseador("Juana", "Morales", 30L);

    Empleado paciente =
        new Paciente("Andres", "Lopez", 0L,
            Map.of("dolor de cabeza", "aspirina"));

    System.out.println("*****");
    System.out.printf("Empleado: %s se gana inicialmente %s dolares por hora con %s de gratificacion\n",
        paciente.getLastName(), paciente.getSalary(), paciente.getGratification());
    System.out.println("El Empleado se le reconoce su esfuerzo y se le sube el sueldo\n");
    //medico.makeGratification();
    // TODO 'makeGratification()' has protected access in 'org.example.domains.Medico
    paciente.setSalary(40L);
    //paciente.setGratification(40.0);
    System.out.printf("Empleado: %s gana ahora %s dolares por hora mas %s de gratificacion\n",
        paciente.getLastName(), paciente.getSalary(), paciente.getGratification());
    System.out.println("*****");
  }
}