package org.example.domains;

/*
* Modificadores aplican a clases (interfaces, abstractas),
*   metodos, atributos, constructores
* */

// Modificador public
public abstract class Persona {

  // Atributos
  private String nombre;
  private String apellido;
  private String sueldo;

  // Constructor
  public Persona(String nombre, String apellido, String sueldo) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.sueldo = convertToDollars(sueldo);
  }

  private String convertToDollars(String sueldo) {
    return "$" + Long.parseLong(sueldo) * 0.00027;
  }

  // Metodos
  public String getSueldo() {
    sueldo = sueldo + " USD";
    return sueldo;
  }

  public String getSueldoInDollars() {
    return "Dollars";
  }

  public void setSueldo(String sueldo) {
    this.sueldo = sueldo;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  protected abstract void ejercer();
}
