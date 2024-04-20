package Parcial_I.Tema_I.EjerciciosC5C6;

public class VendedorZapatos extends Vendedor {
  private String product, marca;
  private int numero;

  public VendedorZapatos(String nombre, int id, int cantidadAsignada, int cantidadVendida, int numero, String marca){
    super(nombre, id, cantidadAsignada, cantidadVendida);
    this.product = "Zapatos";
    this.marca = marca;
    this.numero = numero;
  }

  @Override
  public void mostrarData(){
    System.out.println("Nombre: " + getNombre());
    System.out.println("ID: " + getId());
    System.out.println("Producto: " + getProduct() );
    System.out.println("Marca: " + getMarca() );
    System.out.println("Numero: " + getNumero());
    System.out.println("Cantidad asignada: " + getCantidadAsignada());
    System.out.println("Cantidad vendida: " + getCantidadVendida());
    System.out.println("Cantidad restante: " + getCantidadSobrante());
  }

  public String getProduct() {
    return product;
  }

  public String getMarca() {
    return marca;
  }

  public int getNumero() {
    return numero;
  }


  
}
