// Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el 
//usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
package javaintroextra1;

import java.util.Scanner;

public class JavaIntroExtra1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos.");
        int min = read.nextInt();
        while (min < 1) {
            System.out.println("Incorrecto, ingreselo nuevamente");
            min = read.nextInt();
        }
        int hours = min / 60;
        int days = hours / 24;
        if (hours < 48) {
            System.out.println(min + " minutos equivale a " + days + " día, " + (hours - (days * 24)) + " horas");
        } else {
            System.out.println(min + " minutos equivale a " + days + " días, " + (hours - (days * 24)) + " horas");
        }

        read.close();

    }

}
