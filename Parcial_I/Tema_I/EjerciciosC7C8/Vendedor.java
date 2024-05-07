package Parcial_I.Tema_I.EjerciciosC7C8;

public abstract class Vendedor {
  private String nombre;
  private int id, cantidadAsignada, cantidadVendida;

  public Vendedor(String nombre, int id, int cantidadAsignada, int cantidadVendida) {
    this.nombre = nombre;
    this.id = id;
    this.cantidadAsignada = cantidadAsignada;
    this.cantidadVendida = cantidadVendida;
  }
  public int getCantidadSobrante(){
    return (getCantidadAsignada() - getCantidadVendida());
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getCantidadAsignada() {
    return cantidadAsignada;
  }
  public int getCantidadVendida() {
    return cantidadVendida;
  }

  public void mostrarData(){
    System.out.println("Nombre: " + getNombre());
    System.out.println("Id" + getId());
  }




  
}
