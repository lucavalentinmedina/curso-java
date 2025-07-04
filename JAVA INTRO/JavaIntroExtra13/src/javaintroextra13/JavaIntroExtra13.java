// Crear un programa que dibuje una escalera de números, donde cada línea de números 
//comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al 
//usuario al comenzar. Ejemplo: si se ingresa el número 3: 
//1
//12
//123
package javaintroextra13;

import java.util.Scanner;

public class JavaIntroExtra13 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera(más de uno)");
        int stair = read.nextInt();
        while (stair < 1) {
            System.out.println("La escalera debe ser mayor a 1");
            stair = read.nextInt();
        }

        for (int i = 1; i <= stair; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "");
            }
            System.out.println("");

        }
        read.close();
    }

}
