package Parcial_I.Tema_I.Parcial.Principal;

import Parcial_I.Tema_I.Parcial.CanalPanama.Barco;
import Parcial_I.Tema_I.Parcial.CanalPanama.BarcoPanamax;
import Parcial_I.Tema_I.Parcial.CanalPanama.BarcoPostPanamax;
import Parcial_I.Tema_I.Parcial.Data.datos_barcos;

public class Implementacion {
  
  private static double cargarDatos(Barco vBarcos[], int n){
    double totalPeaje=0;

    datos_barcos datos = new datos_barcos();
    for(int i = 0; i < n; i++){
      if(datos.devolver_barcos(i) != ""){
        String tempString = datos.devolver_barcos(i);
        String informacionDividida[] = tempString.split(",");
      
        if(informacionDividida[1].equals("P")){
          vBarcos[i] = new BarcoPostPanamax(informacionDividida[0], informacionDividida[1], 
                                            Integer.parseInt(informacionDividida[2]),informacionDividida[3]);
          
          totalPeaje += vBarcos[i].calcularPagoDelBarco();
        }
        if(informacionDividida[1].equals("C")){
          vBarcos[i] = new BarcoPanamax(informacionDividida[0],informacionDividida[1], 
                                        Double.parseDouble(informacionDividida[2]),informacionDividida[3]);
          totalPeaje += vBarcos[i].calcularPagoDelBarco();
        }
        
        
      }
      else{
        break;
      }
    }

    return totalPeaje;
  }

  private static boolean mostrarDatos(Barco vBarcos[], int n, double totalPeaje){
    boolean existenBarcosVenezolanos = false;
    
    System.out.println("");
    System.out.println("----------------------------------------------------------------------------------");
    System.out.println("Barco                                     Monto a pagar");
    System.out.println("----------------------------------------------------------------------------------");
    for(int i = 0; i < n; i++){
      if(vBarcos[i] != null){
       if(vBarcos[i] instanceof BarcoPostPanamax){
          BarcoPostPanamax barco = (BarcoPostPanamax) vBarcos[i];
          System.out.println(barco.estiloNombreBarco() +"                                "+ barco.getPeajeAPagar());
          if(barco.getOrigen().equalsIgnoreCase("VENEZUELA")){
            existenBarcosVenezolanos = true;
          }
        }
       else{
          BarcoPanamax barco = (BarcoPanamax) vBarcos[i];
          System.out.println(barco.estiloNombreBarco(1) +"                                "+ barco.getPeajeAPagar());
      };
    }
  }

    System.out.println("----------------------------------------------------------------------------------");
    System.out.println("El monto recaudado por los peajes fue de: $" + totalPeaje);
    System.out.println("----------------------------------------------------------------------------------");
    return existenBarcosVenezolanos;
  }
  
  private static void mostrarBarcosVenezolanos(Barco vBarcos[], int n, boolean existenBarcosVenezolanos){
    System.out.println("");
    System.out.println("----------------------------------------------------------------------------------");
    if(existenBarcosVenezolanos){
      System.out.println("Los barcos Venezolanos que fueron registrados son:");
      System.out.println("----------------------------------------------------------------------------------");
      for(int i = 0; i<n; i++){
        if(vBarcos[i] != null){
          if(vBarcos[i] instanceof BarcoPostPanamax){
            BarcoPostPanamax barco = (BarcoPostPanamax) vBarcos[i];
            if(barco.getOrigen().equalsIgnoreCase("Venezuela")){
                System.out.println("Nombre: " + barco.getNombre() + ", Tipo: Crusero, Capacidad de Pasajeros: " + barco.getPasajeros() + ".");
            }
          }
        }
      }
    
    }
    else{
      System.out.println("No se registro ningun barco venezolano");
    }
    System.out.println("----------------------------------------------------------------------------------");
    
  }
  
  private static void calcularPorcentajeDeBarcosCarguerosDeAliemtnos(Barco vBarcos[], int n){
    int totalBarcosCargueros = 0;
    int totalBarcosCarguerosDeAlimentos = 0;
    
    System.out.println("");
    System.out.println("----------------------------------------------------------------------------------");
      for(int i = 0; i<n; i++){
        if(vBarcos[i] != null){
          if(vBarcos[i] instanceof BarcoPanamax){
            totalBarcosCargueros++;
            BarcoPanamax barco = (BarcoPanamax) vBarcos[i];
            if(barco.getCargaAlimentos().equalsIgnoreCase("SI")){
              totalBarcosCarguerosDeAlimentos++;
            }
          }
        }
      }
    System.out.println("El porcentaje de barcos cargueros que transportan alimentos es de: " + (totalBarcosCarguerosDeAlimentos*100)/totalBarcosCargueros + "%");
    System.out.println("----------------------------------------------------------------------------------");
  }
  public static void main(String[] args) {
    
    //Valor por defecto para la creacion del array de barcos
    int n = 100;
    double totalPeaje;
    boolean existenBarcosVenezolanos;
    

    // Create an instance of datos_barcos
    
    Barco vBarcos[] = new Barco[n];

    totalPeaje = cargarDatos(vBarcos, n);
    existenBarcosVenezolanos = mostrarDatos(vBarcos, n, totalPeaje);
    mostrarBarcosVenezolanos(vBarcos, n, existenBarcosVenezolanos);
    calcularPorcentajeDeBarcosCarguerosDeAliemtnos(vBarcos, n);

  }
}
