package org.example.topics.annotations;

import java.lang.reflect.Method;

public class ProcesadorDeAnotacion {
  public static void main(String[] args) throws Exception {
    Method[] methods = UsoDeAnotador.class.getDeclaredMethods();
    for (Method method : methods) {
      if (method.isAnnotationPresent(AnotacionParaMetodos.class)) {
        AnotacionParaMetodos anotacion = method.getAnnotation(AnotacionParaMetodos.class);
        System.out.println("Método: " + method.getName() + ", Valor de la anotación: " + anotacion.valor());
      }
    }
  }
}