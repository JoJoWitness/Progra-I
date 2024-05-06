package Parcial_I.Tema_I.TipoParcial.Gandolas;

import Parcial_I.Tema_I.TipoParcial.Vehiculo.Vehiculo;

public class Gandola extends Vehiculo{

  String matricula, tipoDeMercancia, origen;
  long pesoDeLaCarga, valorDeLaCarga;
  
  public Gandola(String matricula, String tipoDeMercancia, String origen,long pesoDeLaCarga, long valorDeLaCarga) {
    this.matricula = matricula;
    this.tipoDeMercancia = tipoDeMercancia;
    this.origen = origen;
    this.pesoDeLaCarga = pesoDeLaCarga;
    this.valorDeLaCarga = valorDeLaCarga;
  }

  @Override
  public void mostrarData() {
    System.out.println("Origen: " + origen);
    System.out.println("Matricula: " + matricula);
    System.out.println("Tipo de mercancia: " + tipoDeMercancia);
    System.out.println("Peso de la carga: " + pesoDeLaCarga);
    System.out.println("Valor de la carga: " + valorDeLaCarga);
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getTipoDeMercancia() {
    return tipoDeMercancia;
  }

  public void setTipoDeMercancia(String tipoDeMercancia) {
    this.tipoDeMercancia = tipoDeMercancia;
  }

  public long getPesoDeLaCarga() {
    return pesoDeLaCarga;
  }

  public void setPesoDeLaCarga(long pesoDeLaCarga) {
    this.pesoDeLaCarga = pesoDeLaCarga;
  }

  public long getValorDeLaCarga() {
    return valorDeLaCarga;
  }

  public void setValorDeLaCarga(long valorDeLaCarga) {
    this.valorDeLaCarga = valorDeLaCarga;
  }

  public String getOrigen() {
    return origen;
  }

  public void setOrigen(String origen) {
    this.origen = origen;
  }
}
