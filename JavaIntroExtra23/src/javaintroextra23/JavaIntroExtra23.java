//Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida 
//que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 
//20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que 
//será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, 
//rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima 
//por pantalla la sopa de letras creada.
package javaintroextra23;

import java.util.Scanner;

public class JavaIntroExtra23 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[][] sopa = new String[20][20];
        llenarSopa(read, sopa);
        mostrarSopa(sopa);
        read.close();

    }

    public static void llenarSopa(Scanner read, String[][] sopa) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la palabra(entre 3 y 5 caracteres)");
            String palabra = read.nextLine();
            while (palabra.length() < 3 || palabra.length() > 5) {
                System.out.println("Incorrecto, la palabra debe ser de entre 3 y 5 caracteres");
                System.out.println("Ingresela nuevamente");
                palabra = read.nextLine();
            }
            int fila = (int) (Math.random() * 20);
            int columna = (int) (Math.random() * (20 - palabra.length()));

            for (int j = 0; j < palabra.length(); j++) {
                sopa[fila][columna + j] = String.valueOf(palabra.toUpperCase().charAt(j));
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j] == null) {
                    sopa[i][j] = String.valueOf((int) (Math.random() * 10));
                }
            }

        }

    }

    public static void mostrarSopa(String[][] sopa) {
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[0].length; j++) {
                System.out.print("[" + sopa[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
