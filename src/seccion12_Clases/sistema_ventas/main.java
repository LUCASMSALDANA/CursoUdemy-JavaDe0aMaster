package seccion12_Clases.sistema_ventas;

import seccion12_Clases.sistema_ventas.Producto.Producto;
import seccion12_Clases.sistema_ventas.orden.Orden;

public class main {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Ventas ***");
        //Cargamos productos
        Producto coca = new Producto("Coca Cola", 3500);
        Producto sprite = new Producto("Sprite", 3200);
        Producto papas = new Producto("Papas Fritas", 2000);

        //Primer Orden
        Orden orden1 = new Orden();
        orden1.agregarProductos(coca);
        orden1.agregarProductos(papas);

        //Segunda Orden
        Orden orden2 = new Orden();
        orden2.agregarProductos(coca);

        //Tercer Orden
        Orden orden3 = new Orden();
        orden3.agregarProductos(coca);
        orden3.agregarProductos(sprite);
        orden3.agregarProductos(papas);

        orden1.mostrarOrden();
        orden2.mostrarOrden();
        orden3.mostrarOrden();

    }
}