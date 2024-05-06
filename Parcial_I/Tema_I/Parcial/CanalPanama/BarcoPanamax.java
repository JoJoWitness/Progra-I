package Parcial_I.Tema_I.Parcial.CanalPanama;

public class BarcoPanamax extends Barco{

  private double carga;
  private String cargaAlimentos;
  
  public BarcoPanamax(){
    super( "", "");
    this.carga = 0.0;
    this.cargaAlimentos = "";
  }

  public BarcoPanamax(String nombre, String tipoDeBarco, double carga, String cargaAlimentos) {
    super(nombre, tipoDeBarco);
    this.carga = carga;
    this.cargaAlimentos = cargaAlimentos;
  }

  public double getCarga() {
    return carga;
  }

  public void setCarga(double carga) {
    this.carga = carga;
  }

  public String getCargaAlimentos() {
    return cargaAlimentos;
  }

  public void setCargaAlimentos(String cargaAlimentos) {
    this.cargaAlimentos = cargaAlimentos;
  }
  
  @Override
  public double calcularPagoDelBarco() {
    if(cargaAlimentos.equals("SI")){
      setPeajeAPagar(carga*100 + 10000);
      return carga*100 + 10000;
      
    }
    else{
      setPeajeAPagar(carga*100);
      return carga*100;
    }
  }

  @Override
  public String estiloNombreBarco(int n) {
    if(n==1){
      return nombre.toUpperCase().replace(" ", "_");
    }  
    else if(n==0){
      return nombre.toLowerCase().replace(" ", "_");
    }
    else{
      return nombre.replace(" ", "_");
    }
  }
  
}
