package seccion12_Clases.RetoSistemaVentas;

public class Main {
    public static void main(String[] args) {
        Producto oreo = new Producto("Oreo", 1800);
        Producto cindor = new Producto("Cindor", 2500);
        Producto kellogs = new Producto("Kellogs", 2400);

        System.out.println(oreo);
        System.out.println(cindor);
        System.out.println(kellogs);

        Orden orden1 = new Orden();
        orden1.agregarProducto(oreo);
        orden1.agregarProducto(kellogs);
        orden1.mostrarProductos();
    }
}
