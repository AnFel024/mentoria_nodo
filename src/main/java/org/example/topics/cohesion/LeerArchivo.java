package org.example.topics.cohesion;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import java.io.File;
import java.util.List;

public class LeerArchivo {
  // Leer el archivo JSON
  private final ObjectMapper mapper;

  public LeerArchivo() {
    this.mapper = new ObjectMapper();
  }

  @SneakyThrows
  public List getList(String fileName) {
    String file = ProcesadorNumeros.class.getClassLoader().getResource(fileName).getFile();
    return mapper.readValue(new File(file), List.class);
  }
}
