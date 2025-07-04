//Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
//adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y 
//desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por 
//trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
//Primer trabajo práctico evaluativo 10%
//Segundo trabajo práctico evaluativo 15%
//Primer Integrador 25%
//Segundo integrador 50%
//Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del 
//programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
//desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o 
//igual al 7 de sus notas del curso
package javaintroextra21;

import java.util.Scanner;

public class JavaIntroExtra21 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double[] notas = new double[10];
        cargarNotas(10, notas, read);
        promedioAprobados(10, notas);

        read.close();

    }

    public static void cargarNotas(int alumnos, double[] v, Scanner read) {
        for (int i = 0; i < alumnos; i++) {
            System.out.println("Ingrese la nota del primer trabajo práctico evaluativo");
            double tp1 = read.nextDouble();
            System.out.println("Ingrese la nota del segundo trabajo práctico evaluativo");
            double tp2 = read.nextDouble();
            System.out.println("Ingrese la nota del primer integrador");
            double int1 = read.nextDouble();
            System.out.println("Ingrese la nota del segundo integrador");
            double int2 = read.nextDouble();
            double promedio = (tp1 * 0.10) + (tp2 * 0.15) + (int1 * 0.25) + (int2 * 0.5);
            v[i] = promedio;
        }
    }

    public static void promedioAprobados(int alumnos, double[] v) {
        double porcentajeAprobado;
        double porcentajeDesaprobado;
        int aprobado = 0;
        int desaprobado = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] >= 7) {
                aprobado += 1;
            } else {
                desaprobado += 1;
            }
        }
        porcentajeAprobado = (double) aprobado * 100 / alumnos;
        porcentajeDesaprobado = (double) desaprobado * 100 / alumnos;
        System.out.println("Promedio de aprobados: " + porcentajeAprobado + "%");
        System.out.println("Promedio de desaprobados: " + porcentajeDesaprobado + "%");
    }

}
