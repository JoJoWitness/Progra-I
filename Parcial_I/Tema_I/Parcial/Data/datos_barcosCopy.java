package Parcial_I.Tema_I.Parcial.Data;

public class datos_barcosCopy {

  private String barcos[] ={
    "El sol dorado,P,1800,EUROPA",
    "El transportador,C,40000,SI",
    "La Emperatriz,C,80000,NO",
    "El Emperador,P,2000,USA",
    "La Pinta,C,5000,NO",
    "La Niña,C,6000,NO",
    "La Santa María,P,1000,VENEZUELA",
  };

  public String devolver_barcos(int indice){
    return barcos[indice];
  }



  
}
