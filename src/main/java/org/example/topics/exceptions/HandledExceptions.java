package org.example.topics.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HandledExceptions {

  public static void main(String[] args) {
    // Ejemplo de excepción no comprobada
    try {
      int resultado = dividir(10, 0);
    } catch (ArithmeticException e) {
      System.out.println("Excepción no comprobada: " + e.getMessage());
    }

    // Ejemplo de excepción comprobada
    try {
      leerArchivo("archivo_inexistente.txt");
    } catch (FileNotFoundException e) {
      System.out.println("Excepción comprobada: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("Excepción de E/S: " + e.getMessage());
    }
  }

  // Método que lanza una excepción no comprobada
  public static int dividir(int a, int b) {
    return a / b; // Esto lanzará ArithmeticException si b es 0
  }

  // Método que lanza una excepción comprobada
  public static void leerArchivo(String nombreArchivo) throws IOException {
    File archivo = new File(nombreArchivo);
    FileReader fr = new FileReader(archivo); // Esto lanzará FileNotFoundException si el archivo no existe
    fr.close();
  }
}
