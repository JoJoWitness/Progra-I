package Parcial_I.Tema_I.Parcial.Data;

public class datos_barcos {

  private final String barcos[] ={
    "The Jackdaw,P,1200,USA",
    "The Morringan,P,1000,USA",
    "The Aquila,P,1500,USA",
    "The Pillar Of Autumn,C,8000,NO",
    "The Infinity,C,10000,NO",
    "The Forward Unto Dawn,C,5000,SI",
    "The Spirit Of Fire,C,2000,SI",
    "In Amber Clad,P,2000,VENEZUELA",
    "The Shadow Of Intent,P,3000,JAPON",
    "The Truth And Reconciliation,P,4000,EUROPA",
    "The Long Night Of Solace,P,3000,EUROPA",
    "High Charity,C,15000,NO",
    "The Unyielding Hierophant,C,500,NO",
    "The Savannah,P,1000,COLOMBIA",
    "La Pelusa,P,2500,TURQUIA",
    "La Campana,P,1600,TURQUIA",
    "The Composer,P,1200,BRASIL",
    "The Song of Lucy,P,1500,VENEZUELA",
    "The migthy Ryuk,C,55000,NO",
    "La Perrarina,C,10000,SI",
    "Cuatro Zarigueyas,P,1200,MEXICO",
    ""
  };

  public String devolver_barcos(int indice){
    return barcos[indice];
  }

}
