//Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe 
//detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares 
//y la cantidad de números impares. Al igual que en el ejercicio anterior los números 
//negativos no deben sumarse.
package javaintroextra8;

import java.util.Scanner;

public class JavaIntroExtra8 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = 0;
        int cont = 0;
        int pares = 0;
        int impares = 0;
        boolean salir = false;
        do {
            System.out.println("Ingrese un número");
            num = read.nextInt();
            while (num < 0) {
                System.out.println("Incorrecto, intentelo de nuevo");
                num = read.nextInt();
            }
            cont += 1;
            if (num % 5 == 0) {
                cont-=1;
                break;
            }
            if (num % 2 == 0) {
                pares += 1;
            } else if (num % 2 != 0) {
                impares += 1;
            }

        } while (salir == false);
        System.out.println("Cantidad de números ingresados: " + cont);
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        read.close();
    }

}
