package seccion13_temas_avanzados;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();

        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

        for(Object elemento : miLista){
            System.out.println("El día de la semana es: "+ elemento);
        }

        System.out.println("****************\nFunciones Lambda\n");

        //Funciones Lambda (forEach es un metodo de List para recorrer los elementos de dicha lista)
        miLista.forEach(elemento -> {
            System.out.println("El día de la semana es: " + elemento);
        });
    }
}
