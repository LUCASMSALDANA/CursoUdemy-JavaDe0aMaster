package seccion13_temas_avanzados;

public class Excepciones {
    public static void main(String[] args) {
        int valor1=10, valor2=0;
        //Try & catch los errores o excepeciones en ejecucion. Son los más problematicos
        //Ya que no te enteras del error hasta que pase, siempre es bueno pensar en la robustez
        //de nuestro programa y pensar en todos los casos.
        //En este ejemplo puede pasar que dividamos por 0. lo que traeria un error de ejecución
        //Esto provoca que el programa no puede continuar y entonces se "Crashea" y se sale.
        //Para evitar que nuestro programa termine abruptamente, encapsulamos las lineas de codigo
        //que podrian ocasionar este error dentro de un try{}
        try{
            int resultado = valor1/valor2;
            System.out.println(resultado);
            //En caso de haber un error lo capturamos (catch) y ejecutamos otra linea de codigo
        } catch (Exception e) {
            System.out.println("Ocurrio un error. " + e);
        }

    }
}
