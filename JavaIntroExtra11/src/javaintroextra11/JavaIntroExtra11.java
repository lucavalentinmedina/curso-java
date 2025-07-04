//Escribir un programa que lea un número entero y devuelva el número de dígitos que 
//componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
//deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el 
//operador de división. Nota: recordar que las variables de tipo entero truncan los 
//números o resultados.
package javaintroextra11;

import java.util.Scanner;

public class JavaIntroExtra11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo");
        int num = read.nextInt();
        int digitos = 0;
        while (num < 0) {
            System.out.println("Incorrecto, debe ser positivo");
            num = read.nextInt();
        }
        if (num == 0) {
            digitos = 1;
        }
        while (num > 0) {
            num /= 10;
            digitos += 1;
        }
        read.close();

        System.out.println("El numero se compone de: " + digitos + " digitos");
    }

}
