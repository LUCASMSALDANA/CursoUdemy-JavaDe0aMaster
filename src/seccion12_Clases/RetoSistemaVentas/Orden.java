package seccion12_Clases.RetoSistemaVentas;

public class Orden {
    private static int contadorOrden;
    private final int idOrden;
    private Producto[] productos;
    private int contadorProductos;
    private final int MAX_PRODUCTOS_ORDEN = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrden;
        this.productos = new Producto[MAX_PRODUCTOS_ORDEN];
    }

    public void agregarProducto(Producto producto){
        if (contadorProductos<MAX_PRODUCTOS_ORDEN){
            this.productos[contadorProductos] = producto;
            contadorProductos++;
        } else {
            System.out.println("No puede agregar mas productos.");
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total+=productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarProductos(){
        System.out.println("Orden: " +this.idOrden);
        System.out.println("\tTotal de la orden: $"+this.calcularTotal());
        System.out.println("\tProductos de la Orden: ");
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println("\t\t"+this.productos[i]);
        }
    }
}
