package Parcial_I.Tema_I.EjerciciosC1C2C3.EjercicioI;

public class Person {
  
  double netSalary, grossSalary;

  public Person(double grossSalary2) {
    this.grossSalary = grossSalary2;

    if (grossSalary2 < 950){
      this.netSalary = grossSalary2*0.95;
    }
    else if (grossSalary2 < 1500 && grossSalary2 >= 950){
      this.netSalary = grossSalary2*0.9;
    }
   
    else{
      this.netSalary = grossSalary2*0.85;
    }
  }

  
  public double getNetSalary() {
    return netSalary;
  }


};
