package seccion4;
// Crear un programa para generar un mail a partir de los siguientes datos:
// Nombre: Ubaldo Acosta Soto
// Empresa: Global Mentoring
// Domino: com.mx
// El mail resultante debe ser: ubaldo.acosta.soto@globalmentoring.com.mx


import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

public class GeneradorDeEmail {

    public static void main(String[] args) {

        String nombre = "Ubaldo Acosta Soto";
        String empresa = "Global Mentoring";
        String dominio = "com.mx" ;

        //Mostramos por pantalla
        System.out.println("*** Generador de Email ***");
        System.out.println("Nombre del usuario: " + nombre);

        // Normalicamos el nombre, quitando espacios y transformando a miniscula para luego mostrarlo
        nombre=nombre.replace(" ",".").toLowerCase() ;
        System.out.println("Nombre normalizado: " + nombre);

        // Por ultimo concatenamos todas las cadenas de texto
        var emailResultante = nombre.concat("@").concat(empresa).concat(".").concat(dominio);
        // Una vez armado el mail, restaria pasar a miniscula y eliminar espacios.
        emailResultante= emailResultante.toLowerCase().replace(" ","");

        System.out.println("Email obtenido: "+ emailResultante);
    }

}
