package org.example.topics.abstracts;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.topics.abstracts.abstracts.Empleado;

@Setter
@Getter
@ToString(callSuper = true)
public class Medico extends Empleado {

  private String speciality;

  public Medico() {
  }

  public Medico(String name, String lastName, Long salary) {
    super(name, lastName, salary);
  }

  public Medico(String speciality) {
    this.speciality = speciality;
  }

  @Deprecated
  public void practice() {
    System.out.println("El medico esta operando!!!!!!!!");
  }

  public void practice(int valor) {
    System.out.println("El medico por operar cobra " + valor);
  }

  protected Double getGratification(double salary) {
    return 0.1;
  }

  @Override
  public void makeGratification() {
    super.setGratification(super.getSalary() * 0.1);
  }

  public void practice(String nombre, Empleado paciente) {
    System.out.printf("El medico %s esta en cita con el paciente %s ",
        nombre,  paciente.getName());
  }

}
