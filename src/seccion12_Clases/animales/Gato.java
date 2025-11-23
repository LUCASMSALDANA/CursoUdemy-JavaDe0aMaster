package seccion12_Clases.animales;

public class Gato extends Animal{
    @Override
    protected void hacerSonido(){
        System.out.println("Miau miauuu, soy un gato");
    }

    @Override
    protected void dormir(){
        System.out.println("El Gatito al fin duerme");
    }
}
