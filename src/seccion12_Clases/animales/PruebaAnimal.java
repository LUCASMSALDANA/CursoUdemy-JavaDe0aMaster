package seccion12_Clases.animales;

public class PruebaAnimal {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo de Herencia ***");

        System.out.println(" Clase Padre, Soy un animal");
        Animal animal = new Animal();
        animal.comer();
        animal.dormir();
        animal.hacerSonido();

        System.out.println("\n Clase Hija, soy un Perro");
        Perro perro = new Perro();
        perro.comer();
        perro.hacerSonido();
        perro.dormir();

        System.out.println("\n Clase Hija, soy un Gato");
        Gato gato = new Gato();
        gato.comer();
        gato.hacerSonido();
        gato.dormir();

    }
}
