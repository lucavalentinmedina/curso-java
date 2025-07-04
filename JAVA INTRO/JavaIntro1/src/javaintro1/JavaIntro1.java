//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
//dos. El programa deberá después mostrar el resultado de la suma
package javaintro1;

import java.util.Scanner;

public class JavaIntro1 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int num1=read.nextInt();
        System.out.println("Ingrese otro número");
        int num2= read.nextInt();
        
        System.out.println("El resultado de la suma es: "+ (num1+num2));
        
        read.close();

    }

}
