package Parcial_I.Tema_I.TipoParcial.Gandolas;

public class GandolaNacional extends Gandola{
  String responsableDeLaMercancia;

  public GandolaNacional(String matricula, String tipoDeMercancia, String origen, long pesoDeLaCarga, long valorDeLaCarga, String responsableDeLaMercancia) {
    super(matricula, tipoDeMercancia, origen, pesoDeLaCarga, valorDeLaCarga);
    this.responsableDeLaMercancia = responsableDeLaMercancia;
  }

  @Override
  public void mostrarData() {
    super.mostrarData();
    System.out.println("Responsable de la mercancia: " + responsableDeLaMercancia);
  
  }
  
}
