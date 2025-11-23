package seccion13_temas_avanzados;

public class CicloForEach {
    public static void main(String[] args) {
        System.out.println("*** Ciclo For Each ***");
        //Definimos una Array para probar
        int[] edades ={12,18,25,27,33};

        //Podriamos leerlo asi: Por cada (tipodedato) edad  EN edades, hacer:
        for(int edad : edades){
            System.out.print(edad+" ");
        }
    }
}
