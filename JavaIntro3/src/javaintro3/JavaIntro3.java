////Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
//en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en 
//Java.
package javaintro3;

import java.util.Scanner;

public class JavaIntro3 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese una frase");

        String sentence = read.nextLine();

        while (sentence.trim().isEmpty()) {
            System.out.println("Incorrecto, ingrese una frase válida");
            sentence = read.nextLine();
        }

        System.out.println("Su frase toda en mayúsculas: " + sentence.toUpperCase());
        System.out.println("Su frase toda en minúsculas: " + sentence.toLowerCase());
        
        read.close();
    }

}
