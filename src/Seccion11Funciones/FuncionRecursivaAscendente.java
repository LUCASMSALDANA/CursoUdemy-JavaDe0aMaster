package Seccion11Funciones;

public class FuncionRecursivaAscendente {
    public static void main(String[] args) {
        funcionRecursiva(5);
    }

    static void funcionRecursiva(int numero){
        // Caso Base
        if(numero ==1 ){
            System.out.println(numero+" ");
        }else{
            //Caso Recursivo
            System.out.println(numero +" ");
            funcionRecursiva(numero-1);

        }
    }

}
