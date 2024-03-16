package Parcial_I.Tema_I.EjerciciosC1C2C3.EjercicioIII;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner entry = new Scanner(System.in);  

      int n, flag = 1, seeOrange, orangeId;
      double totalOranges = 0, discardedOranges = 0, premiumOranges = 0, extraOranges = 0, naturalOranges = 0;


      System.out.println("Welcome to the Orange program");
      System.out.println("How many oranges you have on the list?");
      n = entry.nextInt();

      Orange[] orangeArray = new Orange[n];

      for(int i = 0; i < n; i++){
        int id;
        double diameter;
        double weight;

        System.out.println("Enter the id of the orange number " + (i + 1) + ":");
        id = entry.nextInt();
        System.out.println("Enter the weight of the orange number " + (i + 1) + ":");
        weight = entry.nextDouble();
        System.out.println("Enter the diameter of the orange number " + (i + 1) + ":");
        diameter = entry.nextDouble();
        orangeArray[i] = new Orange(id, diameter, weight);
        
        totalOranges++;

        System.out.println("This orange is of type: " + orangeArray[i].getType() + "\n");

    

        switch (orangeArray[i].getType()) {
          case "Premiun":
            premiumOranges++;
            break;
          case "Extra":
            extraOranges++;
            break;
          case "Natural":
            naturalOranges++;
            break;
          default:
            discardedOranges++;
            break;
        };

      System.out.println(premiumOranges);
      System.out.println(extraOranges);
      System.out.println(naturalOranges);
      System.out.println(discardedOranges);
      
      }

      System.out.println("The percentage of discarded oranges is: " + (discardedOranges/totalOranges)*100 + "%");
  

      while (flag == 1) {
        System.out.println("Do you want to search an Orange? type 1 for yes; type 0 for no.");
        seeOrange = entry.nextInt();
        if(seeOrange == 1){
          System.out.println("Enter the id of an orange");
          orangeId = entry.nextInt();
          for(int i = 0; i < n; i++){
            if(orangeArray[i].getId() == orangeId){
              orangeArray[i].getOrangeData();
              break;
            };
            if(i == n - 1){
              System.out.println("The orange with the id " + orangeId + " was not found.");
            }
        }
      }
        else if(seeOrange == 0){
          flag = 0;
        }
        else{
          System.out.println("Invalid option, type a proper option.");
        }
      }

      System.out.println("The total earning of the gathering are: " + (premiumOranges*3 + extraOranges*2 + naturalOranges*1 - discardedOranges*1.5) + "USD");

      
     
      
    }
  
}
