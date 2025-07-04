//Realice un programa para que el usuario adivine el resultado de una multiplicación entre 
//dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario 
//si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir 
//al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como 
//utilizar la función Math.random() de Java.
//
package javaintroextra10;

import java.util.Scanner;

public class JavaIntroExtra10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int mult = (int) (Math.random() * 11) * (int) (Math.random() * 11);

        System.out.println("Ingrese la respuesta de la multiplicación aleatoria");
        int respuesta = read.nextInt();
        while (respuesta != mult) {
            System.out.println("Incorrecto, intentelo nuevamente");
            respuesta = read.nextInt();
        }
        System.out.println("¡Correcto, la respuesta era " + mult + "!");
    }

}
