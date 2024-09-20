package org.example.topics.abstracts;

import org.example.topics.abstracts.abstracts.Empleado;

public class Enfermero extends Empleado {

  public Enfermero() {
  }

  public Enfermero(String name, String lastName, Long salary) {
    super(name, lastName, salary);
  }

  @Override
  public void practice() {
    System.out.println("El enfermero esta atendiendo!");
  }

  @Override
  public void makeGratification() {
    super.setGratification(super.getSalary() * 0.2);
  }
}
