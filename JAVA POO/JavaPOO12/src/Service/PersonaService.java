package Service;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {

    public static Persona crearPersona(Scanner read) {
        System.out.println("Ingrese el nombre de la persona");
        String name = read.nextLine();
        while (name.trim().isEmpty()) {
            System.out.println("El nombre no puede estar vacío");
            name = read.nextLine();
        }
        System.out.println("Ingrese el año de nacimiento");
        int anio = read.nextInt();
        while (anio < 1) {
            System.out.println("Imposible, ingrese un año válido");
            anio = read.nextInt();
        }
        System.out.println("Ingrese el mes de nacimiento(1 para enero, 2 para febrero y sucesivamente)");
        int mes = read.nextInt();
        while (mes < 1 || mes > 12) {
            System.out.println("Incorreto, ingrese un més válido");
            mes = read.nextInt();
        }
        System.out.println("Ingrese el día de nacimiento");
        int dia = read.nextInt();
        while (dia < 1 || dia > 31) {
            System.out.println("Incorrecto, ingrese un día válido");
            dia = read.nextInt();
        }

        Date birthday = new Date(anio - 1900, mes - 1, dia);
        return new Persona(name, birthday);
    }

    public static int calcularEdad(Persona p1) {
        Date birthday = p1.getBirthday();
        Date fechaActual = new Date();
        int diferencia = fechaActual.getYear() - birthday.getYear();
        return diferencia;
    }

    public static boolean menorQue(Persona p1, int edad) {
        if (PersonaService.calcularEdad(p1) < edad) {
            return true;
        } else {
            return false;
        }
    }

    public static void mostrarPersona(Persona p1) {
        System.out.println("Nombre:");
        System.out.println(p1.getName());
        System.out.println("Fecha de nacimiento:");
        System.out.println(p1.getBirthday());
        System.out.println("Edad:");
        System.out.println(PersonaService.calcularEdad(p1));
    }

}
