// Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
//de 2 dígitos, etcétera (hasta 5 dígitos).
package javaintro17;

import java.util.Scanner;

public class JavaIntro17 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int onedigit = 0;
        int twodigits = 0;
        int threedigits = 0;
        int fourdigits = 0;
        int fivedigits = 0;
        System.out.println("Ingrese el tamaño del vector");
        int size = read.nextInt();
        int[] vector = new int[size];
        for (int i = 0; i < size; i++) {
            vector[i] = (int) (Math.random() * 20000);
        }

        for (int i = 0; i < size; i++) {
            if (vector[i] >= 0 && vector[i] < 10) {
                onedigit = onedigit + 1;
            } else if (vector[i] >= 10 && vector[i] < 100) {
                twodigits = twodigits + 1;
            } else if (vector[i] >= 100 && vector[i] < 1000) {
                threedigits = threedigits + 1;
            } else if (vector[i] >= 1000 && vector[i] < 10000) {
                fourdigits = fourdigits + 1;
            } else {
                fivedigits = fivedigits + 1;
            }
        }

        System.out.println("Números de 1 dígito: " + onedigit);
        System.out.println("Números de 2 dígitos: " + twodigits);
        System.out.println("Números de 3 dígitos: " + threedigits);
        System.out.println("Números de 4 dígitos: " + fourdigits);
        System.out.println("Números de 5 dígitos: " + fivedigits);
        read.close();

    }

}
