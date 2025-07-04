//Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
//pantalla el siguiente menú:
//MENU
//1. Sumar
//2. Restar
//3. Multiplicar
//4. Dividir
//5. Salir
//Elija opción:
//El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
//pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
//opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del 
//programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está 
//seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale 
//del programa, caso contrario se vuelve a mostrar el menú
package javaintro11;

import java.util.Scanner;

public class JavaIntro11 {

    public static void main(String[] args) {

        System.out.println("Ingrese un número");
        Scanner read = new Scanner(System.in);
        int num1 = read.nextInt();
        System.out.println("Ingrese otro número");
        int num2 = read.nextInt();

        boolean out = false;

        while (out == false) {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija opción: ");
            int option = read.nextInt();
            while (option < 1 || option > 5) {
                System.out.println("Opción incorrecta, intente nuevamente");
                option = read.nextInt();
            }
            switch (option) {
                case 1:
                    System.out.println("La suma de los dos números da como resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los dos números da como resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación de los dos números da como resultado: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La división de los dos números da como resultado: " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Seguro que quiere salir? (S/N)");
                    read.nextLine();
                    String confirm = read.nextLine();
                    while (!confirm.equalsIgnoreCase("s") && !confirm.equalsIgnoreCase("n")) {
                        System.out.println("Incorrecto, intentelo otra vez");
                        confirm = read.nextLine();
                    }
                    if (confirm.equalsIgnoreCase("s")) {
                        out = true;
                    } else if (confirm.equalsIgnoreCase("n")) {
                        break;
                    }
            }
        }

        read.close();

    }

}
