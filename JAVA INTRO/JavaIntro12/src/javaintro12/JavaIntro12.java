// Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que 
//ser X y el último tiene que ser una O. 
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia 
//distinta de FDE, que no respete el formato se considera incorrecta. 
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas 
//e incorrectas recibidas. 
package javaintro12;

import java.util.Scanner;

public class JavaIntro12 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int right = 0, wrong = 0;

        String cadena = "";
        do {
            System.out.println("Ingrese una cadena");
            System.out.println("La misma debe contar con 5 caracteres, comenzar con X y terminar con O");
            System.out.println("Para finalizar de enviar cadenas, introduzca '&&&&&'");
            cadena = read.nextLine();

            if (cadena.length() != 5) {
                wrong = wrong + 1;
            } else if (!cadena.substring(0, 1).equalsIgnoreCase("x")) {
                wrong = wrong + 1;
            } else if (!cadena.substring(cadena.length() - 1).equalsIgnoreCase("o")) {
                wrong = wrong + 1;
            } else {
                right = right + 1;
            }

        } while (!cadena.equalsIgnoreCase("&&&&&"));
        System.out.println("cadenas incorrectas: " + (wrong - 1));
        System.out.println("Cadenas correctas: " + right);

    }

}
