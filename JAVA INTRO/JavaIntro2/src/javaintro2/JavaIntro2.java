// Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por 
//pantalla
package javaintro2;

import java.util.Scanner;

public class JavaIntro2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String name = read.nextLine();

        while (name.trim().isEmpty()) {
            System.out.println("Incorrecto, ingrese un nombre válido");
            name = read.nextLine();
        }

        System.out.println("Su nombre es: " + name);

        read.close();

    }

}
