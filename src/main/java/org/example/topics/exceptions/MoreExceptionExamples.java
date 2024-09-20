package org.example.topics.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MoreExceptionExamples {

  public static void main(String[] args) {
    try {
      causeNumberFormatException();
    } catch (NumberFormatException e) {
      System.out.println("Caught NumberFormatException: " + e.getMessage());
    }

    try {
      causeIOException();
    } catch (IOException e) {
      System.out.println("Caught IOException: " + e.getMessage());
    }

    try {
      causeFileNotFoundException();
    } catch (FileNotFoundException e) {
      System.out.println("Caught FileNotFoundException: " + e.getMessage());
    }

    try {
      causeArithmeticException();
    } catch (ArithmeticException e) {
      System.out.println("Caught ArithmeticException: " + e.getMessage());
    }

    try {
      causeInterruptedException();
    } catch (InterruptedException e) {
      System.out.println("Caught InterruptedException: " + e.getMessage());
    }

    try {
      causeIllegalStateException();
    } catch (IllegalStateException e) {
      System.out.println("Caught IllegalStateException: " + e.getMessage());
    }
  }

  public static void causeNumberFormatException() {
    String invalidNumber = "abc";
    int number = Integer.parseInt(invalidNumber); // Provoca NumberFormatException
  }

  public static void causeIOException() throws IOException {
    throw new IOException("Provoca IOException");
  }

  public static void causeFileNotFoundException() throws FileNotFoundException {
    FileInputStream file = new FileInputStream("nonexistentfile.txt"); // Provoca FileNotFoundException
  }

  public static void causeArithmeticException() {
    int result = 1 / 0; // Provoca ArithmeticException
  }

  public static void causeInterruptedException() throws InterruptedException {
    Thread.sleep(1000);
    throw new InterruptedException("Provoca InterruptedException");
  }

  public static void causeIllegalStateException() {
    throw new IllegalStateException("Provoca IllegalStateException");
  }
}
