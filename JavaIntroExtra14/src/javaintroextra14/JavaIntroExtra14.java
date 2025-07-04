//Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de 
//hijos. Escriba un programa que pida la cantidad de familias y para cada familia la 
//cantidad de hijos para averiguar la media de edad de los hijos de todas las familias
package javaintroextra14;

import java.util.Scanner;

public class JavaIntroExtra14 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        int famCount = read.nextInt();
        int kidCount = 0;
        int ageCount = 0;
        for (int i = 1; i <= famCount; i++) {
            System.out.println("Familia: " + i);
            System.out.println("Ingrese la cantidad de hijos");
            int aux = read.nextInt();
            kidCount += aux;
            for (int j = 1; j <= aux; j++) {
                System.out.println("Ingrese la edad del niño");
                ageCount += read.nextInt();
            }
        }
        double resultado = (double) ageCount / kidCount;

        System.out.println("El promedio de edad entre los " + kidCount + " niños de " + famCount + " familias da como resultado: " + resultado);

        read.close();

    }

}
