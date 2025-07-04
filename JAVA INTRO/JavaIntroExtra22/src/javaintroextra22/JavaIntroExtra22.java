// Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y 
//muestre la suma de sus elementos
package javaintroextra22;

import java.util.Scanner;

public class JavaIntroExtra22 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese las filas de la matriz");
        int n = read.nextInt();
        while (n < 1) {
            System.out.println("Incorrecto, debe ser mayor a 1");
            n = read.nextInt();
        }
        System.out.println("Ingrese las columnas de la matriz");
        int m = read.nextInt();
        while (m < 1) {
            System.out.println("Incorrecto, debe ser mayor a 1");
            m = read.nextInt();
        }
        int[][] matriz = new int[n][m];

        llenarMatriz(matriz);
        System.out.println("La suma de los valores de la matriz da como resultado: " + sumarMatriz(matriz));
        read.close();

    }

    public static void llenarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public static int sumarMatriz(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                sum += m[i][j];
            }
        }
        return sum;
    }

}
