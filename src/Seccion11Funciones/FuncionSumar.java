package Seccion11Funciones;

public class FuncionSumar {
    public static void main(String[] args) {
        System.out.println("*** Funcion Sumar ***");
        int arg1= 2 ,arg2=4;
        int primerresultado = sumar(arg1,arg2);

        arg1=10 ; arg2 = 5;
        int segundoresultado = sumar(arg1,arg2);

        System.out.printf("""
                Resultado primer operacion: %d
                Resultado segunda operacion: %d
                """,primerresultado,segundoresultado);
    }

    static int sumar(int a, int b){
        return a+b;
    }
}
