// Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
package javaintro4;

import java.util.Scanner;

public class JavaIntro4 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una temperatura en grados Celsius para convertir a Fahrenheit");
        float temp = read.nextFloat();

        System.out.println(temp + " grados Celsius es el equivalente a " + (32 + (9 * temp / 5)) + " grados Fahrenheit");

        read.close();

    }

}
