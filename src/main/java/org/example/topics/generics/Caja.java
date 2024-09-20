package org.example.topics.generics;

/**
 * Esta clase representa una caja que puede contener cualquier tipo de objeto.
 * */
public class Caja<E> {
  private E contenido;

  public void poner(E contenido) {
    this.contenido = contenido;
  }

  public E sacar() {
    return contenido;
  }

  public String detallar() {
    return "El dato " + contenido.toString() + " es de tipo " + contenido.getClass().toGenericString();
  }

  public  String getTipoDeContenido() {
    //T a = T + T;
    return contenido.getClass().toGenericString();
  }
}
