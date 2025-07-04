//Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su 
//equivalente en romano.
package javaintroextra4;

import java.util.Scanner;

public class JavaIntroExtra4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 10");
        int num = read.nextInt();
        while (num < 1 || num > 10) {
            System.out.println("Incorrecto, intentelo nuevamente");
            num = read.nextInt();
        }
        switch (num) {
            case 1:
                System.out.println("1 en romano es I");
                break;
            case 2:
                System.out.println("2 en romano es II");
                break;
            case 3:
                System.out.println("3 en romano es III");
                break;
            case 4:
                System.out.println("4 en romano es IV");
                break;
            case 5:
                System.out.println("5 en romano es V");
                break;
            case 6:
                System.out.println("6 en romano es VI");
                break;
            case 7:
                System.out.println("7 en romano es VII");
                break;
            case 8:
                System.out.println("8 en romano es VIII");
                break;
            case 9:
                System.out.println("9 en romano es IX");
                break;
            case 10:
                System.out.println("10 en romano es X");
                break;

        }
        read.close();
    }

}
