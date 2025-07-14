package Service;

import Entidad.Curso;
import java.util.Scanner;

public class CursoService {

    public static String[] cargarAlumnos(Scanner read) {
        String[] alumnos = new String[5];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno");
            alumnos[i] = read.nextLine();
            while (alumnos[i].trim().isEmpty()) {
                System.out.println("No puede estar vacío");
                alumnos[i] = read.nextLine();
            }
        }
        return alumnos;
    }

    public static Curso crearCurso(Scanner read) {
        System.out.println("Ingrese el nombre del curso");
        String nombre = read.nextLine();
        while (nombre.trim().isEmpty()) {
            System.out.println("No puede estar vacío");
            nombre = read.nextLine();
        }
        System.out.println("Ingrese la cantidad de horas por dia");
        double horasPorDia = read.nextDouble();
        while (horasPorDia < 1) {
            System.out.println("No puede ser menor a 1");
            horasPorDia = read.nextDouble();
        }
        System.out.println("Ingrese la cantidad de dias a la semana");
        int diasSemanales = read.nextInt();
        while (diasSemanales < 1) {
            System.out.println("No puede ser menor a 1");
            diasSemanales = read.nextInt();
        }
        read.nextLine();
        System.out.println("Ingrese el turno(AM/PM)");
        String turno = read.nextLine();
        while (!turno.equalsIgnoreCase("AM") && !turno.equalsIgnoreCase("PM")) {
            System.out.println("Ingrese un turno válido");
            turno = read.nextLine();
        }
        System.out.println("Ingrese el precio por hora");
        double precioPorHora = read.nextDouble();
        while (precioPorHora < 1) {
            System.out.println("No puede ser menor a 1");
            precioPorHora = read.nextDouble();
        }
        read.nextLine();
        String[] alumnos = CursoService.cargarAlumnos(read);
        return new Curso(nombre, horasPorDia, diasSemanales, turno, precioPorHora, alumnos);
    }

    public static double calcularGananciaSemanal(Curso c1) {
        return c1.getCantidadHorasPorDia() * c1.getPrecioPorHora() * c1.getAlumnos().length * c1.getCantidadDiasPorSemana();
    }

}
