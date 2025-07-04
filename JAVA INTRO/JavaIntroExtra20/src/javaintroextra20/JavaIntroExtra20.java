//Crear una función rellene un vector con números aleatorios, pasándole un arreglo por 
//parámetro. Después haremos otra función o procedimiento que imprima el vector.
package javaintroextra20;

import java.util.Scanner;

public class JavaIntroExtra20 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int[] vector = new int[read.nextInt()];
        llenarArreglo(vector);
        imprimirArreglo(vector);
        read.close();
    }

    public static void llenarArreglo(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 100);
        }

    }

    public static void imprimirArreglo(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("[" + v[i] + "]");
        }
    }

}
