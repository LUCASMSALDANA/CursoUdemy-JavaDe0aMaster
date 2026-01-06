package seccion13_temas_avanzados.ProyectoMaquinaSnacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<Snack> snacks;

    //Bloque de tipo estatico inicializador.
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 10));
        snacks.add(new Snack("Gaseosa", 15));
        snacks.add(new Snack("Sandwich", 20));
    }

    public static void agregarSnack(Snack snack){
        snacks.add(snack);
    }

    public static void mostrarSnacks(){
        String inventarioSnacks ="";
        for(Snack snack : snacks){
            inventarioSnacks+="\t" + snack.toString() +"\n";
        }
        System.out.println("Inventario de Snacks:");
        System.out.println  (inventarioSnacks);
    }

    public static List<Snack> getSnacks(){
        return snacks;
    }
}
