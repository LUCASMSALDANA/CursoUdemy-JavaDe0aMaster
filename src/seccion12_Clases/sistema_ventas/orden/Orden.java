package seccion12_Clases.sistema_ventas.orden;

import seccion12_Clases.sistema_ventas.Producto.Producto;

public class Orden {
    private static int contadorOrden= 0;
    private final String idOrden ;
    private Producto[] productos ;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        idOrden= String.format("%04d",++Orden.contadorOrden);
        this.productos = new Producto[MAX_PRODUCTOS];
    }

    public void agregarProductos(Producto producto){
        if(this.contadorProductos<MAX_PRODUCTOS){
            this.productos[this.contadorProductos]=producto;
            contadorProductos++;
        } else {
            System.out.println("No puede agregar más productos. Máximo "+MAX_PRODUCTOS+" por orden.");
        }

    }
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total+=this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("Orden: "+ this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("\tTotal orden: $"+totalOrden);
        System.out.println("\tProductos de la orden: $");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println("\t\t" + this.productos[i]);
        }
        System.out.println();
    }
}
