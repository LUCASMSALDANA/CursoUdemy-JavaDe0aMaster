package seccion13_temas_avanzados;

public class ArgumentosVariables {
    public static void main(String[] args) {
        variosParmetros ("Lucas ",1,2,3,4);
    }

    //Usamos la notacion [TIPODEDATO]... y el nombre de la variable para designar un argumento variable
    // Siempre el argumento variable tiene que ir a lo último.
    private static void variosParmetros(String nombre, int... numeros) {
        System.out.println(nombre);
        imprimirnumeros(numeros);
    }

    private static void imprimirnumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
    }
}
