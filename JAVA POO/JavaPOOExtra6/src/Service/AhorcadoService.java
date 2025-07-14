package Service;

import Entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    public static Ahorcado crearJuego(Scanner read) {
        System.out.println("Ingrese la palabra");
        String word = read.nextLine();
        System.out.println("Ingrese la cantidad de jugadas máxima");
        int jugadas = read.nextInt();
        read.nextLine();
        String[] palabra = new String[word.length()];
        for (int i = 0; i < word.length(); i++) {
            palabra[i] = String.valueOf(word.charAt(i));

        }

        return new Ahorcado(palabra, 0, jugadas);
    }

    public static int longitud(Ahorcado a) {
        return a.getPalabra().length;
    }

    public static boolean buscar(String letra, Ahorcado a) {
        boolean contiene = false;
        for (int i = 0; i < a.getPalabra().length; i++) {
            if (letra.equalsIgnoreCase(a.getPalabra()[i])) {
                contiene = true;
            }
        }
        return contiene;
    }

    public static void encontradas(String letra, Ahorcado a) {
        int suma = 0;
        boolean esta = false;
        for (int i = 0; i < a.getPalabra().length; i++) {
            if (letra.equalsIgnoreCase(a.getPalabra()[i])) {
                suma++;
                a.getPalabra()[i] = "*";
                esta = true;
            }
        }
        if (!esta) {
            a.setJugadasMaximas(a.getJugadasMaximas() - 1);
        }
        a.setLetrasEncontradas(a.getLetrasEncontradas() + suma);
        System.out.println("Se encontraron: " + a.getLetrasEncontradas() + " letras");
        System.out.println("Faltan: " + (a.getPalabra().length - a.getLetrasEncontradas()) + " letras");

    }

    public static int intentos(Ahorcado a) {
        return a.getJugadasMaximas();
    }

    public static void Juego(Ahorcado a, Scanner read) {
        while (a.getJugadasMaximas() > 0 && a.getPalabra().length != a.getLetrasEncontradas()) {

            System.out.println("Ingrese una letra");
            String letra = read.nextLine();
            while (letra.trim().isEmpty()) {
                System.out.println("No puede estar vacío");
                letra = read.nextLine();
            }
            while (letra.length() > 1) {
                System.out.println("Incorrecto, debe ingresar solo una letra");
                letra = read.nextLine();
            }
            System.out.println("Longitud de la palabra: " + AhorcadoService.longitud(a));
            if (AhorcadoService.buscar(letra, a)) {
                System.out.println("Se encontró la letra");
            } else {
                System.out.println("No se encontró la letra");
            }
            AhorcadoService.encontradas(letra, a);
            System.out.println("Intentos restantes: " + AhorcadoService.intentos(a));
        }

    }
}
