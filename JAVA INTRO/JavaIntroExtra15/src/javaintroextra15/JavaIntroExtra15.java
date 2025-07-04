//Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
//restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
//matemática y deben devolver sus resultados para imprimirlos en el main.
package javaintroextra15;

import java.util.Scanner;

public class JavaIntroExtra15 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num1 = read.nextInt();
        System.out.println("Ingrese otro número");
        int num2 = read.nextInt();
        boolean salir = false;
        while (salir == false) {

            System.out.println("Elija una opción:");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            int opcion = read.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println(sumar(num1, num2));
                    break;
                case 2:
                    System.out.println(restar(num1, num2));
                    break;
                case 3:
                    System.out.println(multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println(dividir(num1, num2));
                    break;
                case 5:
                    salir = true;
            }
        }
        read.close();

    }

    public static int sumar(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    public static int restar(int n1, int n2) {
        return n1 - n2;
    }

    public static int multiplicar(int n1, int n2) {
        return n1 * n2;
    }

    public static double dividir(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("No se puede dividir entre 0");
            return 0;
        }
        return (double) n1 / n2;
    }

}
