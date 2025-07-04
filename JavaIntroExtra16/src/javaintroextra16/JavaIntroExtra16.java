// Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
//las personas ingresadas por teclado e indique si son mayores o menores de edad. 
//Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
//mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
package javaintroextra16;

import java.util.Scanner;

public class JavaIntroExtra16 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean salir = false;
        while (salir == false) {
            mostrarPersona(read);
            System.out.println("¿Desea ingresar a otra persona?(Si/no)");
            String opcion = read.nextLine();
            while (!opcion.equalsIgnoreCase("si") && !opcion.equalsIgnoreCase("no")) {
                System.out.println("Incorrecto, debe ingresar SI O NO");
                opcion = read.nextLine();
            }
            if (opcion.equalsIgnoreCase("no")) {
                salir = true;
            }

        }
        read.close();

    }

    public static void mostrarPersona(Scanner read) {
        System.out.println("Ingrese el nombre de la persona");
        String name = read.nextLine();
        while (name.trim().isEmpty()) {
            System.out.println("El nombre no puede estar vacío");
            name = read.nextLine();
        }
        System.out.println("Ingrese la edad de la persona");
        int age = read.nextInt();
        read.nextLine();
        boolean isLegal = age >= 18;
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        if (isLegal) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

}
