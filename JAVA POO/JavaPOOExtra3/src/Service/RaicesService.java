package Service;

import java.util.Scanner;
import Entidad.Raices;

public class RaicesService {

    public static Raices cargarRaices(Scanner read) {
        System.out.println("Ingrese el coeficiente A");
        int a = read.nextInt();
        System.out.println("Ingrese el coeficiente B");
        int b = read.nextInt();
        System.out.println("Ingrese el coeficiente C");
        int c = read.nextInt();
        return new Raices(a, b, c);
    }

    public static double getDiscriminante(Raices r) {
        return (Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC());
    }

    public static boolean tieneRaices(Raices r) {
        return RaicesService.getDiscriminante(r) >= 0;
    }

    public static boolean tieneRaiz(Raices r) {
        return RaicesService.getDiscriminante(r) == 0;
    }

    public static void obtenerRaices(Raices r) {
        if (RaicesService.tieneRaices(r)) {
            double x1 = (-r.getB() + Math.sqrt(((Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC()))))) / (2 * r.getA());
            double x2 = (-r.getB() - Math.sqrt(((Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC()))))) / (2 * r.getA());
            System.out.println("Raiz 1: " + x1);
            System.out.println("Raiz 2: " + x2);
        }
    }

    public static void obtenerRaiz(Raices r) {
        if (RaicesService.tieneRaiz(r)) {
            double x1 = (-r.getB() + Math.sqrt(((Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC()))))) / (2 * r.getA());
            System.out.println("Raiz: " + x1);
        }

    }

    public static void calcular(Raices r) {
        if (RaicesService.tieneRaiz(r)) {
            RaicesService.obtenerRaiz(r);
        } else if (RaicesService.tieneRaices(r)) {
            RaicesService.obtenerRaices(r);
        } else {
            System.out.println("No se encontró solución");
        }
    }

}
