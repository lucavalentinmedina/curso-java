// Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
//por parámetro para que nos indique si es o no un número primo, debe devolver true si es 
//primo, sino false.
//Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es 
//primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
package javaintroextra17;

import java.util.Scanner;

public class JavaIntroExtra17 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea comprobar que sea primo");
        int num = read.nextInt();
        if (esPrimo(num)) {
            System.out.println("El numero: " + num + " es primo");
        } else {
            System.out.println("El numero: " + num + " no es primo");
        }
        read.close();

    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
