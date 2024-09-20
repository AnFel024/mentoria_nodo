package org.example;

import lombok.SneakyThrows;
import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

public class Main {

  @SneakyThrows
  public static void main(String[] args) {
    boolean t = true;
    while (t) {
      try { // La definicion de codigo que se puede romper
        String a = "null";
        a.length();
        int b = 1/1;
        List<Integer> list = new ArrayList<>(5);
        list.get(6);
      } catch (Exception e) { // Si se rompe el codigo por la excepcion tal, sigua este paso a paso
        System.out.println("Caught: " + e.getMessage());
      } finally { // Despues de fallar, ejecuta este codigo
        System.out.println("Excepcion encontrada, se detuvo el flujo sin parar el sistema");
      }
      System.out.println("El programa sigue funcionando");
      Thread.sleep(10000);
    }
  }

  public int dividir(int a, int b) {
    return a / b; // Esto lanzará ArithmeticException si b es 0
  }
}