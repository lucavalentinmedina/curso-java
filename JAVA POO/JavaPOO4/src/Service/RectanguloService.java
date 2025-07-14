package Service;

import java.util.Scanner;
import Entidad.Rectangulo;

public class RectanguloService {

    public static Rectangulo crearRectangulo(Scanner read) {
        System.out.println("Ingrese la base");
        float base = read.nextFloat();
        System.out.println("Ingrese la altura");
        float height = read.nextFloat();

        return new Rectangulo(base, height);
    }

    public static float calcularSuperficie(Rectangulo r1) {
        return r1.getBase() * r1.getHeight();
    }

    public static float calcularPerimetro(Rectangulo r1) {
        return (r1.getBase() + r1.getHeight()) * 2;
    }

    public static void dibujarRectangulo(Rectangulo r1) {
        int alto = (int) r1.getHeight();
        int base = (int) r1.getBase();
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == alto - 1 || j == 0 || j == base - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }
    }

}
