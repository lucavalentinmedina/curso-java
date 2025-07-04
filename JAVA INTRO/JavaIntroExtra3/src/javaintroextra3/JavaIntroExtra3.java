// Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
//Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase 
//String.
package javaintroextra3;

import java.util.Scanner;

public class JavaIntroExtra3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = read.nextLine();
        while (letra.trim().isEmpty()) {
            System.out.println("Incorrecto, no puede estar vacío. Inténtelo nuevamente");
            letra = read.nextLine();
        }
        if (letra.equalsIgnoreCase("a")
                || letra.equalsIgnoreCase("e")
                || letra.equalsIgnoreCase("i")
                || letra.equalsIgnoreCase("o")
                || letra.equalsIgnoreCase("u")) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
        read.close();

    }

}
