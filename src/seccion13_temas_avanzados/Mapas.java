package seccion13_temas_avanzados;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {

        Map<String,String> persona = new HashMap<>();
        persona.put("Nombre","Diego");
        persona.put("Apellido","Flores");
        persona.put("Edad","33");
        persona.put("Dni","14.000.000");

        System.out.println("Imprimir valores del Mapa");
        persona.entrySet().forEach(System.out::println);

        System.out.println("\nQuitamos el elemento de DNI del mapa. ");
        //Removemos el dni
        persona.remove("Dni"); // Para quitar un elemento solo necesitamos enviarle la llave

        System.out.println("Usamos una Iteracion sobre cada elemento, otra manera de mostrar los valores:\n");
        // Vamos a iterar sobre cada elemento usando forEach
        persona.forEach((llave , valor)-> System.out.println("Llave: "+llave+". Su Valor: "+valor));
    }
}
