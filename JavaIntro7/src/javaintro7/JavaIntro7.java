//Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
//pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
//investigar la función equals() en Java.
package javaintro7;

import java.util.Scanner;

public class JavaIntro7 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la palabra eureka");
        String sentence = read.nextLine();

        while (sentence.trim().isEmpty()) {
            System.out.println("El texto no puede estar vacío");
            sentence = read.nextLine();
        }

        if (sentence.toLowerCase().equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        read.close();

    }

}
