package org.example.topics.generics;

import org.example.topics.abstracts.Medico;
import org.example.topics.abstracts.abstracts.Empleado;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa una caja que puede contener cualquier tipo de objeto.
 * */
public class Sistema<E extends Empleado>  {
  private final List<E> listado;

  public Sistema() {
    this.listado = new ArrayList<>();
  }

  public void agregarEmpleado(E contenido) {
    this.listado.add(contenido);
  }

  public E sacar(int position) {
    return listado.remove(position);
  }

  public  String getTipoDeContenido() {
    //T a = T + T;
    return listado.get(0).getClass().toGenericString();
  }

  public  void liquidar(int position) {
    System.out.println("Liquidando empleado en la posicion: " + position);
    System.out.println("Empleado: " + listado.get(position).getName() + " " + listado.get(position).getLastName());
    System.out.println("Salario: " + listado.get(position).getSalary());
    //System.out.println("Especialidad: " + listado.get(position).getSpeciality());
    System.out.println("Salario neto: " + listado.get(position).getSalary() + listado.get(position).getGratification());
  }
}
