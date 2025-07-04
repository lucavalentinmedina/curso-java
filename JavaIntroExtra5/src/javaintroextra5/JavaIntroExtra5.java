//Una obra social tiene tres clases de socios: 
//o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
//todos los tipos de tratamientos. 
//o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
//para los mismos tratamientos que los socios del tipo A. 
//o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos 
//tratamientos. 
//o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor 
//real que represente el costo del tratamiento (previo al descuento) y determine el 
//importe en efectivo a pagar por dicho socio.
package javaintroextra5;

import java.util.Scanner;

public class JavaIntroExtra5 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la clase de socio");
        String socio = read.nextLine();
        while ( !socio.equalsIgnoreCase("A") && !socio.equalsIgnoreCase("B")
                && !socio.equalsIgnoreCase("C")) {
            System.out.println("Incorrecto, inténtelo de nuevo.");
            socio = read.nextLine();
        }
        System.out.println("Ingrese el precio del tratamiento");
        int price = read.nextInt();
        if (socio.equalsIgnoreCase("A")) {
            System.out.println("El precio final de su tratamiento es de: " + (price / 2));
        } else if (socio.equalsIgnoreCase("B")) {
            System.out.println("El precio final de su tratamiento es de: " + (price * 0.65));
        } else if (socio.equalsIgnoreCase("C")) {
            System.out.println("El precio final de su tratamiento es de: " + price);
        }

    }

}
