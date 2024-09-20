package org.example.topics.generics;

public class Par<T, U> {
  private T primero;
  private U segundo;

  public Par(T primero, U segundo) {
    this.primero = primero;
    this.segundo = segundo;
  }

  public T getPrimero() {
    return primero;
  }

  public U getSegundo() {
    return segundo;
  }

  public void setPrimero(T primero) {
    this.primero = primero;
  }

  public void setSegundo(U segundo) {
    this.segundo = segundo;
  }
}