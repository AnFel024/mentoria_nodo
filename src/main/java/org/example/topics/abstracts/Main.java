package org.example.topics.abstracts;

public class Main {
  public static void main(String[] args) {
    Enfermero enfermero = new Enfermero("Juan", "Perez", 1000L);
    enfermero.practice();
    enfermero.makeGratification();
    System.out.println(enfermero.getGratification());
  }
}
