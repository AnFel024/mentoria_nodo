package org.example;

/*
* Definir un servicio de hospital
*
* 1. Medico, enfermero, aseador, farmaceuta, recepcionista
* 2. Encarga de relacionar personal
* */

import org.example.domains.*;

import java.util.Map;

public class Main {
  public static void main(String[] args) {

    Medico empleado =
        new Medico("Juan", "Perez", 1000000L);

    Empleado empleado2 =
        new Enfermero("Maria", "Lopez", 2000000L);

    Empleado empleado3 =
        new Aseador("Juana", "Morales", 2000000L);

    Empleado paciente =
        new Paciente("Andres", "Lopez", 0L,
            Map.of("dolor de cabeza", "aspirina"));

    // 1. Metodo abstracto original, sin sobre carga
    //empleado.practice();

    // 2. Metodo de clase abstracta sobreescribo (con Override)
    //empleado.practice("Juan Esteban");
    empleado.practice("Juan Esteban", empleado3);
    //empleado2.practice("Maria Camila");
    //empleado3.practice("Maria Camila");
  }
}