//Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la 
//clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase 
//Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
//usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date, 
//deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que 
//se puede conseguir instanciando un objeto Date con constructor vacío. 
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia); 
//Ejemplo fecha actual: Date fechaActual = new Date();
package javapoo11;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class JavaPOO11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int dia;
        int mes;
        int anio;

        System.out.println("Ingrese el año");
        anio = read.nextInt();
        while (anio < 1) {
            System.out.println("Incorrecto, intentelo de nuevo");
            anio = read.nextInt();
        }
        System.out.println("Ingrese el mes(1 para enero, 2 para febrero y consecutivamente)");
        mes = read.nextInt();
        while (mes < 1 || mes > 12) {
            System.out.println("Incorrecto, intentelo de nuevo");
            mes = read.nextInt();
        }

        System.out.println("Ingrese el día");
        dia = read.nextInt();
        while (dia < 1 || dia > 31) {
            System.out.println("Incorrecto, intentelo de nuevo.");
            dia = read.nextInt();
        }

        LocalDate fechaIngresada = LocalDate.of(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaIngresada, fechaActual);

        int diferencia = periodo.getYears();
        System.out.println("La diferencia de años es de: " + diferencia);

    }

}
