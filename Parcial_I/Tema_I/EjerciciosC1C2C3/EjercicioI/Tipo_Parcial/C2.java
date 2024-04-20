package Parcial_I.Tema_I.EjerciciosC1C2C3.EjercicioI.Tipo_Parcial;

import java.util.Scanner;

public class C2 {
  public static void main(String[] args) {
    String nombre, nombreGanador = "Nadie";
    int area, pendiente, precio, ofertas, areaGanador = 0, pendienteGanador = 0, precioGanador = 100000000;
    float distancia, distanciaGanador = 0;

    Scanner in = new Scanner(System.in);
    
    System.out.println("Cuantas ofertas hay?");
    ofertas = in.nextInt();

    for(int i = 0; i < ofertas ; i++){
      System.out.println("\nCual es el nombre del ofertante numero " +  (i+1) + "?");
      nombre = in.next();
      System.out.println("Cual es el area de la propiedad en metros cuadrados?");
      area = in.nextInt();
      System.out.println("Cual es la distancia al centro de la ciudad en kilometros?");
      distancia = in.nextFloat();
      System.out.println("Cual es la pendiente de la propiedad en porcentaje?");
      pendiente = in.nextInt();
      System.out.println("Cual es el precio de la propiedad?");
      precio = in.nextInt();

      if(area >= 1200 && distancia >= 4 && distancia <=5 && pendiente <=5){
        if(precio < precioGanador){
          nombreGanador = nombre;
          areaGanador = area;
          distanciaGanador = distancia;
          pendienteGanador = pendiente;
          precioGanador = precio;
        }
      }
    }
    
    in.close();

    System.out.println("La mejor oferta fue de parte de : " + nombreGanador + ".");
    System.out.println("La propiedad tiene un area de: " + areaGanador + " metros cuadrados.");
    System.out.println("La propiedad esta a: " + distanciaGanador + " kilometros del centro de la ciudad.");
    System.out.println("La pendiente de la propiedad es de: " + pendienteGanador + "%.");
    System.out.println("El precio de la propiedad es de: " + precioGanador + " bolivares.");
  }
}