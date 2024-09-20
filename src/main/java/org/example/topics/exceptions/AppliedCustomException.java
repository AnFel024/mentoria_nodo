package org.example.topics.exceptions;

import org.example.topics.abstracts.Medico;
import org.example.topics.abstracts.abstracts.Empleado;

public class AppliedCustomException {

  public static void main(String[] args) {
    try {
      metodoQueLanzaExcepcion();
    } catch (CustomException e) {
      System.out.println("Excepción personalizada capturada: " + e.getMessage());
    }
  }

  public static void metodoQueLanzaExcepcion() throws CustomException {
    throw new CustomException("Este es un mensaje de excepción personalizada");
    //throw new Medico("Juan", "Perez", 1000L);
  }
}
