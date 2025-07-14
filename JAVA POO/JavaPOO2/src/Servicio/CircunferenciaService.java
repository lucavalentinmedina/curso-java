package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

public class CircunferenciaService {

    public static Circunferencia crearCircunferencia(Scanner read) {
        System.out.println("Ingrese el radio de la circunferencia");
        float radio = read.nextFloat();

        return new Circunferencia(radio);
    }

    public static float area(Circunferencia c1) {
        float area = (float) (Math.PI * Math.pow(c1.getRadio(), 2));

        return area;
    }

    public static float perimetro(Circunferencia c1) {
        float perimetro = (float) (2 * Math.PI * c1.getRadio());
        return perimetro;
    }

}
