package Parcial_I.Tema_I.EjerciciosC5C6;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner entry  = new Scanner(System.in);

    int n, flag, producto, cantidadAsignada, cantidadVendida, numero, id, talla;
    String nombre, marca, color;

    System.out.println("Bienvenido, cuantos trabajadores tiene la compañia?");
    n = entry.nextInt();
    

    Vendedor vendedores[] = new Vendedor[n];

    for(int i=0; i<n ; i++){
      
      flag = 1;

      while(flag == 1){
        System.out.println("Que producto vende el vendedor?");
        System.out.println("0 - Zapatos");
        System.out.println("1 - Franelas");
        producto = entry.nextInt();
        System.out.println("Nombre del vendedor: ");
        nombre = entry.next();
        System.out.println("Id del vendedor: ");
        id = entry.nextInt();
        System.out.println("Cantidad asiganda: ");
        cantidadAsignada = entry.nextInt();
        System.out.println("Cantidad vendida: ");
        cantidadVendida = entry.nextInt();
          
          if(producto == 0){
            System.out.println("Marca del producto: ");
            marca = entry.next();
            System.out.println("Numero del producto: ");
            numero = entry.nextInt();
            vendedores[i] = new VendedorZapatos(nombre, id, cantidadVendida, cantidadAsignada,numero, marca);
            flag = 0;
          }
          else if(producto == 1){
            System.out.println("Color del producto: ");
            color = entry.next();
            System.out.println("Talla del producto: ");
            talla = entry.nextInt();
            vendedores[i] = new VendedorFranelas(nombre, id, cantidadVendida, cantidadAsignada,talla,color);
            flag = 0;
          }
          else{
            System.out.println("Ingrese un numero valido");
        }

    }

   

  }

  for(Vendedor vendedor: vendedores){
    vendedor.mostrarData();
   }

   entry.close();
}
}
