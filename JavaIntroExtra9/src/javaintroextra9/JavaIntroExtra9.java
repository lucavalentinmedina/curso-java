//Simular la división usando solamente restas. Dados dos números enteros mayores que 
//uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
//Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
//este resultado es el residuo, y el número de restas realizadas es el cociente. 
package javaintroextra9;

import java.util.Scanner;

public class JavaIntroExtra9 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int cociente = 0;
        int residuo = 0;
        System.out.println("Ingrese un número mayor a 1");
        int num1 = read.nextInt();
        while (num1 < 1) {
            System.out.println("Incorrecto, debe ser mayor a 1");
            num1 = read.nextInt();
        }
        System.out.println("Ingrese el segundo número");
        int num2 = read.nextInt();
        while (num2 < 1) {
            System.out.println("Incorrecto, debe ser mayor a 1");
            num2 = read.nextInt();
        }

        while (num1 >= num2) {
            num1 = num1 - num2;
            cociente += 1;
            if (num1 < num2) {
                residuo = num1;
            }
        }
        System.out.println("El cociente es: " + cociente);
        System.out.println("El residuo es: " + residuo);

    }

}
