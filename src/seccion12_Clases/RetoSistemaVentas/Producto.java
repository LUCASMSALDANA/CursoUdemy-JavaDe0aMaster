package seccion12_Clases.RetoSistemaVentas;

public class Producto {
    private static int contadorProducto;
    private final int idProducto;
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.idProducto = ++Producto.contadorProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
