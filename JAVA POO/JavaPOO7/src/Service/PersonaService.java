package Service;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaService {

    public static Persona crearPersona(Scanner read) {
        System.out.println("Ingrese el nombre");
        String nombre = read.nextLine();
        while (nombre.trim().isEmpty()) {
            System.out.println("El nombre no puede estar vacío");
            nombre = read.nextLine();
        }
        System.out.println("Ingrese la edad");
        int edad = read.nextInt();
        while (edad < 1) {
            System.out.println("Incorrecto, la edad no puede ser menor a 1");
            edad = read.nextInt();
        }
        read.nextLine();
        System.out.println("Ingrese el sexo(H/M)");
        String sexo = read.nextLine();
        while (sexo.trim().isEmpty()) {
            System.out.println("El sexo no puede estar vacío");
            sexo = read.nextLine();
        }
        while (!sexo.equalsIgnoreCase("h") && !sexo.equalsIgnoreCase("m")) {
            System.out.println("Incorrecto, intente nuevamente(H/M)");
            sexo = read.nextLine();
        }
        System.out.println("Ingrese el peso en kg");
        double peso = read.nextDouble();
        while (peso < 1) {
            System.out.println("Incorrecto, no puede ser menor a 1");
            peso = read.nextDouble();
        }
        System.out.println("Ingrese la altura expresada en cm");
        double altura = read.nextDouble();
        while (altura < 1) {
            System.out.println("Incorrecto, no puede ser menor a 1");
            altura = read.nextDouble();
        }
        read.nextLine();
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public static int calcularIMC(Persona p) {
        double alturaMetros = p.getAltura() / 100;
        double imc = p.getPeso() / (alturaMetros * alturaMetros);
        if (imc < 20) {
            System.out.println(p.getNombre() + " está por debajo de su peso ideal");
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            System.out.println(p.getNombre() + " está en su peso ideal");
            return 0;
        } else {
            System.out.println(p.getNombre() + " está por encima de su peso ideal");
            return 1;
        }

    }

    public static boolean esMayorDeEdad(Persona p) {
        if (p.getEdad() < 18) {
            System.out.println(p.getNombre() + " es menor de edad");
            return false;
        } else {
            System.out.println(p.getNombre() + " es mayor de edad");
            return true;
        }
    }

}
