package seccion12_Clases.sistema_ventas.Producto;

public class Producto {
    private static int contadorProducto;
    private final String idProducto;
    private String nombre;
    private double precio;

    //Constructor
    public Producto(String nombre, double precio) {
        this.idProducto = String.format("%04d",++Producto.contadorProducto);
        //Se puede llegar al mismo resultado asi, pero es menos eficiente:
        // this.idProducto = String.valueOf(++Producto.contadorProducto).formatted("%04d");
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getters & Setters
    public static int getContadorProducto() {
        return contadorProducto;
    }


    public String getIdProducto() {
        return idProducto;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto='" + idProducto + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }


}
