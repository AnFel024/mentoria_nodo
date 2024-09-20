package org.example.topics.exceptions;

public class ExceptionExamples {

  public static void main(String[] args) {
    try { // La definicion de codigo que se puede romper
      causeNullPointerException();
    } catch (NullPointerException e) { // Si se rompe el codigo por la excepcion tal, sigua este paso a paso
      System.out.println("Caught NullPointerException: " + e.getMessage());
    }

    try {
      causeArrayIndexOutOfBoundsException();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
    }

    try {
      causeClassCastException();
    } catch (ClassCastException e) {
      System.out.println("Caught ClassCastException: " + e.getMessage());
    }

    try {
      causeIllegalArgumentException();
    } catch (IllegalArgumentException e) {
      System.out.println("Caught IllegalArgumentException: " + e.getMessage());
    }
  }

  public static void causeNullPointerException() throws NullPointerException {
    String str = null;
    str.length(); // Provoca NullPointerException
  }

  public static void causeArrayIndexOutOfBoundsException() {
    int[] arr = new int[5];
    int value = arr[10]; // Provoca ArrayIndexOutOfBoundsException
  }

  public static void causeClassCastException() {
    Object x = new Integer(0);
    String y = (String) x; // Provoca ClassCastException
  }

  public static void causeIllegalArgumentException() {
    int age = -1;
    setAge(age); // Provoca IllegalArgumentException
  }

  public static void setAge(int age) {
    if (age < 0) {
      throw new IllegalArgumentException("Age cannot be negative");
    }
  }
}