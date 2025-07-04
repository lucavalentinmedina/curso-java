//Crea una aplicación que a través de una función nos convierta una cantidad de euros 
//introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
//función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
//una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
//(void).
//El cambio de divisas es:
// * 0.86 libras es un 1 €
// * 1.28611 $ es un 1 €
// * 129.852 yenes es un 1 €
package javaintro14;

import java.util.Scanner;

public class JavaIntro14 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros a convertir");
        int euros = read.nextInt();
        System.out.println("Ingrese a que moneda desea convertirlo(libras, dólares o yenes)");
        read.nextLine();
        String moneda = read.nextLine();
        while (!moneda.equalsIgnoreCase("yenes") && !moneda.equalsIgnoreCase("dolares")
                && !moneda.equalsIgnoreCase("libras")) {
            System.out.println("Incorrecto, ingrese nuevamente(dolares, yenes o libras)");
            moneda = read.nextLine();
        }
        conversor(euros, moneda);
        read.close();
    }

    private static void conversor(int num, String currency) {
        if (currency.equalsIgnoreCase("dolares")) {
            System.out.println(num + " euros es igual a " + (num * 1.28611) + " dolares");
        }
        if (currency.equalsIgnoreCase("libras")) {
            System.out.println(num + " euros es igual a " + (num * 0.86) + " libras");
        }
        if (currency.equalsIgnoreCase("yenes")) {
            System.out.println(num + " euros es igual a " + (num * 129.852) + " yenes");
        }
    }

}
