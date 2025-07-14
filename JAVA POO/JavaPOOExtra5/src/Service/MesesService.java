package Service;

import Entidad.Meses;
import java.util.Scanner;

public class MesesService {

    public static void adivinarMes(Meses m, Scanner read) {
        System.out.println("Ingrese un mes");
        String mes = read.nextLine();
        while (mes.trim().isEmpty()) {
            System.out.println("Incorrecto, no puede estar vacío");
            mes = read.nextLine();
        }
        while (!mes.equalsIgnoreCase(m.getMesSecreto())) {
            System.out.println("Incorrecto! Intentelo de nuevo");
            mes = read.nextLine();
        }
        System.out.println("Correcto! Has acertado");
    }

}
