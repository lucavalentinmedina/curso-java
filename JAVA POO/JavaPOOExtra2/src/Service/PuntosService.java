package Service;

import Entidad.Puntos;
import java.util.Scanner;

public class PuntosService {

    public static Puntos crearPuntos(Scanner read) {
        System.out.println("Ingrese el punto X1");
        int x1 = read.nextInt();
        System.out.println("Ingrese el punto Y1");
        int y1 = read.nextInt();
        System.out.println("Ingrese el punto X2");
        int x2 = read.nextInt();
        System.out.println("Ingrese el punto Y2");
        int y2 = read.nextInt();
        return new Puntos(x1, y1, x2, y2);
    }

    public static double calcularDistancia(Puntos p) {

        return Math.sqrt((Math.pow((p.getX2() - p.getX1()), 2) + Math.pow((p.getY2() - p.getY1()), 2)));

    }

}
