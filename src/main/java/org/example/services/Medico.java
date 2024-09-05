package org.example.services;

import org.example.domains.Persona;

public class Medico extends Persona {

  private String especialidad;

  public Medico(String nombre, String apellido, String sueldo) {
    super(nombre, apellido, sueldo);
  }

  @Override
  protected void ejercer() {
    System.out.println("El medico esta operando!");
  } //

}
