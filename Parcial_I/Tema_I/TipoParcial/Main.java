package Parcial_I.Tema_I.TipoParcial;

import java.util.Scanner;

import Parcial_I.Tema_I.TipoParcial.Gandolas.Gandola;
import Parcial_I.Tema_I.TipoParcial.Gandolas.GandolaExtranjera;
import Parcial_I.Tema_I.TipoParcial.Gandolas.GandolaNacional;

public class Main {

    public int cargarDatos(int n){
      String matricula, tipoDeMercancia, origen, poliza, direccion, responsableDeLaMercancia;
      long pesoDeLaCarga, valorDeLaCarga;
      int arrayBandera;

      Scanner entrada = new Scanner(System.in);

      for(int i = 0; i <n; i++){

        System.out.println("Cual es la matricula del vehiculo?");
        matricula = entrada.nextLine();
        System.out.println("Cual es el tipo de Mercancia?");
        while (true) {
          tipoDeMercancia = entrada.nextLine();
          if(tipoDeMercancia.equalsIgnoreCase("Alimentos") || tipoDeMercancia.equalsIgnoreCase("Metales") || tipoDeMercancia.equalsIgnoreCase("Vehiculos") || tipoDeMercancia.equalsIgnoreCase("Varios")){
            break;
          }
          System.out.println("Por favor, ingrese un valor correcto.");
        }
        System.out.println("Ingrese el peso en toneladas de la carga");
        pesoDeLaCarga = entrada.nextLong();
        System.out.println("Ingrese el valor de la carga en bolivares");
        valorDeLaCarga = entrada.nextLong()
        System.out.println("Ingrese el pais de origen de la carga");
        while(true){
          origen = entrada.nextLine();
          if(origen.equalsIgnoreCase("V") || origen.equalsIgnoreCase("E")){
            break;
          }
          System.out.println("Por favor, ingrese un valor correcto.");
        }

        if(origen.equalsIgnoreCase("V")){
          System.out.println("Ingrese el nombre del responsable de la mercancia");
          responsableDeLaMercancia = entrada.nextLine();

          gandolasRegistradas[i] = new GandolaNacional(matricula, tipoDeMercancia, origen, pesoDeLaCarga, valorDeLaCarga, responsableDeLaMercancia);
        }
        else{
          System.out.println("Ingrese el numero de poliza de la carga.");
          poliza = entrada.nextLine();
          System.out.println("Ingrese la direccion de la carga.");
          direccion = entrada.nextLine();

          gandolasRegistradas[i] = new GandolaExtranjera(matricula, tipoDeMercancia, origen, pesoDeLaCarga, valorDeLaCarga, poliza, direccion);
        }

        System.out.println("Desea ingresar otra gandola?");
        System.out.println("Ingrese 1 para continuar, si desea salir, ingrese cualquier otro numero.");
        bandera = entrada.nextInt();
        if (bandera != 1){
          arrayBandera = i;
          break;
        }
    }

      entrada.close();
    return arrayBandera;
    }

    public static void main(String[] args) {

     
      int bandera, arrayBandera, sumatoriaDePesoDeGandolasNacionales, cantidaDeGandolasNacionales, sumatoriaDePesoDeGandolasExtranjeras, cantidaDeGandolasExtranjeras, precioTotalDeLaMercanciaQueIngresa;
      
      // Al no concoer la cantidad que entrara al dia, se crea un array de 100 indices de manera predeterminada;
      int n= 100;
      
      
      Gandola gandolasRegistradas[] = new Gandola[n];

      

      System.out.println("Bienvenido al sistema de aduanas de San Antonio del Tachira");
      System.out.println("A continuacion se la va a pedir ingresar una serie de datos para registrar las gandolas que entran o salen del pais");
      System.out.println("Antes de empezar, unas indicaciones de como ingresar los datos:");
      System.out.println("Para una gandola nacional ingrese como dato: V o v");
      System.out.println("Para una gandola extranjera ingrese como dato: E o e");
      System.out.println("Solo se aceptan los siguientes tipo de mercancia: Alimentos, Metales, Vehiculos, Varios");
      System.out.println("");
      System.out.println("----------------------------------------------------------------------------------------------------------------------");
      System.out.println("");

      // Carga de datos

      
  
    //Mostrar solo los datos de las Gandolas
    System.out.println("Matricula     Peso(Toneladas)     Tipo de mercancia");
    for(int i = 0; i<arrayBandera; i++){
      if(gandolasRegistradas[i].getOrigen().equalsIgnoreCase("E")){
        System.out.println(gandolasRegistradas[i].getMatricula() + "     " + gandolasRegistradas[i].getPesoDeLaCarga() + "     " + gandolasRegistradas[i].getTipoDeMercancia());
      }
    }



    // Peso promedio de las gandolas por pais
    for(int i = 0; i<arrayBandera; i++){
      if(gandolasRegistradas[i].getOrigen().equalsIgnoreCase("V")){
        cantidaDeGandolasNacionales++;
        sumatoriaDePesoDeGandolasNacionales += gandolasRegistradas[i].getPesoDeLaCarga();
      }
      else{
        cantidaDeGandolasExtranjeras++;
        sumatoriaDePesoDeGandolasExtranjeras += gandolasRegistradas[i].getPesoDeLaCarga();

      }
    }
  

  }

}
