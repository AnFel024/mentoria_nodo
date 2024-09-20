package org.example.topics.abstracts;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MedicoInternista extends Medico {

  private String universityName;

  public MedicoInternista() {
  }

  public MedicoInternista(String name, String lastName, Long salary) {
    super(name, lastName, salary);
  }

  public void practice(int valor) {
    System.out.println("El medico por ver al cirujano operar podria cobrar " + valor);
  }
}
