//Realizar un programa que complete un vector con los N primeros números de la sucesión 
//de Fibonacci.
// Recordar que la sucesión de Fibonacci es la sucesión de los siguientes 
//números:
//1, 1, 2, 3, 5, 8, 13, 21, 34, ..
package javaintroextra24;

import java.util.Scanner;

public class JavaIntroExtra24 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números en la secuencia de Fibonacci que desea completar");
        int cantidad = read.nextInt();
        int[] vector = new int[cantidad];
        fibonacci(vector);
        read.close();
    }

    public static void fibonacci(int[] v) {
        int n1 = 0;
        int n2 = 1;
        int f = 0;
        v[0] = 1;
        for (int i = 1; i < v.length; i++) {
            f = n1 + n2;
            n1 = n2;
            n2 = f;
            v[i] = f;

        }
        for (int i = 0; i < v.length; i++) {
            System.out.print("[" + v[i] + "]");
        }
    }

}
