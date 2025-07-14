package Service;

import Entidad.Cancion;
import java.util.Scanner;

public class CancionService {

    public static Cancion cargarCancion(Scanner read) {
        System.out.println("Ingrese el nombre de la canción");
        String nombre = read.nextLine();
        while (nombre.trim().isEmpty()) {
            System.out.println("No puede estar vacío");
            nombre = read.nextLine();
        }
        System.out.println("Ingrese el autor de la canción");
        String autor = read.nextLine();
        while (autor.trim().isEmpty()) {
            System.out.println("No puede estar vacío");
            autor = read.nextLine();
        }
        return new Cancion(nombre, autor);
    }

}
