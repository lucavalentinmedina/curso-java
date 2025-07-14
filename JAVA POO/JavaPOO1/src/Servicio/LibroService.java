package Servicio;

import java.util.Scanner;
import Entidad.Libro;

public class LibroService {

    public static Libro cargarLibro(Scanner read) {
        System.out.println("Ingrese el isbn");
        int isbn = read.nextInt();
        while (isbn < 1) {
            System.out.println("Incorrecto, intentelo de nuevo");
            isbn = read.nextInt();
        }
        read.nextLine();
        System.out.println("Ingrese el autor");
        String autor = read.nextLine();
        while (autor.trim().isEmpty()) {
            System.out.println("Incorrecto, intente de nuevo");
            autor = read.nextLine();
        }
        System.out.println("Ingrese la cantidad de páginas");
        int pages = read.nextInt();
        while (pages < 1) {
            System.out.println("Incorrecto, intentelo de nuevo");
            pages = read.nextInt();
        }
        read.nextLine();
        System.out.println("Ingrese el título");
        String title = read.nextLine();
        while (title.trim().isEmpty()) {
            System.out.println("Incorrecto, intente de nuevo");
            title = read.nextLine();
        }
        return new Libro(isbn, title, autor, pages);
    }

    public static void showBook(Libro l1) {
        System.out.println("Título del libro: " + l1.getTítulo());
        System.out.println("Autor del libro: " + l1.getAutor());
        System.out.println("Cantidad de páginas: " + l1.getPages());
        System.out.println("ISBN: " + l1.getIsbn());
    }

}
