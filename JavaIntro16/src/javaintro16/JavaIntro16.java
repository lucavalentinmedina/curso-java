//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida 
//al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
//numero y si se encuentra repetido
package javaintro16;

import java.util.Scanner;

public class JavaIntro16 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int size = read.nextInt();
        int count = 0;
        int[] vector = new int[size];

        for (int i = 0; i < size; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        System.out.println("Ingrese un número a buscar");
        int search = read.nextInt();
        for (int i = 0; i < size; i++) {
            if (search == vector[i]) {
                System.out.println("Se encuentra en la posición: " + i);
                count = count + 1;
            }
        }
        if (count > 1) {
            System.out.println("El número se encuentra repetido");
        } else if (count == 1) {
            System.out.println("El número no se encuentra repetido");
        } else {
            System.out.println("No se encuentra el número");
        }

        read.close();

    }

}
