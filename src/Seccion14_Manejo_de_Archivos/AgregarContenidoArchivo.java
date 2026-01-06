package Seccion14_Manejo_de_Archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AgregarContenidoArchivo {
    public static void main(String[] args) {
        boolean anexar = false;
        String nombreArchivo = "mi_segundo_archivo.txt";
        File archivo = new File(nombreArchivo);
        try{
            //Revisamos si nuestro archivo existe
            anexar = archivo.exists();
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,anexar));
            String nuevoContenido = "Nuevo contenido anexado!";
            salida.print(nuevoContenido);
            salida.close();
            String mensaje = anexar?"Contenido anexado con exito": "Archivo creado con exito";
            System.out.println(mensaje);
        } catch (Exception e) {
            System.out.println("Error al escribir el archivo: "+e.getMessage());
            e.getStackTrace();
        }
    }
}
