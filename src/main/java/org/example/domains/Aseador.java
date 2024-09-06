package org.example.domains;

public class Aseador extends Empleado {

  @Override
  public void practice() {
    System.out.println("El aseador esta limpiando!");
  }

  @Override
  protected Double getGratification(double salary) {
    return 0.3;
  }

  private String especialidad;

  public Aseador() {
  }

  public Aseador(String name, String lastName, Long salary) {
    super(name, lastName, salary);
  }

}
