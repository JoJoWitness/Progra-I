package Parcial_I.Tema_I.TipoParcial.Gandolas;

public class GandolaExtranjera extends Gandola {
 
  String poliza, direccion;

  public GandolaExtranjera(String matricula, String tipoDeMercancia, String origen, long pesoDeLaCarga, long valorDeLaCarga, String poliza, String direccion) {
    super(matricula, tipoDeMercancia, origen, pesoDeLaCarga, valorDeLaCarga);
    this.poliza = poliza;
    this.direccion = direccion;
  }

  @Override
  public void mostrarData() {
    super.mostrarData();
  }
}
