package org.example.domains;

public class Medico extends Empleado {

  private String speciality;

  public Medico() {
  }

  public Medico(String name, String lastName, Long salary) {
    super(name, lastName, salary);
  }

  @Override
  public void practice() {
    System.out.println("El medico esta operando!");
  }

  @Override
  protected Double getGratification(double salary) {
    return 0.1;
  }

  @Override
  public void practice(String name) {
    System.out.println("El medico " + name + " esta en consulta!");
  }

  public void practice(String nombre, Empleado paciente) {
    System.out.printf("El medico %s esta en cita con el paciente %s ",
        nombre,  paciente.getName());
  }

  public void setSpeciality(String speciality) {
    this.speciality = speciality;
  }
}
