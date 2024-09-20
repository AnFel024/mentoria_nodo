package org.example.topics.generics;

import org.example.topics.abstracts.Aseador;
import org.example.topics.abstracts.Medico;
import org.example.topics.abstracts.MedicoInternista;
import org.example.topics.abstracts.abstracts.Empleado;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>(); // Genericos
    List<Medico> medico = new ArrayList<>();

    for(int i = 0; i < 10; i++) { // For loop
      list.add(i);
      Medico medico1 = new Medico("Juan", "Perez", Long.valueOf(i));
      medico1.setSpeciality("Cirujano");
      medico.add(medico1);
    }

    List<String> stringStream = list.stream().map(dato -> "El dato es: " + dato).toList();

    for(String i: stringStream) { // Foreach for loop
      System.out.println(i);
    }

    /*
    // Ejemplo con un tipo de generico
    Caja<String> cajaDeString = new Caja<>();
    cajaDeString.poner("Hola");

    Caja<Integer> cajaDeInteger = new Caja<>();
    cajaDeInteger.poner(123);
    System.out.println(cajaDeInteger.sacar());
    System.out.println(cajaDeInteger.getTipoDeContenido());
    System.out.println(cajaDeInteger.detallar());

    // Ejemplo con dos tipos de genericos
    Par<String, Integer> par = new Par<>("Hola", 10);
    //Map<String, Integer> map = Map.of(); <- {"clave" : "valor", "2" : "valor2"}
    System.out.println(par.getPrimero());
    System.out.println(par.getSegundo());

    // Ejemplo con extencion generica
    // Type parameter 'java.lang.String' is not within its bound;
    // should extend 'org.example.topics.abstracts.abstracts.Empleado'
    //Sistema<String> sistema = new Sistema<>();
    Sistema<Medico> sistema = new Sistema<>();
    Medico medico = new Medico("Juan", "Perez", 100L);
    MedicoInternista medico2 = new MedicoInternista("Pepe", "Perez", 100L);
    sistema.agregarEmpleado(medico);
    sistema.agregarEmpleado(medico2);
    sistema.liquidar(1);

    // Ejemplo de wildcards
    List<Caja<?>> listaDeCajas = new ArrayList<>();

    Caja<String> cajaDeString2 = new Caja<>();
    cajaDeString2.poner("Hola");

    Caja<Integer> cajaDeInteger2 = new Caja<>();
    cajaDeInteger2.poner(1);

    listaDeCajas.add(cajaDeString2);
    listaDeCajas.add(cajaDeInteger2);

    //String a = listaDeCajas.get(0).sacar();
    //Integer b = listaDeCajas.get(1).sacar();

    for (Caja<?> caja : listaDeCajas) {
      System.out.println(caja.sacar());
    }

    Caja<Integer> cajaDeInteger2 = new Caja<>();
    cajaDeInteger2.poner(123);
    listaDeCajas.add(cajaDeInteger2);

    imprimirContenido(listaDeCajas);
*/

    // Ejemplo de wildcards con extencion
    List<Caja<? extends Empleado>> listaDeCajas2 = new ArrayList<>();
    //List<?> listaa = new ArrayList<Period>();
    //Collection<?> collection = new ArrayList<Period>();
    Caja<Medico> cajaDeMedico = new Caja<>();
    cajaDeMedico.poner(new Medico());
    listaDeCajas2.add(cajaDeMedico);

    Caja<Aseador> cajaDeAseador = new Caja<>();
    cajaDeAseador.poner(new Aseador());
    listaDeCajas2.add(cajaDeAseador);

    imprimirContenidoDeEmpleado(listaDeCajas2);
  }

  public static void imprimirContenido(List<Caja<?>> lista) {
    for (Caja<?> caja : lista) {
      System.out.println(caja.sacar());
    }
  }

  public static void imprimirContenidoDeEmpleado(List<Caja<? extends  Empleado>> lista) {
    for (Caja<?> caja : lista) {
      System.out.println(caja.detallar());
    }
  }
}
