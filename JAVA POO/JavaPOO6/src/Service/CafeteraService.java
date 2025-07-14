package Service;

import Entidad.Cafetera;
import java.util.Scanner;

public class CafeteraService {

    public static void llenarCafetera(Cafetera c1, Scanner read) {
        System.out.println("Ingrese la capacidad máxima de su cafetera");
        float capacidad = read.nextFloat();
        c1.setCapacidadMaxima(capacidad);
        c1.setCapacidadActual(capacidad);
        System.out.println("Cafetera llena!");
        System.out.println("Cantidad actual: " + c1.getCapacidadActual() + " ml");
    }

    public static void servirTaza(int taza, Cafetera c1) {
        if (taza > c1.getCapacidadActual()) {
            System.out.println("Llenando");
            System.out.println("No se pudo llenar la taza. Café insuficiente");
            System.out.println("Se sirvieron: " + c1.getCapacidadActual() + "ml");
            c1.setCapacidadActual(0);
            System.out.println("Cantidad actual: " + c1.getCapacidadActual() + " ml");
        } else {
            System.out.println("Sirviendo...");
            System.out.println("Taza llena!");
            c1.setCapacidadActual(c1.getCapacidadActual() - taza);
            System.out.println("Cantidad de café actual: " + c1.getCapacidadActual() + " ml");
        }
    }

    public static void vaciarCafetera(Cafetera c1) {
        c1.setCapacidadActual(0);
        System.out.println("Cafetera vacía!");
        System.out.println("Cantidad actual: " + c1.getCapacidadActual() + " ml");
    }

    public static void agregarCafe(int cantidad, Cafetera c1) {
        if (cantidad + c1.getCapacidadActual() > c1.getCapacidadMaxima()) {
            System.out.println("Cafetera llena. Se agregaron " + (c1.getCapacidadMaxima() - c1.getCapacidadActual()) + " ml");
        } else {
            System.out.println("Se agregaron " + cantidad + "ml de café");
            c1.setCapacidadActual(c1.getCapacidadActual() + cantidad);
            System.out.println("Cantidad actual: " + c1.getCapacidadActual());
        }
    }

}
