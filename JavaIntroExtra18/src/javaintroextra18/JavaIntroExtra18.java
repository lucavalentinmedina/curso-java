//Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño 
//N, con los valores ingresados por el usuario.
package javaintroextra18;

import java.util.Scanner;

public class JavaIntroExtra18 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int size = read.nextInt();
        int vector[] = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            System.out.println("Ingrese un numero a sumar");
            vector[i] = read.nextInt();
            sum += vector[i];
        }
        System.out.println("El resultado de la suma de los valores es de: " + sum);
        read.close();

    }

}
