package org.example.topics.concurrency.threads.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EventoEjemplo {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Ejemplo de Evento");
    JButton button = new JButton("Haz clic");

    // Añadir un oyente de eventos al botón
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Botón presionado!");
      }
    });

    frame.add(button);
    frame.setSize(200, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}