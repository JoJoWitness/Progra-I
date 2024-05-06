package Parcial_I.Tema_I.Parcial.CanalPanama;

public abstract class Barco {
  protected String nombre, tipoDeBarco;
  protected double peajeAPagar;
  
  public Barco(){
    nombre= "";
    tipoDeBarco="";
  }

  public Barco(String nombre, String tipoDeBarco){
    this.nombre=nombre;
    this.tipoDeBarco=tipoDeBarco;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTipoDeBarco() {
    return tipoDeBarco;
  }

  public void setTipoDeBarco(String tipoDeBarco) {
    this.tipoDeBarco = tipoDeBarco;
  }

  public String estiloNombreBarco(int n){
    if(n==1){
      return nombre.toUpperCase();
    }
    else if(n==0){
      return nombre.toLowerCase();
    }
    else{
      return nombre;
    }
  };

  public abstract double calcularPagoDelBarco();

  public double getPeajeAPagar() {
    return peajeAPagar;
  }

  public void setPeajeAPagar(double peajeAPagar) {
    this.peajeAPagar = peajeAPagar;
  }
  
}
  
