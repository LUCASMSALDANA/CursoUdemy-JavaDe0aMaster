package Seccion11;

public class FuncionRecursivaDescendente {
    public static void main(String[] args) {
        funcionRecursiva(5);
    }

    static void funcionRecursiva(int numero){
        // Caso Base
        if(numero ==1 ){
            System.out.println(numero+" ");
        }else{
            //Caso Recursivo
            funcionRecursiva(numero-1);
            System.out.println(numero +" ");
        }
    }
}
