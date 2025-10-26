package seccion3;
// Crear variables para almacenar el detalle de un producto de una tienda en línea.
// El detalle a almacenar del producto es el siguiente:
//  Nombre del producto
//  Precio
//  Cantidad Disonible
//  Indicar si esta disponible o no
//
// Asignar un valor a cada variable, escogiendo un nombre aplicando las buenas practicas y mandar a
// imprimir el valor de cada variable
//
// Por último modificar el valor de cada variable con nuevos datos y mostrarlos por pantalla.



public class DetalleProducto {
    public static void main(String[] args) {

        String producto = "Frazada";
        double precio = 24999.99;
        int cantidadEnStock = 3;
        boolean hayStock = true;

        System.out.println(producto);
        System.out.println(precio);
        System.out.println(cantidadEnStock);
        System.out.println(hayStock);

        System.out.println("********************");
        System.out.println("Cambiando de valores");
        System.out.println("********************");

        producto = "Colchon";
        precio = 19999.99;
        cantidadEnStock = 0;
        hayStock = false;

        System.out.println(producto);
        System.out.println(precio);
        System.out.println(cantidadEnStock);
        System.out.println(hayStock);

    }
}
