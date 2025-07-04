//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el 
//cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//* * * * 
//*     *
//*     *
//* * * *
package javaintro13;

import java.util.Scanner;

public class JavaIntro13 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado a dibujar");
        int square = read.nextInt();

        for (int i = 0; i < square; i++) {
            for (int j = 0; j < square; j++) {
                if (i==0||i==square-1||j==0||j==square-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }
        read.close();
    }

}
