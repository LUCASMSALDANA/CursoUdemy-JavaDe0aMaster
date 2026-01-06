package Seccion14_Manejo_de_Archivos;

import java.io.*;

public class CrearArchivos {
    public static void main(String[] args) {
        //nombreArchivo lleva es de tipo String y es el nombre del archivo , es para q sea legible
        String nombreArchivo = "mi_primer_archivo.txt";
        //Luego paso a crear el objeto del archivo a guardar:
        File archivo = new File(nombreArchivo);
        //Una vez creado pregunto si este archivo ya existe:
        if (archivo.exists()){
            System.out.println("El archivo ya existe");
        }else { //Si no existe entonces:
            // Creamos el archivo
            try {
                //FileWriter(archivo) me permite acceder al archivo
                //Y una vez que accedo dentro lo combino con PrintWrite, para que pueda
                //modificar el interior del mismo de una manera más facil (con println, por ej)
                var salida = new PrintWriter(new FileWriter(archivo));

                //Con la linea salida.close() se graba efectivamente en el disco
                salida.close();

                System.out.println("Se ha creado el archivo en nuestro disco duro");
            } catch (IOException e) {
                System.out.println("Error al crear el archivo: "+e.getMessage());
                e.printStackTrace();
            }
        }
    }

}
