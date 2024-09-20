package org.example.topics.annotations;

public class UsoDeAnotador {

    @AnotacionParaMetodos(valor = "Ejemplo de uso")
    public void miMetodo() {
      System.out.println("Método anotado");
    }

  public static void main(String[] args) {
    UsoDeAnotador usoDeAnotador = new UsoDeAnotador();
    usoDeAnotador.miMetodo();
  }
}
