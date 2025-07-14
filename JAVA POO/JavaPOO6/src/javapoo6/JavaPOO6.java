//Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
//(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la 
//cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes 
//métodos: 
//- Constructor predeterminado o vacío 
//- Constructor con la capacidad máxima y la cantidad actual.
//- Métodos getters y setters. 
//- Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad 
//máxima. 
//- Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
//cuanto quedó la taza. 
//- Método vaciarCafetera(): pone la cantidad de café actual en cero. 
//- Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
//recibe y se añade a la cafetera la cantidad de café indicada.
package javapoo6;

import Entidad.Cafetera;
import Service.CafeteraService;
import java.util.Scanner;

public class JavaPOO6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CafeteraService cs1 = new CafeteraService();
        Cafetera c1 = new Cafetera();
        boolean salir = false;
        while (!salir) {
            System.out.println("Elija una opción");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Vaciar cafetera");
            System.out.println("3. Servir taza");
            System.out.println("4. Agregar café");
            System.out.println("5. Salir");
            int opcion = read.nextInt();
            while (opcion < 1 || opcion > 5) {
                System.out.println("Incorrecto, intentelo nuevamente");
                opcion = read.nextInt();
            }
            switch (opcion) {
                case 1:
                    cs1.llenarCafetera(c1, read);
                    break;
                case 2:
                    cs1.vaciarCafetera(c1);
                    break;
                case 3:
                    System.out.println("Ingrese el tamaño de la taza");
                    int taza = read.nextInt();
                    cs1.servirTaza(taza, c1);
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de cafe que quiere agregar");
                    int cantidad = read.nextInt();
                    cs1.agregarCafe(cantidad, c1);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    salir = true;
            }
        }
        read.close();
    }

}
