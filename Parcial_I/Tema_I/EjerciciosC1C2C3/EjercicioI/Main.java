package Parcial_I.Tema_I.EjerciciosC1C2C3.EjercicioI;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  
  Scanner entry = new Scanner(System.in);  

  int n = 120;
  Person[] worker = new Person[n]; 

  double grossSalary;


  System.out.println("Welcome to the programn of net salary calculations");

  for(int i = 0; i < n ; i++){

    System.out.println("Enter the gross salary of worker " + (i + 1) + ":");

    grossSalary = entry.nextDouble();
    worker[i] = new Person(grossSalary);
    System.out.println("The net salary of the worker is: " + worker[i].getNetSalary() +"bs. \n");

  }

  entry.close();
  }
}