package seccion13_temas_avanzados.ProyectoMaquinaSnacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaDeSnacks {
    public static void main(String[] args) {
        maquinaDeSnacks();
    }

    public static void maquinaDeSnacks(){
        boolean salir= false;
        Scanner scan = new Scanner(System.in);
        //Creamos la lista de productos de tipo Snack
        List<Snack> productos = new ArrayList<>();

        System.out.println("*** Máquina de Snacks ***");
        Snacks.mostrarSnacks();

        while(!salir){
            try{
                int opcion = (int) mostrarMenu(scan);
                salir = ejecutarOpciones(opcion, scan, productos);
            }catch (Exception e){
                System.out.println("Ocurrio un error: "+ e.getMessage());
            }finally {
                System.out.println();//Imprime un salto de linea con cada iteracion;
            }
        }
    }

    private static boolean ejecutarOpciones(int opcion, Scanner scan, List<Snack> productos) {
        boolean salir = false;
        switch (opcion){
            case 1 -> comprarSnack(scan, productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(scan);
            case 4 -> Snacks.mostrarSnacks();
            case 5 -> {
                System.out.println("Regresa Pronto!");
                salir=true;
            }
            default -> System.out.println("Opcion Inválida: "+ opcion);
        }
        return salir;
    }



    private static void comprarSnack(Scanner scan, List<Snack> productos) {
        System.out.print("\nQue Snack Quieres comprar? (id): ");
        int idSnack = Integer.parseInt(scan.nextLine());
        //Verificamos que ese idSnack existe:
        boolean snackEncontrado = false;
        for (Snack snack : Snacks.getSnacks()){
            if(idSnack==snack.getIdSnack()){
                snackEncontrado=true;
                //Agregamos el Snack a la lista de productos
                productos.add(snack);
                System.out.println("Snack agregado : "+snack);
                break;
            }
        }
        if (!snackEncontrado){
            System.out.println("Id de Snack no encontrado: "+idSnack);
        }
    }

    private static void mostrarTicket(List<Snack> productos){
        String ticket = "\n*** Ticket de Venta ***";
        double total = 0.0;
        for(Snack producto: productos){
            ticket += "\n\t"+ producto.getNombre() + " - $" + producto.getPrecio();
            total += producto.getPrecio();
        }
        ticket += "\n\t Total -> $" + total;
        System.out.println(ticket);
    }

    private static void agregarSnack(Scanner scan){
        System.out.print("\nNombre del Snack: ");
        String nombre = scan.nextLine();
        System.out.print("Precio del Snack: ");
        double precio = Double.parseDouble(scan.nextLine());
        Snacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("Tu Snack se ha agregado correctamente");
        Snacks.mostrarSnacks();
    }

    private static Object mostrarMenu(Scanner scan) {
        System.out.print("""
                Menu:
                1. Comprar Snack
                2. Mostrar Ticket
                3. Agregar Nuevo Snack
                4. Mostrar Inventario
                5. Salir
                Elige una opción:\s"""
                );
        //Leemos y retornamos la opcíon seleccionada por el usuario
        return Integer.parseInt(scan.nextLine());
    }
}
