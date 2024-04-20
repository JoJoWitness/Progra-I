package Parcial_I.Tema_I.EjerciciosC5C6;

public class VendedorFranelas extends Vendedor{
  String product, color;
  int talla;
  public VendedorFranelas(String nombre, int id, int cantidadAsignada, int cantidadVendida, int talla, String color){
    super(nombre, id, cantidadAsignada, cantidadVendida);
    this.product = "Franelas";
    this.color = color;
    this.talla = talla;
  }

  @Override
  public void mostrarData(){
    System.out.println("Nombre: " + getNombre());
    System.out.println("ID: " + getId());
    System.out.println("Producto: " + getProduct() );
    System.out.println("Color: " + getColor() );
    System.out.println("Talla: " + getTalla());
    System.out.println("Cantidad asignada: " + getCantidadAsignada());
    System.out.println("Cantidad vendida: " + getCantidadVendida());
    System.out.println("Cantidad restante: " + getCantidadSobrante());
  }

  public String getProduct() {
    return product;
  }

  public String getColor() {
    return color;
  }

  public int getTalla() {
    return talla;
  }
}
