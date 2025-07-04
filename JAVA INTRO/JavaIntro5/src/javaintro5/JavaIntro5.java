//Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
//doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
//Math.sqrt().
package javaintro5;

import java.util.Scanner;

public class JavaIntro5 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = read.nextInt();

        System.out.println("El doble de " + num + " es: " + (num * 2));
        System.out.println("El triple de " + num + " es: " + (num * 3));
        System.out.println("La raíz cuadrada de " + num + " es: " + (Math.sqrt(num)));

        read.close();

    }

}
