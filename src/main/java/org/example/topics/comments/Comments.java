package org.example.topics.comments;

public class Comments {

  // Este es un comentario de una sola línea

  /*
   * Este es un comentario de múltiples líneas.
   * Puede abarcar varias líneas.
   */

  /**
   * Este es un comentario de documentación.
   * Se utiliza para generar documentación del código.
   * @param args Argumentos de la línea de comandos
   */
  public static void main(String[] args) {
    // Comentario de una sola línea dentro de un método
    System.out.println("Ejemplo de comentarios en Java");

    /*
     * Comentario de múltiples líneas dentro de un método.
     * Puede ser útil para explicar bloques de código.
     */
    int a = 5; // Comentario al final de una línea de código
    int b = 10;
    int sum = a + b; // Suma de dos números
    System.out.println("La suma es: " + sum);
  }
}