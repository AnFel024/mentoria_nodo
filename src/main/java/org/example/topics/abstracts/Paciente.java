package org.example.topics.abstracts;

import org.example.topics.abstracts.abstracts.Trabajar;
import java.util.Map;

public class Paciente implements Trabajar {

  // Mapa de relacion de especialidad y su historia.
  private Map<String, String> history;

  public Paciente() {
  }

  public Paciente(Map<String, String> history) {
    this.history = history;
  }

  @Override
  public void practice() {
    System.out.println("El paciente tal esta en consulta!");
  }

  @Override
  public void makeGratification() {

  }
}
