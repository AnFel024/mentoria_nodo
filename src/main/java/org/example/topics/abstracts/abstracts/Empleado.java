package org.example.topics.abstracts.abstracts;

/*
* Modificadores aplican a clases (interfaces, abstractas),
*   metodos, atributos, constructores
* */

import lombok.ToString;

// Modificador public
//@ToString
public abstract class Empleado implements Trabajar {

  // Atributos
  private String name;
  private String lastName;
  private long salary;
  private double gratification;

  // Constructor

  public Empleado() {
  }

  public Empleado(String name, String lastName, Long salary) {
    this.name = name;
    this.lastName = lastName;
    this.salary = salary;

  }

  // Metodos
  public void setSalary(Long salary) {
    this.salary = salary;
    this.makeGratification();
  }

  public Long getSalary() {
    return salary;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getLastName() {
    return lastName;
  }

  protected void setGratification(Double gratification) {
    this.gratification = gratification;
  }

  public Double getGratification() {
    return gratification;
  }

  //protected abstract void makeGratification();

  public String toString() {
    return "Empleado(name=" + this.getName()
        + ", lastName=" + this.getLastName()
        + ", salary=" + this.getSalary()
        + ", gratification=" + this.getGratification()
        + ")";
  }
}
