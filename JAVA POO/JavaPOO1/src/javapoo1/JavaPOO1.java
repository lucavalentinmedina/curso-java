//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
//numero de páginas. 
package javapoo1;

import Entidad.Libro;
import Servicio.LibroService;
import java.util.Scanner;

public class JavaPOO1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        LibroService ls1 = new LibroService();
        Libro l1 = ls1.cargarLibro(read);
        ls1.showBook(l1);
        read.close();
    }

}
