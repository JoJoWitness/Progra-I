package Parcial_I.Tema_I.Parcial.CanalPanama;

public class BarcoPostPanamax extends Barco{

  private double tempPasajeros, tempOrigen;
  private String origen;
  private int pasajeros;
  

  public BarcoPostPanamax(){
    super( "", "");
    this.pasajeros = 0;
    this.origen = "";
  }
  public BarcoPostPanamax(String nombre, String tipoDeBarco, int pasajeros, String origen) {
    super(nombre, tipoDeBarco);
    this.pasajeros = pasajeros;
    this.origen = origen;
  }
  
  @Override
  public double calcularPagoDelBarco() {
    if(pasajeros < 2000){
      tempPasajeros = 150000;
    }
    else{
      tempPasajeros = 180000;
    }

    if(origen.equalsIgnoreCase("USA")){
      tempOrigen = 3000;
    }
    else if(origen.equalsIgnoreCase("EUROPA")){
      tempOrigen = 1500;
    }
    else{
      tempOrigen = 0;
    }
    setPeajeAPagar(tempPasajeros+tempOrigen);
    return (tempPasajeros+tempOrigen);

  };

  public int getPasajeros() {
    return pasajeros;
  };
  public void setPasajeros(int pasajeros) {
    this.pasajeros = pasajeros;
  };
  public String getOrigen() {
    return origen;
  };
  public void setOrigen(String origen) {
    this.origen = origen;
  };
  
  public String estiloNombreBarco(){
    return nombre + "_" + pasajeros;
  }

}
