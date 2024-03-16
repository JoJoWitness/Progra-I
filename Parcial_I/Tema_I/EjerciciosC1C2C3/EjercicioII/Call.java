package Parcial_I.Tema_I.EjerciciosC1C2C3.EjercicioII;

public class Call {
  int minutes, price;

  public Call(int minutes){
    this.minutes = minutes;
    if(minutes < 3){
      this.price = 28;
    }
    else{
      this.price = 28 + (minutes-3)*16;
    }
  };

  public int getPrice() {
    return price;
  }
}
