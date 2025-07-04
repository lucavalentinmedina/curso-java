//Leer la altura de N personas y determinar el promedio de estaturas que se encuentran 
//por debajo de 1.60 mts. y el promedio de estaturas en general.
package javaintroextra6;

import java.util.Scanner;

public class JavaIntroExtra6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean isDone = false;
        int people = 0;
        int sum = 0;
        int sum2 = 0;
        int smurfs = 0;
        do {
            System.out.println("Ingrese la altura de la persona expresada en cm, para salir ingrese 0");
            int height = read.nextInt();
            while (height < 0) {
                System.out.println("Incorrecto, no puede ser un valor negativo");
                height = read.nextInt();
            }
            people += 1;
            sum += height;
            if (height < 160) {
                smurfs += 1;
                sum2 += height;
            }
            if (height == 0) {
                isDone = true;
                people -= 1;
            }

        } while (isDone == false);

        System.out.println("El promedio de altura entre las " + people + " personas ingresadas es de: " + (sum / people) + " cm");
        System.out.println("El promedio de altura entre las " + smurfs + " personas más bajas que 160 cm es de: " + (sum2 / smurfs) + " cm");

        read.close();
    }

}
