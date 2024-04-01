package Parcial_I.Tema_I.EjerciciosC1C2C3.EjercicioI.Tipo_Parcial;

import java.util.Scanner;

public class C1 {
  public static void main(String[] args) {

    int vendedores, cantidadAsignada, cantidadRetornada, porcentajeDeVenta;
    int vendedorGanador = 0;
    int vendedoresSegundoPremio = 0;
    int mejorCantidad = 0;
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Cuantos vendedores tiene la empresa?");
    vendedores = in.nextInt();
    
   

    for(int i = 0 ; i<vendedores ; i++){
      System.out.println("Cuantos productos le fueron asignados al vendedor numero " + (i + 1) + "?");
      cantidadAsignada = in.nextInt();
      System.out.println("Cuantos productos retorno al final de la jornada?\n");
      cantidadRetornada = in.nextInt();
      porcentajeDeVenta = ((cantidadRetornada * 100) / cantidadAsignada);
      if(porcentajeDeVenta <= 25){
        if(porcentajeDeVenta > mejorCantidad){
          vendedorGanador = i + 1;
          mejorCantidad = porcentajeDeVenta;
        }
        if(porcentajeDeVenta < 10){
          vendedoresSegundoPremio++;
        }
      }
    }
    in.close();
    System.out.println("El mejor vendedor es el numero: " + vendedorGanador + ".");
    System.out.println("El porcentaje de los vendedores que ganaron el segundo premio es de: " + (vendedoresSegundoPremio * 100 / vendedores) + "%");
  }
}
