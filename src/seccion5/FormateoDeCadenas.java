package seccion5;

public class FormateoDeCadenas {
    public static void main(String[] args) {
        String nombre = "Lucas";
        int edad = 33;
        float salario = 9999.99f;

        // String.format()
        System.out.println("\nUtilizando String.format");
        String mensaje = String.format("Nombre: %s Edad: %d Salario: %.2f",nombre,edad,salario);
        System.out.println(mensaje);

        //System.out.printf()
        System.out.println("\nUtilizando printf");
        System.out.printf("Nombre: %s Edad: %d Salario: %.2f %n",nombre,edad,salario); //usando format el %n hace un salto de linea
    }
}
