//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la 
//suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que 
//permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
//El programa deberá comprobar que los números introducidos son correctos, es decir, 
//están entre el 1 y el 9.
package javaintro20;

import java.util.Scanner;

public class JavaIntro20 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int[][] cube = new int[3][3];
        int fila = 0;
        int columna = 0;

        boolean isMagic = true;

        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube.length; j++) {
                System.out.println("Ingrese un número del 1 al 9");
                int num = read.nextInt();
                while (num < 1 || num > 9) {
                    System.out.println("Incorrecto, intentelo de nuevo");
                    num = read.nextInt();
                }
                cube[i][j] = num;
            }
        }
        int suma = cube[0][0] + cube[0][1] + cube[0][2];
        int diag1 = cube[0][0] + cube[1][1] + cube[2][2];
        int diag2 = cube[0][2] + cube[1][1] + cube[2][0];

        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube.length; j++) {
                System.out.print("[" + cube[i][j] + "]");

            }
            System.out.println("");

        }
        for (int i = 0; i < 3; i++) {
            fila = 0;
            for (int j = 0; j < 3; j++) {
                fila += cube[i][j];
            }
            if (suma != fila) {
                isMagic = false;
            }
        }

        for (int j = 0; j < 3; j++) {
            columna = 0;
            for (int i = 0; i < 3; i++) {
                columna += cube[i][j];
            }
            if (columna != suma) {
                isMagic = false;
            }
        }
        if (diag1 != suma || diag2 != suma) {
            isMagic = false;
        }
        if (isMagic == true) {
            System.out.println("Es un cuadrado mágico");
        } else {
            System.out.println("No es un cuadrado mágico");
        }

        read.close();
    }

}
