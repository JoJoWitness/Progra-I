package Parcial_I.Tema_I.EjerciciosC1C2C3.EjercicioII;

import java.util.Scanner;

public class Main {
  
public static void main(String[] args) {
  Scanner entry = new Scanner(System.in);  

  int n;
 
  int minutes;

  System.out.println("Welcome to the call prining programn");
  System.out.println("How many calls you have on the list?");
  n = entry.nextInt();

  Call[] phoneCall = new Call[n];

  System.out.println("\nBefore starting the programn, it's important that you take into account the following: ");
  System.out.println("Every minute is round up, even if is less than 30 seconds.");
  System.out.println("Example: a call of 1:22 minutes, is equal to 2:00 minutes.\n");

  for(int i = 0; i < n; i++){
    System.out.println("Enter the duration of the call number " + (i + 1) + ":");
    minutes = entry.nextInt();
    phoneCall[i] = new Call(minutes);
    System.out.println("The price of that call is: " + phoneCall[i].getPrice() + "bs. \n");
  }
}

}
