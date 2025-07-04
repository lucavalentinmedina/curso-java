//Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
//comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
//elementos).
package javaintroextra19;

import java.util.Scanner;

public class JavaIntroExtra19 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores");
        int size = read.nextInt();
        int[] vector1 = new int[size];
        int[] vector2 = new int[size];

        System.out.println("Vector 1:");
        llenarVector(vector1, size, read);
        System.out.println("Vector 2:");
        llenarVector(vector2, size, read);
        if (esIgual(vector1, vector2)) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores no son iguales");
        }
        read.close();

    }

    public static void llenarVector(int[] vector, int size, Scanner read) {
        for (int i = 0; i < size; i++) {
            System.out.println("Ingrese un número");
            vector[i] = read.nextInt();
        }
    }

    public static boolean esIgual(int[] v1, int[] v2) {
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] != v2[i]) {
                return false;
            }
        }

        return true;
    }

}
