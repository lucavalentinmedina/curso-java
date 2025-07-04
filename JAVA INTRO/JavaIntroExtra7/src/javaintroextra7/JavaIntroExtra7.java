// Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el 
//promedio de n números (n>0). El valor de n se solicitará al principio del programa y los 
//números serán introducidos por el usuario. Realice dos versiones del programa, una 
//usando el bucle “while” y otra con el bucle “do - while”.
package javaintroextra7;

import java.util.Scanner;

public class JavaIntroExtra7 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int max = 0;
        int min = 0;
        int sum = 0;
        int cant = 0;
        boolean salir = false;

        do {
            System.out.println("Ingrese un número mayor a 0, o 0 para terminar de ingresar números");
            int num = read.nextInt();
            if (num == 0) {
                salir = true;
                break;
            }
            while (num < 0) {
                System.out.println("Incorrecto, debe ser mayor a 0 o 0 para salir");
                num=read.nextInt();
            }
            if (min == 0) {
                min = num;
            } else if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
            sum += num;
            cant += 1;

        } while (salir == false);

        read.close();

        System.out.println("Número minimo: " + min);
        System.out.println("Numero máximo: " + max);
        System.out.println("Promedio de " + cant + " números: " + (sum / cant));
    }

}
