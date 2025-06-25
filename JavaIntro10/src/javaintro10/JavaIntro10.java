//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
//solicite números al usuario hasta que la suma de los números introducidos supere el 
//límite inicial. 
package javaintro10;

import java.util.Scanner;

public class JavaIntro10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un valor límite positivo");
        int limit = read.nextInt();
        while (limit < 1) {
            System.out.println("Incorrecto, debe ser POSITIVO");
            limit = read.nextInt();
        }
        int sum = 0;
        while (sum <= limit) {
            System.out.println("Ingrese un número a sumar");
            int num = read.nextInt();
            sum = sum + num;

        }
        System.out.println("Límite superado.");
        System.out.println("El límite es: " + limit);
        System.out.println("El total es: " + sum);
        read.close();
    }

}
