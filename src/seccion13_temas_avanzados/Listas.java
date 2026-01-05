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

        //Una forma de mostrar cada elemento de la lista es utilizando el metodo estatico printlnn, para eso lo hacemos de la siguiente manera:
        System.out.println("****************\nUtilizamos el System.out::println para mostrar los objetos de la lista\n");

        miLista.forEach(System.out::println);  //Esta es otra forma mas eficiente de mostrar cada elemento de la Lista
    }
}
