package Seccion14_Manejo_de_Archivos;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.List;

public class LeerArchivos {
    public static void main(String[] args) {
        String nombreArchivo="mi_segundo_archivo.txt";
        File archivo = new File(nombreArchivo);


        //Chequeo que el archivo exista sino lo creo
        if(archivo.exists()){
            leerArchivo(archivo, nombreArchivo);
        }else{
            crearArchivo(archivo);
        }
    }

    private static void leerArchivo(File archivo, String nombreArchivo) {
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = entrada.readLine();
            while(linea!=null){
                System.out.println(linea);
                linea = entrada.readLine();
            }
            entrada.close();
            // Otra opción para leer todas las lineas con List
            System.out.println("\n*** Leer archivos con ReadAllLines ***");
            List<String> lectura = Files.readAllLines(Paths.get(nombreArchivo));
            lectura.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al abrir el archivo: "+ e.getMessage());
        }
    }

    private static void crearArchivo(File archivo) {
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.println("Este es nuestro segundo archivo");
            salida.println("Pero en este ya hemos escrito algo!");
            salida.println("Enhorabuena ya haces algo más que solo codear dentro del IDE!");
            salida.println("Ahora tus programas pueden crear un archivo y guardar información!!");
            salida.close();
            System.out.println("Se ha creado el archivo: "+ archivo.getName());
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error en la creación del archivo: "+e.getMessage());
            e.getStackTrace();
        }
    }
}
