package Parcial_I.Tema_I.EjerciciosC1C2C3.EjercicioIII;

public class Orange {
  private int id;
  @SuppressWarnings("unused")
  private double diameter;
  @SuppressWarnings("unused")
  private double weight;
  private String type;

  public Orange(int id, double diameter, double weight){
    this.id = id;
    this.diameter = diameter;
    this.weight = weight;

    setType(diameter, weight);
  }

  private void setType(double diameter, double weight){
    if(weight > 450 
      && (diameter >= 9 && diameter <= 12)){
      type = "Premiun";
    }
    else if((weight > 300 && weight < 450) 
        && (diameter >= 8 && diameter <= 11)){
      type = "Extra";
    }
    else if(weight < 300 
      && (diameter >= 7 && diameter <= 9)){
      type = "Natural";
    }
    else{
      type = "Invalid";
    }
  }

  public int getId(){
    return id;
  }

  public String getType(){
    return type;
  }

 public void getOrangeData(){
    System.out.println("Orange Type: " + type);
 }

 


}
