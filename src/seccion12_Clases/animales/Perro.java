package seccion12_Clases.animales;

public class Perro extends Animal{
    @Override
    protected void hacerSonido(){
        System.out.println("Guau guau, soy un perro");
    }

    @Override
    protected void dormir(){
        System.out.println("El perrito yace dormido");
    }
}
