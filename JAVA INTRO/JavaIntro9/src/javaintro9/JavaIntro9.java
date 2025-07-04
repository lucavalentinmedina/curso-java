//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase 
//es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla 
//que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: 
//investigar la función Substring y equals() de Java
package javaintro9;

import java.util.Scanner;

public class JavaIntro9 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese una palabra o frase que comience con la letra A");
        String sentence = read.nextLine();

        while (sentence.trim().isEmpty()) {
            System.out.println("La frase no puede estar vacía");
            sentence = read.nextLine();
        }

        if (sentence.substring(0,1).equalsIgnoreCase("a")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        read.close();
    }

}
