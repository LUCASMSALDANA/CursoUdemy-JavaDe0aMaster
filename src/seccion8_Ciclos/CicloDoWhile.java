package seccion8_Ciclos;
//El do while a diferencia del while, es que primero se ejecuta y despues pregunta
//Es decir que siempre se va a ejecutar el codigo AL MENOS una vez
public class CicloDoWhile {
    public static void main(String[] args) {
        System.out.println("*** Ciclo Do-While ***");

        int contador = 1;
        do{
            System.out.println(contador);
            contador++;
        } while (contador <=5 );

        System.out.println("-----------------------------------------");
        System.out.println("Valor del contador al finalizar el primer while: " + contador);
        System.out.println("\tCon el contador ya incrementeado veamos que paso con el DO-While ");
        do{
            System.out.println(contador);
            contador++;
        } while (contador <=5 );
        System.out.println("Como se puede observar se ejecuto 1 vez, por mas que no haya cumplido la condicion, ya que PRIMERO HACE(DO) luego PREGUNTA(WHILE)");
    }
}
