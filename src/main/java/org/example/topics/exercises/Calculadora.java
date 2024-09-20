package org.example.topics.exercises;
import java.util.Scanner;

public class Calculadora {

  public double sumar(double a, double b) {
    return a + b;
  }

  public double restar(double a, double b) {
    return a - b;
  }

  public double multiplicar(double a, double b) {
    return a * b;
  }

  public double dividir(double a, double b) {
    return a / b;
  }

  public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();
    Scanner scanner = new Scanner(System.in);
    boolean continuar = true;

    while (continuar) {
      System.out.println("Seleccione una operación:");
      System.out.println("1. Sumar");
      System.out.println("2. Restar");
      System.out.println("3. Multiplicar");
      System.out.println("4. Dividir");
      System.out.println("5. Salir");
      int opcion = scanner.nextInt();

      if (opcion == 5) {
        continuar = false;
        System.out.println("Saliendo...");
        break;
      }

      System.out.print("Ingrese el primer número: ");
      double num1 = scanner.nextDouble();
      System.out.print("Ingrese el segundo número: ");
      double num2 = scanner.nextDouble();

        double resultado = 0;
        switch (opcion) {
          case 1:
            resultado = calculadora.sumar(num1, num2);
            break;
          case 2:
            resultado = calculadora.restar(num1, num2);
            break;
          case 3:
            resultado = calculadora.multiplicar(num1, num2);
            break;
          case 4:
            resultado = calculadora.dividir(num1, num2);
            break;
          default:
            System.out.println("Opción no válida");
            continue;
        }
        System.out.println("El resultado es: " + resultado);
    }

    scanner.close();
  }
}