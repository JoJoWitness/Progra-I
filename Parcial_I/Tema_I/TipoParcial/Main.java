package Parcial_I.Tema_I.TipoParcial;

import java.util.Scanner;

import Parcial_I.Tema_I.TipoParcial.Gandolas.Gandola;
import Parcial_I.Tema_I.TipoParcial.Gandolas.GandolaExtranjera;
import Parcial_I.Tema_I.TipoParcial.Gandolas.GandolaNacional;

public class Main {

    
    public static int cargarDatos(Gandola gandolasRegistradas[], int n){
      
      int arrayBandera = 0, bandera;

      String matricula, tipoDeMercancia, origen, poliza, direccion, responsableDeLaMercancia, pesoDeLaCargaString, valorDeLaCargaString, banderaString;
      long pesoDeLaCarga, valorDeLaCarga; 

      Scanner entrada = new Scanner(System.in);

      for(int i = 0; i <n; i++){

        
        System.out.println("");
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
        pesoDeLaCargaString = entrada.nextLine();
        pesoDeLaCarga = Long.parseLong(pesoDeLaCargaString);
        System.out.println("Ingrese el valor de la carga en bolivares");
        valorDeLaCargaString = entrada.nextLine();
        valorDeLaCarga = Long.parseLong(valorDeLaCargaString);
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
        banderaString = entrada.nextLine();
        bandera = Integer.parseInt(banderaString);
        if (bandera != 1){
          arrayBandera = i + 1;
          break;
        }
    }  
  
    entrada.close();
      return arrayBandera;
    }

    public static void mostrarDatosDeGandolasExtranjeras(Gandola gandolasRegistradas[], int arrayBandera){

      int valorTotalDeLaMercanciaQueIngresa = 0;
      System.out.println("");
      System.out.println("Matricula     Peso(Toneladas)     Tipo de mercancia");
      for(int i = 0; i<arrayBandera; i++){
        if(gandolasRegistradas[i].getOrigen().equalsIgnoreCase("E")){
          System.out.println(gandolasRegistradas[i].getMatricula() + "     " + gandolasRegistradas[i].getPesoDeLaCarga() + "     " + gandolasRegistradas[i].getTipoDeMercancia());
          valorTotalDeLaMercanciaQueIngresa += gandolasRegistradas[i].getValorDeLaCarga();
        }
      }
      System.out.println("El valor total de la mercancia que ingresa al pais es de: " + valorTotalDeLaMercanciaQueIngresa + "bs");
      System.out.println("");
    }

    public static void pesoPromedioDeLasGandolas(Gandola gandolasRegistradas[], int arrayBandera){
      long promedioDePesoDeGandolasNacionales, promedioDePesoDeGandolasExtranjeras;
      int sumatoriaDePesoDeGandolasNacionales =0, cantidaDeGandolasNacionales = 0, sumatoriaDePesoDeGandolasExtranjeras = 0, cantidaDeGandolasExtranjeras = 0;
      
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

      promedioDePesoDeGandolasNacionales = sumatoriaDePesoDeGandolasNacionales/cantidaDeGandolasNacionales;
      promedioDePesoDeGandolasExtranjeras = sumatoriaDePesoDeGandolasExtranjeras/cantidaDeGandolasExtranjeras;
  
      if(promedioDePesoDeGandolasExtranjeras > promedioDePesoDeGandolasNacionales){
        System.out.println("Esta ingresando mas mercancia en promedio a Venezuela");
      }
      else if(promedioDePesoDeGandolasExtranjeras < promedioDePesoDeGandolasNacionales){
        System.out.println("Esta ingresando mas mercancia en promedio a Colombia");
      }
      else{
        System.out.println("Esta ingresando la misma cantidad de mercancia en promedio a ambos paises");
      }
      System.out.println("");
    }

    public static void mostrarDatosDeUnaGandola(Gandola gandolasRegistradas[], int arrayBandera){
      String matriculaABuscar, banderaString;
      int bandera=0 ;
      Scanner in = new Scanner(System.in);
      
      System.out.println("Desea ver los datos de una gandola en especifico?");
      System.out.println("Ingrese 1 para ver los datos, presione cualquier otro numero para salir");
      banderaString = in.nextLine();
      bandera = Integer.parseInt(banderaString);
      while(bandera == 1){  
        System.out.println("Ingrese la matricula de la gandola que desea ver");
        matriculaABuscar = in.nextLine();
        for(int i = 0; i<arrayBandera; i++){
          if(gandolasRegistradas[i].getMatricula().equalsIgnoreCase(matriculaABuscar)){
            gandolasRegistradas[i].mostrarData();
            break;
          }
          if(i==arrayBandera-1){
            System.out.println("No se encontro la gandola con la matricula ingresada");
          }
        }

        System.out.println("Ingrese 1 para continuar buscando gandolas, si desea salir, ingrese cualquier otro numero.");
        banderaString = in.nextLine();
        bandera = Integer.parseInt(banderaString);
        if(bandera != 1){
          break;
        }
      }
      in.close();
    }

    public static void main(String[] args) {

      int arrayBandera = 0;      
      // Al no concoer la cantidad que entrara al dia, se crea un array de 100 indices de manera predeterminada;
      int n= 100;
      
      Gandola gandolasRegistradas[] = new Gandola[n];

      System.out.println("");
      System.out.println("Bienvenido al sistema de aduanas de San Antonio del Tachira");
      System.out.println("A continuacion se la va a pedir ingresar una serie de datos para registrar las gandolas que entran o salen del pais");
      System.out.println("Antes de empezar, unas indicaciones de como ingresar los datos:");
      System.out.println("Para una gandola nacional ingrese como dato: V o v");
      System.out.println("Para una gandola extranjera ingrese como dato: E o e");
      System.out.println("Solo se aceptan los siguientes tipo de mercancia: Alimentos, Metales, Vehiculos, Varios");
      System.out.println("");
      System.out.println("----------------------------------------------------------------------------------------------------------------------");

    arrayBandera = cargarDatos(gandolasRegistradas, n);
     
    mostrarDatosDeGandolasExtranjeras(gandolasRegistradas, arrayBandera);
        
    pesoPromedioDeLasGandolas(gandolasRegistradas, arrayBandera);  

    mostrarDatosDeUnaGandola(gandolasRegistradas, arrayBandera);

    
  }

}
