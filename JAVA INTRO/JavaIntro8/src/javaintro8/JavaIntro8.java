//Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si 
//el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje 
//por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
//“INCORRECTO”. Nota: investigar la función Lenght() en Java.
package javaintro8;

import java.util.Scanner;

public class JavaIntro8 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase de 8 letras");
        String word = read.nextLine();
        while (word.trim().isEmpty()) {
            System.out.println("La frase no puede estar vacía");
            word = read.nextLine();
        }

        if (word.replace(" ", "").length() == 8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        read.close();
    }

}
